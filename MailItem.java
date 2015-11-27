
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
    //añadir asunto
    private String subject;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from,String to,String subject,String message)
    {
        this.from = from;
        this.to = to;
        this.message = message;
        this.subject = subject;

    }

    /**
     *metodo para saber de donde viene
     */
    public String getFrom()
    {
        return from;

        
    }
    
    /**
     *metodo para saber el asunto
     */
    public String getSubject()
    {
        return subject;

        
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
        System.out.println("Subject " + subject);
        System.out.println("Message: " + message);
    }


}
