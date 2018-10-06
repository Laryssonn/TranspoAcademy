package br.com.cursojava.aula004;

public class ExemploFor {

	public static void main(String[] args) {
		 for(int x  = 1; x <= 10;x++){
			 System.out.println(x+ " ");
		 }
		 System.out.println("");
		 int pos  = 0;
		 String mensagem = "Brasil";
		 for(;pos < mensagem.length(); pos++){
			 System.out.println(mensagem.charAt(pos) + " - ");
		 }
		 System.out.println("");
		 
		 boolean continuar = true;
		 int qt = 10;
		 for(;continuar;){
			 System.out.println(qt+" ");
			 qt--;
			 continuar = qt > 0;
		 }
		 System.out.println("");
		 for(;;){
			 System.out.println(qt + " ; ");
			 qt++;
			 if(qt > 10){
				 break;
			 }
		 }
		 for(int i = 1;i <= 10;i++){
			 if(i % 2 ==0){
				 continue;
			 }
			 System.out.print(i+" ");
		 }
		 
	}

}
