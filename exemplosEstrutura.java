package estrutura_controle;

public class exemplosEstrutura {

        public static void main(String[] args) {
    
        // 1 - if - else (condicionais)

        // operadores de comparação 
        // x==y, x!=y, x>y, x<y, x>=y, x<=y

        int idade = 18;

        //  if -> começa  a condicao 
        // () -> contem a condição a ser avaliada
        // {} -> corpo da condição
    
        if (idade >= 18) {
        System.out.println("Você é maior de idade. Pode entrar!");

        //separador de blocos    
        System.out.println("----------------------------------------");

        double nota = 6.3;

        if (nota >= 7) {
            System.out.println("Você foi aprovado, parabéns!");
        } else {
            System.out.println("Você foi reprovado, tente novamente na recuperação!");
        }

        }
        System.out.println("----------------------------------------");

        // else if -> intermediario do if e else, para avaliar mais de uma condição
        // e ele valida blocos também 

        int hora = 19;

        if (hora < 12) {
            System.out.println("Bom dia!");

        } else if (hora < 18) {
            System.out.println("Boa tarde!");

        } else {
            System.out.println("Boa noite!");
        }

         System.out.println("----------------------------------------");

         // 2 - operadores complementares 

        int x = 10;
        int y = 05;

        // = atribuição
        // == igualdade

        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true
        System.out.println("x > y: " + (x > y)); // true
        System.out.println("x < y: " + (x < y)); // false
        System.out.println("x >= y: " + (x >= y)); // true
        System.out.println("x <= y: " + (x <= y)); // false

        // operadores lógicos

        // && -> AND -> op1 && op2 -> boolean -> aplica quando as a op são true
        // || -> OR -> (true) op1 || op2 -> boulean -> usa quando alguma das op é true
        // ! -> NOT -> !valor -> altera o valor booleano para o oposto -> true <> false
       
        boolean TemDinheiro = true;
        boolean TemTempo = false;

        if ( TemDinheiro && TemTempo) {
            System.out.println(" Pode viajar! ");
        } else {
            System.out.println(" Não pode viajar! ");
        }

        // ! -> NOT
        if ( !TemTempo ) {
            System.out.println(" Não tem tempo disponível! ");
        } else {
            System.out.println(" Tem tempo disponível! ");
        }   
        
        
        System.out.println("----------------------------------------");

        // Loops - While e For
        // FOCO em FOR
        // Repetir algo até uma condição ser atendida
        // evita repeditção mecanica de código

        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++; // contador = contador + 1 
            
        }

        // Se eu não tenho uma condiução de encerramento de loop
        //eu caio em loop infinito. 

        //iteração = cada repetição do loop

        System.out.println("----------------------------------------");
        
        // sintexa do FOR

        for (int i = 1; i <= 5; i++){ 
            System.out.println("valor de i é: " + i);

        }
        
        
        }

    }

