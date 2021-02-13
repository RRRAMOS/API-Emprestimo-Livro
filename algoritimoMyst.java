
// Algorítimo para o jogo Myst,  “Puzzle Adventure”, no qual o jogador está preso em uma 
// ilha misteriosa cheia de quebra cabeças que precisam ser resolvidos para avançar em sua
//  aventura. Num dos quebra-cabeças o jogador deve selecionar todos os numero primos
//  existentes na sequência que inicia no número 2 e termina no número 120

package solutions;

public class Myst {

	public static void main(String[] args) {
		
		System.out.println("N�meros primos entre 2 e 120");
		
	     for (int i = 2; i <= 120; i++) {
	            if( ehPrimo(i) )
	                System.out.println(i);
	        }    
	    }
	 
	    private static boolean ehPrimo(int numero) {
	        for (int j = 2; j < numero; j++) {
	            if (numero % j == 0)
	                return false;   
	        }
	        return true;
	    }
	}