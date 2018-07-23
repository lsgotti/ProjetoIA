import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Knn {
	
	//função de calculo de distancia (Euclidiana)
	private static int distancia(int[] a, int[] b) {
		int soma = 0;
		for(int i = 0; i < a.length; i++) {
			soma += (a[i] - b[i]) * (a[i] - b[i]);
		}
		return (int)Math.sqrt(soma); 
	}
	
	
	
}