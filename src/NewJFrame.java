
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 This is the class for the Main Screen and it contains the respective functions
 */
public class NewJFrame extends javax.swing.JFrame {

    private final int howManyBuckets = 2;
    MyHashTable ourHT = MainFrame.returnTheHT();  // ourHT points at ourHT

    public NewJFrame() {
        initComponents();
        searchPanel.setVisible(false);
        errorPanel.setVisible(false);
        loadFromFile_Panel.setVisible(false);
        emptyFilePanel.setVisible(false);
        savedInfo_Panel.setVisible(false);
        addWindowListener(new WindowAdapter() {

            @Override
            //confirmation message as to exit the program
            public void windowClosing(WindowEvent we) {
                String ObjButtons[] = {"Yes", "No"};
                int PromptResult = JOptionPane.showOptionDialog(null,
                        "Do you want exit the program", "Exit Message",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
                        ObjButtons, ObjButtons[1]);
                if (PromptResult == 0) {
                    System.exit(0);

                } else {
                    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadFromFile_Button = new javax.swing.JButton();
        searchEmp_Button = new javax.swing.JButton();
        displayInfo_Button = new javax.swing.JButton();
        addEmp_Button = new javax.swing.JButton();
        save_Button = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        enterEmpID_Label = new javax.swing.JLabel();
        search_Text = new javax.swing.JTextField();
        okay_Button = new javax.swing.JButton();
        errorPanel = new javax.swing.JPanel();
        error_Label = new javax.swing.JLabel();
        errorMessage_Label = new javax.swing.JLabel();
        searchAgain_Button = new javax.swing.JButton();
        returnToMainMenu_Button = new javax.swing.JButton();
        loadFromFile_Panel = new javax.swing.JPanel();
        okayButton_DataRetrieved = new javax.swing.JButton();
        dataRetrieved_Label = new javax.swing.JLabel();
        emptyFilePanel = new javax.swing.JPanel();
        emptyFile_Label = new javax.swing.JLabel();
        okayButton_FileEmpty = new javax.swing.JButton();
        savedInfo_Panel = new javax.swing.JPanel();
        saved_Label = new javax.swing.JLabel();
        okButton_InfoSaved = new javax.swing.JButton();
        title_JLabel = new javax.swing.JLabel();
        bgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 800));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        loadFromFile_Button.setBackground(new java.awt.Color(0, 204, 204));
        loadFromFile_Button.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        loadFromFile_Button.setText("Load From File");
        loadFromFile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFromFile_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loadFromFile_Button);
        loadFromFile_Button.setBounds(178, 132, 229, 31);

        searchEmp_Button.setBackground(new java.awt.Color(0, 204, 204));
        searchEmp_Button.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        searchEmp_Button.setText("Search an Employee");
        searchEmp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmp_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchEmp_Button);
        searchEmp_Button.setBounds(178, 179, 229, 31);

        displayInfo_Button.setBackground(new java.awt.Color(0, 204, 204));
        displayInfo_Button.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        displayInfo_Button.setText("Display all Information");
        displayInfo_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInfo_ActionPerformed(evt);
            }
        });
        getContentPane().add(displayInfo_Button);
        displayInfo_Button.setBounds(178, 223, 229, 31);

        addEmp_Button.setBackground(new java.awt.Color(0, 204, 204));
        addEmp_Button.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        addEmp_Button.setText("Add an Employee");
        addEmp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeInfo_PerformAction(evt);
            }
        });
        getContentPane().add(addEmp_Button);
        addEmp_Button.setBounds(178, 94, 229, 31);

        save_Button.setBackground(new java.awt.Color(0, 204, 204));
        save_Button.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        save_Button.setText("Save to File");
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton_PerformAction(evt);
            }
        });
        getContentPane().add(save_Button);
        save_Button.setBounds(178, 270, 229, 31);

        searchPanel.setBackground(new java.awt.Color(204, 123, 225));
        searchPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        enterEmpID_Label.setText("Enter Employee ID");

        okay_Button.setText("OK");
        okay_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayButton_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(okay_Button))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                                .addComponent(enterEmpID_Label)
                                .addGap(8, 8, 8)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterEmpID_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okay_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(searchPanel);
        searchPanel.setBounds(501, 343, 266, 145);

        errorPanel.setBackground(new java.awt.Color(204, 123, 225));
        errorPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        error_Label.setText("ERROR!");

        errorMessage_Label.setText(" This employee ID does not exist");

        searchAgain_Button.setText("Search Again");
        searchAgain_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAgain_ButtonActionPerformed(evt);
            }
        });

        returnToMainMenu_Button.setText("Main Menu");
        returnToMainMenu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainMenu_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout errorPanelLayout = new javax.swing.GroupLayout(errorPanel);
        errorPanel.setLayout(errorPanelLayout);
        errorPanelLayout.setHorizontalGroup(
            errorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorPanelLayout.createSequentialGroup()
                .addComponent(searchAgain_Button)
                .addGap(18, 18, 18)
                .addComponent(returnToMainMenu_Button)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(errorPanelLayout.createSequentialGroup()
                .addGroup(errorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(errorPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(error_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(errorPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errorMessage_Label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        errorPanelLayout.setVerticalGroup(
            errorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorPanelLayout.createSequentialGroup()
                .addComponent(error_Label)
                .addGap(11, 11, 11)
                .addComponent(errorMessage_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(errorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchAgain_Button)
                    .addComponent(returnToMainMenu_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(errorPanel);
        errorPanel.setBounds(425, 534, 269, 118);

        loadFromFile_Panel.setBackground(new java.awt.Color(204, 123, 225));
        loadFromFile_Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        okayButton_DataRetrieved.setText("ok");
        okayButton_DataRetrieved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayButton_DataRetrievedActionPerformed(evt);
            }
        });

        dataRetrieved_Label.setText("Data has been retrieved from file");

        javax.swing.GroupLayout loadFromFile_PanelLayout = new javax.swing.GroupLayout(loadFromFile_Panel);
        loadFromFile_Panel.setLayout(loadFromFile_PanelLayout);
        loadFromFile_PanelLayout.setHorizontalGroup(
            loadFromFile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadFromFile_PanelLayout.createSequentialGroup()
                .addComponent(okayButton_DataRetrieved)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(dataRetrieved_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        loadFromFile_PanelLayout.setVerticalGroup(
            loadFromFile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadFromFile_PanelLayout.createSequentialGroup()
                .addComponent(dataRetrieved_Label)
                .addGap(15, 15, 15)
                .addComponent(okayButton_DataRetrieved)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(loadFromFile_Panel);
        loadFromFile_Panel.setBounds(477, 210, 262, 76);

        emptyFilePanel.setBackground(new java.awt.Color(204, 123, 225));
        emptyFilePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        emptyFile_Label.setText("File is empty");

        okayButton_FileEmpty.setText("OK");
        okayButton_FileEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayButton_FileEmptyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emptyFilePanelLayout = new javax.swing.GroupLayout(emptyFilePanel);
        emptyFilePanel.setLayout(emptyFilePanelLayout);
        emptyFilePanelLayout.setHorizontalGroup(
            emptyFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyFilePanelLayout.createSequentialGroup()
                .addComponent(emptyFile_Label)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(emptyFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(okayButton_FileEmpty)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        emptyFilePanelLayout.setVerticalGroup(
            emptyFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyFilePanelLayout.createSequentialGroup()
                .addComponent(emptyFile_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okayButton_FileEmpty)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(emptyFilePanel);
        emptyFilePanel.setBounds(529, 111, 106, 81);

        savedInfo_Panel.setBackground(new java.awt.Color(204, 123, 225));
        savedInfo_Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        saved_Label.setText("Information has been saved");

        okButton_InfoSaved.setText("Ok");
        okButton_InfoSaved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButton_InfoSavedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout savedInfo_PanelLayout = new javax.swing.GroupLayout(savedInfo_Panel);
        savedInfo_Panel.setLayout(savedInfo_PanelLayout);
        savedInfo_PanelLayout.setHorizontalGroup(
            savedInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, savedInfo_PanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(saved_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(savedInfo_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(okButton_InfoSaved)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        savedInfo_PanelLayout.setVerticalGroup(
            savedInfo_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savedInfo_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saved_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton_InfoSaved)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(savedInfo_Panel);
        savedInfo_Panel.setBounds(38, 386, 269, 103);

        title_JLabel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        title_JLabel.setForeground(new java.awt.Color(0, 204, 204));
        title_JLabel.setText("Employee Database System");
        getContentPane().add(title_JLabel);
        title_JLabel.setBounds(115, 16, 573, 50);

        bgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundImage.jpg"))); // NOI18N
        getContentPane().add(bgroundLabel);
        bgroundLabel.setBounds(0, -80, 930, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchEmp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmp_ButtonActionPerformed
        // when the search button is pressed, the search panel appears
        searchPanel.setVisible(true);

    }//GEN-LAST:event_searchEmp_ButtonActionPerformed


    private void loadFromFile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFromFile_ButtonActionPerformed
        // when the load from file button is pressed
        java.io.File file = new java.io.File("savedEmployeeInfo.txt");
        try {
            Scanner input = new Scanner(file);
            if (input.hasNext() == false) {
                emptyFilePanel.setVisible(true);
            }
            while (input.hasNext() == true) {
                loadFromFile_Panel.setVisible(true);
                String line = input.nextLine(); //reads each line in the text file         
                int totalLength = line.length(); //finds the length of each line
                int count = line.indexOf("#") + 1; //index finds the position number of the hashtag in the line
                String jobType = String.valueOf(line.charAt(count));
                String newString = line.substring(count + 2, totalLength);//substring is used to set the new words in the line variable
                totalLength = newString.length();
                count = newString.indexOf("#");
                StringBuilder str = new StringBuilder(newString);//creates a new string
                str.setLength(count); //setLength is used to set the length of the line to a new length
                int empID = Integer.parseInt(str.toString());
                newString = newString.substring(count + 1, totalLength);
                count = newString.indexOf("#");
                str = new StringBuilder(newString);
                str.setLength(count);
                String fName = str.toString();
                count = newString.indexOf("#");
                totalLength = newString.length();
                newString = newString.substring(count + 1, totalLength);
                count = newString.indexOf("#");
                str = new StringBuilder(newString);
                str.setLength(count);
                String lName = str.toString();
                count = newString.indexOf("#");
                totalLength = newString.length();
                newString = newString.substring(count + 1, totalLength);
                count = newString.indexOf("#");
                str = new StringBuilder(newString);
                str.setLength(count);
                String location = str.toString();
                int workPlaceInt;
                if ("Mississauga".equals(location)) {
                    workPlaceInt = 0;
                } else if ("Ottawa".equals(location)) {
                    workPlaceInt = 1;
                } else {
                    workPlaceInt = 2;

                }
                count = newString.indexOf("#");
                totalLength = newString.length();
                newString = newString.substring(count + 1, totalLength);
                count = newString.indexOf("#");
                str = new StringBuilder(newString);
                str.setLength(count);
                String gender = str.toString();
                int genderInt = 0;
                if ("male".equals(gender)) {

                    genderInt = 0;
                } else if ("female".equals(gender)) {

                    genderInt = 1;
                } else {
                    genderInt = 2;

                }
                count = newString.indexOf("#");
                totalLength = newString.length();
                newString = newString.substring(count + 1, totalLength);
                count = newString.indexOf("#");
                str = new StringBuilder(newString);
                str.setLength(count);
                double deducRate = Double.parseDouble(str.toString());

                if ("F".equals(jobType)) {
                    count = newString.indexOf("#");
                    totalLength = newString.length();
                    newString = newString.substring(count + 1, totalLength);
                    double annualSalary = Double.parseDouble(newString);
                    //full-time employee is added into the hash table
                    FullTimeEmployee empToAdd;
                    empToAdd = new FullTimeEmployee(empID, fName, lName, genderInt, workPlaceInt, annualSalary, deducRate);
                    ourHT = MainFrame.returnTheHT();
                    ourHT.addEmployee(empToAdd);
                } else {
                    count = newString.indexOf("#");
                    totalLength = newString.length();
                    newString = newString.substring(count + 1, totalLength);
                    str = new StringBuilder(newString);
                    str.setLength(count - 2);
                    double hourlyWage = Double.parseDouble(str.toString());
                    count = newString.indexOf("#");
                    totalLength = newString.length();
                    newString = newString.substring(count + 1, totalLength);
                    str = new StringBuilder(newString);
                    str.setLength(count - 1);
                    double weeksPerYear = Double.parseDouble(str.toString());
                    str.setLength(count);
                    count = newString.indexOf("#");
                    totalLength = newString.length();
                    newString = newString.substring(count + 1, totalLength);
                    double hoursPerWeek = Double.parseDouble(newString);
                    //part-time employee is added to the hash table
                    PartTimeEmployee empToAdd;
                    empToAdd = new PartTimeEmployee(empID, fName, lName, genderInt, workPlaceInt, hourlyWage, weeksPerYear, hoursPerWeek, deducRate);
                    ourHT = MainFrame.returnTheHT();
                    ourHT.addEmployee(empToAdd);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.format("File does not exist\n");
        }
    }//GEN-LAST:event_loadFromFile_ButtonActionPerformed


    private void AddEmployeeInfo_PerformAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeInfo_PerformAction
        //when the 'Add an Employee' button is pressed, the add frame opens
        this.setVisible(false);
        this.dispose();
        JFrame_AddEmp nw = new JFrame_AddEmp();
        nw.setVisible(true);
    }//GEN-LAST:event_AddEmployeeInfo_PerformAction

    private void displayInfo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInfo_ActionPerformed
        //when the 'Display all Information' button is pressed
        this.setVisible(false);
        this.dispose();
        displayTable viewDisplay = new displayTable();
        viewDisplay.setVisible(true);


    }//GEN-LAST:event_displayInfo_ActionPerformed

    private void saveButton_PerformAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton_PerformAction
        //when the 'Save to File' button is pressed
        savedInfo_Panel.setVisible(true);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(".\\savedEmployeeInfo.txt"))) {
            //file was created
            EmployeeInfo newPart;
            PartTimeEmployee thePTE;
            FullTimeEmployee theFTE;

            for (int i = 0; i < howManyBuckets; i++) {
                // Read each employee from the ArrayList for the current bucket
                for (int j = 0; j < ourHT.getBuckets()[i].size(); j++) {
                    newPart = ourHT.getBuckets()[i].get(j);
                    if (newPart instanceof PartTimeEmployee) {
                        //just read a PTE.
                        thePTE = (PartTimeEmployee) newPart;
                        writer.write("#P"); //wrties to the  file
                    }
                    if (newPart instanceof FullTimeEmployee) {
                        //just read a FTE.
                        theFTE = (FullTimeEmployee) newPart;
                        writer.write("#F");
                    }
                    writer.write("#" + Integer.toString(newPart.getEmpNumber()));
                    writer.write("#" + newPart.getFirstName());
                    writer.write("#" + newPart.getLastName());
                    switch (newPart.getWorkLoc()) {
                        case 0:
                            writer.write("#" + "Mississauga");
                            break;
                        case 1:
                            writer.write("#" + "Ottawa");
                            break;
                        case 2:
                            writer.write("#" + "Chicago");
                            break;
                    }
                    switch (newPart.getEmpSex()) {
                        case 0:
                            writer.write("#" + "male");
                            break;
                        case 1:
                            writer.write("#" + "female");
                            break;
                        case 2:
                            writer.write("#" + "other");
                            break;
                    }

                    writer.write("#" + Double.toString(newPart.getDeductionsRate()));
                    if (newPart instanceof PartTimeEmployee) {
                        //just read a PTE.
                        thePTE = (PartTimeEmployee) newPart;
                        writer.write("#" + Double.toString(thePTE.getHourlyWage()));
                        writer.write("#" + Double.toString(thePTE.getWeeksPerYear()));
                        writer.write("#" + Double.toString(thePTE.getHoursPerWeek()));
                        writer.newLine();
                    }
                    if (newPart instanceof FullTimeEmployee) {
                        // just read a PTE.
                        theFTE = (FullTimeEmployee) newPart;
                        writer.write("#" + Double.toString(theFTE.getAnnualSalary()));
                        writer.newLine();
                    }

                }

            }

        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_saveButton_PerformAction

    private void okayButton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayButton_ActionPerformed
        // when the okay button on the search employee panel is pressed
        int empID = Integer.parseInt(search_Text.getText());
        int bucket = ourHT.searchEmployee(empID);
        System.out.println(bucket);
        if (bucket == -1) { //if employee with the employee ID entered is not found
            searchPanel.setVisible(false);
            errorPanel.setVisible(true);
        } else { //if it is found
            searchFrame displaySearched = new searchFrame();
            displaySearched.searchOne(empID);
            searchPanel.setVisible(false);
            displaySearched.setVisible(true);
        }

    }//GEN-LAST:event_okayButton_ActionPerformed

    private void searchAgain_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAgain_ButtonActionPerformed
        // search again panel is set visible
        errorPanel.setVisible(false);
        searchPanel.setVisible(true);
    }//GEN-LAST:event_searchAgain_ButtonActionPerformed

    private void returnToMainMenu_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainMenu_ButtonActionPerformed
        // when the return to Main Menu button is pressed on the error panel
        errorPanel.setVisible(false);

    }//GEN-LAST:event_returnToMainMenu_ButtonActionPerformed

    private void okayButton_DataRetrievedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayButton_DataRetrievedActionPerformed
        //when the okay button for the data has been retrieved message panel is pressed
        loadFromFile_Panel.setVisible(false);
    }//GEN-LAST:event_okayButton_DataRetrievedActionPerformed

    private void okayButton_FileEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayButton_FileEmptyActionPerformed
        //when the okay button on the empty message panel is pressed
        emptyFilePanel.setVisible(false);
    }//GEN-LAST:event_okayButton_FileEmptyActionPerformed

    private void okButton_InfoSavedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButton_InfoSavedActionPerformed
        // when the okay button on the save to file message panel is pressed
        savedInfo_Panel.setVisible(false);
    }//GEN-LAST:event_okButton_InfoSavedActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        bgroundLabel.setSize(this.getSize());
    }//GEN-LAST:event_formComponentResized

    public void newJFrame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmp_Button;
    private javax.swing.JLabel bgroundLabel;
    private javax.swing.JLabel dataRetrieved_Label;
    private javax.swing.JButton displayInfo_Button;
    private javax.swing.JPanel emptyFilePanel;
    private javax.swing.JLabel emptyFile_Label;
    private javax.swing.JLabel enterEmpID_Label;
    private javax.swing.JLabel errorMessage_Label;
    private javax.swing.JPanel errorPanel;
    private javax.swing.JLabel error_Label;
    private javax.swing.JButton loadFromFile_Button;
    private javax.swing.JPanel loadFromFile_Panel;
    private javax.swing.JButton okButton_InfoSaved;
    private javax.swing.JButton okayButton_DataRetrieved;
    private javax.swing.JButton okayButton_FileEmpty;
    private javax.swing.JButton okay_Button;
    private javax.swing.JButton returnToMainMenu_Button;
    private javax.swing.JButton save_Button;
    private javax.swing.JPanel savedInfo_Panel;
    private javax.swing.JLabel saved_Label;
    private javax.swing.JButton searchAgain_Button;
    private javax.swing.JButton searchEmp_Button;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField search_Text;
    private javax.swing.JLabel title_JLabel;
    // End of variables declaration//GEN-END:variables

}
