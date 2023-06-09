/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package appForm;

import appComponent.itemPeople;
import event.EventMenuLeft;
import event.PublicEvent;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import model.Model_User_Account;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Abdella Omer
 */
public class Menu_Left extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Left
     */
    private List<Model_User_Account> userAccount;
    public Menu_Left() {
        initComponents();
        init();
    }
    
    private void init(){
       
        menulist.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        userAccount = new ArrayList<>();
        PublicEvent.getInstance().addEventMenuLeft(new EventMenuLeft() {
            @Override
            public void newUser(List<Model_User_Account> users) {
                for (Model_User_Account d : users) {
                    userAccount.add(d);
                    menulist.add(new itemPeople(d), "wrap");
                    reffreshMenuList();
                }
            }
            @Override
         public void userConnect(int userID){
             for (Model_User_Account u : userAccount) {
                    if (u.getUserID() == userID) {
                        u.setStatus(true);
                        PublicEvent.getInstance().getEventMain().updateUser(u);
                        break;
                    }
                }
                if (menuMessage.isSelected()) {
                    for (Component com : menulist.getComponents()) {
                        itemPeople item = (itemPeople) com;
                        if (item.getUser().getUserID() == userID) {
                            item.updateStatus();
                            break;
                        }
                    }
                }
             
         }
         
         @Override
         public void userDisconnect(int userID){
             for (Model_User_Account u : userAccount) {
                    if (u.getUserID() == userID) {
                        u.setStatus(false);
                        PublicEvent.getInstance().getEventMain().updateUser(u);
                        break;
                    }
                }
                if (menuMessage.isSelected()) {
                    for (Component com : menulist.getComponents()) {
                        itemPeople item = (itemPeople) com;
                        if (item.getUser().getUserID() == userID) {
                            item.updateStatus();
                            break;
                        }
                    }
                }
             
         }
        });
        showMessage();
    }
    
    public void showMessage(){
        menulist.removeAll();
       for(Model_User_Account d: userAccount){
            menulist.add(new itemPeople(null),"wrap");
        }
        reffreshMenuList();
    }
    
    public void showGroup(){
        menulist.removeAll();
         for (int i = 0; i < 5; i++) {
            menulist.add(new itemPeople(null), "wrap");
        }
        reffreshMenuList();
    }
    
    public void showBox(){
        menulist.removeAll();
        for(int i=0; i<8; i++){
            menulist.add(new itemPeople(null),"wrap");
        }
        reffreshMenuList();
    }
    
    private void reffreshMenuList(){
        menulist.repaint();
        menulist.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuMessage = new javax.swing.JButton();
        menuGroup = new javax.swing.JButton();
        menuBox = new javax.swing.JButton();
        sp = new javax.swing.JScrollPane();
        menulist = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(231, 239, 196));

        menu.setOpaque(true);
        menu.setLayout(new java.awt.GridLayout(1, 3));

        menuMessage.setBackground(new java.awt.Color(246, 252, 220));
        menuMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIcon/message.png"))); // NOI18N
        menuMessage.setBorder(null);
        menuMessage.setBorderPainted(false);
        menuMessage.setContentAreaFilled(false);
        menuMessage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/appIcon/message2.png"))); // NOI18N
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });
        menu.add(menuMessage);

        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIcon/group.png"))); // NOI18N
        menuGroup.setBorder(null);
        menuGroup.setBorderPainted(false);
        menuGroup.setContentAreaFilled(false);
        menuGroup.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/appIcon/group2.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        menu.add(menuGroup);

        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIcon/box.png"))); // NOI18N
        menuBox.setBorder(null);
        menuBox.setBorderPainted(false);
        menuBox.setContentAreaFilled(false);
        menuBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/appIcon/box2.png"))); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        menu.add(menuBox);

        sp.setBackground(new java.awt.Color(248, 252, 230));
        sp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 223, 155), 1, true));
        sp.setForeground(new java.awt.Color(248, 252, 230));
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setAlignmentX(0.25F);

        menulist.setBackground(new java.awt.Color(241, 246, 220));
        menulist.setForeground(new java.awt.Color(241, 246, 220));

        javax.swing.GroupLayout menulistLayout = new javax.swing.GroupLayout(menulist);
        menulist.setLayout(menulistLayout);
        menulistLayout.setHorizontalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menulistLayout.setVerticalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        sp.setViewportView(menulist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
      
    
    
    
    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed
       if(!menuMessage.isSelected()){
        menuMessage.setSelected(true);
        menuGroup.setSelected(false);
        menuBox.setSelected(false);
        showMessage();
        
       }
    }//GEN-LAST:event_menuMessageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
          if(!menuGroup.isSelected()){
        menuMessage.setSelected(false);
        menuGroup.setSelected(true);
        menuBox.setSelected(false);}
          showGroup();
    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed
         if(!menuBox.isSelected()){
             menuMessage.setSelected(false);
             menuGroup.setSelected(false);
             menuBox.setSelected(true);}
         showBox();
    }//GEN-LAST:event_menuBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane menu;
    private javax.swing.JButton menuBox;
    private javax.swing.JButton menuGroup;
    private javax.swing.JButton menuMessage;
    private javax.swing.JLayeredPane menulist;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
