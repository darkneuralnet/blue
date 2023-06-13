package p000;
/* renamed from: zX5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52849zX5 {

    /* renamed from: a */
    public final C34970Oj0 f121497a;

    /* renamed from: b */
    public final C34034Kj0 f121498b;

    /* renamed from: c */
    public int f121499c;

    /* renamed from: d */
    public String f121500d;

    /* renamed from: e */
    public int f121501e;

    /* renamed from: f */
    public C31037a[] f121502f;

    /* renamed from: g */
    public int f121503g;

    /* renamed from: h */
    public O70 f121504h;

    /* renamed from: i */
    public int f121505i;

    /* renamed from: j */
    public O70 f121506j;

    /* renamed from: k */
    public int f121507k;

    /* renamed from: l */
    public C31037a[] f121508l;

    public C52849zX5(C34970Oj0 c34970Oj0) {
        this.f121497a = c34970Oj0;
        this.f121498b = null;
        this.f121502f = new C31037a[256];
        this.f121503g = 1;
        this.f121504h = new O70();
    }

    /* renamed from: U */
    public static int m1224U(int i, int i2) {
        return (i + i2) & Integer.MAX_VALUE;
    }

    /* renamed from: V */
    public static int m1223V(int i, long j) {
        return (i + ((int) j) + ((int) (j >>> 32))) & Integer.MAX_VALUE;
    }

    /* renamed from: W */
    public static int m1222W(int i, String str) {
        return (i + str.hashCode()) & Integer.MAX_VALUE;
    }

    /* renamed from: X */
    public static int m1221X(int i, String str, int i2) {
        return (i + str.hashCode() + i2) & Integer.MAX_VALUE;
    }

    /* renamed from: Y */
    public static int m1220Y(int i, String str, String str2) {
        return (i + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
    }

    /* renamed from: Z */
    public static int m1219Z(int i, String str, String str2, int i2) {
        return (i + (str.hashCode() * str2.hashCode() * (i2 + 1))) & Integer.MAX_VALUE;
    }

    /* renamed from: a0 */
    public static int m1217a0(int i, String str, String str2, String str3) {
        return (i + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
    }

    /* renamed from: b0 */
    public static int m1215b0(int i, String str, String str2, String str3, int i2) {
        return (i + (str.hashCode() * str2.hashCode() * str3.hashCode() * i2)) & Integer.MAX_VALUE;
    }

    /* renamed from: A */
    public final void m1244A(int i, String str, String str2) {
        m1218a(new C31037a(i, 12, str, str2, m1220Y(12, str, str2)));
    }

    /* renamed from: B */
    public AbstractC50477vX5 m1243B(String str) {
        return m1239F(20, str);
    }

    /* renamed from: C */
    public AbstractC50477vX5 m1242C(String str) {
        return m1239F(8, str);
    }

    /* renamed from: D */
    public int m1241D(String str) {
        int m1222W = m1222W(1, str);
        for (C31037a m1231N = m1231N(m1222W); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == 1 && m1231N.f121509h == m1222W && m1231N.f114230e.equals(str)) {
                return m1231N.f114226a;
            }
        }
        this.f121504h.m92892g(1).m92887l(str);
        int i = this.f121503g;
        this.f121503g = i + 1;
        return m1213c0(new C31037a(i, 1, str, m1222W)).f114226a;
    }

    /* renamed from: E */
    public final void m1240E(int i, String str) {
        m1218a(new C31037a(i, 1, str, m1222W(1, str)));
    }

    /* renamed from: F */
    public final AbstractC50477vX5 m1239F(int i, String str) {
        int m1222W = m1222W(i, str);
        for (C31037a m1231N = m1231N(m1222W); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == i && m1231N.f121509h == m1222W && m1231N.f114230e.equals(str)) {
                return m1231N;
            }
        }
        this.f121504h.m92894e(i, m1241D(str));
        int i2 = this.f121503g;
        this.f121503g = i2 + 1;
        return m1213c0(new C31037a(i2, i, str, m1222W));
    }

    /* renamed from: G */
    public final void m1238G(int i, int i2, String str) {
        m1218a(new C31037a(i, i2, str, m1222W(i2, str)));
    }

    /* renamed from: H */
    public int m1237H(int i, int i2) {
        long j;
        long j2;
        if (i < i2) {
            j = i;
            j2 = i2;
        } else {
            j = i2;
            j2 = i;
        }
        long j3 = j | (j2 << 32);
        int m1224U = m1224U(130, i + i2);
        for (C31037a m1231N = m1231N(m1224U); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == 130 && m1231N.f121509h == m1224U && m1231N.f114231f == j3) {
                return m1231N.f114232g;
            }
        }
        C31037a[] c31037aArr = this.f121508l;
        int m1236I = m1236I(this.f121497a.m91613r(c31037aArr[i].f114230e, c31037aArr[i2].f114230e));
        m1213c0(new C31037a(this.f121507k, 130, j3, m1224U)).f114232g = m1236I;
        return m1236I;
    }

    /* renamed from: I */
    public int m1236I(String str) {
        int m1222W = m1222W(128, str);
        for (C31037a m1231N = m1231N(m1222W); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == 128 && m1231N.f121509h == m1222W && m1231N.f114230e.equals(str)) {
                return m1231N.f114226a;
            }
        }
        return m1235J(new C31037a(this.f121507k, 128, str, m1222W));
    }

    /* renamed from: J */
    public final int m1235J(C31037a c31037a) {
        if (this.f121508l == null) {
            this.f121508l = new C31037a[16];
        }
        int i = this.f121507k;
        C31037a[] c31037aArr = this.f121508l;
        if (i == c31037aArr.length) {
            C31037a[] c31037aArr2 = new C31037a[c31037aArr.length * 2];
            System.arraycopy(c31037aArr, 0, c31037aArr2, 0, c31037aArr.length);
            this.f121508l = c31037aArr2;
        }
        C31037a[] c31037aArr3 = this.f121508l;
        int i2 = this.f121507k;
        this.f121507k = i2 + 1;
        c31037aArr3[i2] = c31037a;
        return m1213c0(c31037a).f114226a;
    }

    /* renamed from: K */
    public int m1234K(String str, int i) {
        int m1221X = m1221X(129, str, i);
        for (C31037a m1231N = m1231N(m1221X); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == 129 && m1231N.f121509h == m1221X && m1231N.f114231f == i && m1231N.f114230e.equals(str)) {
                return m1231N.f114226a;
            }
        }
        return m1235J(new C31037a(this.f121507k, 129, str, i, m1221X));
    }

    /* renamed from: L */
    public int m1233L() {
        if (this.f121506j != null) {
            m1241D("BootstrapMethods");
            return this.f121506j.f25908b + 8;
        }
        return 0;
    }

    /* renamed from: M */
    public final void m1232M(C34034Kj0 c34034Kj0, char[] cArr) {
        byte[] bArr = c34034Kj0.f20097c;
        int m98442e = c34034Kj0.m98442e();
        int m98450I = c34034Kj0.m98450I(m98442e - 2);
        while (true) {
            if (m98450I <= 0) {
                break;
            } else if ("BootstrapMethods".equals(c34034Kj0.m98451H(m98442e, cArr))) {
                this.f121505i = c34034Kj0.m98450I(m98442e + 6);
                break;
            } else {
                m98442e += c34034Kj0.m98427t(m98442e + 2) + 6;
                m98450I--;
            }
        }
        if (this.f121505i > 0) {
            int i = m98442e + 8;
            int m98427t = c34034Kj0.m98427t(m98442e + 2) - 2;
            O70 o70 = new O70(m98427t);
            this.f121506j = o70;
            o70.m92891h(bArr, i, m98427t);
            int i2 = i;
            for (int i3 = 0; i3 < this.f121505i; i3++) {
                int i4 = i2 - i;
                int m98450I2 = c34034Kj0.m98450I(i2);
                int i5 = i2 + 2;
                int m98450I3 = c34034Kj0.m98450I(i5);
                i2 = i5 + 2;
                int hashCode = c34034Kj0.m98432o(m98450I2, cArr).hashCode();
                while (true) {
                    int i6 = m98450I3 - 1;
                    if (m98450I3 > 0) {
                        int m98450I4 = c34034Kj0.m98450I(i2);
                        i2 += 2;
                        hashCode ^= c34034Kj0.m98432o(m98450I4, cArr).hashCode();
                        m98450I3 = i6;
                    }
                }
                m1218a(new C31037a(i3, 64, i4, hashCode & Integer.MAX_VALUE));
            }
        }
    }

    /* renamed from: N */
    public final C31037a m1231N(int i) {
        C31037a[] c31037aArr = this.f121502f;
        return c31037aArr[i % c31037aArr.length];
    }

    /* renamed from: O */
    public String m1230O() {
        return this.f121500d;
    }

    /* renamed from: P */
    public int m1229P() {
        return this.f121503g;
    }

    /* renamed from: Q */
    public int m1228Q() {
        return this.f121504h.f25908b;
    }

    /* renamed from: R */
    public int m1227R() {
        return this.f121499c;
    }

    /* renamed from: S */
    public C34034Kj0 m1226S() {
        return this.f121498b;
    }

    /* renamed from: T */
    public AbstractC50477vX5 m1225T(int i) {
        return this.f121508l[i];
    }

    /* renamed from: a */
    public final void m1218a(C31037a c31037a) {
        this.f121501e++;
        int i = c31037a.f121509h;
        C31037a[] c31037aArr = this.f121502f;
        int length = i % c31037aArr.length;
        c31037a.f121510i = c31037aArr[length];
        c31037aArr[length] = c31037a;
    }

    /* renamed from: b */
    public final AbstractC50477vX5 m1216b(int i, int i2, int i3) {
        byte[] bArr = this.f121506j.f25907a;
        for (C31037a m1231N = m1231N(i3); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == 64 && m1231N.f121509h == i3) {
                int i4 = (int) m1231N.f114231f;
                boolean z = false;
                int i5 = 0;
                while (true) {
                    if (i5 < i2) {
                        if (bArr[i + i5] != bArr[i4 + i5]) {
                            break;
                        }
                        i5++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    this.f121506j.f25908b = i;
                    return m1231N;
                }
            }
        }
        int i6 = this.f121505i;
        this.f121505i = i6 + 1;
        return m1213c0(new C31037a(i6, 64, i, i3));
    }

    /* renamed from: c */
    public AbstractC50477vX5 m1214c(GE1 ge1, Object... objArr) {
        O70 o70 = this.f121506j;
        if (o70 == null) {
            o70 = new O70();
            this.f121506j = o70;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = m1212d(objArr[i]).f114226a;
        }
        int i2 = o70.f25908b;
        o70.m92888k(m1192u(ge1.m105608d(), ge1.m105609c(), ge1.m105610b(), ge1.m105611a(), ge1.m105607e()).f114226a);
        o70.m92888k(length);
        for (int i3 = 0; i3 < length; i3++) {
            o70.m92888k(iArr[i3]);
        }
        int i4 = o70.f25908b - i2;
        int hashCode = ge1.hashCode();
        for (Object obj : objArr) {
            hashCode ^= obj.hashCode();
        }
        return m1216b(i2, i4, hashCode & Integer.MAX_VALUE);
    }

    /* renamed from: c0 */
    public final C31037a m1213c0(C31037a c31037a) {
        int i = this.f121501e;
        C31037a[] c31037aArr = this.f121502f;
        if (i > (c31037aArr.length * 3) / 4) {
            int length = c31037aArr.length;
            int i2 = (length * 2) + 1;
            C31037a[] c31037aArr2 = new C31037a[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C31037a c31037a2 = this.f121502f[i3];
                while (c31037a2 != null) {
                    int i4 = c31037a2.f121509h % i2;
                    C31037a c31037a3 = c31037a2.f121510i;
                    c31037a2.f121510i = c31037aArr2[i4];
                    c31037aArr2[i4] = c31037a2;
                    c31037a2 = c31037a3;
                }
            }
            this.f121502f = c31037aArr2;
        }
        this.f121501e++;
        int i5 = c31037a.f121509h;
        C31037a[] c31037aArr3 = this.f121502f;
        int length2 = i5 % c31037aArr3.length;
        c31037a.f121510i = c31037aArr3[length2];
        c31037aArr3[length2] = c31037a;
        return c31037a;
    }

    /* renamed from: d */
    public AbstractC50477vX5 m1212d(Object obj) {
        if (obj instanceof Integer) {
            return m1201l(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m1201l(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m1201l(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m1201l(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m1201l(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m1202k(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m1197p(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m1208f(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m1242C((String) obj);
        }
        if (obj instanceof C31628Ab6) {
            C31628Ab6 c31628Ab6 = (C31628Ab6) obj;
            int m115472l = c31628Ab6.m115472l();
            if (m115472l == 10) {
                return m1210e(c31628Ab6.m115478f());
            }
            if (m115472l == 11) {
                return m1190w(c31628Ab6.m115480d());
            }
            return m1210e(c31628Ab6.m115480d());
        } else if (obj instanceof GE1) {
            GE1 ge1 = (GE1) obj;
            return m1192u(ge1.m105608d(), ge1.m105609c(), ge1.m105610b(), ge1.m105611a(), ge1.m105607e());
        } else if (obj instanceof C35105Oy0) {
            C35105Oy0 c35105Oy0 = (C35105Oy0) obj;
            return m1206g(c35105Oy0.m91139d(), c35105Oy0.m91140c(), c35105Oy0.m91142a(), c35105Oy0.m91141b());
        } else {
            throw new IllegalArgumentException("value " + obj);
        }
    }

    /* renamed from: d0 */
    public void m1211d0(O70 o70) {
        if (this.f121506j != null) {
            O70 m92888k = o70.m92888k(m1241D("BootstrapMethods")).m92890i(this.f121506j.f25908b + 2).m92888k(this.f121505i);
            O70 o702 = this.f121506j;
            m92888k.m92891h(o702.f25907a, 0, o702.f25908b);
        }
    }

    /* renamed from: e */
    public AbstractC50477vX5 m1210e(String str) {
        return m1239F(7, str);
    }

    /* renamed from: e0 */
    public void m1209e0(O70 o70) {
        O70 m92888k = o70.m92888k(this.f121503g);
        O70 o702 = this.f121504h;
        m92888k.m92891h(o702.f25907a, 0, o702.f25908b);
    }

    /* renamed from: f */
    public AbstractC50477vX5 m1208f(double d) {
        return m1196q(6, Double.doubleToRawLongBits(d));
    }

    /* renamed from: f0 */
    public int m1207f0(int i, String str) {
        this.f121499c = i;
        this.f121500d = str;
        return m1210e(str).f114226a;
    }

    /* renamed from: g */
    public AbstractC50477vX5 m1206g(String str, String str2, GE1 ge1, Object... objArr) {
        return m1205h(17, str, str2, m1214c(ge1, objArr).f114226a);
    }

    /* renamed from: h */
    public final AbstractC50477vX5 m1205h(int i, String str, String str2, int i2) {
        int m1219Z = m1219Z(i, str, str2, i2);
        for (C31037a m1231N = m1231N(m1219Z); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == i && m1231N.f121509h == m1219Z && m1231N.f114231f == i2 && m1231N.f114229d.equals(str) && m1231N.f114230e.equals(str2)) {
                return m1231N;
            }
        }
        this.f121504h.m92893f(i, i2, m1187z(str, str2));
        int i3 = this.f121503g;
        this.f121503g = i3 + 1;
        return m1213c0(new C31037a(i3, i, null, str, str2, i2, m1219Z));
    }

    /* renamed from: i */
    public final void m1204i(int i, int i2, String str, String str2, int i3) {
        m1218a(new C31037a(i2, i, null, str, str2, i3, m1219Z(i, str, str2, i3)));
    }

    /* renamed from: j */
    public AbstractC50477vX5 m1203j(String str, String str2, String str3) {
        return m1194s(9, str, str2, str3);
    }

    /* renamed from: k */
    public AbstractC50477vX5 m1202k(float f) {
        return m1200m(4, Float.floatToRawIntBits(f));
    }

    /* renamed from: l */
    public AbstractC50477vX5 m1201l(int i) {
        return m1200m(3, i);
    }

    /* renamed from: m */
    public final AbstractC50477vX5 m1200m(int i, int i2) {
        int m1224U = m1224U(i, i2);
        for (C31037a m1231N = m1231N(m1224U); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == i && m1231N.f121509h == m1224U && m1231N.f114231f == i2) {
                return m1231N;
            }
        }
        this.f121504h.m92892g(i).m92890i(i2);
        int i3 = this.f121503g;
        this.f121503g = i3 + 1;
        return m1213c0(new C31037a(i3, i, i2, m1224U));
    }

    /* renamed from: n */
    public final void m1199n(int i, int i2, int i3) {
        m1218a(new C31037a(i, i2, i3, m1224U(i2, i3)));
    }

    /* renamed from: o */
    public AbstractC50477vX5 m1198o(String str, String str2, GE1 ge1, Object... objArr) {
        return m1205h(18, str, str2, m1214c(ge1, objArr).f114226a);
    }

    /* renamed from: p */
    public AbstractC50477vX5 m1197p(long j) {
        return m1196q(5, j);
    }

    /* renamed from: q */
    public final AbstractC50477vX5 m1196q(int i, long j) {
        int m1223V = m1223V(i, j);
        for (C31037a m1231N = m1231N(m1223V); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == i && m1231N.f121509h == m1223V && m1231N.f114231f == j) {
                return m1231N;
            }
        }
        int i2 = this.f121503g;
        this.f121504h.m92892g(i).m92889j(j);
        this.f121503g += 2;
        return m1213c0(new C31037a(i2, i, j, m1223V));
    }

    /* renamed from: r */
    public final void m1195r(int i, int i2, long j) {
        m1218a(new C31037a(i, i2, j, m1223V(i2, j)));
    }

    /* renamed from: s */
    public final C31037a m1194s(int i, String str, String str2, String str3) {
        int m1217a0 = m1217a0(i, str, str2, str3);
        for (C31037a m1231N = m1231N(m1217a0); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == i && m1231N.f121509h == m1217a0 && m1231N.f114228c.equals(str) && m1231N.f114229d.equals(str2) && m1231N.f114230e.equals(str3)) {
                return m1231N;
            }
        }
        this.f121504h.m92893f(i, m1210e(str).f114226a, m1187z(str2, str3));
        int i2 = this.f121503g;
        this.f121503g = i2 + 1;
        return m1213c0(new C31037a(i2, i, str, str2, str3, 0L, m1217a0));
    }

    /* renamed from: t */
    public final void m1193t(int i, int i2, String str, String str2, String str3) {
        m1218a(new C31037a(i, i2, str, str2, str3, 0L, m1217a0(i2, str, str2, str3)));
    }

    /* renamed from: u */
    public AbstractC50477vX5 m1192u(int i, String str, String str2, String str3, boolean z) {
        int m1215b0 = m1215b0(15, str, str2, str3, i);
        for (C31037a m1231N = m1231N(m1215b0); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == 15 && m1231N.f121509h == m1215b0 && m1231N.f114231f == i && m1231N.f114228c.equals(str) && m1231N.f114229d.equals(str2) && m1231N.f114230e.equals(str3)) {
                return m1231N;
            }
        }
        if (i <= 4) {
            this.f121504h.m92895d(15, i, m1203j(str, str2, str3).f114226a);
        } else {
            this.f121504h.m92895d(15, i, m1189x(str, str2, str3, z).f114226a);
        }
        int i2 = this.f121503g;
        this.f121503g = i2 + 1;
        return m1213c0(new C31037a(i2, 15, str, str2, str3, i, m1215b0));
    }

    /* renamed from: v */
    public final void m1191v(int i, int i2, String str, String str2, String str3) {
        m1218a(new C31037a(i, 15, str, str2, str3, i2, m1215b0(15, str, str2, str3, i2)));
    }

    /* renamed from: w */
    public AbstractC50477vX5 m1190w(String str) {
        return m1239F(16, str);
    }

    /* renamed from: x */
    public AbstractC50477vX5 m1189x(String str, String str2, String str3, boolean z) {
        return m1194s(z ? 11 : 10, str, str2, str3);
    }

    /* renamed from: y */
    public AbstractC50477vX5 m1188y(String str) {
        return m1239F(19, str);
    }

    /* renamed from: z */
    public int m1187z(String str, String str2) {
        int m1220Y = m1220Y(12, str, str2);
        for (C31037a m1231N = m1231N(m1220Y); m1231N != null; m1231N = m1231N.f121510i) {
            if (m1231N.f114227b == 12 && m1231N.f121509h == m1220Y && m1231N.f114229d.equals(str) && m1231N.f114230e.equals(str2)) {
                return m1231N.f114226a;
            }
        }
        this.f121504h.m92893f(12, m1241D(str), m1241D(str2));
        int i = this.f121503g;
        this.f121503g = i + 1;
        return m1213c0(new C31037a(i, 12, str, str2, m1220Y)).f114226a;
    }

    /* renamed from: zX5$a */
    /* loaded from: classes6.dex */
    public static class C31037a extends AbstractC50477vX5 {

        /* renamed from: h */
        public final int f121509h;

        /* renamed from: i */
        public C31037a f121510i;

        public C31037a(int i, int i2, String str, String str2, String str3, long j, int i3) {
            super(i, i2, str, str2, str3, j);
            this.f121509h = i3;
        }

        public C31037a(int i, int i2, String str, int i3) {
            super(i, i2, null, null, str, 0L);
            this.f121509h = i3;
        }

        public C31037a(int i, int i2, String str, long j, int i3) {
            super(i, i2, null, null, str, j);
            this.f121509h = i3;
        }

        public C31037a(int i, int i2, String str, String str2, int i3) {
            super(i, i2, null, str, str2, 0L);
            this.f121509h = i3;
        }

        public C31037a(int i, int i2, long j, int i3) {
            super(i, i2, null, null, null, j);
            this.f121509h = i3;
        }
    }

    public C52849zX5(C34970Oj0 c34970Oj0, C34034Kj0 c34034Kj0) {
        this.f121497a = c34970Oj0;
        this.f121498b = c34034Kj0;
        byte[] bArr = c34034Kj0.f20097c;
        int m98441f = c34034Kj0.m98441f(1) - 1;
        int i = c34034Kj0.f20096b - m98441f;
        this.f121503g = c34034Kj0.m98440g();
        O70 o70 = new O70(i);
        this.f121504h = o70;
        o70.m92891h(bArr, m98441f, i);
        this.f121502f = new C31037a[this.f121503g * 2];
        char[] cArr = new char[c34034Kj0.m98439h()];
        boolean z = false;
        int i2 = 1;
        while (i2 < this.f121503g) {
            int m98441f2 = c34034Kj0.m98441f(i2);
            byte b = bArr[m98441f2 - 1];
            switch (b) {
                case 1:
                    m1240E(i2, c34034Kj0.m98448K(i2, cArr));
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    m1199n(i2, b, c34034Kj0.m98427t(m98441f2));
                    break;
                case 5:
                case 6:
                    m1195r(i2, b, c34034Kj0.m98425v(m98441f2));
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    m1238G(i2, b, c34034Kj0.m98451H(m98441f2, cArr));
                    break;
                case 9:
                case 10:
                case 11:
                    int m98441f3 = c34034Kj0.m98441f(c34034Kj0.m98450I(m98441f2 + 2));
                    m1193t(i2, b, c34034Kj0.m98434m(m98441f2, cArr), c34034Kj0.m98451H(m98441f3, cArr), c34034Kj0.m98451H(m98441f3 + 2, cArr));
                    break;
                case 12:
                    m1244A(i2, c34034Kj0.m98451H(m98441f2, cArr), c34034Kj0.m98451H(m98441f2 + 2, cArr));
                    break;
                case 15:
                    int m98441f4 = c34034Kj0.m98441f(c34034Kj0.m98450I(m98441f2 + 1));
                    int m98441f5 = c34034Kj0.m98441f(c34034Kj0.m98450I(m98441f4 + 2));
                    m1191v(i2, c34034Kj0.m98435l(m98441f2), c34034Kj0.m98434m(m98441f4, cArr), c34034Kj0.m98451H(m98441f5, cArr), c34034Kj0.m98451H(m98441f5 + 2, cArr));
                    break;
                case 17:
                case 18:
                    int m98441f6 = c34034Kj0.m98441f(c34034Kj0.m98450I(m98441f2 + 2));
                    m1204i(b, i2, c34034Kj0.m98451H(m98441f6, cArr), c34034Kj0.m98451H(m98441f6 + 2, cArr), c34034Kj0.m98450I(m98441f2));
                    z = true;
                    break;
            }
            i2 += (b == 5 || b == 6) ? 2 : 1;
        }
        if (z) {
            m1232M(c34034Kj0, cArr);
        }
    }
}
