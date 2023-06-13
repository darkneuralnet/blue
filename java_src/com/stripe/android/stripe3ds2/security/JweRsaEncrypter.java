package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.JOSEException;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C38696bh2;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;", "", "", "payload", "Ljava/security/interfaces/RSAPublicKey;", "publicKey", "keyId", "encrypt", "Ldh2;", "createJweObject", "<init>", "()V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class JweRsaEncrypter {
    public final C39900dh2 createJweObject(String payload, String str) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new C39900dh2(new C38696bh2.C12474a(C37051Xg2.f43553g, C36312Uc1.f37664f).m64149m(str).m64158d(), new C50367vL3(payload));
    }

    public final String encrypt(String payload, RSAPublicKey publicKey, String str) throws JOSEException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        C39900dh2 createJweObject = createJweObject(payload, str);
        createJweObject.m43895g(new C45881nm4(publicKey));
        String m43884r = createJweObject.m43884r();
        Intrinsics.checkNotNullExpressionValue(m43884r, "jwe.serialize()");
        return m43884r;
    }
}
