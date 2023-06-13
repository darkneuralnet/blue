package p000;

import java.io.IOException;
import kotlin.UByte;
/* renamed from: D09 */
/* loaded from: classes6.dex */
public final class D09 extends M09 {
    public D09(C43653k09 c43653k09, Character ch2) {
        super(c43653k09, ch2);
        char[] cArr;
        cArr = c43653k09.f93759b;
        C52142yK8.m3660e(cArr.length == 64);
    }

    @Override // p000.M09, p000.W09
    /* renamed from: a */
    public final void mo13251a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        C52142yK8.m3657h(0, i2, bArr.length);
        int i4 = i2;
        while (i4 >= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i3] & UByte.MAX_VALUE) << 16) | ((bArr[i5] & UByte.MAX_VALUE) << 8) | (bArr[i6] & UByte.MAX_VALUE);
            appendable.append(this.f22437f.m29479a(i7 >>> 18));
            appendable.append(this.f22437f.m29479a((i7 >>> 12) & 63));
            appendable.append(this.f22437f.m29479a((i7 >>> 6) & 63));
            appendable.append(this.f22437f.m29479a(i7 & 63));
            i4 -= 3;
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            m96014g(appendable, bArr, i3, i2 - i3);
        }
    }

    @Override // p000.M09
    /* renamed from: f */
    public final W09 mo13250f(C43653k09 c43653k09, Character ch2) {
        return new D09(c43653k09, ch2);
    }

    public D09(String str, String str2, Character ch2) {
        this(new C43653k09(str, str2.toCharArray()), ch2);
    }
}
