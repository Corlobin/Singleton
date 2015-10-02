/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton;

/**
 *
 * @author Ricardo
 */
public class CodeMaker {
    private static CodeMaker codeMaker;
    private int codeCar;
    private int codeBus;
    
    private CodeMaker(){} // proibido de instanciar
    
    public synchronized static CodeMaker getInstance() {
        if(codeMaker == null) {
            codeMaker = new CodeMaker();
        }
        return codeMaker;
    }
    
    public synchronized int getCodeCar() {
        codeCar = codeCar+1;
        return codeCar;
    }
    
    public synchronized int getCodeBus() {
        codeBus = codeBus+1;
        return codeBus;
    }
            
}
