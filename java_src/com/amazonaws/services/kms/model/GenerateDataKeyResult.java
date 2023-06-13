package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class GenerateDataKeyResult implements Serializable {
    private ByteBuffer ciphertextBlob;
    private String keyId;
    private ByteBuffer plaintext;

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
        if (obj == null || !(obj instanceof GenerateDataKeyResult)) {
            return false;
        }
        GenerateDataKeyResult generateDataKeyResult = (GenerateDataKeyResult) obj;
        if (generateDataKeyResult.getCiphertextBlob() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getCiphertextBlob() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (generateDataKeyResult.getCiphertextBlob() != null && !generateDataKeyResult.getCiphertextBlob().equals(getCiphertextBlob())) {
            return false;
        }
        if (generateDataKeyResult.getPlaintext() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getPlaintext() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (generateDataKeyResult.getPlaintext() != null && !generateDataKeyResult.getPlaintext().equals(getPlaintext())) {
            return false;
        }
        if (generateDataKeyResult.getKeyId() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getKeyId() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (generateDataKeyResult.getKeyId() == null || generateDataKeyResult.getKeyId().equals(getKeyId())) {
            return true;
        }
        return false;
    }

    public ByteBuffer getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public ByteBuffer getPlaintext() {
        return this.plaintext;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        if (getCiphertextBlob() == null) {
            hashCode = 0;
        } else {
            hashCode = getCiphertextBlob().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getPlaintext() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getPlaintext().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getKeyId() != null) {
            i = getKeyId().hashCode();
        }
        return i3 + i;
    }

    public void setCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCiphertextBlob() != null) {
            sb.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        }
        if (getPlaintext() != null) {
            sb.append("Plaintext: " + getPlaintext() + ",");
        }
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId());
        }
        sb.append("}");
        return sb.toString();
    }

    public GenerateDataKeyResult withCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
        return this;
    }

    public GenerateDataKeyResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public GenerateDataKeyResult withPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
        return this;
    }
}
