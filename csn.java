package csn;

import java.util.Scanner;

public class csn {
	
	private static final String ClearScreen = null;
	private static int decimal2;

	public static void main (String[] args) {  
		Scanner dados = new Scanner (System.in);
		int menu;
		do {
		System.out.print("..:Converter entre Sistemas Num�ricos:..\n"
				+ "\n    (1) Bin�rio para Decimal \n"
				+ "    (2) Octal para Decimal \n"
				+ "    (3) Hexadecimal para Decimal \n"
				+ "    (4) Decimal para Bin�rio \n"
				+ "    (5) Decimal para Octal \n"
				+ "    (6) Decimal pra Hexadecimal \n"
				+ "    (0) Sair do programa\n "
				+ "\n Insira a op��o que deseja: ");
		menu = dados.nextInt();
		switch (menu) {
			case 1:
				for (int i = 0; i < 100; ++i)  
				       System.out.println();
					long num;
				System.out.print("\n Insira o n� Bin�rio: ");
					num = dados.nextInt();
			    	int decimal = cbtd(num);
		        System.out.println(" O n� Decimal correspondente �: " + decimal + "\n");
			break;
			case 2:
				for (int i = 0; i < 100; ++i)  
				       System.out.println();
					long num1;
				System.out.print("\n Insira o n� Octal: ");
					num1 = dados.nextInt();
					int decimal1 = cotd(num1);
		        System.out.println(" O n� Decimal correspondente �: " + decimal1 + "\n");
				
			break;
			case 3:
				for (int i = 0; i < 100; ++i)  
				       System.out.println();
					String num2;
				System.out.print("\n Insira o n� Hexadecimal: ");
					num2 = dados.next();
					int decimal2 = chtd(num2);
				System.out.println(" O n� Decimal correspondente �: " + decimal2 + "\n");
			break;
			case 4:
				for (int i = 0; i < 100; ++i)  
				       System.out.println();
					long num3;
				System.out.print("\n Insira o n� Decimal: ");
					num3 = dados.nextInt();
					String binary = cdtb(num3);
				System.out.println(" O n� Bin�rio correspondente �: " + binary + "\n");
			break;
			case 5:
				for (int i = 0; i < 100; ++i)  
				       System.out.println();
					long num4;
				System.out.print("\n Insira o n� Decimal: ");
					num4 = dados.nextInt();
					String decimal4=Integer.toOctalString((int) num4);
				System.out.println(" O n� Octal correspondente �: " + decimal4 + "\n");
			break;
			case 6:
				for (int i = 0; i < 100; ++i)  
				       System.out.println();
					long num5;
				System.out.print("\n Insira o n� Decimal: ");
					num5 = dados.nextInt();
					String hex = Integer.toHexString((int) num5);
				System.out.println(" O n� Hexadecimal correspondente �: " + hex + "\n");
			break;
			case 0:
				for (int i = 0; i < 100; ++i)  
				       System.out.println();
				System.out.print("Adeus! :(");
				System.exit(0);
			break;
			
		}
		} while (menu!=7);
    }

    public static int cbtd(long num) // Inicio fun��o binario para decimal
    {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    } // Fim fun��o binario para decimal
    
    public static int cotd(long num1) // Inicio fun��o octal para decimal
    {    
        int decimal1 = 0;    
        int n = 0;    
        while(true){    
          if(num1 == 0){    
            break;    
          } else {    
              int temp = (int) (num1%10);    
              decimal1 += temp*Math.pow(8, n);    
              num1 = num1/10;    
              n++;    
           }    
        }    
        return decimal1;    
    } // Fim fun��o octal para decimal
    
    public static int chtd(String num2) // Inicio fun��o hexa para decimal
    { 
        String digits = "0123456789ABCDEF";
        num2 = num2.toUpperCase();
        int decimal2 = 0;
        for (int i = 0; i < num2.length(); i++) 
        {
            char c = num2.charAt(i);
            int d = digits.indexOf(c);
            decimal2 = 16*decimal2 + d;
        }
        return decimal2;
    }// Fim fun��o hexa para decimal
    
    public static String cdtb(long num3) // Inicio fun��o decimal para binario
    {
        if (num3 == 0) {
            return "0";
        }
        String binary = "";
        while (num3 > 0) {
            int rem = (int) (num3 % 2);
            binary = rem + binary;
            num3 = num3 / 2;
        }
        return binary;
    } //Fim fun��o decimal pra binario
 
}