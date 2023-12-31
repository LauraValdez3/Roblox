/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mx.itson.roblox.views.tickets;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.roblox.entities.Client;
import mx.itson.roblox.entities.Movie;
import mx.itson.roblox.models.ClientModel;
import mx.itson.roblox.models.MovieModel;
import mx.itson.roblox.models.TicketModel;

/**
 *
 * @author alexi
 */
public class CreateTicket extends javax.swing.JDialog {

    int row=-1;
    List<Client> clients = new ArrayList();
    List<Movie> movies = new ArrayList();
    int movieId=0;
    int clientId=0;
    
    /**
     * Creates new form CreateTicket
     */
    public CreateTicket(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        clients=ClientModel.getAll("");
        movies=MovieModel.getAll("");
        updateTableMovies();
        updateTableClients();
    }
    
    /**
     * Fills the tblMovies table
     */
    public void updateTableMovies(){
        DefaultTableModel model = (DefaultTableModel) tblMovie.getModel();
        model.setNumRows(0);
        int nList = 0;
        for(Movie m : movies){
            nList ++;
            model.addRow(new Object[]{
                m.getId(), m.getName()
            });
        }
    }
    
    /**
     * Fills the tblClients table
     */
    public void updateTableClients(){
        DefaultTableModel model = (DefaultTableModel) tblClients.getModel();
        model.setNumRows(0);
        int nList = 0;
        for(Client c : clients){
            nList ++;
            model.addRow(new Object[]{
                c.getId(), c.getName()
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

        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovie = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblMovie = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        txfPrice = new javax.swing.JTextField();
        lblClient = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfSeat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAdd.setText("Crear");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        tblMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Pelicula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMovieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMovie);
        if (tblMovie.getColumnModel().getColumnCount() > 0) {
            tblMovie.getColumnModel().getColumn(0).setMinWidth(0);
            tblMovie.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblMovie.getColumnModel().getColumn(0).setMaxWidth(0);
            tblMovie.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Precio");

        lblMovie.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMovie.setText("Pelicula: ");

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientsMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblClients);
        if (tblClients.getColumnModel().getColumnCount() > 0) {
            tblClients.getColumnModel().getColumn(0).setMinWidth(0);
            tblClients.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblClients.getColumnModel().getColumn(0).setMaxWidth(0);
            tblClients.getColumnModel().getColumn(1).setResizable(false);
        }

        txfPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfPriceKeyTyped(evt);
            }
        });

        lblClient.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblClient.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblClient.setText("Cliente: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Asiento");

        txfSeat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Boleto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                            .addComponent(lblMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane14)
                            .addComponent(lblClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel5)
                                        .addGap(46, 46, 46))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(btnAdd)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMovie)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClient)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked

        String seat=txfSeat.getText();
        String seatEmpty=seat.replaceAll(" ", "");
        
        

        if(!(clientId==0 || movieId==0 || seatEmpty.length()==0 || txfPrice.getText().length()==0)){
            double price =Double.parseDouble(txfPrice.getText());
            if(TicketModel.save(clientId, movieId, seat, price)){
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "No se ha podido registrar al usuario");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Favor de llenar todos los campos");
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void tblMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMovieMouseClicked
        row = tblMovie.rowAtPoint(evt.getPoint());
        lblMovie.setText("Pelicula: "+String.valueOf(tblMovie.getValueAt(row, 1)));
        movieId=Integer.parseInt(String.valueOf(tblMovie.getValueAt(row, 0)));
    }//GEN-LAST:event_tblMovieMouseClicked

    private void tblClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientsMouseClicked
        row = tblClients.rowAtPoint(evt.getPoint());
        lblClient.setText("Sala: "+String.valueOf(tblClients.getValueAt(row, 1)));
        clientId=Integer.parseInt(String.valueOf(tblClients.getValueAt(row, 0)));
    }//GEN-LAST:event_tblClientsMouseClicked

    private void txfPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPriceKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >47 && key <=57;
        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txfPriceKeyTyped

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
            java.util.logging.Logger.getLogger(CreateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateTicket dialog = new CreateTicket(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblMovie;
    private javax.swing.JTable tblClients;
    private javax.swing.JTable tblMovie;
    private javax.swing.JTable tblMovies;
    private javax.swing.JTable tblMovies1;
    private javax.swing.JTable tblMovies10;
    private javax.swing.JTable tblMovies2;
    private javax.swing.JTable tblMovies3;
    private javax.swing.JTable tblMovies4;
    private javax.swing.JTable tblMovies5;
    private javax.swing.JTable tblMovies6;
    private javax.swing.JTable tblMovies7;
    private javax.swing.JTable tblMovies8;
    private javax.swing.JTable tblMovies9;
    private javax.swing.JTextField txfPrice;
    private javax.swing.JTextField txfSeat;
    // End of variables declaration//GEN-END:variables
}
