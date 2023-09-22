import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int cont = 1;

        while(T-- > 0){
            String vet[] = new String[100];
            String s = sc.next();
            int    x = s.length();
            int    i = 0;
            char   c = s.charAt(x-1);
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vet[i] = ("Case #" + cont + ": " + s + " is ruled by Alice.");
                i++;
            }else if( c == 'y'){
                vet[i] = ("Case #" + cont + ": " + s + " is ruled by nobody.");
                i++;
            }else{
                vet[i] = ("Case #" + cont + ": " + s + " is ruled by Bob.");
                i++;
            }
            cont++;
            //Mostar
            for(int y = 0; y<i; y++){
                System.out.println(vet[y]);
            }
        }
    }
}

/*
System.out.println("Case #" + cont + ": " + s + " is ruled by Alice.");
System.out.println("Case #" + cont + ": " + s + " is ruled by nobody.");
System.out.println("Case #" + cont + ": " + s + " is ruled by Bob.");
*/
