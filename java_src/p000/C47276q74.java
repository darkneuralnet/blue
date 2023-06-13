package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import p000.C47276q74;
/* renamed from: q74  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47276q74<Q> extends AbstractC28986u1<Q> {
    private static final long serialVersionUID = 962983585531030093L;

    /* renamed from: f */
    public final C27510b[] f104751f;

    /* renamed from: g */
    public transient C37573Zm2<Integer> f104752g;

    /* renamed from: q74$b */
    /* loaded from: classes8.dex */
    public static final class C27510b implements Serializable {
        private static final long serialVersionUID = 452938412398890507L;

        /* renamed from: b */
        public final InterfaceC35858Sd6<?> f104753b;

        /* renamed from: c */
        public final int f104754c;

        /* renamed from: d */
        public final int f104755d;

        /* renamed from: d */
        public int m18091d() {
            return this.f104754c;
        }

        /* renamed from: e */
        public int m18090e() {
            return this.f104755d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C27510b.class != obj.getClass()) {
                return false;
            }
            C27510b c27510b = (C27510b) obj;
            if (Objects.equals(Integer.valueOf(this.f104754c), Integer.valueOf(c27510b.f104754c)) && Objects.equals(Integer.valueOf(this.f104755d), Integer.valueOf(c27510b.f104755d)) && Objects.equals(this.f104753b, c27510b.f104753b)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public InterfaceC35858Sd6<?> m18089f() {
            return this.f104753b;
        }

        public int hashCode() {
            return Objects.hash(this.f104753b, Integer.valueOf(this.f104754c), Integer.valueOf(this.f104755d));
        }

        public C27510b(InterfaceC35858Sd6<?> interfaceC35858Sd6, int i, int i2) {
            this.f104753b = interfaceC35858Sd6;
            this.f104754c = i;
            this.f104755d = i2;
        }
    }

    /* renamed from: q74$c */
    /* loaded from: classes8.dex */
    public static final class C27511c {
        private C27511c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
            return false;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean m18085d(C27510b[] c27510bArr, C27510b[] c27510bArr2) {
            if (c27510bArr.length != c27510bArr2.length) {
                return false;
            }
            int length = c27510bArr.length;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    return true;
                }
                C27510b c27510b = c27510bArr[i];
                int length2 = c27510bArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        C27510b c27510b2 = c27510bArr2[i2];
                        if (c27510b.f104753b.equals(c27510b2.f104753b)) {
                            if (c27510b.f104754c != c27510b2.f104754c || c27510b.f104755d != c27510b2.f104755d) {
                                break;
                            }
                        } else {
                            i2++;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                i++;
            }
        }

        /* renamed from: e */
        public static int m18084e(C27510b c27510b, C27510b c27510b2) {
            InterfaceC35858Sd6<?> mo11089G = c27510b.m18089f().mo11089G();
            InterfaceC35858Sd6<?> mo11089G2 = c27510b2.m18089f().mo11089G();
            String mo11086a = mo11089G.mo11086a();
            String mo11086a2 = mo11089G2.mo11086a();
            if (mo11086a != null && mo11086a2 != null) {
                return mo11086a.compareTo(mo11086a2);
            }
            return mo11089G.toString().compareTo(mo11089G2.toString());
        }

        /* renamed from: f */
        public static C27510b[] m18083f(C27510b[] c27510bArr) {
            if (c27510bArr != null && c27510bArr.length > 1) {
                C27510b[] c27510bArr2 = (C27510b[]) Arrays.copyOf(c27510bArr, c27510bArr.length);
                Arrays.sort(c27510bArr2, new Comparator() { // from class: r74
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m18084e;
                        m18084e = C47276q74.C27511c.m18084e((C47276q74.C27510b) obj, (C47276q74.C27510b) obj2);
                        return m18084e;
                    }
                });
                return c27510bArr2;
            }
            return c27510bArr;
        }
    }

    public C47276q74() {
        super("");
        this.f104752g = new C37573Zm2<>(new Supplier() { // from class: p74
            @Override // java.util.function.Supplier
            public final Object get() {
                int m18105M;
                m18105M = C47276q74.this.m18105M();
                return Integer.valueOf(m18105M);
            }
        });
        this.f104751f = new C27510b[0];
    }

    /* renamed from: N */
    public static int m18104N(int i, int i2) {
        return i2 == 0 ? i : m18104N(i2, i % i2);
    }

    /* renamed from: P */
    public static InterfaceC35858Sd6<?> m18103P(C27510b[] c27510bArr, C27510b[] c27510bArr2) {
        boolean z;
        int i;
        C27510b[] c27510bArr3 = new C27510b[c27510bArr.length + c27510bArr2.length];
        int length = c27510bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= length) {
                break;
            }
            C27510b c27510b = c27510bArr[i2];
            InterfaceC35858Sd6 interfaceC35858Sd6 = c27510b.f104753b;
            int i5 = c27510b.f104754c;
            int i6 = c27510b.f104755d;
            int length2 = c27510bArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 < length2) {
                    C27510b c27510b2 = c27510bArr2[i7];
                    if (interfaceC35858Sd6.equals(c27510b2.f104753b)) {
                        i = c27510b2.f104754c;
                        i4 = c27510b2.f104755d;
                        break;
                    }
                    i7++;
                } else {
                    i = 0;
                    break;
                }
            }
            int i8 = (i5 * i4) + (i * i6);
            int i9 = i6 * i4;
            if (i8 != 0) {
                int m18104N = m18104N(Math.abs(i8), i9);
                c27510bArr3[i3] = new C27510b(interfaceC35858Sd6, i8 / m18104N, i9 / m18104N);
                i3++;
            }
            i2++;
        }
        for (C27510b c27510b3 : c27510bArr2) {
            InterfaceC35858Sd6 interfaceC35858Sd62 = c27510b3.f104753b;
            int length3 = c27510bArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length3) {
                    if (interfaceC35858Sd62.equals(c27510bArr[i10].f104753b)) {
                        z = true;
                        break;
                    }
                    i10++;
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                c27510bArr3[i3] = c27510b3;
                i3++;
            }
        }
        if (i3 == 0) {
            return AbstractC28986u1.f111479d;
        }
        if (i3 == 1 && c27510bArr3[0].f104754c == c27510bArr3[0].f104755d) {
            return c27510bArr3[0].f104753b;
        }
        C27510b[] c27510bArr4 = new C27510b[i3];
        System.arraycopy(c27510bArr3, 0, c27510bArr4, 0, i3);
        return new C47276q74(c27510bArr4);
    }

    /* renamed from: Y */
    public static InterfaceC35858Sd6<?> m18098Y(InterfaceC35858Sd6<?> interfaceC35858Sd6, int i) {
        C27510b[] c27510bArr;
        if (interfaceC35858Sd6 instanceof C47276q74) {
            C27510b[] c27510bArr2 = ((C47276q74) interfaceC35858Sd6).f104751f;
            c27510bArr = new C27510b[c27510bArr2.length];
            for (int i2 = 0; i2 < c27510bArr2.length; i2++) {
                int m18104N = m18104N(Math.abs(c27510bArr2[i2].f104754c * i), c27510bArr2[i2].f104755d);
                c27510bArr[i2] = new C27510b(c27510bArr2[i2].f104753b, (c27510bArr2[i2].f104754c * i) / m18104N, c27510bArr2[i2].f104755d / m18104N);
            }
        } else {
            c27510bArr = new C27510b[]{new C27510b(interfaceC35858Sd6, i, 1)};
        }
        return m18103P(c27510bArr, new C27510b[0]);
    }

    /* renamed from: Z */
    public static InterfaceC35858Sd6<?> m18097Z(InterfaceC35858Sd6<?> interfaceC35858Sd6, InterfaceC35858Sd6<?> interfaceC35858Sd62) {
        C27510b[] c27510bArr;
        C27510b[] c27510bArr2;
        if (interfaceC35858Sd6 instanceof C47276q74) {
            c27510bArr = ((C47276q74) interfaceC35858Sd6).f104751f;
        } else {
            c27510bArr = new C27510b[]{new C27510b(interfaceC35858Sd6, 1, 1)};
        }
        if (interfaceC35858Sd62 instanceof C47276q74) {
            c27510bArr2 = ((C47276q74) interfaceC35858Sd62).f104751f;
        } else {
            c27510bArr2 = new C27510b[]{new C27510b(interfaceC35858Sd62, 1, 1)};
        }
        return m18103P(c27510bArr, c27510bArr2);
    }

    /* renamed from: c0 */
    public static InterfaceC35858Sd6<?> m18096c0(InterfaceC35858Sd6<?> interfaceC35858Sd6, InterfaceC35858Sd6<?> interfaceC35858Sd62) {
        C27510b[] c27510bArr;
        C27510b[] c27510bArr2;
        if (interfaceC35858Sd6 instanceof C47276q74) {
            c27510bArr = ((C47276q74) interfaceC35858Sd6).f104751f;
        } else {
            c27510bArr = new C27510b[]{new C27510b(interfaceC35858Sd6, 1, 1)};
        }
        if (interfaceC35858Sd62 instanceof C47276q74) {
            C27510b[] c27510bArr3 = ((C47276q74) interfaceC35858Sd62).f104751f;
            c27510bArr2 = new C27510b[c27510bArr3.length];
            for (int i = 0; i < c27510bArr3.length; i++) {
                c27510bArr2[i] = new C27510b(c27510bArr3[i].f104753b, -c27510bArr3[i].f104754c, c27510bArr3[i].f104755d);
            }
        } else {
            c27510bArr2 = new C27510b[]{new C27510b(interfaceC35858Sd62, -1, 1)};
        }
        return m18103P(c27510bArr, c27510bArr2);
    }

    /* renamed from: d0 */
    public static InterfaceC35858Sd6<?> m18095d0(InterfaceC35858Sd6<?> interfaceC35858Sd6, int i) {
        C27510b[] c27510bArr;
        if (interfaceC35858Sd6 instanceof C47276q74) {
            C27510b[] c27510bArr2 = ((C47276q74) interfaceC35858Sd6).f104751f;
            c27510bArr = new C27510b[c27510bArr2.length];
            for (int i2 = 0; i2 < c27510bArr2.length; i2++) {
                int m18104N = m18104N(Math.abs(c27510bArr2[i2].f104754c), c27510bArr2[i2].f104755d * i);
                c27510bArr[i2] = new C27510b(c27510bArr2[i2].f104753b, c27510bArr2[i2].f104754c / m18104N, (c27510bArr2[i2].f104755d * i) / m18104N);
            }
        } else {
            c27510bArr = new C27510b[]{new C27510b(interfaceC35858Sd6, 1, i)};
        }
        return m18103P(c27510bArr, new C27510b[0]);
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: F */
    public V31 mo3806F() {
        V31 v31 = C38670be6.f57823d;
        for (int i = 0; i < m18101T(); i++) {
            InterfaceC35858Sd6<?> m18102R = m18102R(i);
            if (this.f104751f != null && m18102R.mo3806F() != null) {
                v31 = v31.mo64211f(m18102R.mo3806F().mo64213d(m18100U(i)).mo64214c(m18099W(i)));
            }
        }
        return v31;
    }

    @Override // p000.AbstractC28986u1
    /* renamed from: J */
    public InterfaceC35858Sd6<Q> mo3805J() {
        C27510b[] c27510bArr;
        InterfaceC35858Sd6<?> interfaceC35858Sd6 = AbstractC28986u1.f111479d;
        for (C27510b c27510b : this.f104751f) {
            interfaceC35858Sd6 = interfaceC35858Sd6.mo11077j(c27510b.f104753b.mo11089G().mo11083d(c27510b.f104754c).mo11084c(c27510b.f104755d));
        }
        return (AbstractC28986u1) interfaceC35858Sd6;
    }

    /* renamed from: M */
    public final int m18105M() {
        return Objects.hash(C27511c.m18083f(this.f104751f));
    }

    /* renamed from: R */
    public InterfaceC35858Sd6<?> m18102R(int i) {
        return this.f104751f[i].m18089f();
    }

    /* renamed from: T */
    public int m18101T() {
        return this.f104751f.length;
    }

    /* renamed from: U */
    public int m18100U(int i) {
        return this.f104751f[i].m18091d();
    }

    /* renamed from: W */
    public int m18099W(int i) {
        return this.f104751f[i].m18090e();
    }

    @Override // p000.InterfaceC35726Rp0
    /* renamed from: b0 */
    public InterfaceC38077ae6 mo3804b0() {
        C27510b[] c27510bArr;
        InterfaceC38077ae6 interfaceC38077ae6 = AbstractC26779o0.f101189c;
        for (C27510b c27510b : this.f104751f) {
            if (c27510b.f104753b instanceof AbstractC28986u1) {
                InterfaceC38077ae6 mo3804b0 = ((AbstractC28986u1) c27510b.f104753b).mo3804b0();
                if (mo3804b0.mo22026D()) {
                    if (c27510b.f104755d == 1) {
                        int i = c27510b.f104754c;
                        if (i < 0) {
                            i = -i;
                            mo3804b0 = mo3804b0.mo22025b();
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            interfaceC38077ae6 = interfaceC38077ae6.mo22030c(mo3804b0);
                        }
                    } else {
                        throw new UnsupportedOperationException(c27510b.f104753b + " holds a base unit with fractional exponent");
                    }
                } else {
                    throw new UnsupportedOperationException(c27510b.f104753b + " is non-linear, cannot convert");
                }
            }
        }
        return interfaceC38077ae6;
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: d */
    public InterfaceC35858Sd6<?> mo11083d(int i) {
        return m18098Y(this, i);
    }

    @Override // p000.AbstractC28986u1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47276q74) {
            return C27511c.m18085d(this.f104751f, ((C47276q74) obj).f104751f);
        }
        return false;
    }

    public int hashCode() {
        return this.f104752g.m72540a().intValue();
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: l */
    public Map<InterfaceC35858Sd6<?>, Integer> mo3803l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < m18101T(); i++) {
            linkedHashMap.put(m18102R(i), Integer.valueOf(m18100U(i)));
        }
        return linkedHashMap;
    }

    public C47276q74(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
        super(interfaceC35858Sd6.mo11086a());
        this.f104752g = new C37573Zm2<>(new Supplier() { // from class: p74
            @Override // java.util.function.Supplier
            public final Object get() {
                int m18105M;
                m18105M = C47276q74.this.m18105M();
                return Integer.valueOf(m18105M);
            }
        });
        this.f104751f = ((C47276q74) interfaceC35858Sd6).f104751f;
    }

    public C47276q74(C27510b[] c27510bArr) {
        super(null);
        this.f104752g = new C37573Zm2<>(new Supplier() { // from class: p74
            @Override // java.util.function.Supplier
            public final Object get() {
                int m18105M;
                m18105M = C47276q74.this.m18105M();
                return Integer.valueOf(m18105M);
            }
        });
        this.f104751f = c27510bArr;
    }
}
