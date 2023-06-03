import javax.swing.JOptionPane;

public class second_degree_equation {

	public static void main(String[] args) {
		String firstCoeficient;
		 double x1, x2;
		 
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
         

         String thirdCoeficient = JOptionPane.showInputDialog("enter the third number:");
         double c = Double.parseDouble(thirdCoeficient);
         
        
         
      double delta = b*b - 4*a*c;
         if (delta < 0) {
        	 
        	 JOptionPane.showMessageDialog(null, "the equation has no solution");
         } else if (delta == 0) {
        	 double x = -b/(2*a);
        	 JOptionPane.showMessageDialog(null, "the equation has double solution x1=x2=" +x);
        	 
         } else {
        	  x1 = (-b + Math.sqrt(delta)) / (2 * a);
        	  x2 = (-b - Math.sqrt(delta)) / (2 * a);
        	 JOptionPane.showMessageDialog(null, "the equation has 2 discriminant solutions x1= " + x1 + ", x2 =" + x2);
        	 
         }

	}

}
