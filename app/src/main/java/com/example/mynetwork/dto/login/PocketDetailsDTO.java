
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.Map;

public class PocketDetailsDTO {

    private String pocketId;
    private String walletId;
    private String mdnId;
    private String pocketType;
    private String pocketValueType;
    private String nickname;
    private Boolean isSecondaryPocket;
    private String actorRoleId;
    private String role;
    private String offerId;
    private Boolean hasDebitFreeze;
    private Boolean hasCreditFreeze;
    private String status;
    private String modifiedDate;
    private Integer version;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPocketId() {
        return pocketId;
    }

    public void setPocketId(String pocketId) {
        this.pocketId = pocketId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getMdnId() {
        return mdnId;
    }

    public void setMdnId(String mdnId) {
        this.mdnId = mdnId;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getIsSecondaryPocket() {
        return isSecondaryPocket;
    }

    public void setIsSecondaryPocket(Boolean isSecondaryPocket) {
        this.isSecondaryPocket = isSecondaryPocket;
    }

    public String getActorRoleId() {
        return actorRoleId;
    }

    public void setActorRoleId(String actorRoleId) {
        this.actorRoleId = actorRoleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public Boolean getHasDebitFreeze() {
        return hasDebitFreeze;
    }

    public void setHasDebitFreeze(Boolean hasDebitFreeze) {
        this.hasDebitFreeze = hasDebitFreeze;
    }

    public Boolean getHasCreditFreeze() {
        return hasCreditFreeze;
    }

    public void setHasCreditFreeze(Boolean hasCreditFreeze) {
        this.hasCreditFreeze = hasCreditFreeze;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
