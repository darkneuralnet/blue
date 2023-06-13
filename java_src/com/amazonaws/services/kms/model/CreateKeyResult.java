package com.amazonaws.services.kms.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class CreateKeyResult implements Serializable {
    private KeyMetadata keyMetadata;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateKeyResult)) {
            return false;
        }
        CreateKeyResult createKeyResult = (CreateKeyResult) obj;
        if (createKeyResult.getKeyMetadata() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getKeyMetadata() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (createKeyResult.getKeyMetadata() == null || createKeyResult.getKeyMetadata().equals(getKeyMetadata())) {
            return true;
        }
        return false;
    }

    public KeyMetadata getKeyMetadata() {
        return this.keyMetadata;
    }

    public int hashCode() {
        return 31 + (getKeyMetadata() == null ? 0 : getKeyMetadata().hashCode());
    }

    public void setKeyMetadata(KeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyMetadata() != null) {
            sb.append("KeyMetadata: " + getKeyMetadata());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateKeyResult withKeyMetadata(KeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
        return this;
    }
}
