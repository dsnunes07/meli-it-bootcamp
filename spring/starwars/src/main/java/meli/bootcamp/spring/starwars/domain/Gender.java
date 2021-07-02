package meli.bootcamp.spring.starwars.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {
    @JsonProperty("female")
    FEMALE,
    @JsonProperty("male")
    MALE,
    @JsonProperty("NA")
    NA;
}
