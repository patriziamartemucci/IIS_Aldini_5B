import java.io.IOException;

public class TestGestioneFile {
	public static void main(String[] args) throws IOException {
			//esempio di utilizzo della classe GestioneFile
	
			//calcolo la lunghezza del file testo.txt
			long lunghezzaFile=GestioneFile.dimensioneFile("testo.txt");
			System.out.println("Lunghezza file: "+lunghezzaFile);
			//leggo il file e inserisco il suo contenuto in un vettore di int
			int vet[]=GestioneFile.leggiFileBinario("testo.txt");
			//stampo i byte del file testo.txt
			System.out.println("\nContenuto del file \"testo.txt\"");
			for(int i=0;i<vet.length;i++){
				System.out.print(vet[i]+" ");
			}
			System.out.println();
			System.out.println("\nCopio il contenuto del vettore nel file \"testo2.txt\"");
			GestioneFile.scriviFileBinario("testo2.txt",vet);
			System.out.println("Fine");
			
		}

}
