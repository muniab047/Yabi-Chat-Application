
package event;


public class PublicEvent {

    /**
     * @return the eventMenuLeft
     */
   

    /**
     * @param eventMenuLeft the eventMenuLeft to set
     */
   
    private static PublicEvent instance;
    private EventMain eventMain;
    private EventChat eventChat;
    private EventLogin eventLogin;
    private EventMenuLeft eventMenuLeft;
       

    public static PublicEvent getInstance() {
        if (instance == null) {
            instance = new PublicEvent();
        }
        return instance;
    }

    private PublicEvent() {

    }
    public void addEventMain(EventMain event){
        this.eventMain= event;
    }

   

    public void addEventChat(EventChat event) {
        this.eventChat = event;
    }
    
    public void addEventLogin (EventLogin event){
        this.eventLogin = event;
    }
     public void addEventMenuLeft(EventMenuLeft event) {
        this.eventMenuLeft = event;
    }
    public EventMain getEventMain(){
        return eventMain;
    }

  

    public EventChat getEventChat() {
        return eventChat;
    }
    
    public EventLogin getEventLogin(){
        return eventLogin;
    }
     public EventMenuLeft getEventMenuLeft() {
        return eventMenuLeft;
    }
    
    
    
    
}
