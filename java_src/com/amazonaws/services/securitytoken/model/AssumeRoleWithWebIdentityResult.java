package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class AssumeRoleWithWebIdentityResult implements Serializable {
    private AssumedRoleUser assumedRoleUser;
    private String audience;
    private Credentials credentials;
    private Integer packedPolicySize;
    private String provider;
    private String subjectFromWebIdentityToken;

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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithWebIdentityResult)) {
            return false;
        }
        AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentityResult = (AssumeRoleWithWebIdentityResult) obj;
        if (assumeRoleWithWebIdentityResult.getCredentials() == null) {
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
        if (assumeRoleWithWebIdentityResult.getCredentials() != null && !assumeRoleWithWebIdentityResult.getCredentials().equals(getCredentials())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getSubjectFromWebIdentityToken() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getSubjectFromWebIdentityToken() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getSubjectFromWebIdentityToken() != null && !assumeRoleWithWebIdentityResult.getSubjectFromWebIdentityToken().equals(getSubjectFromWebIdentityToken())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getAssumedRoleUser() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getAssumedRoleUser() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getAssumedRoleUser() != null && !assumeRoleWithWebIdentityResult.getAssumedRoleUser().equals(getAssumedRoleUser())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getPackedPolicySize() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getPackedPolicySize() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getPackedPolicySize() != null && !assumeRoleWithWebIdentityResult.getPackedPolicySize().equals(getPackedPolicySize())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getProvider() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getProvider() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getProvider() != null && !assumeRoleWithWebIdentityResult.getProvider().equals(getProvider())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getAudience() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getAudience() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getAudience() == null || assumeRoleWithWebIdentityResult.getAudience().equals(getAudience())) {
            return true;
        }
        return false;
    }

    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public String getAudience() {
        return this.audience;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public Integer getPackedPolicySize() {
        return this.packedPolicySize;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getSubjectFromWebIdentityToken() {
        return this.subjectFromWebIdentityToken;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 0;
        if (getCredentials() == null) {
            hashCode = 0;
        } else {
            hashCode = getCredentials().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getSubjectFromWebIdentityToken() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getSubjectFromWebIdentityToken().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getAssumedRoleUser() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = getAssumedRoleUser().hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        if (getPackedPolicySize() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = getPackedPolicySize().hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        if (getProvider() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = getProvider().hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        if (getAudience() != null) {
            i = getAudience().hashCode();
        }
        return i6 + i;
    }

    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }

    public void setAudience(String str) {
        this.audience = str;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public void setPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSubjectFromWebIdentityToken(String str) {
        this.subjectFromWebIdentityToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCredentials() != null) {
            sb.append("Credentials: " + getCredentials() + ",");
        }
        if (getSubjectFromWebIdentityToken() != null) {
            sb.append("SubjectFromWebIdentityToken: " + getSubjectFromWebIdentityToken() + ",");
        }
        if (getAssumedRoleUser() != null) {
            sb.append("AssumedRoleUser: " + getAssumedRoleUser() + ",");
        }
        if (getPackedPolicySize() != null) {
            sb.append("PackedPolicySize: " + getPackedPolicySize() + ",");
        }
        if (getProvider() != null) {
            sb.append("Provider: " + getProvider() + ",");
        }
        if (getAudience() != null) {
            sb.append("Audience: " + getAudience());
        }
        sb.append("}");
        return sb.toString();
    }

    public AssumeRoleWithWebIdentityResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withAudience(String str) {
        this.audience = str;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withProvider(String str) {
        this.provider = str;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withSubjectFromWebIdentityToken(String str) {
        this.subjectFromWebIdentityToken = str;
        return this;
    }
}
