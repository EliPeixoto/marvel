package herois.marvel.herois;

public record DadosListagemHerois(
        String nome,
        String email,
        String crh,
        Especialidade especialidade
) {

    public DadosListagemHerois(Herois herois) {
        this(herois.getNome(), herois.getEmail(), herois.getCrh(), herois.getEspecialidade());
    }
}
