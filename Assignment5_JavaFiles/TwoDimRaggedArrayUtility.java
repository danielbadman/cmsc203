/* 

 * Class: CMSC203  

 * Instructor: Prof. David Kuijt

 * Description: Two Dimensional Ragged Array Utility Class

 * Due: 11/12/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment independently. 

*  I have not copied the code from a student or any source.  

*  I have not given my code to any student. 

*  Print your Name here: Daniel Badman

*/ 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class TwoDimRaggedArrayUtility {
	private static final int MAX_ROW = 10, MAX_COLUMN = 10;
	
	public static double[][] readFile(File file) throws FileNotFoundException{
			Scanner scanIn = new Scanner(file);
		
			String [][] tempRagged = new String[MAX_ROW][MAX_COLUMN];
			String [] elements;
				for (int i = 0; i < MAX_ROW; i++) {
					if (scanIn.hasNextLine()) {
						elements = scanIn.nextLine().split(" ");
						for (int j = 0; j < elements.length; j++) {
							tempRagged[i][j] = elements[j];
						}
					}
					
				}
			
			int existingRows = 0, existingCols = 0;
			while (tempRagged[existingRows][0] != null) {
				existingRows++;
			}
			double [][] raggedArray = new double [existingRows][];
			for (int row = 0; row < existingRows; row++) {
				existingCols = 0;
				while (tempRagged[row][existingCols] != null) {
					existingCols++;
				}
				
				raggedArray[row] = new double [existingCols];
				for (int col = 0; col < existingCols; col++) {
					raggedArray[row][col] = Double.parseDouble(tempRagged[row][col]);
				}
			}
			scanIn.close();
			return raggedArray;
		} 
	
	public static void writeToFile(double [][] data, File outputFile) {
		try {
			PrintWriter pWriter = new PrintWriter(outputFile);
			for (int row = 0; row < data.length; row++) {
				for (int col = 0; col < data[row].length; col++) {
					pWriter.write(Double.toString(data[row][col]));
					pWriter.write(" ");
				}
			}
			pWriter.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static double getTotal(double[][] data) {
		double total = 0;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
			}
		}
		return total;
	}
	
	public static double getAverage(double[][] data) {
		double total = 0;
		int elements = 0;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
				elements++;
			}
		}
		return total / elements;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
			}
		return total;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
			for (int row = 0; row < data.length; row++) {
				if (data[row].length > col) { 
					total += data[row][col];
				}
			}
		return total;
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		double highest = data[row][0];
		for (int col = 0; col < data[row].length; col++) {
			 if (data[row][col] > highest) {
				 highest = data[row][col];
			 }
		}
		return highest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highest = data[row][0];
		int col = 0;
		for (col = 0; col < data[row].length; col++) {
			 if (data[row][col] > highest) {
				 highest = data[row][col];
			 }
		}
		col = 0;
		for (col = 0; col < data[row].length; col++) {
			if (data[row][col] == highest) {
				return col;
			}
		}
		return col;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];
		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] < lowest) {
				lowest = data[row][col];
			}
		}
		return lowest;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowest = data[row][0];
		int col = 0;
		for (col = 0; col < data[row].length; col++) {
			 if (data[row][col] < lowest) {
				 lowest = data[row][col];
			 }
		}
		col = 0;
		for (col = 0; col < data[row].length; col++) {
			if (data[row][col] == lowest) {
				return col;
			}
		}
		return col;
	}
	
	public static double getHighestInColumn(double [][] data, int col) {
		int startingRow = 0;
		while (startingRow < data.length) {
			if (data[startingRow].length - 1 >= col) {
				break;
			}
			startingRow++;
		}
		double highest = data[startingRow][col];
		for (int row = 0; row < data.length; row++) {
			if(data[row].length > col && highest < data[row][col]) {
				highest = data[row][col];
			}
		}
		return highest;
	}
	
	public static int getHighestInColumnIndex(double [][] data, int col) {
		boolean columnExists = false;
		int startingRow = 0;
		while (startingRow < data.length) {
			if (data[startingRow].length - 1 >= col) {
				columnExists = true;
				break;
			}
			startingRow++;
		}
		if (columnExists) {
			double highest = data[startingRow][col];
			for (int row = 0; row < data.length; row++) {
				if(data[row].length > col && highest < data[row][col]) {
					highest = data[row][col];
				}
			}
			
			for (int row = 0; row < data.length; row++) {
				if(data[row].length > col && highest == data[row][col]) {
					return row;
				}
			}
		}
		return 0;
	}
	
	public static double getLowestInColumn(double [][] data, int col) {
		int startingRow = 0;
		while (startingRow < data.length) {
			if (data[startingRow].length - 1 >= col) {
				break;
			}
			startingRow++;
		}
		double lowest = data[startingRow][col];
		for (int row = 0; row < data.length; row++) {
			if(data[row].length > col && lowest > data[row][col]) {
				lowest = data[row][col];
			}
		}
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double [][] data, int col) {
		boolean columnExists = false;
		int startingRow = 0;
		while (startingRow < data.length) {
			if (data[startingRow].length - 1 >= col) {
				columnExists = true;
				break;
			}
			startingRow++;
		}
		if (columnExists) {
			double lowest = data[startingRow][col];
			for (int row = 0; row < data.length; row++) {
				if(data[row].length > col && lowest > data[row][col]) {
					lowest = data[row][col];
				}
			}
			
			for (int row = 0; row < data.length; row++) {
				if(data[row].length > col && lowest == data[row][col]) {
					return row;
				}
			}
		}
		return 0;
	}
	
	public static double getHighestInArray(double [][] data) {
		double highest = data[0][0];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (highest < data[row][col]) {
					highest = data[row][col];
				}
			}
		}
		return highest;
	}
	
	public static double getLowestInArray(double [][] data) {
		double lowest = data[0][0];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (lowest > data[row][col]) {
					lowest = data[row][col];
				}
			}
		}
		return lowest;
	}
}
