/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton.application;

import com.mycompany.singleton.CodeMaker;
import com.mycompany.singleton.CodeMakerMagic;

/**
 *
 * @author Ricardo
 */
public class Application {
    public static void main(String args[]) {
        CodeMaker code1 = CodeMaker.getInstance();
        System.out.println(code1.getCodeCar());
        CodeMaker code2 = CodeMaker.getInstance();
        System.out.println(code1.getCodeCar());
        System.out.println(code1.getCodeBus());
        System.out.println(code1.getCodeBus());
    
        System.out.println("Car "+ CodeMakerMagic.CAR.getCode());
        System.out.println("Car "+ CodeMakerMagic.CAR.getCode());
        System.out.println("BUS "+ CodeMakerMagic.BUS.getCode());
        System.out.println("BUS "+ CodeMakerMagic.BUS.getCode());
        
    
    }
}
