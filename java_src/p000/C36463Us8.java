package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
/* renamed from: Us8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36463Us8 {

    /* renamed from: f */
    public static final C36463Us8 f38202f = new C36463Us8(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f38203a;

    /* renamed from: b */
    public int[] f38204b;

    /* renamed from: c */
    public Object[] f38205c;

    /* renamed from: d */
    public int f38206d;

    /* renamed from: e */
    public boolean f38207e;

    public C36463Us8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f38206d = -1;
        this.f38203a = i;
        this.f38204b = iArr;
        this.f38205c = objArr;
        this.f38207e = z;
    }

    /* renamed from: c */
    public static C36463Us8 m80680c() {
        return f38202f;
    }

    /* renamed from: e */
    public static C36463Us8 m80678e(C36463Us8 c36463Us8, C36463Us8 c36463Us82) {
        int i = c36463Us8.f38203a + c36463Us82.f38203a;
        int[] copyOf = Arrays.copyOf(c36463Us8.f38204b, i);
        System.arraycopy(c36463Us82.f38204b, 0, copyOf, c36463Us8.f38203a, c36463Us82.f38203a);
        Object[] copyOf2 = Arrays.copyOf(c36463Us8.f38205c, i);
        System.arraycopy(c36463Us82.f38205c, 0, copyOf2, c36463Us8.f38203a, c36463Us82.f38203a);
        return new C36463Us8(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static C36463Us8 m80677f() {
        return new C36463Us8(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m80682a() {
        int m16655B;
        int m16656A;
        int i;
        int i2 = this.f38206d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f38203a; i4++) {
                int i5 = this.f38204b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.f38205c[i4]).intValue();
                                    i = AbstractC47813r18.m16656A(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzeo.m51321a());
                                }
                            } else {
                                int i8 = i6 << 3;
                                Logger logger = AbstractC47813r18.f106235b;
                                m16655B = ((C36463Us8) this.f38205c[i4]).m80682a();
                                int m16656A2 = AbstractC47813r18.m16656A(i8);
                                m16656A = m16656A2 + m16656A2;
                            }
                        } else {
                            Logger logger2 = AbstractC47813r18.f106235b;
                            int mo5074e = ((AbstractC41604gZ7) this.f38205c[i4]).mo5074e();
                            i = AbstractC47813r18.m16656A(i6 << 3) + AbstractC47813r18.m16656A(mo5074e) + mo5074e;
                        }
                    } else {
                        ((Long) this.f38205c[i4]).longValue();
                        i = AbstractC47813r18.m16656A(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i9 = i6 << 3;
                    m16655B = AbstractC47813r18.m16655B(((Long) this.f38205c[i4]).longValue());
                    m16656A = AbstractC47813r18.m16656A(i9);
                }
                i = m16656A + m16655B;
                i3 += i;
            }
            this.f38206d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m80681b() {
        int i = this.f38206d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f38203a; i3++) {
                Logger logger = AbstractC47813r18.f106235b;
                int mo5074e = ((AbstractC41604gZ7) this.f38205c[i3]).mo5074e();
                int m16656A = AbstractC47813r18.m16656A(mo5074e) + mo5074e;
                int m16656A2 = AbstractC47813r18.m16656A(16);
                int m16656A3 = AbstractC47813r18.m16656A(this.f38204b[i3] >>> 3);
                int m16656A4 = AbstractC47813r18.m16656A(8);
                i2 += m16656A4 + m16656A4 + m16656A2 + m16656A3 + AbstractC47813r18.m16656A(24) + m16656A;
            }
            this.f38206d = i2;
            return i2;
        }
        return i;
    }

    /* renamed from: d */
    public final C36463Us8 m80679d(C36463Us8 c36463Us8) {
        if (c36463Us8.equals(f38202f)) {
            return this;
        }
        m80676g();
        int i = this.f38203a + c36463Us8.f38203a;
        m80670m(i);
        System.arraycopy(c36463Us8.f38204b, 0, this.f38204b, this.f38203a, c36463Us8.f38203a);
        System.arraycopy(c36463Us8.f38205c, 0, this.f38205c, this.f38203a, c36463Us8.f38203a);
        this.f38203a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C36463Us8)) {
            return false;
        }
        C36463Us8 c36463Us8 = (C36463Us8) obj;
        int i = this.f38203a;
        if (i == c36463Us8.f38203a) {
            int[] iArr = this.f38204b;
            int[] iArr2 = c36463Us8.f38204b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f38205c;
                    Object[] objArr2 = c36463Us8.f38205c;
                    int i3 = this.f38203a;
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
    public final void m80676g() {
        if (!this.f38207e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void m80675h() {
        this.f38207e = false;
    }

    public final int hashCode() {
        int i = this.f38203a;
        int i2 = i + 527;
        int[] iArr = this.f38204b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.f38205c;
        int i7 = this.f38203a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    /* renamed from: i */
    public final void m80674i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f38203a; i2++) {
            C32638Ej8.m108549b(sb, i, String.valueOf(this.f38204b[i2] >>> 3), this.f38205c[i2]);
        }
    }

    /* renamed from: j */
    public final void m80673j(int i, Object obj) {
        m80676g();
        m80670m(this.f38203a + 1);
        int[] iArr = this.f38204b;
        int i2 = this.f38203a;
        iArr[i2] = i;
        this.f38205c[i2] = obj;
        this.f38203a = i2 + 1;
    }

    /* renamed from: k */
    public final void m80672k(InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        for (int i = 0; i < this.f38203a; i++) {
            interfaceC36040Sx8.mo84560I(this.f38204b[i] >>> 3, this.f38205c[i]);
        }
    }

    /* renamed from: l */
    public final void m80671l(InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        if (this.f38203a != 0) {
            for (int i = 0; i < this.f38203a; i++) {
                int i2 = this.f38204b[i];
                Object obj = this.f38205c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    interfaceC36040Sx8.mo84551h(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzeo.m51321a());
                                }
                            } else {
                                interfaceC36040Sx8.mo84537v(i4);
                                ((C36463Us8) obj).m80671l(interfaceC36040Sx8);
                                interfaceC36040Sx8.zzh(i4);
                            }
                        } else {
                            interfaceC36040Sx8.mo84559J(i4, (AbstractC41604gZ7) obj);
                        }
                    } else {
                        interfaceC36040Sx8.mo84548k(i4, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC36040Sx8.mo84546m(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    /* renamed from: m */
    public final void m80670m(int i) {
        int[] iArr = this.f38204b;
        if (i > iArr.length) {
            int i2 = this.f38203a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f38204b = Arrays.copyOf(iArr, i);
            this.f38205c = Arrays.copyOf(this.f38205c, i);
        }
    }

    private C36463Us8() {
        this(0, new int[8], new Object[8], true);
    }
}
