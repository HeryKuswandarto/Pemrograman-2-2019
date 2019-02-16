package id.ac.stmik;
public class SelectionSort {
    public static void main(String[] args) {
        //Pengambilan nilai dari argumen
        int[] nilai = new int [args.length];
        for (int i=0; i<args.length;i++){
            nilai[i]=Integer.parseInt(args[i]);
        }
        
        //Proses Sort
        for (int j=0; j<nilai.length;j++){
            int iMin =j;
            for (int i=j+1; i<nilai.length; i++){
                if (nilai[i] < nilai[iMin]){
                    iMin=i;
                }
            }
            if(iMin !=j){
                int temp = nilai[iMin];
                nilai[iMin] = nilai[j];
                nilai[j] = temp;
            }
        }
        //Cetak 3 nilai terbesar
        for (int j=nilai.length;j>(nilai.length-3);j--){
            System.out.println(nilai[j-1]);
        }
    }    
}
