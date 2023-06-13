package com.amazonaws.services.kms.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class CreateCustomKeyStoreResult implements Serializable {
    private String customKeyStoreId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateCustomKeyStoreResult)) {
            return false;
        }
        CreateCustomKeyStoreResult createCustomKeyStoreResult = (CreateCustomKeyStoreResult) obj;
        if (createCustomKeyStoreResult.getCustomKeyStoreId() == null) {
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
        if (createCustomKeyStoreResult.getCustomKeyStoreId() == null || createCustomKeyStoreResult.getCustomKeyStoreId().equals(getCustomKeyStoreId())) {
            return true;
        }
        return false;
    }

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    public int hashCode() {
        return 31 + (getCustomKeyStoreId() == null ? 0 : getCustomKeyStoreId().hashCode());
    }

    public void setCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomKeyStoreId() != null) {
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateCustomKeyStoreResult withCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
        return this;
    }
}