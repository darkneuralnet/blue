package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.JOSEException;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;
/* renamed from: nm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45881nm4 extends AbstractC45288mm4 implements InterfaceC38103ah2 {

    /* renamed from: c */
    public final RSAPublicKey f100493c;

    /* renamed from: d */
    public final SecretKey f100494d;

    public C45881nm4(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // p000.InterfaceC38103ah2
    public C37285Yg2 encrypt(C38696bh2 c38696bh2, byte[] bArr) throws JOSEException {
        C3824Iy m101442e;
        C37051Xg2 m64169r = c38696bh2.m64169r();
        C36312Uc1 m64167t = c38696bh2.m64167t();
        SecretKey secretKey = this.f100494d;
        if (secretKey == null) {
            secretKey = C41965hA0.m36767d(m64167t, getJCAContext().m113689b());
        }
        if (m64169r.equals(C37051Xg2.f43551e)) {
            m101442e = C3824Iy.m101442e(C44695lm4.m26842a(this.f100493c, secretKey, getJCAContext().m61054e()));
        } else if (m64169r.equals(C37051Xg2.f43552f)) {
            m101442e = C3824Iy.m101442e(C48845sm4.m13698a(this.f100493c, secretKey, getJCAContext().m61054e()));
        } else if (m64169r.equals(C37051Xg2.f43553g)) {
            m101442e = C3824Iy.m101442e(C49438tm4.m11795a(this.f100493c, secretKey, 256, getJCAContext().m61054e()));
        } else if (m64169r.equals(C37051Xg2.f43554h)) {
            m101442e = C3824Iy.m101442e(C49438tm4.m11795a(this.f100493c, secretKey, 384, getJCAContext().m61054e()));
        } else if (m64169r.equals(C37051Xg2.f43555i)) {
            m101442e = C3824Iy.m101442e(C49438tm4.m11795a(this.f100493c, secretKey, 512, getJCAContext().m61054e()));
        } else {
            throw new JOSEException(C3900J9.m101093c(m64169r, AbstractC45288mm4.f98732a));
        }
        return C41965hA0.m36768c(c38696bh2, bArr, secretKey, m101442e, getJCAContext());
    }

    public C45881nm4(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey != null) {
            this.f100493c = rSAPublicKey;
            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, "ChaCha20")));
            if (secretKey != null) {
                if (secretKey.getAlgorithm() != null && unmodifiableSet.contains(secretKey.getAlgorithm())) {
                    this.f100494d = secretKey;
                    return;
                }
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
            }
            this.f100494d = null;
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
