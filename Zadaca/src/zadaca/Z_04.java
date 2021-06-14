package zadaca;

import javax.swing.JOptionPane;

public class Z_04 {
	public static void main(String[] args) {
		
		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Input a number between 1-4 \n1 - addition \n2 - subtraction\n3 - multiplication\n4 - division"));
		
		
		if (a < 1 || a > 4) {
			System.out.println("Error");
		}
		
		float b,c;
		b = Float.parseFloat(JOptionPane.showInputDialog("Input the first number"));
		c = Float.parseFloat(JOptionPane.showInputDialog("Input the second number"));
		
		float operationAddition = b + c;
		float operationSubtraction = b - c;
		float operationMultiplication = b * c;
		float operationDivision = b / c;
		
		int Addition = (int) operationAddition;
		int Subtraction = (int) operationSubtraction;
		int Multiplication = (int) operationMultiplication;
		int Division = (int) operationDivision;
		
		if (a == 1) {
			System.out.println("Addition");
			if (Addition == operationAddition) {
				System.out.println(Addition);
			}else {
				System.out.println(operationAddition);
			}
		} else if (a == 2) {
			System.out.println("Subtraction");
			if (Subtraction == operationSubtraction) {
				System.out.println(Subtraction);
			}else {
				System.out.println(operationSubtraction);
			}
		} else if (a == 3) {
			System.out.println("Multiplication");
			if (Multiplication == operationMultiplication) {
				System.out.println(Multiplication);
			}else {
				System.out.println(operationMultiplication);
			}
		} else if (a == 4) {
			System.out.println("Divison");
			if (Division == operationDivision) {
				System.out.println(Division);
			}else {
				System.out.println(Division);
			}
		}

	}

}
