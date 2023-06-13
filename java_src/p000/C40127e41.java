package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: e41  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40127e41 extends AbstractC39535d41 implements InterfaceC37519Zg2 {

    /* renamed from: a */
    public final boolean f77664a;

    /* renamed from: b */
    public final KE0 f77665b;

    public C40127e41(SecretKey secretKey, boolean z) throws KeyLengthException {
        super(secretKey);
        this.f77665b = new KE0();
        this.f77664a = z;
    }

    @Override // p000.InterfaceC37519Zg2
    /* renamed from: a */
    public byte[] mo43301a(C38696bh2 c38696bh2, C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3, C3824Iy c3824Iy4) throws JOSEException {
        if (!this.f77664a) {
            C37051Xg2 m64169r = c38696bh2.m64169r();
            if (m64169r.equals(C37051Xg2.f43559m)) {
                if (c3824Iy != null) {
                    throw new JOSEException("Unexpected present JWE encrypted key");
                }
            } else {
                throw new JOSEException(C3900J9.m101093c(m64169r, AbstractC39535d41.SUPPORTED_ALGORITHMS));
            }
        }
        if (c3824Iy2 != null) {
            if (c3824Iy4 != null) {
                this.f77665b.m99066a(c38696bh2);
                return C41965hA0.m36769b(c38696bh2, null, c3824Iy2, c3824Iy3, c3824Iy4, getKey(), getJCAContext());
            }
            throw new JOSEException("Missing JWE authentication tag");
        }
        throw new JOSEException("Unexpected present JWE initialization vector (IV)");
    }

    public C40127e41(byte[] bArr) throws KeyLengthException {
        this(new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), false);
    }
}
