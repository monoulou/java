/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boundaries;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author formation
 */
public class JInternalFrameSuppressionPays extends javax.swing.JInternalFrame {
    
        //Déclaration des modeles de classe réutilisable
        private Connection icn;
        private DefaultComboBoxModel idcbm;
    /**
     * Creates new form NewJInternalFrameSuppressionPays
     */
    public JInternalFrameSuppressionPays() {
        initComponents();
        setVisible(true);
        
      
        
         try{
            //Défintion de la classe des pilotes utilisés.
            Class.forName("org.gjt.mm.mysql.Driver");
            //Connexion à la base de données.
            icn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cinescope","root","");
            //Création d'un objet statement permettant la création de commande SQL.
            Statement lstSQL = icn.createStatement();
            //La requete SQL.
            String rSQL = "SELECT nom_pays FROM pays";
            //Execution de la requête.
            ResultSet lrs = lstSQL.executeQuery(rSQL);
            //
            idcbm = new DefaultComboBoxModel();
            while(lrs.next()){
                idcbm.addElement(lrs.getString(1));
            }
            //Affectation des données à la variable jComboBoxPays.
            jComboBoxNom.setModel(idcbm);
            
            lstSQL.close();
            lrs.close();
            //Affectation des valeurs au modele
            jLabelMessage.setText("Ok !!");
            
        }catch(ClassNotFoundException | SQLException ex){
            jLabelMessage.setText(ex.getMessage());
        }
        
        
        
        try{
            //Connexion
            //Chargement des pilotes.
            Class.forName("org.gjt.mm.mysql.Driver");
            //Déclaration d'une String qui contient les information de DSN de connexion
            String lsDSN = "jdbc:mysql://127.0.0.1:3306/cinescope";
            icn = DriverManager.getConnection(lsDSN, "root", "");
            //Création d'un objet statement permettant la création de commande SQL.
            Statement lstSQL = icn.createStatement();
            //Curseur permettant de stocker le resultat d'un select
            ResultSet lrs = lstSQL.executeQuery("SELECT nom_pays FROM pays ORDER BY 1");
            
            //
            idcbm = new DefaultComboBoxModel();
            while(lrs.next()){
                idcbm.addElement(lrs.getString(1));
            }
            //Affectation du modele à la comboBox.
            jComboBoxNom.setModel(idcbm);
            
            //Fermeture du curseur.
            lrs.close();
            //Fermeture de l'objet Statement.
            lstSQL.close();
            
            jLabelMessage.setText("OK");
        }catch(ClassNotFoundException | SQLException ex){
            jLabelMessage.setText(ex.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jComboBoxNom = new javax.swing.JComboBox();
        jButtonValider = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Pays à supprimer ?");

        jButtonValider.setText("Valider");

        jLabelMessage.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jComboBoxNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelMessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jButtonValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabelMessage)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox jComboBoxNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMessage;
    // End of variables declaration//GEN-END:variables
}
