/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.arbolactivador;

import com.froi.arbolactivador.gramaticas.GramaticaLexer;
import com.froi.arbolactivador.gramaticas.GramaticaParser;
import java.io.StringReader;
import javax.swing.JOptionPane;

/**
 *
 * @author froi-pc
 */
public class Analizador {
    
    public void analizar(String entrada) {
        StringReader reader = new StringReader(entrada);
        GramaticaLexer lexer = new GramaticaLexer(reader);
        GramaticaParser parser = new GramaticaParser(lexer);
        try {
            parser.parse();
            JOptionPane.showMessageDialog(null, "Gramática analizada con éxito");
        } catch (Exception e) {
            System.err.println("Error al leer gramática: error irrecuperable");
            JOptionPane.showMessageDialog(null, "Error al leer gramática");
        }
    }
    
}
