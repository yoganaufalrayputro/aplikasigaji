/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop
 */
import static aplikasigaji.connection.con;
import static aplikasigaji.connection.stm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class gajipegawai extends javax.swing.JFrame {
        public static Connection con=null;
        public static Statement stm;
        public float gaj;
        public float pot;
        
        
    /**
     * @return the dtm
     */
    
    public void peminjaman(){
        

    }
        
    public DefaultTableModel getDtm() {
        return dtm;
    }
    
    private String pot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @param dtm the dtm to set
     */
    public void setDtm(DefaultTableModel dtm) {
        this.dtm = dtm;
    }

    /** 
     * @return the a
     */
    public int getA() {
        return (int) a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the BPJS
     */
    public javax.swing.JTextField getBPJS() {
        return BPJS;
    }

    /**
     * @param BPJS the BPJS to set
     */
    public void setBPJS(javax.swing.JTextField BPJS) {
        this.BPJS = BPJS;
    }

    /**
     * @return the Gaji
     */
    public javax.swing.JTextField getGaji() {
        return Gaji;
    }

    /**
     * @param Gaji the Gaji to set
     */
    public void setGaji(javax.swing.JTextField Gaji) {
        this.Gaji = Gaji;
    }

    /**
     * @return the HLembur
     */
    public javax.swing.JTextField getHLembur() {
        return HLembur;
    }

    /**
     * @param HLembur the HLembur to set
     */
    public void setHLembur(javax.swing.JTextField HLembur) {
        this.HLembur = HLembur;
    }

    /**
     * @return the Lembur
     */
    public javax.swing.JTextField getLembur() {
        return Lembur;
    }

    /**
     * @param Lembur the Lembur to set
     */
    public void setLembur(javax.swing.JTextField Lembur) {
        this.Lembur = Lembur;
    }

    /**
     * @return the buttonGroup1
     */
    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    /**
     * @param buttonGroup1 the buttonGroup1 to set
     */
    public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    /**
     * @return the jButton1
     */
    public javax.swing.JButton getjButton1() {
        return jButton1;
    }

    /**
     * @param jButton1 the jButton1 to set
     */
    public void setjButton1(javax.swing.JButton jButton1) {
        this.jButton1 = jButton1;
    }

    /**
     * @return the jButton2
     */
    public javax.swing.JButton getjButton2() {
        return jButton2;
    }

    /**
     * @param jButton2 the jButton2 to set
     */
    public void setjButton2(javax.swing.JButton jButton2) {
        this.jButton2 = jButton2;
    }

    /**
     * @return the jButton3
     */
    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    /**
     * @param jButton3 the jButton3 to set
     */
    public void setjButton3(javax.swing.JButton jButton3) {
        this.jButton3 = jButton3;
    }

    /**
     * @return the jButton4
     */
    public javax.swing.JButton getjButton4() {
        return jButton4;
    }

    /**
     * @param jButton4 the jButton4 to set
     */
    public void setjButton4(javax.swing.JButton jButton4) {
        this.jButton4 = jButton4;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jLabel8
     */
    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    /**
     * @param jLabel8 the jLabel8 to set
     */
    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    /**
     * @return the jRadioButton1
     */
    public javax.swing.JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    /**
     * @param jRadioButton1 the jRadioButton1 to set
     */
    public void setjRadioButton1(javax.swing.JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }
    
    /**
     * @return the jRadioButton2
     */
    public javax.swing.JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    /**
     * @param jRadioButton2 the jRadioButton2 to set
     */
    public void setjRadioButton2(javax.swing.JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }

    /**
     * @return the jRadioButton3
     */
    public javax.swing.JRadioButton getjRadioButton3() {
        return jRadioButton3;
    }

    /**
     * @param jRadioButton3 the jRadioButton3 to set
     */
    public void setjRadioButton3(javax.swing.JRadioButton jRadioButton3) {
        this.jRadioButton3 = jRadioButton3;
    }

    /**
     * @return the jRadioButton4
     */
    public javax.swing.JRadioButton getjRadioButton4() {
        return jRadioButton4;
    }

    /**
     * @param jRadioButton4 the jRadioButton4 to set
     */
    public void setjRadioButton4(javax.swing.JRadioButton jRadioButton4) {
        this.jRadioButton4 = jRadioButton4;
    }

    /**
     * @return the jRadioButton5
     */
    public javax.swing.JRadioButton getjRadioButton5() {
        return jRadioButton5;
    }

    /**
     * @param jRadioButton5 the jRadioButton5 to set
     */
    public void setjRadioButton5(javax.swing.JRadioButton jRadioButton5) {
        this.jRadioButton5 = jRadioButton5;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jTable1
     */
    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    /**
     * @param jTable1 the jTable1 to set
     */
    public void setjTable1(javax.swing.JTable jTable1) {
        this.jTable1 = jTable1;
    }

    /**
     * @return the nama
     */
    public javax.swing.JTextField getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(javax.swing.JTextField nama) {
        this.nama = nama;
    }

    /**
     * Creates new form gajipegawai
     */
    public DefaultTableModel dtm=new DefaultTableModel();
    public float a=0;
    public gajipegawai() {
        initComponents();
        
        buttonGroup1.add(jRadioButton1);
         buttonGroup1.add(jRadioButton2);
          buttonGroup1.add(jRadioButton3);
           buttonGroup1.add(jRadioButton4);
            buttonGroup1.add(jRadioButton5);
            
            dtm.addColumn("No");
            dtm.addColumn("Nama");
            dtm.addColumn("Gaji");
            dtm.addColumn("Potongan");
            dtm.addColumn("Total");
            
            jTable1.setModel(dtm);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        Gaji = new javax.swing.JTextField();
        Lembur = new javax.swing.JTextField();
        BPJS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        HLembur = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Aplikasi Gaji Pegawai");

        jLabel2.setText("Nama Pegawai");

        jLabel3.setText("Jabatan");

        jLabel4.setText("Gaji");

        jLabel5.setText("Lembur");

        jLabel6.setText("BPJS");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        Gaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GajiActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hitung");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Pegawai");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Pengawas");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Operator");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Admin");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("HRD");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("Jumlah Data");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(nama)
                                    .addComponent(Gaji)
                                    .addComponent(BPJS)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lembur, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HLembur, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton2)))
                                    .addComponent(jRadioButton5))))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Lembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(HLembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BPJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                         
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        getGaji().setText("3000000");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        getGaji().setText("2500000");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        getGaji().setText("2800000");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        getGaji().setText("2600000");
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        getGaji().setText("3500000");
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        float lb=Float.parseFloat(getLembur().getText());
         float hs=lb*10000;
          getHLembur().setText(""+hs);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        setA(getA() + 1);
        String nm=getNama().getText();
        float gj=Float.parseFloat(getGaji().getText());
        float lb=Float.parseFloat(getHLembur().getText());
        float pt=Float.parseFloat(getBPJS().getText());
        
        gaj = gj+lb;
        pot=gaj-pt;
        Object [] as={getA(),nm,gaj,pt,pot};
        
        try {
             String query = " INSERT INTO laporan(Nama,Gaji,Potongan,Total) VALUES "
                            + "('" +nama.getText()+"','"+gaj+"','"+BPJS.getText()+"','"+pot+"')";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gajikaryawan","root","");
            stm = con.createStatement();
            stm.executeUpdate(query);   
            
            JOptionPane.showMessageDialog(this,"Data Tersimpan");
          
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Data Tidak Tersimpan");
            Logger.getLogger(gajipegawai.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        }

        getDtm().addRow(as);
        getjLabel7().setText("Jumlah Data: "+getA());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        getNama().setText("");
        getGaji().setText("");
        getLembur().setText("");
        getHLembur().setText("");
        getBPJS().setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void GajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GajiActionPerformed

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
            java.util.logging.Logger.getLogger(gajipegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gajipegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gajipegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gajipegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gajipegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BPJS;
    private javax.swing.JTextField Gaji;
    private javax.swing.JTextField HLembur;
    public javax.swing.JTextField Lembur;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nama;
    // End of variables declaration//GEN-END:variables


}
