/* 

 * Class: CMSC203  

 * Instructor: Prof. David Kuijt

 * Description: Holiday Bonus Class

 * Due: 11/12/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment independently. 

*  I have not copied the code from a student or any source.  

*  I have not given my code to any student. 

*  Print your Name here: Daniel Badman

*/ 

public class HolidayBonus {
	private static final double HIGH_SELL_BONUS = 5000.0, LOW_SELL_BONUS = 1000.0, NORMAL_SELL_BONUS = 2000.0;
	
	public static double[] calculateHolidayBonus(double[][] data) {
		double[] holidayBonuses = new double[data.length];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row].length >= col && data[row][col] > 0) {
					if (row == TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col)) {
						holidayBonuses[row] += HIGH_SELL_BONUS;
					} else if (row == TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col)){
						holidayBonuses[row] += LOW_SELL_BONUS;
					} else {
						holidayBonuses[row] += NORMAL_SELL_BONUS;
					}
				}
			}
		}
		return holidayBonuses;
	}
	
	public static double calculateTotalHolidayBonus(double [][] data) {
		double [] bonuses = calculateHolidayBonus(data);
		double total = 0;
		for (int i = 0; i < bonuses.length; i++) {
			total += bonuses[i];
		}
		return total;
	}
}
