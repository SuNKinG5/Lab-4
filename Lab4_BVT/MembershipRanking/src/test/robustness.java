//lab 1.2
//นายตะวัน อุตมาน 663380210-2

package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.Ranking;

class robustness {
	
	Ranking rank = new Ranking();
	
	@ParameterizedTest
	@CsvSource({
		"-1,     15,  500,  Wrong Input",
		"0,      15,  500,  Standard",
		"1,      15,  500,  Standard",
		"99999,  15,  500,  Standard",
		"100000, 15,  500,  Standard",
		"100001, 15,  500,  Standard",
		"50000,  -1, 500,  Wrong Input",
		"50000,  0,  500,  Standard",
		"50000,  1,  500,  Standard",
		"50000,  15,  500,  Standard",
		"50000,  29,  500,  Standard",
		"50000,  30,  500,  Standard",
		"50000,  31,  500,  Standard",
		"50000,  15,  -1,   Wrong Input",
		"50000,  15,  0,    Standard",
		"50000,  15,  1,    Standard",
		"50000,  15,  999,  Standard",
		"50000,  15,  1000, Standard",
		"50000,  15,  1001, Standard",
	})
	void T1(int total, int freq, int point, String expect) {
		assertEquals(expect, rank.CalculateMembershipRank(total, freq, point));
	}

}
