public class Pokemon {
    private String name;
    private String generation;
    private String type;
    private Integer evolutionNumber;

    public Pokemon (){

    }

    public Pokemon (String name, String generation, String type, Integer evolutionNumber) {
        this.name = name;
        this.generation = generation;
        this.type = type;
        this.evolutionNumber = evolutionNumber;
    }

    //get & set
    public String getName()
    {return name;}
    public void setName(String name)
    {this.name = name;}

    public String getGeneration()
    {return generation;}
    public void setGeneration(String generation)
    {this.generation = generation;}

    public String getType()
    {return type;}
    public void setType(String type)
    {this.type = type;}

    public int getEvolutionNumber()
    {return evolutionNumber;}
    public void setEvolutionNumber(Integer evolutionNumber)
    {this.evolutionNumber = evolutionNumber;}




}
