import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int linhas = 0;
		int colunas = 0;
		int linhas2 = 0;
		int colunas2 = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe suas linhas  da sua primeira matriz por favor:");
		linhas = scanner.nextInt();
		System.out.println("informe suas colunas da sua primeira matriz por favor:");
		colunas = scanner.nextInt();
		
		System.out.println("informe suas linhas da sua segunda matriz por favor:");
		linhas2 = scanner.nextInt();
		System.out.println("informe suas colunas da sua segunda matriz por favor:");
		colunas2 = scanner.nextInt();
		
		if (linhas == linhas2 && colunas == colunas2) {
			
			int matriz1[][] = new int[linhas][colunas];
			int matriz2[][] =  new int[linhas2][colunas2];
			int matriz3[][] = new int [linhas][colunas];
			
			for (int i = 0; i < linhas; i ++) {
				for (int j =0; j< colunas; j ++) {
					System.out.println("Digite o " +  (i+1) + "valor da matriz 1");
					matriz1[i][j] = scanner.nextInt();	
				}
			}
			for (int i = 0; i < linhas; i ++) {
				for (int j =0; j< colunas; j ++) {
					System.out.println("Digite o " +  (i+1) + "valor da matriz 2");
					matriz2[i][j] = scanner.nextInt();	
				}
			}
			for (int i = 0; i < linhas; i ++) {
				for (int j =0; j< colunas; j ++) {
					matriz3[i][j] = matriz1[i][j] + matriz2[i][j];	
				}
			}
			
			for (int i = 0; i < linhas; i ++) {
				System.out.println("");
				for (int j =0; j< colunas; j ++) {
					System.out.print(matriz3[i][j] + " ");
						
				}
			}
		}
		else {
			System.out.println("a soma não pode ser feita pois o número de linhas não são iguais");
		}
	}

}
	