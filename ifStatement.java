public class ifStatement {

public static void main(String args[]){
        
        int a, b, c; //Variáveis instanciadas em sequência.
        a = 2; 
        b = 3;
        
        System.out.println("A = 2");
        System.out.println("B = 3");

        //Três testes de IF. somente um vai passar, por que os outros são falso.
        if (a<b) System.out.println("A is less then B.");
        if (a==b) System.out.println("A is equal to B");
        if (a>b) System.out.println ("A is greater then B");
        
        System.out.println(); //imprime uma linha em branco no terminal

        c = b - a;

        System.out.println("C variable contains 1");
        
        //outro teste. somente um dos testes é verdadeiro.
        if (c >= 0) System.out.println("C is non-negative.");
        if (c<0) System.out.println("C is negative.");


}

}