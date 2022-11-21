package view;

import dao.DaoTask;
import dao.DaoUser;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import model.ModelTask;
import model.ModelUser;

/**
 *
 * @author rodri
 */
public class DeleteTask extends javax.swing.JFrame {

    ModelUser modelUser = new ModelUser();
    ModelTask modelTask = new ModelTask();
    DaoUser daoUser = new DaoUser();
    DaoTask daoTask = new DaoTask();

    public DeleteTask() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuvemIcon = new javax.swing.JLabel();
        taskNotesIcon = new javax.swing.JLabel();
        designOptionsView = new javax.swing.JLabel();
        nameTaskTxt = new javax.swing.JLabel();
        txtNameTask = new javax.swing.JTextField();
        designName = new javax.swing.JLabel();
        deleteTxt = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        trashIcon = new javax.swing.JLabel();
        frameBlue = new javax.swing.JLabel();
        backgroundWhite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(760, 436));
        setMinimumSize(new java.awt.Dimension(760, 436));
        setPreferredSize(new java.awt.Dimension(760, 436));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuvemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuvem.png"))); // NOI18N
        getContentPane().add(nuvemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, 25, 16));

        taskNotesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SkyNotes.png"))); // NOI18N
        taskNotesIcon.setMaximumSize(new java.awt.Dimension(119, 34));
        taskNotesIcon.setMinimumSize(new java.awt.Dimension(119, 34));
        taskNotesIcon.setName(""); // NOI18N
        taskNotesIcon.setPreferredSize(new java.awt.Dimension(119, 34));
        getContentPane().add(taskNotesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 17, 119, 40));

        designOptionsView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete Task.png"))); // NOI18N
        designOptionsView.setMaximumSize(new java.awt.Dimension(164, 40));
        designOptionsView.setMinimumSize(new java.awt.Dimension(164, 40));
        designOptionsView.setPreferredSize(new java.awt.Dimension(164, 40));
        getContentPane().add(designOptionsView, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 26, 190, 40));

        nameTaskTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Name Task.png"))); // NOI18N
        nameTaskTxt.setMaximumSize(new java.awt.Dimension(89, 15));
        nameTaskTxt.setMinimumSize(new java.awt.Dimension(89, 15));
        nameTaskTxt.setPreferredSize(new java.awt.Dimension(89, 15));
        getContentPane().add(nameTaskTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 90, 89, 15));

        txtNameTask.setBackground(new java.awt.Color(255, 255, 255));
        txtNameTask.setForeground(new java.awt.Color(0, 0, 0));
        txtNameTask.setBorder(null);
        txtNameTask.setMaximumSize(new java.awt.Dimension(240, 17));
        txtNameTask.setMinimumSize(new java.awt.Dimension(240, 17));
        txtNameTask.setPreferredSize(new java.awt.Dimension(240, 17));
        txtNameTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameTaskActionPerformed(evt);
            }
        });
        getContentPane().add(txtNameTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 190, 20));

        designName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Email.png"))); // NOI18N
        designName.setMaximumSize(new java.awt.Dimension(265, 37));
        designName.setMinimumSize(new java.awt.Dimension(265, 37));
        designName.setPreferredSize(new java.awt.Dimension(265, 37));
        getContentPane().add(designName, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 112, 280, 37));

        deleteTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete (2).png"))); // NOI18N
        deleteTxt.setToolTipText("");
        deleteTxt.setMaximumSize(new java.awt.Dimension(55, 15));
        deleteTxt.setMinimumSize(new java.awt.Dimension(55, 15));
        deleteTxt.setPreferredSize(new java.awt.Dimension(55, 15));
        deleteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTxtMouseClicked(evt);
            }
        });
        getContentPane().add(deleteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 209, 50, 15));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDelete.png"))); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 199, 151, 37));

        trashIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/womannotes (2).png"))); // NOI18N
        trashIcon.setMaximumSize(new java.awt.Dimension(153, 290));
        trashIcon.setMinimumSize(new java.awt.Dimension(153, 290));
        trashIcon.setPreferredSize(new java.awt.Dimension(153, 290));
        getContentPane().add(trashIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 270));

        frameBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/frame.png"))); // NOI18N
        getContentPane().add(frameBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        backgroundWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUpScreen.png"))); // NOI18N
        getContentPane().add(backgroundWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameTaskActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        String nameTask = txtNameTask.getText();
        try {
            if (!nameTask.isEmpty()) {
                String nameUser = JOptionPane.showInputDialog(null, "Enter your name to confirm the action?");
                modelUser.setName_User(nameUser);
                int fkUser = daoUser.returnIdUser(modelUser);
                if (nameUser == null) {
                    JOptionPane.showMessageDialog(this, "Cancellation done successfully, the delete screen will be closed!");
                    dispose();
                } else if (fkUser == 0) {
                    JOptionPane.showMessageDialog(null, "The user you entered does not exist");
                } else {
                    modelTask.setName_Task(nameTask);
                    modelTask.setUser_tb_ID_UserFk(fkUser);
                    if (daoTask.returnTask(modelTask)) {
                        daoTask.deleteTask(modelTask);
                        JOptionPane.showMessageDialog(null, "Successfully deleted task");
                    } else {
                        JOptionPane.showMessageDialog(null, "The task you introduced does not exist");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empty Field");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void deleteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteTxtMouseClicked

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
            java.util.logging.Logger.getLogger(DeleteTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DeleteTask().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundWhite;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel deleteTxt;
    private javax.swing.JLabel designName;
    private javax.swing.JLabel designOptionsView;
    private javax.swing.JLabel frameBlue;
    private javax.swing.JLabel nameTaskTxt;
    private javax.swing.JLabel nuvemIcon;
    private javax.swing.JLabel taskNotesIcon;
    private javax.swing.JLabel trashIcon;
    private javax.swing.JTextField txtNameTask;
    // End of variables declaration//GEN-END:variables
}
