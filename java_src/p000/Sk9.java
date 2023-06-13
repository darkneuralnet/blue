package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: Sk9 */
/* loaded from: classes5.dex */
public final class Sk9 {

    /* renamed from: f */
    public static final Sk9 f34194f = new Sk9(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f34195a;

    /* renamed from: b */
    public int[] f34196b;

    /* renamed from: c */
    public Object[] f34197c;

    /* renamed from: d */
    public int f34198d;

    /* renamed from: e */
    public boolean f34199e;

    public Sk9(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f34198d = -1;
        this.f34195a = i;
        this.f34196b = iArr;
        this.f34197c = objArr;
        this.f34199e = z;
    }

    /* renamed from: c */
    public static Sk9 m84915c() {
        return f34194f;
    }

    /* renamed from: d */
    public static Sk9 m84914d(Sk9 sk9, Sk9 sk92) {
        int i = sk9.f34195a + sk92.f34195a;
        int[] copyOf = Arrays.copyOf(sk9.f34196b, i);
        System.arraycopy(sk92.f34196b, 0, copyOf, sk9.f34195a, sk92.f34195a);
        Object[] copyOf2 = Arrays.copyOf(sk9.f34197c, i);
        System.arraycopy(sk92.f34197c, 0, copyOf2, sk9.f34195a, sk92.f34195a);
        return new Sk9(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static Sk9 m84913e() {
        return new Sk9(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m84917a() {
        int m73702d;
        int m73701e;
        int i;
        int i2 = this.f34198d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f34195a; i4++) {
                int i5 = this.f34196b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.f34197c[i4]).intValue();
                                    i = Z79.m73702d(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzov.m51295a());
                                }
                            } else {
                                int m73703c = Z79.m73703c(i6);
                                m73702d = m73703c + m73703c;
                                m73701e = ((Sk9) this.f34197c[i4]).m84917a();
                            }
                        } else {
                            int m73702d2 = Z79.m73702d(i6 << 3);
                            int mo7402c = ((T69) this.f34197c[i4]).mo7402c();
                            i3 += m73702d2 + Z79.m73702d(mo7402c) + mo7402c;
                        }
                    } else {
                        ((Long) this.f34197c[i4]).longValue();
                        i = Z79.m73702d(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f34197c[i4]).longValue();
                    m73702d = Z79.m73702d(i6 << 3);
                    m73701e = Z79.m73701e(longValue);
                }
                i = m73702d + m73701e;
                i3 += i;
            }
            this.f34198d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m84916b() {
        int i = this.f34198d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f34195a; i3++) {
                int i4 = this.f34196b[i3];
                int m73702d = Z79.m73702d(8);
                int mo7402c = ((T69) this.f34197c[i3]).mo7402c();
                i2 += m73702d + m73702d + Z79.m73702d(16) + Z79.m73702d(i4 >>> 3) + Z79.m73702d(24) + Z79.m73702d(mo7402c) + mo7402c;
            }
            this.f34198d = i2;
            return i2;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Sk9)) {
            return false;
        }
        Sk9 sk9 = (Sk9) obj;
        int i = this.f34195a;
        if (i == sk9.f34195a) {
            int[] iArr = this.f34196b;
            int[] iArr2 = sk9.f34196b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f34197c;
                    Object[] objArr2 = sk9.f34197c;
                    int i3 = this.f34195a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m84912f() {
        this.f34199e = false;
    }

    /* renamed from: g */
    public final void m84911g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f34195a; i2++) {
            Dg9.m110011b(sb, i, String.valueOf(this.f34196b[i2] >>> 3), this.f34197c[i2]);
        }
    }

    /* renamed from: h */
    public final void m84910h(int i, Object obj) {
        int i2;
        if (this.f34199e) {
            int i3 = this.f34195a;
            int[] iArr = this.f34196b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f34196b = Arrays.copyOf(iArr, i4);
                this.f34197c = Arrays.copyOf(this.f34197c, i4);
            }
            int[] iArr2 = this.f34196b;
            int i5 = this.f34195a;
            iArr2[i5] = i;
            this.f34197c[i5] = obj;
            this.f34195a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f34195a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f34196b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f34197c;
        int i7 = this.f34195a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m84909i(C41954h89 c41954h89) throws IOException {
        for (int i = 0; i < this.f34195a; i++) {
            c41954h89.m36801I(this.f34196b[i] >>> 3, this.f34197c[i]);
        }
    }

    /* renamed from: j */
    public final void m84908j(C41954h89 c41954h89) throws IOException {
        if (this.f34195a != 0) {
            for (int i = 0; i < this.f34195a; i++) {
                int i2 = this.f34196b[i];
                Object obj = this.f34197c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    c41954h89.m36775w(i3, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzov.m51295a());
                                }
                            } else {
                                c41954h89.m36792f(i3);
                                ((Sk9) obj).m84908j(c41954h89);
                                c41954h89.m36778t(i3);
                            }
                        } else {
                            c41954h89.m36782p(i3, (T69) obj);
                        }
                    } else {
                        c41954h89.m36773y(i3, ((Long) obj).longValue());
                    }
                } else {
                    c41954h89.m36804F(i3, ((Long) obj).longValue());
                }
            }
        }
    }

    private Sk9() {
        this(0, new int[8], new Object[8], true);
    }
}
