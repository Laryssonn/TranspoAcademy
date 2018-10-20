package br.com.cursojava.aula005;

public class Exercicio003 {

	public static void main(String[] args) {
		int[][] matriz = {{10,9,8,7},{6,5,4,3},{2,1,2,3},{4,5,6,7}};
		int[][] matrizNova = new int[4][4];
		double[][] matrizMulti = new double[4][4];
		int soma = 0;
		for(int x = 0; x < matriz.length; x++){
			for(int y =0;y < matriz[x].length;y++){
				soma += matriz[x][y];
			}
		}
		System.out.println("*******************************************");
		for(int[] x : matriz){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		System.out.println("Soma de todos os valores da Matriz: "+soma);
		System.out.println("*******************************************");
		System.out.println("Diagonal Principal:");
		for(int x =0;x < matriz.length;x++){
			System.out.print(matriz[x][x]+ ", ");
		}
		System.out.println("\n*******************************************");
		System.out.println("Diagonal Secundária");
		int indice = matriz.length -1;
		for(int x =0;x < matriz.length;x++){
			System.out.print(matriz[x][indice--]+ ", ");
		}
		System.out.println("\n*******************************************");
		System.out.println("Nova Matriz");
		for(int x = 0; x < matriz.length; x++){
			for(int y =0;y < matriz[x].length;y++){
				matrizNova[x][y] = matriz[x][y] * matriz[x][x];
			}
		}
		for(int[] matrizIndice : matrizNova){
			for(int ma : matrizIndice){
				System.out.print(ma+" ");
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		indice = matriz.length -1;
		for(int x = 0; x < matriz.length; x++){
			for(int y =0;y < matriz[x].length;y++){
				matrizMulti[x][y] = matriz[x][y];
				if(y > x){
					matrizMulti[x][y] *= matriz[x][indice];
				}
				if(y < x){
					matrizMulti[x][y] *= matriz[x][x];
				}
				
				
			}
			matrizMulti[x][x] = Math.pow(matrizMulti[x][x], 3);  
			indice--;
		}
		for(int[] x : matriz){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		
		for(double[] matrizM : matrizMulti){
			for(double matrizVisual : matrizM){
				System.out.print(String.format("|%-5.0f",matrizVisual));
			}
			System.out.print("|");
			System.out.println();
		}
		

	}

}
