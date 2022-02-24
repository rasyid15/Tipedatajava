
package tugas_1_tipedata_m.rasyid.ridho;
public class TUGAS_1_TIPEDATA_MRASYIDRIDHO {
    public static void main(String[] args) {
       
        
        //Menghitung luas segitiga = 0,5 * alas * tinggi
        int  alas, tinggi, tinggiLimas, volumeLimasSegitiga;
        alas = 10;
        tinggi = 7;
        tinggiLimas = 12;
        volumeLimasSegitiga= ((( alas * tinggi)/2) * tinggiLimas)/3;
        
       System.out.println("alas = "+alas);
       System.out.println("tinggi = "+tinggi);
       System.out.println("tinggi limas = "+tinggiLimas);
       System.out.println("volumeLimasSegitiga = "+volumeLimasSegitiga); 
       /* tinggi yang dimaksud pada rumus adalah tinggi pada alas segitiga
      sedangkan untuk tinggi limas, sudah saya tulis tinggiLimas */  
    }   
}
