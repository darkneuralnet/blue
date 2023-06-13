package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: Pr9 */
/* loaded from: classes6.dex */
public final class Pr9 {

    /* renamed from: f */
    public static final Pr9 f29175f = new Pr9(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f29176a;

    /* renamed from: b */
    public int[] f29177b;

    /* renamed from: c */
    public Object[] f29178c;

    /* renamed from: d */
    public int f29179d;

    /* renamed from: e */
    public boolean f29180e;

    public Pr9(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f29179d = -1;
        this.f29176a = i;
        this.f29177b = iArr;
        this.f29178c = objArr;
        this.f29180e = z;
    }

    /* renamed from: c */
    public static Pr9 m89676c() {
        return f29175f;
    }

    /* renamed from: d */
    public static Pr9 m89675d(Pr9 pr9, Pr9 pr92) {
        int i = pr9.f29176a + pr92.f29176a;
        int[] copyOf = Arrays.copyOf(pr9.f29177b, i);
        System.arraycopy(pr92.f29177b, 0, copyOf, pr9.f29176a, pr92.f29176a);
        Object[] copyOf2 = Arrays.copyOf(pr9.f29178c, i);
        System.arraycopy(pr92.f29178c, 0, copyOf2, pr9.f29176a, pr92.f29176a);
        return new Pr9(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static Pr9 m89674e() {
        return new Pr9(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m89678a() {
        int m15506l;
        int m15505m;
        int i;
        int i2 = this.f29179d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f29176a; i4++) {
                int i5 = this.f29177b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.f29178c[i4]).intValue();
                                    i = AbstractC48228rj9.m15506l(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzrr.m51030a());
                                }
                            } else {
                                int m15507k = AbstractC48228rj9.m15507k(i6);
                                m15506l = m15507k + m15507k;
                                m15505m = ((Pr9) this.f29178c[i4]).m89678a();
                            }
                        } else {
                            int m15506l2 = AbstractC48228rj9.m15506l(i6 << 3);
                            int mo11924c = ((AbstractC45836nh9) this.f29178c[i4]).mo11924c();
                            i3 += m15506l2 + AbstractC48228rj9.m15506l(mo11924c) + mo11924c;
                        }
                    } else {
                        ((Long) this.f29178c[i4]).longValue();
                        i = AbstractC48228rj9.m15506l(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f29178c[i4]).longValue();
                    m15506l = AbstractC48228rj9.m15506l(i6 << 3);
                    m15505m = AbstractC48228rj9.m15505m(longValue);
                }
                i = m15506l + m15505m;
                i3 += i;
            }
            this.f29179d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m89677b() {
        int i = this.f29179d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f29176a; i3++) {
                int i4 = this.f29177b[i3];
                int m15506l = AbstractC48228rj9.m15506l(8);
                int mo11924c = ((AbstractC45836nh9) this.f29178c[i3]).mo11924c();
                i2 += m15506l + m15506l + AbstractC48228rj9.m15506l(16) + AbstractC48228rj9.m15506l(i4 >>> 3) + AbstractC48228rj9.m15506l(24) + AbstractC48228rj9.m15506l(mo11924c) + mo11924c;
            }
            this.f29179d = i2;
            return i2;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Pr9)) {
            return false;
        }
        Pr9 pr9 = (Pr9) obj;
        int i = this.f29176a;
        if (i == pr9.f29176a) {
            int[] iArr = this.f29177b;
            int[] iArr2 = pr9.f29177b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f29178c;
                    Object[] objArr2 = pr9.f29178c;
                    int i3 = this.f29176a;
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
    public final void m89673f() {
        this.f29180e = false;
    }

    /* renamed from: g */
    public final void m89672g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f29176a; i2++) {
            Sp9.m84802b(sb, i, String.valueOf(this.f29177b[i2] >>> 3), this.f29178c[i2]);
        }
    }

    /* renamed from: h */
    public final void m89671h(int i, Object obj) {
        int i2;
        if (this.f29180e) {
            int i3 = this.f29176a;
            int[] iArr = this.f29177b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f29177b = Arrays.copyOf(iArr, i4);
                this.f29178c = Arrays.copyOf(this.f29178c, i4);
            }
            int[] iArr2 = this.f29177b;
            int i5 = this.f29176a;
            iArr2[i5] = i;
            this.f29178c[i5] = obj;
            this.f29176a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f29176a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f29177b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f29178c;
        int i7 = this.f29176a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m89670i(Vs9 vs9) throws IOException {
        if (this.f29176a != 0) {
            for (int i = 0; i < this.f29176a; i++) {
                int i2 = this.f29177b[i];
                Object obj = this.f29178c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    vs9.mo2734h(i3, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzrr.m51030a());
                                }
                            } else {
                                vs9.mo2720v(i3);
                                ((Pr9) obj).m89670i(vs9);
                                vs9.zzh(i3);
                            }
                        } else {
                            vs9.mo2743J(i3, (AbstractC45836nh9) obj);
                        }
                    } else {
                        vs9.mo2731k(i3, ((Long) obj).longValue());
                    }
                } else {
                    vs9.mo2729m(i3, ((Long) obj).longValue());
                }
            }
        }
    }

    private Pr9() {
        this(0, new int[8], new Object[8], true);
    }
}
