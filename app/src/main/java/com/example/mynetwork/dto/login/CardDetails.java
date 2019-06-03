
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.Map;

public class CardDetails {

    private String instaKitId;
    private String cardId;
    private Boolean isAddOnCard;
    private String cardType;
    private String cardStatus;
    private String nameOnCard;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getInstaKitId() {
        return instaKitId;
    }

    public void setInstaKitId(String instaKitId) {
        this.instaKitId = instaKitId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Boolean getIsAddOnCard() {
        return isAddOnCard;
    }

    public void setIsAddOnCard(Boolean isAddOnCard) {
        this.isAddOnCard = isAddOnCard;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
