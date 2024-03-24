package Pertemuan5;

public class Faktorial16 {
    
    int nilai;

    int FaktorialBF(int n){
        int fakto = 1, i = 1;
        while (i <= n) {
            fakto = fakto*i;
            i++;
        }
        return fakto;
    }
    int FaktorialDC(int n){
        if (n==1) {
            return 1;
        }else{
            int fakto = n * FaktorialDC(n-1);
            return fakto;
        }
    }
}
