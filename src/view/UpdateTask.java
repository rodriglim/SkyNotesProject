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
public class UpdateTask extends javax.swing.JFrame {

    DaoTask daoTask = new DaoTask();
    ModelTask modelTask = new ModelTask();
    ModelUser modelUser = new ModelUser();
    DaoUser daoUSer = new DaoUser();
    String nameTask, nameUser;
    int idTask, idUser;

    /*   private void listTask() {
        List<ModelTask> list = daoTask.listTask(modelTask);
        DefaultTableModel table = (DefaultTableModel) TaskTable.getModel();
        table.setNumRows(0);
        list.forEach((t) -> {
            table.addRow(new Object[]{
                t.getID_Task(),
                t.getName_Task(),
                t.getTags_Task(),
                t.getCreated_Task(),
                t.getEnd_Task()
            });
        });
    }
     */
    /**
     * Creates new form UpdateTask
     */
    public UpdateTask() {
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

        nameTaskTxt = new javax.swing.JLabel();
        txtNameTask = new javax.swing.JTextField();
        designNameTask = new javax.swing.JLabel();
        designEndDate = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JFormattedTextField();
        designEndDateBacc = new javax.swing.JLabel();
        createdDate = new javax.swing.JLabel();
        txtCreatedDate = new javax.swing.JFormattedTextField();
        designCreatedDate = new javax.swing.JLabel();
        updateTaskTxt = new javax.swing.JLabel();
        nuvemIcon1 = new javax.swing.JLabel();
        taskNotesIcon = new javax.swing.JLabel();
        designUpdate = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        calendarIcon = new javax.swing.JLabel();
        frameBlue = new javax.swing.JLabel();
        backgroundWhite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(760, 436));
        setMinimumSize(new java.awt.Dimension(760, 436));
        setPreferredSize(new java.awt.Dimension(760, 436));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameTaskTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Name Task.png"))); // NOI18N
        nameTaskTxt.setMaximumSize(new java.awt.Dimension(89, 15));
        nameTaskTxt.setMinimumSize(new java.awt.Dimension(89, 15));
        nameTaskTxt.setPreferredSize(new java.awt.Dimension(89, 15));
        getContentPane().add(nameTaskTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 87, 89, 15));

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
        getContentPane().add(txtNameTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 250, 20));

        designNameTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Email.png"))); // NOI18N
        designNameTask.setMaximumSize(new java.awt.Dimension(265, 37));
        designNameTask.setMinimumSize(new java.awt.Dimension(265, 37));
        designNameTask.setPreferredSize(new java.awt.Dimension(265, 37));
        getContentPane().add(designNameTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 111, 280, 37));

        designEndDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/End Date.png"))); // NOI18N
        designEndDate.setMaximumSize(new java.awt.Dimension(89, 15));
        designEndDate.setMinimumSize(new java.awt.Dimension(89, 15));
        designEndDate.setPreferredSize(new java.awt.Dimension(89, 15));
        getContentPane().add(designEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 165, 70, 20));

        txtEndDate.setBackground(new java.awt.Color(255, 255, 255));
        txtEndDate.setBorder(null);
        txtEndDate.setForeground(new java.awt.Color(0, 0, 204));
        try {
            txtEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEndDate.setMaximumSize(null);
        getContentPane().add(txtEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 100, 30));

        designEndDateBacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DateRect.png"))); // NOI18N
        getContentPane().add(designEndDateBacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 187, 135, 37));

        createdDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Created Date.png"))); // NOI18N
        createdDate.setMaximumSize(new java.awt.Dimension(89, 15));
        createdDate.setMinimumSize(new java.awt.Dimension(89, 15));
        createdDate.setPreferredSize(new java.awt.Dimension(89, 15));
        getContentPane().add(createdDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 165, 100, 20));

        txtCreatedDate.setBackground(new java.awt.Color(255, 255, 255));
        txtCreatedDate.setBorder(null);
        txtCreatedDate.setForeground(new java.awt.Color(0, 0, 204));
        try {
            txtCreatedDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCreatedDate.setMaximumSize(null);
        txtCreatedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatedDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtCreatedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 100, 30));

        designCreatedDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DateRect.png"))); // NOI18N
        designCreatedDate.setMaximumSize(null);
        getContentPane().add(designCreatedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 187, 135, 37));

        updateTaskTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Update Task.png"))); // NOI18N
        updateTaskTxt.setMaximumSize(new java.awt.Dimension(164, 40));
        updateTaskTxt.setMinimumSize(new java.awt.Dimension(164, 40));
        updateTaskTxt.setPreferredSize(new java.awt.Dimension(164, 40));
        getContentPane().add(updateTaskTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 13, 210, 50));

        nuvemIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuvem.png"))); // NOI18N
        getContentPane().add(nuvemIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, 25, 16));

        taskNotesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SkyNotes.png"))); // NOI18N
        taskNotesIcon.setMaximumSize(new java.awt.Dimension(119, 34));
        taskNotesIcon.setMinimumSize(new java.awt.Dimension(119, 34));
        taskNotesIcon.setName(""); // NOI18N
        taskNotesIcon.setPreferredSize(new java.awt.Dimension(119, 34));
        getContentPane().add(taskNotesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 17, 119, 40));

        designUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Update.png"))); // NOI18N
        getContentPane().add(designUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 279, 51, 23));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnUopdate.png"))); // NOI18N
        btnUpdate.setMaximumSize(new java.awt.Dimension(550, 376));
        btnUpdate.setMinimumSize(new java.awt.Dimension(550, 376));
        btnUpdate.setPreferredSize(new java.awt.Dimension(550, 376));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 273, 151, 37));

        calendarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 14 (3).png"))); // NOI18N
        calendarIcon.setToolTipText("");
        getContentPane().add(calendarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 450, 390));

        frameBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/frame.png"))); // NOI18N
        getContentPane().add(frameBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        backgroundWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUpScreen.png"))); // NOI18N
        getContentPane().add(backgroundWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            nameUser = JOptionPane.showInputDialog(null, "Enter your name to continue the action");
            modelUser.setName_User(nameUser);
            if (nameUser == null) {
                JOptionPane.showMessageDialog(null, "Cancellation done successfully, the update screen will be closed!");
                dispose();
            } else {
                while (nameUser.isEmpty()) {
                    nameUser = JOptionPane.showInputDialog(null, "Empty Field! Enter your name to continue the action");
                    modelUser.setName_User(nameUser);
                }

                if (!nameUser.isEmpty()) {
                    idUser = daoTask.returnIdUser(modelUser);
                    if (idUser == 0) {
                        JOptionPane.showMessageDialog(null, "The user you entered does not exist");
                        dispose();
                    } else {
                        modelTask.setUser_tb_ID_UserFk(idUser);
                        nameTask = JOptionPane.showInputDialog(null, "Enter the task name to continue the action");
                        modelTask.setName_Task(nameTask);
                        if (nameTask == null) {
                            JOptionPane.showMessageDialog(null, "Cancellation done successfully, the update screen will be closed!");
                            dispose();
                        } else {
                            while (nameTask.isEmpty()) {
                                nameTask = JOptionPane.showInputDialog(null, "Empty Field!Enter the task name to continue the action");
                                modelTask.setName_Task(nameTask);
                            }
                            if (!nameTask.isEmpty()) {
                                idTask = daoTask.returnIdTask(modelTask);
                                if (idTask == 0) {
                                    JOptionPane.showMessageDialog(null, "The task you entered does not exist");
                                    dispose();
                                } else {
                                    modelTask.setID_Task(idTask);
                                }
                            }
                        }
                    }
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void txtNameTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameTaskActionPerformed

    private void txtCreatedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatedDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreatedDateActionPerformed
    private void update() {
        modelTask.setName_Task(txtNameTask.getText());
        modelTask.setCreated_Task(txtCreatedDate.getText());
        modelTask.setEnd_Task(txtEndDate.getText());
        modelTask.setUser_tb_ID_UserFk(idUser);
        if (daoTask.returnTask(modelTask)) {
            daoTask.updateTask(modelTask);
        }

    }
    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked

        update();
    }//GEN-LAST:event_btnUpdateMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateTask().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundWhite;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel calendarIcon;
    private javax.swing.JLabel createdDate;
    private javax.swing.JLabel designCreatedDate;
    private javax.swing.JLabel designEndDate;
    private javax.swing.JLabel designEndDateBacc;
    private javax.swing.JLabel designNameTask;
    private javax.swing.JLabel designUpdate;
    private javax.swing.JLabel frameBlue;
    private javax.swing.JLabel nameTaskTxt;
    private javax.swing.JLabel nuvemIcon1;
    private javax.swing.JLabel taskNotesIcon;
    private javax.swing.JFormattedTextField txtCreatedDate;
    private javax.swing.JFormattedTextField txtEndDate;
    private javax.swing.JTextField txtNameTask;
    private javax.swing.JLabel updateTaskTxt;
    // End of variables declaration//GEN-END:variables
}
