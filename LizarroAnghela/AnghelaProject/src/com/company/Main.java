package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        private String name;
        private String generation;
        private String type;
        private Boolean evolution;
        private int evolutionNumber;
        private String evolutionName;
        private Boolean shiny;
        private Boolean lucky;
        //private Boolean legs;
        //private String trainerName;

        //constructor
        public pokemon (String name, String generation, String type, Boolean evolution, int evolutionNumber, String evolutionName, Boolean shiny, Boolean lucky){
            this.name = name;
            this.generation = generation;
            this.type = type;
            this.evolution = evolution;
            this.evolutionNumber = evolutionNumber;
            this.evolutionName = evolutionName;
            this.shiny = shiny;
            this.lucky = lucky;

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

        public Boolean getEvolution()
        {return evolution;}
        public void setEvolution(Boolean evolution)
        {this.evolution = evolution;}

        public int getEvolutionNumber()
        {return evolutionNumber;}
        public void setEvolutionNumber(int evolutionNumber)
        {this.evolutionNumber = evolutionNumber;}

        public String getEvolutionName()
        {return evolutionName;}
        public void setEvolutionName(String evolutionName)
        {this.evolutionName = evolutionName;}

        public Boolean getShiny()
        {return shiny;}
        public void setShiny(Boolean shiny)
        {this.shiny = shiny;}

        public Boolean getLucky()
        {return getLucky;}
        public void setLucky(Boolean lucky)
        {this.lucky = lucky;}

    }
}
