/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.com.raven.form;

import DomainModels.NhanVienDM;
import Sevices.NhanVienISevice;
import Sevices.impl.NhanVienSevice;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TRONG NGHIA
 */
public class JFromNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form JFromNhanVien
     */
    private NhanVienISevice nhanVienService = new NhanVienSevice();
    
    public JFromNhanVien() {
        initComponents();
       loadTable(nhanVienService.getAllNhanVien());
    }
     private Integer trangThai() {
        if (rbNL.isSelected()) {
            return 1;
        } else {
            return 2;
        }
    }
      private Integer chucVu() {
        if (rbQL.isSelected()) {
            return 1;
        } else {
            return 2;
        }
    }
    private void loadTable(ArrayList<NhanVienDM> list) {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();

        model.setColumnCount(0);
        model.addColumn("ID Cửa hàng");
        model.addColumn("Mã nhân viên");
        model.addColumn("Họ nhân viên");
        model.addColumn("Tên nhân viên");
        model.addColumn("Số điện thoại");
        model.addColumn("Mật khẩu");
        model.addColumn("Chức vụ");
        model.addColumn("Địa chỉ");
        model.addColumn("Trạng thái");


        model.setRowCount(0);
        for (NhanVienDM nv : list) {
            model.addRow(new Object[]{
               nv.getIdCH(), nv.getMaNv(), nv.getHoNV(),  nv.getTenNv(),nv.getSdt(),
                nv.getMatKhau(), nv.getIdCV(),nv.getDiaChi(), nv.getTrangThai()
            });
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        rbDL = new javax.swing.JRadioButton();
        rbNL = new javax.swing.JRadioButton();
        txtMK = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tetDC = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txtIDCH = new javax.swing.JTextField();
        rbQL = new javax.swing.JRadioButton();
        rbNV = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnTimkiem = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 680));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Quản lý Nhân viên");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Mã nhân viên");

        jLabel5.setText("Họ nhân viên");

        jLabel6.setText("Tên nhân viên");

        jLabel7.setText("SĐT");

        jLabel8.setText("Mật khẩu");

        jLabel9.setText("Chức vụ");

        jLabel10.setText("Trạng thái");

        jLabel11.setText("Địa chỉ");

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbDL);
        rbDL.setText("Đang đi làm");

        buttonGroup2.add(rbNL);
        rbNL.setText("Đã nghỉ làm");

        tetDC.setColumns(20);
        tetDC.setRows(5);
        jScrollPane2.setViewportView(tetDC);

        jLabel14.setText("ID Cửa hàng");

        buttonGroup1.add(rbQL);
        rbQL.setText("Quản lý");

        buttonGroup1.add(rbNV);
        rbNV.setText("Nhân viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbNL)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbDL))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbQL)
                                        .addGap(42, 42, 42)
                                        .addComponent(rbNV)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(83, 83, 83)
                        .addComponent(txtMK))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(105, 105, 105)
                        .addComponent(txtSDT))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(60, 60, 60)
                        .addComponent(txtTen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(66, 66, 66)
                        .addComponent(txtHo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMa)
                            .addComponent(txtIDCH))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtIDCH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbQL)
                    .addComponent(rbNV))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rbNL)
                    .addComponent(rbDL))
                .addGap(14, 14, 14))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTimkiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/find.png"))); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        jLabel13.setText("Mã nhân viên");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimkiem)
                .addGap(84, 84, 84))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addGap(19, 19, 19)
                .addComponent(txtMaNV)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnTimkiem)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/9.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Cancel.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Thông tin");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Tìm kiếm");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("Chức năng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
//        // TODO add your handling code here:
//        NhanVienDM nv = new NhanVienDM();
//        nv.setIdCH(txtIDCH.getText().trim());
//        nv.setMaNv(txtMa.getText().trim());
//        nv.setHoNV(txtHo.getText().trim());
//        nv.setTenNv(txtTen.getText().trim());
//        nv.setSdt(txtSDT.getText().trim());
//        nv.setMatKhau(txtMK.getText().trim());
//        nv.setIdCV(rbQL.isSelected() ? "Quản lý" : "Nhân viên");
//        nv.setDiaChi(tetDC.getText().trim());
//        nv.setTrangThai(rbNL.isSelected() ? "Đã nghỉ làm" : "Đang đi làm");
//        nhanVienService.suaNhanVien(nv);
//        loadTable(nhanVienService.getAllNhanVien());
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        NhanVienDM nv = new NhanVienDM();
//        nv.setIdCH(txtIDCH.getText().trim());
//        nv.setMaNv(txtMa.getText().trim());
//        nv.setHoNV(txtHo.getText().trim());
//        nv.setTenNv(txtTen.getText().trim());
//        nv.setSdt(txtSDT.getText().trim());
//        nv.setMatKhau(txtMK.getText().trim());
//        nv.setIdCV(rbQL.isSelected() ? "Quản lý" : "Nhân viên");
//        nv.setDiaChi(tetDC.getText().trim());
//        nv.setTrangThai(rbNL.isSelected() ? "1" : "2");
//        nhanVienService.addNhanVien(nv);
//        loadTable(nhanVienService.getAllNhanVien());
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        int select = tblNhanVien.getSelectedRow();
        if(select >= 0){
            txtIDCH.setText(tblNhanVien.getValueAt(0, select).toString());
            txtMa.setText(tblNhanVien.getValueAt(1, select).toString());
            txtHo.setText(tblNhanVien.getValueAt(2, select).toString());
            txtTen.setText(tblNhanVien.getValueAt(3, select).toString());
            txtSDT.setText(tblNhanVien.getValueAt(4, select).toString());
            txtMK.setText(tblNhanVien.getValueAt(5, select).toString());
            if(tblNhanVien.getValueAt(6, select).toString().equals("Quản lý")){
                rbQL.setSelected(true);
            }else{
                rbNV.setSelected(true);
            }
            tetDC.setText(tblNhanVien.getValueAt(7, select).toString());
            if(tblNhanVien.getValueAt(8, select).toString().equals("Đã nghỉ làm")){
                rbNL.setSelected(true);
            }else{
                rbDL.setSelected(true);
            }
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        nhanVienService.xoaNhanVien(txtMa.getText().trim());
        loadTable(nhanVienService.getAllNhanVien());
    
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        txtIDCH.setText("");
        txtMa.setText("");
        txtHo.setText("");
        txtTen.setText("");
        txtSDT.setText("");
        txtMK.setText("");
        tetDC.setText("");
        
        
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTimkiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbDL;
    private javax.swing.JRadioButton rbNL;
    private javax.swing.JRadioButton rbNV;
    private javax.swing.JRadioButton rbQL;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextArea tetDC;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtIDCH;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
