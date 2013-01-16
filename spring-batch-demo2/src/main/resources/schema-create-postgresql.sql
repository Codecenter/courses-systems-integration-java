create table countries (
    code varchar(5) primary key,
    name varchar(200)
);

create table ip_geolocations (
    address_start varchar(20),
    address_end varchar(20),
    country_code varchar(5) constraint fk_ip_geolocations_country_code references countries (code)
);