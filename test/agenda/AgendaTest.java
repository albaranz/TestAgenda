/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CES
 */
public class AgendaTest {
    
    public AgendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
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
        Contacto contacto = null;
        Agenda instance = new Agenda();
        Contacto expResult = null;
        Contacto result = instance.addContacto(contacto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarContacto method, of class Agenda.
     */
    @Test
    public void testEliminarContacto() throws Exception {
        System.out.println("eliminarContacto");
        String email = "";
        Agenda instance = new Agenda();
        Contacto expResult = null;
        Contacto result = instance.eliminarContacto(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarContacto method, of class Agenda.
     */
    @Test
    public void testBuscarContacto() throws Exception {
        System.out.println("buscarContacto");
        String email = "";
        Agenda instance = new Agenda();
        Contacto expResult = null;
        Contacto result = instance.buscarContacto(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactos method, of class Agenda.
     */
    @Test
    public void testGetContactos() {
        System.out.println("getContactos");
        Agenda instance = new Agenda();
        ArrayList<Contacto> expResult = null;
        ArrayList<Contacto> result = instance.getContactos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
