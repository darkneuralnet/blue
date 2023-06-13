package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class PolicyDescriptorType implements Serializable {
    private String arn;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PolicyDescriptorType)) {
            return false;
        }
        PolicyDescriptorType policyDescriptorType = (PolicyDescriptorType) obj;
        if (policyDescriptorType.getArn() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getArn() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (policyDescriptorType.getArn() == null || policyDescriptorType.getArn().equals(getArn())) {
            return true;
        }
        return false;
    }

    public String getArn() {
        return this.arn;
    }

    public int hashCode() {
        return 31 + (getArn() == null ? 0 : getArn().hashCode());
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null) {
            sb.append("arn: " + getArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public PolicyDescriptorType withArn(String str) {
        this.arn = str;
        return this;
    }
}