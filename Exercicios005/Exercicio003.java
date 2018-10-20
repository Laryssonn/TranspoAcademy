import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		double[] notas = new double[10];
		double media = 0;int maior=0;	
		for(int x = 0 ; x < notas.length;x++){
			System.out.println("Informe a nota");
			notas[x] = Double.parseDouble(teclado.nextLine());
			media += notas[x];
		}
		for(int x = 0 ; x < notas.length;x++){
			if(notas[x] >= (media/ 10)){
				maior++;
			}
		}
		double[] maiores = new double[maior];
		double[] menores = new double[10 - maior];
		maior = 0;
		for(int x = 0 ; x < notas.length;x++){
			if(notas[x] >= (media/ 10)){
				maiores[maior] = notas[x];
				maior++;
			}			
		}
		maior = 0;
		System.out.println("Média: "+ media / 10);
		for(int x = 0 ; x < notas.length;x++){
			if(notas[x] < (media/ 10)){
				menores[maior] = notas[x];
				maior++;
			}		
		}
		System.out.printf("Média: %f \n",(media / 10));
		System.out.println("****************************");
		System.out.println("Array de Menores:");
		for( double menor : menores){
			System.out.println(menor);
		}
		System.out.println("****************************");
		System.out.println("Array de Maiores");
		for(double maioral : maiores){
			System.out.println(maioral);
		}
		teclado.close();
	}

}
