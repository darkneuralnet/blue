package com.amazonaws.services.p026s3.internal.crypto;

import java.util.Map;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.KMSSecuredCEK */
/* loaded from: classes3.dex */
final class KMSSecuredCEK extends SecuredCEK {
    static final String KEY_PROTECTION_MECHANISM = "kms";

    public KMSSecuredCEK(byte[] bArr, Map<String, String> map) {
        super(bArr, KEY_PROTECTION_MECHANISM, map);
    }

    public static boolean isKMSKeyWrapped(String str) {
        return KEY_PROTECTION_MECHANISM.equals(str);
    }
}
