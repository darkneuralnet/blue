package p000;

import java.io.IOException;
import kotlin.UByte;
/* renamed from: t09  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48989t09 extends M09 {

    /* renamed from: i */
    public final char[] f109686i;

    public C48989t09(C43653k09 c43653k09) {
        super(c43653k09, null);
        char[] cArr;
        this.f109686i = new char[512];
        cArr = c43653k09.f93759b;
        C52142yK8.m3660e(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f109686i[i] = c43653k09.m29479a(i >>> 4);
            this.f109686i[i | 256] = c43653k09.m29479a(i & 15);
        }
    }

    @Override // p000.M09, p000.W09
    /* renamed from: a */
    public final void mo13251a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        C52142yK8.m3657h(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & UByte.MAX_VALUE;
            appendable.append(this.f109686i[i4]);
            appendable.append(this.f109686i[i4 | 256]);
        }
    }

    @Override // p000.M09
    /* renamed from: f */
    public final W09 mo13250f(C43653k09 c43653k09, Character ch2) {
        return new C48989t09(c43653k09);
    }

    public C48989t09(String str, String str2) {
        this(new C43653k09("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
