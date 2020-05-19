import java.util.Scanner;

public class nthCatalanNumber {
    public static int Catalan(int n){
        int catalan[] = new int[n+2];
        int i,j;

        catalan[0] = 1;
        catalan[1] = 1;

        for(i=2 ; i<=n ; i++){
            catalan[i]= 0;
            for (j=0; j<i; j++){
                catalan[i] = catalan[i]+ (catalan[j] * catalan[i-j-1]);
            }
        }
        return catalan[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        System.out.println(n+"th catalan number : "+Catalan(n));
    }
}
