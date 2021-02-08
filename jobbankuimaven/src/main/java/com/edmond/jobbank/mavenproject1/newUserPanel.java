/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edmond.jobbank.mavenproject1;

import java.io.*;
import java.sql.*;
import org.apache.ibatis.jdbc.ScriptRunner;

/**
 *
 * @author Brian
 */
public class newUserPanel extends javax.swing.JFrame {
    private final Intro introPanel;
    private static newUserPanel instance ;
    static Connection con;
    
    /**
     * Creates new form New
     * @param panel
     */
    private newUserPanel(Intro panel) {
        initComponents();
        introPanel = panel;
    }
    
    public static newUserPanel getInstance(Intro panel, Connection conn){
        if(instance == null){
            instance = new newUserPanel(panel);
            con = conn;
        }
        return instance;
    }

    private String getAccountId() {
        //find the row size and label the accountID to be 1 more of the last id
        int count=0;
        try {
            String query = "SELECT COUNT(*) AS rowcount FROM Accounts";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            count = rs.getInt("rowcount") ;
            count++;
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Job#"+count;
    }
    private void populateNewAccount(String account_id, String account_name, String account_password, String user_name,
                                    String user_email, String user_birthdate, String user_address, String user_phone) {
        String query = "insert into Accounts ( account_id, account_name, account_password, user_name, user_email, user_birthdate, user_address, user_phone) values ('"+account_id+"','"+account_name+"','"+account_password+"', 'a', 'a', 'a', 'a', 'a')";
        try {
            Statement st = con.createStatement();
            st.executeQuery(query);
            System.out.println("insert into Accounts ( account_id, account_name, account_password, user_name, user_email, user_birthdate, user_address, user_phone) values ('"+account_id+"','"+account_name+"','"+account_password+"', '"+user_name+"', '"+user_email+"', '"+user_birthdate+"', '"+user_address+"', '"+user_phone+"')");
            
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        New_jpanel = new javax.swing.JPanel();
        Username_jlabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Username_text = new javax.swing.JTextField();
        Close_jlabel = new javax.swing.JButton();
        Password_text = new javax.swing.JTextField();
        Password_jlabel = new javax.swing.JLabel();
        ReType_text = new javax.swing.JTextField();
        ReType_jlabel = new javax.swing.JLabel();
        Name_text = new javax.swing.JTextField();
        Name_jlabel = new javax.swing.JLabel();
        Birthdate_text = new javax.swing.JTextField();
        Birthdate_jlabel = new javax.swing.JLabel();
        Address_text = new javax.swing.JTextField();
        Address_jlabel = new javax.swing.JLabel();
        Phone_text = new javax.swing.JTextField();
        Phone_jlabel = new javax.swing.JLabel();
        Email_text = new javax.swing.JTextField();
        Email_jlabel = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();
        Create_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Username_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Username_jlabel.setText("Username");

        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setText("Account Details");

        Username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_textActionPerformed(evt);
            }
        });

