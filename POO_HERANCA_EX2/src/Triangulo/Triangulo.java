/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;

import FigurasGeometricas.Figura;

/**
 *
 * @author Roberto Leite
 */
public class Triangulo extends Figura {
    
    public Triangulo(String nome, float altura, float base) {
        super(nome, altura, base);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public float getAltura() {
        return altura;
    }

    @Override
    public float getBase() {
        return base;
    }
    
    @Override
    public float calculaArea(){
        
        area = (this.getAltura() * this.getBase()/2);
        return area;
        
    }
    
    
    
    
}
