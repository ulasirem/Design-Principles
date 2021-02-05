/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Daire implements AlanHesapla, CevreHesapla{
    private double yaricap;

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    
    
    @Override
    public double alanhesapla() {
        return Math.PI * getYaricap() * getYaricap();
    }

    @Override
    public double cevreHesapla() {
        return 6 * getYaricap();
    }
    
}
