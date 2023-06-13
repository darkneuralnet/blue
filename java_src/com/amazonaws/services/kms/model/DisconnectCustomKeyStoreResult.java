package com.amazonaws.services.kms.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class DisconnectCustomKeyStoreResult implements Serializable {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DisconnectCustomKeyStoreResult)) {
            return false;
        }
        DisconnectCustomKeyStoreResult disconnectCustomKeyStoreResult = (DisconnectCustomKeyStoreResult) obj;
        return true;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "{}";
    }
}
