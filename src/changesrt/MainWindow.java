package changesrt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author @pm_verma
 */
public class MainWindow extends javax.swing.JFrame {

    private boolean decrease = false;
    private boolean increase = false;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblInput = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnInput = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();
        txtOutput = new javax.swing.JTextField();
        btnOutput = new javax.swing.JButton();
        radioDecrease = new javax.swing.JRadioButton();
        radioIncrease = new javax.swing.JRadioButton();
        spinnerSeconds = new javax.swing.JSpinner();
        btnDoIt = new javax.swing.JButton();
        lblSeconds = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shift subtitle time");

        lblInput.setText("Input SRT:");

        txtInput.setEditable(false);

        btnInput.setText("Browse");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        lblOutput.setText("Output SRT:");

        txtOutput.setEditable(false);

        btnOutput.setText("Browse");
        btnOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioDecrease);
        radioDecrease.setText("Decrease");

        buttonGroup1.add(radioIncrease);
        radioIncrease.setSelected(true);
        radioIncrease.setText("Increase");

        spinnerSeconds.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinnerSeconds.setName(""); // NOI18N

        btnDoIt.setText("Do it!");
        btnDoIt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDoIt.setEnabled(false);
        btnDoIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoItActionPerformed(evt);
            }
        });

        lblSeconds.setText("seconds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnDoIt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOutput)
                            .addComponent(lblInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioIncrease)
                                .addGap(37, 37, 37)
                                .addComponent(radioDecrease)
                                .addGap(57, 57, 57)
                                .addComponent(spinnerSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblSeconds))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioDecrease)
                            .addComponent(radioIncrease)
                            .addComponent(spinnerSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnDoIt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        if (fileChooser.getSelectedFile() == null) {
            return;
        }
        txtInput.setText(fileChooser.getSelectedFile().getAbsolutePath());
        String file = fileChooser.getSelectedFile().getAbsolutePath();
        String extension = file.substring(file.lastIndexOf("."));
        String fileNameWithoutExtension = file.substring(0,file.lastIndexOf("."));
        String outputFilePath = fileNameWithoutExtension + "_new" + extension;
        txtOutput.setText(outputFilePath);
        btnDoIt.setEnabled(true);
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showSaveDialog(this);
        if (fileChooser.getSelectedFile() == null) {
            return;
        }
        txtOutput.setText(fileChooser.getSelectedFile().getAbsolutePath());

    }//GEN-LAST:event_btnOutputActionPerformed

    private void btnDoItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoItActionPerformed
        
        int lineCounter = 1;
        boolean changeNextLine = false;
        int amount = Integer.valueOf(spinnerSeconds.getValue().toString());
        if (radioDecrease.isSelected()) {
            decrease = true;
        }
        if (radioIncrease.isSelected()) {
            increase = true;
        }

        try {
            Scanner scanner = null;
            File output = new File(txtOutput.getText());
            output.createNewFile();
            PrintWriter printWriter = new PrintWriter(output);
            
            try {
                scanner = new Scanner(new File(txtInput.getText()));
                while (scanner.hasNext()) {
                    String nextLine = scanner.nextLine();
                    String newLine = nextLine;
                    if(nextLine.trim().equalsIgnoreCase(String.valueOf(lineCounter))) {
                        changeNextLine = true;
                        lineCounter+=1;
                        printWriter.write(newLine + "\n");
                        continue;
                    }
                    if (changeNextLine) {
                        String[] str = nextLine.split("-->");
                        String startStr = str[0].split(",")[0].trim();
                        String endStr = str[1].split(",")[0].trim();
                        String startMili = str[0].split(",")[1].trim();
                        String endMili = str[1].split(",")[1].trim();

                        LocalTime startTime = LocalTime.of(Integer.valueOf(startStr.split(":")[0]), Integer.valueOf(startStr.split(":")[1]), Integer.valueOf(startStr.split(":")[2]));
                        LocalTime endTime = LocalTime.of(Integer.valueOf(endStr.split(":")[0]), Integer.valueOf(endStr.split(":")[1]), Integer.valueOf(endStr.split(":")[2]));
                        LocalTime newStartTime = null;
                        LocalTime newEndTime = null;
                        if (decrease) {
                            newStartTime = startTime.minusSeconds(amount);
                            newEndTime = endTime.minusSeconds(amount);
                        } else if (increase) {
                            newStartTime = startTime.plusSeconds(amount);
                            newEndTime = endTime.plusSeconds(amount);
                        }
                        newLine = "00:" + newStartTime.getMinute() + ":" + newStartTime.getSecond() + "," + startMili + " -->  00:" + newEndTime.getMinute() + ":" + newEndTime.getSecond() + "," + endMili;
                    }
                    changeNextLine = false;
                    printWriter.write(newLine + "\n");
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "File not found!", "Error", JOptionPane.ERROR);
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if(scanner != null) {
                    scanner.close();
                }
                printWriter.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "I/O Error!", "Error", JOptionPane.ERROR);
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Finish, Enjoy it!");
    }//GEN-LAST:event_btnDoItActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoIt;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnOutput;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblSeconds;
    private javax.swing.JRadioButton radioDecrease;
    private javax.swing.JRadioButton radioIncrease;
    private javax.swing.JSpinner spinnerSeconds;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
