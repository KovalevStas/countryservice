package guru.qa.countrysevice.domain;

import guru.qa.countrysevice.domain.entity.CountryEntity;

public class Country {
    private String name;
    private String code;

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

    public static Country fromCountryEntity (CountryEntity countryEntity)
    {
        Country country = new Country();
        country.setName(countryEntity.getName());
        country.setCode(countryEntity.getCode());
        return country;
    }
}
