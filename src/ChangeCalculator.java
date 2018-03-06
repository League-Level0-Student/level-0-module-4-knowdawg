//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickles = JOptionPane.showInputDialog("How many nickles?");
		// Convert their answer to an int using Integer.parseInt()
int nic = Integer.parseInt(nickles);
double money = nic * 0.05;
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes?");
int di = Integer.parseInt(dimes);
money += di * 0.10;
		// Ask the user how many quarters they have, and convert their answer
String quaters = JOptionPane.showInputDialog("How many quatars?");
int q = Integer.parseInt(quaters);
money += q * 0.25;
		// Calculate how much money the user has and save it in a double variable 
JOptionPane.showMessageDialog(null, "You have " + money + " dollors!");
		// Tell the user how much money they have

	}
}

