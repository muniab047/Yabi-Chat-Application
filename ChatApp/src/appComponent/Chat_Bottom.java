/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package appComponent;


import Service.Service;
import event.PublicEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import model.Model_Send_Message;
import model.Model_User_Account;
import net.miginfocom.swing.MigLayout;
import swing.JIMSendTextPane;


public class Chat_Bottom extends javax.swing.JPanel {

    /**
     * @return the user
     */
    public Model_User_Account getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Model_User_Account user) {
        this.user = user;
    }

    private Model_User_Account user;
    public Chat_Bottom() {
        initComponents();
        init();
    }
    
    private void init(){
        setLayout(new MigLayout("fillx, filly", "2[fill]1[]1[]2", "2[fill]2"));
        JScrollPane scroll= new JScrollPane();
        scroll.setBorder(null);
        JIMSendTextPane txt = new JIMSendTextPane();
        txt.addKeyListener(new KeyAdapter(){
           
            public void KeyTyped(KeyEvent ke){
                refresh();
                
            }});
        
        scroll.setViewportView(txt);
        
        add(scroll, "w 100%");
        JPanel panel = new JPanel();
        panel.setLayout(new MigLayout("filly", "0[]0", "0[bottom]0"));
        panel.setPreferredSize(new Dimension(30,28));
        panel.setBackground(new Color(245,247,234));
        JButton cmd = new JButton();
        cmd.setBorder(null);
        
        cmd.setContentAreaFilled(false);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appIcon/send2.png")));   
        cmd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                String text = txt.getText().trim();
                if(!text.equals("")){
                    Model_Send_Message message = new Model_Send_Message(Service.getInstance().getUser().getUserID(), user.getUserID(), text);
                    send(message);
                    PublicEvent.getInstance().getEventChat().sendMessage(message);
                    txt.setText("");
                    txt.grabFocus();
                    refresh();
            }
                else{
                    txt.grabFocus();
                }}
            
        });
        txt.setBorder(new EmptyBorder(5,5,5,5));
        txt.setBackground(new Color(245,247,234));
        txt.setHintText("Write Message Here ...");
        panel.add(cmd);
        add(panel);
        
    }
    private void send(Model_Send_Message data){
        Service.getInstance().getClient().emit("send_to_user", data.toJsonObject());
    }
    private void refresh(){
        revalidate();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(245, 247, 234));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
