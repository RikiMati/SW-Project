package com.project.sw_assignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Client extends javax.swing.JFrame {
    public Client() {
        initComponents();
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CoffeeButton = new javax.swing.JButton();
        SnacksButton = new javax.swing.JButton();
        DrinksButton = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        finish = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientreceipt = new javax.swing.JTextArea();
        print = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        jLabel1.setText("WELCOME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        CoffeeButton.setBackground(new java.awt.Color(153, 153, 153));
        CoffeeButton.setForeground(new java.awt.Color(255, 255, 255));
        CoffeeButton.setText("Coffee");
        CoffeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeButtonActionPerformed(evt);
            }
        });

        SnacksButton.setBackground(new java.awt.Color(153, 153, 153));
        SnacksButton.setForeground(new java.awt.Color(255, 255, 255));
        SnacksButton.setText("Snacks");
        SnacksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnacksButtonActionPerformed(evt);
            }
        });

        DrinksButton.setBackground(new java.awt.Color(153, 153, 153));
        DrinksButton.setForeground(new java.awt.Color(255, 255, 255));
        DrinksButton.setText("Drinks");
        DrinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinksButtonActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(153, 153, 153));
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CoffeeButton)
                        .addGap(18, 18, 18)
                        .addComponent(SnacksButton)
                        .addGap(18, 18, 18)
                        .addComponent(DrinksButton))
                    .addComponent(Add))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CoffeeButton)
                    .addComponent(SnacksButton)
                    .addComponent(DrinksButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(Add))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "COST"
            }
        ));
        jScrollPane2.setViewportView(cart);

        delete.setBackground(new java.awt.Color(153, 153, 153));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel4.setText("CART");

        finish.setBackground(new java.awt.Color(153, 153, 153));
        finish.setForeground(new java.awt.Color(255, 255, 255));
        finish.setText("Send Order");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(218, 218, 218))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(delete)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(finish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(delete)
                .addGap(18, 18, 18)
                .addComponent(finish)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        clientreceipt.setColumns(20);
        clientreceipt.setRows(5);
        jScrollPane3.setViewportView(clientreceipt);

        print.setBackground(new java.awt.Color(153, 153, 153));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(print)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //imports the coffee txt file in the table
    private void CoffeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeButtonActionPerformed
        table.setModel(new DefaultTableModel(null ,new String[]{"ID", "NAME", "COST"}));
        String filePath = "coffee.txt";
        File file = new File(filePath);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
           for (Object tableLine : tableLines) {
               String line = tableLine.toString().trim();
               String[] dataRow = line.split(";");
               model.addRow(dataRow);
           }
        }catch(IOException e){
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_CoffeeButtonActionPerformed

     //imports the snack txt file in the table
    private void SnacksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnacksButtonActionPerformed
        table.setModel(new DefaultTableModel(null ,new String[]{"ID", "NAME", "COST"}));
        String filePath = "Breakfast.txt";
        File file = new File(filePath);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
           for (Object tableLine : tableLines) {
               String line = tableLine.toString().trim();
               String[] dataRow = line.split(";");
               model.addRow(dataRow);
           }
        }catch(IOException e){
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_SnacksButtonActionPerformed

    //imports the drink txt file in the table
    private void DrinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinksButtonActionPerformed
        table.setModel(new DefaultTableModel(null ,new String[]{"ID", "NAME", "COST"}));    
        String filePath = "Drinks.txt";
            File file = new File(filePath);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
           for (Object tableLine : tableLines) {
               String line = tableLine.toString().trim();
               String[] dataRow = line.split(";");
               model.addRow(dataRow);
           }
        }catch(IOException e){
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_DrinksButtonActionPerformed

    //passes a data from one table to the other
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        jPanel5.setVisible(true);
        TableModel model1 = table.getModel();
        int[] index = table.getSelectedRows();
        Object[] row = new Object[3];
        DefaultTableModel model2 = (DefaultTableModel)cart.getModel();
        for(int i = 0; i<index.length; i++){
            row[0] = model1.getValueAt(index[i], 0);
            row[1] = model1.getValueAt(index[i], 1);
            row[2] = model1.getValueAt(index[i], 2);
            model2.addRow(row);
        }
    }//GEN-LAST:event_AddActionPerformed

    //deletes a row only from the second table
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel firstModel = (DefaultTableModel)cart.getModel();
        if(cart.getSelectedRowCount() == 1){
            firstModel.removeRow(cart.getSelectedRow());
        }else{
            if(cart.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "Select the row you want to delete");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    //calls the print function    
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try{
           clientreceipt.print();
       }catch(Exception e){
       
       }
    }//GEN-LAST:event_printActionPerformed

    //this method creates the receipt design and prints it
    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        jPanel6.setVisible(true);
        double sum = 0;
        int RowNum = cart.getRowCount();
        for(int i = 0; i<RowNum ; i++){
            double value = Double.valueOf(cart.getValueAt(i, 2).toString());
            sum += (int) value;
        }
        clientreceipt.setText("");
        clientreceipt.setText(clientreceipt.getText()+"=============================\n");
        clientreceipt.setText(clientreceipt.getText()+" \t Receipt\n");
        clientreceipt.setText(clientreceipt.getText()+"==============================\n");
        DefaultTableModel model = (DefaultTableModel)cart.getModel();
        clientreceipt.setText(clientreceipt.getText()+ "ID"+"\t"+"Name"+"\t"+"Price"+"\n");
        clientreceipt.setText(clientreceipt.getText()+"\n");
        for(int i = 0; i<cart.getRowCount(); i++){
            String id = cart.getValueAt(i,0).toString();
            String Name = cart.getValueAt(i,1).toString();
            String Price = cart.getValueAt(i,2).toString();
            clientreceipt.setText(clientreceipt.getText()+id +"\t"+Name+"\t"+Price+"\n");
        }
        clientreceipt.setText(clientreceipt.getText()+"\n");
        clientreceipt.setText(clientreceipt.getText()+"=============================\n");
        clientreceipt.setText(clientreceipt.getText()+"Total: " + sum);
        clientreceipt.setText(clientreceipt.getText()+"\n");
        clientreceipt.setText(clientreceipt.getText()+"=============================\n");
    }//GEN-LAST:event_finishActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton CoffeeButton;
    private javax.swing.JButton DrinksButton;
    private javax.swing.JButton SnacksButton;
    private javax.swing.JTable cart;
    private javax.swing.JTextArea clientreceipt;
    private javax.swing.JButton delete;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton print;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
