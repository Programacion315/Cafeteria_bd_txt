/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import code.Cliente;
import code.Pedido;
import code.Producto;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class GUI_Pedido extends javax.swing.JFrame {

    private ArrayList<Pedido> pedidos;
    /**
     * Creates new form GUI_Pedido
     */

    String info;
    double precioTotal;
    ArrayList<Cliente> clientes;
    int cantidad;

    public GUI_Pedido(String info, double precioTotal, ArrayList list, int cantidad) {
        initComponents();
        pedidos = new ArrayList<Pedido>();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.info = info;
        this.precioTotal = precioTotal;

        clientes = list;
        this.cantidad = cantidad;

        cargarPedidos();
    }

    public void cargarPedidos() {
        File Archivo = new File("Pedidos.txt");
        FileReader Leer;
        BufferedReader Almacen;
        Pedido per, aux = new Pedido();
        try {
            Leer = new FileReader(Archivo);
            Almacen = new BufferedReader(Leer);
            per = aux.cargar(Almacen);

            while (per != null) {
                pedidos.add(per);
                per = aux.cargar(Almacen);
            }
            Almacen.close();
            Leer.close();
        } catch (Exception e) {

        }
        verDatosPedidos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_editar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pedidos = new javax.swing.JTable();
        btn_aniadir = new javax.swing.JButton();
        btn_editar1 = new javax.swing.JButton();
        btn_reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Pedidos");

        table_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#Factura", "Cedula Cliente", "Producto", "Cantidad", "Valor Total", "Fecha registro"
            }
        ));
        jScrollPane1.setViewportView(table_pedidos);
        if (table_pedidos.getColumnModel().getColumnCount() > 0) {
            table_pedidos.getColumnModel().getColumn(2).setMinWidth(200);
            table_pedidos.getColumnModel().getColumn(2).setMaxWidth(400);
        }

        btn_aniadir.setText("Añadir");
        btn_aniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aniadirActionPerformed(evt);
            }
        });

        btn_editar1.setText("Copia");
        btn_editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar1ActionPerformed(evt);
            }
        });

        btn_reporte.setText("Reporte");
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btn_aniadir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_editar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editar1)
                            .addGap(18, 18, 18)
                            .addComponent(btn_reporte))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aniadir)
                    .addComponent(btn_editar)
                    .addComponent(btn_editar1)
                    .addComponent(btn_reporte))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int c;
        String factura;
        Pedido aux;
        try {
            c = table_pedidos.getSelectedRow(); //Debo darle click
            aux = pedidos.get(c);
            factura = JOptionPane.showInputDialog("Nuevo factura!");
            aux.setFactura(factura);
            JOptionPane.showMessageDialog(null, "Actualizado con exito!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Escoger una fila");
        }
        verDatosPedidos();
        guardarPedidos();


    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aniadirActionPerformed

        GUI_AniadirPedido aniadirPedido = new GUI_AniadirPedido(this,clientes);
        aniadirPedido.show();

    }//GEN-LAST:event_btn_aniadirActionPerformed

    
    private void btn_editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar1ActionPerformed

        File file = new File("CopiaPedidos.txt");
        PrintWriter Escribe;
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            Pedido aux;
            Escribe = new PrintWriter(file, "utf-8");
            for (int i = 0; i < pedidos.size(); i++) {
                aux = (Pedido) pedidos.get(i);
                aux.guardar(Escribe);
            }
            Escribe.close();

            JOptionPane.showMessageDialog(null, "Copia de seguridad creada con exito!");
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_editar1ActionPerformed

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed
        // TODO add your handling code here:

        GUI_Fecha fechaGui = new GUI_Fecha(this);
        fechaGui.show();
        /*
        //String fecha = JOptionPane.showInputDialog("Digite la fehca");
        
        fechaGui.get
        
        for (int i = 0; i < pedidos.size(); i++) {
            
           if (pedidos.get(i).getFechaRegistro().equals(fecha)) {
                
                
                
                File archivo = new File("C:/Users/jorge/OneDrive/Escritorio/carpeta/reportes.txt");
                PrintWriter Escribir;

                if (!archivo.exists()) {

                    try {
                        archivo.createNewFile();
                    } catch (IOException ex) {

                        ex.printStackTrace();
                    }
                } else {
                    try {
                        Escribir = new PrintWriter(archivo, "utf-8");
                        Escribir.println("Cafeteria ");
                        Escribir.println("");
                        Escribir.println("");
                        Escribir.println("Reporte de ventas de la fecha: " + fecha);
                        Escribir.println();
                       //Escribir.println("El total de productos que compro es de: " + pedidos.get(i).getCantidad());
                        Escribir.close();
                        JOptionPane.showMessageDialog(null, "Reporte generado con exito!");

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "No se pudo generar el archivo!");
                    }
                }

           }
            else{
                
                JOptionPane.showMessageDialog(null, "Digite una fecha valida!!!");
                 }
           }
        
         */

    }//GEN-LAST:event_btn_reporteActionPerformed

    //Metodo que genera el reporte
    void generarReporte(String date) {

        int contador = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            

            if (pedidos.get(i).getFechaRegistro().equals(date)) {
                contador++;
                //File archivo = new File("C:/Users/jorge/OneDrive/Escritorio/reportes/Reporte"+ date+ "-" + contador + ".doc");
                File archivo = new File("Ponen la ruta donde quieren que este el reporte"+ date+ "-" + contador + ".doc");
                PrintWriter Escribir;

                try {
                    archivo.createNewFile();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo crear");
                }

                try {
                    Escribir = new PrintWriter(archivo, "utf-8");
                    Escribir.println("Cafeteria ");
                    Escribir.println("");
                    Escribir.println("");
                    Escribir.println("Reporte de ventas de la fecha: " + date);
                    Escribir.println();
                    Escribir.println("El numero de factura es de: " + pedidos.get(i).getFactura());
                    Escribir.println();
                    Escribir.println("El id del cliente es: " + pedidos.get(i).getCelular());
                    Escribir.println();
                    Escribir.println("El total de productos que compro es de: " + pedidos.get(i).getCantidad());
                    Escribir.println();
                    Escribir.println("Productos comprados: " + pedidos.get(i).getProducto());
                    
                    
                    Escribir.close();
                    

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se pudo generar el archivo!");
                }
            }

        }
        
        JOptionPane.showMessageDialog(null, contador +" reportes generados");
    }
    

