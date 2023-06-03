import javax.swing.JOptionPane;

public class CalculateWith2Numbers {

	public static void main(String[] args) {
		
		String strNum1 = JOptionPane.showInputDialog("enter the first number:");
		 double Num1  = Double.parseDouble(strNum1);
          
          String strNum2 = JOptionPane.showInputDialog("enter the second number:");
          double Num2 = Double.parseDouble(strNum2);
          
          double sum = Num1 + Num2;
          double difference = Num1 - Num2;
          double product = Num1 *Num2;
          double quotient = Num1/ Num2;
          
          
          JOptionPane.showMessageDialog(null, " Sum of " + Num1 + " and " + Num2+ " is :" + sum);
          JOptionPane.showMessageDialog(null, " Diferncef of " + Num1 + " and " + Num2+ " is :" + difference);
          JOptionPane.showMessageDialog(null, " Product of " + Num1 + " and " + Num2+ " is :" + product);
          JOptionPane.showMessageDialog(null, " Quotient of " + Num1 + " and " + Num2+ " is :" + quotient);
          
	}

}
