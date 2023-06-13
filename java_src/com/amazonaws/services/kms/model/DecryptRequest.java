package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class DecryptRequest extends AmazonWebServiceRequest implements Serializable {
    private ByteBuffer ciphertextBlob;
    private String encryptionAlgorithm;
    private Map<String, String> encryptionContext = new HashMap();
    private List<String> grantTokens = new ArrayList();
    private String keyId;

    public DecryptRequest addEncryptionContextEntry(String str, String str2) {
        if (this.encryptionContext == null) {
            this.encryptionContext = new HashMap();
        }
        if (!this.encryptionContext.containsKey(str)) {
            this.encryptionContext.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public DecryptRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

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
        if (obj == null || !(obj instanceof DecryptRequest)) {
            return false;
        }
        DecryptRequest decryptRequest = (DecryptRequest) obj;
        if (decryptRequest.getCiphertextBlob() == null) {
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
        if (decryptRequest.getCiphertextBlob() != null && !decryptRequest.getCiphertextBlob().equals(getCiphertextBlob())) {
            return false;
        }
        if (decryptRequest.getEncryptionContext() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getEncryptionContext() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (decryptRequest.getEncryptionContext() != null && !decryptRequest.getEncryptionContext().equals(getEncryptionContext())) {
            return false;
        }
        if (decryptRequest.getGrantTokens() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getGrantTokens() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (decryptRequest.getGrantTokens() != null && !decryptRequest.getGrantTokens().equals(getGrantTokens())) {
            return false;
        }
        if (decryptRequest.getKeyId() == null) {
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
        if (decryptRequest.getKeyId() != null && !decryptRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if (decryptRequest.getEncryptionAlgorithm() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getEncryptionAlgorithm() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (decryptRequest.getEncryptionAlgorithm() == null || decryptRequest.getEncryptionAlgorithm().equals(getEncryptionAlgorithm())) {
            return true;
        }
        return false;
    }

    public ByteBuffer getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    public Map<String, String> getEncryptionContext() {
        return this.encryptionContext;
    }

    public List<String> getGrantTokens() {
        return this.grantTokens;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        if (getCiphertextBlob() == null) {
            hashCode = 0;
        } else {
            hashCode = getCiphertextBlob().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getEncryptionContext() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getEncryptionContext().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getGrantTokens() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = getGrantTokens().hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        if (getKeyId() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = getKeyId().hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        if (getEncryptionAlgorithm() != null) {
            i = getEncryptionAlgorithm().hashCode();
        }
        return i5 + i;
    }

    public void setCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
    }

    public void setEncryptionAlgorithm(String str) {
        this.encryptionAlgorithm = str;
    }

    public void setEncryptionContext(Map<String, String> map) {
        this.encryptionContext = map;
    }

    public void setGrantTokens(Collection<String> collection) {
        if (collection == null) {
            this.grantTokens = null;
        } else {
            this.grantTokens = new ArrayList(collection);
        }
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCiphertextBlob() != null) {
            sb.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        }
        if (getEncryptionContext() != null) {
            sb.append("EncryptionContext: " + getEncryptionContext() + ",");
        }
        if (getGrantTokens() != null) {
            sb.append("GrantTokens: " + getGrantTokens() + ",");
        }
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getEncryptionAlgorithm() != null) {
            sb.append("EncryptionAlgorithm: " + getEncryptionAlgorithm());
        }
        sb.append("}");
        return sb.toString();
    }

    public DecryptRequest withCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
        return this;
    }

    public DecryptRequest withEncryptionAlgorithm(String str) {
        this.encryptionAlgorithm = str;
        return this;
    }

    public DecryptRequest withEncryptionContext(Map<String, String> map) {
        this.encryptionContext = map;
        return this;
    }

    public DecryptRequest withGrantTokens(String... strArr) {
        if (getGrantTokens() == null) {
            this.grantTokens = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.grantTokens.add(str);
        }
        return this;
    }

    public DecryptRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public void setEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithmSpec) {
        this.encryptionAlgorithm = encryptionAlgorithmSpec.toString();
    }

    public DecryptRequest withEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithmSpec) {
        this.encryptionAlgorithm = encryptionAlgorithmSpec.toString();
        return this;
    }

    public DecryptRequest withGrantTokens(Collection<String> collection) {
        setGrantTokens(collection);
        return this;
    }
}