package com.google.protobuf;

import com.google.protobuf.InterfaceC18497Q;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.google.protobuf.M */
/* loaded from: classes6.dex */
public final class C18481M {

    /* renamed from: f */
    public static final C18481M f74745f = new C18481M(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f74746a;

    /* renamed from: b */
    public int[] f74747b;

    /* renamed from: c */
    public Object[] f74748c;

    /* renamed from: d */
    public int f74749d;

    /* renamed from: e */
    public boolean f74750e;

    private C18481M() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C18481M m46437c() {
        return f74745f;
    }

    /* renamed from: f */
    public static int m46434f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    public static int m46433g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: j */
    public static C18481M m46430j(C18481M c18481m, C18481M c18481m2) {
        int i = c18481m.f74746a + c18481m2.f74746a;
        int[] copyOf = Arrays.copyOf(c18481m.f74747b, i);
        System.arraycopy(c18481m2.f74747b, 0, copyOf, c18481m.f74746a, c18481m2.f74746a);
        Object[] copyOf2 = Arrays.copyOf(c18481m.f74748c, i);
        System.arraycopy(c18481m2.f74748c, 0, copyOf2, c18481m.f74746a, c18481m2.f74746a);
        return new C18481M(i, copyOf, copyOf2, true);
    }

    /* renamed from: k */
    public static C18481M m46429k() {
        return new C18481M();
    }

    /* renamed from: l */
    public static boolean m46428l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m46425o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static void m46423q(int i, Object obj, InterfaceC18497Q interfaceC18497Q) throws IOException {
        int m46345a = C18489P.m46345a(i);
        int m46344b = C18489P.m46344b(i);
        if (m46344b != 0) {
            if (m46344b != 1) {
                if (m46344b != 2) {
                    if (m46344b != 3) {
                        if (m46344b == 5) {
                            interfaceC18497Q.mo46158c(m46345a, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.m46534e());
                    } else if (interfaceC18497Q.mo46181B() == InterfaceC18497Q.EnumC18498a.ASCENDING) {
                        interfaceC18497Q.mo46145p(m46345a);
                        ((C18481M) obj).m46422r(interfaceC18497Q);
                        interfaceC18497Q.mo46143r(m46345a);
                        return;
                    } else {
                        interfaceC18497Q.mo46143r(m46345a);
                        ((C18481M) obj).m46422r(interfaceC18497Q);
                        interfaceC18497Q.mo46145p(m46345a);
                        return;
                    }
                }
                interfaceC18497Q.mo46172K(m46345a, (AbstractC18504e) obj);
                return;
            }
            interfaceC18497Q.mo46148m(m46345a, ((Long) obj).longValue());
            return;
        }
        interfaceC18497Q.mo46180C(m46345a, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public void m46439a() {
        if (this.f74750e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void m46438b(int i) {
        int[] iArr = this.f74747b;
        if (i > iArr.length) {
            int i2 = this.f74746a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f74747b = Arrays.copyOf(iArr, i);
            this.f74748c = Arrays.copyOf(this.f74748c, i);
        }
    }

    /* renamed from: d */
    public int m46436d() {
        int m46698W;
        int i = this.f74749d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f74746a; i3++) {
            int i4 = this.f74747b[i3];
            int m46345a = C18489P.m46345a(i4);
            int m46344b = C18489P.m46344b(i4);
            if (m46344b != 0) {
                if (m46344b != 1) {
                    if (m46344b != 2) {
                        if (m46344b != 3) {
                            if (m46344b == 5) {
                                m46698W = CodedOutputStream.m46677m(m46345a, ((Integer) this.f74748c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.m46534e());
                            }
                        } else {
                            m46698W = (CodedOutputStream.m46701T(m46345a) * 2) + ((C18481M) this.f74748c[i3]).m46436d();
                        }
                    } else {
                        m46698W = CodedOutputStream.m46685g(m46345a, (AbstractC18504e) this.f74748c[i3]);
                    }
                } else {
                    m46698W = CodedOutputStream.m46673o(m46345a, ((Long) this.f74748c[i3]).longValue());
                }
            } else {
                m46698W = CodedOutputStream.m46698W(m46345a, ((Long) this.f74748c[i3]).longValue());
            }
            i2 += m46698W;
        }
        this.f74749d = i2;
        return i2;
    }

    /* renamed from: e */
    public int m46435e() {
        int i = this.f74749d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f74746a; i3++) {
            i2 += CodedOutputStream.m46720I(C18489P.m46345a(this.f74747b[i3]), (AbstractC18504e) this.f74748c[i3]);
        }
        this.f74749d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18481M)) {
            return false;
        }
        C18481M c18481m = (C18481M) obj;
        int i = this.f74746a;
        if (i == c18481m.f74746a && m46425o(this.f74747b, c18481m.f74747b, i) && m46428l(this.f74748c, c18481m.f74748c, this.f74746a)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m46432h() {
        this.f74750e = false;
    }

    public int hashCode() {
        int i = this.f74746a;
        return ((((527 + i) * 31) + m46434f(this.f74747b, i)) * 31) + m46433g(this.f74748c, this.f74746a);
    }

    /* renamed from: i */
    public C18481M m46431i(C18481M c18481m) {
        if (c18481m.equals(m46437c())) {
            return this;
        }
        m46439a();
        int i = this.f74746a + c18481m.f74746a;
        m46438b(i);
        System.arraycopy(c18481m.f74747b, 0, this.f74747b, this.f74746a, c18481m.f74746a);
        System.arraycopy(c18481m.f74748c, 0, this.f74748c, this.f74746a, c18481m.f74746a);
        this.f74746a = i;
        return this;
    }

    /* renamed from: m */
    public final void m46427m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f74746a; i2++) {
            C18464E.m46624d(sb, i, String.valueOf(C18489P.m46345a(this.f74747b[i2])), this.f74748c[i2]);
        }
    }

    /* renamed from: n */
    public void m46426n(int i, Object obj) {
        m46439a();
        m46438b(this.f74746a + 1);
        int[] iArr = this.f74747b;
        int i2 = this.f74746a;
        iArr[i2] = i;
        this.f74748c[i2] = obj;
        this.f74746a = i2 + 1;
    }

    /* renamed from: p */
    public void m46424p(InterfaceC18497Q interfaceC18497Q) throws IOException {
        if (interfaceC18497Q.mo46181B() == InterfaceC18497Q.EnumC18498a.DESCENDING) {
            for (int i = this.f74746a - 1; i >= 0; i--) {
                interfaceC18497Q.mo46159b(C18489P.m46345a(this.f74747b[i]), this.f74748c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f74746a; i2++) {
            interfaceC18497Q.mo46159b(C18489P.m46345a(this.f74747b[i2]), this.f74748c[i2]);
        }
    }

    /* renamed from: r */
    public void m46422r(InterfaceC18497Q interfaceC18497Q) throws IOException {
        if (this.f74746a == 0) {
            return;
        }
        if (interfaceC18497Q.mo46181B() == InterfaceC18497Q.EnumC18498a.ASCENDING) {
            for (int i = 0; i < this.f74746a; i++) {
                m46423q(this.f74747b[i], this.f74748c[i], interfaceC18497Q);
            }
            return;
        }
        for (int i2 = this.f74746a - 1; i2 >= 0; i2--) {
            m46423q(this.f74747b[i2], this.f74748c[i2], interfaceC18497Q);
        }
    }

    public C18481M(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f74749d = -1;
        this.f74746a = i;
        this.f74747b = iArr;
        this.f74748c = objArr;
        this.f74750e = z;
    }
}
