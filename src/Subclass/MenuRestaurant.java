package Subclass;

import Restaurant.Menu;



public class MenuRestaurant extends Menu {
//3atribut


    @Override
    public void setNamamakanan(String namamakanan) {
        super.setNamamakanan(namamakanan);
    }

    @Override
    public void setNamaminuman(String namaminuman) {
        super.setNamaminuman(namaminuman);
    }

    public String namapelanggan;

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getMetodepembayaran() {
        return metodepembayaran;
    }

    public void setMetodepembayaran(String metodepembayaran) {
        this.metodepembayaran = metodepembayaran;
    }

    public String getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(String totalharga) {
        this.totalharga = totalharga;
    }

    public String metodepembayaran;
    public String totalharga;

    public MenuRestaurant(){
        this.namapelanggan="";
        this.metodepembayaran="";
        this.totalharga="";
        System.out.println("Terimakasih");

    }

    //2method
    public void strukpembayaran(){
        System.out.println("======================================");
        System.out.println("Nama Pelanggan  : "+namapelanggan);
        System.out.println("MetodePembayaran : "+metodepembayaran);
        System.out.println("======================================");
    }
    public void Pembayaran(){
        System.out.println("=====================================");
        System.out.println("Total Harga Yang Harus Dibayar : Rp. "+totalharga);
    }






}




