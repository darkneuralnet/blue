package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InterfaceC18186V;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.google.crypto.tink.shaded.protobuf.Q */
/* loaded from: classes6.dex */
public final class C18170Q {

    /* renamed from: f */
    public static final C18170Q f74078f = new C18170Q(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f74079a;

    /* renamed from: b */
    public int[] f74080b;

    /* renamed from: c */
    public Object[] f74081c;

    /* renamed from: d */
    public int f74082d;

    /* renamed from: e */
    public boolean f74083e;

    private C18170Q() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C18170Q m47894c() {
        return f74078f;
    }

    /* renamed from: f */
    public static int m47891f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    public static int m47890g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: i */
    public static C18170Q m47888i(C18170Q c18170q, C18170Q c18170q2) {
        int i = c18170q.f74079a + c18170q2.f74079a;
        int[] copyOf = Arrays.copyOf(c18170q.f74080b, i);
        System.arraycopy(c18170q2.f74080b, 0, copyOf, c18170q.f74079a, c18170q2.f74079a);
        Object[] copyOf2 = Arrays.copyOf(c18170q.f74081c, i);
        System.arraycopy(c18170q2.f74081c, 0, copyOf2, c18170q.f74079a, c18170q2.f74079a);
        return new C18170Q(i, copyOf, copyOf2, true);
    }

    /* renamed from: j */
    public static C18170Q m47887j() {
        return new C18170Q();
    }

    /* renamed from: k */
    public static boolean m47886k(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m47883n(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static void m47881p(int i, Object obj, InterfaceC18186V interfaceC18186V) throws IOException {
        int m47803a = C18178U.m47803a(i);
        int m47802b = C18178U.m47802b(i);
        if (m47802b != 0) {
            if (m47802b != 1) {
                if (m47802b != 2) {
                    if (m47802b != 3) {
                        if (m47802b == 5) {
                            interfaceC18186V.mo47565c(m47803a, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.m48007e());
                    } else if (interfaceC18186V.mo47584B() == InterfaceC18186V.EnumC18187a.ASCENDING) {
                        interfaceC18186V.mo47552p(m47803a);
                        ((C18170Q) obj).m47880q(interfaceC18186V);
                        interfaceC18186V.mo47550r(m47803a);
                        return;
                    } else {
                        interfaceC18186V.mo47550r(m47803a);
                        ((C18170Q) obj).m47880q(interfaceC18186V);
                        interfaceC18186V.mo47552p(m47803a);
                        return;
                    }
                }
                interfaceC18186V.mo47571O(m47803a, (AbstractC18199g) obj);
                return;
            }
            interfaceC18186V.mo47555m(m47803a, ((Long) obj).longValue());
            return;
        }
        interfaceC18186V.mo47583C(m47803a, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public void m47896a() {
        if (this.f74083e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void m47895b() {
        int i;
        int i2 = this.f74079a;
        int[] iArr = this.f74080b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.f74080b = Arrays.copyOf(iArr, i3);
            this.f74081c = Arrays.copyOf(this.f74081c, i3);
        }
    }

    /* renamed from: d */
    public int m47893d() {
        int m48166X;
        int i = this.f74082d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f74079a; i3++) {
            int i4 = this.f74080b[i3];
            int m47803a = C18178U.m47803a(i4);
            int m47802b = C18178U.m47802b(i4);
            if (m47802b != 0) {
                if (m47802b != 1) {
                    if (m47802b != 2) {
                        if (m47802b != 3) {
                            if (m47802b == 5) {
                                m48166X = CodedOutputStream.m48144m(m47803a, ((Integer) this.f74081c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.m48007e());
                            }
                        } else {
                            m48166X = (CodedOutputStream.m48169U(m47803a) * 2) + ((C18170Q) this.f74081c[i3]).m47893d();
                        }
                    } else {
                        m48166X = CodedOutputStream.m48153g(m47803a, (AbstractC18199g) this.f74081c[i3]);
                    }
                } else {
                    m48166X = CodedOutputStream.m48140o(m47803a, ((Long) this.f74081c[i3]).longValue());
                }
            } else {
                m48166X = CodedOutputStream.m48166X(m47803a, ((Long) this.f74081c[i3]).longValue());
            }
            i2 += m48166X;
        }
        this.f74082d = i2;
        return i2;
    }

    /* renamed from: e */
    public int m47892e() {
        int i = this.f74082d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f74079a; i3++) {
            i2 += CodedOutputStream.m48184I(C18178U.m47803a(this.f74080b[i3]), (AbstractC18199g) this.f74081c[i3]);
        }
        this.f74082d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18170Q)) {
            return false;
        }
        C18170Q c18170q = (C18170Q) obj;
        int i = this.f74079a;
        if (i == c18170q.f74079a && m47883n(this.f74080b, c18170q.f74080b, i) && m47886k(this.f74081c, c18170q.f74081c, this.f74079a)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m47889h() {
        this.f74083e = false;
    }

    public int hashCode() {
        int i = this.f74079a;
        return ((((527 + i) * 31) + m47891f(this.f74080b, i)) * 31) + m47890g(this.f74081c, this.f74079a);
    }

    /* renamed from: l */
    public final void m47885l(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f74079a; i2++) {
            C18151G.m48085c(sb, i, String.valueOf(C18178U.m47803a(this.f74080b[i2])), this.f74081c[i2]);
        }
    }

    /* renamed from: m */
    public void m47884m(int i, Object obj) {
        m47896a();
        m47895b();
        int[] iArr = this.f74080b;
        int i2 = this.f74079a;
        iArr[i2] = i;
        this.f74081c[i2] = obj;
        this.f74079a = i2 + 1;
    }

    /* renamed from: o */
    public void m47882o(InterfaceC18186V interfaceC18186V) throws IOException {
        if (interfaceC18186V.mo47584B() == InterfaceC18186V.EnumC18187a.DESCENDING) {
            for (int i = this.f74079a - 1; i >= 0; i--) {
                interfaceC18186V.mo47566b(C18178U.m47803a(this.f74080b[i]), this.f74081c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f74079a; i2++) {
            interfaceC18186V.mo47566b(C18178U.m47803a(this.f74080b[i2]), this.f74081c[i2]);
        }
    }

    /* renamed from: q */
    public void m47880q(InterfaceC18186V interfaceC18186V) throws IOException {
        if (this.f74079a == 0) {
            return;
        }
        if (interfaceC18186V.mo47584B() == InterfaceC18186V.EnumC18187a.ASCENDING) {
            for (int i = 0; i < this.f74079a; i++) {
                m47881p(this.f74080b[i], this.f74081c[i], interfaceC18186V);
            }
            return;
        }
        for (int i2 = this.f74079a - 1; i2 >= 0; i2--) {
            m47881p(this.f74080b[i2], this.f74081c[i2], interfaceC18186V);
        }
    }

    public C18170Q(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f74082d = -1;
        this.f74079a = i;
        this.f74080b = iArr;
        this.f74081c = objArr;
        this.f74083e = z;
    }
}
