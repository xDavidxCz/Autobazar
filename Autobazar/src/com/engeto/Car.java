package com.engeto;

import java.math.BigDecimal;

public class Car {

    private String znackaModel;
    private BigDecimal cena;
    private boolean kProdeji;
    private double prumernaSpotreba;

    public Car(String znackaModel, BigDecimal cena,
               boolean kProdeji, double prumernaSpotreba) {
        this.znackaModel = znackaModel;
        this.cena = cena;
        this.kProdeji = kProdeji;
        this.prumernaSpotreba = prumernaSpotreba;
    }
    public Car() {
        this.znackaModel = "Škoda Octavia";
        this.cena = BigDecimal.valueOf(60000);
        this.kProdeji = true;
        this.prumernaSpotreba = 0.6;
    }
    }
