package View;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Vector;
import java.util.ResourceBundle.Control;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Controller.CustomerController;
import Model.Customer;
import Model.ListOfCustomer;

public class Details extends JFrame {
        private ListOfCustomer list;

        /**
         * Creates new form Details
         * 
         */
        public Details(ListOfCustomer list) {
                initComponents();
                this.list = list;
                addDataIntoTable(list);
                // Set size for JFrame
                setDefaultCloseOperation(EXIT_ON_CLOSE);

        }

        // Create Method to call this from another Panel/Class
        public JPanel getDetailView() {
                return PanelDetails;
        }

        // create Method to get CustomerTable
        public JTable getCusJTable() {
                return CustomerTable;
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPanel5 = new javax.swing.JPanel();
                Home1 = new javax.swing.JButton();
                Home2 = new javax.swing.JButton();
                Home3 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                PanelDetails = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                CustomerTable = new javax.swing.JTable();
                jPanel6 = new javax.swing.JPanel();
                SearchField = new javax.swing.JTextField();
                AddNewCustomerButton = new javax.swing.JButton();
                DeteleButton = new javax.swing.JButton();
                EditButton = new javax.swing.JButton();
                ViewTranSacTionButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

                jPanel2.setBackground(new java.awt.Color(10, 10, 10));
                jPanel2.setMaximumSize(new java.awt.Dimension(300, 32767));
                jPanel2.setMinimumSize(new java.awt.Dimension(50, 100));
                jPanel2.setPreferredSize(new java.awt.Dimension(200, 100));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/flo.png"))); // NOI18N
                jLabel1.setAlignmentY(0.0F);

                jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Admin");

                jPanel5.setBackground(new java.awt.Color(10, 10, 10));

                Home1.setBackground(new java.awt.Color(10, 10, 10));
                Home1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
                Home1.setForeground(new java.awt.Color(255, 255, 255));
                Home1.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/Resources/Icons/icons8_home_30px.png"))); // NOI18N
                Home1.setText("Home");
                Home1.setAlignmentY(0.0F);
                Home1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
                Home1.setBorderPainted(false);
                Home1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                Home1.setFocusable(false);
                Home1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                Home1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
                Home1.setIconTextGap(10);
                Home1.setMargin(new java.awt.Insets(0, 0, 0, 0));
                Home1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                Home1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Home1ActionPerformed(evt);
                        }
                });

                Home2.setBackground(new java.awt.Color(10, 10, 10));
                Home2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
                Home2.setForeground(new java.awt.Color(255, 255, 255));
                Home2.setIcon(
                                new javax.swing.ImageIcon(getClass()
                                                .getResource("/Resources/Icons/icons8_table_of_content_30px.png"))); // NOI18N
                Home2.setText("Customer Details");
                Home2.setAlignmentY(0.0F);
                Home2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
                Home2.setBorderPainted(false);
                Home2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                Home2.setFocusable(false);
                Home2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
                Home2.setIconTextGap(10);
                Home2.setMargin(new java.awt.Insets(0, 0, 0, 0));
                Home2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                Home2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Home2ActionPerformed(evt);
                        }
                });

                Home3.setBackground(new java.awt.Color(10, 10, 10));
                Home3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
                Home3.setForeground(new java.awt.Color(255, 255, 255));
                Home3.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/Resources/Icons/icons8_logout_rounded_left_30px.png"))); // NOI18N
                Home3.setText("Quit");
                Home3.setAlignmentY(0.0F);
                Home3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
                Home3.setBorderPainted(false);
                Home3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                Home3.setFocusable(false);
                Home3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                Home3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
                Home3.setIconTextGap(10);
                Home3.setMargin(new java.awt.Insets(0, 0, 0, 0));
                Home3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                Home3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Home3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Home2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(Home1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(Home3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(Home1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Home2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Home3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(67, Short.MAX_VALUE)));

                jLabel4.setBackground(new java.awt.Color(10, 10, 10));
                jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("@HoangTran");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                false)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(45, 45, 45)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                89,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel3)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel2Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel2)
                                                                                                                                                .addGap(22, 22, 22)))))
                                                                .addContainerGap(66, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                87,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                29,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                16,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(47, 47, 47)
                                                                .addComponent(jPanel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(474, Short.MAX_VALUE)));

                jPanel1.add(jPanel2);

                PanelDetails.setBackground(new java.awt.Color(30, 30, 30));
                PanelDetails.setName(""); // NOI18N
                PanelDetails.setPreferredSize(new java.awt.Dimension(900, 900));

                jPanel4.setBackground(new java.awt.Color(30, 30, 30));
                jPanel4.setMaximumSize(new java.awt.Dimension(2147483647, 5224242));
                jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));
                jPanel4.setPreferredSize(new java.awt.Dimension(900, 900));

                jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/Resources/Icons/icons8_bank_60px.png"))); // NOI18N
                jLabel5.setText("Banking Management Application");
                jLabel5.setAlignmentY(0.0F);
                jLabel5.setFocusable(false);
                jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
                jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

                CustomerTable.setAutoCreateRowSorter(true);
                CustomerTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Customer ID", "Name", "Phone Number", "Account Number",
                                                "Account Balance", "Gender",
                                                "Year Born", "Password"
                                }));
                CustomerTable.setRowHeight(30);
                CustomerTable.setShowGrid(false);
                CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                CustomerTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(CustomerTable);
                if (CustomerTable.getColumnModel().getColumnCount() > 0) {
                        CustomerTable.getColumnModel().getColumn(1).setResizable(false);
                }

                jPanel6.setBackground(new java.awt.Color(30, 30, 30));
                jPanel6.setPreferredSize(new java.awt.Dimension(0, 0));

                SearchField.addInputMethodListener(new java.awt.event.InputMethodListener() {
                        public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                        }

                        public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                                SearchFieldInputMethodTextChanged(evt);
                        }
                });
                SearchField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SearchFieldActionPerformed(evt);
                        }
                });
                SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                SearchFieldKeyReleased(evt);
                        }
                });

                AddNewCustomerButton.setBackground(new java.awt.Color(30, 30, 30));
                AddNewCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                AddNewCustomerButton.setForeground(new java.awt.Color(255, 255, 255));
                AddNewCustomerButton
                                .setIcon(new javax.swing.ImageIcon(
                                                getClass().getResource("/Resources/Icons/icons8_add_25px.png"))); // NOI18N
                AddNewCustomerButton.setText("Add");
                AddNewCustomerButton.setBorder(null);
                AddNewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                AddButtonAction(evt);
                        }
                });

                DeteleButton.setBackground(new java.awt.Color(30, 30, 30));
                DeteleButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                DeteleButton.setForeground(new java.awt.Color(255, 255, 255));
                DeteleButton.setIcon(
                                new javax.swing.ImageIcon(getClass()
                                                .getResource("/Resources/Icons/icons8_delete_list_32px.png"))); // NOI18N
                DeteleButton.setText("Delete");
                DeteleButton.setBorder(null);
                DeteleButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DeteleButtonActionPerformed(evt);
                        }
                });

                EditButton.setBackground(new java.awt.Color(30, 30, 30));
                EditButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                EditButton.setForeground(new java.awt.Color(255, 255, 255));
                EditButton.setIcon(
                                new javax.swing.ImageIcon(getClass()
                                                .getResource("/Resources/Icons/icons8_edit_property_32px_1.png"))); // NOI18N
                EditButton.setText("Edit");
                EditButton.setBorder(null);
                EditButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                EditButtonActionPerformed(evt);
                        }
                });

                ViewTranSacTionButton.setBackground(new java.awt.Color(30, 30, 30));
                ViewTranSacTionButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                ViewTranSacTionButton.setForeground(new java.awt.Color(255, 255, 255));
                ViewTranSacTionButton
                                .setIcon(new javax.swing.ImageIcon(
                                                getClass().getResource("/Resources/Icons/icons8_view_30px.png"))); // NOI18N
                ViewTranSacTionButton.setText("View Transactions");
                ViewTranSacTionButton.setBorder(null);
                ViewTranSacTionButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ViewTranSacTionButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(SearchField)
                                                                                .addGroup(jPanel6Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(ViewTranSacTionButton)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(DeteleButton)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(EditButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                110,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(AddNewCustomerButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                101,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 2, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout
                                                                .createSequentialGroup()
                                                                .addComponent(SearchField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel6Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(DeteleButton,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                43,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(ViewTranSacTionButton,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                43,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel6Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(AddNewCustomerButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                43,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(EditButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                43,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)));

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                1151, Short.MAX_VALUE)
                                                                .addContainerGap())
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                512,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                480,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                100,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel4Layout.createSequentialGroup()
                                                                                                                .addGap(12, 12, 12)
                                                                                                                .addComponent(jPanel6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                88,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(47, 47, 47)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                647,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(100, Short.MAX_VALUE)));

                javax.swing.GroupLayout PanelDetailsLayout = new javax.swing.GroupLayout(PanelDetails);
                PanelDetails.setLayout(PanelDetailsLayout);
                PanelDetailsLayout.setHorizontalGroup(
                                PanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(PanelDetailsLayout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                1163, Short.MAX_VALUE)
                                                                .addContainerGap()));
                PanelDetailsLayout.setVerticalGroup(
                                PanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetailsLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(43, Short.MAX_VALUE)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                jPanel1.add(PanelDetails);

                getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        }// </editor-fold>//GEN-END:initComponents

        private void ViewTranSacTionButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ViewTranSacTionButtonActionPerformed
                DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
                if (CustomerTable.getSelectedRowCount() == 1) {
                        int CusID = Integer.parseInt(model.getValueAt(CustomerTable.getSelectedRow(), 0).toString());
                        CustomerController controller = new CustomerController();
                        controller.ReadFile(list);
                        if (controller.LocatedID(CusID, list) != -1) {
                                int index = controller.LocatedID(CusID, list);
                                TransactionTable tran = new TransactionTable();
                                tran.setLocationRelativeTo(null);

                                tran.setVisible(true);
                                // set location in center screen
                                tran.insertDateIntoJtable(list, index);

                        } else {
                                JOptionPane.showMessageDialog(this, "Error! can find that customer in Storage");

                        }
                } else

                {
                        JOptionPane.showMessageDialog(this, "Please choose a customer to view their transactions");

                }
        }// GEN-LAST:event_ViewTranSacTionButtonActionPerformed

        private void SearchFieldKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_SearchFieldKeyReleased

                String search = SearchField.getText();
                search(search);
        }// GEN-LAST:event_SearchFieldKeyReleased
         // METHOD SEARCH

        public void search(String search) {
                DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
                TableRowSorter<DefaultTableModel> tableSort = new TableRowSorter<DefaultTableModel>(model);
                CustomerTable.setRowSorter(tableSort);
                tableSort.setRowFilter(RowFilter.regexFilter(search));
        }

        private void SearchFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {// GEN-FIRST:event_SearchFieldInputMethodTextChanged
        }// GEN-LAST:event_SearchFieldInputMethodTextChanged

        public void UpdateDataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UpdateDataActionPerformed
                DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();

                do {
                        model.removeRow(0);
                } while (model.getRowCount() != 0);
                CustomerController controller = new CustomerController();
                controller.ReadFile(list);
                addDataIntoTable(list);
        }// GEN-LAST:event_UpdateDataActionPerformed

        private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EditButtonActionPerformed

                if (CustomerTable.getSelectedRowCount() == 1) {
                        EditForm edit = new EditForm(CustomerTable);
                        Customer cus = CustomerTableMouseClicked(null);
                        System.out.println(cus);
                        edit.FillForm(cus);
                        edit.setVisible(true);

                } else {
                        JOptionPane.showMessageDialog(this, "Please Select a single row to edit!");

                }

        }// GEN-LAST:event_EditButtonActionPerformed
         // Get information from row selected

        public void addDataIntoTable(ListOfCustomer list) {

                DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
                if (list.getLength() >= 0) {
                        for (int i = 0; i < list.getLength(); i++) {
                                Object[] cus = new Object[] {
                                                list.getListCusi(i).getCusID(),
                                                list.getListCusi(i).getName(),
                                                list.getListCusi(i).getPhoneNum(),
                                                list.getListCusi(i).getAccountNum(),
                                                list.getListCusi(i).getAccountBalance(),
                                                list.getListCusi(i).isGender(),
                                                list.getListCusi(i).getYearBorn(),
                                                list.getListCusi(i).getPassword()
                                };
                                model.addRow(cus);
                        }

                }

        }

        public Customer CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_CustomerTableMouseClicked
                // Get information of row when we selected
                DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
                EditForm edit = new EditForm(CustomerTable);
                int cusID = Integer.parseInt(model.getValueAt(CustomerTable.getSelectedRow(), 0).toString());
                String name = model.getValueAt(CustomerTable.getSelectedRow(), 1).toString();
                String phoneNum = model.getValueAt(CustomerTable.getSelectedRow(), 2).toString();
                String accountNum = model.getValueAt(CustomerTable.getSelectedRow(), 3).toString();
                Double AccountBalance = Double
                                .parseDouble(model.getValueAt(CustomerTable.getSelectedRow(), 4).toString());
                boolean gender;
                if ((model.getValueAt(CustomerTable.getSelectedRow(), 5)).equals("Male")) {
                        gender = true;
                } else {
                        gender = false;
                }
                int yearBorn = Integer.parseInt(model.getValueAt(CustomerTable.getSelectedRow(), 6).toString());
                String password = model.getValueAt(CustomerTable.getSelectedRow(), 7).toString();

                Customer c = new Customer(name, phoneNum, accountNum, AccountBalance, gender, password,
                                yearBorn, list);
                c.setCusID(cusID);
                return c;
                //
        }// GEN-LAST:event_CustomerTableMouseClicked

        private void DeteleButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DeteleButtonActionPerformed
                DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
                if (CustomerTable.getSelectedRowCount() == 1) {
                        int CusID = Integer.parseInt(model.getValueAt(CustomerTable.getSelectedRow(), 0).toString());
                        // Detele Row Display
                        model.removeRow(CustomerTable.getSelectedRow());
                        // Delete in file
                        CustomerController controller = new CustomerController();
                        controller.Delete(CusID);
                        JOptionPane.showMessageDialog(this, "Delete Successful");

                } else

                {
                        JOptionPane.showMessageDialog(this, "Please Select a single row to delete!");

                }

        }// GEN-LAST:event_DeteleButtonActionPerformed

        private void AddButtonAction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
                CustomerController controller = new CustomerController();
                controller.CheckFileExist();
                CreateForm cf = new CreateForm(list, CustomerTable);
                cf.setVisible(true);

        }// GEN-LAST:event_jButton4ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton3ActionPerformed

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jTextField2ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        }// GEN-LAST:event_jButton1ActionPerformed

        private void CusDetailsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CusDetailsActionPerformed
        }// GEN-LAST:event_CusDetailsActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                System.exit(0);
        }// GEN-LAST:event_jButton2ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton AddNewCustomerButton;
        public javax.swing.JTable CustomerTable;
        private javax.swing.JButton DeteleButton;
        private javax.swing.JButton EditButton;
        private javax.swing.JButton Home1;
        private javax.swing.JButton Home2;
        private javax.swing.JButton Home3;
        private javax.swing.JPanel PanelDetails;
        private javax.swing.JTextField SearchField;
        private javax.swing.JButton ViewTranSacTionButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JScrollPane jScrollPane1;
        // End of variables declaration//GEN-END:variables

}
