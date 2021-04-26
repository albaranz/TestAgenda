/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import agenda.exceptions.ContactoInexistenteException;
import agenda.exceptions.ContactoRepetidoException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author CES
 */
public class AgendaTest {

    private static Agenda agenda;

    public AgendaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        agenda = new Agenda();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        HashMap<String, Contacto> datosTest = new HashMap();
        Contacto c = new Contacto("alba@gmail", "9999", "alba");
        c.setN(1);
        datosTest.put("alba@gmail", c);

        Contacto b = new Contacto("luis@mail", "1111", "luis");
        b.setN(2);
        datosTest.put("luis@mail", b);

        Contacto a = new Contacto("paula@mail", "2222", "paula");
        a.setN(3);
        datosTest.put("paula@mail", a);

        agenda.setContactos(datosTest);
        agenda.setN(3);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addContacto method, of class Agenda.
     */
    @Test
    public void testAddContacto() throws Exception {
        System.out.println("addContacto");
        Contacto contacto = new Contacto("lola@mail", "8888", "lola");
        Contacto result = agenda.addContacto(contacto);

        Contacto expResult = new Contacto("lola@mail", "8888", "lola");
        expResult.setN(4);
        assertEquals(expResult, result);
    }

    @Test(expected = ContactoRepetidoException.class)
    public void testAddContactoRepetidoException() throws Exception {
        System.out.println("addContactoRepetidoException");
        Contacto contacto = new Contacto("alba@gmail", "9999", "alba");
        agenda.addContacto(contacto);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddContactoIllegalArgumentException() throws Exception {
        System.out.println("addContactoIllegalArgumentException");
        Contacto contacto = new Contacto("", "9999", null);
        agenda.addContacto(contacto);

    }

    /**
     * Test of eliminarContacto method, of class Agenda.
     */
    @Test
    public void testEliminarContacto() throws Exception {
        System.out.println("eliminarContacto");
        String email = "luis@mail";
        Contacto result = agenda.eliminarContacto(email);

        Contacto expResult = new Contacto("luis@mail", "1111", "luis");
        expResult.setN(2);
        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteContactoIllegalArgumentException() throws Exception {
        System.out.println("deleteContactoIllegalArgumentException");
        agenda.eliminarContacto("");
    }

    @Test(expected = ContactoInexistenteException.class)
    public void testDeleteContactoInexistenteException() throws Exception {
        System.out.println("deleteContactoRepetidoException");
        agenda.eliminarContacto("hola@mail");
    }

    /**
     * Test of buscarContacto method, of class Agenda.
     */
    @Test
    public void testBuscarContacto() throws Exception {
        System.out.println("buscarContacto");
        String email = "paula@mail";
        Contacto result = agenda.buscarContacto(email);

        Contacto expResult = new Contacto("paula@mail", "2222", "paula");
        expResult.setN(3);

        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBuscarContactoIllegalArgumentException() throws Exception {
        System.out.println("buscarContactoIllegalArgumentException");
        agenda.eliminarContacto("");
    }

    @Test(expected = ContactoInexistenteException.class)
    public void testBuscarContactoInexistenteException() throws Exception {
        System.out.println("buscarContactoRepetidoException");
        agenda.eliminarContacto("alba@mail");
    }

    /**
     * Test of getContactos method, of class Agenda.
     */
    @Ignore
    @Test
    public void testGetContactos() {
        System.out.println("getContactos");
        ArrayList<Contacto> expResult = null;
        ArrayList<Contacto> result = agenda.getContactos();
        assertEquals(expResult, result);

    }

}
