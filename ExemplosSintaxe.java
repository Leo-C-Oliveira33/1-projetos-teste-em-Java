package sintaxe_basica;

public class ExemplosSintaxe {
    public static void main(String[] args) {

        // 1 - impressão de texto
        System.out.println("Teste de impressão " + 45);

        // separando os exemplos
        System.out.println("---------------------"); 

        // 2 - tipos primitivos
        // variaveis = espaço na memória para armazenar um valor (dados)

        // tipo inteiro = int
        int idade = 29; 
        int anoAtual = 2026;    
        
        System.out.println("Minha idade é: " + idade + " anos");
        System.out.println("O ano é: " + anoAtual);

        // separando os exemplos
        System.out.println("---------------------"); 

        // tipo decimal = double
        double altura = 1.73;
        double pi = 3.14;
        System.out.println("Minha altura é: " + altura + " metros" + " e o valor de pi é: " + pi);

          // separando os exemplos
        System.out.println("---------------------"); 

        // tipo texto = String 
        String nome = "Leonardo";
        System.out.println("Meu nome é: " + nome);

         // separando os exemplos
        System.out.println("---------------------");

        // tipo booleano = true ou false
        boolean estaLogado = true;
        boolean temAcesso = false;
        System.out.println("O usuário está logado? " + estaLogado);
        System.out.println("O usuário tem acesso? " + temAcesso);

        // separando os exemplos
        System.out.println("---------------------");

        // 3 - Variaveis 
        int numero;
        numero = 10; // atribuição de valor
        System.out.println("O número é: " + numero);

        numero = 20; // reatribuição de valor
        System.out.println("O número agora é: " + numero);

        // A atribuição de valor pode ser feita no mesmo tipo de variável
        // numero = "teste" // isso causaria um erro de compilação, pois "teste" é uma String e numero é do tipo int

         // separando os exemplos
        System.out.println("---------------------");

        // 4 - Operadores básicos
        int a = 10;
        int b = 5;
    
        // prioridade na resolução do operadores entre parênteses

        System.out.println("A + B = " + (a + b)); //  soma
        System.out.println("A - B = " + (a - b)); //  substrção
        System.out.println("A * B = " + (a * b)); // multiplicação
        System.out.println("A / B = " + (a / b)); // divisão

        // usando doble para mostrar resultado decimal
        double c = 10;
        double d = 3;
        
        System.out.println("C / D = " + (c / d)); // divisão com resultado decimal

        // ou usando a conversão 
        System.out.println("A / B = " + ((double) a / b)); // divisão com resultado decimal usando conversão

         // separando os exemplos
        System.out.println("---------------------");

        // operadores de decremento e incremento
        int contador = 0;

        contador ++; // contador = contador + 1
        System.out.println("Valor Contador: " + contador);

        contador --; // contador = contador - 1
        contador --; // contador = contador - 1
        contador --; // contador = contador - 1
        System.out.println("Valor Contador: " + contador);

        // op. compostos
        System.out.println("OP. composto soma " + ( a += 5));
        System.out.println("OP. composto Subtração " + ( a -= 5));
        System.out.println("OP. composto multiplicação " + ( a *= 5));
        System.out.println("OP. composto divisão " + ( a /= 5));

        // separando os exemplos
        System.out.println("---------------------");

        

    }
}
