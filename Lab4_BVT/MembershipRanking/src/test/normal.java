//lab 1.1
//นายตะวัน อุตมาน 663380210-2

package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.Ranking;

class normal {

	Ranking rank = new Ranking();
	
	@ParameterizedTest
	@CsvSource({
		"0,      15, 500,  Standard",
		"1,      15, 500,  Standard",
		"99999,  15, 500,  Standard",
		"100000, 15, 500,  Standard",
		"50000,  0,  500,  Standard",
		"50000,  1,  500,  Standard",
		"50000,  15, 500,  Standard",
		"50000,  29,  500,  Standard",
		"50000,  30,  500,  Standard",
		"50000,  15, 0,    Standard",
		"50000,  15, 1,    Standard",
		"50000,  15, 999,  Standard",
		"50000,  15, 1000, Standard",
	})
	void T1(int total, int freq, int point, String expect) {
		assertEquals(expect, rank.CalculateMembershipRank(total, freq, point));
	}

}
