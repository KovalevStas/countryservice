package guru.qa.countrysevice.service;

import guru.qa.countrysevice.domain.Country;
import guru.qa.countrysevice.repository.CountryRepository;

import java.util.List;

public interface ICountryService {
    Country getContryByCode(String code);

    List<Country> getAllCountry();
}
