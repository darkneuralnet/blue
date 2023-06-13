package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class UpdateCustomKeyStoreRequest extends AmazonWebServiceRequest implements Serializable {
    private String cloudHsmClusterId;
    private String customKeyStoreId;
    private String keyStorePassword;
    private String newCustomKeyStoreName;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateCustomKeyStoreRequest)) {
            return false;
        }
        UpdateCustomKeyStoreRequest updateCustomKeyStoreRequest = (UpdateCustomKeyStoreRequest) obj;
        if (updateCustomKeyStoreRequest.getCustomKeyStoreId() == null) {
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
        if (updateCustomKeyStoreRequest.getCustomKeyStoreId() != null && !updateCustomKeyStoreRequest.getCustomKeyStoreId().equals(getCustomKeyStoreId())) {
            return false;
        }
        if (updateCustomKeyStoreRequest.getNewCustomKeyStoreName() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getNewCustomKeyStoreName() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (updateCustomKeyStoreRequest.getNewCustomKeyStoreName() != null && !updateCustomKeyStoreRequest.getNewCustomKeyStoreName().equals(getNewCustomKeyStoreName())) {
            return false;
        }
        if (updateCustomKeyStoreRequest.getKeyStorePassword() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getKeyStorePassword() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (updateCustomKeyStoreRequest.getKeyStorePassword() != null && !updateCustomKeyStoreRequest.getKeyStorePassword().equals(getKeyStorePassword())) {
            return false;
        }
        if (updateCustomKeyStoreRequest.getCloudHsmClusterId() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getCloudHsmClusterId() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (updateCustomKeyStoreRequest.getCloudHsmClusterId() == null || updateCustomKeyStoreRequest.getCloudHsmClusterId().equals(getCloudHsmClusterId())) {
            return true;
        }
        return false;
    }

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    public String getKeyStorePassword() {
        return this.keyStorePassword;
    }

    public String getNewCustomKeyStoreName() {
        return this.newCustomKeyStoreName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        if (getCustomKeyStoreId() == null) {
            hashCode = 0;
        } else {
            hashCode = getCustomKeyStoreId().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getNewCustomKeyStoreName() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getNewCustomKeyStoreName().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getKeyStorePassword() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = getKeyStorePassword().hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        if (getCloudHsmClusterId() != null) {
            i = getCloudHsmClusterId().hashCode();
        }
        return i4 + i;
    }

    public void setCloudHsmClusterId(String str) {
        this.cloudHsmClusterId = str;
    }

    public void setCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
    }

    public void setKeyStorePassword(String str) {
        this.keyStorePassword = str;
    }

    public void setNewCustomKeyStoreName(String str) {
        this.newCustomKeyStoreName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomKeyStoreId() != null) {
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId() + ",");
        }
        if (getNewCustomKeyStoreName() != null) {
            sb.append("NewCustomKeyStoreName: " + getNewCustomKeyStoreName() + ",");
        }
        if (getKeyStorePassword() != null) {
            sb.append("KeyStorePassword: " + getKeyStorePassword() + ",");
        }
        if (getCloudHsmClusterId() != null) {
            sb.append("CloudHsmClusterId: " + getCloudHsmClusterId());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateCustomKeyStoreRequest withCloudHsmClusterId(String str) {
        this.cloudHsmClusterId = str;
        return this;
    }

    public UpdateCustomKeyStoreRequest withCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
        return this;
    }

    public UpdateCustomKeyStoreRequest withKeyStorePassword(String str) {
        this.keyStorePassword = str;
        return this;
    }

    public UpdateCustomKeyStoreRequest withNewCustomKeyStoreName(String str) {
        this.newCustomKeyStoreName = str;
        return this;
    }
}
