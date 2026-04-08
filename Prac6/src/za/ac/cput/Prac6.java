package za.ac.cput;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Prac6 extends JFrame implements ItemListener, ActionListener {

    // combo box
    private JComboBox<String> cboRole;

    // labels
    private JLabel lblRole;
    private JLabel lblName;
    private JLabel lblSalary;

    // textfields
    private JTextField txtName;
    private JTextField txtSalary;

    // buttons
    private JButton btnAdd;
    private JButton btnShow;

    // table
    DefaultTableModel tableModel;
    JTable table;

    // panels
    private JPanel pnlForm;
    private JPanel pnlButtons;

    // constructor
    public Prac6() {
        super("Polymorphism in Swing");

        setLayout(new GridLayout(3, 1));

        // panels
        pnlForm = new JPanel();
        pnlButtons = new JPanel();

        pnlForm.setLayout(new GridLayout(3, 2));
        pnlButtons.setLayout(new FlowLayout());

        // labels
        lblRole = new JLabel("Select Role");
        lblName = new JLabel("Enter Name");
        lblSalary = new JLabel("Enter Salary");

        // combo box
        cboRole = new JComboBox();

        // text fields
        txtName = new JTextField(10);
        txtSalary = new JTextField(10);

        // buttons
        btnAdd = new JButton("Add");
        btnShow = new JButton("Show All");

        // table
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);

        pnlForm.add(lblRole);

        cboRole.addItem("none selected");
        cboRole.addItem("Manager");
        cboRole.addItem("Developer");
        cboRole.addItem("Intern");

        cboRole.addItemListener(this);

        pnlForm.add(cboRole);
        pnlForm.add(lblName);
        pnlForm.add(txtName);
        pnlForm.add(lblSalary);
        pnlForm.add(txtSalary);

        add(pnlForm);

        pnlButtons.add(btnAdd);
        pnlButtons.add(btnShow);

        add(pnlButtons);

        setGui();
        
        btnAdd.addActionListener(this);
        btnShow.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String query = cboRole.getSelectedItem().toString();
            if (!query.equals("none selected")) {
                JOptionPane.showMessageDialog(null, query);
            }
        }
    }

    public void setGui() {
        tableModel.addColumn("Role");
        tableModel.addColumn("Name");
        tableModel.addColumn("Salary");
        add(new JScrollPane(table));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        if (e.getSource() == btnAdd) {

            Object role = cboRole.getSelectedItem();
            // OR
            // String role = (String) cbo.getSelectedItem();
            String name = txtName.getText();
            String salary = txtSalary.getText();
            System.out.println(role + name+ salary);
            // toString() - because I am using an Object and in my constructor its a String
            // so it needs to be converted back.
            if (cboRole.getSelectedItem().equals("Manager")) {
                Manager man = new Manager(role.toString(), name, Double.parseDouble(salary));
                System.out.println("manager: "+ man);
                employees.add(man);
            }
            else if(cboRole.getSelectedItem().equals("Developer")){
                Developer dev = new Developer(role.toString(), name, Double.parseDouble(salary));
                employees.add(dev);
            }
            else if(cboRole.getSelectedItem().equals("Intern")){
                Intern intern = new Intern(role.toString(), name, Double.parseDouble(salary));
                employees.add(intern);
            }
        }

        if (e.getSource() == btnShow) {
//            for(Employee emp:employees){
            for(int i=0; i<3; i++){
                tableModel.addRow(new Object[] {"manager", "Jon", 1234});
                //System.out.println("emp toString: "+ emp);
//                tableModel.addRow(new Object[] {employees.get(i).getRole(),employees.get(i).getName(),employees.get(i).getSalary()});
            }
        }
    }

}// end of class
