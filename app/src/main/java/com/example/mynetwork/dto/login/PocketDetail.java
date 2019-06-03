
package com.example.mynetwork.dto.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PocketDetail {

    private String actorRoleType;
    private String name;
    private String eMailId;
    private String mdnId;
    private String roleId;
    private String walletId;
    private String offerId;
    private TotalBalance totalBalance;
    private List<PocketSummaryDetailsArrayDTO> pocketSummaryDetailsArrayDTO = null;
    private List<Object> childPocketSummaryDetailsArrayDTO = null;
    private PocketCountMap pocketCountMap;
    private PocketBalancesMap pocketBalancesMap;
    private List<PrepaidCardDTOList> prepaidCardDTOList = null;
    private Boolean issueDebitCard;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getActorRoleType() {
        return actorRoleType;
    }

    public void setActorRoleType(String actorRoleType) {
        this.actorRoleType = actorRoleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEMailId() {
        return eMailId;
    }

    public void setEMailId(String eMailId) {
        this.eMailId = eMailId;
    }

    public String getMdnId() {
        return mdnId;
    }

    public void setMdnId(String mdnId) {
        this.mdnId = mdnId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public TotalBalance getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(TotalBalance totalBalance) {
        this.totalBalance = totalBalance;
    }

    public List<PocketSummaryDetailsArrayDTO> getPocketSummaryDetailsArrayDTO() {
        return pocketSummaryDetailsArrayDTO;
    }

    public void setPocketSummaryDetailsArrayDTO(List<PocketSummaryDetailsArrayDTO> pocketSummaryDetailsArrayDTO) {
        this.pocketSummaryDetailsArrayDTO = pocketSummaryDetailsArrayDTO;
    }

    public List<Object> getChildPocketSummaryDetailsArrayDTO() {
        return childPocketSummaryDetailsArrayDTO;
    }

    public void setChildPocketSummaryDetailsArrayDTO(List<Object> childPocketSummaryDetailsArrayDTO) {
        this.childPocketSummaryDetailsArrayDTO = childPocketSummaryDetailsArrayDTO;
    }

    public PocketCountMap getPocketCountMap() {
        return pocketCountMap;
    }

    public void setPocketCountMap(PocketCountMap pocketCountMap) {
        this.pocketCountMap = pocketCountMap;
    }

    public PocketBalancesMap getPocketBalancesMap() {
        return pocketBalancesMap;
    }

    public void setPocketBalancesMap(PocketBalancesMap pocketBalancesMap) {
        this.pocketBalancesMap = pocketBalancesMap;
    }

    public List<PrepaidCardDTOList> getPrepaidCardDTOList() {
        return prepaidCardDTOList;
    }

    public void setPrepaidCardDTOList(List<PrepaidCardDTOList> prepaidCardDTOList) {
        this.prepaidCardDTOList = prepaidCardDTOList;
    }

    public Boolean getIssueDebitCard() {
        return issueDebitCard;
    }

    public void setIssueDebitCard(Boolean issueDebitCard) {
        this.issueDebitCard = issueDebitCard;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
