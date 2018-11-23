package fr.formation.countryws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/countries")
@Produces(MediaType.APPLICATION_JSON)

public class CountryController {

    private static Country france = new Country("France", "Paris", 66710000, "https://restcountries.eu/data/fra.svg");
    private static Country martinique = new Country("Martinique", "Fort-de-France", 410000,
	    "https://restcountries.eu/data/mtq.svg");
    private static Country guadeloupe = new Country("Guadeloupe", "Pointe-à-Pitre", 424000,
	    "https://restcountries.eu/data/glp.svg");

    private static List<Country> countries = new ArrayList<>();

    static {
	countries.add(france);
	countries.add(martinique);
	countries.add(guadeloupe);
    }

    @Path("/france")
    @GET
    // Afficher un country
    public Country displayCountry() {
	return france;
    }

    @Path("/list")
    @GET
    // Display countries
    public List<Country> displayCountries() {
	return countries;
    }

}
