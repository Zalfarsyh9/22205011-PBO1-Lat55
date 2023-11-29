/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205011.lat55.java;

import java.util.Scanner;

/*
 *
 * @author User 
 * Nama : Zalfa Rosiyah Riski 
 * Nim : 22205011 
 * Jurusan : Teknik
 * Informatika Mata Kuliah : PBO 1 
 * Deskripsi : membuat program dengan nama Handphone
 */

/**
 * @param args the command line arguments
 */
class Handphone {

    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.println("Manufaktur : " + manufacture);
        System.out.println("OS : " + operatingSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
}

class Android extends Handphone {

    private String keyStore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}

class BlackBerry extends Handphone {

    private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getpinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}

class WindowsPhone extends Handphone {

    private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String WpKeyStore) {
        this.wpKeyStore = WpKeyStore;
    }
}

 public class LAT55Java {

    public static void main(String[] args) {
        //Membuat objek Android
        Android ad = new Android("Samsung", "Android", "Grand", 3000000);
        ad.setKeyStore("234ibfd3840fo");

        ad.displayProduct();
        System.out.println("Android Key Store : " + ad.getKeyStore() + "\n");

        //Membuat objek BlackBerry
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "curve", 2000000);
        bb.setPinBB("BHS249");

        bb.displayProduct();
        System.out.println("Pin : " + bb.getpinBB() + "\n");

        //Membuat objek WindowsPhone
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQIJWORJ");

        wp.displayProduct();
        System.out.println("Wp Key Store : " + wp.getWpKeyStore());
    }
}

