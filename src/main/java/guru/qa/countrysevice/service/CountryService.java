package guru.qa.countrysevice.service;

import guru.qa.countrysevice.domain.Country;
import guru.qa.countrysevice.domain.entity.CountryEntity;
import guru.qa.countrysevice.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService implements ICountryService {

    private final CountryRepository cr;

    @Autowired
    public CountryService(CountryRepository cr) {
        this.cr = cr;
    }

    @Override
    public Country getContryByCode(String code) {
        return Country.fromCountryEntity(cr.findByCountryCode(code));
    }

    @Override
    public List<Country> getAllCountry() {
        List<Country> countries = new ArrayList<>();
        for (CountryEntity ce : cr.findAll()) {
            countries.add(Country.fromCountryEntity(ce));
        }
        return countries;
    }
}
