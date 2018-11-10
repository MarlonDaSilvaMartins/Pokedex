/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.sun.org.apache.bcel.internal.generic.IFEQ;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author Marlon Martins
 * @since 06/05/2018 - 02:10
 * @version 1.0 red
 */
public class Menu extends javax.swing.JFrame implements InternalFrameListener {

    private boolean flagCadPokemon = false;
    private boolean flagCadTreinador = false;
    private boolean flagCadGinasio = false;
    private boolean flagManPokemon = false;
    private boolean flagManTreinador = false;
    private boolean flagManGinasio = false;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jareaTabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiPokemon = new javax.swing.JMenuItem();
        jmiTreinador = new javax.swing.JMenuItem();
        jmiGinasio = new javax.swing.JMenuItem();
        jmManutencao = new javax.swing.JMenu();
        jmiManPokemon = new javax.swing.JMenuItem();
        jmiManTreinador = new javax.swing.JMenuItem();
        jmiManginasio = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jareaTabalhoLayout = new javax.swing.GroupLayout(jareaTabalho);
        jareaTabalho.setLayout(jareaTabalhoLayout);
        jareaTabalhoLayout.setHorizontalGroup(
            jareaTabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jareaTabalhoLayout.setVerticalGroup(
            jareaTabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");

        jmiPokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pokemon.png"))); // NOI18N
        jmiPokemon.setText("Pokemon");
        jmiPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPokemonActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiPokemon);

        jmiTreinador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/treinador.png"))); // NOI18N
        jmiTreinador.setText("Treinador");
        jmiTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTreinadorActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiTreinador);

        jmiGinasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ginasio.png"))); // NOI18N
        jmiGinasio.setText("Ginásio");
        jmiGinasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGinasioActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiGinasio);

        jMenuBar1.add(jmCadastro);

        jmManutencao.setText("Manutenção");

        jmiManPokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pokemon.png"))); // NOI18N
        jmiManPokemon.setText("Pokemon");
        jmiManPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManPokemonActionPerformed(evt);
            }
        });
        jmManutencao.add(jmiManPokemon);

        jmiManTreinador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/treinador.png"))); // NOI18N
        jmiManTreinador.setText("Treinador");
        jmiManTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManTreinadorActionPerformed(evt);
            }
        });
        jmManutencao.add(jmiManTreinador);

        jmiManginasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ginasio.png"))); // NOI18N
        jmiManginasio.setText("Ginásio");
        jmiManginasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManginasioActionPerformed(evt);
            }
        });
        jmManutencao.add(jmiManginasio);

        jMenuBar1.add(jmManutencao);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jareaTabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jareaTabalho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadPokemon(){
        if(!flagCadPokemon){   
            GUICadPokemon gcp = new GUICadPokemon();
            jareaTabalho.add(gcp);
            gcp.setVisible(true);
            flagCadPokemon = true;
            gcp.addInternalFrameListener(this);
        }    
    }//fecha abirpokemon
    
    private void abrirManPokemon(){
        if(!flagManPokemon){
            GUIManPokemon gmp = new GUIManPokemon();
            jareaTabalho.add(gmp);
            gmp.setVisible(true);
            flagManPokemon = true;
            gmp.addInternalFrameListener(this);
        }
    }//fecha abrirmanpokemon
    
    private void abrirCadTreinador(){
        if(!flagCadTreinador){
            GUICadTreinador gct = new GUICadTreinador();
            jareaTabalho.add(gct);
            gct.setVisible(true);
            flagCadTreinador = true;
            gct.addInternalFrameListener(this);
        }   
    }//fecha abrricatreinador
    
    private void abrirManTreinador(){
        if(!flagManTreinador){
            GUIManTreinador gmt = new GUIManTreinador();
            jareaTabalho.add(gmt);
            gmt.setVisible(true);
            flagManTreinador = true;
            gmt.addInternalFrameListener(this);
        }    
    }//fecha abrirmantreinador
    
    private void abrirCadGinasio(){
        if(!flagCadGinasio){
            GUICadGinasio gcg = new GUICadGinasio();
            jareaTabalho.add(gcg);
            gcg.setVisible(true);
            flagCadGinasio = true;
            gcg.addInternalFrameListener(this);
        }    
    }//fecha abrircadginasio
    
    private void abrirManGinasio(){
        if(!flagManGinasio){
            GUIManGinasio gmg = new GUIManGinasio();
            jareaTabalho.add(gmg);
            gmg.setVisible(true);
            flagManGinasio = true;
            gmg.addInternalFrameListener(this);
        }    
    }//fecha abrirmanginasio
    
    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jmSairMouseClicked

    private void jmiPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPokemonActionPerformed
        abrirCadPokemon();
    }//GEN-LAST:event_jmiPokemonActionPerformed

    private void jmiManPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManPokemonActionPerformed
        abrirManPokemon();
    }//GEN-LAST:event_jmiManPokemonActionPerformed

    private void jmiTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTreinadorActionPerformed
        abrirCadTreinador();
    }//GEN-LAST:event_jmiTreinadorActionPerformed

    private void jmiManTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManTreinadorActionPerformed
        abrirManTreinador();
    }//GEN-LAST:event_jmiManTreinadorActionPerformed

    private void jmiGinasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGinasioActionPerformed
        abrirCadGinasio();
    }//GEN-LAST:event_jmiGinasioActionPerformed

    private void jmiManginasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManginasioActionPerformed
        abrirManGinasio();
    }//GEN-LAST:event_jmiManginasioActionPerformed

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
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Red", "INSERT YOUR LICENSE KEY HERE", "my company");
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jareaTabalho;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmManutencao;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiGinasio;
    private javax.swing.JMenuItem jmiManPokemon;
    private javax.swing.JMenuItem jmiManTreinador;
    private javax.swing.JMenuItem jmiManginasio;
    private javax.swing.JMenuItem jmiPokemon;
    private javax.swing.JMenuItem jmiTreinador;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
       
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof GUICadPokemon){flagCadPokemon = false;}
        if(e.getInternalFrame() instanceof GUICadTreinador){flagCadTreinador = false;}
        if(e.getInternalFrame() instanceof GUICadGinasio){flagCadGinasio = false;}
        if(e.getInternalFrame() instanceof GUIManPokemon){flagManPokemon = false;}
        if(e.getInternalFrame() instanceof GUIManTreinador){flagManTreinador = false;}
        if(e.getInternalFrame() instanceof GUIManGinasio){flagManGinasio = false;}
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        
    }
}