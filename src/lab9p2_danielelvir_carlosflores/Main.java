package lab9p2_danielelvir_carlosflores;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pb_bar = new javax.swing.JProgressBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_orderid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_shipmode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_productname = new javax.swing.JTextField();
        tf_productid = new javax.swing.JTextField();
        tf_segment = new javax.swing.JTextField();
        tf_state = new javax.swing.JTextField();
        tf_sales = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_customerid = new javax.swing.JTextField();
        tf_country = new javax.swing.JTextField();
        tf_category = new javax.swing.JTextField();
        tf_orderdate = new javax.swing.JTextField();
        tf_postalcode = new javax.swing.JTextField();
        tf_quantity = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_shipdate = new javax.swing.JTextField();
        tf_city = new javax.swing.JTextField();
        tf_region = new javax.swing.JTextField();
        tf_customername = new javax.swing.JTextField();
        tf_subcategory = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf_discount = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_profit = new javax.swing.JTextField();
        btn_addregistro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_details = new javax.swing.JButton();
        btn_customers = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_orders = new javax.swing.JButton();
        btn_products = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_table = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_elim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pb_bar.setStringPainted(true);

        jLabel1.setText("Order ID: ");

        jLabel2.setText("Ship mode:");

        jLabel3.setText("Segment:");

        jLabel4.setText("State:");

        jLabel5.setText("Product Name:");

        jLabel6.setText("Product ID: ");

        jLabel7.setText("Sales:");

        jLabel8.setText("Order Date: ");

        jLabel9.setText("Customer ID: ");

        jLabel10.setText("Country:");

        jLabel11.setText("Category:");

        jLabel12.setText("Postal Code:");

        jLabel13.setText("Quantity:");

        jLabel14.setText("City:");

        jLabel15.setText("Ship Date:");

        jLabel16.setText("Region:");

        jLabel17.setText("Sub-category");

        jLabel18.setText("Customer Name:");

        tf_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_regionActionPerformed(evt);
            }
        });

        tf_customername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_customernameActionPerformed(evt);
            }
        });

        tf_subcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_subcategoryActionPerformed(evt);
            }
        });

        jLabel19.setText("Discount:");

        jLabel20.setText("Profit:");

        btn_addregistro.setText("Agregar Registro");
        btn_addregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addregistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(46, 46, 46)
                                .addComponent(tf_state))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(tf_segment))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_shipmode))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(tf_orderid, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_productid)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_category, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_orderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_country, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(23, 23, 23)
                                .addComponent(tf_postalcode, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_shipdate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_customername, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_region, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(43, 43, 43)
                            .addComponent(tf_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_profit, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(tf_productname, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_addregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(974, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(321, 321, 321)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_orderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tf_orderdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shipdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_shipmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(tf_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tf_customername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tf_segment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(tf_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tf_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(tf_postalcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(tf_region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(tf_productid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(tf_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(tf_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(tf_profit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17))
                .addGap(45, 45, 45)
                .addComponent(btn_addregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel15)
                    .addContainerGap(432, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Agregar Registro", jPanel3);

        btn_details.setText("Details");
        btn_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_detailsMouseClicked(evt);
            }
        });

        btn_customers.setText("Customers");
        btn_customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_customersMouseClicked(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearMouseClicked(evt);
            }
        });

        btn_orders.setText("Orders");
        btn_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ordersMouseClicked(evt);
            }
        });
        btn_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordersActionPerformed(evt);
            }
        });

        btn_products.setText("Products");
        btn_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productsMouseClicked(evt);
            }
        });

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_details, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_customers, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_products, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 531, Short.MAX_VALUE)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_details, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_customers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_products, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar Registro", jPanel4);

        jt_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Order ID", "Oder Date", "Ship Date", "Ship Mode", "Customer ID", "Customer Name", "Segment", "Country", "City", "State", "Postal Code", "Region", "Product ID", "Sub-Category", "Product Name", "Sales", "Quantity", "Discount", "Profit"
            }
        ));
        jScrollPane2.setViewportView(jt_table);

        btn_update.setText("Update Tabla");
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateMouseClicked(evt);
            }
        });
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_elim.setText("Eliminar Registro");
        btn_elim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_elimMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1029, Short.MAX_VALUE)
                        .addComponent(btn_elim, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_elim, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Registro", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addComponent(pb_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pb_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
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

    private void tf_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_regionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_regionActionPerformed

    private void tf_customernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_customernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_customernameActionPerformed

    private void tf_subcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_subcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_subcategoryActionPerformed

    private void btn_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ordersActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_addregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addregistroMouseClicked
        //agregar
        int avanz = 6;
        pb_bar.setMaximum(avanz);
        ProgressBars xd = new ProgressBars(1000, avanz, pb_bar, Color.yellow);

        Thread run = new Thread(xd);
        run.start();

        Dba db = new Dba("./BaseDeDatosLab9P2.accdb");
        db.conectar();
        try {
            String oid = tf_orderid.getText();
            String shipMode = tf_shipmode.getText();
            String segment = tf_segment.getText();
            String state = tf_state.getText();
            String pdID = tf_productid.getText();
            String pName = tf_productname.getText();
            String sales = tf_sales.getText();
            String orderdate = tf_orderdate.getText();
            String customerid = tf_customerid.getText();
            String country = tf_country.getText();
            String pCode = tf_postalcode.getText();
            String category = tf_category.getText();
            String quantity = tf_quantity.getText();
            String shipDate = tf_shipdate.getText();
            String customerName = tf_customername.getText();
            String city = tf_city.getText();
            String region = tf_region.getText();
            String subCategory = tf_subcategory.getText();
            String discount = tf_discount.getText();
            String profit = tf_profit.getText();

            db.query.execute("INSERT INTO TenRecord"
                    + "([Order ID], [Order Date], [Ship Date], [Customer ID], "
                    + "[Customer Name], Segment, Country, City, State, [Postal Code], "
                    + "Region, [Product ID], Category, [Sub-Category], [Product Name], "
                    + "Sales, Quantity, Discount, Profit)"
                    + " VALUES ('" + oid + "', '" + orderdate + "', '" + shipDate + "', '" + customerid + "', '" + customerName + "','" + segment + "','" + country + "','" + city + "','" + state + "','" + pCode + "','" + region + "','" + pdID + "','" + category + "','" + subCategory + "','" + pName + "','" + sales + "','" + quantity + "','" + discount + "','" + profit + "')");

            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
        db.desconectar();

        //agregar
        /*Dba db = new Dba("./base1.mdb");
        db.conectar();
        try {
            int c;
            String n;
            c = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
            n = JOptionPane.showInputDialog("Nombre");
            db.query.execute("INSERT INTO alumnos"
                    + " (cuenta,nombre)"
                    + " VALUES ('" + c + "', '" + n + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();*/
    }//GEN-LAST:event_btn_addregistroMouseClicked

    private void btn_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ordersMouseClicked

        Dba db = new Dba("./BaseDeDatosLab9P2.accdb");
        db.conectar();
        try {
            db.query.execute("SELECT a.[Order ID], a.[Order Date], a.[Ship Date], a.[Ship Mode], a.[Customer ID] "
                    + "FROM TenRecord a");
            textarea.setText("");

            ResultSet rs = db.query.getResultSet();

            String generado = "";

            int numCust = 1;
            while (rs.next()) {
                generado += "Order: " + numCust + "\n";
                generado += "Order ID: " + rs.getString(1) + "\n";
                generado += "Order Date: " + rs.getString(2) + "\n";
                generado += "Ship Date: " + rs.getString(3) + "\n";
                generado += "Ship Mode: " + rs.getString(4) + "\n";
                generado += "Customer ID: " + rs.getString(5) + "\n";
                generado += "\n";
                numCust++;
            }
            

            int avanz = 4;
            pb_bar.setMaximum(avanz);
            ProgressBars xd = new ProgressBars(1000, avanz, pb_bar, generado, textarea, Color.green);

            Thread run = new Thread(xd);
            run.start();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
        db.desconectar();

    }//GEN-LAST:event_btn_ordersMouseClicked

    private void btn_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detailsMouseClicked
        Dba db = new Dba("./BaseDeDatosLab9P2.accdb");
        db.conectar();
        try {
            db.query.execute("SELECT a.[Order ID], a.[Product ID], a.Sales, a.Quantity, a.Discount, a.Profit "
                    + "FROM TenRecord a");
            ResultSet rs = db.query.getResultSet();
            textarea.setText("");
            String generado = "";
            int numCust = 1;
            while (rs.next()) {
                generado += "Detail: " + numCust + "\n";
                generado += "Order ID: " + rs.getString(1) + "\n";
                generado += "Product ID: " + rs.getString(2) + "\n";
                generado += "Sales: " + rs.getString(3) + "\n";
                generado += "Quantity: " + rs.getString(4) + "\n";
                generado += "Discount: " + rs.getString(5) + "\n";
                generado += "Profit: " + rs.getString(6) + "\n";
                generado += "\n";
                numCust++;
            }
            //textarea.setText(generado);
            
            int avanz = 5;
            pb_bar.setMaximum(avanz);
            ProgressBars xd = new ProgressBars(1000, avanz, pb_bar, generado, textarea, Color.orange);

            Thread run = new Thread(xd);
            run.start();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
        db.desconectar();
    }//GEN-LAST:event_btn_detailsMouseClicked

    private void btn_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customersMouseClicked
        Dba db = new Dba("./BaseDeDatosLab9P2.accdb");
        db.conectar();
        try {
            db.query.execute("SELECT a.[Customer ID], a.[Customer Name], a.Segment, a.Country, a.City, a.State, a.[Postal Code], a.Region "
                    + "FROM TenRecord a");
            ResultSet rs = db.query.getResultSet();
            textarea.setText("");
            String generado = "";
            int numCust = 1;
            while (rs.next()) {
                generado += "Customer: " + numCust + "\n";
                generado += "Customer ID: " + rs.getString(1) + "\n";
                generado += "Customer Name: " + rs.getString(2) + "\n";
                generado += "Segment: " + rs.getString(3) + "\n";
                generado += "Country: " + rs.getString(4) + "\n";
                generado += "City: " + rs.getString(5) + "\n";
                generado += "State: " + rs.getString(6) + "\n";
                generado += "Postal Code: " + rs.getString(7) + "\n";
                generado += "Region: " + rs.getString(8) + "\n";
                generado += "\n";
                numCust++;
            }
            //textarea.setText(generado);
            int avanz = 6;
            pb_bar.setMaximum(avanz);
            ProgressBars xd = new ProgressBars(1000, avanz, pb_bar, generado, textarea, Color.red);

            Thread run = new Thread(xd);
            run.start();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
        db.desconectar();
    }//GEN-LAST:event_btn_customersMouseClicked

    private void btn_productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productsMouseClicked
        Dba db = new Dba("./BaseDeDatosLab9P2.accdb");
        db.conectar();
        try {
            db.query.execute("SELECT a.[Product ID], a.Category, a.[Sub-Category], a.[Product Name] "
                    + "FROM TenRecord a");
            ResultSet rs = db.query.getResultSet();
            textarea.setText("");
            String generado = "";
            int numCust = 1;
            while (rs.next()) {
                generado += "Product: " + numCust + "\n";
                generado += "Product ID: " + rs.getString(1) + "\n";
                generado += "Category: " + rs.getString(2) + "\n";
                generado += "Sub-Category: " + rs.getString(3) + "\n";
                generado += "Product Name: " + rs.getString(4) + "\n";
                generado += "\n";
                numCust++;
            }
            //textarea.setText(generado);
            
            int avanz = 3;
            pb_bar.setMaximum(avanz);
            ProgressBars xd = new ProgressBars(1000, avanz, pb_bar, generado, textarea, Color.blue);

            Thread run = new Thread(xd);
            run.start();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
        db.desconectar();
    }//GEN-LAST:event_btn_productsMouseClicked

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        textarea.setText("");
    }//GEN-LAST:event_btn_clearMouseClicked

    private void btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseClicked

        DefaultTableModel m = (DefaultTableModel) jt_table.getModel();

        m.setRowCount(0);

        Dba db = new Dba("./BaseDeDatosLab9P2.accdb");
        db.conectar();

        try {
            db.query.execute("SELECT a.ID, a.[Order ID], a. [Order Date], a.[Ship Date], a.[Ship Mode], a.[Customer ID], a.[Customer Name], a.Segment, a.Country, a.City, a.State, a.[Postal Code], a.Region, a.[Product ID], a.Category, a.[Sub-Category], a.[Product Name], a.[Product Name] a.Sales, a.Quantity, a.Discount, a.Profit "
                    + "FROM TenRecord a");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {

                Object[] row = {rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13), 
                    rs.getString(14),
                    rs.getString(15),
                    rs.getString(16),
                    rs.getString(17),
                    rs.getString(18),
                    rs.getString(19),
                    rs.getString(20)};

                m.addRow(row);

                jt_table.setModel(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
        db.desconectar();
    }//GEN-LAST:event_btn_updateMouseClicked

    private void btn_elimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_elimMouseClicked
        try {

            int avanz = 5;
            pb_bar.setMaximum(avanz);
            ProgressBars xd = new ProgressBars(1000, avanz, pb_bar, new Color(160, 11, 246));

            Thread run = new Thread(xd);
            run.start();

            //run.join();
            Dba db = new Dba("./BaseDeDatosLab9P2.accdb");
            db.conectar();

            try {

                db.query.execute("delete from TenRecord where id = " + (jt_table.getValueAt(jt_table.getSelectedRow(), 0)));
                db.commit();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            db.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
            e.printStackTrace();

        }
    }//GEN-LAST:event_btn_elimMouseClicked

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton btn_addregistro;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_customers;
    private javax.swing.JButton btn_details;
    private javax.swing.JButton btn_elim;
    private javax.swing.JButton btn_orders;
    private javax.swing.JButton btn_products;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jt_table;
    private javax.swing.JProgressBar pb_bar;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField tf_category;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_country;
    private javax.swing.JTextField tf_customerid;
    private javax.swing.JTextField tf_customername;
    private javax.swing.JTextField tf_discount;
    private javax.swing.JTextField tf_orderdate;
    private javax.swing.JTextField tf_orderid;
    private javax.swing.JTextField tf_postalcode;
    private javax.swing.JTextField tf_productid;
    private javax.swing.JTextField tf_productname;
    private javax.swing.JTextField tf_profit;
    private javax.swing.JTextField tf_quantity;
    private javax.swing.JTextField tf_region;
    private javax.swing.JTextField tf_sales;
    private javax.swing.JTextField tf_segment;
    private javax.swing.JTextField tf_shipdate;
    private javax.swing.JTextField tf_shipmode;
    private javax.swing.JTextField tf_state;
    private javax.swing.JTextField tf_subcategory;
    // End of variables declaration//GEN-END:variables
}
