import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int n = sc.nextInt();
        int count = 0;
            if(n<2){
                System.out.println("n không phải là số nguyên tố");
            }
            else{
                for (int i = 2; i < (n - 1); i++){
                      if (n % i == 0){
                          count++;
                       }   
                 }
            }
            if(count == 0){
                System.out.println("n là số nguyên tố");
            }
            else{
                System.out.println("n không là số nguyên tố");
            }
    }
  
    
}

