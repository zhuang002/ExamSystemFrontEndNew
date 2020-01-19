/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ExamSys.frontend;

import com.ExamSys.backend.Exam;
import java.awt.CardLayout;
import java.awt.Container;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 * The view panel allow user to select an exam to take.
 * @author andy
 */
public class ChooseExamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChooseExamJPanel
     */
    public ChooseExamJPanel() {
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
        jButtonStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListExams = new javax.swing.JList<>();

        jLabel1.setText("Choose exam to take");

        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListExams);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonStart)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The event handler to start the selected exam.
     * @param evt the event object.
     */
    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        // TODO add your handling code here:
        int idx=this.jListExams.getSelectedIndex();
        if (idx>=0) {
            Exam ex=this.exams.get(idx);
            Container parent=this.getParent();
            ((CardLayout)parent.getLayout()).show(parent, "ExamWizard");
            ExamWizardJPanel wizard=(ExamWizardJPanel)parent.getComponent(1);
            wizard.setExam(ex);
        }
    }//GEN-LAST:event_jButtonStartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListExams;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private List<Exam> exams;
    
    /**
     * reload all available exams into the list for user to choose.
     */
    void reload() {
        this.exams=Exam.getAllAvailableExams(Global.currentUser);
        DefaultListModel model=new DefaultListModel();
        model.addAll(exams);
        this.jListExams.setModel(model);
    }
}
