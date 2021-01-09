

import java.util.Scanner;

public class Ex2 {
    
    double cotDolar, quantDolar, real;
    
    public int ler (Scanner leitor) {
        
               
       System.out.println ("\n Digite o valor da cotação do Dólar:");
       cotDolar= leitor.nextDouble ();
       System.out.println ("\n Digite qual a quantidade de dólares:");
       quantDolar= leitor.nextDouble ();
       
       return 0; }
    
    public double Calcular () {
        
        real = quantDolar * cotDolar; 
        
        return real;
    }
    
    public void Mostrar () {
        
        System.out.println ("\n A conversão do valor em real é:" + real);
    }
     public static void main ( String [] args) { 
        
        Ex2 e2 = new Ex2 ( );
        
        Scanner leitor = new Scanner(System.in); 
        
        double  cotDolar, quantDolar, real;
        
        int tecla;  
                
        System.out.println("\nMENU \n 1- Executar\n 2 - Sair \n"); 
        tecla = leitor.nextInt();  
        
        switch (tecla) {  
            
            case 1: 
                e2. ler (leitor);
                real = e2.Calcular();
                e2.Mostrar();
                
            
            break;   
            
            case 2: 
              
            System.out.println("\nFim do programa!\n");  
            System.exit (0); 
                
            break;}} 
    }

    

