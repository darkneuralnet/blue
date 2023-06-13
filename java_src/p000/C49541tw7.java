package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: tw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49541tw7 {

    /* renamed from: f */
    public static final C49541tw7 f111396f = new C49541tw7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f111397a;

    /* renamed from: b */
    public int[] f111398b;

    /* renamed from: c */
    public Object[] f111399c;

    /* renamed from: d */
    public int f111400d;

    /* renamed from: e */
    public boolean f111401e;

    public C49541tw7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f111400d = -1;
        this.f111397a = i;
        this.f111398b = iArr;
        this.f111399c = objArr;
        this.f111401e = z;
    }

    /* renamed from: c */
    public static C49541tw7 m11184c() {
        return f111396f;
    }

    /* renamed from: d */
    public static C49541tw7 m11183d(C49541tw7 c49541tw7, C49541tw7 c49541tw72) {
        int i = c49541tw7.f111397a + c49541tw72.f111397a;
        int[] copyOf = Arrays.copyOf(c49541tw7.f111398b, i);
        System.arraycopy(c49541tw72.f111398b, 0, copyOf, c49541tw7.f111397a, c49541tw72.f111397a);
        Object[] copyOf2 = Arrays.copyOf(c49541tw7.f111399c, i);
        System.arraycopy(c49541tw72.f111399c, 0, copyOf2, c49541tw7.f111397a, c49541tw72.f111397a);
        return new C49541tw7(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static C49541tw7 m11182e() {
        return new C49541tw7(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m11186a() {
        int m9558m;
        int m9557n;
        int i;
        int i2 = this.f111400d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f111397a; i4++) {
                int i5 = this.f111398b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.f111399c[i4]).intValue();
                                    i = AbstractC50104ut7.m9558m(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzaqw.m51287a());
                                }
                            } else {
                                int m9559l = AbstractC50104ut7.m9559l(i6);
                                m9558m = m9559l + m9559l;
                                m9557n = ((C49541tw7) this.f111399c[i4]).m11186a();
                            }
                        } else {
                            int m9558m2 = AbstractC50104ut7.m9558m(i6 << 3);
                            int mo28217e = ((AbstractC44175kt7) this.f111399c[i4]).mo28217e();
                            i3 += m9558m2 + AbstractC50104ut7.m9558m(mo28217e) + mo28217e;
                        }
                    } else {
                        ((Long) this.f111399c[i4]).longValue();
                        i = AbstractC50104ut7.m9558m(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f111399c[i4]).longValue();
                    m9558m = AbstractC50104ut7.m9558m(i6 << 3);
                    m9557n = AbstractC50104ut7.m9557n(longValue);
                }
                i = m9558m + m9557n;
                i3 += i;
            }
            this.f111400d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m11185b() {
        int i = this.f111400d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f111397a; i3++) {
                int i4 = this.f111398b[i3];
                int m9558m = AbstractC50104ut7.m9558m(8);
                int mo28217e = ((AbstractC44175kt7) this.f111399c[i3]).mo28217e();
                i2 += m9558m + m9558m + AbstractC50104ut7.m9558m(16) + AbstractC50104ut7.m9558m(i4 >>> 3) + AbstractC50104ut7.m9558m(24) + AbstractC50104ut7.m9558m(mo28217e) + mo28217e;
            }
            this.f111400d = i2;
            return i2;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C49541tw7)) {
            return false;
        }
        C49541tw7 c49541tw7 = (C49541tw7) obj;
        int i = this.f111397a;
        if (i == c49541tw7.f111397a) {
            int[] iArr = this.f111398b;
            int[] iArr2 = c49541tw7.f111398b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f111399c;
                    Object[] objArr2 = c49541tw7.f111399c;
                    int i3 = this.f111397a;
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
    public final void m11181f() {
        this.f111401e = false;
    }

    /* renamed from: g */
    public final void m11180g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f111397a; i2++) {
            C42416hv7.m35486b(sb, i, String.valueOf(this.f111398b[i2] >>> 3), this.f111399c[i2]);
        }
    }

    /* renamed from: h */
    public final void m11179h(int i, Object obj) {
        int i2;
        if (this.f111401e) {
            int i3 = this.f111397a;
            int[] iArr = this.f111398b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f111398b = Arrays.copyOf(iArr, i4);
                this.f111399c = Arrays.copyOf(this.f111399c, i4);
            }
            int[] iArr2 = this.f111398b;
            int i5 = this.f111397a;
            iArr2[i5] = i;
            this.f111399c[i5] = obj;
            this.f111397a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f111397a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f111398b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f111399c;
        int i7 = this.f111397a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m11178i(InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        for (int i = 0; i < this.f111397a; i++) {
            interfaceC34158Kw7.mo7844D(this.f111398b[i] >>> 3, this.f111399c[i]);
        }
    }

    /* renamed from: j */
    public final void m11177j(InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        if (this.f111397a != 0) {
            for (int i = 0; i < this.f111397a; i++) {
                int i2 = this.f111398b[i];
                Object obj = this.f111399c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    interfaceC34158Kw7.mo7828h(i3, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzaqw.m51287a());
                                }
                            } else {
                                interfaceC34158Kw7.mo7812x(i3);
                                ((C49541tw7) obj).m11177j(interfaceC34158Kw7);
                                interfaceC34158Kw7.zzh(i3);
                            }
                        } else {
                            interfaceC34158Kw7.mo7837K(i3, (AbstractC44175kt7) obj);
                        }
                    } else {
                        interfaceC34158Kw7.mo7825k(i3, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC34158Kw7.mo7823m(i3, ((Long) obj).longValue());
                }
            }
        }
    }

    private C49541tw7() {
        this(0, new int[8], new Object[8], true);
    }
}
