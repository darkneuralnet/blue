package p000;

import com.google.android.gms.internal.vision.C17562I;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: HY8 */
/* loaded from: classes6.dex */
public final class HY8 {

    /* renamed from: f */
    public static final HY8 f13530f = new HY8(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f13531a;

    /* renamed from: b */
    public int[] f13532b;

    /* renamed from: c */
    public Object[] f13533c;

    /* renamed from: d */
    public int f13534d;

    /* renamed from: e */
    public boolean f13535e;

    private HY8() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static HY8 m103758a() {
        return f13530f;
    }

    /* renamed from: b */
    public static HY8 m103757b(HY8 hy8, HY8 hy82) {
        int i = hy8.f13531a + hy82.f13531a;
        int[] copyOf = Arrays.copyOf(hy8.f13532b, i);
        System.arraycopy(hy82.f13532b, 0, copyOf, hy8.f13531a, hy82.f13531a);
        Object[] copyOf2 = Arrays.copyOf(hy8.f13533c, i);
        System.arraycopy(hy82.f13533c, 0, copyOf2, hy8.f13531a, hy82.f13531a);
        return new HY8(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public static void m103755d(int i, Object obj, InterfaceC37736a39 interfaceC37736a39) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            interfaceC37736a39.mo21589l(i2, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(zzjk.m50759f());
                    } else if (interfaceC37736a39.zza() == Q29.f29741a) {
                        interfaceC37736a39.zza(i2);
                        ((HY8) obj).m103751h(interfaceC37736a39);
                        interfaceC37736a39.mo21594g(i2);
                        return;
                    } else {
                        interfaceC37736a39.mo21594g(i2);
                        ((HY8) obj).m103751h(interfaceC37736a39);
                        interfaceC37736a39.zza(i2);
                        return;
                    }
                }
                interfaceC37736a39.mo21602M(i2, (AbstractC53119zy8) obj);
                return;
            }
            interfaceC37736a39.mo21613B(i2, ((Long) obj).longValue());
            return;
        }
        interfaceC37736a39.mo21576y(i2, ((Long) obj).longValue());
    }

    /* renamed from: g */
    public static HY8 m103752g() {
        return new HY8();
    }

    /* renamed from: c */
    public final void m103756c(int i, Object obj) {
        int i2;
        if (this.f13535e) {
            int i3 = this.f13531a;
            int[] iArr = this.f13532b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f13532b = Arrays.copyOf(iArr, i4);
                this.f13533c = Arrays.copyOf(this.f13533c, i4);
            }
            int[] iArr2 = this.f13532b;
            int i5 = this.f13531a;
            iArr2[i5] = i;
            this.f13533c[i5] = obj;
            this.f13531a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void m103754e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f13531a; i2++) {
            C17562I.m50925c(sb, i, String.valueOf(this.f13532b[i2] >>> 3), this.f13533c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HY8)) {
            return false;
        }
        HY8 hy8 = (HY8) obj;
        int i = this.f13531a;
        if (i == hy8.f13531a) {
            int[] iArr = this.f13532b;
            int[] iArr2 = hy8.f13532b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                Object[] objArr = this.f13533c;
                Object[] objArr2 = hy8.f13533c;
                int i3 = this.f13531a;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m103753f(InterfaceC37736a39 interfaceC37736a39) throws IOException {
        if (interfaceC37736a39.zza() == Q29.f29742b) {
            for (int i = this.f13531a - 1; i >= 0; i--) {
                interfaceC37736a39.mo21577x(this.f13532b[i] >>> 3, this.f13533c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f13531a; i2++) {
            interfaceC37736a39.mo21577x(this.f13532b[i2] >>> 3, this.f13533c[i2]);
        }
    }

    /* renamed from: h */
    public final void m103751h(InterfaceC37736a39 interfaceC37736a39) throws IOException {
        if (this.f13531a == 0) {
            return;
        }
        if (interfaceC37736a39.zza() == Q29.f29741a) {
            for (int i = 0; i < this.f13531a; i++) {
                m103755d(this.f13532b[i], this.f13533c[i], interfaceC37736a39);
            }
            return;
        }
        for (int i2 = this.f13531a - 1; i2 >= 0; i2--) {
            m103755d(this.f13532b[i2], this.f13533c[i2], interfaceC37736a39);
        }
    }

    public final int hashCode() {
        int i = this.f13531a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f13532b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f13533c;
        int i7 = this.f13531a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m103750i() {
        this.f13535e = false;
    }

    /* renamed from: j */
    public final int m103749j() {
        int i = this.f13534d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13531a; i3++) {
            i2 += zzii.m50820c0(this.f13532b[i3] >>> 3, (AbstractC53119zy8) this.f13533c[i3]);
        }
        this.f13534d = i2;
        return i2;
    }

    /* renamed from: k */
    public final int m103748k() {
        int m50812h0;
        int i = this.f13534d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13531a; i3++) {
            int i4 = this.f13532b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                m50812h0 = zzii.m50793x0(i5, ((Integer) this.f13533c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(zzjk.m50759f());
                            }
                        } else {
                            m50812h0 = (zzii.m50814g0(i5) << 1) + ((HY8) this.f13533c[i3]).m103748k();
                        }
                    } else {
                        m50812h0 = zzii.m50827T(i5, (AbstractC53119zy8) this.f13533c[i3]);
                    }
                } else {
                    m50812h0 = zzii.m50801q0(i5, ((Long) this.f13533c[i3]).longValue());
                }
            } else {
                m50812h0 = zzii.m50812h0(i5, ((Long) this.f13533c[i3]).longValue());
            }
            i2 += m50812h0;
        }
        this.f13534d = i2;
        return i2;
    }

    public HY8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f13534d = -1;
        this.f13531a = i;
        this.f13532b = iArr;
        this.f13533c = objArr;
        this.f13535e = z;
    }
}
