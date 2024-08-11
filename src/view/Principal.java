package view;
import controller.MenorController;
public class Principal {
	
	public static void main(String args[]) {
		MenorController menCont = new MenorController();
		
		int[] vetor = {5,8,4,2,9,3};
		int tam = vetor.length;
		int menor = vetor[tam-1];
		int valor = menCont.vetmenor(vetor, tam - 1, menor);
		System.out.println(valor);
		
	}
}

