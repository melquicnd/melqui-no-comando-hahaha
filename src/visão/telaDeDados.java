/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author henrique matheus
 */
public class telaDeDados extends javax.swing.JInternalFrame {

    /**
     * Creates new form telaDeDados
     */
    public telaDeDados() {
        initComponents();
    }
private void calcular()
    {
        
     // fuçao para caucular o subtotal 
        float suma = 0;
        for( int i = 0; i < jTable2.getRowCount(); i++)
        {
            float renglon;
            renglon = Float.parseFloat(jTable2.getValueAt(i, 0).toString());
            
            suma = suma + renglon;
            
        }

         jLabel8.setText(String.valueOf(suma));
        
  
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setForeground(java.awt.Color.orange);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jButton1.setText("Apagar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("carrregar daos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel4.setText("x");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "valor", "valor2", "valor3", "valor4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("No período de tempo selecionado, foram cadrastados ");

        jLabel5.setText("novos clientes e ");

        jLabel6.setText("x");

        jLabel7.setText("vendas totalilizando R$");

        jLabel8.setText("x");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1095, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if(jTable2.getSelectedRow() != -1){
        
        System.out.print("Linha selecionada: "+jTable2.getSelectedColumn());
            
        DefaultTableModel dmz = (DefaultTableModel)jTable2.getModel();
        dmz.removeRow(jTable2.getSelectedRow());
 
        
         File file = new File("C:\\Arquivos do programa/faturamentoDia.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
            String lanche = jLabel1.getText();

            
            
            if(linha.equals(lanche+";") == false){
                salvar.add(linha);
            
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }  
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
             String filePath = ("C:\\Arquivos do programa/textando.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
           String[] columnsName = firstLine.split(",");
         //   DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
          //  model.setColumnIdentifiers(columnsName);

            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataMax = line.split(";");
                //String[] dataRow = line.split(";");
           //     model.addRow(dataRow);
                
   
               
        //metodo para percorrer o array
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        
        jLabel2.setText(formato.format(dataSistema));
        String DataHoje = jLabel2.getText();
        String quebrador ="";
        int posisao = 0;
                for (int j = 0; j < dataMax.length; j++) {
                    String  linha = dataMax[posisao];
                    //metodo para aparecer so o valor
                    if(linha.toLowerCase().contains(DataHoje.toLowerCase()) == true){
                        System.out.println(linha+"Contem a data de hoje"); 
                    
                                               
                    linha.trim();
                    
                   // DefaultTableModel val = (DefaultTableModel) jTable2.getModel();
                    //val.addRow(new String[]{linha});
                    
                    
                                               
                                               
                                                RegistroDeCompra registroDeCompra = new RegistroDeCompra();
                                                registroDeCompra.setAnalise(linha);
                                                
                                                 try {
            JOptionPane.showMessageDialog(null, registroDeCompra.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
                                                 
                                                 
                                                 try {
             String ffilePath = ("C:\\Arquivos do programa/analise.txt");
        File ffile = new File(ffilePath);
            
            BufferedReader fbr = new BufferedReader(new FileReader(ffile));
            String ffirstLine = fbr.readLine().trim();
            String[] fcolumnsName = ffirstLine.split(",");
            DefaultTableModel fmodel = (DefaultTableModel)jTable2.getModel();
            fmodel.setColumnIdentifiers(columnsName);

            Object[] ftableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int f = 0; f < ftableLines.length; f++)
            {
                String fline = ftableLines[i].toString().trim();
                String[] fdataMax = line.split(" ");
                fmodel.addRow(fdataMax);
                
                    }
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
                    
                   // DefaultTableModel val = (DefaultTableModel) jTable2.getModel();
                  //  val.addRow(new String[]{resutado});
                    
                                               
                    }else{
                     System.out.println(linha+"Nã Contem a data de hoje");
                    }
                    
                    
                    
                    posisao ++;
                    System.out.println(""+posisao);
                    System.out.println(linha);
                }
        
                
               
            }
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }         
//das as informaçoes sobre os clientes cadastrados hoje
  // TODO add your handling code here:
        
	try {
             String filePath = ("C:\\Arquivos do programa/Texto.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
         //   DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
          //  model.setColumnIdentifiers(columnsName);

            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataMax = line.split(";");
                //String[] dataRow = line.split(";");
           //     model.addRow(dataRow);
                
   
               
        //metodo para percorrer o array
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        jLabel2.setText(formato.format(dataSistema));
        String DataHoje = jLabel2.getText();
        int contador = 0;
        int posisao = 0;
                for (int j = 0; j < dataMax.length; j++) {
                    String  linha = dataMax[posisao];
                    //metodo para aparecer so o valor
                    if(linha.toLowerCase().contains(DataHoje.toLowerCase()) == true){
                        System.out.println(linha+"Contem a data de hoje");
                        String resultado = "";
                        contador++;
                        jLabel4.setText(""+contador);
		                                
                        
                        
               calcular();
                    
                    
                   }else{
                     System.out.println(linha+"Nã Contem a data de hoje");
                    }
                    
                    
                    
                    posisao ++;
                    System.out.println(""+posisao);
                    System.out.println(linha);
                
        
                }
        
                
               
            }
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }         




    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
         TableModel model = jTable2.getModel();
        // TableModel model3 = jTextField8.getModel();
        int indexs[] = jTable2.getSelectedRows();

        jLabel1.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString()); //controle lanche
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
