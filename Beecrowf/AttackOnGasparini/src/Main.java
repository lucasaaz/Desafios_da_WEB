import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws Exception {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);

        int c = 0;

        while(c < 3){

            int nTitans = sc.nextInt();
            int tParede = sc.nextInt();
            int P = 0;
            int M = 0;
            int G = 0;
     
            String tTitans = sc.next();
    
            for(int i = 0; i < tTitans.length(); i++){
                if(tTitans.charAt(i) == 'P'){
                    P++;
                }else if(tTitans.charAt(i) == 'M'){
                    M++;
                }else if(tTitans.charAt(i) == 'G'){
                    G++;
                }else{
                    throw new Exception("Erro!!");
                }
            }
    
            int pTitans = sc.nextInt();
            int mTitans = sc.nextInt();
            int gTitans = sc.nextInt();
    
            int resp;
            int somaTitans;
    
            somaTitans = (pTitans*P) + (mTitans*M) + (gTitans*G);
    
            if(tParede > somaTitans){
                System.out.println(1);
            }else{
                resp = (somaTitans/tParede) + 1;
                System.out.println(resp);
            }

            c++;
        }
         

    }
 
}