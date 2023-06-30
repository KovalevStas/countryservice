package guru.qa.countrysevice.repository;

import guru.qa.countrysevice.domain.entity.CountryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CountryRepository extends CrudRepository<CountryEntity, UUID> {
    CountryEntity findByCountryCode(String countryCode);
}
