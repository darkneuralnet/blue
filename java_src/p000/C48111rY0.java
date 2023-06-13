package p000;

import java.util.Arrays;
/* renamed from: rY0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48111rY0 {

    /* renamed from: a */
    public final CharSequence f107252a;

    /* renamed from: b */
    public final int f107253b;

    /* renamed from: c */
    public final int f107254c;

    /* renamed from: d */
    public final byte[] f107255d;

    public C48111rY0(CharSequence charSequence, int i, int i2) {
        this.f107252a = charSequence;
        this.f107254c = i;
        this.f107253b = i2;
        byte[] bArr = new byte[i * i2];
        this.f107255d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    public final void m15804a(int i) {
        m15798g(this.f107253b - 1, 0, i, 1);
        m15798g(this.f107253b - 1, 1, i, 2);
        m15798g(this.f107253b - 1, 2, i, 3);
        m15798g(0, this.f107254c - 2, i, 4);
        m15798g(0, this.f107254c - 1, i, 5);
        m15798g(1, this.f107254c - 1, i, 6);
        m15798g(2, this.f107254c - 1, i, 7);
        m15798g(3, this.f107254c - 1, i, 8);
    }

    /* renamed from: b */
    public final void m15803b(int i) {
        m15798g(this.f107253b - 3, 0, i, 1);
        m15798g(this.f107253b - 2, 0, i, 2);
        m15798g(this.f107253b - 1, 0, i, 3);
        m15798g(0, this.f107254c - 4, i, 4);
        m15798g(0, this.f107254c - 3, i, 5);
        m15798g(0, this.f107254c - 2, i, 6);
        m15798g(0, this.f107254c - 1, i, 7);
        m15798g(1, this.f107254c - 1, i, 8);
    }

    /* renamed from: c */
    public final void m15802c(int i) {
        m15798g(this.f107253b - 3, 0, i, 1);
        m15798g(this.f107253b - 2, 0, i, 2);
        m15798g(this.f107253b - 1, 0, i, 3);
        m15798g(0, this.f107254c - 2, i, 4);
        m15798g(0, this.f107254c - 1, i, 5);
        m15798g(1, this.f107254c - 1, i, 6);
        m15798g(2, this.f107254c - 1, i, 7);
        m15798g(3, this.f107254c - 1, i, 8);
    }

    /* renamed from: d */
    public final void m15801d(int i) {
        m15798g(this.f107253b - 1, 0, i, 1);
        m15798g(this.f107253b - 1, this.f107254c - 1, i, 2);
        m15798g(0, this.f107254c - 3, i, 3);
        m15798g(0, this.f107254c - 2, i, 4);
        m15798g(0, this.f107254c - 1, i, 5);
        m15798g(1, this.f107254c - 3, i, 6);
        m15798g(1, this.f107254c - 2, i, 7);
        m15798g(1, this.f107254c - 1, i, 8);
    }

    /* renamed from: e */
    public final boolean m15800e(int i, int i2) {
        return this.f107255d[(i2 * this.f107254c) + i] == 1;
    }

    /* renamed from: f */
    public final boolean m15799f(int i, int i2) {
        return this.f107255d[(i2 * this.f107254c) + i] >= 0;
    }

    /* renamed from: g */
    public final void m15798g(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f107253b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f107254c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f107252a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m15796i(i2, i, z);
    }

    /* renamed from: h */
    public final void m15797h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f107253b && i3 == 0) {
                m15804a(i4);
                i4++;
            }
            if (i5 == this.f107253b - 2 && i3 == 0 && this.f107254c % 4 != 0) {
                m15803b(i4);
                i4++;
            }
            if (i5 == this.f107253b - 2 && i3 == 0 && this.f107254c % 8 == 4) {
                m15802c(i4);
                i4++;
            }
            if (i5 == this.f107253b + 4 && i3 == 2 && this.f107254c % 8 == 0) {
                m15801d(i4);
                i4++;
            }
            do {
                if (i5 < this.f107253b && i3 >= 0 && !m15799f(i3, i5)) {
                    m15795j(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.f107254c);
            int i6 = i5 + 1;
            int i7 = i3 + 3;
            do {
                if (i6 >= 0 && i7 < this.f107254c && !m15799f(i7, i6)) {
                    m15795j(i6, i7, i4);
                    i4++;
                }
                i6 += 2;
                i7 -= 2;
                i = this.f107253b;
                if (i6 >= i) {
                    break;
                }
            } while (i7 >= 0);
            i5 = i6 + 3;
            i3 = i7 + 1;
            if (i5 >= i && i3 >= (i2 = this.f107254c)) {
                break;
            }
        }
        if (!m15799f(i2 - 1, i - 1)) {
            m15796i(this.f107254c - 1, this.f107253b - 1, true);
            m15796i(this.f107254c - 2, this.f107253b - 2, true);
        }
    }

    /* renamed from: i */
    public final void m15796i(int i, int i2, boolean z) {
        this.f107255d[(i2 * this.f107254c) + i] = z ? (byte) 1 : (byte) 0;
    }

    /* renamed from: j */
    public final void m15795j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m15798g(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m15798g(i4, i6, i3, 2);
        int i7 = i - 1;
        m15798g(i7, i5, i3, 3);
        m15798g(i7, i6, i3, 4);
        m15798g(i7, i2, i3, 5);
        m15798g(i, i5, i3, 6);
        m15798g(i, i6, i3, 7);
        m15798g(i, i2, i3, 8);
    }
}
