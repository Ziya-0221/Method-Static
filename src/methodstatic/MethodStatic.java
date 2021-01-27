
package methodstatic;


public class MethodStatic {

    
    public static void main(String[] args) {
        //memanggil method
        biodata();
        RataRata();
    }
    
    //variabel method
    static  int mat=90,BIng=84,ProRPL =88,rata;
    
    //method 1
    static void biodata(){
        String nama ="Ziya Indi";
        String kelas = "X RPL 2";
        System.out.println("Nama: "+nama);
        System.out.println("Kelas : "+kelas);
    }
    
    
    //method 2   
    static int RataRata(){
        
        rata =  (mat+BIng+ProRPL)/3;
        System.out.println("Nilai Rata-Rata : "+rata);
        return rata;
    }
}
