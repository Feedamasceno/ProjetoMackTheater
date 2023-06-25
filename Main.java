import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        int opc;

        String nomeEspetaculo, data, hora;
        double preco;

        String nomeCliente, cpf;

        Scanner teclado = new Scanner(System.in);

        ArrayList<Espetaculo> listaEspetaculos = new ArrayList<Espetaculo>();
        ArrayList<String> listaCPFs = new ArrayList<>();

        do {
            System.out.println("\n*** MACK THEATER ***");
            System.out.println("1) Cadastrar Espetáculo");
            System.out.println("2) Cadastrar Cliente");
            System.out.println("3) Compra de Entradas");
            System.out.println("4) Sair");
            System.out.println("Selecione uma opção:");

            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("\n*** CADASTRO DE ESPETÁCULO ***");
                    System.out.println("Nome do Espetáculo: ");
                    nomeEspetaculo = teclado.nextLine();
                    System.out.println("Data (dd/mm/aaaa): ");
                    data = teclado.nextLine();
                    System.out.println("Hora: ");
                    hora = teclado.nextLine();
                    System.out.println("Preço da Entrada Inteira: ");
                    preco = teclado.nextDouble();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataFormatada = null;
                    try {
                        dataFormatada = LocalDate.parse(data, formatter);
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de data inválido. Utilize o formato dd/mm/aaaa.");
                        break;
                    }

                    Espetaculo novoEspetaculo = new Espetaculo(nomeEspetaculo, dataFormatada.format(formatter), hora, preco);
                    listaEspetaculos.add(novoEspetaculo);
                    System.out.println("\nEspetáculo cadastrado com sucesso!");

                    break;

                    case 2:
                    System.out.println("\n*** CADASTRO DE CLIENTE ***");
                    System.out.println("Nome do Cliente: ");
                    nomeCliente = teclado.nextLine();
                    System.out.println("CPF: ");
                    cpf = teclado.nextLine();
                    
                    Cliente novoCliente = new Cliente(nomeCliente, cpf);
                    listaCPFs.add(cpf);
                    // Código para cadastrar o cliente
                    System.out.println(); // Adicionar uma linha vazia 
                    novoCliente.mostrarDados(); // Chamada para exibir os dados do cliente cadastrado
                    
                    break;

                    case 3:
                    System.out.println("\n*** VENDA DE ENTRADAS - ESPETÁCULOS ***");
                    for (int i = 0; i < listaEspetaculos.size(); i++) {
                        System.out.println((i + 1) + ") " + listaEspetaculos.get(i));
                    }
                    System.out.print("Selecione um espetáculo: ");
                    int numeroEspetaculoEscolhido = teclado.nextInt();
                    teclado.nextLine();
                    if (numeroEspetaculoEscolhido < 1 || numeroEspetaculoEscolhido > listaEspetaculos.size()) {
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                    }
                
                    Espetaculo espetaculoEscolhido = listaEspetaculos.get(numeroEspetaculoEscolhido - 1);
                    ArrayList<Integer> assentosOcupados = new ArrayList<>();
                    
                    boolean continuarSelecionando = true;
                    double valorTotal = 0.0; // Variável para armazenar o valor total da compra
                    
                    espetaculoEscolhido.apresentaAssentos(); // 
                    
                    while (continuarSelecionando) {
                                        
                        System.out.print("Selecione um assento (-1 para sair): ");
                        int assentoEscolhido = teclado.nextInt();
                        teclado.nextLine();
                
                        if (assentoEscolhido == -1) {
                            continuarSelecionando = false;
                        } else {
                            if (assentosOcupados.contains(assentoEscolhido)) {
                                System.out.println("Assento ocupado. Por favor, escolha outro assento.");
                            } else {
                                assentosOcupados.add(assentoEscolhido);
                                System.out.println("Assento selecionado com sucesso.");
                
                                System.out.println("Selecione o tipo de entrada:");
                                System.out.println("1) Inteira");
                                System.out.println("2) Meia        50% do valor da entrada");
                                System.out.println("3) Professor   40% do valor da entrada");
                                System.out.print("Opção: ");
                                int tipoEntrada = teclado.nextInt();
                                teclado.nextLine();
                
                                Entrada entrada = espetaculoEscolhido.novaEntrada(tipoEntrada, assentoEscolhido);
                                if (entrada != null) {
                                    // Código para armazenar a entrada ou realizar outras ações necessárias
                                    System.out.println("Entrada cadastrada com sucesso.");
                
                                    valorTotal += entrada.calculaValor();
                                }
                
                                System.out.print("Deseja escolher outro assento? (S/N): ");
                                String resposta = teclado.nextLine();
                                if (resposta.equalsIgnoreCase("N")) {
                                    continuarSelecionando = false;
                                }
                            }
                        }
                    }

                    System.out.print("Informe o CPF do Cliente Cadastrado: ");
                    String cpfInformado = teclado.nextLine();

                    if (listaCPFs.contains(cpfInformado)) {
                        DecimalFormat decimalFormat = new DecimalFormat("0.00");
                        String valorTotalFormatado = decimalFormat.format(valorTotal);
                    System.out.println("Valor Total: R$ " + valorTotalFormatado);
                    } else {
                    System.out.println("CPF não encontrado.");
                    }


                    break;
                
                

                case 4:
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opc != 4);

    }
}
