package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class GenerateDataKeyPairResult implements Serializable {
    private String keyId;
    private String keyPairSpec;
    private ByteBuffer privateKeyCiphertextBlob;
    private ByteBuffer privateKeyPlaintext;
    private ByteBuffer publicKey;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GenerateDataKeyPairResult)) {
            return false;
        }
        GenerateDataKeyPairResult generateDataKeyPairResult = (GenerateDataKeyPairResult) obj;
        if (generateDataKeyPairResult.getPrivateKeyCiphertextBlob() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getPrivateKeyCiphertextBlob() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (generateDataKeyPairResult.getPrivateKeyCiphertextBlob() != null && !generateDataKeyPairResult.getPrivateKeyCiphertextBlob().equals(getPrivateKeyCiphertextBlob())) {
            return false;
        }
        if (generateDataKeyPairResult.getPrivateKeyPlaintext() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getPrivateKeyPlaintext() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (generateDataKeyPairResult.getPrivateKeyPlaintext() != null && !generateDataKeyPairResult.getPrivateKeyPlaintext().equals(getPrivateKeyPlaintext())) {
            return false;
        }
        if (generateDataKeyPairResult.getPublicKey() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getPublicKey() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (generateDataKeyPairResult.getPublicKey() != null && !generateDataKeyPairResult.getPublicKey().equals(getPublicKey())) {
            return false;
        }
        if (generateDataKeyPairResult.getKeyId() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getKeyId() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (generateDataKeyPairResult.getKeyId() != null && !generateDataKeyPairResult.getKeyId().equals(getKeyId())) {
            return false;
        }
        if (generateDataKeyPairResult.getKeyPairSpec() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getKeyPairSpec() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (generateDataKeyPairResult.getKeyPairSpec() == null || generateDataKeyPairResult.getKeyPairSpec().equals(getKeyPairSpec())) {
            return true;
        }
        return false;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getKeyPairSpec() {
        return this.keyPairSpec;
    }

    public ByteBuffer getPrivateKeyCiphertextBlob() {
        return this.privateKeyCiphertextBlob;
    }

    public ByteBuffer getPrivateKeyPlaintext() {
        return this.privateKeyPlaintext;
    }

    public ByteBuffer getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        if (getPrivateKeyCiphertextBlob() == null) {
            hashCode = 0;
        } else {
            hashCode = getPrivateKeyCiphertextBlob().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getPrivateKeyPlaintext() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getPrivateKeyPlaintext().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getPublicKey() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = getPublicKey().hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        if (getKeyId() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = getKeyId().hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        if (getKeyPairSpec() != null) {
            i = getKeyPairSpec().hashCode();
        }
        return i5 + i;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setKeyPairSpec(String str) {
        this.keyPairSpec = str;
    }

    public void setPrivateKeyCiphertextBlob(ByteBuffer byteBuffer) {
        this.privateKeyCiphertextBlob = byteBuffer;
    }

    public void setPrivateKeyPlaintext(ByteBuffer byteBuffer) {
        this.privateKeyPlaintext = byteBuffer;
    }

    public void setPublicKey(ByteBuffer byteBuffer) {
        this.publicKey = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPrivateKeyCiphertextBlob() != null) {
            sb.append("PrivateKeyCiphertextBlob: " + getPrivateKeyCiphertextBlob() + ",");
        }
        if (getPrivateKeyPlaintext() != null) {
            sb.append("PrivateKeyPlaintext: " + getPrivateKeyPlaintext() + ",");
        }
        if (getPublicKey() != null) {
            sb.append("PublicKey: " + getPublicKey() + ",");
        }
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getKeyPairSpec() != null) {
            sb.append("KeyPairSpec: " + getKeyPairSpec());
        }
        sb.append("}");
        return sb.toString();
    }

    public GenerateDataKeyPairResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public GenerateDataKeyPairResult withKeyPairSpec(String str) {
        this.keyPairSpec = str;
        return this;
    }

    public GenerateDataKeyPairResult withPrivateKeyCiphertextBlob(ByteBuffer byteBuffer) {
        this.privateKeyCiphertextBlob = byteBuffer;
        return this;
    }

    public GenerateDataKeyPairResult withPrivateKeyPlaintext(ByteBuffer byteBuffer) {
        this.privateKeyPlaintext = byteBuffer;
        return this;
    }

    public GenerateDataKeyPairResult withPublicKey(ByteBuffer byteBuffer) {
        this.publicKey = byteBuffer;
        return this;
    }

    public void setKeyPairSpec(DataKeyPairSpec dataKeyPairSpec) {
        this.keyPairSpec = dataKeyPairSpec.toString();
    }

    public GenerateDataKeyPairResult withKeyPairSpec(DataKeyPairSpec dataKeyPairSpec) {
        this.keyPairSpec = dataKeyPairSpec.toString();
        return this;
    }
}