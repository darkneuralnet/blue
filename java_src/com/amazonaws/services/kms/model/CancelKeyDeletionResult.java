package com.amazonaws.services.kms.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class CancelKeyDeletionResult implements Serializable {
    private String keyId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CancelKeyDeletionResult)) {
            return false;
        }
        CancelKeyDeletionResult cancelKeyDeletionResult = (CancelKeyDeletionResult) obj;
        if (cancelKeyDeletionResult.getKeyId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getKeyId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (cancelKeyDeletionResult.getKeyId() == null || cancelKeyDeletionResult.getKeyId().equals(getKeyId())) {
            return true;
        }
        return false;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        return 31 + (getKeyId() == null ? 0 : getKeyId().hashCode());
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId());
        }
        sb.append("}");
        return sb.toString();
    }

    public CancelKeyDeletionResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }
}