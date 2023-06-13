package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
/* renamed from: Cc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32106Cc7 {

    /* renamed from: f */
    public static final C32106Cc7 f4383f = new C32106Cc7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f4384a;

    /* renamed from: b */
    public int[] f4385b;

    /* renamed from: c */
    public Object[] f4386c;

    /* renamed from: d */
    public int f4387d;

    /* renamed from: e */
    public boolean f4388e;

    public C32106Cc7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f4387d = -1;
        this.f4384a = i;
        this.f4385b = iArr;
        this.f4386c = objArr;
        this.f4388e = z;
    }

    /* renamed from: c */
    public static C32106Cc7 m111980c() {
        return f4383f;
    }

    /* renamed from: e */
    public static C32106Cc7 m111978e(C32106Cc7 c32106Cc7, C32106Cc7 c32106Cc72) {
        int i = c32106Cc7.f4384a + c32106Cc72.f4384a;
        int[] copyOf = Arrays.copyOf(c32106Cc7.f4385b, i);
        System.arraycopy(c32106Cc72.f4385b, 0, copyOf, c32106Cc7.f4384a, c32106Cc72.f4384a);
        Object[] copyOf2 = Arrays.copyOf(c32106Cc7.f4386c, i);
        System.arraycopy(c32106Cc72.f4386c, 0, copyOf2, c32106Cc7.f4384a, c32106Cc72.f4384a);
        return new C32106Cc7(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static C32106Cc7 m111977f() {
        return new C32106Cc7(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m111982a() {
        int m100165b;
        int m100166a;
        int i;
        int i2 = this.f4387d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f4384a; i4++) {
                int i5 = this.f4385b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.f4386c[i4]).intValue();
                                    i = AbstractC33726Ja7.m100166a(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zbuw.m51262a());
                                }
                            } else {
                                int i8 = i6 << 3;
                                Logger logger = AbstractC33726Ja7.f17883b;
                                m100165b = ((C32106Cc7) this.f4386c[i4]).m111982a();
                                int m100166a2 = AbstractC33726Ja7.m100166a(i8);
                                m100166a = m100166a2 + m100166a2;
                            }
                        } else {
                            Logger logger2 = AbstractC33726Ja7.f17883b;
                            int mo1072c = ((AbstractC32088Ca7) this.f4386c[i4]).mo1072c();
                            i = AbstractC33726Ja7.m100166a(i6 << 3) + AbstractC33726Ja7.m100166a(mo1072c) + mo1072c;
                        }
                    } else {
                        ((Long) this.f4386c[i4]).longValue();
                        i = AbstractC33726Ja7.m100166a(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i9 = i6 << 3;
                    m100165b = AbstractC33726Ja7.m100165b(((Long) this.f4386c[i4]).longValue());
                    m100166a = AbstractC33726Ja7.m100166a(i9);
                }
                i = m100166a + m100165b;
                i3 += i;
            }
            this.f4387d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m111981b() {
        int i = this.f4387d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f4384a; i3++) {
                Logger logger = AbstractC33726Ja7.f17883b;
                int mo1072c = ((AbstractC32088Ca7) this.f4386c[i3]).mo1072c();
                int m100166a = AbstractC33726Ja7.m100166a(mo1072c) + mo1072c;
                int m100166a2 = AbstractC33726Ja7.m100166a(16);
                int m100166a3 = AbstractC33726Ja7.m100166a(this.f4385b[i3] >>> 3);
                int m100166a4 = AbstractC33726Ja7.m100166a(8);
                i2 += m100166a4 + m100166a4 + m100166a2 + m100166a3 + AbstractC33726Ja7.m100166a(24) + m100166a;
            }
            this.f4387d = i2;
            return i2;
        }
        return i;
    }

    /* renamed from: d */
    public final C32106Cc7 m111979d(C32106Cc7 c32106Cc7) {
        if (c32106Cc7.equals(f4383f)) {
            return this;
        }
        m111976g();
        int i = this.f4384a + c32106Cc7.f4384a;
        m111970m(i);
        System.arraycopy(c32106Cc7.f4385b, 0, this.f4385b, this.f4384a, c32106Cc7.f4384a);
        System.arraycopy(c32106Cc7.f4386c, 0, this.f4386c, this.f4384a, c32106Cc7.f4384a);
        this.f4384a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C32106Cc7)) {
            return false;
        }
        C32106Cc7 c32106Cc7 = (C32106Cc7) obj;
        int i = this.f4384a;
        if (i == c32106Cc7.f4384a) {
            int[] iArr = this.f4385b;
            int[] iArr2 = c32106Cc7.f4385b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f4386c;
                    Object[] objArr2 = c32106Cc7.f4386c;
                    int i3 = this.f4384a;
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

    /* renamed from: g */
    public final void m111976g() {
        if (!this.f4388e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void m111975h() {
        if (this.f4388e) {
            this.f4388e = false;
        }
    }

    public final int hashCode() {
        int i = this.f4384a;
        int i2 = i + 527;
        int[] iArr = this.f4385b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.f4386c;
        int i7 = this.f4384a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    /* renamed from: i */
    public final void m111974i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f4384a; i2++) {
            C36543Vb7.m79681b(sb, i, String.valueOf(this.f4385b[i2] >>> 3), this.f4386c[i2]);
        }
    }

    /* renamed from: j */
    public final void m111973j(int i, Object obj) {
        m111976g();
        m111970m(this.f4384a + 1);
        int[] iArr = this.f4385b;
        int i2 = this.f4384a;
        iArr[i2] = i;
        this.f4386c[i2] = obj;
        this.f4384a = i2 + 1;
    }

    /* renamed from: k */
    public final void m111972k(InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        for (int i = 0; i < this.f4384a; i++) {
            interfaceC36084Tc7.mo83293c(this.f4385b[i] >>> 3, this.f4386c[i]);
        }
    }

    /* renamed from: l */
    public final void m111971l(InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        if (this.f4384a != 0) {
            for (int i = 0; i < this.f4384a; i++) {
                int i2 = this.f4385b[i];
                Object obj = this.f4386c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    interfaceC36084Tc7.mo83274v(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zbuw.m51262a());
                                }
                            } else {
                                interfaceC36084Tc7.mo83280p(i4);
                                ((C32106Cc7) obj).m111971l(interfaceC36084Tc7);
                                interfaceC36084Tc7.mo83288h(i4);
                            }
                        } else {
                            interfaceC36084Tc7.mo83290f(i4, (AbstractC32088Ca7) obj);
                        }
                    } else {
                        interfaceC36084Tc7.mo83276t(i4, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC36084Tc7.mo83300H(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    /* renamed from: m */
    public final void m111970m(int i) {
        int[] iArr = this.f4385b;
        if (i > iArr.length) {
            int i2 = this.f4384a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f4385b = Arrays.copyOf(iArr, i);
            this.f4386c = Arrays.copyOf(this.f4386c, i);
        }
    }

    private C32106Cc7() {
        this(0, new int[8], new Object[8], true);
    }
}
