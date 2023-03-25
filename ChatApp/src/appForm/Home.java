
package appForm;

import model.Model_User_Account;
import net.miginfocom.swing.MigLayout;


public class Home extends javax.swing.JLayeredPane {

   private chat chat;
    public Home() {
        initComponents();
        init();
    }
    
    private void init(){
        setLayout(new MigLayout("fillx, filly", "0[200!]5[fill, 100%]5[185!]0", "0[fill]0"));
        this.add(new Menu_Left());
        chat= new chat();
        this.add(chat);
        this.add(new Menu_Right());
        chat.setVisible(false);
    }
    
    public void setUser(Model_User_Account user){
        chat.setUser(user);
        chat.setVisible(true);
    }
     public void updateUser(Model_User_Account user){
        chat.updateUser(user);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
