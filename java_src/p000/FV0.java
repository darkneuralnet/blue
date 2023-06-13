package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import kotlin.UByte;
/* renamed from: FV0 */
/* loaded from: classes6.dex */
public final class FV0 {

    /* renamed from: a */
    public final C42986it4 f9524a = new C42986it4(C49683uB1.f111918l);

    /* renamed from: a */
    public final void m107078a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & UByte.MAX_VALUE;
        }
        try {
            this.f9524a.m31679a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m45946a();
        }
    }

    /* renamed from: b */
    public HV0 m107077b(C1837ET c1837et, Map<EnumC47491qV0, ?> map) throws FormatException, ChecksumException {
        ChecksumException e;
        C2858GT c2858gt = new C2858GT(c1837et);
        FormatException formatException = null;
        try {
            return m107076c(c2858gt, map);
        } catch (ChecksumException e2) {
            e = e2;
            try {
                c2858gt.m105074f();
                c2858gt.m105073g(true);
                c2858gt.m105075e();
                c2858gt.m105076d();
                c2858gt.m105078b();
                HV0 m107076c = m107076c(c2858gt, map);
                m107076c.m103811m(new C46364ob4(true));
                return m107076c;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (FormatException e3) {
            e = null;
            formatException = e3;
            c2858gt.m105074f();
            c2858gt.m105073g(true);
            c2858gt.m105075e();
            c2858gt.m105076d();
            c2858gt.m105078b();
            HV0 m107076c2 = m107076c(c2858gt, map);
            m107076c2.m103811m(new C46364ob4(true));
            return m107076c2;
        }
    }

    /* renamed from: c */
    public final HV0 m107076c(C2858GT c2858gt, Map<EnumC47491qV0, ?> map) throws FormatException, ChecksumException {
        C32447Do6 m105075e = c2858gt.m105075e();
        EnumC41074fg1 m9438d = c2858gt.m105076d().m9438d();
        C52799zS0[] m1338b = C52799zS0.m1338b(c2858gt.m105077c(), m105075e, m9438d);
        int i = 0;
        for (C52799zS0 c52799zS0 : m1338b) {
            i += c52799zS0.m1337c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C52799zS0 c52799zS02 : m1338b) {
            byte[] m1339a = c52799zS02.m1339a();
            int m1337c = c52799zS02.m1337c();
            m107078a(m1339a, m1337c);
            int i3 = 0;
            while (i3 < m1337c) {
                bArr[i2] = m1339a[i3];
                i3++;
                i2++;
            }
        }
        return C51640xV0.m5126a(bArr, m105075e, m9438d, map);
    }
}
