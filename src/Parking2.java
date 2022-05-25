import java.text.DecimalFormat;

public class Parking2 {
	public static void main( String args[] ) {

		int NumberOfHours = getNumberOfHours();
		double TotalCost = getBillAmount(NumberOfHours);
		printReceiptHeader();
		printBill(NumberOfHours, TotalCost);

	}

		public static void printReceiptHeader() {
			System.out.println("     Mount Prospect");
			System.out.println("\t Parking Garage");
			System.out.println();
			System.out.println("Address: 113 S Main St");
			System.out.println("Mount Prospect, IL 60056");
			System.out.println();}

		public static int getNumberOfHours() {
			int noh = IO.getInt("Please enter number of hours");
			return noh;}

		public static double getBillAmount(int noh) {
			double tc = 2 + 0.50*noh;
			return tc;}

		public static void printBill(int noh, double tc) {
			DecimalFormat twoDigits = new DecimalFormat("$0.00");
			System.out.println("Number of hours: " + noh);
			System.out.println("Total Cost: " + (twoDigits.format(tc)));
			System.out.println();
			System.out.println("Thank You for Your Service!");}
	}
