package com.amazonaws.services.kms.model;

import com.amazonaws.services.p026s3.model.BucketLifecycleConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public enum KeyState {
    Enabled("Enabled"),
    Disabled(BucketLifecycleConfiguration.DISABLED),
    PendingDeletion("PendingDeletion"),
    PendingImport("PendingImport"),
    Unavailable("Unavailable");
    
    private static final Map<String, KeyState> enumMap;
    private String value;

    static {
        KeyState keyState = Enabled;
        KeyState keyState2 = Disabled;
        KeyState keyState3 = PendingDeletion;
        KeyState keyState4 = PendingImport;
        KeyState keyState5 = Unavailable;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("Enabled", keyState);
        hashMap.put(BucketLifecycleConfiguration.DISABLED, keyState2);
        hashMap.put("PendingDeletion", keyState3);
        hashMap.put("PendingImport", keyState4);
        hashMap.put("Unavailable", keyState5);
    }

    KeyState(String str) {
        this.value = str;
    }

    public static KeyState fromValue(String str) {
        if (str != null && !str.isEmpty()) {
            Map<String, KeyState> map = enumMap;
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