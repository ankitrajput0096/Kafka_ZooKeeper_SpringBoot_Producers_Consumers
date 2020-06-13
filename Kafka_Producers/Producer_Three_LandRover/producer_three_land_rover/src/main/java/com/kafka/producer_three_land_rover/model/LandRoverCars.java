package com.kafka.producer_three_land_rover.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class LandRoverCars {

    @JsonProperty
    private String model;

    @JsonProperty
    private String series;

    @JsonProperty
    private Long cost;
}
