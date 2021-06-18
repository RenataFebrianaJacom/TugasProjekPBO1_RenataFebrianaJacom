package object;

import Restaurant.Menu;
import Subclass.MenuRestaurant;

public class aksi {
    public static void main(String[] args) {
        //membuat objek menu makan dan minum


        Menu menu = new Menu();
        menu.nama ="Renata Febriana Jacom";
        menu.npm = "19630453";
        menu.kelas = "4C REGULER PAGI BANJARBARU";

        Menu mkn = new Menu();
        mkn.mk1 ="Kepiting Saos Tiram";
        mkn.mk2 ="Udang Bakar";
        mkn.mk3 ="Lobster Balado";
        mkn.mk4 ="Kerang Panggan";
        mkn.menumakanann();

        Menu mnm = new Menu();
        mnm.mn1 = "Jus Mangga";
        mnm.mn2 = " Es Buah";
        mnm.mn3 = " Es Campur";
        mnm.mn4 = " Jus Alpukat";
        mnm.menuminuman();

        Menu hrgmkn = new Menu();
        hrgmkn.hm1 = " Rp.78.000";
        hrgmkn.hm2 = " Rp.50.000";
        hrgmkn.hm3 = " Rp.86.000";
        hrgmkn.hm4 = " Rp.56.000";
        hrgmkn.hargamakanan();

        Menu hrgmnm = new Menu();
        hrgmnm.hmnm1 = "Rp.12.000";
        hrgmnm.hmnm2 = "Rp.8.000";
        hrgmnm.hmnm3 = "Rp.7.000";
        hrgmnm.hmnm4 = "Rp.13.000";
        hrgmnm.hargaminuman();

        Menu m = new Menu();
        m.namamakanan = "Kepiting Saous Tiram";
        m.namaminuman = " Mangga ";
        m.jumlahmakanan = " 1 ";
        m.jumlahminuman = " 1 ";
        m.jenismakanan = " Seafood ";
        m.jenisminuman = " Jus ";
        m.hm1 = " Rp.78.000";
        m.hmnm1 = " Rp.12.000";
        m.tampilkanMenu();



        MenuRestaurant a = new MenuRestaurant();
        //menambahkan 3 atribut
        a.namapelanggan = " Renata Febriana Jacom ";
        a.metodepembayaran = " Cash ";
        a.strukpembayaran();

        MenuRestaurant x = new MenuRestaurant();
        x.totalharga = "90.000";
        x.Pembayaran();







    }
}
