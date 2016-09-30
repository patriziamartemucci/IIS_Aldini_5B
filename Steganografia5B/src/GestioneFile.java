import java.io.*;
public class GestioneFile {
	
	//restituisce la dimensione del file (in byte)
	public static long dimensioneFile(String nomeFile) 
		throws IOException{
			long lunghezzaFile=0;
			RandomAccessFile fin=null;
			fin = new RandomAccessFile(nomeFile, "r");
			//lunghezza in  byte del file di input
			lunghezzaFile=fin.length();
			fin.close();
		return lunghezzaFile;
	}
	
	//Legge il file binario e inserisce i suoi bytes 
	// in un vettore di int
	public static int [] leggiFileBinario(String nomeFile) 
	throws IOException{
		RandomAccessFile finImg = new 
			RandomAccessFile(nomeFile, "r");
		//lunghezza in  byte del file di input
		long lunghezzaFile1=finImg.length();
		// open output file 
		int i;
		int vet[]= new int[(int)lunghezzaFile1];
		for(i=0;i<vet.length;i++){
			vet[i]=finImg.read();
		}
		finImg.close();
		return vet;
	}
	
	
	//Scrive il contenuto del vettore di int[] 
	// in un file binario
	public static void scriviFileBinario(String nomeFile, 
		int vet[]) throws IOException{
		RandomAccessFile foutImg = null;
		int i;
		
		foutImg =new RandomAccessFile(nomeFile, "rw");
			//apre in lettura/scrittura
		
		for(i=0;i<vet.length;i++){
			foutImg.write(vet[i]);

		}
		
		foutImg.close();
	}
	
}
