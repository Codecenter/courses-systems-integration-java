package jobs.geoip;

public class Country {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        value.append(getClass().getSimpleName());
        value.append("[");
        value.append("code=");
        value.append(getCode());
        value.append(",name=");
        value.append(getName());
        value.append("]");
        return value.toString();
    }
}
