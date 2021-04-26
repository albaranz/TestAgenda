
package agenda;

import agenda.exceptions.ContactoRepetidoException;

public class Main {

    public static void main(String[] args) {
        try {
            Agenda agenda = new Agenda();
            Contacto contacto = new Contacto("", "9999", null);
            agenda.addContacto(contacto);
        } catch (ContactoRepetidoException ex) {
            ex.getMessage();
        }catch (IllegalArgumentException ex){
        
        }
    }
    
}
