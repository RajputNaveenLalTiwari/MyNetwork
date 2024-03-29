
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.Map;

public class EMONEY {

    private Double amount;
    private String currencyCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
