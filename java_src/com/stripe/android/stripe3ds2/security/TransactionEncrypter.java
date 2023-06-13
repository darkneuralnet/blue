package com.stripe.android.stripe3ds2.security;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter;", "Lf41;", "Lbh2;", "header", "", "clearText", "LYg2;", "encrypt", "", "counter", "B", "key", "<init>", "([BB)V", "Crypto", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class TransactionEncrypter extends C40720f41 {
    private final byte counter;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0002J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;", "", "()V", "BITS_IN_BYTE", "", "getGcmId", "", "length", "pad", "", "counter", "getGcmIvAtoS", "sdkCounterAtoS", "getGcmIvStoA", DefaultMessageTransformer.FIELD_SDK_COUNTER_SDK_TO_ACS, "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Crypto {
        private static final int BITS_IN_BYTE = 8;
        public static final Crypto INSTANCE = new Crypto();

        private Crypto() {
        }

        private final byte[] getGcmId(int i, byte b, byte b2) {
            int i2 = i / 8;
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, b);
            bArr[i2 - 1] = b2;
            return bArr;
        }

        private final byte[] getGcmIvAtoS(int i, byte b) {
            return getGcmId(i, (byte) -1, b);
        }

        public final byte[] getGcmIvStoA(int i, byte b) {
            return getGcmId(i, (byte) 0, b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEncrypter(byte[] key, byte b) throws KeyLengthException {
        super(new SecretKeySpec(key, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        Intrinsics.checkNotNullParameter(key, "key");
        this.counter = b;
    }

    @Override // p000.C40720f41, p000.InterfaceC38103ah2
    public C37285Yg2 encrypt(C38696bh2 header, byte[] clearText) throws JOSEException {
        byte[] gcmIvStoA;
        C1996Eq m28036d;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(clearText, "clearText");
        C37051Xg2 m64169r = header.m64169r();
        if (Intrinsics.areEqual(m64169r, C37051Xg2.f43559m)) {
            C36312Uc1 m64167t = header.m64167t();
            if (m64167t.m81265b() == N70.m94359b(getKey().getEncoded())) {
                if (m64167t.m81265b() == N70.m94359b(getKey().getEncoded())) {
                    byte[] m23539a = C45748nZ0.m23539a(header, clearText);
                    byte[] m62052b = C13360c.m62052b(header);
                    if (Intrinsics.areEqual(header.m64167t(), C36312Uc1.f37664f)) {
                        gcmIvStoA = Crypto.INSTANCE.getGcmIvStoA(128, this.counter);
                        m28036d = C24678j.m31304f(getKey(), gcmIvStoA, m23539a, m62052b, getJCAContext().m61055d(), getJCAContext().m61053f());
                        Intrinsics.checkNotNullExpressionValue(m28036d, "encryptAuthenticated(\n  …rovider\n                )");
                    } else if (Intrinsics.areEqual(header.m64167t(), C36312Uc1.f37669k)) {
                        gcmIvStoA = Crypto.INSTANCE.getGcmIvStoA(96, this.counter);
                        m28036d = C25580l.m28036d(getKey(), new C50157uz0(gcmIvStoA), m23539a, m62052b, null);
                        Intrinsics.checkNotNullExpressionValue(m28036d, "encrypt(key, Container(iv), plainText, aad, null)");
                    } else {
                        throw new JOSEException(C3900J9.m101094b(header.m64167t(), AbstractC39535d41.SUPPORTED_ENCRYPTION_METHODS));
                    }
                    return new C37285Yg2(header, null, C3824Iy.m101442e(gcmIvStoA), C3824Iy.m101442e(m28036d.m108333b()), C3824Iy.m101442e(m28036d.m108334a()));
                }
                throw new KeyLengthException("The Content Encryption Key length for " + m64167t + " must be " + m64167t.m81265b() + " bits");
            }
            throw new KeyLengthException(m64167t.m81265b(), m64167t);
        }
        throw new JOSEException("Invalid algorithm " + m64169r);
    }
}
