package sobrecargametodos.test;

import sobrecargametodos.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {

        Anime anime = new Anime();

        anime.init("Naruto", "TV", 12, "Ação");
        /* anime.setNome("Naruto");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/

        anime.imprime();
    }
}