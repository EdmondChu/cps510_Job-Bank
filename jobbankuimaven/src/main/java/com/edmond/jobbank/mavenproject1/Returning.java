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
public class Returning extends javax.swing.JFrame {

    private static Returning returnPanel;
    private static Intro introPanel;
    static Connection con;
    
    public static Returning getInstance(Intro iPanel, Connection conn) {
        if(returnPanel == null){
            returnPanel = new Returning();
            introPanel = iPanel;
            con = conn;
        }
        return returnPanel;
    }

    /**
     * Creates new form Returning
     */
    private Returning() {
        initComponents();
    }
    
    private boolean fillAccountInfo(String[] aString, String username, String password) {
        try {
            String query = "SELECT * FROM Accounts WHERE account_name = '"+username+"' AND account_password= '"+password+"'";
            int i = 0 ;
            Statement st = con.createStatement();
            st.executeQuery(query);
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                for(int j = 0 ; j < aString.length; j++) {
                    aString[j] = rs.getString(j+1);
                }
            }
            
            st.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (aString[0] == null) {
            return false;
        } else
            return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Returning_jpanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Username_jlabel = new javax.swing.JLabel();
        Password_jlabel = new javax.swing.JLabel();
        Username_text = new javax.swing.JTextField();
        Password_text = new javax.swing.JTextField();
        Login_Button = new javax.swing.JButton();
        Close_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Title.setText("Welcome Back");

        Username_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Username_jlabel.setText("Username");

        Password_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Password_jlabel.setText("Password");

        Username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_textActionPerformed(evt);
            }
        });

        Password_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_textActionPerformed(evt);
            }
        });

        Login_Button.setText("Login");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        Close_Button.setText("Close");
        Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_ButtonActionPerformed(evt);
            }
        });

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Returning_jpanelLayout = new javax.swing.GroupLayout(Returning_jpanel);
        Returning_jpanel.setLayout(Returning_jpanelLayout);
        Returning_jpanelLayout.setHorizontalGroup(
            Returning_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Returning_jpanelLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(Returning_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Returning_jpanelLayout.createSequentialGroup()
                        .addGroup(Returning_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Username_jlabel)
                            .addComponent(Password_jlabel))
                        .addGap(18, 18, 18)
                        .addGroup(Returning_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password_text)
                            .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Returning_jpanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Login_Button))
                    .addComponent(Title))
                .addGap(83, 83, 83))
            .addGroup(Returning_jpanelLayout.createSequentialGroup()
                .addGroup(Returning_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Close_Button)
                    .addComponent(Back_Button))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Returning_jpanelLayout.setVerticalGroup(
            Returning_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Returning_jpanelLayout.createSequentialGroup()
                .addComponent(Back_Button)
                .addGap(8, 8, 8)
                .addComponent(Title)
                .addGap(43, 43, 43)
                .addGroup(Returning_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Username_jlabel)
                    .addComponent(Username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Returning_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_jlabel))
                .addGap(27, 27, 27)
                .addComponent(Login_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Close_Button))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Returning_jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Returning_jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Password_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_textActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        String username, password;
        String[] account = new String[8];
        username = Username_text.getText();
        password = Password_text.getText();
        boolean isfilled = fillAccountInfo(account, username, password);
        if(isfilled) {
            FrontPage fp = FrontPage.getInstance(introPanel, con, account);
            fp.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        introPanel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_textActionPerformed

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        ScriptRunner sr = new ScriptRunner(con);
        try {
            sr.runScript(new BufferedReader(new FileReader("C:\\Users\\Edmond\\Documents\\Workspace\\cps510\\jobbankuimaven\\scripts\\DropTables.sql")));
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }
        System.exit(0);
    }//GEN-LAST:event_Close_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Close_Button;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel Password_jlabel;
    private javax.swing.JTextField Password_text;
    private javax.swing.JPanel Returning_jpanel;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Username_jlabel;
    private javax.swing.JTextField Username_text;
    // End of variables declaration//GEN-END:variables
}