public void aniadirPedido(String factura, double cedula, String fecha) {
        try {
            Pedido p = new Pedido(factura, cedula, info, cantidad, precioTotal, fecha);
            pedidos.add(p);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique sus datos");
        }

        verDatosPedidos();
        guardarPedidos(); //Guardamos en nuestro txt

    }

    private void guardarPedidos() {
        File file = new File("Pedidos.txt");
        PrintWriter Escribe;
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            Pedido aux;
            Escribe = new PrintWriter(file, "utf-8");
            for (int i = 0; i < pedidos.size(); i++) {
                aux = pedidos.get(i);
                aux.guardar(Escribe);
            }
            Escribe.close();
        } catch (Exception e) {
        }
    }

    private void verDatosPedidos() {
        String Mat[][] = new String[pedidos.size()][6]; //3
        Pedido aux;
        for (int i = 0; i < pedidos.size(); i++) {
            aux = pedidos.get(i);
            Mat[i][0] = aux.getFactura();
            Mat[i][1] = Double.toString(aux.getCelular()); //trato de acceder a una posicion que no existe
            Mat[i][2] = aux.getProducto();
            Mat[i][3] = Integer.toString(aux.getCantidad());
            Mat[i][4] = Double.toString(aux.getValorTotal());
            Mat[i][5] = aux.getFechaRegistro();

        }
        table_pedidos.setModel(new javax.swing.table.DefaultTableModel(
                Mat,
                new String[]{
                    "#Factura", "Cedula cliente", "Producto", "Cantidad", "Valor Total", "Fecha registro"
                }
        ));

    }
    /*
    public void aniadirPedido(String factura, double idCliente, String producto, int cantidad, double valorUnidad, double valorTotal, String fechaRegistro){
        try{
            Pedido p = new Pedido(factura,idCliente,producto,cantidad,valorUnidad,valorTotal,fechaRegistro);
            pedidos.add(p);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verifique sus datos");
        }
        
        //limpiar(); //Limpiarlos en la pestaña!
        verDatosPedidos();
        guardarPedidos();
        
        JOptionPane.showMessageDialog(null, "Agregado con exito!");
    }
   
    private void verDatosPedidos(){ //Modificar
        String Mat[][] = new String[pedidos.size()][7]; //3
        Pedido aux;
        for (int i = 0; i < pedidos.size(); i++) {
            aux = pedidos.get(i);
            Mat[i][0] = aux.getFactura();
            Mat[i][1] = Double.toString(aux.getIdCliente());
            Mat[i][2] = aux.getProducto();
            Mat[i][3] = Integer.toString(aux.getCantidad());
            Mat[i][4] = Double.toString(aux.getValorUnidad());
            Mat[i][5] = Double.toString(aux.getValorTotal());
            Mat[i][6] = aux.getFechaRegistro();
            
            
            
        }
        table_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            Mat, 
            new String [] {
                "Nombre", "Cedula"
            }
        ));
        
    }
    
    private void guardarPedidos(){
        File file = new File("Pedidos.txt");
        PrintWriter Escribe;
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e) { 
            }
        }
        try {
            Pedido aux;
            Escribe = new PrintWriter(file, "utf-8");
            for (int i = 0; i < pedidos.size(); i++) {
                aux = pedidos.get(i);
                aux.guardar(Escribe);
            }
            Escribe.close();
        } catch (Exception e) {
        }
    }
    
     */
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aniadir;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_editar1;
    private javax.swing.JButton btn_reporte;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_pedidos;
    // End of variables declaration//GEN-END:variables
}