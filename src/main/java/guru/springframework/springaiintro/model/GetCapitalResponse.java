package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalResponse(@JsonPropertyDescription("This is the city name") String cityName) {

}
//The capital of ```stateOrCountry``` is ```capital```.
//           The city has a population of ```population```.
//           The city is located in ```region```.
//           The priamry language spoken is ```language```.
//           The currency used is ```currency```.