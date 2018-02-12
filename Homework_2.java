import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Homework_2 {

	static JFrame frame = new JFrame("GUI_DESIGN");
	static JPanel panel = new JPanel(new GridLayout(0, 1));
	public static void main(String[] args) {
		// Create and set up a frame window
		//JFrame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// Define the panel to hold the checkbox	
		
		JLabel message=new JLabel("Please Select Your Role :- ");
		// Create checkbox with different constructors
		JCheckBox employee = new JCheckBox("Employee");
		JCheckBox manager = new JCheckBox("Manager");		

		JButton enter	= new JButton("Enter");
		
		// Set up the title for the panel
		panel.setBorder(BorderFactory.createTitledBorder("HomeWork_#2"));
		
		// Add the checkbox into the panels 
		panel.add(message);
		panel.add(employee);
		panel.add(manager);
		panel.add(enter);
		
		frame.setSize(400, 250);
		
		// Add the panel into the frame
		frame.add(panel);
		
		// Set the window to be visible as the default to be false
	
		frame.setVisible(true);
		
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(employee.isSelected() && !(manager.isSelected()))
				{
					JLabel name=new JLabel("Name :");
					JTextField nameText=new JTextField();
					JLabel title=new JLabel("Title :");
					JTextField titleText=new JTextField();
					JLabel age=new JLabel("Age :");
					JTextField ageText=new JTextField();
					JLabel address=new JLabel("Address :");
					JTextField addressText=new JTextField();
					JLabel salary=new JLabel("Salary :");
					JTextField salaryText=new JTextField();
					JLabel salIn=new JLabel("Salary Increment %:");
					JTextField salInText=new JTextField();
					JLabel br=new JLabel(" ");
					
					JButton submit=new JButton("SUBMIT");
					frame.remove(panel);
					panel = new JPanel(new GridLayout(0, 1));
					panel.add(name);
					panel.add(nameText);
					panel.add(title);
					panel.add(titleText);
					panel.add(age);
					panel.add(ageText);
					panel.add(address);
					panel.add(addressText);
					panel.add(salary);
					panel.add(salaryText);
					panel.add(salIn);
					panel.add(salInText);
					panel.add(br);
					panel.add(submit);
					frame.setSize(400, 450);
					panel.setBorder(BorderFactory.createTitledBorder("HomeWork_#2"));
					
					// Add the panel into the frame
					frame.add(panel);
					
					// Set the window to be visible as the default to be false
				
					frame.setVisible(true);
					
					submit.addActionListener(new ActionListener() {
						
						int set=1;
						@Override
						public void actionPerformed(ActionEvent e) {
							
							if(nameText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Fill Your Name.");
								set=0;
							}
							if(nameText.getText().matches(".*\\d+.*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Name.");
								set=0;
							}
							if(titleText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Fill Title of Job.");
								set=0;
							}
							if(titleText.getText().matches(".*[0-9].*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Title.");
								set=0;
							}
							if(ageText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Fill Your Age.");
								set=0;
							}
							if(ageText.getText().matches(".*[a-zA-Z].*") || ageText.getText().matches("[^a-z A-Z0-9]"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Age.");
								set=0;
							}
							
							if(addressText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Fill Address.");
								set=0;
							}
							if(addressText.getText().length()<4)
							{
								JOptionPane.showMessageDialog(null, "Invalid Address.");
								set=0;
							}
							if(salaryText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Mention  Salary.");
								set=0;
							}
							if(salaryText.getText().matches(".*[a-zA-Z].*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Salary.");
								set=0;
							}
							if(salInText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Mention  Salary Increment %.");
								set=0;
							}
							if(salInText.getText().matches(".*[a-zA-Z].*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Salary Increment %.");
								set=0;
							}
							if(!(ageText.getText().matches(".*[a-zA-Z].*") || ageText.getText().matches("[^a-z A-Z0-9]")) && Integer.parseInt(ageText.getText())>100)
							{
								JOptionPane.showMessageDialog(null, "Age is Too High.");
								set=0;
							}
							if(set==1)
							{
								double sal=raiseSalary(Integer.parseInt(salInText.getText()));
								frame.removeAll();
								JFrame details=new JFrame("details");
								panel = new JPanel(new GridLayout(0, 2));
								panel.add(new JLabel("Name : "));
								panel.add(new JLabel(nameText.getText()));
								panel.add(new JLabel("Title :"));
								panel.add(new JLabel(titleText.getText()));
								panel.add(new JLabel("Age :"));
								panel.add(new JLabel(ageText.getText()));
								panel.add(new JLabel("Salary : "));
								panel.add(new JLabel(salaryText.getText()));
								panel.add(new JLabel("Raised Salary :"));
								panel.add(new JLabel(Double.toString(sal)));
								details.add(panel);
								
								// Set the window to be visible as the default to be false
								details.setSize(400, 400);
							
								details.setVisible(true);
								
							}
							
						}
						private double raiseSalary(int parseInt) {
							double mySalary=Integer.parseInt(salaryText.getText());
							
							mySalary = mySalary + 0.95 * parseInt * 0.01 * mySalary ;
							return mySalary;
						}
					});
				}
				else if(manager.isSelected() && !(employee.isSelected()))
				{
					JLabel name=new JLabel("Name :");
					JTextField nameText=new JTextField();
					JLabel title=new JLabel("Title :");
					JTextField titleText=new JTextField();
					JLabel age=new JLabel("Age :");
					JTextField ageText=new JTextField();
					JLabel experiance=new JLabel("Experiance :");
					JTextField ExperianceText=new JTextField();
					JLabel degree=new JLabel("Highest Degree :");
					JTextField degreeText=new JTextField();
					JLabel salary=new JLabel("Salary :");
					JTextField salaryText=new JTextField();
					JLabel promotion=new JLabel("Promotion Bonus :");
					JTextField promotionText=new JTextField();
					JLabel salIn=new JLabel("Salary Increment %:");
					JTextField salInText=new JTextField();
					JLabel br=new JLabel(" ");
					JButton submit=new JButton("SUBMIT");
					frame.remove(panel);
					panel = new JPanel(new GridLayout(0, 1));
					panel.add(name);
					panel.add(nameText);
					panel.add(title);
					panel.add(titleText);
					panel.add(age);
					panel.add(ageText);
					panel.add(experiance);
					panel.add(ExperianceText);
					panel.add(degree);
					panel.add(degreeText);
					panel.add(salary);
					panel.add(salaryText);
					panel.add(promotion);
					panel.add(promotionText);
					panel.add(salIn);
					panel.add(salInText);
					panel.add(br);
					panel.add(submit);
					frame.setSize(400, 550);
					panel.setBorder(BorderFactory.createTitledBorder("HomeWork_#2"));
					
					// Add the panel into the frame
					frame.add(panel);
					
					// Set the window to be visible as the default to be false
				
					frame.setVisible(true);
					submit.addActionListener(new ActionListener() {
						
						int set=1;
						@Override
						public void actionPerformed(ActionEvent e) {
							
							if(nameText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Fill Your Name.");
								set=0;
							}
							if(nameText.getText().matches(".*\\d+.*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Name.");
								set=0;
							}
							if(titleText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Fill Title of Job.");
								set=0;
							}
							if(titleText.getText().matches(".*[0-9].*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Title.");
								set=0;
							}
							if(ageText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Fill Your Age.");
								set=0;
							}
							if(ageText.getText().matches(".*[a-zA-Z].*") || ageText.getText().matches("[^a-z A-Z0-9]"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Age.");
								set=0;
							}
							if(ExperianceText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Mention  Experiance.");
								set=0;
							}
							if(ExperianceText.getText().matches(".*[a-zA-Z].*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Degree.");
								set=0;
							}
							
							if(degreeText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Mention  Degree.");
								set=0;
							}
							if(degreeText.getText().matches(".*[0-9].*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Degree.");
								set=0;
							}
							if(salaryText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Mention  Salary.");
								set=0;
							}
							if(salaryText.getText().matches(".*[a-zA-Z].*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Salary.");
								set=0;
							}
							if(promotionText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Mention  Promotion Bonus.");
								set=0;
							}
							if(salInText.getText().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Please Mention  Salary Increment %.");
								set=0;
							}
							if(salInText.getText().matches(".*[a-zA-Z].*"))
							{
								JOptionPane.showMessageDialog(null, "Invalid Salary Increment %.");
								set=0;
							}
							if(!(ageText.getText().matches(".*[a-zA-Z].*") || ageText.getText().matches("[^a-z A-Z0-9]")) && Integer.parseInt(ageText.getText())>100)
							{
								JOptionPane.showMessageDialog(null, "Age is Too High.");
								set=0;
							}
							if(set==1)
							{
								double sal=raiseSalary(Integer.parseInt(salInText.getText()));
								frame.remove(panel);
								JFrame details=new JFrame("details");
								panel = new JPanel(new GridLayout(0, 2));
								panel.add(new JLabel("Name : "));
								panel.add(new JLabel(nameText.getText()));
								panel.add(new JLabel("Title :"));
								panel.add(new JLabel(titleText.getText()));
								panel.add(new JLabel("Age :"));
								panel.add(new JLabel(ageText.getText()));
								panel.add(new JLabel("Experiance :"));
								panel.add(new JLabel(ExperianceText.getText()));
								panel.add(new JLabel("Highest Digree"));
								panel.add(new JLabel(degreeText.getText()));
								panel.add(new JLabel("Salary : "));
								panel.add(new JLabel(salaryText.getText()));
								panel.add(new JLabel("Raised Salary :"));
								panel.add(new JLabel(Double.toString(sal)));
								
								details.add(panel);
								details.setSize(400, 400);
							
								details.setVisible(true);
								
							}
						}
						private double raiseSalary(int parseInt) {
							
								double mySalary=Integer.parseInt(salaryText.getText());
								double promotionBonus=Integer.parseInt(promotionText.getText());
								mySalary = mySalary + 0.95 * parseInt * 0.01 * mySalary + promotionBonus;
								return mySalary;
							
						}
					});
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please Select Proper Option.");
					
				}
			}
		});

	}

}