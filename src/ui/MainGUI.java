/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import jcopy.Logger;
import org.apache.commons.io.FileUtils;

public class MainGUI extends javax.swing.JFrame {

    public MainGUI() {
        initComponents();
        lstNetbiosNames.setTransferHandler(new TxtTransferHandler(lstNetbiosNames));
        this.setLocationRelativeTo(null);
        //this.setLocationByPlatform(true);
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
        lblLog = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        btnCopy = new javax.swing.JButton();
        btnChooseSource = new javax.swing.JButton();
        btnChooseDestination = new javax.swing.JButton();
        lblDragDrop = new javax.swing.JLabel();
        cbSourceIsFolder = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jcopy");

        lblNetbiosList.setText("Netbios List");

        paneNetbiosNames.setName(""); // NOI18N

        lstNetbiosNames.setDragEnabled(true);
        paneNetbiosNames.setViewportView(lstNetbiosNames);

        lblSource.setText("Source");
        lblSource.setToolTipText("");

        lblDestination.setText("Destination (UNC)");

        lblLog.setText("Log");

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(txtLog);

        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

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
                            .addComponent(txtDestination, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSource, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCopy, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDestination, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLog, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblSource)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbSourceIsFolder)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChooseSource, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChooseDestination, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                        .addGap(55, 55, 55)
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
            //drop the C:\ part
            String unc = "\\\\%COMPUTERNAME%\\C$\\" + file.getAbsolutePath().substring(3);
            txtDestination.setText(unc);
        }
    }//GEN-LAST:event_btnChooseDestinationActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        Logger.log("\n====\nStart a new session");
        for(int i = 0; i < lstNetbiosNames.getModel().getSize(); i++) {
            String destination = txtDestination.getText();
            String source = txtSource.getText();
            String name = new File(source).getName();
            destination = destination.replace("%COMPUTERNAME%", lstNetbiosNames.getModel().getElementAt(i).toString());
            destination = destination + "/" + name;
            try {
                if(cbSourceIsFolder.isSelected()) {
                    FileUtils.copyDirectory(new File(source), new File(destination));
                    Logger.log("finished copying: source = " + source + ", dest = " + destination);
                } else {
                    FileUtils.copyFile(new File(source), new File(destination));
                    Logger.log("finished copying: source = " + source + ", dest = " + destination);
                }
            } catch (IOException ex) {
                Logger.log(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnCopyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseDestination;
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
    private javax.swing.JLabel lblSource;
    private javax.swing.JList lstNetbiosNames;
    private javax.swing.JScrollPane paneNetbiosNames;
    private javax.swing.JTextField txtDestination;
    public static javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}
