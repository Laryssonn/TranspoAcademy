import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);	
		String[] produtos = new String[20];int indice = 0;
		
		inicio:
		for(int x = 0; x < produtos.length; x++){
			System.out.println("Informe o nome do produto");
			String produto = teclado.nextLine();
			indice = x;
			while(indice >= 0){
				if(produtos[indice] != null && produtos[indice].equalsIgnoreCase(produto)){
					System.out.println("Produto j� cadastrado!!!");
					x--;
					continue inicio;
				}
				indice--;
			}
			produtos[x] = produto;
		}
		
		System.out.println("Informe o nome do produto que voc� quer selecionar");
		String produto = teclado.nextLine();
		
		while(!"Sair".equalsIgnoreCase(produto)){
			for(int x = 0; x < produtos.length; x++){
				if(produtos[x].equalsIgnoreCase(produto)){
					System.out.println("Produto cadastrado");
					break;
				}
				if(x == (produtos.length -1)){
					System.out.println("Produto informado n�o foi cadastrado!!!");
				}
			}
			
			System.out.println("Informe o nome do produto que voc� quer selecionar");
			produto = teclado.nextLine();
		}
		teclado.close();

	}

}
