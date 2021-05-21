package com.example.kafkaconsumer.model;



import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TransactionDateTime",
    "FacilityID",
    "AllocatedCapacity",
    "MaxCapacity",
    "CapacityFull",
    "CapacityGroup"
})
public class CapacityDetail {

    @JsonProperty("TransactionDateTime")
    private String transactionDateTime;
    @JsonProperty("FacilityID")
    private String facilityID;
    @JsonProperty("AllocatedCapacity")
    private String allocatedCapacity;
    @JsonProperty("MaxCapacity")
    private String maxCapacity;
    @JsonProperty("CapacityFull")
    private String capacityFull;
    @JsonProperty("CapacityGroup")
    private String capacityGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TransactionDateTime")
    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    @JsonProperty("TransactionDateTime")
    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    @JsonProperty("FacilityID")
    public String getFacilityID() {
        return facilityID;
    }

    @JsonProperty("FacilityID")
    public void setFacilityID(String facilityID) {
        this.facilityID = facilityID;
    }

    @JsonProperty("AllocatedCapacity")
    public String getAllocatedCapacity() {
        return allocatedCapacity;
    }

    @JsonProperty("AllocatedCapacity")
    public void setAllocatedCapacity(String allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    @JsonProperty("MaxCapacity")
    public String getMaxCapacity() {
        return maxCapacity;
    }

    @JsonProperty("MaxCapacity")
    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @JsonProperty("CapacityFull")
    public String getCapacityFull() {
        return capacityFull;
    }

    @JsonProperty("CapacityFull")
    public void setCapacityFull(String capacityFull) {
        this.capacityFull = capacityFull;
    }

    @JsonProperty("CapacityGroup")
    public String getCapacityGroup() {
        return capacityGroup;
    }

    @JsonProperty("CapacityGroup")
    public void setCapacityGroup(String capacityGroup) {
        this.capacityGroup = capacityGroup;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
