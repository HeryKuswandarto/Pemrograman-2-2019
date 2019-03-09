package id.ac.stmik;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class FrameBukuAlamat extends javax.swing.JFrame {

    public FrameBukuAlamat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNama = new javax.swing.JTextField();
        jTextAlamat = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextNoTelp = new javax.swing.JTextField();
        jButtonHapus = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buku Alamat");
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setText("Isi data berikut dengan benar");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Email");

        jLabel5.setText("No. Telepon");

        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHapusMouseClicked(evt);
            }
        });
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextNoTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jTextNama)
                                .addComponent(jTextAlamat)
                                .addComponent(jTextEmail))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButtonHapus)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonSimpan)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonSimpan))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        jTextNama.setText("");
        jTextAlamat.setText("");
        jTextEmail.setText("");
        jTextNoTelp.setText("");
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHapusMouseClicked
        //TODO add your handling code here:
    }//GEN-LAST:event_jButtonHapusMouseClicked

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        EntryBukuAlamat bukualamat = new EntryBukuAlamat();
        bukualamat.setNama(jTextNama.getText());
        bukualamat.setAlamat(jTextAlamat.getText());
        bukualamat.setEmail(jTextEmail.getText());
        bukualamat.setNotelp(jTextNoTelp.getText());

        Boolean fileexist;
        try {
            FileInputStream input = new FileInputStream("addressbook.dat");
            int nilai;
            nilai=input.read();
            input.close();
            fileexist=true;            
        } catch (IOException e){
            fileexist=false;
        }

        if (fileexist){
            try {
                BufferedWriter writer = new BufferedWriter (new FileWriter ("addressbook.dat",true));                
                writer.write (bukualamat.getNama()+"\t");
                writer.write (bukualamat.getAlamat()+"\t");
                writer.write (bukualamat.getNotelp()+"\t");
                writer.write (bukualamat.getEmail()+"\t");
                writer.newLine();
                writer.close();
            } catch (IOException e){
                e.printStackTrace();
            }        
        } else {
            try {
                BufferedWriter writer = new BufferedWriter (new FileWriter ("addressbook.dat"));                
                writer.write (bukualamat.getNama()+"\t");
                writer.write (bukualamat.getAlamat()+"\t");
                writer.write (bukualamat.getNotelp()+"\t");
                writer.write (bukualamat.getEmail()+"\t");
                writer.newLine();
                writer.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
        JOptionPane.showMessageDialog(this, "Data sudah disimpan di addressbook.dat" ,"Informasi", JOptionPane.INFORMATION_MESSAGE);        
        jTextNama.setText("");
        jTextAlamat.setText("");
        jTextEmail.setText("");
        jTextNoTelp.setText("");
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBukuAlamat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextAlamat;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextField jTextNoTelp;
    // End of variables declaration//GEN-END:variables
}
