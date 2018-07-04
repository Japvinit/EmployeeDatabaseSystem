
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * This class contains the code for the display output
 */
public class displayTable extends javax.swing.JFrame {

    //declaring the variables 
    private javax.swing.JScrollPane jScrollPane1;
    private JTable jTable1;
    private JButton removeButton;
    private JButton returnButton;
    private JButton modifyButton;
    private final int howManyBuckets = 2;
    MyHashTable ourHT = MainFrame.returnTheHT(); //ourHT points at theHT
    EmployeeInfo newPart;
    PartTimeEmployee thePTE;
    FullTimeEmployee theFTE;

    MyHashTable theHT = MainFrame.returnTheHT();
    private Object[][] rowData;

    public displayTable() {
        initComponents();
    }

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Name",
                "Gender",
                "Location",
                "Type",
                "Employee ID",
                "Annual Salary",
                "Dec. Rate",
                "Hourly Wage",
                "Hours Per Week",
                "Weeks Per Year",
                "Salary"
            }
    ); //creates a data model with the above headings

    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jTable1 = new JTable();

        for (int i = 0; i < howManyBuckets; i++) {
            for (int j = 0; j < theHT.getBuckets()[i].size(); j++) {
                //retrieving all the data in order to display it
                newPart = theHT.getBuckets()[i].get(j);
                int gender = newPart.getEmpSex();
                String genderStr = "male";
                switch (gender) {
                    case 0:
                        genderStr = "male";
                        break;
                    case 1:
                        genderStr = "female";
                        break;
                    default:
                        genderStr = "other";
                        break;
                }
                int empLoc = (newPart.getWorkLoc());
                String locationName = "";
                if (empLoc == 0) {
                    locationName = "Mississauga";
                } else if (empLoc == 1) {

                    locationName = "Ottawa";
                } else {
                    locationName = "Chicago";
                }

                if (newPart instanceof PartTimeEmployee) {
                    // We've just read a PTE as to display its information
                    thePTE = (PartTimeEmployee) newPart;
                    double employeeIncome = thePTE.calcIncome();
                    dtm.addRow(new Object[]{
                        thePTE.getFirstName() + "," + thePTE.getLastName(),
                        genderStr, locationName,
                        "part-time",
                        thePTE.getEmpNumber(),
                        "--", thePTE.getDeductionsRate(),
                        thePTE.getHourlyWage(), thePTE.getHoursPerWeek(), thePTE.getWeeksPerYear(), employeeIncome
                    });
                }
                if (newPart instanceof FullTimeEmployee) {
                    // We've just read a FTE as to display its information
                    theFTE = (FullTimeEmployee) newPart;
                    double employeeIncome = theFTE.calcIncome();
                    dtm.addRow(new Object[]{
                        theFTE.getFirstName() + "," + theFTE.getLastName(),
                        genderStr, locationName,
                        "full-time",
                        theFTE.getEmpNumber(),
                        theFTE.getAnnualSalary(), theFTE.getDeductionsRate(),
                        "--", "--", "--", employeeIncome
                    });
                }

            }
        }
        jTable1.setModel(dtm); //displays the data model

        jScrollPane1.setViewportView(jTable1);
        removeButton = new JButton();
        removeButton.setText("Remove");

        //creates an event handler for 'Remove' button
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        }
        );

        returnButton = new JButton();
        returnButton.setText("Return to Main Menu");
        //creates an event handler for 'Return to Main Menu' button
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);

            }
        }
        );

        modifyButton = new JButton();
        modifyButton.setText("Modify");

        //creates an event handler for 'Modify' button
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);

            }
        }
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton)
                        .addComponent(removeButton)
                        .addComponent(modifyButton)
                )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnButton)
                        .addComponent(removeButton)
                        .addComponent(modifyButton))
        );

        pack();

    }

    //when the 'Return to Main Menu' button is pressed
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JTable displayyy = new JTable();
        this.dispose();
        NewJFrame mainMenu = new NewJFrame();
        mainMenu.setVisible(true);
    }

    //when the 'Remove' button is pressed
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int rowToRemove = jTable1.getSelectedRow();
        Object row = jTable1.getValueAt(rowToRemove, 4);
        if (rowToRemove != -1) {
            theHT.removeEmployee((int) row);
            ((DefaultTableModel) jTable1.getModel()).removeRow(rowToRemove);
        }

    }

    //when the 'Modify' button is pressed
    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int rowToModify = jTable1.getSelectedRow(); //reads in the selected row's number
        String name = jTable1.getValueAt(rowToModify, 0).toString();
        int indexNum = name.indexOf(",");
        int totalLength = name.length();
        String fName = name.substring(0, indexNum);
        String lName = name.substring(indexNum + 1, totalLength);
        String gender = jTable1.getValueAt(rowToModify, 1).toString(); //gets the data in column 1
        int genderInt = 0;
        if ("male".equals(gender)) {

            genderInt = 0;
        } else if ("female".equals(gender)) {

            genderInt = 1;
        } else {
            genderInt = 2;

        }
        String location = jTable1.getValueAt(rowToModify, 2).toString(); //gets data in coloumn 2, and so on
        int empLoc = 0;
        if (null != location) {
            switch (location) {
                case "Mississauga":
                    empLoc = 0;
                    break;
                case "Ottawa":
                    empLoc = 1;
                    break;
                case "Chicago":
                    empLoc = 2;
                    break;
            }
        }
        int empID = Integer.parseInt(jTable1.getValueAt(rowToModify, 4).toString());
        double salary = Double.parseDouble(jTable1.getValueAt(rowToModify, 10).toString());
        double deducRate = Double.parseDouble(jTable1.getValueAt(rowToModify, 6).toString());
        String type = jTable1.getValueAt(rowToModify, 3).toString();
        int empTypeInt;
        Object row = jTable1.getValueAt(rowToModify, 4);
        if ("full-time".equals(type)) {
            double annualSalary = Double.parseDouble(jTable1.getValueAt(rowToModify, 5).toString());
            removeButtonActionPerformed(evt); //removes the unmodified data
            empTypeInt = 0;
            FullTimeEmployee empToAdd;
            empToAdd = new FullTimeEmployee(empID, fName, lName, genderInt, empLoc, annualSalary, deducRate);
            ourHT = MainFrame.returnTheHT();
            ourHT.addEmployee(empToAdd);
            displayTable show = new displayTable();
            this.dispose();
            show.setVisible(true); //displays the modified data
        } else {
            empTypeInt = 1;
            double hourlyWage = 0;
            double hoursPerWeek = 0;
            double weeksPerYear = 0;

            try {
                hourlyWage = Double.parseDouble(jTable1.getValueAt(rowToModify, 7).toString());
            } catch (NumberFormatException nfe) {

            }
            try {
                hoursPerWeek = Double.parseDouble(jTable1.getValueAt(rowToModify, 8).toString());
            } catch (NumberFormatException nfe) {

            }
            try {
                weeksPerYear = Double.parseDouble(jTable1.getValueAt(rowToModify, 9).toString());
            } catch (NumberFormatException nfe) {

            }
            removeButtonActionPerformed(evt);
            PartTimeEmployee empToAdd;
            empToAdd = new PartTimeEmployee(empID, fName, lName, genderInt, empLoc, hourlyWage, hoursPerWeek, weeksPerYear, deducRate);
            ourHT = MainFrame.returnTheHT();
            ourHT.addEmployee(empToAdd);
            displayTable show = new displayTable();
            this.dispose();
            show.setVisible(true);
        }
    }

    public void display() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }
}
