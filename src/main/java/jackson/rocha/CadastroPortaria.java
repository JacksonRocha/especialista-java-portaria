package jackson.rocha;

public class CadastroPortaria {

    void cadastrar(Visitante visitante, final int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);

    }
}
