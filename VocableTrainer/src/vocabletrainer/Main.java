/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabletrainer;

import java.awt.Color;
import java.io.File;

/**
 *
 * @author jackzz
 */
public class Main extends javax.swing.JFrame {

    private String[] availableLanguage = {"German", "English", "French", "Spanish"};
    private Configuration config = new Configuration();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ShowAllLanguageDirectory();
        checkBtnLanguage();
        checkBtnStart();

    }

    public void ShowAllLanguageDirectory() {

        File folder = new File(".");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isDirectory() && checkIfStringIsLanguage(listOfFiles[i].getName())) {
                jComboBoxLanguage.addItem(listOfFiles[i].getName());
            }
        }
        changeTextBtnLanguage();
        showVocables();
        setVocablePath();
        setChosenLanguage();

    }

    public boolean checkIfStringIsLanguage(String language) {
        for (int i = 0; i < availableLanguage.length; i++) {
            if (language.equalsIgnoreCase(availableLanguage[i])) {
                return true;
            }
        }

        return false;
    }

    public void showVocables() {
        jComboBoxVocables.removeAllItems();
        if (jComboBoxLanguage.getSelectedItem().toString() != "") {
            File folder = new File("./" + jComboBoxLanguage.getSelectedItem().toString());
            File[] listOfFiles = folder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile() && listOfFiles[i].getName().contains("csv")) {
                    jComboBoxVocables.addItem(listOfFiles[i].getName());
                }
            }
        }
    }

    public void changeTextBtnLanguage() {
        if (jComboBoxLanguage.getSelectedItem().toString() != "") {
            btnNative.setText("Native -> " + jComboBoxLanguage.getSelectedItem().toString());
            btnLanguage.setText(jComboBoxLanguage.getSelectedItem().toString() + " -> Native");
        } else {
            btnNative.setEnabled(false);
            btnLanguage.setEnabled(false);
        }
    }

    public void checkBtnLanguage() {
        if (config.isNativeToLang()) {
            btnNative.setEnabled(false);
            btnNative.setForeground(Color.red);
            btnLanguage.setEnabled(true);
            btnLanguage.setForeground(Color.black);
        } else {
            btnLanguage.setEnabled(false);
            btnLanguage.setForeground(Color.red);
            btnNative.setEnabled(true);
            btnNative.setForeground(Color.black);
        }
    }

    public void checkBtnStart() {
        if (jComboBoxVocables.getItemCount() > 0) {
            btnStart.setEnabled(true);
        } else {
            btnStart.setEnabled(false);
        }
    }

    public void setVocablePath() {
        if (jComboBoxVocables.getItemCount() > 0) {
            config.setVocablePath(
                    "./" + jComboBoxLanguage.getSelectedItem().toString()
                    + "/" + jComboBoxVocables.getSelectedItem().toString()
            );
        }
    }
    
    public void setChosenLanguage(){
        if (jComboBoxLanguage.getItemCount() > 0) {
            config.setChosenLanguage(jComboBoxLanguage.getSelectedItem().toString());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxLanguage = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxVocables = new javax.swing.JComboBox<>();
        btnNative = new javax.swing.JButton();
        btnLanguage = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(203, 182, 42));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 138, 178));
        jLabel1.setText("Vocable Trainer");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 253, 253));
        jLabel2.setText("Vocables:");

        jComboBoxLanguage.setFont(new java.awt.Font("Noto Sans", 3, 12)); // NOI18N
        jComboBoxLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLanguageActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 253, 253));
        jLabel3.setText("Language:");

        jComboBoxVocables.setFont(new java.awt.Font("Noto Sans", 3, 12)); // NOI18N
        jComboBoxVocables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVocablesActionPerformed(evt);
            }
        });

        btnNative.setFont(new java.awt.Font("Noto Sans", 3, 12)); // NOI18N
        btnNative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNativeActionPerformed(evt);
            }
        });

        btnLanguage.setFont(new java.awt.Font("Noto Sans", 3, 12)); // NOI18N
        btnLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanguageActionPerformed(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnNative, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxLanguage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxVocables, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(201, 201, 201))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNative, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxVocables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLanguageActionPerformed
        // TODO add your handling code here:
        showVocables();
        changeTextBtnLanguage();
        checkBtnStart();
        setVocablePath();
        setChosenLanguage();
    }//GEN-LAST:event_jComboBoxLanguageActionPerformed

    private void btnNativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNativeActionPerformed
        // TODO add your handling code here:
        config.setNativeToLang(true);
        checkBtnLanguage();
    }//GEN-LAST:event_btnNativeActionPerformed

    private void btnLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanguageActionPerformed
        // TODO add your handling code here:
        config.setNativeToLang(false);
        checkBtnLanguage();
    }//GEN-LAST:event_btnLanguageActionPerformed

    private void jComboBoxVocablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVocablesActionPerformed
        // TODO add your handling code here:
        checkBtnStart();
        setVocablePath();
    }//GEN-LAST:event_jComboBoxVocablesActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        new Trainer(config).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLanguage;
    private javax.swing.JButton btnNative;
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox<String> jComboBoxLanguage;
    private javax.swing.JComboBox<String> jComboBoxVocables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
