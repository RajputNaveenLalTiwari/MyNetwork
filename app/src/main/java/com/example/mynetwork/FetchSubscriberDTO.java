
package com.example.mynetwork;

import java.util.HashMap;
import java.util.Map;

public class FetchSubscriberDTO {

    private Boolean success;
    private String message;
    private String kycStatus;
    private String name;
    private String profilePic;
    private Boolean activationPending;
    private Boolean passwordCreated;
    private Boolean subscriberRegistered;
    private Boolean userIdCreated;
    private String documentType;
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

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public Boolean getActivationPending() {
        return activationPending;
    }

    public void setActivationPending(Boolean activationPending) {
        this.activationPending = activationPending;
    }

    public Boolean getPasswordCreated() {
        return passwordCreated;
    }

    public void setPasswordCreated(Boolean passwordCreated) {
        this.passwordCreated = passwordCreated;
    }

    public Boolean getSubscriberRegistered() {
        return subscriberRegistered;
    }

    public void setSubscriberRegistered(Boolean subscriberRegistered) {
        this.subscriberRegistered = subscriberRegistered;
    }

    public Boolean getUserIdCreated() {
        return userIdCreated;
    }

    public void setUserIdCreated(Boolean userIdCreated) {
        this.userIdCreated = userIdCreated;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
