package jackson.rocha;

public class Principal {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acessp não permitido para menores de %d anos", Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }
    }
}
