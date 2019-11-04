package lab2.Challenge2;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio( String nume, Film[] filme){
        this.nume = nume;
        this.filme = filme;
    }
    public Film getFilmByActor(String actorName){
        Actor actor = null;
        for(int i=0; i<filme.length; i++){
            if(filme[i].getActorByName(actorName) != null){
                return filme[i];
            }
        }
        return null;
    }

    public int getNrFilme(){
        return filme.length;
    }
    public String getNume(){
        return nume;
    }
}
