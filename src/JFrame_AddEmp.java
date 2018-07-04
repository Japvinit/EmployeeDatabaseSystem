import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 This is class is for adding employee information
 */
public class JFrame_AddEmp extends javax.swing.JFrame {

    MyHashTable ourHT = MainFrame.returnTheHT(); // ourHT points at theHT (instantiate in the MainFrame).

    public JFrame_AddEmp() {
        initComponents();
        fullEmpPanel.setVisible(false);
        partEmp_Panel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        firstN_EnterText = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        lastN_EnterText = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        empNum_EnterText = new javax.swing.JTextPane();
        workLoc_Entered = new javax.swing.JComboBox();
        gender_Entered = new javax.swing.JComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        deducRate_EnterText = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        partEmp_buttonEnter = new javax.swing.JRadioButton();
        fullEmp_buttonEnter = new javax.swing.JRadioButton();
        option_Text = new javax.swing.JLabel();
        add_Button = new javax.swing.JToggleButton();
        fullEmpPanel = new javax.swing.JPanel();
        annualSalary_Enter = new javax.swing.JToggleButton();
        annualSalary_Entered = new javax.swing.JTextField();
        enter_Button = new javax.swing.JButton();
        partEmp_Panel = new javax.swing.JPanel();
        hourlyWage_Text = new javax.swing.JToggleButton();
        hourlyWage_Enter = new javax.swing.JTextField();
        weeksPerYear_Text = new javax.swing.JToggleButton();
        weeksPerYear_Enter = new javax.swing.JTextField();
        hoursPerWeek_Text = new javax.swing.JToggleButton();
        hoursPerWeek_Enter = new javax.swing.JTextField();
        enter2_Button = new javax.swing.JButton();
        empNum_Text = new javax.swing.JLabel();
        firstN_Label = new javax.swing.JLabel();
        lastName_Label = new javax.swing.JLabel();
        deducRate_Label = new javax.swing.JLabel();
        returnToMain_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(firstN_EnterText);

        jScrollPane3.setViewportView(lastN_EnterText);

        jScrollPane4.setViewportView(empNum_EnterText);

        workLoc_Entered.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Location", " ", "Mississauga", "Ottawa", "Chicago", " " }));

        gender_Entered.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gender", " ", "male", "female", "other", " " }));

        jScrollPane5.setViewportView(deducRate_EnterText);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        partEmp_buttonEnter.setText("Part-time Employee");
        partEmp_buttonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partEmp_buttonEnterActionPerformed(evt);
            }
        });

        fullEmp_buttonEnter.setText("Full-time Employee");
        fullEmp_buttonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullEmp_buttonEnterActionPerformed(evt);
            }
        });

        option_Text.setText("Choose One");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partEmp_buttonEnter)
                    .addComponent(fullEmp_buttonEnter)
                    .addComponent(option_Text))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option_Text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(partEmp_buttonEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fullEmp_buttonEnter)
                .addGap(34, 34, 34))
        );

        add_Button.setText(" Add");
        add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTheEmployee(evt);
            }
        });

        fullEmpPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        annualSalary_Enter.setText("Annual Salary");

        enter_Button.setText("Enter");
        enter_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_Buttonreturn_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fullEmpPanelLayout = new javax.swing.GroupLayout(fullEmpPanel);
        fullEmpPanel.setLayout(fullEmpPanelLayout);
        fullEmpPanelLayout.setHorizontalGroup(
            fullEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullEmpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fullEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fullEmpPanelLayout.createSequentialGroup()
                        .addComponent(annualSalary_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fullEmpPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(annualSalary_Entered, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fullEmpPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enter_Button)
                .addGap(23, 23, 23))
        );
        fullEmpPanelLayout.setVerticalGroup(
            fullEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullEmpPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(annualSalary_Enter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(annualSalary_Entered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enter_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        partEmp_Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hourlyWage_Text.setText("Hourly Wage");

        weeksPerYear_Text.setText("Weeks Per year");

        hoursPerWeek_Text.setText("Hours Per Week");

        enter2_Button.setText("Enter");
        enter2_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter2_Buttonreturn_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout partEmp_PanelLayout = new javax.swing.GroupLayout(partEmp_Panel);
        partEmp_Panel.setLayout(partEmp_PanelLayout);
        partEmp_PanelLayout.setHorizontalGroup(
            partEmp_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partEmp_PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(partEmp_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(partEmp_PanelLayout.createSequentialGroup()
                        .addComponent(weeksPerYear_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(enter2_Button))
                    .addGroup(partEmp_PanelLayout.createSequentialGroup()
                        .addGroup(partEmp_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hourlyWage_Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hourlyWage_Enter))
                        .addGap(41, 41, 41)
                        .addGroup(partEmp_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hoursPerWeek_Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hoursPerWeek_Enter)))
                    .addComponent(weeksPerYear_Text))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        partEmp_PanelLayout.setVerticalGroup(
            partEmp_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partEmp_PanelLayout.createSequentialGroup()
                .addGroup(partEmp_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(partEmp_PanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(hourlyWage_Text))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, partEmp_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hoursPerWeek_Text)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(partEmp_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoursPerWeek_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyWage_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weeksPerYear_Text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(partEmp_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksPerYear_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter2_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        empNum_Text.setText("Employee No.");

        firstN_Label.setText("First Name");

        lastName_Label.setText("Last Name");

        deducRate_Label.setText("Deductions Rate");

        returnToMain_Button.setText("Return to main menu");
        returnToMain_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMain_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(empNum_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane3)
                                    .addComponent(lastName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(add_Button))
                            .addComponent(firstN_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deducRate_Label)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(partEmp_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(workLoc_Entered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(fullEmpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gender_Entered, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnToMain_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(workLoc_Entered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(empNum_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(gender_Entered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deducRate_Label)
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(fullEmpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(partEmp_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(firstN_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lastName_Label)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(returnToMain_Button)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   ButtonGroup group = new ButtonGroup();
    private void enter_Buttonreturn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_Buttonreturn_ActionPerformed
        //full-time employee panel is set to be invisible when its okay button is pressed
        fullEmpPanel.setVisible(false);
    }//GEN-LAST:event_enter_Buttonreturn_ActionPerformed

    private void enter2_Buttonreturn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter2_Buttonreturn_ActionPerformed
        //part-time employee panel is set to be invisible when its okay button is pressed
        partEmp_Panel.setVisible(false);
    }//GEN-LAST:event_enter2_Buttonreturn_ActionPerformed

    private void addTheEmployee(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTheEmployee
        if ((gender_Entered.getSelectedItem() != "Gender" && !"".equals(empNum_EnterText.getText()) && !"".equals(deducRate_EnterText.getText()) && !"".equals(firstN_EnterText.getText())
                && lastN_EnterText.getText() != null && workLoc_Entered.getSelectedItem() != "Location") && fullEmp_buttonEnter.isSelected() != false
                || partEmp_buttonEnter.isSelected() != false) //error check to ensure user has input all the required information
        {
            //read in all the input from the user
            int empNum = Integer.parseInt(empNum_EnterText.getText());
            double deducRate = Double.parseDouble(deducRate_EnterText.getText());
            String firstName = firstN_EnterText.getText();
            String lastName = lastN_EnterText.getText();
            Object workPlace = workLoc_Entered.getSelectedItem();
            int workPlaceInt = 0;
            if (workPlace != null) {
                if (workPlace == "Mississauga") {
                    workPlaceInt = 0;
                } else if (workPlace == "Ottawa") {
                    workPlaceInt = 1;
                } else {
                    workPlaceInt = 2;
                }
            }
            Object gender = gender_Entered.getSelectedItem();
            int genderInt = 0;
            if (gender != null) {
                if (gender == "male") {
                    genderInt = 0;
                } else if (gender == "female") {
                    genderInt = 1;
                } else {
                    genderInt = 2;
                }
            }
            if (fullEmp_buttonEnter.isSelected()) {
                if ("".equals(annualSalary_Entered.getText())) {
                    //error check to ensure that the annual salary has been entered
                    JOptionPane.showMessageDialog(null, "Missing Information");
                } else {
                    double annualSalary = Double.parseDouble(annualSalary_Entered.getText());
                    //add full-time employee into the hash-table
                    FullTimeEmployee empToAdd;
                    empToAdd = new FullTimeEmployee(empNum, firstName, lastName, genderInt, workPlaceInt, annualSalary, deducRate);
                    ourHT = MainFrame.returnTheHT();
                    ourHT.addEmployee(empToAdd);
                    this.dispose();
                    NewJFrame mainMenu = new NewJFrame();
                    mainMenu.setVisible(true); //display main screen
                }
            } else //error check to ensure that hourly-wage, hours per week and weeks per year are added
            if ("".equals(hourlyWage_Enter.getText()) || "".equals(weeksPerYear_Enter.getText()) || "".equals(hoursPerWeek_Enter.getText())) {
                JOptionPane.showMessageDialog(null, "Missing Information");
            } else {
                double hourlyWage = Double.parseDouble(hourlyWage_Enter.getText());
                double weeksPerYear = Double.parseDouble(weeksPerYear_Enter.getText());
                double hoursPerWeek = Double.parseDouble(hoursPerWeek_Enter.getText());
                //add part-time employee into the hash-table
                PartTimeEmployee empToAdd;
                empToAdd = new PartTimeEmployee(empNum, firstName, lastName, genderInt, workPlaceInt, hourlyWage, weeksPerYear, hoursPerWeek, deducRate);
                ourHT = MainFrame.returnTheHT();
                ourHT.addEmployee(empToAdd);
                this.dispose();
                NewJFrame mainMenu = new NewJFrame();
                mainMenu.setVisible(true); //display main screen
            }
        } else {
            // if information is missing display message
            JOptionPane.showMessageDialog(null, "Missing Information");
        }

    }//GEN-LAST:event_addTheEmployee

    private void returnToMain_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMain_ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        NewJFrame mainMenu = new NewJFrame();
        mainMenu.setVisible(true);

    }//GEN-LAST:event_returnToMain_ButtonActionPerformed

    private void partEmp_buttonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partEmp_buttonEnterActionPerformed
        //display part-time employee panel
        partEmp_Panel.setVisible(true);
        group.add(partEmp_buttonEnter);
        group.add(fullEmp_buttonEnter);
        fullEmpPanel.setVisible(false);

    }//GEN-LAST:event_partEmp_buttonEnterActionPerformed

    private void fullEmp_buttonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullEmp_buttonEnterActionPerformed
        //displays full-time employee panel
        group.add(fullEmp_buttonEnter);
        group.add(partEmp_buttonEnter);
        fullEmpPanel.setVisible(true);
        partEmp_Panel.setVisible(false);
    }//GEN-LAST:event_fullEmp_buttonEnterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton add_Button;
    private javax.swing.JToggleButton annualSalary_Enter;
    private javax.swing.JTextField annualSalary_Entered;
    private javax.swing.JTextPane deducRate_EnterText;
    private javax.swing.JLabel deducRate_Label;
    private javax.swing.JTextPane empNum_EnterText;
    private javax.swing.JLabel empNum_Text;
    private javax.swing.JButton enter2_Button;
    private javax.swing.JButton enter_Button;
    private javax.swing.JTextPane firstN_EnterText;
    private javax.swing.JLabel firstN_Label;
    private javax.swing.JPanel fullEmpPanel;
    private javax.swing.JRadioButton fullEmp_buttonEnter;
    private javax.swing.JComboBox gender_Entered;
    private javax.swing.JTextField hourlyWage_Enter;
    private javax.swing.JToggleButton hourlyWage_Text;
    private javax.swing.JTextField hoursPerWeek_Enter;
    private javax.swing.JToggleButton hoursPerWeek_Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane lastN_EnterText;
    private javax.swing.JLabel lastName_Label;
    private javax.swing.JLabel option_Text;
    private javax.swing.JPanel partEmp_Panel;
    private javax.swing.JRadioButton partEmp_buttonEnter;
    private javax.swing.JButton returnToMain_Button;
    private javax.swing.JTextField weeksPerYear_Enter;
    private javax.swing.JToggleButton weeksPerYear_Text;
    private javax.swing.JComboBox workLoc_Entered;
    // End of variables declaration//GEN-END:variables
}
