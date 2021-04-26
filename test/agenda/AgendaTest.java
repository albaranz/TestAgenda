/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

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
        HashMap<String,Contacto> datosTest = new HashMap();
        Contacto c = new Contacto("alba@gmail", "9999", "alba");
        c.setN(1);
        datosTest.put("alba@gmail",c);
        
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
        Contacto contacto = new Contacto ("lola@mail","8888","lola");
        Contacto expResult = new Contacto ("","","");
        Contacto result = agenda.addContacto(contacto);
        assertEquals(expResult, result);

    }
    @Ignore
    @Test
    public void testAddContactoException() throws Exception {
        System.out.println("addContactoException");
        Contacto contacto = new Contacto("alba@gmail", "9999", "alba");
        Contacto expResult = null;
        Contacto result = agenda.addContacto(contacto);
        assertEquals(expResult, result);

    }

    /**
     * Test of eliminarContacto method, of class Agenda.
     */
    @Ignore
    @Test
    public void testEliminarContacto() throws Exception {
        System.out.println("eliminarContacto");
        String email = "";
        Contacto expResult = null;
        Contacto result = agenda.eliminarContacto(email);
        assertEquals(expResult, result);

    }

    /**
     * Test of buscarContacto method, of class Agenda.
     */
    @Ignore
    @Test
    public void testBuscarContacto() throws Exception {
        System.out.println("buscarContacto");
        String email = "";
        Contacto expResult = null;
        Contacto result = agenda.buscarContacto(email);
        assertEquals(expResult, result);

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
