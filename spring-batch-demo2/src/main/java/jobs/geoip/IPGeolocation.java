package jobs.geoip;

public class IPGeolocation {
    private String addressStart;
    private String addressEnd;
    private Country country;

    public String getAddressStart() {
        return addressStart;
    }

    public void setAddressStart(String addressStart) {
        this.addressStart = addressStart;
    }

    public String getAddressEnd() {
        return addressEnd;
    }

    public void setAddressEnd(String addressEnd) {
        this.addressEnd = addressEnd;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        value.append(getClass().getSimpleName());
        value.append("[");
        value.append("addressStart=");
        value.append(getAddressStart());
        value.append(",addressEnd=");
        value.append(getAddressEnd());
        value.append(",country=");
        value.append(getCountry());
        value.append("]");
        return value.toString();
    }
}
