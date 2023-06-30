package guru.qa.countrysevice.controller;

import guru.qa.countrysevice.domain.Country;
import guru.qa.countrysevice.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    private final ICountryService ics;

    @Autowired
    public MainController(ICountryService ics) {
        this.ics = ics;
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable("code") String code) {
        return ics.getContryByCode(code);
    }

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return ics.getAllCountry();
    }
}
