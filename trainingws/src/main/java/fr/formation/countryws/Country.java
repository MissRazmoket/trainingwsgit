package fr.formation.countryws;

public class Country {

    private String name;

    private String capital;

    private int population;

    private String flag;

    public Country(String name, String capital, int population) {
	this.name = name;
	this.capital = capital;
	this.population = population;
    }

    public Country(String name, String capital, int population, String flag) {
	setName(name);
	setCapital(capital);
	setPopulation(population);
	this.flag = flag;
    }

    public String getName() {
	return name;
    }

    public String getCapital() {
	return capital;
    }

    public int getPopulation() {
	return population;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setCapital(String capital) {
	this.capital = capital;
    }

    public void setPopulation(int population) {
	this.population = population;
    }

    public String getFlag() {
	return flag;
    }

    public void setFlag(String flag) {
	this.flag = flag;
    }

}
