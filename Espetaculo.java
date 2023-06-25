public class Espetaculo {
    private String nome;
    private String data;
    private String hora;
    private double preco;
    private boolean[] assentos;
    private Entrada[] entradas;

    public Espetaculo(String nome, String data, String hora, double preco) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
        this.assentos = new boolean[50]; // Assumindo que existem 50 assentos disponíveis
        this.entradas = new Entrada[50]; // Inicializa o array de entradas com o tamanho adequado
    }

    public void apresentaAssentos() {
        System.out.println("Assentos Disponíveis para o Espetáculo " + nome + ":");
        for (int i = 0; i < assentos.length; i++) {
            if (!assentos[i]) {
                System.out.print(String.format("%02d ", i + 1));
            } else {
                System.out.print("XX ");
            }
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public Entrada novaEntrada(int tipo, int assento) {
        if (assento < 1 || assento > assentos.length) {
            System.out.println("Assento inválido.");
            return null;
        }

        if (assentos[assento - 1]) {
            System.out.println("Assento ocupado.");
            return null;
        }

        assentos[assento - 1] = true;

        if (tipo == 1) {
            return new EntradaInteira(assento, this);
        } else if (tipo == 2) {
            return new EntradaMeia(assento, this);
        } else if (tipo == 3) {
            return new EntradaProfessor(assento, this);
        } else {
            System.out.println("Tipo de entrada inválido.");
            return null;
        }
    }

    public double calcularValorTotal(int[] assentosOcupados) {
        double valorTotal = 0.0;
        for (int assento : assentosOcupados) {
            Entrada entrada = getEntradaByAssento(assento);
            if (entrada != null) {
                valorTotal += entrada.calculaValor();
            }
        }
        return valorTotal;
    }
    

    private Entrada getEntradaByAssento(int assento) {
        for (Entrada entrada : entradas) {
            if (entrada.getNumeroDoAssento() == assento) {
                return entrada;
            }
        }
        return null;
    }


    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " " + data + " " + hora + " R$ " + preco;
    }
}
