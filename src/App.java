import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner (System.in);
        
        int a,sum=0;
        System.out.print("Sayı giriniz : ");
        a = inp.nextInt();

        for (int i=1; i<a; i++){
            if (a % i  == 0){
                sum += i;
            }
        }
        if (sum == a ){
            System.out.print(a + " Mükemmel Sayıdır. ");
        }else{
            System.out.println(a + " Mükemmel Sayı Değildir .");
        }
    }
}