package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class CreateCustomKeyStoreRequest extends AmazonWebServiceRequest implements Serializable {
    private String cloudHsmClusterId;
    private String customKeyStoreName;
    private String keyStorePassword;
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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateCustomKeyStoreRequest)) {
            return false;
        }
        CreateCustomKeyStoreRequest createCustomKeyStoreRequest = (CreateCustomKeyStoreRequest) obj;
        if (createCustomKeyStoreRequest.getCustomKeyStoreName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getCustomKeyStoreName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (createCustomKeyStoreRequest.getCustomKeyStoreName() != null && !createCustomKeyStoreRequest.getCustomKeyStoreName().equals(getCustomKeyStoreName())) {
            return false;
        }
        if (createCustomKeyStoreRequest.getCloudHsmClusterId() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCloudHsmClusterId() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (createCustomKeyStoreRequest.getCloudHsmClusterId() != null && !createCustomKeyStoreRequest.getCloudHsmClusterId().equals(getCloudHsmClusterId())) {
            return false;
        }
        if (createCustomKeyStoreRequest.getTrustAnchorCertificate() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getTrustAnchorCertificate() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (createCustomKeyStoreRequest.getTrustAnchorCertificate() != null && !createCustomKeyStoreRequest.getTrustAnchorCertificate().equals(getTrustAnchorCertificate())) {
            return false;
        }
        if (createCustomKeyStoreRequest.getKeyStorePassword() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getKeyStorePassword() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (createCustomKeyStoreRequest.getKeyStorePassword() == null || createCustomKeyStoreRequest.getKeyStorePassword().equals(getKeyStorePassword())) {
            return true;
        }
        return false;
    }

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    public String getCustomKeyStoreName() {
        return this.customKeyStoreName;
    }

    public String getKeyStorePassword() {
        return this.keyStorePassword;
    }

    public String getTrustAnchorCertificate() {
        return this.trustAnchorCertificate;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        if (getCustomKeyStoreName() == null) {
            hashCode = 0;
        } else {
            hashCode = getCustomKeyStoreName().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getCloudHsmClusterId() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getCloudHsmClusterId().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getTrustAnchorCertificate() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = getTrustAnchorCertificate().hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        if (getKeyStorePassword() != null) {
            i = getKeyStorePassword().hashCode();
        }
        return i4 + i;
    }

    public void setCloudHsmClusterId(String str) {
        this.cloudHsmClusterId = str;
    }

    public void setCustomKeyStoreName(String str) {
        this.customKeyStoreName = str;
    }

    public void setKeyStorePassword(String str) {
        this.keyStorePassword = str;
    }

    public void setTrustAnchorCertificate(String str) {
        this.trustAnchorCertificate = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomKeyStoreName() != null) {
            sb.append("CustomKeyStoreName: " + getCustomKeyStoreName() + ",");
        }
        if (getCloudHsmClusterId() != null) {
            sb.append("CloudHsmClusterId: " + getCloudHsmClusterId() + ",");
        }
        if (getTrustAnchorCertificate() != null) {
            sb.append("TrustAnchorCertificate: " + getTrustAnchorCertificate() + ",");
        }
        if (getKeyStorePassword() != null) {
            sb.append("KeyStorePassword: " + getKeyStorePassword());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateCustomKeyStoreRequest withCloudHsmClusterId(String str) {
        this.cloudHsmClusterId = str;
        return this;
    }

    public CreateCustomKeyStoreRequest withCustomKeyStoreName(String str) {
        this.customKeyStoreName = str;
        return this;
    }

    public CreateCustomKeyStoreRequest withKeyStorePassword(String str) {
        this.keyStorePassword = str;
        return this;
    }

    public CreateCustomKeyStoreRequest withTrustAnchorCertificate(String str) {
        this.trustAnchorCertificate = str;
        return this;
    }
}
