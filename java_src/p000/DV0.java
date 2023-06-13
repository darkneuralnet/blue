package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.UByte;
/* renamed from: DV0 */
/* loaded from: classes6.dex */
public final class DV0 {

    /* renamed from: a */
    public final C42986it4 f5782a = new C42986it4(C49683uB1.f111919m);

    /* renamed from: a */
    public final void m110355a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & UByte.MAX_VALUE;
        }
        try {
            this.f5782a.m31679a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m45946a();
        }
    }

    /* renamed from: b */
    public HV0 m110354b(C1837ET c1837et) throws FormatException, ChecksumException {
        C3149HT c3149ht = new C3149HT(c1837et);
        AS0[] m115781b = AS0.m115781b(c3149ht.m103844c(), c3149ht.m103845b());
        int i = 0;
        for (AS0 as0 : m115781b) {
            i += as0.m115780c();
        }
        byte[] bArr = new byte[i];
        int length = m115781b.length;
        for (int i2 = 0; i2 < length; i2++) {
            AS0 as02 = m115781b[i2];
            byte[] m115782a = as02.m115782a();
            int m115780c = as02.m115780c();
            m110355a(m115782a, m115780c);
            for (int i3 = 0; i3 < m115780c; i3++) {
                bArr[(i3 * length) + i2] = m115782a[i3];
            }
        }
        return C49862uV0.m10230a(bArr);
    }
}
