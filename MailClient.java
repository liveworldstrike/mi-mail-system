
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // servidor asociado con el cliente
    private MailServer server;
    //direccion de correo que tiene ese usuario
    private String user;

    /**
     * Constructor for objects of class MailClient
     */
    public MailClient( MailServer server1,String user2)
    {
        server = server1;
        user = user2;

    }

    /**
     * para saber si lo a enviado 
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }

    /**
     * imprimir los datos del mensaje completo y si no tiene contenido de message
     */
    public void printNextMailItem()

    {
        MailItem item = server.getNextMailItem(user);
        if (item == null){
            System.out.println("no hay mensaje");
        }
        else{
            item.print();
        }

    }

    /**
     * para enviar un correo a una persona 
     */
    public void sendMailItem(String to, String message)
    {
        MailItem item = new MailItem(user,to,message);
        server.post(item);

    }
}
