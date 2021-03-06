/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ExamSys.frontend;

import com.ExamSys.backend.User;
import javax.swing.JOptionPane;

/**
 * The profile edit view.
 * @author yang
 */
public class ProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfileJPanel
     */
    public ProfileJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldNewPassword = new javax.swing.JPasswordField();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jPasswordFieldConfirmPassword = new javax.swing.JPasswordField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        jLabel1.setText("Name");

        jTextFieldName.setEnabled(false);

        jLabel2.setText("New Password");

        jPasswordFieldNewPassword.setToolTipText("");
        jPasswordFieldNewPassword.setEnabled(false);

        jLabelConfirmPassword.setText("Confirm Password");

        jPasswordFieldConfirmPassword.setEnabled(false);

        jButtonUpdate.setText("Change");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.setEnabled(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelConfirmPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldName)
                            .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldConfirmPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButtonUpdate)
                        .addGap(56, 56, 56)
                        .addComponent(jButtonCancel)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmPassword)
                    .addComponent(jPasswordFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:

        if (this.jButtonUpdate.getText().equals("Change")) {
            this.setReadOnly(false);
            this.jButtonUpdate.setText("Update");
        } else {
            if (!this.jPasswordFieldConfirmPassword.getText().trim().equals(this.jPasswordFieldNewPassword.getText().trim())) {
                JOptionPane.showMessageDialog(Global.mainFrame, "The passwords are not identical");
                return;
            }
            User user = this.retrieveUser();
            
            user.update(!this.jPasswordFieldNewPassword.getText().isBlank());
            Global.currentUser = user;
            reload();
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.reload();
    }//GEN-LAST:event_jButtonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JPasswordField jPasswordFieldConfirmPassword;
    private javax.swing.JPasswordField jPasswordFieldNewPassword;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    /**
     * Retrieve the content from the view and fill in a User object.
     * @return A user object that has been filled with details.
     */
    private User retrieveUser() {
        User user = new User();
        user.setUserName(Global.currentUser.getUserName());
        user.setRole(Global.currentUser.getRole());
        user.setName(this.jTextFieldName.getText());
        user.setPassword(this.jPasswordFieldNewPassword.getText());
        return user;
    }

    /**
     * Reload current user info into this view.
     */
    public void reload() {
        this.jTextFieldName.setText(Global.currentUser.getName());
        this.jPasswordFieldConfirmPassword.setText("");
        this.jPasswordFieldNewPassword.setText("");
        this.jButtonUpdate.setText("Change");
        this.setReadOnly(true);
    }

    /**
     * Set this view read only
     * @param b True for read only. False for editable.
     */
    private void setReadOnly(boolean b) {
        this.jTextFieldName.setEnabled(!b);
        this.jPasswordFieldConfirmPassword.setEnabled(!b);
        this.jPasswordFieldNewPassword.setEnabled(!b);
        this.jButtonCancel.setEnabled(!b);
    }
}
