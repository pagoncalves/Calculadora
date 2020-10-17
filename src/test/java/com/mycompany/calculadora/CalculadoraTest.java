/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

      @Test
    public void testSoma() {
      double soma = Calculadora.soma(25.5, 35.6);
          assertEquals(61.0, soma,1.1);
             
    
}
    
    public void testMult(){
        double mult = Calculadora.mult(55.5, 47.0);
        assertEquals(55.5*47.0, mult,1.1) ; 
    }
    
    public void testDiv() {
        double div = Calculadora.div(16.0, 4.0);
        assertEquals(4.0, div, 0.1);
    }
}
