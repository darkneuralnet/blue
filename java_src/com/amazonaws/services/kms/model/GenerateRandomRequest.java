package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class GenerateRandomRequest extends AmazonWebServiceRequest implements Serializable {
    private String customKeyStoreId;
    private Integer numberOfBytes;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GenerateRandomRequest)) {
            return false;
        }
        GenerateRandomRequest generateRandomRequest = (GenerateRandomRequest) obj;
        if (generateRandomRequest.getNumberOfBytes() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getNumberOfBytes() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (generateRandomRequest.getNumberOfBytes() != null && !generateRandomRequest.getNumberOfBytes().equals(getNumberOfBytes())) {
            return false;
        }
        if (generateRandomRequest.getCustomKeyStoreId() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCustomKeyStoreId() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (generateRandomRequest.getCustomKeyStoreId() == null || generateRandomRequest.getCustomKeyStoreId().equals(getCustomKeyStoreId())) {
            return true;
        }
        return false;
    }

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (getNumberOfBytes() == null) {
            hashCode = 0;
        } else {
            hashCode = getNumberOfBytes().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getCustomKeyStoreId() != null) {
            i = getCustomKeyStoreId().hashCode();
        }
        return i2 + i;
    }

    public void setCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
    }

    public void setNumberOfBytes(Integer num) {
        this.numberOfBytes = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNumberOfBytes() != null) {
            sb.append("NumberOfBytes: " + getNumberOfBytes() + ",");
        }
        if (getCustomKeyStoreId() != null) {
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId());
        }
        sb.append("}");
        return sb.toString();
    }

    public GenerateRandomRequest withCustomKeyStoreId(String str) {
        this.customKeyStoreId = str;
        return this;
    }

    public GenerateRandomRequest withNumberOfBytes(Integer num) {
        this.numberOfBytes = num;
        return this;
    }
}
