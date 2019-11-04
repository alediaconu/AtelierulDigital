package lab2.Challenge2;

public class Main {
    public static void main(String[] args) {
        //filme
        Premiu p1 = new Premiu("Oscar", 1990);
        Premiu p2 = new Premiu("Oscar", 1980);
        Premiu p3 = new Premiu("Oscar", 2009);
        Premiu p4 = new Premiu("Oscar", 2010);

        //actori
        Premiu [] listaP1 = new Premiu[2];
        listaP1[0] = p1;
        listaP1[1] = p2;
        Actor a1 = new Actor("actor cu 2 oscaruri", 30, listaP1);
        Actor a2 = new Actor("Actor cu 1 oscar", 47, new Premiu[] {p3});
        Actor a3 = new Actor("Actor cu 5 oscaruri", 66, new Premiu[] {p2, p3, p4});
        Actor a4 = new Actor("Actor cu 1 oscar", 20, new Premiu[] {});

        //filme
        Film f1 = new Film(2000, "Film1", new Actor[] {a1, a4});
        Film f2 = new Film(1980, "Film2", new Actor[] {a2, a3});
        Film f3 = new Film(2010, "Film3", new Actor[] {a1, a4});

        //studio
        Studio s1 = new Studio( "MGM", new Film [] {f3});
        Studio s2 = new Studio( "Disney", new Film [] {f1, f2});

        Studio[] studioDataBase = new Studio[] {s1,s2};

        for(int i=0; i < studioDataBase.length; i++){
            if(studioDataBase[i].getNrFilme() >1){
                System.out.println(studioDataBase[i].getNume());
            }

        }
        for(int i=0; i < studioDataBase.length; i++){
            Film f =  studioDataBase[i].getFilmByActor("actor cu 2 oscaruri");
            if(f != null){
                System.out.println(studioDataBase[i] + "contains actor");
            }
        }
    }
}
