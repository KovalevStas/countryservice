package guru.qa.countrysevice.domain.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "countries")
public class CountryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "country_name")
    private String countryName;
    @Column(name = "country_code")
    private String countryCode;

    public String getCode() {
        return countryCode;
    }

    public void setCode(String code) {
        this.countryCode = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryEntity that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(getName(), that.getName()) && Objects.equals(getCode(), that.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getCode());
    }

    public String getName() {
        return countryName;
    }

    public void setName(String name) {
        this.countryName = name;
    }
}
