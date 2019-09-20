package employee;
import javax.swing.*;

import BreezySwing.*;

 

public class EmployeeDialog extends GBDialog{

    JLabel nameLbl = addLabel 						("Name", 1,1,1,1);
    JTextField nameFld = addTextField				("", 1,2,5,1);
    JLabel daysLbl = addLabel 						("Quartly Sales",3,1,1,1);
    IntegerField q1Fld = addIntegerField 			(0, 3,2,1,1);
    IntegerField q2Fld = addIntegerField 			(0, 3,3,1,1);
    IntegerField q3Fld = addIntegerField 			(0, 3,4,1,1);
    IntegerField q4Fld = addIntegerField 			(0, 3,5,1,1);
    JButton okBtn = addButton 						("OK", 4,2,2,1);
    JButton cancelBtn = addButton 					("Cancel", 4,4,2,1);

    public Employee newEmp = null;
    
    public EmployeeDialog(JFrame parent){
        	
        super (parent);             
        setTitle ("Edit Employee");
        setDlgCloseIndicator ("Cancel");                
        setSize (300, 200); 
    }
    
    public void buttonClicked(JButton buttonObj){
        if (buttonObj == okBtn){
        	int q1, q2, q3, q4;
        	String nm;
        	
           nm = nameFld.getText();
           q1 = q1Fld.getNumber();
           q2 = q2Fld.getNumber();
           q3 = q3Fld.getNumber();
           q4 = q4Fld.getNumber();
 
           newEmp = new Employee(nm, q1, q2, q3, q4);
           
           setDlgCloseIndicator ("OK");
        }
        dispose();
    }
}

