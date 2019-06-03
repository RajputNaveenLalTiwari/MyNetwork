
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.Map;

public class PocketBalancesMap {

    private LOYALTY lOYALTY;
    private CASHBACK cASHBACK;
    private EMONEY eMONEY;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public LOYALTY getLOYALTY() {
        return lOYALTY;
    }

    public void setLOYALTY(LOYALTY lOYALTY) {
        this.lOYALTY = lOYALTY;
    }

    public CASHBACK getCASHBACK() {
        return cASHBACK;
    }

    public void setCASHBACK(CASHBACK cASHBACK) {
        this.cASHBACK = cASHBACK;
    }

    public EMONEY getEMONEY() {
        return eMONEY;
    }

    public void setEMONEY(EMONEY eMONEY) {
        this.eMONEY = eMONEY;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
