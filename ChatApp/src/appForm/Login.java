/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package appForm;

import Service.Service;
import event.EventLogin;
import event.PublicEvent;
import event.eventmessage;
import io.socket.client.Ack;
import model.Model_Login;
import model.Model_Message;
import model.Model_Register;
import model.Model_User_Account;

/**
 *
 * @author Abdella Omer
 */
public class Login extends javax.swing.JPanel {

  
    public Login() {
        initComponents();
        init();
    }
    
     private void init(){
         PublicEvent.getInstance().addEventLogin(new EventLogin(){
             
 //////////////  IMPLEMENTING ABSRRACT 4 METHODS OF EVENT PACKAGE EVENTLOGIN INTERFACE ///////////////
           
 ////////////////////////////LOGIN() METHOD /////////////////////////           
             @Override
             public void login(Model_Login data) {
                 new Thread (new Runnable(){ 
                     @Override
                     public void run() {
                         //PublicEvent.getInstance().getEventMain().showLoading(true);
//                         try{
//                             Thread.sleep(3000);
//                         }catch(InterruptedException e){
//                             
//                         }
                         //PublicEvent.getInstance().getEventMain().showLoading(false);
                         Service.getInstance().getClient().emit("login", data.toJsonObject(), new Ack(){
                             @Override
                             public void call(Object... os) {
                                
                                 if (os.length > 0) {
                                    boolean action = (Boolean) os[0];
                                    if (action) {
                                        
                                        Service.getInstance().setUser(new Model_User_Account(os[1]));
                                       // PublicEvent.getInstance().getEventMain().showLoading(false);
                                        PublicEvent.getInstance().getEventMain().initChat();
                                        
                                    } else {
                                        //  password wrong
                                        //PublicEvent.getInstance().getEventMain().showLoading(false);
                                    }
                                } else {
                                   // PublicEvent.getInstance().getEventMain().showLoading(false);
                                }
                            }
                                   
                             
                         });
                        
                         
                     
                     } }).start();
                 }
             
             
             
///////////////////////////////////REGISTER METHOD /////////////////////////////////////
             @Override
             public void register(Model_Register data,eventmessage message) {
                     Service.getInstance().getClient().emit("register",data.toJsonObject(),new Ack(){
                         
                         
       /////// IMPLEMENT ACK INTERFACE OF CALL METHOD//////////////
                       @Override
            public void call(Object... os) {
                if(os.length>0){
                    Model_Message ms=new Model_Message((boolean) os[0],os[1].toString());
                   
                     if (ms.isAction()) {
                                Model_User_Account user = new Model_User_Account(os[2]);
                                Service.getInstance().setUser(user);    
                            }
                      message.callMessage(ms);
                      }
                 } });
          /////////////////////////////////////////////////////
             }
/////////////////////////////////GOREGISTER METHOD()///////////////////////////////
             @Override
             public void goRegister() {
                 slide.show(1);
             }
///////////////////////////////////GOLOGIN MEYHOD()//////////////////

             @Override
             public void goLogin() {
                 slide.show(0);
             }     
         });
         
  //////////////////////////////////////////////////////////////////////////////////       
        P_Login login = new P_Login();
        P_Register register = new P_Register();
        slide.init(login, register);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.PictureBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        slide = new swing.PanelSlide();

        setBackground(new java.awt.Color(254, 255, 249));

        pic.setBackground(new java.awt.Color(244, 247, 232));
        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/appIcon/Capture.PNG"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(160, 188, 46));
        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(150, 163, 98));
        jLabel2.setText("Yabi Chat Application");
        pic.add(jLabel2);
        jLabel2.setBounds(30, 440, 350, 32);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(25, 61, 55));

        slide.setBackground(new java.awt.Color(150, 163, 98));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addComponent(pic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private swing.PictureBox pic;
    private swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
