package jobs.geoip;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class IPGeolocationFieldSetMapper implements FieldSetMapper<IPGeolocation> {
    @Override
    public IPGeolocation mapFieldSet(FieldSet fieldSet) throws BindException {
        IPGeolocation geolocation = new IPGeolocation();
        geolocation.setAddressStart(fieldSet.readString(0));
        geolocation.setAddressEnd(fieldSet.readString(1));
        Country country = new Country();
        country.setCode(fieldSet.readString(4));
        country.setName(fieldSet.readString(5));
        geolocation.setCountry(country);
        return geolocation;
    }
}
