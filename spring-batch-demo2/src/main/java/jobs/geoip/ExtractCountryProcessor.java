package jobs.geoip;

import org.springframework.batch.item.ItemProcessor;

public class ExtractCountryProcessor implements ItemProcessor<IPGeolocation, Country> {
    @Override
    public Country process(IPGeolocation item) throws Exception {
        return item.getCountry();
    }
}
