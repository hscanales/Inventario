/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Hscanales;

import com.Hscanales.vista.Consulta;
import com.Hscanales.vista.VistaCorto;

/**
 *
 * @author estudiante
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
            new VistaCorto().setVisible(true);
            }
    });

}
}
    