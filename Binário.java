package binário;
import java.util.Scanner;
public class Binário {
  static int BinaryToDecimal(int binaryNumber){
    
    int decimal = 0;
    int p = 0;
    while(true){
      if(binaryNumber == 0){
        break;
      } else {  
      int temp = binaryNumber%10;
          decimal += temp*Math.pow(2, p);
          binaryNumber = binaryNumber/10;
          p++;
             }
    }
    return decimal;
  }
  public static void main(String args[]){
      int in;
      Scanner LerS = new Scanner(System.in);
      System.out.print("Qual é o numero que quer converter?");
      in=LerS.nextInt();
      System.out.println(in +"-->" +BinaryToDecimal(in));
      
  
  }
}

  
   
   
    
    
        
   
  

 
    
    
    
    
    
    
    
    
       
   
    

