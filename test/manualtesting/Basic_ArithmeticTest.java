/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manualtesting;

import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @authors
 * Piyush Rajendra Chaudhari <piyushrc26@gmail.com>
 * Rohit Balasaheb Bangar    <bangarrohit7057@gmail.com>
 * Shalakha Vijaykumar Bang  <shalakhabang99@gmail.com>
 * Mayuresh Rajesh Dindorkar <dmayuresh99@gmail.com>
 *
 * Project Name: FUN WITH NUMBERS Objective: Swing and AWT based Graphical User
 * Interface Java Application intended for learning Manual Testing.*
 *
 * Date: 05 September 2020. Day: Saturday
 */
public class Basic_ArithmeticTest {

    public Basic_Arithmetic obj;

    public Basic_ArithmeticTest() {
    }

    /**
     * Test of isFloat method, of class Basic_Arithmetic.
     */
    @Test
    public void testIsFloatExpectedTrue() {
        obj = new Basic_Arithmetic();
        assertTrue(Basic_Arithmetic.isFloat("12.3"));
    }

    @Test
    public void testIsFloatExpectedFalse() {
        obj = new Basic_Arithmetic();
        assertFalse(Basic_Arithmetic.isFloat("12.3ssdf sdf"));
    }

    /**
     * Test of acceptFirstInput method, of class Basic_Arithmetic.
     */
    @Test
    public void testAcceptInputExpectedPass() {
        JTextField ipf1 = new JTextField("1 2           3");
        obj = new Basic_Arithmetic();
        assertEquals("123", obj.acceptInput(ipf1));
    }

    @Test
    public void testAcceptInputExpectedFail() {
        JTextField ipf1 = new JTextField("1 2           3 ");
        obj = new Basic_Arithmetic();
        assertEquals("123 ", obj.acceptInput(ipf1));
    }

    @Test
    public void testAddNumbersExpectedPass() {
        obj = new Basic_Arithmetic();
        assertEquals("7.000", obj.addNumbers("3", "4"));
    }

    @Test
    public void testAddNumbersExpectedFail() {
        obj = new Basic_Arithmetic();
        assertEquals("7.000", obj.addNumbers("3.1", "4"));
    }
}
