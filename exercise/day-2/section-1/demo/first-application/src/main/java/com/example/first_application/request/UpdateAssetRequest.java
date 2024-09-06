package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Builder
@Getter
@Setter
@NoArgsConstructor
public class UpdateAssetRequest {
    @JsonProperty("name")
    private String name;
}
