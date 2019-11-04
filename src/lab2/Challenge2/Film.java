package lab2.Challenge2;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actorii;

    public Film(int anAparitie, String nume, Actor[] actorii) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actorii = actorii;
    }

    public Actor getActorByName(String name) {
        for (int i = 0; i < actorii.length; i++) {
            if (actorii[i].getNume().equals(name)) {
                return actorii[i];

            }

        }
        return null;

    }
}
