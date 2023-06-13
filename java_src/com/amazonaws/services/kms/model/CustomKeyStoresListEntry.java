package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.util.Date;
/* loaded from: classes3.dex */
public class CustomKeyStoresListEntry implements Serializable {
    private String cloudHsmClusterId;
    private String connectionErrorCode;
    private String connectionState;
    private Date creationDate;
    private String customKeyStoreId;
    private String customKeyStoreName;
    private String trustAnchorCertificate;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CustomKeyStoresListEntry)) {
            return false;
        }
        CustomKeyStoresListEntry customKeyStoresListEntry = (CustomKeyStoresListEntry) obj;
        if (customKeyStoresListEntry.getCustomKeyStoreId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getCustomKeyStoreId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (customKeyStoresListEntry.getCustomKeyStoreId() != null && !customKeyStoresListEntry.getCustomKeyStoreId().equals(getCustomKeyStoreId())) {
            return false;
        }
        if (customKeyStoresListEntry.getCustomKeyStoreName() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCustomKeyStoreName() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (customKeyStoresListEntry.getCustomKeyStoreName() != null && !customKeyStoresListEntry.getCustomKeyStoreName().equals(getCustomKeyStoreName())) {
            return false;
        }
        if (customKeyStoresListEntry.getCloudHsmClusterId() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getCloudHsmClusterId() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (customKeyStoresListEntry.getCloudHsmClusterId() != null && !customKeyStoresListEntry.getCloudHsmClusterId().equals(getCloudHsmClusterId())) {
            return false;
        }
        if (customKeyStoresListEntry.getTrustAnchorCertificate() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getTrustAnchorCertificate() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (customKeyStoresListEntry.getTrustAnchorCertificate() != null && !customKeyStoresListEntry.getTrustAnchorCertificate().equals(getTrustAnchorCertificate())) {
            return false;
        }
        if (customKeyStoresListEntry.getConnectionState() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getConnectionState() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (customKeyStoresListEntry.getConnectionState() != null && !customKeyStoresListEntry.getConnectionState().equals(getConnectionState())) {
            return false;
        }
        if (customKeyStoresListEntry.getConnectionErrorCode() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getConnectionErrorCode() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (customKeyStoresListEntry.getConnectionErrorCode() != null && !customKeyStoresListEntry.getConnectionErrorCode().equals(getConnectionErrorCode())) {
            return false;
        }
        if (customKeyStoresListEntry.getCreationDate() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (getCreationDate() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (customKeyStoresListEntry.getCreationDate() == null || customKeyStoresListEntry.getCreationDate().equals(getCreationDate())) {
            return true;
        }
        return false;
    }

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    public String getConnectionErrorCode() {
        return this.connectionErrorCode;
    }

    public String getConnectionState() {
        return this.connectionState;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    public String getCustomKeyStoreName() {
        return this.customKeyStoreName;
    }

    public String getTrustAnchorCertificate() {
        return this.trustAnchorCertificate;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = 0;
        if (getCustomKeyStoreId() == null) {
            hashCode = 0;
        } else {
            hashCode = getCustomKeyStoreId().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getCustomKeyStoreName() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getCustomKeyStoreName().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getCloudHsmClusterId() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = getCloudHsmClusterId().hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        if (getTrustAnchorCertificate() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = getTrustAnchorCertificate().hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        if (getConnectionState() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = getConnectionState().hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        if (getConnectionErrorCode() == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = getConnectionErrorCode().hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        if (getCreationDate() != null) {
            i = getCreationDate().hashCode();
        }
        return i7 + i;
    }

    public void setCloudHsmClusterId(String str) {
        this.cloudHsmClusterId = str;
    }

    public void setConnectionErrorCode(String str) {
        this.connectionErrorCode = str;
    }

    public void setConnectionState(String str) {
        this.connectionState = str;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
    }

    public void setCustomKeyStoreName(String str) {
        this.customKeyStoreName = str;
    }

    public void setTrustAnchorCertificate(String str) {
        this.trustAnchorCertificate = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomKeyStoreId() != null) {
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId() + ",");
        }
        if (getCustomKeyStoreName() != null) {
            sb.append("CustomKeyStoreName: " + getCustomKeyStoreName() + ",");
        }
        if (getCloudHsmClusterId() != null) {
            sb.append("CloudHsmClusterId: " + getCloudHsmClusterId() + ",");
        }
        if (getTrustAnchorCertificate() != null) {
            sb.append("TrustAnchorCertificate: " + getTrustAnchorCertificate() + ",");
        }
        if (getConnectionState() != null) {
            sb.append("ConnectionState: " + getConnectionState() + ",");
        }
        if (getConnectionErrorCode() != null) {
            sb.append("ConnectionErrorCode: " + getConnectionErrorCode() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("CreationDate: " + getCreationDate());
        }
        sb.append("}");
        return sb.toString();
    }

    public CustomKeyStoresListEntry withCloudHsmClusterId(String str) {
        this.cloudHsmClusterId = str;
        return this;
    }

    public CustomKeyStoresListEntry withConnectionErrorCode(String str) {
        this.connectionErrorCode = str;
        return this;
    }

    public CustomKeyStoresListEntry withConnectionState(String str) {
        this.connectionState = str;
        return this;
    }

    public CustomKeyStoresListEntry withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public CustomKeyStoresListEntry withCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
        return this;
    }

    public CustomKeyStoresListEntry withCustomKeyStoreName(String str) {
        this.customKeyStoreName = str;
        return this;
    }

    public CustomKeyStoresListEntry withTrustAnchorCertificate(String str) {
        this.trustAnchorCertificate = str;
        return this;
    }

    public void setConnectionErrorCode(ConnectionErrorCodeType connectionErrorCodeType) {
        this.connectionErrorCode = connectionErrorCodeType.toString();
    }

    public void setConnectionState(ConnectionStateType connectionStateType) {
        this.connectionState = connectionStateType.toString();
    }

    public CustomKeyStoresListEntry withConnectionErrorCode(ConnectionErrorCodeType connectionErrorCodeType) {
        this.connectionErrorCode = connectionErrorCodeType.toString();
        return this;
    }

    public CustomKeyStoresListEntry withConnectionState(ConnectionStateType connectionStateType) {
        this.connectionState = connectionStateType.toString();
        return this;
    }
}
