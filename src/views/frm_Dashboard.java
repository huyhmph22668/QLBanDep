/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hungh
 */
public class frm_Dashboard extends javax.swing.JFrame {

   
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbltieude = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_tenNhanVien = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnbanhang = new javax.swing.JPanel();
        crep1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnsanpham = new javax.swing.JPanel();
        crep2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnkhuyenmai = new javax.swing.JPanel();
        crep3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnkhachhang = new javax.swing.JPanel();
        crep4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnnhanvien = new javax.swing.JPanel();
        crep5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnhoadon = new javax.swing.JPanel();
        crepp2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnthongke = new javax.swing.JPanel();
        crepp1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btndangxuat = new javax.swing.JPanel();
        crepp3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnmain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/turn-off.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        lbltieude.setFont(new java.awt.Font("Times New Roman", 3, 26)); // NOI18N
        lbltieude.setText("Bán hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(449, Short.MAX_VALUE)
                .addComponent(lbltieude, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbltieude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1010, 60));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tenNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tenNhanVien.setText("TÊN NHÂN VIÊN");
        jPanel4.add(lbl_tenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, 40));

        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-adidas-stan-smith-adidas-originals-three-stripes-adidas-5b3c6bce342844.1131818415306864142137 (1).png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 120));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 160));

        btnbanhang.setBackground(new java.awt.Color(204, 204, 204));
        btnbanhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbanhangMousePressed(evt);
            }
        });

        crep1.setBackground(new java.awt.Color(255, 255, 255));
        crep1.setMinimumSize(new java.awt.Dimension(0, 0));
        crep1.setOpaque(false);
        crep1.setPreferredSize(new java.awt.Dimension(3, 60));

        javax.swing.GroupLayout crep1Layout = new javax.swing.GroupLayout(crep1);
        crep1.setLayout(crep1Layout);
        crep1Layout.setHorizontalGroup(
            crep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        crep1Layout.setVerticalGroup(
            crep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Bán Hàng");

        javax.swing.GroupLayout btnbanhangLayout = new javax.swing.GroupLayout(btnbanhang);
        btnbanhang.setLayout(btnbanhangLayout);
        btnbanhangLayout.setHorizontalGroup(
            btnbanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnbanhangLayout.createSequentialGroup()
                .addComponent(crep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnbanhangLayout.setVerticalGroup(
            btnbanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(btnbanhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 60));

        btnsanpham.setBackground(new java.awt.Color(204, 204, 204));
        btnsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsanphamMousePressed(evt);
            }
        });

        crep2.setBackground(new java.awt.Color(255, 255, 255));
        crep2.setOpaque(false);
        crep2.setPreferredSize(new java.awt.Dimension(3, 60));

        javax.swing.GroupLayout crep2Layout = new javax.swing.GroupLayout(crep2);
        crep2.setLayout(crep2Layout);
        crep2Layout.setHorizontalGroup(
            crep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        crep2Layout.setVerticalGroup(
            crep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Sản Phẩm");

        javax.swing.GroupLayout btnsanphamLayout = new javax.swing.GroupLayout(btnsanpham);
        btnsanpham.setLayout(btnsanphamLayout);
        btnsanphamLayout.setHorizontalGroup(
            btnsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsanphamLayout.createSequentialGroup()
                .addComponent(crep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnsanphamLayout.setVerticalGroup(
            btnsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsanphamLayout.createSequentialGroup()
                .addGroup(btnsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crep2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(btnsanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 190, 60));

        btnkhuyenmai.setBackground(new java.awt.Color(204, 204, 204));
        btnkhuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnkhuyenmaiMousePressed(evt);
            }
        });

        crep3.setBackground(new java.awt.Color(255, 255, 255));
        crep3.setOpaque(false);
        crep3.setPreferredSize(new java.awt.Dimension(3, 60));

        javax.swing.GroupLayout crep3Layout = new javax.swing.GroupLayout(crep3);
        crep3.setLayout(crep3Layout);
        crep3Layout.setHorizontalGroup(
            crep3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        crep3Layout.setVerticalGroup(
            crep3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Khuyến Mãi");

        javax.swing.GroupLayout btnkhuyenmaiLayout = new javax.swing.GroupLayout(btnkhuyenmai);
        btnkhuyenmai.setLayout(btnkhuyenmaiLayout);
        btnkhuyenmaiLayout.setHorizontalGroup(
            btnkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnkhuyenmaiLayout.createSequentialGroup()
                .addComponent(crep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnkhuyenmaiLayout.setVerticalGroup(
            btnkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnkhuyenmaiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crep3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(btnkhuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, -1));

        btnkhachhang.setBackground(new java.awt.Color(204, 204, 204));
        btnkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnkhachhangMousePressed(evt);
            }
        });

        crep4.setBackground(new java.awt.Color(255, 255, 255));
        crep4.setMinimumSize(new java.awt.Dimension(100, 60));
        crep4.setOpaque(false);
        crep4.setPreferredSize(new java.awt.Dimension(3, 60));

        jPanel12.setMinimumSize(new java.awt.Dimension(100, 60));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout crep4Layout = new javax.swing.GroupLayout(crep4);
        crep4.setLayout(crep4Layout);
        crep4Layout.setHorizontalGroup(
            crep4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crep4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        crep4Layout.setVerticalGroup(
            crep4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crep4Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Khách Hàng");
        jLabel7.setRequestFocusEnabled(false);

        javax.swing.GroupLayout btnkhachhangLayout = new javax.swing.GroupLayout(btnkhachhang);
        btnkhachhang.setLayout(btnkhachhangLayout);
        btnkhachhangLayout.setHorizontalGroup(
            btnkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnkhachhangLayout.createSequentialGroup()
                .addComponent(crep4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        btnkhachhangLayout.setVerticalGroup(
            btnkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnkhachhangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crep4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(btnkhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, -1));

        btnnhanvien.setBackground(new java.awt.Color(204, 204, 204));
        btnnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnhanvienMousePressed(evt);
            }
        });

        crep5.setBackground(new java.awt.Color(255, 255, 255));
        crep5.setOpaque(false);
        crep5.setPreferredSize(new java.awt.Dimension(3, 60));

        javax.swing.GroupLayout crep5Layout = new javax.swing.GroupLayout(crep5);
        crep5.setLayout(crep5Layout);
        crep5Layout.setHorizontalGroup(
            crep5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        crep5Layout.setVerticalGroup(
            crep5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 128));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nhân Viên");

        javax.swing.GroupLayout btnnhanvienLayout = new javax.swing.GroupLayout(btnnhanvien);
        btnnhanvien.setLayout(btnnhanvienLayout);
        btnnhanvienLayout.setHorizontalGroup(
            btnnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnnhanvienLayout.createSequentialGroup()
                .addComponent(crep5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        btnnhanvienLayout.setVerticalGroup(
            btnnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnnhanvienLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crep5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(btnnhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 190, -1));

        btnhoadon.setBackground(new java.awt.Color(204, 204, 204));
        btnhoadon.setPreferredSize(new java.awt.Dimension(100, 60));
        btnhoadon.setRequestFocusEnabled(false);
        btnhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnhoadonMousePressed(evt);
            }
        });

        crepp2.setBackground(new java.awt.Color(255, 255, 255));
        crepp2.setOpaque(false);
        crepp2.setPreferredSize(new java.awt.Dimension(3, 60));

        javax.swing.GroupLayout crepp2Layout = new javax.swing.GroupLayout(crepp2);
        crepp2.setLayout(crepp2Layout);
        crepp2Layout.setHorizontalGroup(
            crepp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        crepp2Layout.setVerticalGroup(
            crepp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Hóa Đơn");

        javax.swing.GroupLayout btnhoadonLayout = new javax.swing.GroupLayout(btnhoadon);
        btnhoadon.setLayout(btnhoadonLayout);
        btnhoadonLayout.setHorizontalGroup(
            btnhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnhoadonLayout.createSequentialGroup()
                .addComponent(crepp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        btnhoadonLayout.setVerticalGroup(
            btnhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnhoadonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crepp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(btnhoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 190, -1));

        btnthongke.setBackground(new java.awt.Color(204, 204, 204));
        btnthongke.setForeground(new java.awt.Color(204, 255, 255));
        btnthongke.setPreferredSize(new java.awt.Dimension(210, 60));
        btnthongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnthongkeMousePressed(evt);
            }
        });
        btnthongke.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crepp1.setBackground(new java.awt.Color(255, 255, 255));
        crepp1.setOpaque(false);
        crepp1.setPreferredSize(new java.awt.Dimension(3, 60));
        crepp1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout crepp1Layout = new javax.swing.GroupLayout(crepp1);
        crepp1.setLayout(crepp1Layout);
        crepp1Layout.setHorizontalGroup(
            crepp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        crepp1Layout.setVerticalGroup(
            crepp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnthongke.add(crepp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Thống Kê");
        btnthongke.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 140, 60));

        jPanel2.add(btnthongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 190, 60));

        btndangxuat.setBackground(new java.awt.Color(204, 204, 204));
        btndangxuat.setPreferredSize(new java.awt.Dimension(100, 60));
        btndangxuat.setRequestFocusEnabled(false);
        btndangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btndangxuatMousePressed(evt);
            }
        });

        crepp3.setBackground(new java.awt.Color(255, 255, 255));
        crepp3.setOpaque(false);
        crepp3.setPreferredSize(new java.awt.Dimension(3, 60));

        javax.swing.GroupLayout crepp3Layout = new javax.swing.GroupLayout(crepp3);
        crepp3.setLayout(crepp3Layout);
        crepp3Layout.setHorizontalGroup(
            crepp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        crepp3Layout.setVerticalGroup(
            crepp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout (1).png"))); // NOI18N
        jLabel11.setText("Đăng xuất");

        javax.swing.GroupLayout btndangxuatLayout = new javax.swing.GroupLayout(btndangxuat);
        btndangxuat.setLayout(btndangxuatLayout);
        btndangxuatLayout.setHorizontalGroup(
            btndangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btndangxuatLayout.createSequentialGroup()
                .addComponent(crepp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btndangxuatLayout.setVerticalGroup(
            btndangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btndangxuatLayout.createSequentialGroup()
                .addGroup(btndangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crepp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel2.add(btndangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 190, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 670));

        pnmain.setBackground(new java.awt.Color(255, 255, 255));
        pnmain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 1010, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
 
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
  
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnbanhangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbanhangMousePressed

    }//GEN-LAST:event_btnbanhangMousePressed

    private void btnsanphamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsanphamMousePressed

    }//GEN-LAST:event_btnsanphamMousePressed

    private void btnkhuyenmaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkhuyenmaiMousePressed

      

    }//GEN-LAST:event_btnkhuyenmaiMousePressed

    private void btnkhachhangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkhachhangMousePressed
   
    }//GEN-LAST:event_btnkhachhangMousePressed

    private void btnnhanvienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnhanvienMousePressed
  
    }//GEN-LAST:event_btnnhanvienMousePressed

    private void btnhoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhoadonMousePressed
    
    }//GEN-LAST:event_btnhoadonMousePressed

    private void btnthongkeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthongkeMousePressed


    }//GEN-LAST:event_btnthongkeMousePressed

    private void btndangxuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndangxuatMousePressed
      

    }//GEN-LAST:event_btndangxuatMousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new dashboard().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnbanhang;
    private javax.swing.JPanel btndangxuat;
    private javax.swing.JPanel btnhoadon;
    private javax.swing.JPanel btnkhachhang;
    private javax.swing.JPanel btnkhuyenmai;
    private javax.swing.JPanel btnnhanvien;
    private javax.swing.JPanel btnsanpham;
    private javax.swing.JPanel btnthongke;
    private javax.swing.JPanel crep1;
    private javax.swing.JPanel crep2;
    private javax.swing.JPanel crep3;
    private javax.swing.JPanel crep4;
    private javax.swing.JPanel crep5;
    private javax.swing.JPanel crepp1;
    private javax.swing.JPanel crepp2;
    private javax.swing.JPanel crepp3;
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
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_tenNhanVien;
    private javax.swing.JLabel lbltieude;
    private javax.swing.JPanel pnmain;
    // End of variables declaration//GEN-END:variables
}
