package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.Ranking;

class normal {

	Ranking rank = new Ranking();
	
	@ParameterizedTest
	@CsvSource({
		"0,      3, 500,  Standard",
		"1,      3, 500,  Standard",
		"99999,  3, 500,  Gold",
		"100000, 3, 500,  Gold",
		"50000,  0, 500,  Standard",
		"50000,  1, 500,  Silver",
		"50000,  3, 500,  Gold",
		"50000,  6, 500,  Gold",
		"50000,  7, 500,  Gold",
		"50000,  3, 0,    Standard",
		"50000,  3, 1,    Standard",
		"50000,  3, 999,  Gold",
		"50000,  3, 1000, Gold",
	})
	void T1(int total, int freq, int point, String expect) {
		assertEquals(expect, rank.CalculateMembershipRank(total, freq, point));
	}

}
