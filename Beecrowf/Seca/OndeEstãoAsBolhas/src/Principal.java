class Principal{

     //Método BOLHA (BUBBLESORT)
     public static void bubblesort(int [] vetor, int TAM){
        boolean houveTroca = true;
        for(int rep = 0; rep < TAM-1 && houveTroca; rep++){
            houveTroca = false;
            for(int b = 0; b < TAM-(rep + 1); b++){
                if (vetor[b] > vetor[b + 1]) {
                    //Swap
                    int tmp = vetor[b];
                    vetor[b] = vetor[b+1];
                    vetor[b+1] = tmp;
                    houveTroca = true;
                }
            }
        }
    }//end BubbleSort()

    //Metodo criar Vetor
    public static void vetor(int [] vetor, int TAM){
        for(int i = 1; i <= TAM; i++){
            vetor[i-1] = i;
        }
    }


    public static void main(String[] args) {
        
    }
}