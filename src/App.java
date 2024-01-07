import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int par= 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            if(a%2 == 0){
                par++;
            }else{
                impar++;
            }
            if(a > 0){
                positivo++;
            }else if(a < 0){
                negativo++;
            }

        }

        sc.close();
        System.out.println(par +" valor(es) par(es)");
        System.out.println(impar +" valor(es) impar(es)");
        System.out.println(positivo +" valor(es) positivo(s)");
        System.out.println(negativo +" valor(es) negativo(s)");
    }
}
