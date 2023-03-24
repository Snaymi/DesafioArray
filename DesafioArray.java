import java.util.Scanner;

public class DesafioArray {
    public static void main (String [] args) {

        int [][] matriz;
        int opção;
        Scanner scan = new Scanner (System.in);
        int dia;
        int hora;
        int mes;

        System.out.print("O que você quer fazer? \n 1 - Inserir compromisso \n 2 - Consultar compromisso");
        System.out.print("\n3 - Sair");
        opção = scan.nextInt();

            
            do{

                System.out.print("Para qual mes? \n Utilize meses númericos ");
                
                mes = scan.nextInt();
                
                    if (mes >0 && mes < 13) {
                        
                    }
                dia = scan.nextInt();

                    if (dia>0 && dia<32){
                        System.out.print("O dia tem 24 horas, qual horário é o primeiro compromisso?");
                        hora = scan.nextInt();
                            if(hora>0 && hora<25) {
                                
                                System.out.print("Compromisso marcado para " +hora+" horas do dia " +dia+" de "+ mes);
                                }else{
                                    System.out.print("hora inválida");}

                        }else {
                        System.out.print("Dia ,inválido\n");
                         }

            }while (opção =1) ;
    }
}