        Close_jlabel.setText("Close");
        Close_jlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_jlabelActionPerformed(evt);
            }
        });

        Password_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_textActionPerformed(evt);
            }
        });

        Password_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Password_jlabel.setText("Password");

        ReType_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReType_textActionPerformed(evt);
            }
        });

        ReType_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ReType_jlabel.setText("Re-Type Password");

        Name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_textActionPerformed(evt);
            }
        });

        Name_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Name_jlabel.setText("Name");

        Birthdate_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Birthdate_textActionPerformed(evt);
            }
        });

        Birthdate_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Birthdate_jlabel.setText("Birthdate");

        Address_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Address_textActionPerformed(evt);
            }
        });

        Address_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Address_jlabel.setText("Address");

        Phone_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phone_textActionPerformed(evt);
            }
        });

        Phone_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Phone_jlabel.setText("Phone");

        Email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_textActionPerformed(evt);
            }
        });

        Email_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Email_jlabel.setText("Email");

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Create_Button.setText("Create");
        Create_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout New_jpanelLayout = new javax.swing.GroupLayout(New_jpanel);
        New_jpanel.setLayout(New_jpanelLayout);
        New_jpanelLayout.setHorizontalGroup(
            New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(New_jpanelLayout.createSequentialGroup()
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(New_jpanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(New_jpanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(New_jpanelLayout.createSequentialGroup()
                                        .addComponent(Username_jlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, New_jpanelLayout.createSequentialGroup()
                                        .addComponent(Password_jlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, New_jpanelLayout.createSequentialGroup()
                                        .addComponent(ReType_jlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addComponent(ReType_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(New_jpanelLayout.createSequentialGroup()
                                        .addComponent(Name_jlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(New_jpanelLayout.createSequentialGroup()
                                        .addComponent(Birthdate_jlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Birthdate_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, New_jpanelLayout.createSequentialGroup()
                                        .addComponent(Address_jlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Address_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, New_jpanelLayout.createSequentialGroup()
                                        .addComponent(Phone_jlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, New_jpanelLayout.createSequentialGroup()
                                        .addComponent(Email_jlabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(New_jpanelLayout.createSequentialGroup()
                                .addComponent(Title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(New_jpanelLayout.createSequentialGroup()
                        .addComponent(Back_Button)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
            .addGroup(New_jpanelLayout.createSequentialGroup()
                .addComponent(Close_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Create_Button)
                .addGap(23, 23, 23))
        );
        New_jpanelLayout.setVerticalGroup(
            New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(New_jpanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(Back_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Username_jlabel)
                    .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Password_jlabel)
                    .addComponent(Password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ReType_jlabel)
                    .addComponent(ReType_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name_jlabel)
                    .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Birthdate_jlabel)
                    .addComponent(Birthdate_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Address_jlabel)
                    .addComponent(Address_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Phone_jlabel)
                    .addComponent(Phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Email_jlabel)
                    .addComponent(Email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(New_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, New_jpanelLayout.createSequentialGroup()
                        .addComponent(Create_Button)
                        .addContainerGap())
                    .addComponent(Close_jlabel, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(New_jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(New_jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_textActionPerformed

    private void Close_jlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_jlabelActionPerformed
        ScriptRunner sr = new ScriptRunner(con);
        try {
            sr.runScript(new BufferedReader(new FileReader("C:\\Users\\Edmond\\Documents\\Workspace\\cps510\\jobbankuimaven\\scripts\\DropTables.sql")));
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }
        System.exit(0);
    }//GEN-LAST:event_Close_jlabelActionPerformed

    private void Password_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_textActionPerformed

    private void ReType_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReType_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReType_textActionPerformed

    private void Name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_textActionPerformed

    private void Birthdate_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Birthdate_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Birthdate_textActionPerformed

    private void Address_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Address_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Address_textActionPerformed

    private void Phone_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Phone_textActionPerformed

    private void Email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_textActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        introPanel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Create_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_ButtonActionPerformed
        String[] account = new String[8];
        account[0] = this.getAccountId();
        account[1] = Username_text.getText();
        account[2] = Password_text.getText();
        account[3] = Name_text.getText();
        account[4] = Email_text.getText();
        account[5] = Birthdate_text.getText();
        account[6] = Address_text.getText();
        account[7] = Phone_text.getText();
        populateNewAccount(account[0],account[1],account[2],account[3],account[4],account[5],account[6],account[7]);
        
        FrontPage fp = FrontPage.getInstance(introPanel,con, account);
        fp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Create_ButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_jlabel;
    private javax.swing.JTextField Address_text;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel Birthdate_jlabel;
    private javax.swing.JTextField Birthdate_text;
    private javax.swing.JButton Close_jlabel;
    private javax.swing.JButton Create_Button;
    private javax.swing.JLabel Email_jlabel;
    private javax.swing.JTextField Email_text;
    private javax.swing.JLabel Name_jlabel;
    private javax.swing.JTextField Name_text;
    private javax.swing.JPanel New_jpanel;
    private javax.swing.JLabel Password_jlabel;
    private javax.swing.JTextField Password_text;
    private javax.swing.JLabel Phone_jlabel;
    private javax.swing.JTextField Phone_text;
    private javax.swing.JLabel ReType_jlabel;
    private javax.swing.JTextField ReType_text;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Username_jlabel;
    private javax.swing.JTextField Username_text;
    // End of variables declaration//GEN-END:variables
}