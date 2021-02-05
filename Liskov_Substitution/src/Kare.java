/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Kare implements AlanHesapla, CevreHesapla{
    private double kenar;

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }
    
    

    @Override
    public double alanhesapla() {
        return kenar*kenar;
    }

    @Override
    public double cevreHesapla() {
        return 4*kenar;
    }

   
   
}
