package construtores.test;

        import construtores.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {

        Anime anime = new Anime("Naruto", "TV", 12, "Ação");
        Anime anime2 = new Anime();

        anime.imprime();
        anime2.imprime();
    }
}
