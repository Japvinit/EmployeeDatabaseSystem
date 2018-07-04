/*
 This class has code for when an employee is searched and its information is dislayed
 */
public class searchFrame extends javax.swing.JFrame {

    public searchFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fName_Label = new javax.swing.JLabel();
        lName_Label = new javax.swing.JLabel();
        jobType_Label = new javax.swing.JLabel();
        location_Label = new javax.swing.JLabel();
        gender_Label = new javax.swing.JLabel();
        salary_Label = new javax.swing.JLabel();
        fName_Text = new javax.swing.JTextField();
        lName_Text = new javax.swing.JTextField();
        jobType_Text = new javax.swing.JTextField();
        location_Text = new javax.swing.JTextField();
        gender_Text = new javax.swing.JTextField();
        salary_Text = new javax.swing.JTextField();
        mainMenu_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fName_Label.setText("First Name");

        lName_Label.setText("Last Name");

        jobType_Label.setText("Job Type");

        location_Label.setText("Location");

        gender_Label.setText("Gender");

        salary_Label.setText("Salary");

        mainMenu_Button.setText("Return to Main Menu");
        mainMenu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fName_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lName_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(186, 186, 186))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jobType_Label)
                            .addGap(147, 147, 147)
                            .addComponent(salary_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jobType_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(lName_Text, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fName_Text, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(location_Label)
                                    .addComponent(location_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(salary_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(mainMenu_Button))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location_Label)
                    .addComponent(fName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobType_Label)
                    .addComponent(salary_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobType_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salary_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenu_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton_ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_returnButton_ActionPerformed

    private final int howManyBuckets = 2;
    MyHashTable ourHT = MainFrame.returnTheHT(); //ourHT points at theH

    public void searchOne(int id) {
        int empID = id;
        int ans = ourHT.calcBucket(empID); //returns the bucket number the employee is in
        for (int i = 0; i < ourHT.getBuckets()[ans].size(); i++) {
            //searching in that specific bucket
            if (empID == ourHT.getBuckets()[ans].get(i).getEmpNumber()) //when the employee is found retireve its data
            {
                fName_Text.setText(ourHT.getBuckets()[ans].get(i).getFirstName());
                lName_Text.setText(ourHT.getBuckets()[ans].get(i).getLastName());
                int jobLoc = ourHT.getBuckets()[ans].get(i).getJobType();
                String locationName;
                if (jobLoc == 0) {
                    locationName = "Mississauga";
                } else if (jobLoc == 1) {
                    locationName = "Ottawa";
                } else {
                    locationName = "Chicago";
                }
                location_Text.setText(locationName);
                int gender = ourHT.getBuckets()[ans].get(i).getEmpSex();
                String genderStr;
                if (gender == 0) {
                    genderStr = "male";
                } else if (gender == 1) {
                    genderStr = "female";
                } else {
                    genderStr = "other";
                }
                gender_Text.setText(genderStr);
                int jobType = ourHT.getBuckets()[ans].get(i).getJobType();
                String empJobType;
                double income;
                if (jobType == 0) {
                    //if full-time employee get its salary
                    EmployeeInfo newPart = ourHT.getBuckets()[ans].get(i);
                    FullTimeEmployee theFTE = (FullTimeEmployee) newPart;
                    empJobType = "Full-time";
                    income = theFTE.calcIncome();
                } else {
                    //if part-time employee get its salary
                    EmployeeInfo newPart = ourHT.getBuckets()[ans].get(i);
                    PartTimeEmployee thePTE = (PartTimeEmployee) newPart;
                    empJobType = "Part-time";
                    income = thePTE.calcIncome();
                }
                jobType_Text.setText(empJobType);
                salary_Text.setText(Double.toString(income));

            }

        }

    }

    public void search() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new searchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fName_Label;
    private javax.swing.JTextField fName_Text;
    private javax.swing.JLabel gender_Label;
    private javax.swing.JTextField gender_Text;
    private javax.swing.JLabel jobType_Label;
    private javax.swing.JTextField jobType_Text;
    private javax.swing.JLabel lName_Label;
    private javax.swing.JTextField lName_Text;
    private javax.swing.JLabel location_Label;
    private javax.swing.JTextField location_Text;
    private javax.swing.JButton mainMenu_Button;
    private javax.swing.JLabel salary_Label;
    private javax.swing.JTextField salary_Text;
    // End of variables declaration//GEN-END:variables
}
