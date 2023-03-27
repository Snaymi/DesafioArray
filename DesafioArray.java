import java.util.Scanner;

public class DesafioArray {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        int cont;
        String resposta;
        String confirmaçao;
        int mes;
        String compromisso;
        int dia;
        String denovo;
            System.out.print("Gostaria de marcar algum compromisso? \n");
            resposta = scan.next();
        do {
            System.out.print("Diga o nome do compromisso: \n");

            compromisso = scan.next();

            System.out.print("Para qual mês seria?\n");

            System.out.print("1 - Janeiro\n");
            System.out.print("2 - Fevereiro\n");
            System.out.print("3 - Março\n");
            System.out.print("4 - Abril\n");
            System.out.print("5 - Maio\n");
            System.out.print("6 - Junho\n");
            System.out.print("7 - Julho\n");
            System.out.print("8 - Agosto\n");
            System.out.print("9 - Setembro");
            System.out.print("10 - Outubro\n");
            System.out.print("11 - Novembro\n");
            System.out.print("12 - Dezembro\n ");
            System.out.print("\nDigite aqui: ");

            mes = scan.nextInt();

            System.out.print("Qual seria o dia?\n");
            dia = scan.nextInt();
            if (mes == 2){
              
                if (dia<29) {
                    System.out.print("Confirme os dados:\n");

                System.out.print("Para o dia "+ dia+" do mês "+ mes +" esta marcado o " + compromisso+ " Confirma?" );
           
                confirmaçao = scan.next();
                }else {
                    
                    System.out.print("O dia não existe\n");
                    System.out.print("Digite outro dia \n");
                    dia = scan.nextInt();
                    
                    
                    
                }
           
               
            }
            System.out.print("Confirme os dados:\n");

            System.out.print("Para o dia "+ dia +" do mês "+ mes +" esta marcado o " + compromisso+ " Confirma?" );
           
            confirmaçao = scan.next();

            for (cont = 0; cont >13 ; cont ++){
            

            }
            
            
        
        }while (resposta.equals ("sim") || resposta.equals ("Sim")|| resposta.equals ("S"));
       
        
    }

}
