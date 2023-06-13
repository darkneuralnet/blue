package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class AssumeRoleResult implements Serializable {
    private AssumedRoleUser assumedRoleUser;
    private Credentials credentials;
    private Integer packedPolicySize;

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
        if (obj == null || !(obj instanceof AssumeRoleResult)) {
            return false;
        }
        AssumeRoleResult assumeRoleResult = (AssumeRoleResult) obj;
        if (assumeRoleResult.getCredentials() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getCredentials() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (assumeRoleResult.getCredentials() != null && !assumeRoleResult.getCredentials().equals(getCredentials())) {
            return false;
        }
        if (assumeRoleResult.getAssumedRoleUser() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getAssumedRoleUser() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (assumeRoleResult.getAssumedRoleUser() != null && !assumeRoleResult.getAssumedRoleUser().equals(getAssumedRoleUser())) {
            return false;
        }
        if (assumeRoleResult.getPackedPolicySize() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getPackedPolicySize() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleResult.getPackedPolicySize() == null || assumeRoleResult.getPackedPolicySize().equals(getPackedPolicySize())) {
            return true;
        }
        return false;
    }

    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public Integer getPackedPolicySize() {
        return this.packedPolicySize;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        if (getCredentials() == null) {
            hashCode = 0;
        } else {
            hashCode = getCredentials().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getAssumedRoleUser() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getAssumedRoleUser().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getPackedPolicySize() != null) {
            i = getPackedPolicySize().hashCode();
        }
        return i3 + i;
    }

    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public void setPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCredentials() != null) {
            sb.append("Credentials: " + getCredentials() + ",");
        }
        if (getAssumedRoleUser() != null) {
            sb.append("AssumedRoleUser: " + getAssumedRoleUser() + ",");
        }
        if (getPackedPolicySize() != null) {
            sb.append("PackedPolicySize: " + getPackedPolicySize());
        }
        sb.append("}");
        return sb.toString();
    }

    public AssumeRoleResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }

    public AssumeRoleResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    public AssumeRoleResult withPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
        return this;
    }
}
