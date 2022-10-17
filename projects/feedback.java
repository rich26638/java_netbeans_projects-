/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
//import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ish rich
 */
public final class feedback extends javax.swing.JFrame {

    /**
     * Creates new form feedback
     */
    public feedback() {
        initComponents();
        update_table();
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
        fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        buttonsend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel1.setText("Feed Back");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel2.setText("First name:");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel3.setText("Last name:");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel4.setText("Email:");

        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel5.setText("Gender:");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "First name", "Last name", "     Email", "    Gender", "      Comment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(25);
            table.getColumnModel().getColumn(4).setPreferredWidth(60);
            table.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        button.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 12)); // NOI18N
        button.setText("SUBMIT");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel6.setText("Comment:");

        buttonsend.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 12)); // NOI18N
        buttonsend.setText("DISPLAY RESULT");
        buttonsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fn)
                                                .addComponent(ln)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(email1)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(button)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonsend)
                                .addGap(126, 126, 126)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button)
                    .addComponent(buttonsend)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void update_table(){
    
       Connection con;
        PreparedStatement insert;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/lab","root","");
            insert = con.prepareStatement("select * from lab");
             ResultSet update = insert.executeQuery();
             ResultSetMetaData update1 = update.getMetaData();
             int variable = update1.getColumnCount();
             DefaultTableModel model = (DefaultTableModel)table.getModel();
             model.setRowCount(0);
             while(update.next()){
                 Vector vct = new Vector();
                 for(int i =1; i <= variable; i++){
                     vct.add(update.getString("id"));
                     vct.add(update.getString("firstname"));
                     vct.add(update.getString("lastname"));
                     vct.add(update.getString("email"));
                     vct.add(update.getString("gender"));
                     vct.add(update.getString("comment"));
                 }
                 model.addRow(vct);
             }
        } catch (SQLException ex) {
            Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        //button.setEnabled(false);
        checkemail check = new checkemail();
        String first_name = fn.getText();
        String last_name = ln.getText();
        String email = email1.getText();
        boolean emailcheck = checkemail.isValid(email);
        String gender = combo.getSelectedItem().toString();
        String coment = area.getText();
        int count = coment.length();
        if(first_name.isEmpty() || last_name.isEmpty() || email.isEmpty() || coment.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"The form is incomplete");       
        }
        else if(count <=10){
            JOptionPane.showMessageDialog(rootPane, "The comment must range between 50 and 100 characters");
        }
        else if(false == emailcheck){
            JOptionPane.showMessageDialog(rootPane, "The provided email is incorect");
        }
        else
        {
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con;
            PreparedStatement insert;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/lab","root","");
                insert = con.prepareStatement("insert into lab (firstname,lastname,email,gender,comment) values(?,?,?,?,?)");
                insert.setString(1, first_name);
                insert.setString(2, last_name);
                insert.setString(3, email);
                insert.setString(4, gender);
                insert.setString(5, coment);
                insert.executeUpdate();
               // JOptionPane.showMessageDialog(rootPane, "updated succesful");
                update_table();
                
                this.setVisible(false);
                
            } catch (SQLException ex) {
                Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_buttonActionPerformed

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void buttonsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsendActionPerformed
        // TODO add your handling code here:
        TableModel table1 = table.getModel();
        int indexs[];
        indexs = table.getSelectedRows();
        Object[] row = new Object[6];
        ResultPage results = new ResultPage();
//        Object put = table1.getValueAt(indexs[3], 2);
//        results.label.setText(put.toString());
//        results.setVisible(true);
        DefaultTableModel mode12 = (DefaultTableModel)results.table.getModel();
        //results.label.setText(table1.getValueAt(indexs[0], 0));
        for(int i = 0; i < indexs.length; i++){
            row[0] = table1.getValueAt(indexs[i], 0);
            row[1] = table1.getValueAt(indexs[i], 1);
            row[2] = table1.getValueAt(indexs[i], 2);
            row[3] = table1.getValueAt(indexs[i], 3);
            row[4] = table1.getValueAt(indexs[i], 4);
            row[5] = table1.getValueAt(indexs[i], 5);
           mode12.addRow(row);
        }
        results.setVisible(true);
    }//GEN-LAST:event_buttonsendActionPerformed

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
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton button;
    private javax.swing.JButton buttonsend;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField ln;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void isVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}