package fr.am.calcul;

import fr.am.calcul.Addition;
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation
 */
public class AdditionTest {
    
    protected Addition operation;

    @Test
    public void testAdditionner() throws Exception {

        operation = new Addition();

        long a = 3;
        long b = 5;
        long r = a + b;

        Assert.assertEquals(r, operation.additionner(a, b));

    } /// testAdditionner
}///Class