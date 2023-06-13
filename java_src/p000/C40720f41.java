package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: f41  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40720f41 extends AbstractC39535d41 implements InterfaceC38103ah2 {
    public C40720f41(SecretKey secretKey) throws KeyLengthException {
        super(secretKey);
    }

    public C37285Yg2 encrypt(C38696bh2 c38696bh2, byte[] bArr) throws JOSEException {
        C37051Xg2 m64169r = c38696bh2.m64169r();
        if (m64169r.equals(C37051Xg2.f43559m)) {
            C36312Uc1 m64167t = c38696bh2.m64167t();
            if (m64167t.m81265b() == N70.m94355f(getKey().getEncoded())) {
                return C41965hA0.m36768c(c38696bh2, bArr, getKey(), null, getJCAContext());
            }
            throw new KeyLengthException(m64167t.m81265b(), m64167t);
        }
        throw new JOSEException(C3900J9.m101093c(m64169r, AbstractC39535d41.SUPPORTED_ALGORITHMS));
    }

    public C40720f41(byte[] bArr) throws KeyLengthException {
        this(new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
    }

    public C40720f41(C45207me3 c45207me3) throws KeyLengthException {
        this(c45207me3.m25237r(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
    }
}
