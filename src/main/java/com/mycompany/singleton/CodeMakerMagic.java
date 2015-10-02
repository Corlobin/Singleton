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
public enum CodeMakerMagic {
    CAR, BUS;
    private int code;
    public synchronized int getCode() {
        code = code+1;
        return code;
    }

}
