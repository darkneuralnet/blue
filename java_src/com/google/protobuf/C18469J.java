package com.google.protobuf;

import com.google.protobuf.C18531o;
import com.google.protobuf.C18544t;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.J */
/* loaded from: classes6.dex */
public final class C18469J {

    /* renamed from: a */
    public static final Class<?> f74720a = m46526B();

    /* renamed from: b */
    public static final AbstractC18480L<?, ?> f74721b = m46525C(false);

    /* renamed from: c */
    public static final AbstractC18480L<?, ?> f74722c = m46525C(true);

    /* renamed from: d */
    public static final AbstractC18480L<?, ?> f74723d = new C18482N();

    private C18469J() {
    }

    /* renamed from: A */
    public static <UT, UB> UB m46527A(Object obj, int i, List<Integer> list, C18544t.InterfaceC18549e interfaceC18549e, UB ub, AbstractC18480L<UT, UB> abstractC18480L) {
        if (interfaceC18549e == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC18549e.mo33504a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m46516L(obj, i, intValue, ub, abstractC18480L);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC18549e.mo33504a(intValue2)) {
                    ub = (UB) m46516L(obj, i, intValue2, ub, abstractC18480L);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    public static Class<?> m46526B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static AbstractC18480L<?, ?> m46525C(boolean z) {
        try {
            Class<?> m46524D = m46524D();
            if (m46524D == null) {
                return null;
            }
            return (AbstractC18480L) m46524D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class<?> m46524D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static <T, FT extends C18531o.InterfaceC18533b<FT>> void m46523E(AbstractC18527l<FT> abstractC18527l, T t, T t2) {
        C18531o<FT> mo46118c = abstractC18527l.mo46118c(t2);
        if (!mo46118c.m46095n()) {
            abstractC18527l.mo46117d(t).m46087v(mo46118c);
        }
    }

    /* renamed from: F */
    public static <T> void m46522F(InterfaceC18458B interfaceC18458B, T t, T t2, long j) {
        C52324ye6.m3090R(t, j, interfaceC18458B.mo46738c(C52324ye6.m3105C(t, j), C52324ye6.m3105C(t2, j)));
    }

    /* renamed from: G */
    public static <T, UT, UB> void m46521G(AbstractC18480L<UT, UB> abstractC18480L, T t, T t2) {
        abstractC18480L.mo46398p(t, abstractC18480L.mo46401k(abstractC18480L.mo46405g(t), abstractC18480L.mo46405g(t2)));
    }

    /* renamed from: H */
    public static AbstractC18480L<?, ?> m46520H() {
        return f74721b;
    }

    /* renamed from: I */
    public static AbstractC18480L<?, ?> m46519I() {
        return f74722c;
    }

    /* renamed from: J */
    public static void m46518J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC18536r.class.isAssignableFrom(cls) && (cls2 = f74720a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m46517K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    public static <UT, UB> UB m46516L(Object obj, int i, int i2, UB ub, AbstractC18480L<UT, UB> abstractC18480L) {
        if (ub == null) {
            ub = abstractC18480L.mo46406f(obj);
        }
        abstractC18480L.mo46407e(ub, i, i2);
        return ub;
    }

    /* renamed from: M */
    public static AbstractC18480L<?, ?> m46515M() {
        return f74723d;
    }

    /* renamed from: N */
    public static void m46514N(int i, List<Boolean> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46178E(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m46513O(int i, List<AbstractC18504e> list, InterfaceC18497Q interfaceC18497Q) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46140u(i, list);
        }
    }

    /* renamed from: P */
    public static void m46512P(int i, List<Double> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46141t(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m46511Q(int i, List<Integer> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46136y(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m46510R(int i, List<Integer> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46153h(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m46509S(int i, List<Long> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46144q(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m46508T(int i, List<Float> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46160a(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m46507U(int i, List<?> list, InterfaceC18497Q interfaceC18497Q, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46168O(i, list, interfaceC33832Jm5);
        }
    }

    /* renamed from: V */
    public static void m46506V(int i, List<Integer> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46155f(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m46505W(int i, List<Long> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46175H(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m46504X(int i, List<?> list, InterfaceC18497Q interfaceC18497Q, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46171L(i, list, interfaceC33832Jm5);
        }
    }

    /* renamed from: Y */
    public static void m46503Y(int i, List<Integer> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46179D(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m46502Z(int i, List<Long> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46182A(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m46501a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(size);
        }
        return size * CodedOutputStream.m46689d(i, true);
    }

    /* renamed from: a0 */
    public static void m46500a0(int i, List<Integer> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46142s(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m46499b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m46498b0(int i, List<Long> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46137x(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m46497c(int i, List<AbstractC18504e> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m46701T = size * CodedOutputStream.m46701T(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m46701T += CodedOutputStream.m46684h(list.get(i2));
        }
        return m46701T;
    }

    /* renamed from: c0 */
    public static void m46496c0(int i, List<String> list, InterfaceC18497Q interfaceC18497Q) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46139v(i, list);
        }
    }

    /* renamed from: d */
    public static int m46495d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m46493e = m46493e(list);
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(m46493e);
        }
        return m46493e + (size * CodedOutputStream.m46701T(i));
    }

    /* renamed from: d0 */
    public static void m46494d0(int i, List<Integer> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46152i(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m46493e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46678l(c18543s.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46678l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m46492e0(int i, List<Long> list, InterfaceC18497Q interfaceC18497Q, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18497Q.mo46149l(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m46491f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(size * 4);
        }
        return size * CodedOutputStream.m46677m(i, 0);
    }

    /* renamed from: g */
    public static int m46490g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m46489h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(size * 8);
        }
        return size * CodedOutputStream.m46673o(i, 0L);
    }

    /* renamed from: i */
    public static int m46488i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m46487j(int i, List<InterfaceC18462D> list, InterfaceC33832Jm5 interfaceC33832Jm5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m46667s(i, list.get(i3), interfaceC33832Jm5);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m46486k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m46485l = m46485l(list);
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(m46485l);
        }
        return m46485l + (size * CodedOutputStream.m46701T(i));
    }

    /* renamed from: l */
    public static int m46485l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46661w(c18543s.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46661w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m46484m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int m46483n = m46483n(list);
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(m46483n);
        }
        return m46483n + (list.size() * CodedOutputStream.m46701T(i));
    }

    /* renamed from: n */
    public static int m46483n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18564y) {
            C18564y c18564y = (C18564y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46657y(c18564y.m45958o(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46657y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m46482o(int i, Object obj, InterfaceC33832Jm5 interfaceC33832Jm5) {
        if (obj instanceof C18558v) {
            return CodedOutputStream.m46730A(i, (C18558v) obj);
        }
        return CodedOutputStream.m46723F(i, (InterfaceC18462D) obj, interfaceC33832Jm5);
    }

    /* renamed from: p */
    public static int m46481p(int i, List<?> list, InterfaceC33832Jm5 interfaceC33832Jm5) {
        int m46721H;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m46701T = CodedOutputStream.m46701T(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C18558v) {
                m46721H = CodedOutputStream.m46729B((C18558v) obj);
            } else {
                m46721H = CodedOutputStream.m46721H((InterfaceC18462D) obj, interfaceC33832Jm5);
            }
            m46701T += m46721H;
        }
        return m46701T;
    }

    /* renamed from: q */
    public static int m46480q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m46479r = m46479r(list);
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(m46479r);
        }
        return m46479r + (size * CodedOutputStream.m46701T(i));
    }

    /* renamed from: r */
    public static int m46479r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46708O(c18543s.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46708O(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m46478s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m46477t = m46477t(list);
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(m46477t);
        }
        return m46477t + (size * CodedOutputStream.m46701T(i));
    }

    /* renamed from: t */
    public static int m46477t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18564y) {
            C18564y c18564y = (C18564y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46704Q(c18564y.m45958o(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46704Q(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m46476u(int i, List<?> list) {
        int m46702S;
        int m46702S2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m46701T = CodedOutputStream.m46701T(i) * size;
        if (list instanceof InterfaceC35017Oo2) {
            InterfaceC35017Oo2 interfaceC35017Oo2 = (InterfaceC35017Oo2) list;
            while (i2 < size) {
                Object mo13907l = interfaceC35017Oo2.mo13907l(i2);
                if (mo13907l instanceof AbstractC18504e) {
                    m46702S2 = CodedOutputStream.m46684h((AbstractC18504e) mo13907l);
                } else {
                    m46702S2 = CodedOutputStream.m46702S((String) mo13907l);
                }
                m46701T += m46702S2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC18504e) {
                    m46702S = CodedOutputStream.m46684h((AbstractC18504e) obj);
                } else {
                    m46702S = CodedOutputStream.m46702S((String) obj);
                }
                m46701T += m46702S;
                i2++;
            }
        }
        return m46701T;
    }

    /* renamed from: v */
    public static int m46475v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m46474w = m46474w(list);
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(m46474w);
        }
        return m46474w + (size * CodedOutputStream.m46701T(i));
    }

    /* renamed from: w */
    public static int m46474w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46699V(c18543s.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46699V(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m46473x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m46472y = m46472y(list);
        if (z) {
            return CodedOutputStream.m46701T(i) + CodedOutputStream.m46728C(m46472y);
        }
        return m46472y + (size * CodedOutputStream.m46701T(i));
    }

    /* renamed from: y */
    public static int m46472y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18564y) {
            C18564y c18564y = (C18564y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46697X(c18564y.m45958o(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m46697X(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m46471z(Object obj, int i, List<Integer> list, C18544t.InterfaceC18548d<?> interfaceC18548d, UB ub, AbstractC18480L<UT, UB> abstractC18480L) {
        if (interfaceC18548d == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC18548d.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m46516L(obj, i, intValue, ub, abstractC18480L);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (interfaceC18548d.findValueByNumber(intValue2) == null) {
                    ub = (UB) m46516L(obj, i, intValue2, ub, abstractC18480L);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
