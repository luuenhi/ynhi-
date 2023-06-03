import javax.swing.JOptionPane;

public class Linear_equation {

	public static void main(String[] args) {
	   String firstCoeficient;
		double a;
		do {
		 firstCoeficient = JOptionPane.showInputDialog("enter the first number:");
		 a  = Double.parseDouble(firstCoeficient);
         if(a==0) {
        	 String message = " a must be different 0. try again!";
			JOptionPane.showMessageDialog(null, message);
         }
		} while(a==0);
		
         String secondCoeficient = JOptionPane.showInputDialog("enter the second number:");
         double b = Double.parseDouble(secondCoeficient);
         
         double root = -b/a;
         
         
         
         JOptionPane.showMessageDialog(null, " Root of linear equation with coeficient " + a + " and " + b + " is :" + root);
         
         
	}

}
