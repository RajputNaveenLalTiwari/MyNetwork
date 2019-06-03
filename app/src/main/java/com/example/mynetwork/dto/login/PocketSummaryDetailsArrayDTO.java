
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.Map;

public class PocketSummaryDetailsArrayDTO {

    private String pocketId;
    private String pocketType;
    private String pocketValueType;
    private String nickName;
    private BalanceAmount balanceAmount;
    private Boolean isDefaultPocket;
    private Boolean isSecondaryPocket;
    private String statusType;
    private Integer totalNoOfRecords;
    private String displayName;
    private String accountId;
    private PocketDetailsDTO pocketDetailsDTO;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPocketId() {
        return pocketId;
    }

    public void setPocketId(String pocketId) {
        this.pocketId = pocketId;
    }

    public String getPocketType() {
        return pocketType;
    }

    public void setPocketType(String pocketType) {
        this.pocketType = pocketType;
    }

    public String getPocketValueType() {
        return pocketValueType;
    }

    public void setPocketValueType(String pocketValueType) {
        this.pocketValueType = pocketValueType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public BalanceAmount getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BalanceAmount balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Boolean getIsDefaultPocket() {
        return isDefaultPocket;
    }

    public void setIsDefaultPocket(Boolean isDefaultPocket) {
        this.isDefaultPocket = isDefaultPocket;
    }

    public Boolean getIsSecondaryPocket() {
        return isSecondaryPocket;
    }

    public void setIsSecondaryPocket(Boolean isSecondaryPocket) {
        this.isSecondaryPocket = isSecondaryPocket;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public Integer getTotalNoOfRecords() {
        return totalNoOfRecords;
    }

    public void setTotalNoOfRecords(Integer totalNoOfRecords) {
        this.totalNoOfRecords = totalNoOfRecords;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public PocketDetailsDTO getPocketDetailsDTO() {
        return pocketDetailsDTO;
    }

    public void setPocketDetailsDTO(PocketDetailsDTO pocketDetailsDTO) {
        this.pocketDetailsDTO = pocketDetailsDTO;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
