package agenda;

import agenda.exceptions.ContactoInexistenteException;
import agenda.exceptions.ContactoRepetidoException;
import java.util.ArrayList;
import java.util.HashMap;

public class Agenda {

    private HashMap<String, Contacto> contactos = new HashMap();
    private static int n = 0;

    public Contacto addContacto(Contacto contacto) throws ContactoRepetidoException {
        contacto.contactoCheck();
        if (contactos.containsKey(contacto.getEmail())) {
            throw new ContactoRepetidoException("Ya existe un contacto con email: " + contacto.getEmail());
        }
        n++;
        contacto.setN(n);
        contactos.put(contacto.getEmail(), contacto);
        return contacto;
    }

    public Contacto eliminarContacto(String email) throws ContactoInexistenteException {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Contacto contacto = buscarContacto(email);
        contactos.remove(email);
        return contacto;
    }

    public Contacto buscarContacto(String email) throws ContactoInexistenteException {
        Contacto contacto = null;
        if (!contactos.containsKey(email)) {
            throw new ContactoInexistenteException("No existe ningún contacto con email " + email);
        }
        return contactos.get(email);
    }

    public ArrayList<Contacto> getContactos() {
        ArrayList<Contacto> contactosList = new ArrayList<>();
        contactosList.addAll(contactos.values());
        return contactosList;
    }

    public void setContactos(HashMap<String, Contacto> contactos) {
        this.contactos = contactos;
    }

    public static void setN(int n) {
        Agenda.n = n;
    }

}
