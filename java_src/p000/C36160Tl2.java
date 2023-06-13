package p000;

import kotlin.UByte;
import kotlin.UShort;
/* renamed from: Tl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36160Tl2 {

    /* renamed from: n */
    public static final C36160Tl2 f36028n = new C36160Tl2();

    /* renamed from: a */
    public short f36029a;

    /* renamed from: b */
    public short f36030b;

    /* renamed from: c */
    public int[] f36031c;

    /* renamed from: d */
    public int f36032d;

    /* renamed from: e */
    public int[] f36033e;

    /* renamed from: f */
    public short f36034f;

    /* renamed from: g */
    public short f36035g;

    /* renamed from: h */
    public short f36036h;

    /* renamed from: i */
    public short f36037i;

    /* renamed from: j */
    public C33936Jy1 f36038j;

    /* renamed from: k */
    public C36160Tl2 f36039k;

    /* renamed from: l */
    public C46700p91 f36040l;

    /* renamed from: m */
    public C36160Tl2 f36041m;

    /* renamed from: a */
    public final void m83003a(YT2 yt2, boolean z) {
        short s;
        yt2.mo73034o(this);
        if (z && (s = this.f36030b) != 0) {
            yt2.mo73032q(s & UShort.MAX_VALUE, this);
            if (this.f36031c != null) {
                int i = 1;
                while (true) {
                    int[] iArr = this.f36031c;
                    if (i <= iArr[0]) {
                        yt2.mo73032q(iArr[i], this);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m83002b(int i, int i2, int i3) {
        if (this.f36033e == null) {
            this.f36033e = new int[6];
        }
        int[] iArr = this.f36033e;
        int i4 = iArr[0];
        if (i4 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f36033e = iArr2;
        }
        int[] iArr3 = this.f36033e;
        int i5 = i4 + 1;
        iArr3[i5] = i;
        int i6 = i5 + 1;
        iArr3[i6] = i2 | i3;
        iArr3[0] = i6;
    }

    /* renamed from: c */
    public final void m83001c(int i) {
        if (this.f36030b == 0) {
            this.f36030b = (short) i;
            return;
        }
        if (this.f36031c == null) {
            this.f36031c = new int[4];
        }
        int[] iArr = this.f36031c;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f36031c = iArr2;
        }
        this.f36031c[i2] = i;
    }

    /* renamed from: d */
    public final void m83000d(C36160Tl2 c36160Tl2) {
        C36160Tl2 c36160Tl22 = f36028n;
        this.f36041m = c36160Tl22;
        C36160Tl2 c36160Tl23 = c36160Tl22;
        C36160Tl2 c36160Tl24 = this;
        while (c36160Tl24 != f36028n) {
            C36160Tl2 c36160Tl25 = c36160Tl24.f36041m;
            c36160Tl24.f36041m = c36160Tl23;
            if ((c36160Tl24.f36029a & 64) != 0 && c36160Tl24.f36037i != c36160Tl2.f36037i) {
                c36160Tl24.f36040l = new C46700p91(c36160Tl24.f36035g, c36160Tl2.f36040l.f103206b, c36160Tl24.f36040l);
            }
            c36160Tl23 = c36160Tl24;
            c36160Tl24 = c36160Tl24.m82997g(c36160Tl25);
        }
        while (c36160Tl23 != f36028n) {
            C36160Tl2 c36160Tl26 = c36160Tl23.f36041m;
            c36160Tl23.f36041m = null;
            c36160Tl23 = c36160Tl26;
        }
    }

    /* renamed from: e */
    public final C36160Tl2 m82999e() {
        C33936Jy1 c33936Jy1 = this.f36038j;
        return c33936Jy1 == null ? this : c33936Jy1.f18855a;
    }

    /* renamed from: f */
    public final void m82998f(short s) {
        this.f36041m = f36028n;
        C36160Tl2 c36160Tl2 = this;
        while (c36160Tl2 != f36028n) {
            C36160Tl2 c36160Tl22 = c36160Tl2.f36041m;
            c36160Tl2.f36041m = null;
            if (c36160Tl2.f36037i == 0) {
                c36160Tl2.f36037i = s;
                c36160Tl2 = c36160Tl2.m82997g(c36160Tl22);
            } else {
                c36160Tl2 = c36160Tl22;
            }
        }
    }

    /* renamed from: g */
    public final C36160Tl2 m82997g(C36160Tl2 c36160Tl2) {
        boolean z;
        for (C46700p91 c46700p91 = this.f36040l; c46700p91 != null; c46700p91 = c46700p91.f103207c) {
            if ((this.f36029a & 16) != 0 && c46700p91 == this.f36040l.f103207c) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C36160Tl2 c36160Tl22 = c46700p91.f103206b;
                if (c36160Tl22.f36041m == null) {
                    c36160Tl22.f36041m = c36160Tl2;
                    c36160Tl2 = c36160Tl22;
                }
            }
        }
        return c36160Tl2;
    }

    /* renamed from: h */
    public final void m82996h(O70 o70, int i, boolean z) {
        if ((this.f36029a & 4) == 0) {
            if (z) {
                m83002b(i, 536870912, o70.f25908b);
                o70.m92890i(-1);
                return;
            }
            m83002b(i, 268435456, o70.f25908b);
            o70.m92888k(-1);
        } else if (z) {
            o70.m92890i(this.f36032d - i);
        } else {
            o70.m92888k(this.f36032d - i);
        }
    }

    /* renamed from: i */
    public final boolean m82995i(byte[] bArr, int i) {
        this.f36029a = (short) (this.f36029a | 4);
        this.f36032d = i;
        int[] iArr = this.f36033e;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f36033e;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            if ((i4 & (-268435456)) == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i7 = bArr[i3] & UByte.MAX_VALUE;
                    if (i7 < 198) {
                        bArr[i3] = (byte) (i7 + 49);
                    } else {
                        bArr[i3] = (byte) (i7 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else {
                int i8 = i6 + 1;
                bArr[i6] = (byte) (i5 >>> 24);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (i5 >>> 16);
                bArr[i9] = (byte) (i5 >>> 8);
                bArr[i9 + 1] = (byte) i5;
            }
        }
        return z;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
