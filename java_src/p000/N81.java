package p000;

import com.nimbusds.jose.JOSEException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECKey;
/* renamed from: N81 */
/* loaded from: classes6.dex */
public class N81 {
    private N81() {
    }

    /* renamed from: a */
    public static int m94330a(C42271hh2 c42271hh2) throws JOSEException {
        if (c42271hh2.equals(C42271hh2.f85669k) || c42271hh2.equals(C42271hh2.f85670l)) {
            return 64;
        }
        if (c42271hh2.equals(C42271hh2.f85671m)) {
            return 96;
        }
        if (c42271hh2.equals(C42271hh2.f85672n)) {
            return 132;
        }
        throw new JOSEException(C3900J9.m101092d(c42271hh2, O81.f25939c));
    }

    /* renamed from: b */
    public static Signature m94329b(C42271hh2 c42271hh2, Provider provider) throws JOSEException {
        String str = "SHA256withECDSA";
        if (!c42271hh2.equals(C42271hh2.f85669k) && !c42271hh2.equals(C42271hh2.f85670l)) {
            if (c42271hh2.equals(C42271hh2.f85671m)) {
                str = "SHA384withECDSA";
            } else if (c42271hh2.equals(C42271hh2.f85672n)) {
                str = "SHA512withECDSA";
            } else {
                throw new JOSEException(C3900J9.m101092d(c42271hh2, O81.f25939c));
            }
        }
        try {
            if (provider != null) {
                return Signature.getInstance(str, provider);
            }
            return Signature.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new JOSEException("Unsupported ECDSA algorithm: " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static C42271hh2 m94328c(C41417gF0 c41417gF0) throws JOSEException {
        if (c41417gF0 != null) {
            if (C41417gF0.f81831e.equals(c41417gF0)) {
                return C42271hh2.f85669k;
            }
            if (C41417gF0.f81832f.equals(c41417gF0)) {
                return C42271hh2.f85670l;
            }
            if (C41417gF0.f81834h.equals(c41417gF0)) {
                return C42271hh2.f85671m;
            }
            if (C41417gF0.f81835i.equals(c41417gF0)) {
                return C42271hh2.f85672n;
            }
            throw new JOSEException("Unexpected curve: " + c41417gF0);
        }
        throw new JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521");
    }

    /* renamed from: d */
    public static C42271hh2 m94327d(ECKey eCKey) throws JOSEException {
        return m94328c(C41417gF0.m39802a(eCKey.getParams()));
    }

    /* renamed from: e */
    public static byte[] m94326e(byte[] bArr) throws JOSEException {
        int i;
        int i2;
        byte[] bArr2;
        int length = bArr.length / 2;
        int i3 = length;
        while (i3 > 0 && bArr[length - i3] == 0) {
            i3--;
        }
        int i4 = length - i3;
        if (bArr[i4] < 0) {
            i = i3 + 1;
        } else {
            i = i3;
        }
        int i5 = length;
        while (i5 > 0 && bArr[(length * 2) - i5] == 0) {
            i5--;
        }
        int i6 = (length * 2) - i5;
        if (bArr[i6] < 0) {
            i2 = i5 + 1;
        } else {
            i2 = i5;
        }
        int i7 = i + 2 + 2 + i2;
        if (i7 <= 255) {
            int i8 = 1;
            if (i7 < 128) {
                bArr2 = new byte[i + 4 + 2 + i2];
            } else {
                bArr2 = new byte[i + 5 + 2 + i2];
                bArr2[1] = -127;
                i8 = 2;
            }
            bArr2[0] = 48;
            int i9 = i8 + 1;
            bArr2[i8] = (byte) i7;
            int i10 = i9 + 1;
            bArr2[i9] = 2;
            bArr2[i10] = (byte) i;
            int i11 = i10 + 1 + i;
            System.arraycopy(bArr, i4, bArr2, i11 - i3, i3);
            int i12 = i11 + 1;
            bArr2[i11] = 2;
            bArr2[i12] = (byte) i2;
            System.arraycopy(bArr, i6, bArr2, ((i12 + 1) + i2) - i5, i5);
            return bArr2;
        }
        throw new JOSEException("Invalid ECDSA signature format");
    }
}
