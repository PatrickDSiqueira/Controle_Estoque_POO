import java.util.Scanner;

import br_com_Controle_Estoque_POO.Filial;
import br_com_Controle_Estoque_POO.Textos;

public class Main {
    public static void main(String[] args)  {

        String opcao = "";
        String opcao2 = "";
        Textos texto = new Textos();
        Scanner ler = new Scanner(System.in);

        Filial empresa1 = new Filial("Jatiboca", 100, 32);
        Filial empresa2 = new Filial("Pontal", 50, 32);



        do {
            
            texto.mostrarMenuPrincipal();
    
            opcao = ler.next();
    
            switch (opcao) {
                case "1":  //Entrada de Estoque
                    texto.mostrarQualEmpresa();
                    opcao2 = ler.next();

                    switch (opcao2){
                        case "1":
                            System.out.printf("Qual é a quantidade  que deseja da entrada Jatiboca->" + empresa1.getQtqEntrada());
                            empresa1.calcular();  
                            System.out.println("\nestoque atualizado jatiboca " + empresa1.calcular());
                        break;

                        case "2":
                            System.out.printf("Qual é a quantidade  que deseja da entrada Pontal->" + empresa2.getQtqEntrada());
                            empresa1.calcular();  
                            System.out.println("\nestoque atualizado jatiboca " + empresa2.calcular());       
                        break;    
                     }
                    break;

                    
                case "2":// Saída de Estoque
                    texto.mostrarQualEmpresa();
                    opcao2 = ler.next();

                    switch (opcao2){
                        case "1":
                            System.out.printf("quantidade atual->" + empresa1.getEstoque_filial());
                            empresa1.darBaixa(10);
                            System.out.println("\nestoque atualizado jatiboca " + empresa1.getEstoque_filial());
                            break;

                        case "2":
                            System.out.printf("quantidade atual->" + empresa2.getEstoque_filial());
                            empresa2.darBaixa(10);
                            System.out.println("\nestoque atualizado jatiboca " + empresa2.getEstoque_filial());
                         break;    
                        
                    }
                    break;
    
                case "3":
                // Transferência de Estoque
                    break;  
                
                case "4":// Consulta Estoque
                        texto.mostrarConsultaEstoque(empresa1.getNome_filial(), empresa1.getEstoque_filial());
                        texto.mostrarConsultaEstoque(empresa2.getNome_filial(), empresa2.getEstoque_filial());
                
                    break;
    
                case "5":
                    texto.mostrarDespedida();      
                    break; 
            
                default:
                    texto.mostrarInvalida();
                    break;
            }
        
        } while (  ! opcao.equals("5") ); // diferente com String



        
}

}