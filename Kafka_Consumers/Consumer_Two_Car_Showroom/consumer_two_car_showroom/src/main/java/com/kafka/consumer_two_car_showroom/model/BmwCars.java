package com.kafka.consumer_two_car_showroom.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class BmwCars {

    @JsonProperty
    private String model;

    @JsonProperty
    private String series;

    @JsonProperty
    private Long cost;
}
