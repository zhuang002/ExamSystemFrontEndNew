/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ExamSys.frontend;

import com.ExamSys.backend.Role;
import com.ExamSys.backend.User;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 * The View to maintain multiple users. 
 * It has a left list which contains multiple users who might be admins, teachers,
 * or students. The right pane is to display the user info if the user is selected 
 * in the left list.
 * @author Yang
 */
public class UsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserJPanel
     */
    public UsersJPanel() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUsers = new javax.swing.JList<>();
        userJPanel = new com.ExamSys.frontend.UserJPanel();

        jListUsers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUsersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListUsers);

        jSplitPane1.setLeftComponent(jScrollPane1);
        jSplitPane1.setRightComponent(userJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The event handler when a user in left list is selected.
     * @param evt The event object.
     */
    private void jListUsersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUsersValueChanged
        // TODO add your handling code here:
        if (!evt.getValueIsAdjusting()) {
            int idx=this.jListUsers.getSelectedIndex();
            if (idx>=0) {
                User user=(User)this.users.get(idx);
                this.userJPanel.setUser(user);
            }
        }
    }//GEN-LAST:event_jListUsersValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jListUsers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private com.ExamSys.frontend.UserJPanel userJPanel;
    // End of variables declaration//GEN-END:variables
    private Role userRole=Role.Student;
    private List<User> users=null;
    
    /**
     * Relate a role to this view.
     * If Admin role is related, the view will only display admins in left list.
     * In a same way teachers or students are displayed in left list when role is 
     * set.
     * @param role 
     */
    void setRole(Role role) {
        this.userRole=role;
        reload();
        this.userJPanel.setRole(role);
        this.userJPanel.setReadonly(true);
        
    }
    
    /**
     * Reload this view.
     */
    public void reload() {
        DefaultListModel listModel=new DefaultListModel();
        this.users=User.getAllUsers(this.userRole);
        
        for (int i=0;i<this.users.size();i++)
            listModel.add(i, this.users.get(i));
        this.jListUsers.setModel(listModel);
    }
}
