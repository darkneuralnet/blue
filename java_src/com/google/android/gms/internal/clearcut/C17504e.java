package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* renamed from: com.google.android.gms.internal.clearcut.e */
/* loaded from: classes5.dex */
public final class C17504e<T> implements InterfaceC51439x88<T> {

    /* renamed from: s */
    public static final Unsafe f70417s = C35410Qf8.m88220z();

    /* renamed from: a */
    public final int[] f70418a;

    /* renamed from: b */
    public final Object[] f70419b;

    /* renamed from: c */
    public final int f70420c;

    /* renamed from: d */
    public final int f70421d;

    /* renamed from: e */
    public final int f70422e;

    /* renamed from: f */
    public final H28 f70423f;

    /* renamed from: g */
    public final boolean f70424g;

    /* renamed from: h */
    public final boolean f70425h;

    /* renamed from: i */
    public final boolean f70426i;

    /* renamed from: j */
    public final boolean f70427j;

    /* renamed from: k */
    public final int[] f70428k;

    /* renamed from: l */
    public final int[] f70429l;

    /* renamed from: m */
    public final int[] f70430m;

    /* renamed from: n */
    public final T48 f70431n;

    /* renamed from: o */
    public final AbstractC44551lX7 f70432o;

    /* renamed from: p */
    public final AbstractC32584Ed8<?, ?> f70433p;

    /* renamed from: q */
    public final LN7<?> f70434q;

    /* renamed from: r */
    public final InterfaceC46034o18 f70435r;

    public C17504e(int[] iArr, Object[] objArr, int i, int i2, int i3, H28 h28, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, T48 t48, AbstractC44551lX7 abstractC44551lX7, AbstractC32584Ed8<?, ?> abstractC32584Ed8, LN7<?> ln7, InterfaceC46034o18 interfaceC46034o18) {
        this.f70418a = iArr;
        this.f70419b = objArr;
        this.f70420c = i;
        this.f70421d = i2;
        this.f70422e = i3;
        this.f70425h = h28 instanceof AbstractC17497c;
        this.f70426i = z;
        this.f70424g = ln7 != null && ln7.mo51566g(h28);
        this.f70427j = false;
        this.f70428k = iArr2;
        this.f70429l = iArr3;
        this.f70430m = iArr4;
        this.f70431n = t48;
        this.f70432o = abstractC44551lX7;
        this.f70433p = abstractC32584Ed8;
        this.f70434q = ln7;
        this.f70423f = h28;
        this.f70435r = interfaceC46034o18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m51534A(Object obj, int i, InterfaceC51439x88 interfaceC51439x88) {
        return interfaceC51439x88.mo5807g(C35410Qf8.m88254M(obj, i & 1048575));
    }

    /* renamed from: M */
    public static <E> List<E> m51522M(Object obj, long j) {
        return (List) C35410Qf8.m88254M(obj, j);
    }

    /* renamed from: N */
    public static <T> double m51521N(T t, long j) {
        return ((Double) C35410Qf8.m88254M(t, j)).doubleValue();
    }

    /* renamed from: O */
    public static <T> float m51520O(T t, long j) {
        return ((Float) C35410Qf8.m88254M(t, j)).floatValue();
    }

    /* renamed from: P */
    public static <T> int m51519P(T t, long j) {
        return ((Integer) C35410Qf8.m88254M(t, j)).intValue();
    }

    /* renamed from: Q */
    public static <T> long m51518Q(T t, long j) {
        return ((Long) C35410Qf8.m88254M(t, j)).longValue();
    }

    /* renamed from: R */
    public static <T> boolean m51517R(T t, long j) {
        return ((Boolean) C35410Qf8.m88254M(t, j)).booleanValue();
    }

    /* renamed from: S */
    public static C35626Rd8 m51516S(Object obj) {
        AbstractC17497c abstractC17497c = (AbstractC17497c) obj;
        C35626Rd8 c35626Rd8 = abstractC17497c.zzjp;
        if (c35626Rd8 == C35626Rd8.m86522h()) {
            C35626Rd8 m86521i = C35626Rd8.m86521i();
            abstractC17497c.zzjp = m86521i;
            return m86521i;
        }
        return c35626Rd8;
    }

    /* renamed from: i */
    public static int m51515i(int i, byte[] bArr, int i2, int i3, Object obj, C40786fA7 c40786fA7) throws IOException {
        return C52535yz7.m2139c(i, bArr, i2, i3, m51516S(obj), c40786fA7);
    }

    /* renamed from: n */
    public static int m51510n(InterfaceC51439x88<?> interfaceC51439x88, int i, byte[] bArr, int i2, int i3, InterfaceC47489qU7<?> interfaceC47489qU7, C40786fA7 c40786fA7) throws IOException {
        int m51508p = m51508p(interfaceC51439x88, bArr, i2, i3, c40786fA7);
        while (true) {
            interfaceC47489qU7.add(c40786fA7.f79637c);
            if (m51508p >= i3) {
                break;
            }
            int m2137e = C52535yz7.m2137e(bArr, m51508p, c40786fA7);
            if (i != c40786fA7.f79635a) {
                break;
            }
            m51508p = m51508p(interfaceC51439x88, bArr, m2137e, i3, c40786fA7);
        }
        return m51508p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static int m51509o(InterfaceC51439x88 interfaceC51439x88, byte[] bArr, int i, int i2, int i3, C40786fA7 c40786fA7) throws IOException {
        C17504e c17504e = (C17504e) interfaceC51439x88;
        Object mo5810d = c17504e.mo5810d();
        int m51511m = c17504e.m51511m(mo5810d, bArr, i, i2, i3, c40786fA7);
        c17504e.zzc(mo5810d);
        c40786fA7.f79637c = mo5810d;
        return m51511m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static int m51508p(InterfaceC51439x88 interfaceC51439x88, byte[] bArr, int i, int i2, C40786fA7 c40786fA7) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = C52535yz7.m2138d(i4, bArr, i3, c40786fA7);
            i4 = c40786fA7.f79635a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzco.m51357a();
        }
        Object mo5810d = interfaceC51439x88.mo5810d();
        int i6 = i4 + i5;
        interfaceC51439x88.mo5813a(mo5810d, bArr, i5, i6, c40786fA7);
        interfaceC51439x88.zzc(mo5810d);
        c40786fA7.f79637c = mo5810d;
        return i6;
    }

    /* renamed from: q */
    public static <UT, UB> int m51507q(AbstractC32584Ed8<UT, UB> abstractC32584Ed8, T t) {
        return abstractC32584Ed8.mo51486j(abstractC32584Ed8.mo51485k(t));
    }

    /* renamed from: r */
    public static <T> C17504e<T> m51506r(Class<T> cls, InterfaceC40114e28 interfaceC40114e28, T48 t48, AbstractC44551lX7 abstractC44551lX7, AbstractC32584Ed8<?, ?> abstractC32584Ed8, LN7<?> ln7, InterfaceC46034o18 interfaceC46034o18) {
        int m112757k;
        int i;
        int i2;
        int m88244b;
        int i3;
        int i4;
        if (!(interfaceC40114e28 instanceof C78)) {
            ((C46971pc8) interfaceC40114e28).mo19060a();
            throw new NoSuchMethodError();
        }
        C78 c78 = (C78) interfaceC40114e28;
        boolean z = c78.mo19060a() == AbstractC17497c.C17502e.f70412j;
        if (c78.m112764d() == 0) {
            m112757k = 0;
            i = 0;
            i2 = 0;
        } else {
            int m112762f = c78.m112762f();
            int m112761g = c78.m112761g();
            m112757k = c78.m112757k();
            i = m112762f;
            i2 = m112761g;
        }
        int[] iArr = new int[m112757k << 2];
        Object[] objArr = new Object[m112757k << 1];
        int[] iArr2 = c78.m112760h() > 0 ? new int[c78.m112760h()] : null;
        int[] iArr3 = c78.m112759i() > 0 ? new int[c78.m112759i()] : null;
        S78 m112763e = c78.m112763e();
        if (m112763e.m85958a()) {
            int m85952g = m112763e.m85952g();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (m85952g >= c78.m112756l() || i5 >= ((m85952g - i) << 2)) {
                    if (m112763e.m85948k()) {
                        m88244b = (int) C35410Qf8.m88244b(m112763e.m85947l());
                        i3 = (int) C35410Qf8.m88244b(m112763e.m85946m());
                        i4 = 0;
                    } else {
                        m88244b = (int) C35410Qf8.m88244b(m112763e.m85945n());
                        if (m112763e.m85944o()) {
                            i3 = (int) C35410Qf8.m88244b(m112763e.m85943p());
                            i4 = m112763e.m85942q();
                        } else {
                            i3 = 0;
                            i4 = 0;
                        }
                    }
                    iArr[i5] = m112763e.m85952g();
                    int i8 = i5 + 1;
                    iArr[i8] = (m112763e.m85940s() ? 536870912 : 0) | (m112763e.m85941r() ? 268435456 : 0) | (m112763e.m85951h() << 20) | m88244b;
                    iArr[i5 + 2] = i3 | (i4 << 20);
                    if (m112763e.m85937v() != null) {
                        int i9 = (i5 / 4) << 1;
                        objArr[i9] = m112763e.m85937v();
                        if (m112763e.m85939t() != null) {
                            objArr[i9 + 1] = m112763e.m85939t();
                        } else if (m112763e.m85938u() != null) {
                            objArr[i9 + 1] = m112763e.m85938u();
                        }
                    } else if (m112763e.m85939t() != null) {
                        objArr[((i5 / 4) << 1) + 1] = m112763e.m85939t();
                    } else if (m112763e.m85938u() != null) {
                        objArr[((i5 / 4) << 1) + 1] = m112763e.m85938u();
                    }
                    int m85951h = m112763e.m85951h();
                    if (m85951h == XQ7.f43209y0.ordinal()) {
                        iArr2[i6] = i5;
                        i6++;
                    } else if (m85951h >= 18 && m85951h <= 49) {
                        iArr3[i7] = iArr[i8] & 1048575;
                        i7++;
                    }
                    if (!m112763e.m85958a()) {
                        break;
                    }
                    m85952g = m112763e.m85952g();
                } else {
                    for (int i10 = 0; i10 < 4; i10++) {
                        iArr[i5 + i10] = -1;
                    }
                }
                i5 += 4;
            }
        }
        return new C17504e<>(iArr, objArr, i, i2, c78.m112756l(), c78.mo19058c(), z, false, c78.m112758j(), iArr2, iArr3, t48, abstractC44551lX7, abstractC32584Ed8, ln7, interfaceC46034o18);
    }

    /* renamed from: t */
    public static void m51504t(int i, Object obj, InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        if (obj instanceof String) {
            interfaceC35212Pj8.mo34096D(i, (String) obj);
        } else {
            interfaceC35212Pj8.mo34086N(i, (TD7) obj);
        }
    }

    /* renamed from: v */
    public static <UT, UB> void m51502v(AbstractC32584Ed8<UT, UB> abstractC32584Ed8, T t, InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        abstractC32584Ed8.mo51493c(abstractC32584Ed8.mo51485k(t), interfaceC35212Pj8);
    }

    /* renamed from: B */
    public final InterfaceC51439x88 m51533B(int i) {
        int i2 = (i / 4) << 1;
        InterfaceC51439x88 interfaceC51439x88 = (InterfaceC51439x88) this.f70419b[i2];
        if (interfaceC51439x88 != null) {
            return interfaceC51439x88;
        }
        InterfaceC51439x88<T> m75692b = Y68.m75693a().m75692b((Class) this.f70419b[i2 + 1]);
        this.f70419b[i2] = m75692b;
        return m75692b;
    }

    /* renamed from: C */
    public final Object m51532C(int i) {
        return this.f70419b[(i / 4) << 1];
    }

    /* renamed from: D */
    public final DT7<?> m51531D(int i) {
        return (DT7) this.f70419b[((i / 4) << 1) + 1];
    }

    /* renamed from: E */
    public final int m51530E(int i) {
        return this.f70418a[i + 1];
    }

    /* renamed from: F */
    public final int m51529F(int i) {
        return this.f70418a[i + 2];
    }

