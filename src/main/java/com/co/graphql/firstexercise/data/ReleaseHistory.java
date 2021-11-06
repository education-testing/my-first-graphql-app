package com.co.graphql.firstexercise.data;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ReleaseHistory {
    private Integer year;
    private Boolean printedEdition;
    private String releasedCountry;
}
