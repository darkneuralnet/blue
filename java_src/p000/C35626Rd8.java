package p000;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import com.google.android.gms.internal.clearcut.C17503d;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzco;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: Rd8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35626Rd8 {

    /* renamed from: f */
    public static final C35626Rd8 f32366f = new C35626Rd8(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f32367a;

    /* renamed from: b */
    public int[] f32368b;

    /* renamed from: c */
    public Object[] f32369c;

    /* renamed from: d */
    public int f32370d;

    /* renamed from: e */
    public boolean f32371e;

    private C35626Rd8() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static C35626Rd8 m86529a(C35626Rd8 c35626Rd8, C35626Rd8 c35626Rd82) {
        int i = c35626Rd8.f32367a + c35626Rd82.f32367a;
        int[] copyOf = Arrays.copyOf(c35626Rd8.f32368b, i);
        System.arraycopy(c35626Rd82.f32368b, 0, copyOf, c35626Rd8.f32367a, c35626Rd82.f32367a);
        Object[] copyOf2 = Arrays.copyOf(c35626Rd8.f32369c, i);
        System.arraycopy(c35626Rd82.f32369c, 0, copyOf2, c35626Rd8.f32367a, c35626Rd82.f32367a);
        return new C35626Rd8(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static void m86524f(int i, Object obj, InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            interfaceC35212Pj8.mo34088L(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            interfaceC35212Pj8.mo34074i(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            interfaceC35212Pj8.mo34086N(i2, (TD7) obj);
        } else if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(zzco.m51355c());
            }
            interfaceC35212Pj8.mo34072k(i2, ((Integer) obj).intValue());
        } else if (interfaceC35212Pj8.mo34085O() == AbstractC17497c.C17502e.f70414l) {
            interfaceC35212Pj8.mo34094F(i2);
            ((C35626Rd8) obj).m86523g(interfaceC35212Pj8);
            interfaceC35212Pj8.mo34093G(i2);
        } else {
            interfaceC35212Pj8.mo34093G(i2);
            ((C35626Rd8) obj).m86523g(interfaceC35212Pj8);
            interfaceC35212Pj8.mo34094F(i2);
        }
    }

    /* renamed from: h */
    public static C35626Rd8 m86522h() {
        return f32366f;
    }

    /* renamed from: i */
    public static C35626Rd8 m86521i() {
        return new C35626Rd8();
    }

    /* renamed from: b */
    public final void m86528b(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f32367a; i2++) {
            C17503d.m51537b(sb, i, String.valueOf(this.f32368b[i2] >>> 3), this.f32369c[i2]);
        }
    }

    /* renamed from: c */
    public final void m86527c(InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        if (interfaceC35212Pj8.mo34085O() == AbstractC17497c.C17502e.f70415m) {
            for (int i = this.f32367a - 1; i >= 0; i--) {
                interfaceC35212Pj8.mo34059x(this.f32368b[i] >>> 3, this.f32369c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f32367a; i2++) {
            interfaceC35212Pj8.mo34059x(this.f32368b[i2] >>> 3, this.f32369c[i2]);
        }
    }

    /* renamed from: d */
    public final int m86526d() {
        int m51419d0;
        int i = this.f32370d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32367a; i3++) {
            int i4 = this.f32368b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                m51419d0 = zzbn.m51419d0(i5, ((Long) this.f32369c[i3]).longValue());
            } else if (i6 == 1) {
                m51419d0 = zzbn.m51407k0(i5, ((Long) this.f32369c[i3]).longValue());
            } else if (i6 == 2) {
                m51419d0 = zzbn.m51432N(i5, (TD7) this.f32369c[i3]);
            } else if (i6 == 3) {
                m51419d0 = (zzbn.m51446B0(i5) << 1) + ((C35626Rd8) this.f32369c[i3]).m86526d();
            } else if (i6 != 5) {
                throw new IllegalStateException(zzco.m51355c());
            } else {
                m51419d0 = zzbn.m51397t0(i5, ((Integer) this.f32369c[i3]).intValue());
            }
            i2 += m51419d0;
        }
        this.f32370d = i2;
        return i2;
    }

    /* renamed from: e */
    public final void m86525e(int i, Object obj) {
        if (!this.f32371e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f32367a;
        int[] iArr = this.f32368b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f32368b = Arrays.copyOf(iArr, i3);
            this.f32369c = Arrays.copyOf(this.f32369c, i3);
        }
        int[] iArr2 = this.f32368b;
        int i4 = this.f32367a;
        iArr2[i4] = i;
        this.f32369c[i4] = obj;
        this.f32367a = i4 + 1;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C35626Rd8)) {
            C35626Rd8 c35626Rd8 = (C35626Rd8) obj;
            int i = this.f32367a;
            if (i == c35626Rd8.f32367a) {
                int[] iArr = this.f32368b;
                int[] iArr2 = c35626Rd8.f32368b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.f32369c;
                    Object[] objArr2 = c35626Rd8.f32369c;
                    int i3 = this.f32367a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public final void m86523g(InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        if (this.f32367a == 0) {
            return;
        }
        if (interfaceC35212Pj8.mo34085O() == AbstractC17497c.C17502e.f70414l) {
            for (int i = 0; i < this.f32367a; i++) {
                m86524f(this.f32368b[i], this.f32369c[i], interfaceC35212Pj8);
            }
            return;
        }
        for (int i2 = this.f32367a - 1; i2 >= 0; i2--) {
            m86524f(this.f32368b[i2], this.f32369c[i2], interfaceC35212Pj8);
        }
    }

    public final int hashCode() {
        int i = this.f32367a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f32368b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f32369c;
        int i7 = this.f32367a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: j */
    public final int m86520j() {
        int i = this.f32370d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32367a; i3++) {
            i2 += zzbn.m51424X(this.f32368b[i3] >>> 3, (TD7) this.f32369c[i3]);
        }
        this.f32370d = i2;
        return i2;
    }

    /* renamed from: k */
    public final void m86519k() {
        this.f32371e = false;
    }

    public C35626Rd8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f32370d = -1;
        this.f32367a = i;
        this.f32368b = iArr;
        this.f32369c = objArr;
        this.f32371e = z;
    }
}
