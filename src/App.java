import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int contador= 0;

        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            if(a%2 == 0){
                contador++;
            }
        }

        sc.close();
        System.out.println(contador +" valores pares");
    }
}
