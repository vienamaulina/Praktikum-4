public class Persegi {
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public float luas(){
        return this.sisi*this.sisi;
    }

    public float keliling(){
        return this.sisi*4;
    }
}
