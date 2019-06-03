
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.Map;

public class PocketCountMap {

    private Integer lOYALTY;
    private Integer cASHBACK;
    private Integer eMONEY;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getLOYALTY() {
        return lOYALTY;
    }

    public void setLOYALTY(Integer lOYALTY) {
        this.lOYALTY = lOYALTY;
    }

    public Integer getCASHBACK() {
        return cASHBACK;
    }

    public void setCASHBACK(Integer cASHBACK) {
        this.cASHBACK = cASHBACK;
    }

    public Integer getEMONEY() {
        return eMONEY;
    }

    public void setEMONEY(Integer eMONEY) {
        this.eMONEY = eMONEY;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
