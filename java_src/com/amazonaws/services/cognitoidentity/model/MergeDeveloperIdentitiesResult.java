package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class MergeDeveloperIdentitiesResult implements Serializable {
    private String identityId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MergeDeveloperIdentitiesResult)) {
            return false;
        }
        MergeDeveloperIdentitiesResult mergeDeveloperIdentitiesResult = (MergeDeveloperIdentitiesResult) obj;
        if (mergeDeveloperIdentitiesResult.getIdentityId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (mergeDeveloperIdentitiesResult.getIdentityId() == null || mergeDeveloperIdentitiesResult.getIdentityId().equals(getIdentityId())) {
            return true;
        }
        return false;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public int hashCode() {
        return 31 + (getIdentityId() == null ? 0 : getIdentityId().hashCode());
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityId() != null) {
            sb.append("IdentityId: " + getIdentityId());
        }
        sb.append("}");
        return sb.toString();
    }

    public MergeDeveloperIdentitiesResult withIdentityId(String str) {
        this.identityId = str;
        return this;
    }
}