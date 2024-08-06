/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_ejercicio_23;

/**
 *
 * @author Alejandro Bernal
 */
public class Soluciones {
    double A;
    double B;
    double C;
    public Soluciones(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    double solucion1() {
        return  (-B + Math.sqrt((B*B)-(4*A*C)))/2*A;
    }
    double solucion2() {
        return (-B - Math.sqrt((B*B)-(4*A*C)))/2*A;
    }
}