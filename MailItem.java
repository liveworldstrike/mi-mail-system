
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    //mensaje de....
    private String from;
    // mensaje para....
    private String to;
    //texto del mensaje
    private String message;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from1,String to2,String message3)
    {
        from = from1;
        to = to2;
        message = message3;

    }

    /**
     *metodo para saber de donde viene
     */
    public String getFrom()
    {
        return from;

        
    }

    /**
     *metodo para saber para quien va 
     */
    public String getTo()
    {
        return to;
        
    }

    /**
     *metodo para saber el mensaje enviado
     */
    public String getMessage()
    {
        return message;

        
    }
    
    /**
     *metodo para inprimir 
     */
    public void print()
    {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
    }


}
