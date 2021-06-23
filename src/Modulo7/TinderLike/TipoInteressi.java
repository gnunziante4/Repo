package Modulo7.TinderLike;

public enum TipoInteressi {


    MUSICA(1,"Musica"),VIAGGI(2,"Viaggi"),LEGGERE(3,"Leggere"),
    SERIETELEVISIVE(4,"Serie Tv"),VIDEOGIOCHI(5,"Videogiochi"),
    SPORT(6,"Sport"),GATTI(7,"Gatti"),CANI(8,"Cani");

    private int id;
    private String str;

    TipoInteressi(int id,String str) {
        setId(id);
        setStr(str);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}
