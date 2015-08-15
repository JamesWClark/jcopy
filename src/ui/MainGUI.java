/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import javax.swing.JFileChooser;

public class MainGUI extends javax.swing.JFrame {

    public MainGUI() {
        initComponents();
        lstNetbiosNames.setTransferHandler(new TxtTransferHandler(lstNetbiosNames));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooserSource = new javax.swing.JFileChooser();
        chooserDestination = new javax.swing.JFileChooser();
        lblNetbiosList = new javax.swing.JLabel();
        paneNetbiosNames = new javax.swing.JScrollPane();
        lstNetbiosNames = new javax.swing.JList();
        txtSource = new javax.swing.JTextField();
        lblSource = new javax.swing.JLabel();
        lblDestination = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        lblShortcut = new javax.swing.JLabel();
        txtShortcutLink = new javax.swing.JTextField();
        lblLog = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        btnCopy = new javax.swing.JButton();
        btnChooseSource = new javax.swing.JButton();
        btnChooseDestination = new javax.swing.JButton();
        btnChooseLinkDestination = new javax.swing.JButton();
        lblDragDrop = new javax.swing.JLabel();
        cbSourceIsFolder = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jcopy");

        lblNetbiosList.setText("Netbios List");

        paneNetbiosNames.setName(""); // NOI18N

        lstNetbiosNames.setDragEnabled(true);
        paneNetbiosNames.setViewportView(lstNetbiosNames);

        lblSource.setText("Source (UNC)");

        lblDestination.setText("Destination (UNC)");

        lblShortcut.setText("Shortcut Link (UNC)");

        lblLog.setText("Log");

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane2.setViewportView(txtLog);

        btnCopy.setText("Copy");

        btnChooseSource.setText("Browse");
        btnChooseSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseSourceActionPerformed(evt);
            }
        });

        btnChooseDestination.setText("Browse");
        btnChooseDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDestinationActionPerformed(evt);
            }
        });

        btnChooseLinkDestination.setText("Browse");

        lblDragDrop.setText("(Drop a Text File) ^");

        cbSourceIsFolder.setText("Folder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneNetbiosNames, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNetbiosList)
                    .addComponent(lblDragDrop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtShortcutLink, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                            .addComponent(txtDestination, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSource, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCopy, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDestination, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblShortcut, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLog, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblSource)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbSourceIsFolder)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChooseSource, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChooseDestination, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChooseLinkDestination, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetbiosList)
                    .addComponent(lblSource)
                    .addComponent(cbSourceIsFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChooseSource))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDestination)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChooseDestination))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblShortcut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtShortcutLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChooseLinkDestination))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paneNetbiosNames))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopy)
                    .addComponent(lblDragDrop))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseSourceActionPerformed
        chooserSource.setFileHidingEnabled(false);
        if(cbSourceIsFolder.isSelected()) {
            chooserSource.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        }
        int choice = chooserSource.showOpenDialog(this);
        if(choice == JFileChooser.APPROVE_OPTION) {
            File file = chooserSource.getSelectedFile();
            txtSource.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnChooseSourceActionPerformed

    private void btnChooseDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDestinationActionPerformed
        chooserDestination.setFileHidingEnabled(false);
        chooserDestination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int choice = chooserDestination.showOpenDialog(this);
        if(choice == JFileChooser.APPROVE_OPTION) {
            File file = chooserDestination.getSelectedFile();
            txtDestination.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnChooseDestinationActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseDestination;
    private javax.swing.JButton btnChooseLinkDestination;
    private javax.swing.JButton btnChooseSource;
    private javax.swing.JButton btnCopy;
    private javax.swing.JCheckBox cbSourceIsFolder;
    private javax.swing.JFileChooser chooserDestination;
    private javax.swing.JFileChooser chooserSource;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblDragDrop;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblNetbiosList;
    private javax.swing.JLabel lblShortcut;
    private javax.swing.JLabel lblSource;
    private javax.swing.JList lstNetbiosNames;
    private javax.swing.JScrollPane paneNetbiosNames;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtShortcutLink;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}
