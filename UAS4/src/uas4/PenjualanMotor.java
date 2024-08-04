/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas4;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.Enumeration;
import java.util.logging.Level;
import javax.swing.AbstractButton;

/**
 *
 * @author safir
 */
public class PenjualanMotor extends javax.swing.JFrame {
    int bebek,sport,matic,diskon,total,harga,totaldiskon;
        DBConnection dbConn = new DBConnection();
        Connection con = dbConn.getConnection();
        private DefaultTableModel model;
    public void loadData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection c = DBConnection.getConnection();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM transaksimotor";
            ResultSet r = s.executeQuery(sql);
            
            while (r.next()) {                
                Object[] o = new Object[7];
                o [0] = r.getString("NamaCust");
                o [1] = r.getString("Merek");
                o [2] = r.getString("Transmisi");
                o [3] = r.getString("Harga");
                o [4] = r.getString("Pembayaran");
                o [5] = r.getString("Diskon");
                o [6] = r.getString("TotalBayar");
                
                
                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("terjadi kesalahan"+ e.getMessage());
        }
        
    }
    public void kosongkanTabel(){
        DefaultTableModel model = (DefaultTableModel)this.tabelku.getModel();
        model.setRowCount(0);
    }
    
//    public String getSelectedRadioButtonText(TRANSMISI buttonGroup) {
//        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
//            AbstractButton button = buttons.nextElement();
//            if (button.isSelected()) {
//                return button.getText();
//            }
//        }
//        return null;
//    }
    
    public PenjualanMotor() {

        initComponents();
        model = new DefaultTableModel(new String[]{"NamaCust", "Merek", "Transmisi", "Harga", "Pembayaran", "Diskon", "TotalBayar"}, 0);
        tabelku.setModel(model);
        loadData();
    }
    /**
     * Creates new form PenjualanMotor
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TRANSMISI = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MEREK = new javax.swing.JComboBox<>();
        BEBEK = new javax.swing.JRadioButton();
        SPORT = new javax.swing.JRadioButton();
        MATIC = new javax.swing.JRadioButton();
        HARGA = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PEMBAYARAN = new javax.swing.JComboBox<>();
        HITUNG1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        DISKON = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TOTALBAYAR = new javax.swing.JTextField();
        NAMACUST = new javax.swing.JTextField();
        HAPUS = new javax.swing.JButton();
        SELESAI = new javax.swing.JButton();
        SIMPAN = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelku = new javax.swing.JTable();
        HAPUSTABEL = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();

        jLabel8.setText("HARGA :");

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel7.setText("DATA PEMBAYARAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel7)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(218, Short.MAX_VALUE))
        );

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NAMA CUST", "MEREK", "TRANSMISI ", "HARGA", "PEMBAYARAN", "DISKON", "TOTAL BAYAR"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel1.setText("happy pot");

        jLabel2.setText("NAMA CUSTOMER :");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel3.setText("PEMBELIAN");

        jLabel4.setText("JENIS                   :");

        jLabel5.setText("UKURAN SET     :");

        jLabel6.setText("HARGA              : ");

        MEREK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STAINLESS STEEL", "ALUMUNIUM", "CAST IRON", "NON-STICK", "ENAMEL" }));
        MEREK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEREKActionPerformed(evt);
            }
        });

        TRANSMISI.add(BEBEK);
        BEBEK.setText("BESAR");
        BEBEK.setActionCommand("");
        BEBEK.setContentAreaFilled(false);
        BEBEK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BEBEK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEBEKActionPerformed(evt);
            }
        });

        TRANSMISI.add(SPORT);
        SPORT.setText("SEDANG");
        SPORT.setActionCommand("");
        SPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPORTActionPerformed(evt);
            }
        });

        TRANSMISI.add(MATIC);
        MATIC.setText("KECIL");
        MATIC.setActionCommand("");
        MATIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATICActionPerformed(evt);
            }
        });

        jLabel11.setText("PEMBAYARAN :");

        PEMBAYARAN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "CREDIT" }));
        PEMBAYARAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PEMBAYARANActionPerformed(evt);
            }
        });

        HITUNG1.setText("HITUNG");
        HITUNG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HITUNG1ActionPerformed(evt);
            }
        });

        jLabel10.setText("DISKON            :");

        jLabel9.setText("TOTAL BAYAR :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(57, 57, 57)
                                        .addComponent(HARGA, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MEREK, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TOTALBAYAR, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DISKON, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PEMBAYARAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BEBEK, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(HITUNG1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(MATIC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel3)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MEREK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BEBEK)
                    .addComponent(SPORT)
                    .addComponent(MATIC))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(HARGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(PEMBAYARAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HITUNG1))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TOTALBAYAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DISKON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        BEBEK.getAccessibleContext().setAccessibleDescription("");

        NAMACUST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMACUSTActionPerformed(evt);
            }
        });

        HAPUS.setText("BATAL");
        HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSActionPerformed(evt);
            }
        });

        SELESAI.setText("SELESAI");
        SELESAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELESAIActionPerformed(evt);
            }
        });

        SIMPAN.setText("SIMPAN");
        SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIMPANActionPerformed(evt);
            }
        });

        tabelku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NAMA CUST", "MEREK", "TRANSMISI", "HARGA", "PEMBAYARAN", "DISKON", "TOTAL BAYAR"
            }
        ));
        tabelku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelku);

        HAPUSTABEL.setText("HAPUS TABEL");
        HAPUSTABEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSTABELActionPerformed(evt);
            }
        });

        EDIT.setText("EDIT");
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAMACUST, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HAPUS)
                        .addGap(36, 36, 36)
                        .addComponent(SIMPAN)
                        .addGap(34, 34, 34)
                        .addComponent(EDIT)
                        .addGap(31, 31, 31)
                        .addComponent(HAPUSTABEL)
                        .addGap(18, 18, 18)
                        .addComponent(SELESAI))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NAMACUST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HAPUS)
                    .addComponent(SIMPAN)
                    .addComponent(HAPUSTABEL)
                    .addComponent(EDIT)
                    .addComponent(SELESAI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NAMACUSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMACUSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMACUSTActionPerformed

    private void MATICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATICActionPerformed
        // TODO add your handling code here:
        if (MATIC.isSelected())
        {
        HARGA.setText(String.valueOf(matic));
        }
    }//GEN-LAST:event_MATICActionPerformed

    private void MEREKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEREKActionPerformed
        // TODO add your handling code here:
        if (MEREK.getSelectedItem().equals("STAINLESS STEEL"))
            {
                bebek = 12000000;
                sport = 32000000;
                matic = 15000000;
            }
        else
        if (MEREK.getSelectedItem().equals("ALUMUNIUM"))
            {
                bebek = 13500000;
                sport = 27000000;
                matic = 14000000;
            }
        else
        if (MEREK.getSelectedItem().equals("CAST IRON"))
            {
                bebek = 13700000;
                sport = 40000000;
                matic = 17000000;
            }
        else
        if (MEREK.getSelectedItem().equals("NON-STICK"))
            {
                bebek = 12500000;
                sport = 37000000;
                matic = 13000000;
            }
        else
        if (MEREK.getSelectedItem().equals("ENAMEL"))
            {
                bebek = 12500000;
                sport = 37000000;
                matic = 13000000;
            }
    }//GEN-LAST:event_MEREKActionPerformed

    private void BEBEKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEBEKActionPerformed
        // TODO add your handling code here:
        if (BEBEK.isSelected())
        {
        HARGA.setText(String.valueOf(bebek));
        }
    }//GEN-LAST:event_BEBEKActionPerformed

    private void SPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPORTActionPerformed
        // TODO add your handling code here:
        if (SPORT.isSelected())
        {
        HARGA.setText(String.valueOf(sport));
        }
    }//GEN-LAST:event_SPORTActionPerformed

    private void PEMBAYARANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PEMBAYARANActionPerformed
        // TODO add your handling code here:
        if (MEREK.getSelectedItem().equals("STAINLESS STEEL"))
        {
        if (PEMBAYARAN.getSelectedItem().equals("CASH"))
        {
            diskon = 20;
            DISKON.setText(String.valueOf(diskon));
        }else
        if (PEMBAYARAN.getSelectedItem().equals("CREDIT"))
        {
            diskon = 5;
            DISKON.setText(String.valueOf(diskon));
        }
        }
        
        if (MEREK.getSelectedItem().equals("ALUMUNIUM"))
        {
        if (PEMBAYARAN.getSelectedItem().equals("CASH"))
        {
            diskon = 25;
            DISKON.setText(String.valueOf(diskon));
        }else
        if (PEMBAYARAN.getSelectedItem().equals("CREDIT"))
        {
            diskon = 10;
            DISKON.setText(String.valueOf(diskon));
        }
        }
        
        if (MEREK.getSelectedItem().equals("CAST IRON"))
        {
        if (PEMBAYARAN.getSelectedItem().equals("CASH"))
        {
            diskon = 10;
            DISKON.setText(String.valueOf(diskon));
        }else
        if (PEMBAYARAN.getSelectedItem().equals("CREDIT"))
        {
            diskon = 5;
            DISKON.setText(String.valueOf(diskon));
        }
        }
        
        if (MEREK.getSelectedItem().equals("NON-STICK"))
        {
        if (PEMBAYARAN.getSelectedItem().equals("CASH"))
        {
            diskon = 20;
            DISKON.setText(String.valueOf(diskon));
        }else
        if (PEMBAYARAN.getSelectedItem().equals("CREDIT"))
        {
            diskon = 5;
            DISKON.setText(String.valueOf(diskon));
        }
        }
        if (MEREK.getSelectedItem().equals("ENAMEL"))
        {
        if (PEMBAYARAN.getSelectedItem().equals("CASH"))
        {
            diskon = 20;
            DISKON.setText(String.valueOf(diskon));
        }else
        if (PEMBAYARAN.getSelectedItem().equals("CREDIT"))
        {
            diskon = 5;
            DISKON.setText(String.valueOf(diskon));
        }
        }
    }//GEN-LAST:event_PEMBAYARANActionPerformed

    private void HITUNG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HITUNG1ActionPerformed
        // TODO add your handling code here:
        harga = Integer.parseInt(HARGA.getText());
        diskon = Integer.parseInt(DISKON.getText());
        totaldiskon = (diskon * harga)/100;
        total = harga - totaldiskon;
        TOTALBAYAR.setText(String.valueOf(total));
    }//GEN-LAST:event_HITUNG1ActionPerformed

    private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSActionPerformed
        // TODO add your handling code here:
        DISKON.setText("0");
        HARGA.setText("");
        TOTALBAYAR.setText("");
        MEREK.setSelectedItem("HONDA");
        PEMBAYARAN.setSelectedItem("CICIL");
        //buttonGroup1.clearSelection();
    }//GEN-LAST:event_HAPUSActionPerformed

    private void SELESAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELESAIActionPerformed
        // TODO add your handling code here:
        int konfirmasi = JOptionPane.showConfirmDialog(null, "keluar?", "Konfirmasi keluar", JOptionPane.OK_OPTION);
        if (konfirmasi == JOptionPane.OK_OPTION)
        {
            
        dispose();
        
        }
    }//GEN-LAST:event_SELESAIActionPerformed

    private void SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIMPANActionPerformed
        // TODO add your handling code here:
    try {
    
    String namaCust = NAMACUST.getText();
    String merek = MEREK.getSelectedItem().toString();
    
    // Get the selected radio button from transmisiGroup
    String transmisi = "";
    Enumeration<AbstractButton> buttons = TRANSMISI.getElements();
    while (buttons.hasMoreElements()) {
        AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
            transmisi = button.getText();
            break;
        }
    }
    
    int harga = Integer.parseInt(HARGA.getText());
    String pembayaran = PEMBAYARAN.getSelectedItem().toString();
    int diskon = Integer.parseInt(DISKON.getText());
    int totalBayar = Integer.parseInt(TOTALBAYAR.getText());

    PreparedStatement ps = con.prepareStatement("INSERT INTO TransaksiMotor(NamaCust, Merek, Transmisi, Harga, Pembayaran, Diskon, TotalBayar)"
            + " VALUES(?, ?, ?, ?, ?, ?, ?)");
    ps.setString(1, namaCust);
    ps.setString(2, merek);
    ps.setString(3, transmisi);
    ps.setInt(4, harga);
    ps.setString(5, pembayaran);
    ps.setInt(6, diskon);
    ps.setInt(7, totalBayar);
    ps.executeUpdate();
    loadData();
    JOptionPane.showMessageDialog(null, "Data tersimpan");
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Data tidak tersimpan: " + ex.getMessage());
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Format angka salah: " + ex.getMessage());
}
    NAMACUST.setText("");
    MEREK.setSelectedIndex(0);
    TRANSMISI.clearSelection();
    HARGA.setText("");
    PEMBAYARAN.setSelectedIndex(0);
    DISKON.setText("");
    TOTALBAYAR.setText("");

    }//GEN-LAST:event_SIMPANActionPerformed

    private void HAPUSTABELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSTABELActionPerformed
                            
    // Get the selected row index
    int i = tabelku.getSelectedRow();
    if (i == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        return;
    }

    // Retrieve the NamaCust from the selected row
    String namaCust = (String) model.getValueAt(i, 0);

    // Show a confirmation dialog
    int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this data?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (confirmation == JOptionPane.OK_OPTION) {
        try {
            Connection con = dbConn.getConnection();
            String sql = "DELETE FROM TransaksiMotor WHERE NamaCust = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, namaCust);
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error occurred: " + ex.getMessage());
        } finally {
            // Enable/disable buttons as required
            loadData();
        }
    }
    }//GEN-LAST:event_HAPUSTABELActionPerformed

    private void tabelkuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkuMouseClicked
// Enable/disable buttons based on row selection
    
    // Get the selected row index
    int i = tabelku.getSelectedRow();
    if (i == -1) {
        return;
    }
    
    // Retrieve values from the selected row
    String namaCust = (String) model.getValueAt(i, 0);
    String merek = (String) model.getValueAt(i, 1);
    String transmisi = (String) model.getValueAt(i, 2);
    String harga = (String) model.getValueAt(i, 3);
    String pembayaran = (String) model.getValueAt(i, 4);
    String diskon = (String) model.getValueAt(i, 5);
    String totalBayar = (String) model.getValueAt(i, 6);
    
    // Set the values to the corresponding fields
    NAMACUST.setText(namaCust);
    MEREK.setSelectedItem(merek);
    HARGA.setText(harga);
    PEMBAYARAN.setSelectedItem(pembayaran);
    DISKON.setText(diskon);
    TOTALBAYAR.setText(totalBayar);
    
    // Set the corresponding radio button for transmission
    if (transmisi.equals("BEBEK")) {
        BEBEK.setSelected(true);
    } else if (transmisi.equals("SPORT")) {
        SPORT.setSelected(true);
    } else if (transmisi.equals("MATIC")) {
        MATIC.setSelected(true);
    }    
    }//GEN-LAST:event_tabelkuMouseClicked

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
     // Get the selected row index
    int i = tabelku.getSelectedRow();
    if (i == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to edit.");
        return;
    }

    // Retrieve the values from the selected row
    String id = (String) model.getValueAt(i, 0); // Assuming 'id' is the first column
    int harga = Integer.parseInt(HARGA.getText());
    String pembayaran = PEMBAYARAN.getSelectedItem().toString();
    int diskon = Integer.parseInt(DISKON.getText());
    int totalBayar = Integer.parseInt(TOTALBAYAR.getText());
    String namaCust = NAMACUST.getText(); 
    String merek = MEREK.getSelectedItem().toString();

    // Get the selected transmission type from radio buttons
    String transmisi = "";
    if (BEBEK.isSelected()) {
        transmisi = "BEBEK";
    } else if (SPORT.isSelected()) {
        transmisi = "SPORT";
    } else if (MATIC.isSelected()) {
        transmisi = "MATIC";
    }

    try {
        Connection con = dbConn.getConnection();
        String sql = "UPDATE PenjualanMotor SET NamaCust = ?, Merek = ?, Transmisi = ?, Harga = ?, Pembayaran = ?, Diskon = ? WHERE id = ?;";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, namaCust);
        ps.setString(2, merek);
        ps.setString(3, transmisi);
        ps.setInt(4, harga);
        ps.setString(5, pembayaran);
        ps.setInt(6, diskon);
        ps.setString(7, id);

        ps.executeUpdate();
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        
    } catch (Exception e) {
        System.out.println("Update error: " + e.getMessage());
    } finally {
        loadData();
    }
    }//GEN-LAST:event_EDITActionPerformed

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
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenjualanMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BEBEK;
    private javax.swing.JTextField DISKON;
    private javax.swing.JButton EDIT;
    private javax.swing.JButton HAPUS;
    private javax.swing.JButton HAPUSTABEL;
    private javax.swing.JTextField HARGA;
    private javax.swing.JButton HITUNG1;
    private javax.swing.JRadioButton MATIC;
    private javax.swing.JComboBox<String> MEREK;
    private javax.swing.JTextField NAMACUST;
    private javax.swing.JComboBox<String> PEMBAYARAN;
    private javax.swing.JButton SELESAI;
    private javax.swing.JButton SIMPAN;
    private javax.swing.JRadioButton SPORT;
    private javax.swing.JTextField TOTALBAYAR;
    private javax.swing.ButtonGroup TRANSMISI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabelku;
    // End of variables declaration//GEN-END:variables
}