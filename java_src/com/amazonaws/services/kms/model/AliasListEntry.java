package com.amazonaws.services.kms.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class AliasListEntry implements Serializable {
    private String aliasArn;
    private String aliasName;
    private String targetKeyId;

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
        if (obj == null || !(obj instanceof AliasListEntry)) {
            return false;
        }
        AliasListEntry aliasListEntry = (AliasListEntry) obj;
        if (aliasListEntry.getAliasName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getAliasName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (aliasListEntry.getAliasName() != null && !aliasListEntry.getAliasName().equals(getAliasName())) {
            return false;
        }
        if (aliasListEntry.getAliasArn() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getAliasArn() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (aliasListEntry.getAliasArn() != null && !aliasListEntry.getAliasArn().equals(getAliasArn())) {
            return false;
        }
        if (aliasListEntry.getTargetKeyId() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getTargetKeyId() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (aliasListEntry.getTargetKeyId() == null || aliasListEntry.getTargetKeyId().equals(getTargetKeyId())) {
            return true;
        }
        return false;
    }

    public String getAliasArn() {
        return this.aliasArn;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public String getTargetKeyId() {
        return this.targetKeyId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        if (getAliasName() == null) {
            hashCode = 0;
        } else {
            hashCode = getAliasName().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getAliasArn() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getAliasArn().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getTargetKeyId() != null) {
            i = getTargetKeyId().hashCode();
        }
        return i3 + i;
    }

    public void setAliasArn(String str) {
        this.aliasArn = str;
    }

    public void setAliasName(String str) {
        this.aliasName = str;
    }

    public void setTargetKeyId(String str) {
        this.targetKeyId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAliasName() != null) {
            sb.append("AliasName: " + getAliasName() + ",");
        }
        if (getAliasArn() != null) {
            sb.append("AliasArn: " + getAliasArn() + ",");
        }
        if (getTargetKeyId() != null) {
            sb.append("TargetKeyId: " + getTargetKeyId());
        }
        sb.append("}");
        return sb.toString();
    }

    public AliasListEntry withAliasArn(String str) {
        this.aliasArn = str;
        return this;
    }

    public AliasListEntry withAliasName(String str) {
        this.aliasName = str;
        return this;
    }

    public AliasListEntry withTargetKeyId(String str) {
        this.targetKeyId = str;
        return this;
    }
}
