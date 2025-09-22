package UnicornProgram;

public class Unicorn { // req 1.a
    private String name;
    private String colour;

    Unicorn(String name, String colour) { // req 1.b
        this.name = name;
        this.colour = colour;
    }

    // req 1.c
    void setName(String name) {
        this.name = name;
    }
    
    String getName(){
        return name;
    }

    void setColour (String colour){
        this.colour = colour;
    }

    String getColour(){
        return colour;
    }
}