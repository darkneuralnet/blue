package p000;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.UByte;
/* renamed from: M09 */
/* loaded from: classes6.dex */
public class M09 extends W09 {

    /* renamed from: f */
    public final C43653k09 f22437f;

    /* renamed from: g */
    public final Character f22438g;

    /* renamed from: h */
    public transient W09 f22439h;

    public M09(C43653k09 c43653k09, Character ch2) {
        this.f22437f = c43653k09;
        boolean z = true;
        if (ch2 != null && c43653k09.m29477c(ch2.charValue())) {
            z = false;
        }
        C52142yK8.m3658g(z, "Padding character %s was already in alphabet", ch2);
        this.f22438g = ch2;
    }

    @Override // p000.W09
    /* renamed from: a */
    public void mo13251a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        C52142yK8.m3657h(0, i2, bArr.length);
        while (i3 < i2) {
            m96014g(appendable, bArr, i3, Math.min(this.f22437f.f93763f, i2 - i3));
            i3 += this.f22437f.f93763f;
        }
    }

    @Override // p000.W09
    /* renamed from: b */
    public final int mo78937b(int i) {
        C43653k09 c43653k09 = this.f22437f;
        return c43653k09.f93762e * I19.m103051a(i, c43653k09.f93763f, RoundingMode.CEILING);
    }

    @Override // p000.W09
    /* renamed from: c */
    public final W09 mo78936c() {
        W09 w09 = this.f22439h;
        if (w09 == null) {
            C43653k09 m29478b = this.f22437f.m29478b();
            if (m29478b == this.f22437f) {
                w09 = this;
            } else {
                w09 = mo13250f(m29478b, this.f22438g);
            }
            this.f22439h = w09;
        }
        return w09;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M09) {
            M09 m09 = (M09) obj;
            if (this.f22437f.equals(m09.f22437f) && C48576sJ8.m14396a(this.f22438g, m09.f22438g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public W09 mo13250f(C43653k09 c43653k09, Character ch2) {
        return new M09(c43653k09, ch2);
    }

    /* renamed from: g */
    public final void m96014g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        C52142yK8.m3657h(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.f22437f.f93763f) {
            z = true;
        } else {
            z = false;
        }
        C52142yK8.m3660e(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & UByte.MAX_VALUE)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.f22437f.f93761d;
        while (i3 < i2 * 8) {
            C43653k09 c43653k09 = this.f22437f;
            appendable.append(c43653k09.m29479a(((int) (j >>> (i5 - i3))) & c43653k09.f93760c));
            i3 += this.f22437f.f93761d;
        }
        if (this.f22438g != null) {
            while (i3 < this.f22437f.f93763f * 8) {
                appendable.append(this.f22438g.charValue());
                i3 += this.f22437f.f93761d;
            }
        }
    }

    public final int hashCode() {
        return this.f22437f.hashCode() ^ Arrays.hashCode(new Object[]{this.f22438g});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f22437f.toString());
        if (8 % this.f22437f.f93761d != 0) {
            if (this.f22438g == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f22438g);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public M09(String str, String str2, Character ch2) {
        this(new C43653k09(str, str2.toCharArray()), ch2);
    }
}
