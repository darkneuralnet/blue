package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class RetireGrantRequest extends AmazonWebServiceRequest implements Serializable {
    private String grantId;
    private String grantToken;
    private String keyId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RetireGrantRequest)) {
            return false;
        }
        RetireGrantRequest retireGrantRequest = (RetireGrantRequest) obj;
        if (retireGrantRequest.getGrantToken() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getGrantToken() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (retireGrantRequest.getGrantToken() != null && !retireGrantRequest.getGrantToken().equals(getGrantToken())) {
            return false;
        }
        if (retireGrantRequest.getKeyId() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getKeyId() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (retireGrantRequest.getKeyId() != null && !retireGrantRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if (retireGrantRequest.getGrantId() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getGrantId() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (retireGrantRequest.getGrantId() == null || retireGrantRequest.getGrantId().equals(getGrantId())) {
            return true;
        }
        return false;
    }

    public String getGrantId() {
        return this.grantId;
    }

    public String getGrantToken() {
        return this.grantToken;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        if (getGrantToken() == null) {
            hashCode = 0;
        } else {
            hashCode = getGrantToken().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getKeyId() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getKeyId().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getGrantId() != null) {
            i = getGrantId().hashCode();
        }
        return i3 + i;
    }

    public void setGrantId(String str) {
        this.grantId = str;
    }

    public void setGrantToken(String str) {
        this.grantToken = str;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGrantToken() != null) {
            sb.append("GrantToken: " + getGrantToken() + ",");
        }
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getGrantId() != null) {
            sb.append("GrantId: " + getGrantId());
        }
        sb.append("}");
        return sb.toString();
    }

    public RetireGrantRequest withGrantId(String str) {
        this.grantId = str;
        return this;
    }

    public RetireGrantRequest withGrantToken(String str) {
        this.grantToken = str;
        return this;
    }

    public RetireGrantRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }
}