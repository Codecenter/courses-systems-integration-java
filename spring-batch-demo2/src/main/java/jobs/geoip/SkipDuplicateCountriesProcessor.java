package jobs.geoip;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.batch.item.ItemProcessor;

public class SkipDuplicateCountriesProcessor implements ItemProcessor<Country, Country> {
    private Set<Country> countries;

    protected Set<Country> getCountries() {
        if (countries == null) {
            Comparator<Country> comparator = new Comparator<Country>() {
                @Override
                public int compare(Country one, Country two) {
                    return one.getCode().compareTo(two.getCode());
                }
            };
            countries = new TreeSet<Country>(comparator);
        }
        return countries;
    }

    @Override
    public Country process(Country country) throws Exception {
        if (getCountries().contains(country)) {
            // Skip this country because it is a duplicate.
            // Returning null will end handling of the item at hand.
            return null;
        }
        else {
            getCountries().add(country);
            return country;
        }
    }
}
