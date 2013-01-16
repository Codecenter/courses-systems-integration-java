package jobs.geoip;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

public class IPGeolocationPreparedStatementSetter implements ItemPreparedStatementSetter<IPGeolocation> {
    @Override
    public void setValues(IPGeolocation geolocation, PreparedStatement ps) throws SQLException {
        ps.setString(1, geolocation.getAddressStart());
        ps.setString(2, geolocation.getAddressEnd());
        ps.setString(3, geolocation.getCountry().getCode());
    }
}
