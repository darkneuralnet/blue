package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public enum EncryptionAlgorithmSpec {
    SYMMETRIC_DEFAULT("SYMMETRIC_DEFAULT"),
    RSAES_OAEP_SHA_1("RSAES_OAEP_SHA_1"),
    RSAES_OAEP_SHA_256("RSAES_OAEP_SHA_256");
    
    private static final Map<String, EncryptionAlgorithmSpec> enumMap;
    private String value;

    static {
        EncryptionAlgorithmSpec encryptionAlgorithmSpec = SYMMETRIC_DEFAULT;
        EncryptionAlgorithmSpec encryptionAlgorithmSpec2 = RSAES_OAEP_SHA_1;
        EncryptionAlgorithmSpec encryptionAlgorithmSpec3 = RSAES_OAEP_SHA_256;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("SYMMETRIC_DEFAULT", encryptionAlgorithmSpec);
        hashMap.put("RSAES_OAEP_SHA_1", encryptionAlgorithmSpec2);
        hashMap.put("RSAES_OAEP_SHA_256", encryptionAlgorithmSpec3);
    }

    EncryptionAlgorithmSpec(String str) {
        this.value = str;
    }

    public static EncryptionAlgorithmSpec fromValue(String str) {
        if (str != null && !str.isEmpty()) {
            Map<String, EncryptionAlgorithmSpec> map = enumMap;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
        }
        throw new IllegalArgumentException("Value cannot be null or empty!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
