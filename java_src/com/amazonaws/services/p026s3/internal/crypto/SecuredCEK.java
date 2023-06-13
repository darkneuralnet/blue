package com.amazonaws.services.p026s3.internal.crypto;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.SecuredCEK */
/* loaded from: classes3.dex */
class SecuredCEK {
    private final byte[] encrypted;
    private final String keyWrapAlgorithm;
    private final Map<String, String> matdesc;

    public SecuredCEK(byte[] bArr, String str, Map<String, String> map) {
        this.encrypted = bArr;
        this.keyWrapAlgorithm = str;
        this.matdesc = Collections.unmodifiableMap(new TreeMap(map));
    }

    public byte[] getEncrypted() {
        return this.encrypted;
    }

    public String getKeyWrapAlgorithm() {
        return this.keyWrapAlgorithm;
    }

    public Map<String, String> getMaterialDescription() {
        return this.matdesc;
    }
}
