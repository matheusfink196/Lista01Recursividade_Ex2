package controller;

public class MenorController {
	public MenorController() {
		super();
	}
	
	public int vetmenor(int vet[], int i, int men) {
		
		if (i<0) {
			return men;
//ponto de saida = o contador(tamanho do vetor) chega a zero e retorna o menor valor
		}
		 if (vet[i] < men) {
// passo = guarda o menor numero enquanto passa pelo vetor até chegar a contagem de zero				
				men = vet[i];
			}
				return vetmenor (vet, i - 1, men);
						
		}
}

