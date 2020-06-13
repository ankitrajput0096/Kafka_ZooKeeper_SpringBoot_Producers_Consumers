package com.kafka.producer_two_mercedes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class MercedesCars {

    @JsonProperty
    private String model;

    @JsonProperty
    private String series;

    @JsonProperty
    private Long cost;
}
