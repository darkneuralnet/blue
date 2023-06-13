package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class GenerateRandomResult implements Serializable {
    private ByteBuffer plaintext;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GenerateRandomResult)) {
            return false;
        }
        GenerateRandomResult generateRandomResult = (GenerateRandomResult) obj;
        if (generateRandomResult.getPlaintext() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getPlaintext() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (generateRandomResult.getPlaintext() == null || generateRandomResult.getPlaintext().equals(getPlaintext())) {
            return true;
        }
        return false;
    }

    public ByteBuffer getPlaintext() {
        return this.plaintext;
    }

    public int hashCode() {
        return 31 + (getPlaintext() == null ? 0 : getPlaintext().hashCode());
    }

    public void setPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPlaintext() != null) {
            sb.append("Plaintext: " + getPlaintext());
        }
        sb.append("}");
        return sb.toString();
    }

    public GenerateRandomResult withPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
        return this;
    }
}
