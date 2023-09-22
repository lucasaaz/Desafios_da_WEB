import java.util.Scanner;

import javax.print.attribute.standard.Media;

class No{
    
    int media;
    int qtd;
    No dir;
    No esq;

    No(){
        this(0, 0);
    }

    No(int media, int qtd){
        this.media = media;
        this.qtd = qtd;
        this.dir = this.esq = null;
    }

}

class Arvore{
    
    No raiz;

    Arvore(){
        raiz = null;
    }

    public void inserir(int media, int qtd){
        raiz = inserir(media, qtd, raiz);
    }

    public No inserir(int media, int qtd, No raiz){
        No i = raiz;
        if(i == null){
            i = new No(media, qtd);
        }else if(media > i.media){
            i.dir = inserir(media, qtd, i.dir);           
        }else if(media < i.media){
            i.esq = inserir(media, qtd, i.esq);
        }
        return i;
    }

    public void caminharCentral(){
        caminharCentral(raiz);
    }

    public void caminharCentral(No raiz){
        if(raiz != null){
            caminharCentral(raiz.esq);
            System.out.print(raiz.qtd + "-" + raiz.media + " ");
            caminharCentral(raiz.dir);
        }
    }

}

class Principal{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int controle = -1;// numero para sair da funcao
        int contar   =  1;// numero da cidade

        do{
            //verifica se acabou as entradas
            int controle_interno = sc.nextInt(); 
            //criar arvore de controle
            Arvore av = new Arvore();
            //variaveis para fazer media da cidade
            float mediaGeral = 0;
            float a = 0;
            float b = 0;
            //verifica se acabou as entradas
            controle = controle_interno;

            while(controle_interno-- > 0){

                int numMoradores = sc.nextInt();// numero de moradores 
                int qtdConsumido = sc.nextInt();// consumo final

                int media = qtdConsumido / numMoradores;// media de consumo por pessoa da casa
                a += numMoradores;
                b += qtdConsumido;

                av.inserir(media, numMoradores);

            }

            //calcular media geral por pessoa da cidade
            mediaGeral = b / a;

            if(controle != 0){
                //saida na tela
                System.out.print("Cidade# " + contar++ + ":\n");
                av.caminharCentral();
                System.out.printf("\nConsumo médio: " + "%.2f" + " m3.\n", mediaGeral);
            }

        } while (controle != 0);
    
    }
    
}