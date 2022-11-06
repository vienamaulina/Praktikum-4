public class Utama extends BangunDatar{
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        Lingkaran lingkaran = new Lingkaran(7); 
        Segitiga segitiga = new Segitiga(4,7);
        Persegi persegi = new Persegi(5);

    //memanggil method luas dan keliling
    bangunDatar.luas();
    bangunDatar.keliling();

    System.out.println("Luas Lingkaran "+lingkaran.luas());
    System.out.println("Keliling Lingkaran "+lingkaran.keliling());
    System.out.println("Luas Segitiga "+segitiga.luas());
    System.out.println("Luas Persegi "+persegi.luas());
    System.out.println("Keliling Persegi "+persegi.keliling());
    }
}
