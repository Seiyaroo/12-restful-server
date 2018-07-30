package models;

public class Pokemonz {
    private static int ID = 0;

    public int id;
    public String name;
    public String type;
    public String number;

    public Pokemonz (String name, String type, String number) {
        this.id = ID++;
        this.name = name;
        this.type = type;
        this.type = number;
    }
}