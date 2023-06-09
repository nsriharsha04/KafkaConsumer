package com.umbc.consumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FL_DATE",
        "OP_CARRIER",
        "OP_CARRIER_FL_NUM",
        "ORIGIN",
        "DEST",
        "CRS_DEP_TIME",
        "DEP_TIME",
        "DEP_DELAY",
        "TAXI_OUT",
        "WHEELS_OFF",
        "WHEELS_ON",
        "TAXI_IN",
        "CRS_ARR_TIME",
        "ARR_TIME",
        "ARR_DELAY",
        "CANCELLED",
        "CANCELLATION_CODE",
        "DIVERTED",
        "CRS_ELAPSED_TIME",
        "ACTUAL_ELAPSED_TIME",
        "AIR_TIME",
        "DISTANCE",
        "CARRIER_DELAY",
        "WEATHER_DELAY",
        "NAS_DELAY",
        "SECURITY_DELAY",
        "LATE_AIRCRAFT_DELAY"
})
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {

    @JsonProperty("FL_DATE")
    public String flDate;
    @JsonProperty("OP_CARRIER")
    public String opCarrier;
    @JsonProperty("OP_CARRIER_FL_NUM")
    public Integer opCarrierFlNum;
    @JsonProperty("ORIGIN")
    public String origin;
    @JsonProperty("DEST")
    public String dest;
    @JsonProperty("CRS_DEP_TIME")
    public Integer crsDepTime;
    @JsonProperty("DEP_TIME")
    public Integer depTime;
    @JsonProperty("DEP_DELAY")
    public Integer depDelay;
    @JsonProperty("TAXI_OUT")
    public Integer taxiOut;
    @JsonProperty("WHEELS_OFF")
    public Integer wheelsOff;
    @JsonProperty("WHEELS_ON")
    public Integer wheelsOn;
    @JsonProperty("TAXI_IN")
    public Integer taxiIn;
    @JsonProperty("CRS_ARR_TIME")
    public Integer crsArrTime;
    @JsonProperty("ARR_TIME")
    public Integer arrTime;
    @JsonProperty("ARR_DELAY")
    public Integer arrDelay;
    @JsonProperty("CANCELLED")
    public Integer cancelled;
    @JsonProperty("CANCELLATION_CODE")
    public String cancellationCode;
    @JsonProperty("DIVERTED")
    public Integer diverted;
    @JsonProperty("CRS_ELAPSED_TIME")
    public Integer crsElapsedTime;
    @JsonProperty("ACTUAL_ELAPSED_TIME")
    public Integer actualElapsedTime;
    @JsonProperty("AIR_TIME")
    public Integer airTime;
    @JsonProperty("DISTANCE")
    public Integer distance;
    @JsonProperty("CARRIER_DELAY")
    public Integer carrierDelay;
    @JsonProperty("WEATHER_DELAY")
    public Integer weatherDelay;
    @JsonProperty("NAS_DELAY")
    public Integer nasDelay;
    @JsonProperty("SECURITY_DELAY")
    public Integer securityDelay;
    @JsonProperty("LATE_AIRCRAFT_DELAY")
    public Integer lateAircraftDelay;
//    @JsonIgnore
//    @Valid
//    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}