    /* renamed from: G */
    public final int m51528G(int i) {
        int i2 = this.f70420c;
        if (i >= i2) {
            int i3 = this.f70422e;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.f70418a[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.f70421d) {
                int i5 = i3 - i2;
                int length = (this.f70418a.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.f70418a[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: H */
    public final void m51527H(T t, int i) {
        if (this.f70426i) {
            return;
        }
        int m51529F = m51529F(i);
        long j = m51529F & 1048575;
        C35410Qf8.m88239g(t, j, C35410Qf8.m88259H(t, j) | (1 << (m51529F >>> 20)));
    }

    /* renamed from: I */
    public final void m51526I(T t, int i, int i2) {
        C35410Qf8.m88239g(t, m51529F(i2) & 1048575, i);
    }

    /* renamed from: J */
    public final void m51525J(T t, T t2, int i) {
        int m51530E = m51530E(i);
        int i2 = this.f70418a[i];
        long j = m51530E & 1048575;
        if (m51499y(t2, i2, i)) {
            Object m88254M = C35410Qf8.m88254M(t, j);
            Object m88254M2 = C35410Qf8.m88254M(t2, j);
            if (m88254M != null && m88254M2 != null) {
                C35410Qf8.m88237i(t, j, C37975aT7.m71329d(m88254M, m88254M2));
                m51526I(t, i2, i);
            } else if (m88254M2 != null) {
                C35410Qf8.m88237i(t, j, m88254M2);
                m51526I(t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x048a  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m51524K(T t, InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int i2;
        boolean z;
        if (this.f70424g) {
            TO7<?> mo51571b = this.f70434q.mo51571b(t);
            if (!mo51571b.m83695b()) {
                it = mo51571b.m83692e();
                entry = it.next();
                length = this.f70418a.length;
                Unsafe unsafe = f70417s;
                int i3 = -1;
                int i4 = 0;
                for (i = 0; i < length; i += 4) {
                    int m51530E = m51530E(i);
                    int[] iArr = this.f70418a;
                    int i5 = iArr[i];
                    int i6 = (267386880 & m51530E) >>> 20;
                    if (this.f70426i || i6 > 17) {
                        i2 = 0;
                    } else {
                        int i7 = iArr[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i3) {
                            i4 = unsafe.getInt(t, i8);
                            i3 = i8;
                        }
                        i2 = 1 << (i7 >>> 20);
                    }
                    while (entry != null && this.f70434q.mo51572a(entry) <= i5) {
                        this.f70434q.mo51569d(interfaceC35212Pj8, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    long j = m51530E & 1048575;
                    switch (i6) {
                        case 0:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34057z(i5, C35410Qf8.m88255L(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34098A(i5, C35410Qf8.m88256K(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34088L(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34058y(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34060w(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34074i(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34072k(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34077f(i5, C35410Qf8.m88257J(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                m51504t(i5, unsafe.getObject(t, j), interfaceC35212Pj8);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34091I(i5, unsafe.getObject(t, j), m51533B(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34086N(i5, (TD7) unsafe.getObject(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34071l(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34095E(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34087M(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34097C(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34070m(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34075h(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                interfaceC35212Pj8.mo34084P(i5, unsafe.getObject(t, j), m51533B(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C38981c98.m61838f(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 19:
                            C38981c98.m61831m(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 20:
                            C38981c98.m61826r(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 21:
                            C38981c98.m61820x(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 22:
                            C38981c98.m61862M(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 23:
                            C38981c98.m61867H(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 24:
                            C38981c98.m61857R(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 25:
                            C38981c98.m61854U(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 26:
                            C38981c98.m61842d(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8);
                            break;
                        case 27:
                            C38981c98.m61840e(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, m51533B(i));
                            break;
                        case 28:
                            C38981c98.m61833k(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8);
                            break;
                        case 29:
                            z = false;
                            C38981c98.m61860O(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 30:
                            z = false;
                            C38981c98.m61855T(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 31:
                            z = false;
                            C38981c98.m61856S(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 32:
                            z = false;
                            C38981c98.m61864K(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 33:
                            z = false;
                            C38981c98.m61858Q(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 34:
                            z = false;
                            C38981c98.m61869F(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, false);
                            break;
                        case 35:
                            C38981c98.m61838f(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 36:
                            C38981c98.m61831m(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 37:
                            C38981c98.m61826r(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 38:
                            C38981c98.m61820x(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 39:
                            C38981c98.m61862M(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 40:
                            C38981c98.m61867H(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 41:
                            C38981c98.m61857R(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 42:
                            C38981c98.m61854U(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 43:
                            C38981c98.m61860O(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 44:
                            C38981c98.m61855T(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 45:
                            C38981c98.m61856S(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 46:
                            C38981c98.m61864K(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 47:
                            C38981c98.m61858Q(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 48:
                            C38981c98.m61869F(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, true);
                            break;
                        case 49:
                            C38981c98.m61832l(this.f70418a[i], (List) unsafe.getObject(t, j), interfaceC35212Pj8, m51533B(i));
                            break;
                        case 50:
                            m51501w(interfaceC35212Pj8, i5, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34057z(i5, m51521N(t, j));
                            }
                            break;
                        case 52:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34098A(i5, m51520O(t, j));
                            }
                            break;
                        case 53:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34088L(i5, m51518Q(t, j));
                            }
                            break;
                        case 54:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34058y(i5, m51518Q(t, j));
                            }
                            break;
                        case 55:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34060w(i5, m51519P(t, j));
                            }
                            break;
                        case 56:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34074i(i5, m51518Q(t, j));
                            }
                            break;
                        case 57:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34072k(i5, m51519P(t, j));
                            }
                            break;
                        case 58:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34077f(i5, m51517R(t, j));
                            }
                            break;
                        case 59:
                            if (m51499y(t, i5, i)) {
                                m51504t(i5, unsafe.getObject(t, j), interfaceC35212Pj8);
                            }
                            break;
                        case 60:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34091I(i5, unsafe.getObject(t, j), m51533B(i));
                            }
                            break;
                        case 61:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34086N(i5, (TD7) unsafe.getObject(t, j));
                            }
                            break;
                        case 62:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34071l(i5, m51519P(t, j));
                            }
                            break;
                        case 63:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34095E(i5, m51519P(t, j));
                            }
                            break;
                        case 64:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34087M(i5, m51519P(t, j));
                            }
                            break;
                        case 65:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34097C(i5, m51518Q(t, j));
                            }
                            break;
                        case 66:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34070m(i5, m51519P(t, j));
                            }
                            break;
                        case 67:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34075h(i5, m51518Q(t, j));
                            }
                            break;
                        case 68:
                            if (m51499y(t, i5, i)) {
                                interfaceC35212Pj8.mo34084P(i5, unsafe.getObject(t, j), m51533B(i));
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.f70434q.mo51569d(interfaceC35212Pj8, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
                m51502v(this.f70433p, t, interfaceC35212Pj8);
            }
        }
        it = null;
        entry = null;
        length = this.f70418a.length;
        Unsafe unsafe2 = f70417s;
        int i32 = -1;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        m51502v(this.f70433p, t, interfaceC35212Pj8);
    }

    /* renamed from: L */
    public final boolean m51523L(T t, T t2, int i) {
        return m51500x(t, i) == m51500x(t2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    @Override // p000.InterfaceC51439x88
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5813a(T t, byte[] bArr, int i, int i2, C40786fA7 c40786fA7) throws IOException {
        byte b;
        int i3;
        Unsafe unsafe;
        int i4;
        int m2135g;
        long j;
        Object m71329d;
        int i5;
        C17504e<T> c17504e = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i6 = i2;
        C40786fA7 c40786fA72 = c40786fA7;
        if (!c17504e.f70426i) {
            m51511m(t, bArr, i, i2, 0, c40786fA7);
            return;
        }
        Unsafe unsafe2 = f70417s;
        int i7 = i;
        while (i7 < i6) {
            int i8 = i7 + 1;
            byte b2 = bArr2[i7];
            if (b2 < 0) {
                i3 = C52535yz7.m2138d(b2, bArr2, i8, c40786fA72);
                b = c40786fA72.f79635a;
            } else {
                b = b2;
                i3 = i8;
            }
            int i9 = b >>> 3;
            int i10 = b & 7;
            int m51528G = c17504e.m51528G(i9);
            if (m51528G >= 0) {
                int i11 = c17504e.f70418a[m51528G + 1];
                int i12 = (267386880 & i11) >>> 20;
                long j2 = 1048575 & i11;
                if (i12 <= 17) {
                    switch (i12) {
                        case 0:
                            if (i10 != 1) {
                                break;
                            } else {
                                C35410Qf8.m88241e(t2, j2, C52535yz7.m2130l(bArr2, i3));
                                i7 = i3 + 8;
                                break;
                            }
                        case 1:
                            if (i10 != 5) {
                                break;
                            } else {
                                C35410Qf8.m88240f(t2, j2, C52535yz7.m2128n(bArr2, i3));
                                i7 = i3 + 4;
                                break;
                            }
                        case 2:
                        case 3:
                            if (i10 != 0) {
                                break;
                            } else {
                                m2135g = C52535yz7.m2135g(bArr2, i3, c40786fA72);
                                j = c40786fA72.f79636b;
                                unsafe2.putLong(t, j2, j);
                                i7 = m2135g;
                                break;
                            }
                        case 4:
                        case 11:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = C52535yz7.m2137e(bArr2, i3, c40786fA72);
                                i5 = c40786fA72.f79635a;
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 5:
                        case 14:
                            if (i10 != 1) {
                                break;
                            } else {
                                unsafe2.putLong(t, j2, C52535yz7.m2131k(bArr2, i3));
                                i7 = i3 + 8;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i10 != 5) {
                                break;
                            } else {
                                unsafe2.putInt(t2, j2, C52535yz7.m2134h(bArr2, i3));
                                i7 = i3 + 4;
                                break;
                            }
                        case 7:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = C52535yz7.m2135g(bArr2, i3, c40786fA72);
                                C35410Qf8.m88236j(t2, j2, c40786fA72.f79636b != 0);
                                break;
                            }
                        case 8:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = (536870912 & i11) == 0 ? C52535yz7.m2133i(bArr2, i3, c40786fA72) : C52535yz7.m2132j(bArr2, i3, c40786fA72);
                                m71329d = c40786fA72.f79637c;
                                unsafe2.putObject(t2, j2, m71329d);
                                break;
                            }
                        case 9:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = m51508p(c17504e.m51533B(m51528G), bArr2, i3, i6, c40786fA72);
                                Object object = unsafe2.getObject(t2, j2);
                                if (object != null) {
                                    m71329d = C37975aT7.m71329d(object, c40786fA72.f79637c);
                                    unsafe2.putObject(t2, j2, m71329d);
                                    break;
                                }
                                m71329d = c40786fA72.f79637c;
                                unsafe2.putObject(t2, j2, m71329d);
                            }
                        case 10:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = C52535yz7.m2129m(bArr2, i3, c40786fA72);
                                m71329d = c40786fA72.f79637c;
                                unsafe2.putObject(t2, j2, m71329d);
                                break;
                            }
                        case 12:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = C52535yz7.m2137e(bArr2, i3, c40786fA72);
                                i5 = c40786fA72.f79635a;
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 15:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = C52535yz7.m2137e(bArr2, i3, c40786fA72);
                                i5 = HK7.m103989e(c40786fA72.f79635a);
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 16:
                            if (i10 != 0) {
                                break;
                            } else {
                                m2135g = C52535yz7.m2135g(bArr2, i3, c40786fA72);
                                j = HK7.m103991a(c40786fA72.f79636b);
                                unsafe2.putLong(t, j2, j);
                                i7 = m2135g;
                                break;
                            }
                    }
                } else if (i12 != 27) {
                    if (i12 <= 49) {
                        unsafe = unsafe2;
                        int i13 = i3;
                        i7 = m51513k(t, bArr, i3, i2, b, i9, i10, m51528G, i11, i12, j2, c40786fA7);
                    } else {
                        unsafe = unsafe2;
                        i4 = i3;
                        if (i12 != 50) {
                            i7 = m51514j(t, bArr, i4, i2, b, i9, i10, i11, i12, j2, m51528G, c40786fA7);
                        } else if (i10 == 2) {
                            i7 = m51512l(t, bArr, i4, i2, m51528G, i9, j2, c40786fA7);
                        }
                    }
                    c17504e = this;
                    t2 = t;
                    bArr2 = bArr;
                    i6 = i2;
                    c40786fA72 = c40786fA7;
                    unsafe2 = unsafe;
                } else if (i10 == 2) {
                    InterfaceC47489qU7 interfaceC47489qU7 = (InterfaceC47489qU7) unsafe2.getObject(t2, j2);
                    if (!interfaceC47489qU7.mo17485i()) {
                        int size = interfaceC47489qU7.size();
                        interfaceC47489qU7 = interfaceC47489qU7.mo1502n(size == 0 ? 10 : size << 1);
                        unsafe2.putObject(t2, j2, interfaceC47489qU7);
                    }
                    i7 = m51510n(c17504e.m51533B(m51528G), b, bArr, i3, i2, interfaceC47489qU7, c40786fA7);
                }
                int i14 = i4;
                i7 = m51515i(b, bArr, i14, i2, t, c40786fA7);
                c17504e = this;
                t2 = t;
                bArr2 = bArr;
                i6 = i2;
                c40786fA72 = c40786fA7;
                unsafe2 = unsafe;
            }
            unsafe = unsafe2;
            i4 = i3;
            int i142 = i4;
            i7 = m51515i(b, bArr, i142, i2, t, c40786fA7);
            c17504e = this;
            t2 = t;
            bArr2 = bArr;
            i6 = i2;
            c40786fA72 = c40786fA7;
            unsafe2 = unsafe;
        }
        if (i7 != i6) {
            throw zzco.m51354d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
        if (p000.C35410Qf8.m88258I(r10, r6) == p000.C35410Qf8.m88258I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p000.C38981c98.m61819y(p000.C35410Qf8.m88254M(r10, r6), p000.C35410Qf8.m88254M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (p000.C38981c98.m61819y(p000.C35410Qf8.m88254M(r10, r6), p000.C35410Qf8.m88254M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (p000.C35410Qf8.m88258I(r10, r6) == p000.C35410Qf8.m88258I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (p000.C35410Qf8.m88259H(r10, r6) == p000.C35410Qf8.m88259H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (p000.C35410Qf8.m88258I(r10, r6) == p000.C35410Qf8.m88258I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        if (p000.C35410Qf8.m88259H(r10, r6) == p000.C35410Qf8.m88259H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (p000.C35410Qf8.m88259H(r10, r6) == p000.C35410Qf8.m88259H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (p000.C35410Qf8.m88259H(r10, r6) == p000.C35410Qf8.m88259H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (p000.C38981c98.m61819y(p000.C35410Qf8.m88254M(r10, r6), p000.C35410Qf8.m88254M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (p000.C38981c98.m61819y(p000.C35410Qf8.m88254M(r10, r6), p000.C35410Qf8.m88254M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (p000.C38981c98.m61819y(p000.C35410Qf8.m88254M(r10, r6), p000.C35410Qf8.m88254M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
        if (p000.C35410Qf8.m88257J(r10, r6) == p000.C35410Qf8.m88257J(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
        if (p000.C35410Qf8.m88259H(r10, r6) == p000.C35410Qf8.m88259H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0145, code lost:
        if (p000.C35410Qf8.m88258I(r10, r6) == p000.C35410Qf8.m88258I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0156, code lost:
        if (p000.C35410Qf8.m88259H(r10, r6) == p000.C35410Qf8.m88259H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
        if (p000.C35410Qf8.m88258I(r10, r6) == p000.C35410Qf8.m88258I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017c, code lost:
        if (p000.C35410Qf8.m88258I(r10, r6) == p000.C35410Qf8.m88258I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
        if (p000.C35410Qf8.m88259H(r10, r6) == p000.C35410Qf8.m88259H(r11, r6)) goto L84;
     */
    @Override // p000.InterfaceC51439x88
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo5812b(T t, T t2) {
        int length = this.f70418a.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                if (this.f70433p.mo51485k(t).equals(this.f70433p.mo51485k(t2))) {
                    if (this.f70424g) {
                        return this.f70434q.mo51571b(t).equals(this.f70434q.mo51571b(t2));
                    }
                    return true;
                }
                return false;
            }
            int m51530E = m51530E(i);
            long j = m51530E & 1048575;
            switch ((m51530E & 267386880) >>> 20) {
                case 0:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 1:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 2:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 3:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 4:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 5:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 6:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 16:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (m51523L(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    z = C38981c98.m61819y(C35410Qf8.m88254M(t, j), C35410Qf8.m88254M(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long m51529F = m51529F(i) & 1048575;
                    if (C35410Qf8.m88259H(t, m51529F) == C35410Qf8.m88259H(t2, m51529F)) {
                        break;
                    }
                    z = false;
                    break;
            }
            if (!z) {
                return false;
            }
            i += 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0976  */
    @Override // p000.InterfaceC51439x88
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5811c(T t, InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        double m88255L;
        float m88256K;
        long m88258I;
        long m88258I2;
        int m88259H;
        long m88258I3;
        int m88259H2;
        boolean m88257J;
        int m88259H3;
        int m88259H4;
        int m88259H5;
        long m88258I4;
        int m88259H6;
        long m88258I5;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, Object> entry2;
        int length2;
        double m88255L2;
        float m88256K2;
        long m88258I6;
        long m88258I7;
        int m88259H7;
        long m88258I8;
        int m88259H8;
        boolean m88257J2;
        int m88259H9;
        int m88259H10;
        int m88259H11;
        long m88258I9;
        int m88259H12;
        long m88258I10;
        if (interfaceC35212Pj8.mo34085O() == AbstractC17497c.C17502e.f70415m) {
            m51502v(this.f70433p, t, interfaceC35212Pj8);
            if (this.f70424g) {
                TO7<?> mo51571b = this.f70434q.mo51571b(t);
                if (!mo51571b.m83695b()) {
                    it2 = mo51571b.m83696a();
                    entry2 = it2.next();
                    for (length2 = this.f70418a.length - 4; length2 >= 0; length2 -= 4) {
                        int m51530E = m51530E(length2);
                        int i2 = this.f70418a[length2];
                        while (entry2 != null && this.f70434q.mo51572a(entry2) > i2) {
                            this.f70434q.mo51569d(interfaceC35212Pj8, entry2);
                            entry2 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((m51530E & 267386880) >>> 20) {
                            case 0:
                                if (m51500x(t, length2)) {
                                    m88255L2 = C35410Qf8.m88255L(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34057z(i2, m88255L2);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (m51500x(t, length2)) {
                                    m88256K2 = C35410Qf8.m88256K(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34098A(i2, m88256K2);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (m51500x(t, length2)) {
                                    m88258I6 = C35410Qf8.m88258I(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34088L(i2, m88258I6);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (m51500x(t, length2)) {
                                    m88258I7 = C35410Qf8.m88258I(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34058y(i2, m88258I7);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (m51500x(t, length2)) {
                                    m88259H7 = C35410Qf8.m88259H(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34060w(i2, m88259H7);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (m51500x(t, length2)) {
                                    m88258I8 = C35410Qf8.m88258I(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34074i(i2, m88258I8);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (m51500x(t, length2)) {
                                    m88259H8 = C35410Qf8.m88259H(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34072k(i2, m88259H8);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (m51500x(t, length2)) {
                                    m88257J2 = C35410Qf8.m88257J(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34077f(i2, m88257J2);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!m51500x(t, length2)) {
                                    break;
                                }
                                m51504t(i2, C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8);
                                break;
                            case 9:
                                if (!m51500x(t, length2)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34091I(i2, C35410Qf8.m88254M(t, m51530E & 1048575), m51533B(length2));
                                break;
                            case 10:
                                if (!m51500x(t, length2)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34086N(i2, (TD7) C35410Qf8.m88254M(t, m51530E & 1048575));
                                break;
                            case 11:
                                if (m51500x(t, length2)) {
                                    m88259H9 = C35410Qf8.m88259H(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34071l(i2, m88259H9);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (m51500x(t, length2)) {
                                    m88259H10 = C35410Qf8.m88259H(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34095E(i2, m88259H10);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (m51500x(t, length2)) {
                                    m88259H11 = C35410Qf8.m88259H(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34087M(i2, m88259H11);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (m51500x(t, length2)) {
                                    m88258I9 = C35410Qf8.m88258I(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34097C(i2, m88258I9);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (m51500x(t, length2)) {
                                    m88259H12 = C35410Qf8.m88259H(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34070m(i2, m88259H12);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (m51500x(t, length2)) {
                                    m88258I10 = C35410Qf8.m88258I(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34075h(i2, m88258I10);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!m51500x(t, length2)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34084P(i2, C35410Qf8.m88254M(t, m51530E & 1048575), m51533B(length2));
                                break;
                            case 18:
                                C38981c98.m61838f(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 19:
                                C38981c98.m61831m(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 20:
                                C38981c98.m61826r(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 21:
                                C38981c98.m61820x(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 22:
                                C38981c98.m61862M(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 23:
                                C38981c98.m61867H(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 24:
                                C38981c98.m61857R(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 25:
                                C38981c98.m61854U(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 26:
                                C38981c98.m61842d(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8);
                                break;
                            case 27:
                                C38981c98.m61840e(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, m51533B(length2));
                                break;
                            case 28:
                                C38981c98.m61833k(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8);
                                break;
                            case 29:
                                C38981c98.m61860O(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 30:
                                C38981c98.m61855T(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 31:
                                C38981c98.m61856S(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 32:
                                C38981c98.m61864K(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 33:
                                C38981c98.m61858Q(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 34:
                                C38981c98.m61869F(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 35:
                                C38981c98.m61838f(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 36:
                                C38981c98.m61831m(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 37:
                                C38981c98.m61826r(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 38:
                                C38981c98.m61820x(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 39:
                                C38981c98.m61862M(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 40:
                                C38981c98.m61867H(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 41:
                                C38981c98.m61857R(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 42:
                                C38981c98.m61854U(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 43:
                                C38981c98.m61860O(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 44:
                                C38981c98.m61855T(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 45:
                                C38981c98.m61856S(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 46:
                                C38981c98.m61864K(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 47:
                                C38981c98.m61858Q(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 48:
                                C38981c98.m61869F(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 49:
                                C38981c98.m61832l(this.f70418a[length2], (List) C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8, m51533B(length2));
                                break;
                            case 50:
                                m51501w(interfaceC35212Pj8, i2, C35410Qf8.m88254M(t, m51530E & 1048575), length2);
                                break;
                            case 51:
                                if (m51499y(t, i2, length2)) {
                                    m88255L2 = m51521N(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34057z(i2, m88255L2);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (m51499y(t, i2, length2)) {
                                    m88256K2 = m51520O(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34098A(i2, m88256K2);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (m51499y(t, i2, length2)) {
                                    m88258I6 = m51518Q(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34088L(i2, m88258I6);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (m51499y(t, i2, length2)) {
                                    m88258I7 = m51518Q(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34058y(i2, m88258I7);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (m51499y(t, i2, length2)) {
                                    m88259H7 = m51519P(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34060w(i2, m88259H7);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (m51499y(t, i2, length2)) {
                                    m88258I8 = m51518Q(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34074i(i2, m88258I8);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (m51499y(t, i2, length2)) {
                                    m88259H8 = m51519P(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34072k(i2, m88259H8);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (m51499y(t, i2, length2)) {
                                    m88257J2 = m51517R(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34077f(i2, m88257J2);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!m51499y(t, i2, length2)) {
                                    break;
                                }
                                m51504t(i2, C35410Qf8.m88254M(t, m51530E & 1048575), interfaceC35212Pj8);
                                break;
                            case 60:
                                if (!m51499y(t, i2, length2)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34091I(i2, C35410Qf8.m88254M(t, m51530E & 1048575), m51533B(length2));
                                break;
                            case 61:
                                if (!m51499y(t, i2, length2)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34086N(i2, (TD7) C35410Qf8.m88254M(t, m51530E & 1048575));
                                break;
                            case 62:
                                if (m51499y(t, i2, length2)) {
                                    m88259H9 = m51519P(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34071l(i2, m88259H9);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (m51499y(t, i2, length2)) {
                                    m88259H10 = m51519P(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34095E(i2, m88259H10);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (m51499y(t, i2, length2)) {
                                    m88259H11 = m51519P(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34087M(i2, m88259H11);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (m51499y(t, i2, length2)) {
                                    m88258I9 = m51518Q(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34097C(i2, m88258I9);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (m51499y(t, i2, length2)) {
                                    m88259H12 = m51519P(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34070m(i2, m88259H12);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (m51499y(t, i2, length2)) {
                                    m88258I10 = m51518Q(t, m51530E & 1048575);
                                    interfaceC35212Pj8.mo34075h(i2, m88258I10);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!m51499y(t, i2, length2)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34084P(i2, C35410Qf8.m88254M(t, m51530E & 1048575), m51533B(length2));
                                break;
                        }
                    }
                    while (entry2 != null) {
                        this.f70434q.mo51569d(interfaceC35212Pj8, entry2);
                        entry2 = it2.hasNext() ? it2.next() : null;
                    }
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
        } else if (!this.f70426i) {
            m51524K(t, interfaceC35212Pj8);
        } else {
            if (this.f70424g) {
                TO7<?> mo51571b2 = this.f70434q.mo51571b(t);
                if (!mo51571b2.m83695b()) {
                    it = mo51571b2.m83692e();
                    entry = it.next();
                    length = this.f70418a.length;
                    for (i = 0; i < length; i += 4) {
                        int m51530E2 = m51530E(i);
                        int i3 = this.f70418a[i];
                        while (entry != null && this.f70434q.mo51572a(entry) <= i3) {
                            this.f70434q.mo51569d(interfaceC35212Pj8, entry);
                            entry = it.hasNext() ? it.next() : null;
                        }
                        switch ((m51530E2 & 267386880) >>> 20) {
                            case 0:
                                if (m51500x(t, i)) {
                                    m88255L = C35410Qf8.m88255L(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34057z(i3, m88255L);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (m51500x(t, i)) {
                                    m88256K = C35410Qf8.m88256K(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34098A(i3, m88256K);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (m51500x(t, i)) {
                                    m88258I = C35410Qf8.m88258I(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34088L(i3, m88258I);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (m51500x(t, i)) {
                                    m88258I2 = C35410Qf8.m88258I(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34058y(i3, m88258I2);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (m51500x(t, i)) {
                                    m88259H = C35410Qf8.m88259H(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34060w(i3, m88259H);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (m51500x(t, i)) {
                                    m88258I3 = C35410Qf8.m88258I(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34074i(i3, m88258I3);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (m51500x(t, i)) {
                                    m88259H2 = C35410Qf8.m88259H(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34072k(i3, m88259H2);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (m51500x(t, i)) {
                                    m88257J = C35410Qf8.m88257J(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34077f(i3, m88257J);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!m51500x(t, i)) {
                                    break;
                                }
                                m51504t(i3, C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8);
                                break;
                            case 9:
                                if (!m51500x(t, i)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34091I(i3, C35410Qf8.m88254M(t, m51530E2 & 1048575), m51533B(i));
                                break;
                            case 10:
                                if (!m51500x(t, i)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34086N(i3, (TD7) C35410Qf8.m88254M(t, m51530E2 & 1048575));
                                break;
                            case 11:
                                if (m51500x(t, i)) {
                                    m88259H3 = C35410Qf8.m88259H(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34071l(i3, m88259H3);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (m51500x(t, i)) {
                                    m88259H4 = C35410Qf8.m88259H(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34095E(i3, m88259H4);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (m51500x(t, i)) {
                                    m88259H5 = C35410Qf8.m88259H(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34087M(i3, m88259H5);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (m51500x(t, i)) {
                                    m88258I4 = C35410Qf8.m88258I(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34097C(i3, m88258I4);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (m51500x(t, i)) {
                                    m88259H6 = C35410Qf8.m88259H(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34070m(i3, m88259H6);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (m51500x(t, i)) {
                                    m88258I5 = C35410Qf8.m88258I(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34075h(i3, m88258I5);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!m51500x(t, i)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34084P(i3, C35410Qf8.m88254M(t, m51530E2 & 1048575), m51533B(i));
                                break;
                            case 18:
                                C38981c98.m61838f(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 19:
                                C38981c98.m61831m(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 20:
                                C38981c98.m61826r(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 21:
                                C38981c98.m61820x(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 22:
                                C38981c98.m61862M(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 23:
                                C38981c98.m61867H(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 24:
                                C38981c98.m61857R(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 25:
                                C38981c98.m61854U(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 26:
                                C38981c98.m61842d(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8);
                                break;
                            case 27:
                                C38981c98.m61840e(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, m51533B(i));
                                break;
                            case 28:
                                C38981c98.m61833k(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8);
                                break;
                            case 29:
                                C38981c98.m61860O(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 30:
                                C38981c98.m61855T(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 31:
                                C38981c98.m61856S(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 32:
                                C38981c98.m61864K(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 33:
                                C38981c98.m61858Q(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 34:
                                C38981c98.m61869F(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, false);
                                break;
                            case 35:
                                C38981c98.m61838f(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 36:
                                C38981c98.m61831m(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 37:
                                C38981c98.m61826r(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 38:
                                C38981c98.m61820x(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 39:
                                C38981c98.m61862M(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 40:
                                C38981c98.m61867H(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 41:
                                C38981c98.m61857R(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 42:
                                C38981c98.m61854U(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 43:
                                C38981c98.m61860O(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 44:
                                C38981c98.m61855T(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 45:
                                C38981c98.m61856S(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 46:
                                C38981c98.m61864K(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 47:
                                C38981c98.m61858Q(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 48:
                                C38981c98.m61869F(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, true);
                                break;
                            case 49:
                                C38981c98.m61832l(this.f70418a[i], (List) C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8, m51533B(i));
                                break;
                            case 50:
                                m51501w(interfaceC35212Pj8, i3, C35410Qf8.m88254M(t, m51530E2 & 1048575), i);
                                break;
                            case 51:
                                if (m51499y(t, i3, i)) {
                                    m88255L = m51521N(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34057z(i3, m88255L);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (m51499y(t, i3, i)) {
                                    m88256K = m51520O(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34098A(i3, m88256K);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (m51499y(t, i3, i)) {
                                    m88258I = m51518Q(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34088L(i3, m88258I);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (m51499y(t, i3, i)) {
                                    m88258I2 = m51518Q(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34058y(i3, m88258I2);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (m51499y(t, i3, i)) {
                                    m88259H = m51519P(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34060w(i3, m88259H);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (m51499y(t, i3, i)) {
                                    m88258I3 = m51518Q(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34074i(i3, m88258I3);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (m51499y(t, i3, i)) {
                                    m88259H2 = m51519P(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34072k(i3, m88259H2);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (m51499y(t, i3, i)) {
                                    m88257J = m51517R(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34077f(i3, m88257J);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!m51499y(t, i3, i)) {
                                    break;
                                }
                                m51504t(i3, C35410Qf8.m88254M(t, m51530E2 & 1048575), interfaceC35212Pj8);
                                break;
                            case 60:
                                if (!m51499y(t, i3, i)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34091I(i3, C35410Qf8.m88254M(t, m51530E2 & 1048575), m51533B(i));
                                break;
                            case 61:
                                if (!m51499y(t, i3, i)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34086N(i3, (TD7) C35410Qf8.m88254M(t, m51530E2 & 1048575));
                                break;
                            case 62:
                                if (m51499y(t, i3, i)) {
                                    m88259H3 = m51519P(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34071l(i3, m88259H3);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (m51499y(t, i3, i)) {
                                    m88259H4 = m51519P(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34095E(i3, m88259H4);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (m51499y(t, i3, i)) {
                                    m88259H5 = m51519P(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34087M(i3, m88259H5);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (m51499y(t, i3, i)) {
                                    m88258I4 = m51518Q(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34097C(i3, m88258I4);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (m51499y(t, i3, i)) {
                                    m88259H6 = m51519P(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34070m(i3, m88259H6);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (m51499y(t, i3, i)) {
                                    m88258I5 = m51518Q(t, m51530E2 & 1048575);
                                    interfaceC35212Pj8.mo34075h(i3, m88258I5);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!m51499y(t, i3, i)) {
                                    break;
                                }
                                interfaceC35212Pj8.mo34084P(i3, C35410Qf8.m88254M(t, m51530E2 & 1048575), m51533B(i));
                                break;
                        }
                    }
                    while (entry != null) {
                        this.f70434q.mo51569d(interfaceC35212Pj8, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    m51502v(this.f70433p, t, interfaceC35212Pj8);
                }
            }
            it = null;
            entry = null;
            length = this.f70418a.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            m51502v(this.f70433p, t, interfaceC35212Pj8);
        }
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: d */
    public final T mo5810d() {
        return (T) this.f70431n.mo51496a(this.f70423f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // p000.InterfaceC51439x88
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo5809e(T t) {
        int i;
        double m88255L;
        float m88256K;
        long m88258I;
        int m88259H;
        boolean m88257J;
        Object m88254M;
        Object m88254M2;
        int length = this.f70418a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 4) {
            int m51530E = m51530E(i3);
            int i4 = this.f70418a[i3];
            long j = 1048575 & m51530E;
            int i5 = 37;
            switch ((m51530E & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    m88255L = C35410Qf8.m88255L(t, j);
                    m88258I = Double.doubleToLongBits(m88255L);
                    m88259H = C37975aT7.m71323j(m88258I);
                    i2 = i + m88259H;
                    break;
                case 1:
                    i = i2 * 53;
                    m88256K = C35410Qf8.m88256K(t, j);
                    m88259H = Float.floatToIntBits(m88256K);
                    i2 = i + m88259H;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    m88258I = C35410Qf8.m88258I(t, j);
                    m88259H = C37975aT7.m71323j(m88258I);
                    i2 = i + m88259H;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    m88259H = C35410Qf8.m88259H(t, j);
                    i2 = i + m88259H;
                    break;
                case 7:
                    i = i2 * 53;
                    m88257J = C35410Qf8.m88257J(t, j);
                    m88259H = C37975aT7.m71327f(m88257J);
                    i2 = i + m88259H;
                    break;
                case 8:
                    i = i2 * 53;
                    m88259H = ((String) C35410Qf8.m88254M(t, j)).hashCode();
                    i2 = i + m88259H;
                    break;
                case 9:
                    m88254M = C35410Qf8.m88254M(t, j);
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i = i2 * 53;
                    m88254M2 = C35410Qf8.m88254M(t, j);
                    m88259H = m88254M2.hashCode();
                    i2 = i + m88259H;
                    break;
                case 17:
                    m88254M = C35410Qf8.m88254M(t, j);
                    break;
                case 51:
                    if (m51499y(t, i4, i3)) {
                        i = i2 * 53;
                        m88255L = m51521N(t, j);
                        m88258I = Double.doubleToLongBits(m88255L);
                        m88259H = C37975aT7.m71323j(m88258I);
                        i2 = i + m88259H;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m51499y(t, i4, i3)) {
                        i = i2 * 53;
                        m88256K = m51520O(t, j);
                        m88259H = Float.floatToIntBits(m88256K);
                        i2 = i + m88259H;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88258I = m51518Q(t, j);
                    m88259H = C37975aT7.m71323j(m88258I);
                    i2 = i + m88259H;
                    break;
                case 54:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88258I = m51518Q(t, j);
                    m88259H = C37975aT7.m71323j(m88258I);
                    i2 = i + m88259H;
                    break;
                case 55:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88259H = m51519P(t, j);
                    i2 = i + m88259H;
                    break;
                case 56:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88258I = m51518Q(t, j);
                    m88259H = C37975aT7.m71323j(m88258I);
                    i2 = i + m88259H;
                    break;
                case 57:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88259H = m51519P(t, j);
                    i2 = i + m88259H;
                    break;
                case 58:
                    if (m51499y(t, i4, i3)) {
                        i = i2 * 53;
                        m88257J = m51517R(t, j);
                        m88259H = C37975aT7.m71327f(m88257J);
                        i2 = i + m88259H;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88259H = ((String) C35410Qf8.m88254M(t, j)).hashCode();
                    i2 = i + m88259H;
                    break;
                case 60:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    m88254M2 = C35410Qf8.m88254M(t, j);
                    i = i2 * 53;
                    m88259H = m88254M2.hashCode();
                    i2 = i + m88259H;
                    break;
                case 61:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88254M2 = C35410Qf8.m88254M(t, j);
                    m88259H = m88254M2.hashCode();
                    i2 = i + m88259H;
                    break;
                case 62:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88259H = m51519P(t, j);
                    i2 = i + m88259H;
                    break;
                case 63:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88259H = m51519P(t, j);
                    i2 = i + m88259H;
                    break;
                case 64:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88259H = m51519P(t, j);
                    i2 = i + m88259H;
                    break;
                case 65:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88258I = m51518Q(t, j);
                    m88259H = C37975aT7.m71323j(m88258I);
                    i2 = i + m88259H;
                    break;
                case 66:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88259H = m51519P(t, j);
                    i2 = i + m88259H;
                    break;
                case 67:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m88258I = m51518Q(t, j);
                    m88259H = C37975aT7.m71323j(m88258I);
                    i2 = i + m88259H;
                    break;
                case 68:
                    if (!m51499y(t, i4, i3)) {
                        break;
                    }
                    m88254M2 = C35410Qf8.m88254M(t, j);
                    i = i2 * 53;
                    m88259H = m88254M2.hashCode();
                    i2 = i + m88259H;
                    break;
            }
        }
        int hashCode = (i2 * 53) + this.f70433p.mo51485k(t).hashCode();
        return this.f70424g ? (hashCode * 53) + this.f70434q.mo51571b(t).hashCode() : hashCode;
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: f */
    public final void mo5808f(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f70418a.length; i += 4) {
            int m51530E = m51530E(i);
            long j = 1048575 & m51530E;
            int i2 = this.f70418a[i];
            switch ((m51530E & 267386880) >>> 20) {
                case 0:
                    if (m51500x(t2, i)) {
                        C35410Qf8.m88241e(t, j, C35410Qf8.m88255L(t2, j));
                        m51527H(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m51500x(t2, i)) {
                        C35410Qf8.m88240f(t, j, C35410Qf8.m88256K(t2, j));
                        m51527H(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88238h(t, j, C35410Qf8.m88258I(t2, j));
                    m51527H(t, i);
                    break;
                case 3:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88238h(t, j, C35410Qf8.m88258I(t2, j));
                    m51527H(t, i);
                    break;
                case 4:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88239g(t, j, C35410Qf8.m88259H(t2, j));
                    m51527H(t, i);
                    break;
                case 5:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88238h(t, j, C35410Qf8.m88258I(t2, j));
                    m51527H(t, i);
                    break;
                case 6:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88239g(t, j, C35410Qf8.m88259H(t2, j));
                    m51527H(t, i);
                    break;
                case 7:
                    if (m51500x(t2, i)) {
                        C35410Qf8.m88236j(t, j, C35410Qf8.m88257J(t2, j));
                        m51527H(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88237i(t, j, C35410Qf8.m88254M(t2, j));
                    m51527H(t, i);
                    break;
                case 9:
                case 17:
                    m51503u(t, t2, i);
                    break;
                case 10:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88237i(t, j, C35410Qf8.m88254M(t2, j));
                    m51527H(t, i);
                    break;
                case 11:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88239g(t, j, C35410Qf8.m88259H(t2, j));
                    m51527H(t, i);
                    break;
                case 12:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88239g(t, j, C35410Qf8.m88259H(t2, j));
                    m51527H(t, i);
                    break;
                case 13:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88239g(t, j, C35410Qf8.m88259H(t2, j));
                    m51527H(t, i);
                    break;
                case 14:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88238h(t, j, C35410Qf8.m88258I(t2, j));
                    m51527H(t, i);
                    break;
                case 15:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88239g(t, j, C35410Qf8.m88259H(t2, j));
                    m51527H(t, i);
                    break;
                case 16:
                    if (!m51500x(t2, i)) {
                        break;
                    }
                    C35410Qf8.m88238h(t, j, C35410Qf8.m88258I(t2, j));
                    m51527H(t, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f70432o.mo27169b(t, t2, j);
                    break;
                case 50:
                    C38981c98.m61836h(this.f70435r, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m51499y(t2, i2, i)) {
                        break;
                    }
                    C35410Qf8.m88237i(t, j, C35410Qf8.m88254M(t2, j));
                    m51526I(t, i2, i);
                    break;
                case 60:
                case 68:
                    m51525J(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m51499y(t2, i2, i)) {
                        break;
                    }
                    C35410Qf8.m88237i(t, j, C35410Qf8.m88254M(t2, j));
                    m51526I(t, i2, i);
                    break;
            }
        }
        if (this.f70426i) {
            return;
        }
        C38981c98.m61835i(this.f70433p, t, t2);
        if (this.f70424g) {
            C38981c98.m61837g(this.f70434q, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC51439x88
    /* renamed from: g */
    public final boolean mo5807g(T t) {
        int i;
        int i2;
        boolean z;
        int[] iArr = this.f70428k;
        int i3 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int length = iArr.length;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = iArr[i5];
            int m51528G = m51528G(i7);
            int m51530E = m51530E(m51528G);
            if (this.f70426i) {
                i = length;
                i2 = 0;
            } else {
                int i8 = this.f70418a[m51528G + 2];
                int i9 = i8 & 1048575;
                i2 = i3 << (i8 >>> 20);
                if (i9 != i4) {
                    i = length;
                    i6 = f70417s.getInt(t, i9);
                    i4 = i9;
                } else {
                    i = length;
                }
            }
            if (((268435456 & m51530E) != 0) && !m51498z(t, m51528G, i6, i2)) {
                return false;
            }
            int i10 = (267386880 & m51530E) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (m51499y(t, i7, m51528G) && !m51534A(t, m51530E, m51533B(m51528G))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.f70435r.mo21970g(C35410Qf8.m88254M(t, m51530E & 1048575)).isEmpty()) {
                            this.f70435r.mo21973d(m51532C(m51528G));
                            throw null;
                        }
                    }
                }
                List list = (List) C35410Qf8.m88254M(t, m51530E & 1048575);
                if (!list.isEmpty()) {
                    InterfaceC51439x88 m51533B = m51533B(m51528G);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m51533B.mo5807g(list.get(i11))) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (!z) {
                    return false;
                }
            } else if (m51498z(t, m51528G, i6, i2) && !m51534A(t, m51530E, m51533B(m51528G))) {
                return false;
            }
            i5++;
            length = i;
            i3 = 1;
        }
        return !this.f70424g || this.f70434q.mo51571b(t).m83693d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0193, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a5, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b6, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c7, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d8, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e9, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fa, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020b, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x020d, code lost:
        r2.putInt(r20, r14, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0211, code lost:
        r3 = (com.google.android.gms.internal.clearcut.zzbn.m51446B0(r3) + com.google.android.gms.internal.clearcut.zzbn.m51442D0(r5)) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0331, code lost:
        if ((r5 instanceof p000.TD7) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0334, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m51448A(r3, (java.lang.String) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0414, code lost:
        if (m51499y(r20, r15, r5) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0434, code lost:
        if (m51499y(r20, r15, r5) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x043c, code lost:
        if (m51499y(r20, r15, r5) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x045c, code lost:
        if (m51499y(r20, r15, r5) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0464, code lost:
        if (m51499y(r20, r15, r5) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0474, code lost:
        if ((r4 instanceof p000.TD7) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x047c, code lost:
        if (m51499y(r20, r15, r5) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0514, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0526, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0538, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x054a, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x055c, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x056e, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0580, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0592, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x05a3, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05b4, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x05c5, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x05d6, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x05e7, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x05f8, code lost:
        if (r19.f70427j != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05fa, code lost:
        r2.putInt(r20, r9, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x05fe, code lost:
        r9 = (com.google.android.gms.internal.clearcut.zzbn.m51446B0(r15) + com.google.android.gms.internal.clearcut.zzbn.m51442D0(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x06c4, code lost:
        if ((r12 & r18) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x06c6, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m51430P(r15, (p000.H28) r2.getObject(r20, r10), m51533B(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x06f1, code lost:
        if ((r12 & r18) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06f3, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m51404o0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x06fc, code lost:
        if ((r12 & r18) != 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x06fe, code lost:
        r9 = com.google.android.gms.internal.clearcut.zzbn.m51394v0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0721, code lost:
        if ((r12 & r18) != 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0723, code lost:
        r4 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0727, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m51432N(r15, (p000.TD7) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0730, code lost:
        if ((r12 & r18) != 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0732, code lost:
        r4 = p000.C38981c98.m61830n(r15, r2.getObject(r20, r10), m51533B(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x074a, code lost:
        if ((r4 instanceof p000.TD7) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x074d, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m51448A(r15, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0757, code lost:
        if ((r12 & r18) != 0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0759, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m51429Q(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if ((r5 instanceof p000.TD7) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0127, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014b, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015d, code lost:
        if (r19.f70427j != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016f, code lost:
        if (r19.f70427j != false) goto L104;
     */
    @Override // p000.InterfaceC51439x88
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo5806h(T t) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j;
        int m51425W;
        Object object;
        int i3;
        int i4;
        int i5;
        long j2;
        int m61841d0;
        boolean z3;
        int m61843c0;
        int m61861N;
        int m51446B0;
        long m88258I;
        long m88258I2;
        int m88259H;
        Object m88254M;
        int m88259H2;
        int m88259H3;
        int m88259H4;
        long m88258I3;
        int m61841d02;
        int m61861N2;
        int i6 = 267386880;
        if (this.f70426i) {
            Unsafe unsafe = f70417s;
            int i7 = 0;
            int i8 = 0;
            while (i7 < this.f70418a.length) {
                int m51530E = m51530E(i7);
                int i9 = (m51530E & i6) >>> 20;
                int i10 = this.f70418a[i7];
                long j3 = m51530E & 1048575;
                int i11 = (i9 < XQ7.f43175T.m77019a() || i9 > XQ7.f43205w0.m77019a()) ? 0 : this.f70418a[i7 + 2] & 1048575;
                switch (i9) {
                    case 0:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51390y(i10, 0.0d);
                        break;
                    case 1:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51389z(i10, 0.0f);
                        break;
                    case 2:
                        if (m51500x(t, i7)) {
                            m88258I = C35410Qf8.m88258I(t, j3);
                            m61841d02 = zzbn.m51425W(i10, m88258I);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 3:
                        if (m51500x(t, i7)) {
                            m88258I2 = C35410Qf8.m88258I(t, j3);
                            m61841d02 = zzbn.m51419d0(i10, m88258I2);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 4:
                        if (m51500x(t, i7)) {
                            m88259H = C35410Qf8.m88259H(t, j3);
                            m61841d02 = zzbn.m51409j0(i10, m88259H);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 5:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51407k0(i10, 0L);
                        break;
                    case 6:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51397t0(i10, 0);
                        break;
                    case 7:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51429Q(i10, true);
                        break;
                    case 8:
                        if (m51500x(t, i7)) {
                            m88254M = C35410Qf8.m88254M(t, j3);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 9:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = C38981c98.m61830n(i10, C35410Qf8.m88254M(t, j3), m51533B(i7));
                        break;
                    case 10:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m88254M = C35410Qf8.m88254M(t, j3);
                        m61841d02 = zzbn.m51432N(i10, (TD7) m88254M);
                        break;
                    case 11:
                        if (m51500x(t, i7)) {
                            m88259H2 = C35410Qf8.m88259H(t, j3);
                            m61841d02 = zzbn.m51405n0(i10, m88259H2);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 12:
                        if (m51500x(t, i7)) {
                            m88259H3 = C35410Qf8.m88259H(t, j3);
                            m61841d02 = zzbn.m51392w0(i10, m88259H3);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 13:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51394v0(i10, 0);
                        break;
                    case 14:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51404o0(i10, 0L);
                        break;
                    case 15:
                        if (m51500x(t, i7)) {
                            m88259H4 = C35410Qf8.m88259H(t, j3);
                            m61841d02 = zzbn.m51400r0(i10, m88259H4);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 16:
                        if (m51500x(t, i7)) {
                            m88258I3 = C35410Qf8.m88258I(t, j3);
                            m61841d02 = zzbn.m51414g0(i10, m88258I3);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 17:
                        if (!m51500x(t, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51430P(i10, (H28) C35410Qf8.m88254M(t, j3), m51533B(i7));
                        break;
                    case 18:
                    case 23:
                    case 32:
                        m61841d02 = C38981c98.m61841d0(i10, m51522M(t, j3), false);
                        break;
                    case 19:
                    case 24:
                    case 31:
                        m61841d02 = C38981c98.m61843c0(i10, m51522M(t, j3), false);
                        break;
                    case 20:
                        m61841d02 = C38981c98.m61853V(i10, m51522M(t, j3), false);
                        break;
                    case 21:
                        m61841d02 = C38981c98.m61852W(i10, m51522M(t, j3), false);
                        break;
                    case 22:
                        m61841d02 = C38981c98.m61849Z(i10, m51522M(t, j3), false);
                        break;
                    case 25:
                        m61841d02 = C38981c98.m61839e0(i10, m51522M(t, j3), false);
                        break;
                    case 26:
                        m61841d02 = C38981c98.m61829o(i10, m51522M(t, j3));
                        break;
                    case 27:
                        m61841d02 = C38981c98.m61828p(i10, m51522M(t, j3), m51533B(i7));
                        break;
                    case 28:
                        m61841d02 = C38981c98.m61824t(i10, m51522M(t, j3));
                        break;
                    case 29:
                        m61841d02 = C38981c98.m61847a0(i10, m51522M(t, j3), false);
                        break;
                    case 30:
                        m61841d02 = C38981c98.m61850Y(i10, m51522M(t, j3), false);
                        break;
                    case 33:
                        m61841d02 = C38981c98.m61845b0(i10, m51522M(t, j3), false);
                        break;
                    case 34:
                        m61841d02 = C38981c98.m61851X(i10, m51522M(t, j3), false);
                        break;
                    case 35:
                        m61861N2 = C38981c98.m61861N((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 36:
                        m61861N2 = C38981c98.m61863L((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 37:
                        m61861N2 = C38981c98.m61848a((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 38:
                        m61861N2 = C38981c98.m61834j((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 39:
                        m61861N2 = C38981c98.m61870E((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 40:
                        m61861N2 = C38981c98.m61861N((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 41:
                        m61861N2 = C38981c98.m61863L((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 42:
                        m61861N2 = C38981c98.m61859P((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 43:
                        m61861N2 = C38981c98.m61868G((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 44:
                        m61861N2 = C38981c98.m61822v((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 45:
                        m61861N2 = C38981c98.m61863L((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 46:
                        m61861N2 = C38981c98.m61861N((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 47:
                        m61861N2 = C38981c98.m61865J((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 48:
                        m61861N2 = C38981c98.m61827q((List) unsafe.getObject(t, j3));
                        if (m61861N2 > 0) {
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 49:
                        m61841d02 = C38981c98.m61823u(i10, m51522M(t, j3), m51533B(i7));
                        break;
                    case 50:
                        m61841d02 = this.f70435r.mo21968i(i10, C35410Qf8.m88254M(t, j3), m51532C(i7));
                        break;
                    case 51:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51390y(i10, 0.0d);
                        break;
                    case 52:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51389z(i10, 0.0f);
                        break;
                    case 53:
                        if (m51499y(t, i10, i7)) {
                            m88258I = m51518Q(t, j3);
                            m61841d02 = zzbn.m51425W(i10, m88258I);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 54:
                        if (m51499y(t, i10, i7)) {
                            m88258I2 = m51518Q(t, j3);
                            m61841d02 = zzbn.m51419d0(i10, m88258I2);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 55:
                        if (m51499y(t, i10, i7)) {
                            m88259H = m51519P(t, j3);
                            m61841d02 = zzbn.m51409j0(i10, m88259H);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 56:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51407k0(i10, 0L);
                        break;
                    case 57:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51397t0(i10, 0);
                        break;
                    case 58:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51429Q(i10, true);
                        break;
                    case 59:
                        if (m51499y(t, i10, i7)) {
                            m88254M = C35410Qf8.m88254M(t, j3);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 60:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = C38981c98.m61830n(i10, C35410Qf8.m88254M(t, j3), m51533B(i7));
                        break;
                    case 61:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m88254M = C35410Qf8.m88254M(t, j3);
                        m61841d02 = zzbn.m51432N(i10, (TD7) m88254M);
                        break;
                    case 62:
                        if (m51499y(t, i10, i7)) {
                            m88259H2 = m51519P(t, j3);
                            m61841d02 = zzbn.m51405n0(i10, m88259H2);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 63:
                        if (m51499y(t, i10, i7)) {
                            m88259H3 = m51519P(t, j3);
                            m61841d02 = zzbn.m51392w0(i10, m88259H3);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 64:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51394v0(i10, 0);
                        break;
                    case 65:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51404o0(i10, 0L);
                        break;
                    case 66:
                        if (m51499y(t, i10, i7)) {
                            m88259H4 = m51519P(t, j3);
                            m61841d02 = zzbn.m51400r0(i10, m88259H4);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 67:
                        if (m51499y(t, i10, i7)) {
                            m88258I3 = m51518Q(t, j3);
                            m61841d02 = zzbn.m51414g0(i10, m88258I3);
                            break;
                        } else {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                    case 68:
                        if (!m51499y(t, i10, i7)) {
                            continue;
                            i7 += 4;
                            i6 = 267386880;
                        }
                        m61841d02 = zzbn.m51430P(i10, (H28) C35410Qf8.m88254M(t, j3), m51533B(i7));
                        break;
                    default:
                        i7 += 4;
                        i6 = 267386880;
                }
                i8 += m61841d02;
                i7 += 4;
                i6 = 267386880;
            }
            return i8 + m51507q(this.f70433p, t);
        }
        Unsafe unsafe2 = f70417s;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.f70418a.length) {
            int m51530E2 = m51530E(i13);
            int[] iArr = this.f70418a;
            int i16 = iArr[i13];
            int i17 = (m51530E2 & 267386880) >>> 20;
            if (i17 <= 17) {
                int i18 = iArr[i13 + 2];
                int i19 = i18 & 1048575;
                i2 = 1 << (i18 >>> 20);
                if (i19 != i12) {
                    i15 = unsafe2.getInt(t, i19);
                    i12 = i19;
                }
                i = i18;
            } else {
                i = (!this.f70427j || i17 < XQ7.f43175T.m77019a() || i17 > XQ7.f43205w0.m77019a()) ? 0 : this.f70418a[i13 + 2] & 1048575;
                i2 = 0;
            }
            long j4 = m51530E2 & 1048575;
            switch (i17) {
                case 0:
                    z = false;
                    z2 = false;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        i14 += zzbn.m51390y(i16, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    z = false;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        z2 = false;
                        i14 += zzbn.m51389z(i16, 0.0f);
                        break;
                    }
                    z2 = false;
                case 2:
                    z = false;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        m51425W = zzbn.m51425W(i16, unsafe2.getLong(t, j4));
                        i14 += m51425W;
                    }
                    z2 = false;
                    break;
                case 3:
                    z = false;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        m51425W = zzbn.m51419d0(i16, unsafe2.getLong(t, j4));
                        i14 += m51425W;
                    }
                    z2 = false;
                    break;
                case 4:
                    z = false;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        m51425W = zzbn.m51409j0(i16, unsafe2.getInt(t, j4));
                        i14 += m51425W;
                    }
                    z2 = false;
                    break;
                case 5:
                    z = false;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        m51425W = zzbn.m51407k0(i16, 0L);
                        i14 += m51425W;
                    }
                    z2 = false;
                    break;
                case 6:
                    if ((i15 & i2) != 0) {
                        z = false;
                        i14 += zzbn.m51397t0(i16, 0);
                        z2 = false;
                        j = 0;
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                case 7:
                    break;
                case 8:
                    if ((i15 & i2) != 0) {
                        object = unsafe2.getObject(t, j4);
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    if ((i15 & i2) != 0) {
                        i3 = unsafe2.getInt(t, j4);
                        m61841d0 = zzbn.m51405n0(i16, i3);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 12:
                    if ((i15 & i2) != 0) {
                        i4 = unsafe2.getInt(t, j4);
                        m61841d0 = zzbn.m51392w0(i16, i4);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if ((i15 & i2) != 0) {
                        i5 = unsafe2.getInt(t, j4);
                        m61841d0 = zzbn.m51400r0(i16, i5);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 16:
                    if ((i15 & i2) != 0) {
                        j2 = unsafe2.getLong(t, j4);
                        m61841d0 = zzbn.m51414g0(i16, j2);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 17:
                    break;
                case 18:
                    m61841d0 = C38981c98.m61841d0(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61841d0;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 19:
                case 24:
                case 31:
                    z3 = false;
                    m61843c0 = C38981c98.m61843c0(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 20:
                    z3 = false;
                    m61843c0 = C38981c98.m61853V(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 21:
                    z3 = false;
                    m61843c0 = C38981c98.m61852W(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 22:
                    z3 = false;
                    m61843c0 = C38981c98.m61849Z(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 23:
                case 32:
                    z3 = false;
                    m61843c0 = C38981c98.m61841d0(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 25:
                    z3 = false;
                    m61843c0 = C38981c98.m61839e0(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 26:
                    m61841d0 = C38981c98.m61829o(i16, (List) unsafe2.getObject(t, j4));
                    i14 += m61841d0;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 27:
                    m61841d0 = C38981c98.m61828p(i16, (List) unsafe2.getObject(t, j4), m51533B(i13));
                    i14 += m61841d0;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 28:
                    m61841d0 = C38981c98.m61824t(i16, (List) unsafe2.getObject(t, j4));
                    i14 += m61841d0;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 29:
                    m61841d0 = C38981c98.m61847a0(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61841d0;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 30:
                    z3 = false;
                    m61843c0 = C38981c98.m61850Y(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 33:
                    z3 = false;
                    m61843c0 = C38981c98.m61845b0(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 34:
                    z3 = false;
                    m61843c0 = C38981c98.m61851X(i16, (List) unsafe2.getObject(t, j4), false);
                    i14 += m61843c0;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 35:
                    m61861N = C38981c98.m61861N((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 36:
                    m61861N = C38981c98.m61863L((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 37:
                    m61861N = C38981c98.m61848a((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 38:
                    m61861N = C38981c98.m61834j((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 39:
                    m61861N = C38981c98.m61870E((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 40:
                    m61861N = C38981c98.m61861N((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 41:
                    m61861N = C38981c98.m61863L((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 42:
                    m61861N = C38981c98.m61859P((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 43:
                    m61861N = C38981c98.m61868G((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 44:
                    m61861N = C38981c98.m61822v((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 45:
                    m61861N = C38981c98.m61863L((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 46:
                    m61861N = C38981c98.m61861N((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 47:
                    m61861N = C38981c98.m61865J((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 48:
                    m61861N = C38981c98.m61827q((List) unsafe2.getObject(t, j4));
                    if (m61861N > 0) {
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 49:
                    m61841d0 = C38981c98.m61823u(i16, (List) unsafe2.getObject(t, j4), m51533B(i13));
                    i14 += m61841d0;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 50:
                    m61841d0 = this.f70435r.mo21968i(i16, unsafe2.getObject(t, j4), m51532C(i13));
                    i14 += m61841d0;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 51:
                    if (m51499y(t, i16, i13)) {
                        m61841d0 = zzbn.m51390y(i16, 0.0d);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 52:
                    if (m51499y(t, i16, i13)) {
                        m51446B0 = zzbn.m51389z(i16, 0.0f);
                        i14 += m51446B0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 53:
                    if (m51499y(t, i16, i13)) {
                        m61841d0 = zzbn.m51425W(i16, m51518Q(t, j4));
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 54:
                    if (m51499y(t, i16, i13)) {
                        m61841d0 = zzbn.m51419d0(i16, m51518Q(t, j4));
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 55:
                    if (m51499y(t, i16, i13)) {
                        m61841d0 = zzbn.m51409j0(i16, m51519P(t, j4));
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 56:
                    if (m51499y(t, i16, i13)) {
                        m61841d0 = zzbn.m51407k0(i16, 0L);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 57:
                    if (m51499y(t, i16, i13)) {
                        m51446B0 = zzbn.m51397t0(i16, 0);
                        i14 += m51446B0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 58:
                    break;
                case 59:
                    if (m51499y(t, i16, i13)) {
                        object = unsafe2.getObject(t, j4);
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 60:
                    break;
                case 61:
                    break;
                case 62:
                    if (m51499y(t, i16, i13)) {
                        i3 = m51519P(t, j4);
                        m61841d0 = zzbn.m51405n0(i16, i3);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 63:
                    if (m51499y(t, i16, i13)) {
                        i4 = m51519P(t, j4);
                        m61841d0 = zzbn.m51392w0(i16, i4);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 64:
                    break;
                case 65:
                    break;
                case 66:
                    if (m51499y(t, i16, i13)) {
                        i5 = m51519P(t, j4);
                        m61841d0 = zzbn.m51400r0(i16, i5);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 67:
                    if (m51499y(t, i16, i13)) {
                        j2 = m51518Q(t, j4);
                        m61841d0 = zzbn.m51414g0(i16, j2);
                        i14 += m61841d0;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 68:
                    break;
                default:
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
            }
            i13 += 4;
        }
        int m51507q = i14 + m51507q(this.f70433p, t);
        return this.f70424g ? m51507q + this.f70434q.mo51571b(t).m83685l() : m51507q;
    }

    /* renamed from: j */
    public final int m51514j(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C40786fA7 c40786fA7) throws IOException {
        Object valueOf;
        Object valueOf2;
        int m2135g;
        long j2;
        int i9;
        Object valueOf3;
        int i10;
        Unsafe unsafe = f70417s;
        long j3 = this.f70418a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    valueOf = Double.valueOf(C52535yz7.m2130l(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    m2135g = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(C52535yz7.m2128n(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    m2135g = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    m2135g = C52535yz7.m2135g(bArr, i, c40786fA7);
                    j2 = c40786fA7.f79636b;
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m2135g = C52535yz7.m2137e(bArr, i, c40786fA7);
                    i9 = c40786fA7.f79635a;
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    valueOf = Long.valueOf(C52535yz7.m2131k(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    m2135g = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(C52535yz7.m2134h(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    m2135g = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    m2135g = C52535yz7.m2135g(bArr, i, c40786fA7);
                    valueOf3 = Boolean.valueOf(c40786fA7.f79636b != 0);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    m2135g = C52535yz7.m2137e(bArr, i, c40786fA7);
                    i10 = c40786fA7.f79635a;
                    if (i10 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return m2135g;
                    } else if ((i6 & 536870912) == 0 || C31909Bg8.m113677i(bArr, m2135g, m2135g + i10)) {
                        unsafe.putObject(t, j, new String(bArr, m2135g, i10, C37975aT7.f50512a));
                        m2135g += i10;
                        unsafe.putInt(t, j3, i4);
                        return m2135g;
                    } else {
                        throw zzco.m51353e();
                    }
                }
                return i;
            case 60:
                if (i5 == 2) {
                    m2135g = m51508p(m51533B(i8), bArr, i, i2, c40786fA7);
                    Object object = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = c40786fA7.f79637c;
                    if (object != null) {
                        valueOf3 = C37975aT7.m71329d(object, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m2135g = C52535yz7.m2137e(bArr, i, c40786fA7);
                    i10 = c40786fA7.f79635a;
                    if (i10 == 0) {
                        valueOf3 = TD7.f34940c;
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return m2135g;
                    }
                    unsafe.putObject(t, j, TD7.m84181j(bArr, m2135g, i10));
                    m2135g += i10;
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m2137e = C52535yz7.m2137e(bArr, i, c40786fA7);
                    int i11 = c40786fA7.f79635a;
                    DT7<?> m51531D = m51531D(i8);
                    if (m51531D != null && m51531D.mo51476g(i11) == null) {
                        m51516S(t).m86525e(i3, Long.valueOf(i11));
                        return m2137e;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i11));
                    m2135g = m2137e;
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    m2135g = C52535yz7.m2137e(bArr, i, c40786fA7);
                    i9 = HK7.m103989e(c40786fA7.f79635a);
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    m2135g = C52535yz7.m2135g(bArr, i, c40786fA7);
                    j2 = HK7.m103991a(c40786fA7.f79636b);
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    m2135g = m51509o(m51533B(i8), bArr, i, i2, (i3 & (-8)) | 4, c40786fA7);
                    Object object2 = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = c40786fA7.f79637c;
                    if (object2 != null) {
                        valueOf3 = C37975aT7.m71329d(object2, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m2135g;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0233, code lost:
        if (r29.f79636b != 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0237, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0238, code lost:
        r12.m61754b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023b, code lost:
        if (r4 >= r19) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023d, code lost:
        r6 = p000.C52535yz7.m2137e(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0243, code lost:
        if (r20 != r29.f79635a) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0245, code lost:
        r4 = p000.C52535yz7.m2135g(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024d, code lost:
        if (r29.f79636b == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0137, code lost:
        if (r4 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
        r12.add(p000.TD7.f34940c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
        r12.add(p000.TD7.m84181j(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r1 >= r19) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
        r4 = p000.C52535yz7.m2137e(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014f, code lost:
        if (r20 != r29.f79635a) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0151, code lost:
        r1 = p000.C52535yz7.m2137e(r17, r4, r29);
        r4 = r29.f79635a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
        if (r4 != 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01e2 -> B:91:0x01bb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0237 -> B:127:0x0238). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x024d -> B:125:0x0235). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x013f -> B:66:0x0147). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0157 -> B:64:0x0139). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0194 -> B:82:0x0198). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01a8 -> B:79:0x0189). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ce -> B:96:0x01d2). Please submit an issue!!! */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m51513k(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C40786fA7 c40786fA7) throws IOException {
        int m2135g;
        int m2137e;
        int m2137e2;
        int m2135g2;
        int i8 = i;
        Unsafe unsafe = f70417s;
        InterfaceC47489qU7 interfaceC47489qU7 = (InterfaceC47489qU7) unsafe.getObject(t, j2);
        if (!interfaceC47489qU7.mo17485i()) {
            int size = interfaceC47489qU7.size();
            interfaceC47489qU7 = interfaceC47489qU7.mo1502n(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, interfaceC47489qU7);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    C52752zM7 c52752zM7 = (C52752zM7) interfaceC47489qU7;
                    int m2137e3 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                    int i9 = c40786fA7.f79635a + m2137e3;
                    while (m2137e3 < i9) {
                        c52752zM7.m1506b(C52535yz7.m2130l(bArr, m2137e3));
                        m2137e3 += 8;
                    }
                    if (m2137e3 == i9) {
                        return m2137e3;
                    }
                    throw zzco.m51357a();
                }
                if (i5 == 1) {
                    C52752zM7 c52752zM72 = (C52752zM7) interfaceC47489qU7;
                    c52752zM72.m1506b(C52535yz7.m2130l(bArr, i));
                    while (true) {
                        int i10 = i8 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        i8 = C52535yz7.m2137e(bArr, i10, c40786fA7);
                        if (i3 != c40786fA7.f79635a) {
                            return i10;
                        }
                        c52752zM72.m1506b(C52535yz7.m2130l(bArr, i8));
                    }
                }
                return i8;
            case 19:
            case 36:
                if (i5 == 2) {
                    RR7 rr7 = (RR7) interfaceC47489qU7;
                    int m2137e4 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                    int i11 = c40786fA7.f79635a + m2137e4;
                    while (m2137e4 < i11) {
                        rr7.m86743b(C52535yz7.m2128n(bArr, m2137e4));
                        m2137e4 += 4;
                    }
                    if (m2137e4 == i11) {
                        return m2137e4;
                    }
                    throw zzco.m51357a();
                }
                if (i5 == 5) {
                    RR7 rr72 = (RR7) interfaceC47489qU7;
                    rr72.m86743b(C52535yz7.m2128n(bArr, i));
                    while (true) {
                        int i12 = i8 + 4;
                        if (i12 >= i2) {
                            return i12;
                        }
                        i8 = C52535yz7.m2137e(bArr, i12, c40786fA7);
                        if (i3 != c40786fA7.f79635a) {
                            return i12;
                        }
                        rr72.m86743b(C52535yz7.m2128n(bArr, i8));
                    }
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    C48127rZ7 c48127rZ7 = (C48127rZ7) interfaceC47489qU7;
                    int m2137e5 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                    int i13 = c40786fA7.f79635a + m2137e5;
                    while (m2137e5 < i13) {
                        m2137e5 = C52535yz7.m2135g(bArr, m2137e5, c40786fA7);
                        c48127rZ7.m15755h(c40786fA7.f79636b);
                    }
                    if (m2137e5 == i13) {
                        return m2137e5;
                    }
                    throw zzco.m51357a();
                }
                if (i5 == 0) {
                    C48127rZ7 c48127rZ72 = (C48127rZ7) interfaceC47489qU7;
                    do {
                        m2135g = C52535yz7.m2135g(bArr, i8, c40786fA7);
                        c48127rZ72.m15755h(c40786fA7.f79636b);
                        if (m2135g >= i2) {
                            return m2135g;
                        }
                        i8 = C52535yz7.m2137e(bArr, m2135g, c40786fA7);
                    } while (i3 == c40786fA7.f79635a);
                    return m2135g;
                }
                return i8;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C52535yz7.m2136f(bArr, i8, interfaceC47489qU7, c40786fA7);
                }
                if (i5 == 0) {
                    return C52535yz7.m2140b(i3, bArr, i, i2, interfaceC47489qU7, c40786fA7);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    C48127rZ7 c48127rZ73 = (C48127rZ7) interfaceC47489qU7;
                    int m2137e6 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                    int i14 = c40786fA7.f79635a + m2137e6;
                    while (m2137e6 < i14) {
                        c48127rZ73.m15755h(C52535yz7.m2131k(bArr, m2137e6));
                        m2137e6 += 8;
                    }
                    if (m2137e6 == i14) {
                        return m2137e6;
                    }
                    throw zzco.m51357a();
                }
                if (i5 == 1) {
                    C48127rZ7 c48127rZ74 = (C48127rZ7) interfaceC47489qU7;
                    c48127rZ74.m15755h(C52535yz7.m2131k(bArr, i));
                    while (true) {
                        int i15 = i8 + 8;
                        if (i15 >= i2) {
                            return i15;
                        }
                        i8 = C52535yz7.m2137e(bArr, i15, c40786fA7);
                        if (i3 != c40786fA7.f79635a) {
                            return i15;
                        }
                        c48127rZ74.m15755h(C52535yz7.m2131k(bArr, i8));
                    }
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    LS7 ls7 = (LS7) interfaceC47489qU7;
                    int m2137e7 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                    int i16 = c40786fA7.f79635a + m2137e7;
                    while (m2137e7 < i16) {
                        ls7.m96917b(C52535yz7.m2134h(bArr, m2137e7));
                        m2137e7 += 4;
                    }
                    if (m2137e7 == i16) {
                        return m2137e7;
                    }
                    throw zzco.m51357a();
                }
                if (i5 == 5) {
                    LS7 ls72 = (LS7) interfaceC47489qU7;
                    ls72.m96917b(C52535yz7.m2134h(bArr, i));
                    while (true) {
                        int i17 = i8 + 4;
                        if (i17 >= i2) {
                            return i17;
                        }
                        i8 = C52535yz7.m2137e(bArr, i17, c40786fA7);
                        if (i3 != c40786fA7.f79635a) {
                            return i17;
                        }
                        ls72.m96917b(C52535yz7.m2134h(bArr, i8));
                    }
                }
                return i8;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        C38999cB7 c38999cB7 = (C38999cB7) interfaceC47489qU7;
                        i8 = C52535yz7.m2135g(bArr, i8, c40786fA7);
                        break;
                    }
                    return i8;
                }
                C38999cB7 c38999cB72 = (C38999cB7) interfaceC47489qU7;
                m2137e = C52535yz7.m2137e(bArr, i8, c40786fA7);
                int i18 = c40786fA7.f79635a + m2137e;
                while (m2137e < i18) {
                    m2137e = C52535yz7.m2135g(bArr, m2137e, c40786fA7);
                    c38999cB72.m61754b(c40786fA7.f79636b != 0);
                }
                if (m2137e != i18) {
                    throw zzco.m51357a();
                }
                return m2137e;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m2137e8 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                        int i19 = c40786fA7.f79635a;
                        if (i19 != 0) {
                            String str = new String(bArr, m2137e8, i19, C37975aT7.f50512a);
                            interfaceC47489qU7.add(str);
                            m2137e8 += i19;
                            if (m2137e8 < i2) {
                                int m2137e9 = C52535yz7.m2137e(bArr, m2137e8, c40786fA7);
                                if (i3 != c40786fA7.f79635a) {
                                    return m2137e8;
                                }
                                m2137e8 = C52535yz7.m2137e(bArr, m2137e9, c40786fA7);
                                i19 = c40786fA7.f79635a;
                                if (i19 != 0) {
                                    str = new String(bArr, m2137e8, i19, C37975aT7.f50512a);
                                    interfaceC47489qU7.add(str);
                                    m2137e8 += i19;
                                    if (m2137e8 < i2) {
                                        return m2137e8;
                                    }
                                }
                            }
                        }
                        interfaceC47489qU7.add("");
                        if (m2137e8 < i2) {
                        }
                    } else {
                        int m2137e10 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                        int i20 = c40786fA7.f79635a;
                        if (i20 != 0) {
                            int i21 = m2137e10 + i20;
                            if (!C31909Bg8.m113677i(bArr, m2137e10, i21)) {
                                throw zzco.m51353e();
                            }
                            String str2 = new String(bArr, m2137e10, i20, C37975aT7.f50512a);
                            interfaceC47489qU7.add(str2);
                            m2137e10 = i21;
                            if (m2137e10 < i2) {
                                int m2137e11 = C52535yz7.m2137e(bArr, m2137e10, c40786fA7);
                                if (i3 != c40786fA7.f79635a) {
                                    return m2137e10;
                                }
                                m2137e10 = C52535yz7.m2137e(bArr, m2137e11, c40786fA7);
                                int i22 = c40786fA7.f79635a;
                                if (i22 != 0) {
                                    i21 = m2137e10 + i22;
                                    if (!C31909Bg8.m113677i(bArr, m2137e10, i21)) {
                                        throw zzco.m51353e();
                                    }
                                    str2 = new String(bArr, m2137e10, i22, C37975aT7.f50512a);
                                    interfaceC47489qU7.add(str2);
                                    m2137e10 = i21;
                                    if (m2137e10 < i2) {
                                        return m2137e10;
                                    }
                                }
                            }
                        }
                        interfaceC47489qU7.add("");
                        if (m2137e10 < i2) {
                        }
                    }
                }
                return i8;
            case 27:
                if (i5 == 2) {
                    return m51510n(m51533B(i6), i3, bArr, i, i2, interfaceC47489qU7, c40786fA7);
                }
                return i8;
            case 28:
                if (i5 == 2) {
                    int m2137e12 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                    int i23 = c40786fA7.f79635a;
                    break;
                }
                return i8;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        m2137e = C52535yz7.m2140b(i3, bArr, i, i2, interfaceC47489qU7, c40786fA7);
                    }
                    return i8;
                }
                m2137e = C52535yz7.m2136f(bArr, i8, interfaceC47489qU7, c40786fA7);
                AbstractC17497c abstractC17497c = (AbstractC17497c) t;
                C35626Rd8 c35626Rd8 = abstractC17497c.zzjp;
                if (c35626Rd8 == C35626Rd8.m86522h()) {
                    c35626Rd8 = null;
                }
                C35626Rd8 c35626Rd82 = (C35626Rd8) C38981c98.m61844c(i4, interfaceC47489qU7, m51531D(i6), c35626Rd8, this.f70433p);
                if (c35626Rd82 != null) {
                    abstractC17497c.zzjp = c35626Rd82;
                }
                return m2137e;
            case 33:
            case 47:
                if (i5 == 2) {
                    LS7 ls73 = (LS7) interfaceC47489qU7;
                    int m2137e13 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                    int i24 = c40786fA7.f79635a + m2137e13;
                    while (m2137e13 < i24) {
                        m2137e13 = C52535yz7.m2137e(bArr, m2137e13, c40786fA7);
                        ls73.m96917b(HK7.m103989e(c40786fA7.f79635a));
                    }
                    if (m2137e13 == i24) {
                        return m2137e13;
                    }
                    throw zzco.m51357a();
                }
                if (i5 == 0) {
                    LS7 ls74 = (LS7) interfaceC47489qU7;
                    do {
                        m2137e2 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                        ls74.m96917b(HK7.m103989e(c40786fA7.f79635a));
                        if (m2137e2 >= i2) {
                            return m2137e2;
                        }
                        i8 = C52535yz7.m2137e(bArr, m2137e2, c40786fA7);
                    } while (i3 == c40786fA7.f79635a);
                    return m2137e2;
                }
                return i8;
            case 34:
            case 48:
                if (i5 == 2) {
                    C48127rZ7 c48127rZ75 = (C48127rZ7) interfaceC47489qU7;
                    int m2137e14 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                    int i25 = c40786fA7.f79635a + m2137e14;
                    while (m2137e14 < i25) {
                        m2137e14 = C52535yz7.m2135g(bArr, m2137e14, c40786fA7);
                        c48127rZ75.m15755h(HK7.m103991a(c40786fA7.f79636b));
                    }
                    if (m2137e14 == i25) {
                        return m2137e14;
                    }
                    throw zzco.m51357a();
                }
                if (i5 == 0) {
                    C48127rZ7 c48127rZ76 = (C48127rZ7) interfaceC47489qU7;
                    do {
                        m2135g2 = C52535yz7.m2135g(bArr, i8, c40786fA7);
                        c48127rZ76.m15755h(HK7.m103991a(c40786fA7.f79636b));
                        if (m2135g2 >= i2) {
                            return m2135g2;
                        }
                        i8 = C52535yz7.m2137e(bArr, m2135g2, c40786fA7);
                    } while (i3 == c40786fA7.f79635a);
                    return m2135g2;
                }
                return i8;
            case 49:
                if (i5 == 3) {
                    InterfaceC51439x88 m51533B = m51533B(i6);
                    int i26 = (i3 & (-8)) | 4;
                    i8 = m51509o(m51533B, bArr, i, i2, i26, c40786fA7);
                    while (true) {
                        interfaceC47489qU7.add(c40786fA7.f79637c);
                        if (i8 < i2) {
                            int m2137e15 = C52535yz7.m2137e(bArr, i8, c40786fA7);
                            if (i3 == c40786fA7.f79635a) {
                                i8 = m51509o(m51533B, bArr, m2137e15, i2, i26, c40786fA7);
                            }
                        }
                    }
                }
                return i8;
            default:
                return i8;
        }
    }

    /* renamed from: l */
    public final <K, V> int m51512l(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, C40786fA7 c40786fA7) throws IOException {
        Unsafe unsafe = f70417s;
        Object m51532C = m51532C(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f70435r.mo21974c(object)) {
            Object mo21975b = this.f70435r.mo21975b(m51532C);
            this.f70435r.mo21971f(mo21975b, object);
            unsafe.putObject(t, j, mo21975b);
            object = mo21975b;
        }
        this.f70435r.mo21973d(m51532C);
        this.f70435r.mo21969h(object);
        int m2137e = C52535yz7.m2137e(bArr, i, c40786fA7);
        int i5 = c40786fA7.f79635a;
        if (i5 < 0 || i5 > i2 - m2137e) {
            throw zzco.m51357a();
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0372 A[ADDED_TO_REGION] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m51511m(T t, byte[] bArr, int i, int i2, int i3, C40786fA7 c40786fA7) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        T t2;
        DT7<?> m51531D;
        byte b;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C40786fA7 c40786fA72;
        int i15;
        int i16;
        int i17;
        long j;
        Object obj;
        C40786fA7 c40786fA73;
        int m2129m;
        C17504e<T> c17504e = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i18 = i2;
        int i19 = i3;
        C40786fA7 c40786fA74 = c40786fA7;
        Unsafe unsafe2 = f70417s;
        int i20 = -1;
        int i21 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            if (i21 < i18) {
                int i25 = i21 + 1;
                byte b2 = bArr2[i21];
                if (b2 < 0) {
                    i9 = C52535yz7.m2138d(b2, bArr2, i25, c40786fA74);
                    b = c40786fA74.f79635a;
                } else {
                    b = b2;
                    i9 = i25;
                }
                int i26 = b >>> 3;
                int i27 = b & 7;
                int m51528G = c17504e.m51528G(i26);
                if (m51528G != i20) {
                    int[] iArr = c17504e.f70418a;
                    int i28 = iArr[m51528G + 1];
                    int i29 = (i28 & 267386880) >>> 20;
                    int i30 = b;
                    long j2 = i28 & 1048575;
                    if (i29 <= 17) {
                        int i31 = iArr[m51528G + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = i31 & 1048575;
                        if (i33 != i22) {
                            if (i22 != -1) {
                                unsafe2.putInt(t3, i22, i24);
                            }
                            i24 = unsafe2.getInt(t3, i33);
                            i22 = i33;
                        }
                        switch (i29) {
                            case 0:
                                i6 = i30;
                                c40786fA72 = c40786fA7;
                                i15 = i9;
                                i16 = i22;
                                bArr2 = bArr;
                                if (i27 == 1) {
                                    C35410Qf8.m88241e(t3, j2, C52535yz7.m2130l(bArr2, i15));
                                    i21 = i15 + 8;
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i2;
                                    i23 = i6;
                                    c40786fA74 = c40786fA72;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4 && i4 != 0) {
                                        i7 = i22;
                                        i8 = -1;
                                        i5 = i14;
                                        break;
                                    } else {
                                        i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                        c17504e = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        i18 = i2;
                                        i19 = i4;
                                        i23 = i6;
                                        unsafe2 = unsafe;
                                        i20 = -1;
                                        c40786fA74 = c40786fA7;
                                        break;
                                    }
                                }
                            case 1:
                                i6 = i30;
                                c40786fA72 = c40786fA7;
                                i15 = i9;
                                i16 = i22;
                                bArr2 = bArr;
                                if (i27 == 5) {
                                    C35410Qf8.m88240f(t3, j2, C52535yz7.m2128n(bArr2, i15));
                                    i21 = i15 + 4;
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i2;
                                    i23 = i6;
                                    c40786fA74 = c40786fA72;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                i6 = i30;
                                i15 = i9;
                                i16 = i22;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    int m2135g = C52535yz7.m2135g(bArr2, i15, c40786fA7);
                                    unsafe2.putLong(t, j2, c40786fA7.f79636b);
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i2;
                                    i23 = i6;
                                    c40786fA74 = c40786fA7;
                                    i21 = m2135g;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                i6 = i30;
                                c40786fA72 = c40786fA7;
                                i15 = i9;
                                i16 = i22;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    i21 = C52535yz7.m2137e(bArr2, i15, c40786fA72);
                                    unsafe2.putInt(t3, j2, c40786fA72.f79635a);
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i2;
                                    i23 = i6;
                                    c40786fA74 = c40786fA72;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                i6 = i30;
                                c40786fA72 = c40786fA7;
                                i16 = i22;
                                bArr2 = bArr;
                                if (i27 == 1) {
                                    unsafe2.putLong(t, j2, C52535yz7.m2131k(bArr2, i9));
                                    i21 = i9 + 8;
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i2;
                                    i23 = i6;
                                    c40786fA74 = c40786fA72;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                i6 = i30;
                                i17 = i2;
                                c40786fA72 = c40786fA7;
                                i16 = i22;
                                bArr2 = bArr;
                                if (i27 == 5) {
                                    unsafe2.putInt(t3, j2, C52535yz7.m2134h(bArr2, i9));
                                    i21 = i9 + 4;
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i17;
                                    i23 = i6;
                                    c40786fA74 = c40786fA72;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 7:
                                i6 = i30;
                                i17 = i2;
                                c40786fA72 = c40786fA7;
                                i16 = i22;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    i21 = C52535yz7.m2135g(bArr2, i9, c40786fA72);
                                    C35410Qf8.m88236j(t3, j2, c40786fA72.f79636b != 0);
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i17;
                                    i23 = i6;
                                    c40786fA74 = c40786fA72;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 8:
                                i6 = i30;
                                i17 = i2;
                                c40786fA72 = c40786fA7;
                                i16 = i22;
                                j = j2;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    i21 = (i28 & 536870912) == 0 ? C52535yz7.m2133i(bArr2, i9, c40786fA72) : C52535yz7.m2132j(bArr2, i9, c40786fA72);
                                    obj = c40786fA72.f79637c;
                                    unsafe2.putObject(t3, j, obj);
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i17;
                                    i23 = i6;
                                    c40786fA74 = c40786fA72;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 9:
                                i6 = i30;
                                c40786fA72 = c40786fA7;
                                i16 = i22;
                                j = j2;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    i17 = i2;
                                    i21 = m51508p(c17504e.m51533B(m51528G), bArr2, i9, i17, c40786fA72);
                                    obj = (i24 & i32) == 0 ? c40786fA72.f79637c : C37975aT7.m71329d(unsafe2.getObject(t3, j), c40786fA72.f79637c);
                                    unsafe2.putObject(t3, j, obj);
                                    i24 |= i32;
                                    i22 = i16;
                                    i18 = i17;
                                    i23 = i6;
                                    c40786fA74 = c40786fA72;
                                    i20 = -1;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 10:
                                i6 = i30;
                                c40786fA73 = c40786fA7;
                                i20 = -1;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    m2129m = C52535yz7.m2129m(bArr2, i9, c40786fA73);
                                    unsafe2.putObject(t3, j2, c40786fA73.f79637c);
                                    i24 |= i32;
                                    i18 = i2;
                                    i21 = m2129m;
                                    i23 = i6;
                                    c40786fA74 = c40786fA73;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i16 = i22;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 12:
                                i6 = i30;
                                c40786fA73 = c40786fA7;
                                i20 = -1;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    i21 = C52535yz7.m2137e(bArr2, i9, c40786fA73);
                                    int i34 = c40786fA73.f79635a;
                                    DT7<?> m51531D2 = c17504e.m51531D(m51528G);
                                    if (m51531D2 == null || m51531D2.mo51476g(i34) != null) {
                                        unsafe2.putInt(t3, j2, i34);
                                        i24 |= i32;
                                    } else {
                                        m51516S(t).m86525e(i6, Long.valueOf(i34));
                                    }
                                    i18 = i2;
                                    i23 = i6;
                                    c40786fA74 = c40786fA73;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i16 = i22;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 15:
                                i6 = i30;
                                c40786fA73 = c40786fA7;
                                i20 = -1;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    m2129m = C52535yz7.m2137e(bArr2, i9, c40786fA73);
                                    unsafe2.putInt(t3, j2, HK7.m103989e(c40786fA73.f79635a));
                                    i24 |= i32;
                                    i18 = i2;
                                    i21 = m2129m;
                                    i23 = i6;
                                    c40786fA74 = c40786fA73;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i16 = i22;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 16:
                                i6 = i30;
                                i20 = -1;
                                if (i27 == 0) {
                                    bArr2 = bArr;
                                    int m2135g2 = C52535yz7.m2135g(bArr2, i9, c40786fA7);
                                    unsafe2.putLong(t, j2, HK7.m103991a(c40786fA7.f79636b));
                                    i24 |= i32;
                                    i23 = i6;
                                    c40786fA74 = c40786fA7;
                                    i21 = m2135g2;
                                    i18 = i2;
                                    i19 = i3;
                                    break;
                                } else {
                                    i15 = i9;
                                    i16 = i22;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            case 17:
                                if (i27 == 3) {
                                    i6 = i30;
                                    i20 = -1;
                                    i21 = m51509o(c17504e.m51533B(m51528G), bArr, i9, i2, (i26 << 3) | 4, c40786fA7);
                                    c40786fA73 = c40786fA7;
                                    unsafe2.putObject(t3, j2, (i24 & i32) == 0 ? c40786fA73.f79637c : C37975aT7.m71329d(unsafe2.getObject(t3, j2), c40786fA73.f79637c));
                                    i24 |= i32;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i23 = i6;
                                    c40786fA74 = c40786fA73;
                                    i19 = i3;
                                    break;
                                } else {
                                    i6 = i30;
                                    i15 = i9;
                                    i16 = i22;
                                    i22 = i16;
                                    i4 = i3;
                                    i14 = i15;
                                    unsafe = unsafe2;
                                    if (i6 != i4) {
                                    }
                                    i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i4;
                                    i23 = i6;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    c40786fA74 = c40786fA7;
                                    break;
                                }
                                break;
                            default:
                                i6 = i30;
                                i15 = i9;
                                i16 = i22;
                                i22 = i16;
                                i4 = i3;
                                i14 = i15;
                                unsafe = unsafe2;
                                if (i6 != i4) {
                                }
                                i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                                c17504e = this;
                                t3 = t;
                                bArr2 = bArr;
                                i18 = i2;
                                i19 = i4;
                                i23 = i6;
                                unsafe2 = unsafe;
                                i20 = -1;
                                c40786fA74 = c40786fA7;
                                break;
                        }
                    } else {
                        int i35 = i9;
                        i13 = i22;
                        bArr2 = bArr;
                        if (i29 != 27) {
                            i12 = i24;
                            if (i29 <= 49) {
                                i11 = i30;
                                unsafe = unsafe2;
                                i21 = m51513k(t, bArr, i35, i2, i30, i26, i27, m51528G, i28, i29, j2, c40786fA7);
                                if (i21 == i35) {
                                    i6 = i11;
                                    i4 = i3;
                                    i14 = i21;
                                    i22 = i13;
                                    i24 = i12;
                                } else {
                                    c17504e = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i23 = i11;
                                    i18 = i2;
                                    i19 = i3;
                                    c40786fA74 = c40786fA7;
                                    i22 = i13;
                                    i24 = i12;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                }
                            } else {
                                i10 = i35;
                                i11 = i30;
                                unsafe = unsafe2;
                                if (i29 != 50) {
                                    i21 = m51514j(t, bArr, i10, i2, i11, i26, i27, i28, i29, j2, m51528G, c40786fA7);
                                    if (i21 == i10) {
                                        i6 = i11;
                                        i4 = i3;
                                        i14 = i21;
                                        i22 = i13;
                                        i24 = i12;
                                    } else {
                                        c17504e = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        i23 = i11;
                                        i18 = i2;
                                        i19 = i3;
                                        c40786fA74 = c40786fA7;
                                        i22 = i13;
                                        i24 = i12;
                                        unsafe2 = unsafe;
                                        i20 = -1;
                                    }
                                } else if (i27 == 2) {
                                    i21 = m51512l(t, bArr, i10, i2, m51528G, i26, j2, c40786fA7);
                                    if (i21 == i10) {
                                        i6 = i11;
                                        i4 = i3;
                                        i14 = i21;
                                        i22 = i13;
                                        i24 = i12;
                                    } else {
                                        c17504e = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        i23 = i11;
                                        i18 = i2;
                                        i19 = i3;
                                        c40786fA74 = c40786fA7;
                                        i22 = i13;
                                        i24 = i12;
                                        unsafe2 = unsafe;
                                        i20 = -1;
                                    }
                                } else {
                                    i6 = i11;
                                    i4 = i3;
                                    i14 = i10;
                                    i22 = i13;
                                    i24 = i12;
                                }
                            }
                            if (i6 != i4) {
                            }
                            i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                            c17504e = this;
                            t3 = t;
                            bArr2 = bArr;
                            i18 = i2;
                            i19 = i4;
                            i23 = i6;
                            unsafe2 = unsafe;
                            i20 = -1;
                            c40786fA74 = c40786fA7;
                        } else if (i27 == 2) {
                            InterfaceC47489qU7 interfaceC47489qU7 = (InterfaceC47489qU7) unsafe2.getObject(t3, j2);
                            if (!interfaceC47489qU7.mo17485i()) {
                                int size = interfaceC47489qU7.size();
                                interfaceC47489qU7 = interfaceC47489qU7.mo1502n(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t3, j2, interfaceC47489qU7);
                            }
                            InterfaceC47489qU7 interfaceC47489qU72 = interfaceC47489qU7;
                            InterfaceC51439x88 m51533B = c17504e.m51533B(m51528G);
                            i23 = i30;
                            i21 = m51510n(m51533B, i23, bArr, i35, i2, interfaceC47489qU72, c40786fA7);
                            i18 = i2;
                            i19 = i3;
                            i22 = i13;
                            i24 = i24;
                            i20 = -1;
                            c40786fA74 = c40786fA7;
                        } else {
                            i12 = i24;
                            i10 = i35;
                            i11 = i30;
                        }
                    }
                } else {
                    i10 = i9;
                    i11 = b;
                    i12 = i24;
                    i13 = i22;
                }
                unsafe = unsafe2;
                i6 = i11;
                i4 = i3;
                i14 = i10;
                i22 = i13;
                i24 = i12;
                if (i6 != i4) {
                }
                i21 = m51515i(i6, bArr, i14, i2, t, c40786fA7);
                c17504e = this;
                t3 = t;
                bArr2 = bArr;
                i18 = i2;
                i19 = i4;
                i23 = i6;
                unsafe2 = unsafe;
                i20 = -1;
                c40786fA74 = c40786fA7;
            } else {
                int i36 = i22;
                unsafe = unsafe2;
                i4 = i19;
                i5 = i21;
                i6 = i23;
                i7 = i36;
                i8 = -1;
            }
        }
        if (i7 != i8) {
            t2 = t;
            unsafe.putInt(t2, i7, i24);
        } else {
            t2 = t;
        }
        int[] iArr2 = this.f70429l;
        if (iArr2 != null) {
            Object obj2 = null;
            for (int i37 : iArr2) {
                AbstractC32584Ed8 abstractC32584Ed8 = this.f70433p;
                int i38 = this.f70418a[i37];
                Object m88254M = C35410Qf8.m88254M(t2, m51530E(i37) & 1048575);
                if (m88254M != null && (m51531D = m51531D(i37)) != null) {
                    obj2 = m51505s(i37, i38, this.f70435r.mo21969h(m88254M), m51531D, obj2, abstractC32584Ed8);
                }
                obj2 = (C35626Rd8) obj2;
            }
            if (obj2 != null) {
                this.f70433p.mo51488h(t2, obj2);
            }
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw zzco.m51354d();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw zzco.m51354d();
        }
        return i5;
    }

    /* renamed from: s */
    public final <K, V, UT, UB> UB m51505s(int i, int i2, Map<K, V> map, DT7<?> dt7, UB ub, AbstractC32584Ed8<UT, UB> abstractC32584Ed8) {
        this.f70435r.mo21973d(m51532C(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (dt7.mo51476g(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = abstractC32584Ed8.mo51490f();
                }
                OH7 m84179u = TD7.m84179u(C51359x08.m5989a(null, next.getKey(), next.getValue()));
                try {
                    C51359x08.m5988b(m84179u.m92562b(), null, next.getKey(), next.getValue());
                    abstractC32584Ed8.mo51494b(ub, i2, m84179u.m92563a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: u */
    public final void m51503u(T t, T t2, int i) {
        long m51530E = m51530E(i) & 1048575;
        if (m51500x(t2, i)) {
            Object m88254M = C35410Qf8.m88254M(t, m51530E);
            Object m88254M2 = C35410Qf8.m88254M(t2, m51530E);
            if (m88254M != null && m88254M2 != null) {
                C35410Qf8.m88237i(t, m51530E, C37975aT7.m71329d(m88254M, m88254M2));
                m51527H(t, i);
            } else if (m88254M2 != null) {
                C35410Qf8.m88237i(t, m51530E, m88254M2);
                m51527H(t, i);
            }
        }
    }

    /* renamed from: w */
    public final <K, V> void m51501w(InterfaceC35212Pj8 interfaceC35212Pj8, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f70435r.mo21973d(m51532C(i2));
            interfaceC35212Pj8.mo34083Q(i, null, this.f70435r.mo21970g(obj));
        }
    }

    /* renamed from: x */
    public final boolean m51500x(T t, int i) {
        if (!this.f70426i) {
            int m51529F = m51529F(i);
            return (C35410Qf8.m88259H(t, (long) (m51529F & 1048575)) & (1 << (m51529F >>> 20))) != 0;
        }
        int m51530E = m51530E(i);
        long j = m51530E & 1048575;
        switch ((m51530E & 267386880) >>> 20) {
            case 0:
                return C35410Qf8.m88255L(t, j) != 0.0d;
            case 1:
                return C35410Qf8.m88256K(t, j) != 0.0f;
            case 2:
                return C35410Qf8.m88258I(t, j) != 0;
            case 3:
                return C35410Qf8.m88258I(t, j) != 0;
            case 4:
                return C35410Qf8.m88259H(t, j) != 0;
            case 5:
                return C35410Qf8.m88258I(t, j) != 0;
            case 6:
                return C35410Qf8.m88259H(t, j) != 0;
            case 7:
                return C35410Qf8.m88257J(t, j);
            case 8:
                Object m88254M = C35410Qf8.m88254M(t, j);
                if (m88254M instanceof String) {
                    return !((String) m88254M).isEmpty();
                } else if (m88254M instanceof TD7) {
                    return !TD7.f34940c.equals(m88254M);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return C35410Qf8.m88254M(t, j) != null;
            case 10:
                return !TD7.f34940c.equals(C35410Qf8.m88254M(t, j));
            case 11:
                return C35410Qf8.m88259H(t, j) != 0;
            case 12:
                return C35410Qf8.m88259H(t, j) != 0;
            case 13:
                return C35410Qf8.m88259H(t, j) != 0;
            case 14:
                return C35410Qf8.m88258I(t, j) != 0;
            case 15:
                return C35410Qf8.m88259H(t, j) != 0;
            case 16:
                return C35410Qf8.m88258I(t, j) != 0;
            case 17:
                return C35410Qf8.m88254M(t, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: y */
    public final boolean m51499y(T t, int i, int i2) {
        return C35410Qf8.m88259H(t, (long) (m51529F(i2) & 1048575)) == i;
    }

    /* renamed from: z */
    public final boolean m51498z(T t, int i, int i2, int i3) {
        return this.f70426i ? m51500x(t, i) : (i2 & i3) != 0;
    }

    @Override // p000.InterfaceC51439x88
    public final void zzc(T t) {
        int[] iArr = this.f70429l;
        if (iArr != null) {
            for (int i : iArr) {
                long m51530E = m51530E(i) & 1048575;
                Object m88254M = C35410Qf8.m88254M(t, m51530E);
                if (m88254M != null) {
                    C35410Qf8.m88237i(t, m51530E, this.f70435r.mo21972e(m88254M));
                }
            }
        }
        int[] iArr2 = this.f70430m;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.f70432o.mo27170a(t, i2);
            }
        }
        this.f70433p.mo51492d(t);
        if (this.f70424g) {
            this.f70434q.mo51567f(t);
        }
    }
}
