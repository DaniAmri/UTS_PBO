/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dani
 */
public class NewJFrame extends javax.swing.JFrame {
    int disk,tohar,hrgbrg;
    

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        makanan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hrg_mkn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tglbeli = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        namakasir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setForeground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(null);

        jPanel3.setLayout(null);

        jLabel1.setText("Nomor");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 10, 90, 30);
        jPanel3.add(makanan);
        makanan.setBounds(10, 100, 200, 30);

        jLabel4.setText("Harga Makanan");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 130, 90, 30);

        hrg_mkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrg_mknActionPerformed(evt);
            }
        });
        jPanel3.add(hrg_mkn);
        hrg_mkn.setBounds(10, 160, 200, 30);

        jLabel5.setText("Tanggal Pembelian");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 250, 100, 30);
        jPanel3.add(tglbeli);
        tglbeli.setBounds(10, 280, 200, 30);

        jLabel6.setText("Total Harga");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(140, 310, 70, 20);

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel3.add(total);
        total.setBounds(10, 330, 200, 30);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(110, 370, 90, 40);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save);
        save.setBounds(10, 370, 90, 40);

        jLabel2.setText("Nama Makanan");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, -20, 90, 30);
        jPanel3.add(kode);
        kode.setBounds(10, 40, 200, 30);

        jLabel7.setText("Nama Makanan");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 70, 90, 30);

        namakasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namakasirActionPerformed(evt);
            }
        });
        jPanel3.add(namakasir);
        namakasir.setBounds(10, 220, 200, 30);

        jLabel8.setText("Nama Kasir");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 190, 90, 30);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(10, 10, 220, 470);

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nomor", "NamaKasir", "TanggalBeli", "NamaItem", "Harga", "Diskon", "Bayar"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(240, 220, 500, 200);

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete);
        delete.setBounds(560, 430, 80, 40);

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel4.add(print);
        print.setBounds(650, 430, 80, 40);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 0, 48)); // NOI18N
        jLabel3.setText("FOOD COURT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 440, 80);

        jLabel9.setFont(new java.awt.Font("Highlight LET", 0, 48)); // NOI18N
        jLabel9.setText("GIANT");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(260, 100, 210, 60);

        jLabel10.setText("_________________________");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 110, 60, 14);

        jLabel11.setText("_________________________");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(160, 100, 100, 14);

        jLabel12.setText("_________________________");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(170, 120, 90, 14);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(240, 10, 490, 200);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 750, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hrg_mknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrg_mknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrg_mknActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here
        hrgbrg= Integer.parseInt(total.getText());
        SimpleDateFormat  dateFormat = new SimpleDateFormat("yyy-MM-dd");
        String tanggal = dateFormat.format(tglbeli.getDate());
        if(hrgbrg >= 200000){
        disk = hrgbrg * 10 / 100;
        tohar = hrgbrg - disk;
        }else{
        disk = 0;
        tohar = hrgbrg - disk;
        }
        String SQL = "INSERT INTO tb_transaksi(nomor, NamaKasir, TanggalBeli, NamaItem, Harga, Diskon, Bayar )"
                + "VALUES("+kode.getText()+",'"+namakasir.getText()+"','"+tanggal+"','"+makanan.getText()+"',"
            +total.getText()+","+disk+","+tohar+")";
        int status = KoneksiDB.execute(SQL);
        if(status == 1){
             JOptionPane.showMessageDialog(this, "Data berhasil dimasukkan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        selectData();
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal dimasukkan", "Silahkan Coba Lagi!", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_saveActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
            MessageFormat header = new MessageFormat("Struk Transaksi Pembelian");
    MessageFormat footer = new MessageFormat("Page (0,number,integer)");
    try {
        tb1.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
    }catch (java.awt.print.PrinterException e){
        System.err.format("Cannot print %s&n", e.getMessage());
    }

       
    }//GEN-LAST:event_printActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    kode.setText("");
    namakasir.setText("");
    makanan.setText("");
    tglbeli.getDate();
    total.setText("");
    hrg_mkn.setText("");
        
    
    }//GEN-LAST:event_clearActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void namakasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namakasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namakasirActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int baris = tb1.getSelectedRow();
        if (baris != -1){
            String nomor = tb1.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_transaksi WHERE nomor="+nomor+";";
            int status = KoneksiDB.execute(SQL);
            if (status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Berhasil, We Did It", JOptionPane.INFORMATION_MESSAGE);
            }else{
                 JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Coba Lagi Ya :*", JOptionPane.WARNING_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(this, "Pilih Baris Data Dulu", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField hrg_mkn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField makanan;
    private javax.swing.JTextField namakasir;
    private javax.swing.JButton print;
    private javax.swing.JButton save;
    private javax.swing.JTable tb1;
    private com.toedter.calendar.JDateChooser tglbeli;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

private void selectData() {
        String kolom[] = {"nomor","NamaKasir","TanggalBeli","Makanan","Harga","Diskon","Total"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom); 
        String SQL = "SELECT * FROM tb_transaksi";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()){
              String nomor = rs.getString(1);
              String NamaKasir = rs.getString(2);
              String TanggalBeli = rs.getString(3);
              String Makanan = rs.getString(4);
              String Harga = rs.getString(5);
              String Diskon = rs.getString(6);
              String Total = rs.getString(7);
              String data[] = {nomor,NamaKasir,TanggalBeli,Makanan,Harga,Diskon,Total};
              dtm.addRow(data);
            }
        }catch (SQLException ex){
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        tb1.setModel(dtm);
    }

}
