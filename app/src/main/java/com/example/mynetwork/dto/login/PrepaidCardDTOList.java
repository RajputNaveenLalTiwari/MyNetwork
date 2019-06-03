
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.Map;

public class PrepaidCardDTOList {

    private String firstName;
    private String lastName;
    private String pocketId;
    private String nickName;
    private String theme;
    private CardDetails cardDetails;
    private Boolean isPinSet;
    private Boolean isSecureCode;
    private Boolean isRequired;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPocketId() {
        return pocketId;
    }

    public void setPocketId(String pocketId) {
        this.pocketId = pocketId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public CardDetails getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(CardDetails cardDetails) {
        this.cardDetails = cardDetails;
    }

    public Boolean getIsPinSet() {
        return isPinSet;
    }

    public void setIsPinSet(Boolean isPinSet) {
        this.isPinSet = isPinSet;
    }

    public Boolean getIsSecureCode() {
        return isSecureCode;
    }

    public void setIsSecureCode(Boolean isSecureCode) {
        this.isSecureCode = isSecureCode;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
