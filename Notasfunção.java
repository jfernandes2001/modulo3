package notasfunção;
import java.util.Scanner;
public class Notasfunção {
	static int lereescrevernota (int notafinal) {
	Scanner LerS= new Scanner (System.in);
	System.out.print("Qual a nota do aluno?");
	notafinal=LerS.nextInt();
	return notafinal;}
	
	
	public static void main(String[] args) throws Exception {
	int notafinal=0;
	int [] Armario = new int [26];
for (int aluno  = 1; notafinal < 26; aluno++ );
	Armario [aluno] = lereescrevernota(notafinal);		
for (int aluno  = 1; notafinal < 26; aluno++ );	
	System.out.println(aluno +"-" +Armario[aluno]); }}
	




