
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginDTO {

    private Boolean success;
    private String message;
    private String tenantCurrencyCode;
    private String loginExchangeKey;
    private String mobileLoginSessionTimeout;
    private Boolean tPinEnabled;
    private Boolean tPinCreated;
    private String billerJsonVersion;
    private List<PocketDetail> pocketDetails = null;
    private String role;
    private String suscriberId;
    private List<ActorDeviceDTO> actorDeviceDTO = null;
    private String kycStatus;
    private Boolean issueDebitCard;
    private Boolean virtualCardCreated;
    private Boolean showCardImage;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTenantCurrencyCode() {
        return tenantCurrencyCode;
    }

    public void setTenantCurrencyCode(String tenantCurrencyCode) {
        this.tenantCurrencyCode = tenantCurrencyCode;
    }

    public String getLoginExchangeKey() {
        return loginExchangeKey;
    }

    public void setLoginExchangeKey(String loginExchangeKey) {
        this.loginExchangeKey = loginExchangeKey;
    }

    public String getMobileLoginSessionTimeout() {
        return mobileLoginSessionTimeout;
    }

    public void setMobileLoginSessionTimeout(String mobileLoginSessionTimeout) {
        this.mobileLoginSessionTimeout = mobileLoginSessionTimeout;
    }

    public Boolean getTPinEnabled() {
        return tPinEnabled;
    }

    public void setTPinEnabled(Boolean tPinEnabled) {
        this.tPinEnabled = tPinEnabled;
    }

    public Boolean getTPinCreated() {
        return tPinCreated;
    }

    public void setTPinCreated(Boolean tPinCreated) {
        this.tPinCreated = tPinCreated;
    }

    public String getBillerJsonVersion() {
        return billerJsonVersion;
    }

    public void setBillerJsonVersion(String billerJsonVersion) {
        this.billerJsonVersion = billerJsonVersion;
    }

    public List<PocketDetail> getPocketDetails() {
        return pocketDetails;
    }

    public void setPocketDetails(List<PocketDetail> pocketDetails) {
        this.pocketDetails = pocketDetails;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSuscriberId() {
        return suscriberId;
    }

    public void setSuscriberId(String suscriberId) {
        this.suscriberId = suscriberId;
    }

    public List<ActorDeviceDTO> getActorDeviceDTO() {
        return actorDeviceDTO;
    }

    public void setActorDeviceDTO(List<ActorDeviceDTO> actorDeviceDTO) {
        this.actorDeviceDTO = actorDeviceDTO;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public Boolean getIssueDebitCard() {
        return issueDebitCard;
    }

    public void setIssueDebitCard(Boolean issueDebitCard) {
        this.issueDebitCard = issueDebitCard;
    }

    public Boolean getVirtualCardCreated() {
        return virtualCardCreated;
    }

    public void setVirtualCardCreated(Boolean virtualCardCreated) {
        this.virtualCardCreated = virtualCardCreated;
    }

    public Boolean getShowCardImage() {
        return showCardImage;
    }

    public void setShowCardImage(Boolean showCardImage) {
        this.showCardImage = showCardImage;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
