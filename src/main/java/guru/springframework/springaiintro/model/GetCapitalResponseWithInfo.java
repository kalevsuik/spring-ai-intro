package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalResponseWithInfo(@JsonPropertyDescription("This is the city name") String cityName,
                                          @JsonPropertyDescription("This city has a population") String population,
                                          @JsonPropertyDescription("This city is located in") String region,
                                          @JsonPropertyDescription("This priamry language spoken is") String language,
                                         @JsonPropertyDescription("This currency used is") String currency) {

}
//The capital of ```stateOrCountry``` is ```capital```.
//           The city has a population of ```population```.
//           The city is located in ```region```.
//           The priamry language spoken is ```language```.
//           The currency used is ```currency```.