import java.util.Scanner;

public class exercicio3 {

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
		
		if (colunas == linhas2) {
			int matriz1[][] = new int[linhas][colunas];
			int matriz2[][] = new int[linhas2][colunas2];
			int matriz3[][] = new int[linhas][colunas2];

			for (int i = 0; i < matriz1.length; i++) {
			    for (int j = 0; j < matriz1[i].length; j++) {
			    	System.out.println("Digite o " +  (i+1) + "valor da matriz 1");
			        matriz1[i][j] = scanner.nextInt(); 
			    }
			}

			for (int i = 0; i < matriz2.length; i++) {
			    for (int j = 0; j < matriz2[i].length; j++) {
			    	System.out.println("Digite o " +  (i+1) + "valor da matriz 2");
			        matriz2[i][j] = scanner.nextInt(); 
			    }
			}

			//multiplicação das matrizes
			for(int i=0; i<matriz3.length; i++){
			    for(int j=0; j<matriz3[i].length; j++){
			        for(int k=0; k<matriz3[i].length; k++){
			            matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
			        }
			    }
			}
			for (int i = 0; i < linhas; i ++) {
				System.out.println("");
				for (int j =0; j< colunas2; j ++) {
					System.out.print(matriz3[i][j] + " ");
						
				}
			}

		}
		else{
			System.out.println("não vai ser possivel realizar a multiplicação");
		}
		

	}

}
