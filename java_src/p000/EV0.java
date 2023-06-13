package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import kotlin.UByte;
/* renamed from: EV0 */
/* loaded from: classes6.dex */
public final class EV0 {

    /* renamed from: a */
    public final C42986it4 f7544a = new C42986it4(C49683uB1.f111921o);

    /* renamed from: a */
    public final void m108926a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5;
        int i6 = i2 + i3;
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int[] iArr = new int[i6 / i5];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i5] = bArr[i7 + i] & UByte.MAX_VALUE;
            }
        }
        try {
            this.f7544a.m31679a(iArr, i3 / i5);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i5];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m45946a();
        }
    }

    /* renamed from: b */
    public HV0 m108925b(C1837ET c1837et, Map<EnumC47491qV0, ?> map) throws FormatException, ChecksumException {
        byte[] bArr;
        byte[] m107126a = new C2280FT(c1837et).m107126a();
        m108926a(m107126a, 0, 10, 10, 0);
        int i = m107126a[0] & 15;
        if (i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                m108926a(m107126a, 20, 68, 56, 1);
                m108926a(m107126a, 20, 68, 56, 2);
                bArr = new byte[78];
            } else {
                throw FormatException.m45945a();
            }
        } else {
            m108926a(m107126a, 20, 84, 40, 1);
            m108926a(m107126a, 20, 84, 40, 2);
            bArr = new byte[94];
        }
        System.arraycopy(m107126a, 0, bArr, 0, 10);
        System.arraycopy(m107126a, 20, bArr, 10, bArr.length - 10);
        return C50454vV0.m8602a(bArr, i);
    }
}
