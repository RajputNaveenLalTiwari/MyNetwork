
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.Map;

public class ActorDeviceDTO {

    private String actorRoleId;
    private String deviceId;
    private Boolean isNotificationEnabled;
    private String deviceType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getActorRoleId() {
        return actorRoleId;
    }

    public void setActorRoleId(String actorRoleId) {
        this.actorRoleId = actorRoleId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Boolean getIsNotificationEnabled() {
        return isNotificationEnabled;
    }

    public void setIsNotificationEnabled(Boolean isNotificationEnabled) {
        this.isNotificationEnabled = isNotificationEnabled;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
