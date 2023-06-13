package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
/* renamed from: ro8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48277ro8 extends AbstractC41604gZ7 {

    /* renamed from: k */
    public static final int[] f107669k = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogConstants.LOG_LOCAL2, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: f */
    public final int f107670f;

    /* renamed from: g */
    public final AbstractC41604gZ7 f107671g;

    /* renamed from: h */
    public final AbstractC41604gZ7 f107672h;

    /* renamed from: i */
    public final int f107673i;

    /* renamed from: j */
    public final int f107674j;

    /* renamed from: K */
    public static AbstractC41604gZ7 m15347K(AbstractC41604gZ7 abstractC41604gZ7, AbstractC41604gZ7 abstractC41604gZ72) {
        int mo5074e = abstractC41604gZ7.mo5074e();
        int mo5074e2 = abstractC41604gZ72.mo5074e();
        byte[] bArr = new byte[mo5074e + mo5074e2];
        abstractC41604gZ7.m39161I(bArr, 0, 0, mo5074e);
        abstractC41604gZ72.m39161I(bArr, 0, mo5074e, mo5074e2);
        return new C46330oX7(bArr);
    }

    /* renamed from: L */
    public static int m15346L(int i) {
        int[] iArr = f107669k;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* renamed from: O */
    public static AbstractC41604gZ7 m15343O(AbstractC41604gZ7 abstractC41604gZ7, AbstractC41604gZ7 abstractC41604gZ72) {
        if (abstractC41604gZ72.mo5074e() == 0) {
            return abstractC41604gZ7;
        }
        if (abstractC41604gZ7.mo5074e() == 0) {
            return abstractC41604gZ72;
        }
        int mo5074e = abstractC41604gZ7.mo5074e() + abstractC41604gZ72.mo5074e();
        if (mo5074e < 128) {
            return m15347K(abstractC41604gZ7, abstractC41604gZ72);
        }
        if (abstractC41604gZ7 instanceof C48277ro8) {
            C48277ro8 c48277ro8 = (C48277ro8) abstractC41604gZ7;
            if (c48277ro8.f107672h.mo5074e() + abstractC41604gZ72.mo5074e() < 128) {
                return new C48277ro8(c48277ro8.f107671g, m15347K(c48277ro8.f107672h, abstractC41604gZ72));
            } else if (c48277ro8.f107671g.mo15342h() > c48277ro8.f107672h.mo15342h() && c48277ro8.f107674j > abstractC41604gZ72.mo15342h()) {
                return new C48277ro8(c48277ro8.f107671g, new C48277ro8(c48277ro8.f107672h, abstractC41604gZ72));
            }
        }
        if (mo5074e >= m15346L(Math.max(abstractC41604gZ7.mo15342h(), abstractC41604gZ72.mo15342h()) + 1)) {
            return new C48277ro8(abstractC41604gZ7, abstractC41604gZ72);
        }
        return C48859sn8.m13664a(new C48859sn8(null), abstractC41604gZ7, abstractC41604gZ72);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: A */
    public final KW7 mo15348A() {
        return new C36409Um8(this);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: a */
    public final byte mo5076a(int i) {
        AbstractC41604gZ7.m39162H(i, this.f107670f);
        return mo5075b(i);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: b */
    public final byte mo5075b(int i) {
        int i2 = this.f107673i;
        if (i < i2) {
            return this.f107671g.mo5075b(i);
        }
        return this.f107672h.mo5075b(i - i2);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: e */
    public final int mo5074e() {
        return this.f107670f;
    }

    @Override // p000.AbstractC41604gZ7
    public final boolean equals(Object obj) {
        boolean mo20911K;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC41604gZ7)) {
            return false;
        }
        AbstractC41604gZ7 abstractC41604gZ7 = (AbstractC41604gZ7) obj;
        if (this.f107670f != abstractC41604gZ7.mo5074e()) {
            return false;
        }
        if (this.f107670f == 0) {
            return true;
        }
        int m39157z = m39157z();
        int m39157z2 = abstractC41604gZ7.m39157z();
        if (m39157z != 0 && m39157z2 != 0 && m39157z != m39157z2) {
            return false;
        }
        C35950Sn8 c35950Sn8 = new C35950Sn8(this, null);
        ZW7 next = c35950Sn8.next();
        C35950Sn8 c35950Sn82 = new C35950Sn8(abstractC41604gZ7, null);
        ZW7 next2 = c35950Sn82.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int mo5074e = next.mo5074e() - i;
            int mo5074e2 = next2.mo5074e() - i2;
            int min = Math.min(mo5074e, mo5074e2);
            if (i == 0) {
                mo20911K = next.mo20911K(next2, i2, min);
            } else {
                mo20911K = next2.mo20911K(next, i, min);
            }
            if (!mo20911K) {
                return false;
            }
            i3 += min;
            int i4 = this.f107670f;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == mo5074e) {
                next = c35950Sn8.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == mo5074e2) {
                next2 = c35950Sn82.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: f */
    public final void mo5073f(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f107673i;
        if (i4 <= i5) {
            this.f107671g.mo5073f(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f107672h.mo5073f(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f107671g.mo5073f(bArr, i, i2, i6);
            this.f107672h.mo5073f(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: h */
    public final int mo15342h() {
        return this.f107674j;
    }

    @Override // p000.AbstractC41604gZ7, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C36409Um8(this);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: j */
    public final boolean mo15341j() {
        return this.f107670f >= m15346L(this.f107674j);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: o */
    public final int mo15340o(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f107673i;
        if (i4 <= i5) {
            return this.f107671g.mo15340o(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f107672h.mo15340o(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f107672h.mo15340o(this.f107671g.mo15340o(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: s */
    public final int mo15339s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f107673i;
        if (i4 <= i5) {
            return this.f107671g.mo15339s(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f107672h.mo15339s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f107672h.mo15339s(this.f107671g.mo15339s(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: u */
    public final AbstractC41604gZ7 mo15338u(int i, int i2) {
        int m39158y = AbstractC41604gZ7.m39158y(i, i2, this.f107670f);
        if (m39158y == 0) {
            return AbstractC41604gZ7.f82424c;
        }
        if (m39158y == this.f107670f) {
            return this;
        }
        int i3 = this.f107673i;
        if (i2 <= i3) {
            return this.f107671g.mo15338u(i, i2);
        }
        if (i >= i3) {
            return this.f107672h.mo15338u(i - i3, i2 - i3);
        }
        AbstractC41604gZ7 abstractC41604gZ7 = this.f107671g;
        return new C48277ro8(abstractC41604gZ7.mo15338u(i, abstractC41604gZ7.mo5074e()), this.f107672h.mo15338u(0, i2 - this.f107673i));
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: v */
    public final String mo15337v(Charset charset) {
        return new String(m39160J(), charset);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: w */
    public final void mo15336w(C50461vV7 c50461vV7) throws IOException {
        this.f107671g.mo15336w(c50461vV7);
        this.f107672h.mo15336w(c50461vV7);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: x */
    public final boolean mo15335x() {
        int mo15339s = this.f107671g.mo15339s(0, 0, this.f107673i);
        AbstractC41604gZ7 abstractC41604gZ7 = this.f107672h;
        if (abstractC41604gZ7.mo15339s(mo15339s, 0, abstractC41604gZ7.mo5074e()) != 0) {
            return false;
        }
        return true;
    }

    public C48277ro8(AbstractC41604gZ7 abstractC41604gZ7, AbstractC41604gZ7 abstractC41604gZ72) {
        this.f107671g = abstractC41604gZ7;
        this.f107672h = abstractC41604gZ72;
        int mo5074e = abstractC41604gZ7.mo5074e();
        this.f107673i = mo5074e;
        this.f107670f = mo5074e + abstractC41604gZ72.mo5074e();
        this.f107674j = Math.max(abstractC41604gZ7.mo15342h(), abstractC41604gZ72.mo15342h()) + 1;
    }
}
