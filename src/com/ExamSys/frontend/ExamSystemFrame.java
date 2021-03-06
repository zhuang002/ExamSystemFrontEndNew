/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ExamSys.frontend;

import com.ExamSys.backend.Role;
import java.awt.CardLayout;
import java.awt.Container;

/**
 * The top frame of the UI application.
 * @author andy
 */
public class ExamSystemFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExamSysteFrame
     */
    public ExamSystemFrame() {
        initComponents();
        initMenus();
        Global.mainFrame=this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginJPanel = new com.ExamSys.frontend.LoginJPanel();
        examsJPanel = new com.ExamSys.frontend.ExamsJPanel();
        usersJPanel = new com.ExamSys.frontend.UsersJPanel();
        problemsJPanel = new com.ExamSys.frontend.ProblemsJPanel();
        studentReportPanel = new com.ExamSys.frontend.StudentReportPanel();
        profileJPanel = new com.ExamSys.frontend.ProfileJPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsers = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemAdmins = new javax.swing.JMenuItem();
        jMenuItemTeachers = new javax.swing.JMenuItem();
        jMenuItemStudents = new javax.swing.JMenuItem();
        jMenuExam = new javax.swing.JMenu();
        jMenuItemExams = new javax.swing.JMenuItem();
        jMenuItemTakeExam = new javax.swing.JMenuItem();
        jMenuProblem = new javax.swing.JMenu();
        jMenuItemProblems = new javax.swing.JMenuItem();
        jMenuReport = new javax.swing.JMenu();
        jMenuItemMaintainReports = new javax.swing.JMenuItem();
        jMenuItemMyReports = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        loginJPanel.setName("LogIn"); // NOI18N
        getContentPane().add(loginJPanel, "LogIn");
        getContentPane().add(examsJPanel, "Exams");
        getContentPane().add(usersJPanel, "Users");
        getContentPane().add(problemsJPanel, "Problems");
        getContentPane().add(studentReportPanel, "StudentsReport");
        getContentPane().add(profileJPanel, "Profile");

        jMenuUsers.setText("User");
        jMenuUsers.setToolTipText("");

        jMenuItemLogin.setText("Login");
        jMenuUsers.add(jMenuItemLogin);

        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemLogout);

        jMenuItem1.setText("Profile");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItem1);

        jMenuItemAdmins.setText("Admins");
        jMenuItemAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdminsActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemAdmins);

        jMenuItemTeachers.setText("Teachers");
        jMenuItemTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTeachersActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemTeachers);

        jMenuItemStudents.setText("Students");
        jMenuItemStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStudentsActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemStudents);

        jMenuBar1.add(jMenuUsers);

        jMenuExam.setText("Exam");

        jMenuItemExams.setText("Maintain Exams");
        jMenuItemExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExamsActionPerformed(evt);
            }
        });
        jMenuExam.add(jMenuItemExams);

        jMenuItemTakeExam.setText("Take Exam");
        jMenuItemTakeExam.setToolTipText("");
        jMenuItemTakeExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTakeExamActionPerformed(evt);
            }
        });
        jMenuExam.add(jMenuItemTakeExam);

        jMenuBar1.add(jMenuExam);

        jMenuProblem.setText("Problem");

        jMenuItemProblems.setText("Problems");
        jMenuItemProblems.setActionCommand("Maintain Problems");
        jMenuItemProblems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProblemsActionPerformed(evt);
            }
        });
        jMenuProblem.add(jMenuItemProblems);

        jMenuBar1.add(jMenuProblem);

        jMenuReport.setText("Report");

        jMenuItemMaintainReports.setText("Maintain Reports");
        jMenuItemMaintainReports.setToolTipText("");
        jMenuItemMaintainReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMaintainReportsActionPerformed(evt);
            }
        });
        jMenuReport.add(jMenuItemMaintainReports);

        jMenuItemMyReports.setText("MyReports");
        jMenuItemMyReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMyReportsActionPerformed(evt);
            }
        });
        jMenuReport.add(jMenuItemMyReports);

        jMenuBar1.add(jMenuReport);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The event handler when select the Maintain Exams menu item.
     * @param evt The event object.
     */
    private void jMenuItemExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExamsActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "Exams");
        this.examsJPanel.reload();
    }//GEN-LAST:event_jMenuItemExamsActionPerformed

    /**
     * The event handler when select the Maintain Problems menu item.
     * @param evt The event object.
     */
    private void jMenuItemProblemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProblemsActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "Problems");
        this.problemsJPanel.reload();
    }//GEN-LAST:event_jMenuItemProblemsActionPerformed

    /**
     * The event handler when User->Admin menu item is selected.
     * @param evt The event object.
     */
    private void jMenuItemAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdminsActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "Users");
        this.usersJPanel.setRole(Role.Admin);
    }//GEN-LAST:event_jMenuItemAdminsActionPerformed

    /**
     * The event handler when select the User->Teachers menu item.
     * @param evt the event object.
     */
    private void jMenuItemTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTeachersActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "Users");
        this.usersJPanel.setRole(Role.Teacher);
    }//GEN-LAST:event_jMenuItemTeachersActionPerformed

    /**
     * The event handler when the User->Students menu item is selected.
     * @param evt The event object.
     */
    private void jMenuItemStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStudentsActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "Users");
        this.usersJPanel.setRole(Role.Student);
    }//GEN-LAST:event_jMenuItemStudentsActionPerformed

    /**
     * The event handler when Report->Maintain Reports menu item is selected.
     * @param evt The event object.
     */
    private void jMenuItemMaintainReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMaintainReportsActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "StudentsReport");
        this.studentReportPanel.reload();
    }//GEN-LAST:event_jMenuItemMaintainReportsActionPerformed

    /**
     * The event handler when Report->My Reports menu item is selected.
     * @param evt The event object.
     */
    private void jMenuItemMyReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMyReportsActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "StudentsReport");
        this.studentReportPanel.reload(Global.currentUser);
    }//GEN-LAST:event_jMenuItemMyReportsActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "LogIn");
        Global.currentUser=null;
        this.loginJPanel.clear();
        initMenus();
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jMenuItemTakeExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTakeExamActionPerformed
        // TODO add your handling code here:
        TakeExamJDialog examDialog=new TakeExamJDialog(this,true);
        examDialog.reload();
        examDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItemTakeExamActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Container contentPane = this.getContentPane();
        ((CardLayout) contentPane.getLayout()).show(contentPane, "Profile");
        this.profileJPanel.reload();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExamSystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamSystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamSystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamSystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ExamSystemFrame mainFrame = new ExamSystemFrame();
                ((CardLayout) mainFrame.getContentPane().getLayout()).show(mainFrame.getContentPane(), "LoginPanel");
                mainFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ExamSys.frontend.ExamsJPanel examsJPanel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExam;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAdmins;
    private javax.swing.JMenuItem jMenuItemExams;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemMaintainReports;
    private javax.swing.JMenuItem jMenuItemMyReports;
    private javax.swing.JMenuItem jMenuItemProblems;
    private javax.swing.JMenuItem jMenuItemStudents;
    private javax.swing.JMenuItem jMenuItemTakeExam;
    private javax.swing.JMenuItem jMenuItemTeachers;
    private javax.swing.JMenu jMenuProblem;
    private javax.swing.JMenu jMenuReport;
    private javax.swing.JMenu jMenuUsers;
    private com.ExamSys.frontend.LoginJPanel loginJPanel;
    private com.ExamSys.frontend.ProblemsJPanel problemsJPanel;
    private com.ExamSys.frontend.ProfileJPanel profileJPanel;
    private com.ExamSys.frontend.StudentReportPanel studentReportPanel;
    private com.ExamSys.frontend.UsersJPanel usersJPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * Initilaize the menu bar visibility according to current user role.
     */
    public void initMenus() {
        if (Global.currentUser == null) {
            this.jMenuItemLogin.setVisible(true);
            this.jMenuItemLogout.setVisible(false);
            this.jMenuItemAdmins.setVisible(false);
            this.jMenuItemTeachers.setVisible(false);
            this.jMenuItemStudents.setVisible(false);
            this.jMenuExam.setVisible(false);
            this.jMenuProblem.setVisible(false);
            this.jMenuReport.setVisible(false);
        } else {
            this.jMenuItemLogin.setVisible(false);
            this.jMenuItemLogout.setVisible(true);
            this.jMenuItemTakeExam.setVisible(false);
            if (Global.currentUser.getRole() == Role.Admin) {
                this.jMenuItemAdmins.setVisible(true);
                this.jMenuItemTeachers.setVisible(true);
                this.jMenuItemStudents.setVisible(true);
                this.jMenuExam.setVisible(true);
                this.jMenuProblem.setVisible(true);
                this.jMenuReport.setVisible(true);
                this.jMenuItemTakeExam.setVisible(false);
                this.jMenuItemMyReports.setVisible(false);
                this.jMenuItemExams.setVisible(true);
                this.jMenuItemMaintainReports.setVisible(true);
            } else if (Global.currentUser.getRole() == Role.Teacher) {
                this.jMenuItemAdmins.setVisible(false);
                this.jMenuItemTeachers.setVisible(false);
                this.jMenuItemStudents.setVisible(true);
                this.jMenuExam.setVisible(true);
                this.jMenuItemTakeExam.setVisible(false);
                this.jMenuProblem.setVisible(true);
                this.jMenuReport.setVisible(true);
                this.jMenuItemMyReports.setVisible(false);
                this.jMenuItemExams.setVisible(true);
                this.jMenuItemMaintainReports.setVisible(true);
            } else {
                this.jMenuItemAdmins.setVisible(false);
                this.jMenuItemTeachers.setVisible(false);
                this.jMenuItemStudents.setVisible(false);
                this.jMenuExam.setVisible(true);
                this.jMenuProblem.setVisible(false);
                this.jMenuReport.setVisible(true);
                this.jMenuItemMaintainReports.setVisible(false);
                this.jMenuItemTakeExam.setVisible(true);
                this.jMenuItemExams.setVisible(false);
                this.jMenuItemMyReports.setVisible(true);
            }
        }
    }

    /**
     * Set the sub panel's appearance according to current user role.
     */
    public void setUsersCardRole() {
        if (Global.currentUser.getRole()==Role.Admin) {
            this.usersJPanel.setRole(Role.Teacher);
        } else if (Global.currentUser.getRole()==Role.Teacher) {
            this.usersJPanel.setRole(Role.Student);
        } else if (Global.currentUser.getRole()==Role.Student) {
            this.usersJPanel.setRole(Role.Student);
            this.studentReportPanel.reload(Global.currentUser);
        }
    }

    /**
     * Reloads the report panel contents.
     */
    void reloadReport() {
        this.studentReportPanel.reload();
    }
}
