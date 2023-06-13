package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18225q;
import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.N */
/* loaded from: classes6.dex */
public final class C18158N {

    /* renamed from: a */
    public static final Class<?> f74053a = m47983B();

    /* renamed from: b */
    public static final AbstractC18169P<?, ?> f74054b = m47982C(false);

    /* renamed from: c */
    public static final AbstractC18169P<?, ?> f74055c = m47982C(true);

    /* renamed from: d */
    public static final AbstractC18169P<?, ?> f74056d = new C18171S();

    private C18158N() {
    }

    /* renamed from: A */
    public static <UT, UB> UB m47984A(int i, List<Integer> list, C18238v.InterfaceC18243e interfaceC18243e, UB ub, AbstractC18169P<UT, UB> abstractC18169P) {
        if (interfaceC18243e == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC18243e.m47413a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m47973L(i, intValue, ub, abstractC18169P);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC18243e.m47413a(intValue2)) {
                    ub = (UB) m47973L(i, intValue2, ub, abstractC18169P);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    public static Class<?> m47983B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static AbstractC18169P<?, ?> m47982C(boolean z) {
        try {
            Class<?> m47981D = m47981D();
            if (m47981D == null) {
                return null;
            }
            return (AbstractC18169P) m47981D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class<?> m47981D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static <T, FT extends C18225q.InterfaceC18227b<FT>> void m47980E(AbstractC18221n<FT> abstractC18221n, T t, T t2) {
        C18225q<FT> mo47525c = abstractC18221n.mo47525c(t2);
        if (!mo47525c.m47505m()) {
            abstractC18221n.mo47524d(t).m47498t(mo47525c);
        }
    }

    /* renamed from: F */
    public static <T> void m47979F(InterfaceC18147D interfaceC18147D, T t, T t2, long j) {
        C52917ze6.m917R(t, j, interfaceC18147D.mo48095c(C52917ze6.m932C(t, j), C52917ze6.m932C(t2, j)));
    }

    /* renamed from: G */
    public static <T, UT, UB> void m47978G(AbstractC18169P<UT, UB> abstractC18169P, T t, T t2) {
        abstractC18169P.mo47856p(t, abstractC18169P.mo47859k(abstractC18169P.mo47863g(t), abstractC18169P.mo47863g(t2)));
    }

    /* renamed from: H */
    public static AbstractC18169P<?, ?> m47977H() {
        return f74054b;
    }

    /* renamed from: I */
    public static AbstractC18169P<?, ?> m47976I() {
        return f74055c;
    }

    /* renamed from: J */
    public static void m47975J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC18230t.class.isAssignableFrom(cls) && (cls2 = f74053a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m47974K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    public static <UT, UB> UB m47973L(int i, int i2, UB ub, AbstractC18169P<UT, UB> abstractC18169P) {
        if (ub == null) {
            ub = abstractC18169P.mo47858n();
        }
        abstractC18169P.mo47865e(ub, i, i2);
        return ub;
    }

    /* renamed from: M */
    public static AbstractC18169P<?, ?> m47972M() {
        return f74056d;
    }

    /* renamed from: N */
    public static void m47971N(int i, List<Boolean> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47581E(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m47970O(int i, List<AbstractC18199g> list, InterfaceC18186V interfaceC18186V) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47547u(i, list);
        }
    }

    /* renamed from: P */
    public static void m47969P(int i, List<Double> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47548t(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m47968Q(int i, List<Integer> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47543y(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m47967R(int i, List<Integer> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47560h(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m47966S(int i, List<Long> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47551q(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m47965T(int i, List<Float> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47567a(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m47964U(int i, List<?> list, InterfaceC18186V interfaceC18186V, InterfaceC18157M interfaceC18157M) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47572N(i, list, interfaceC18157M);
        }
    }

    /* renamed from: V */
    public static void m47963V(int i, List<Integer> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47562f(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m47962W(int i, List<Long> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47578H(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m47961X(int i, List<?> list, InterfaceC18186V interfaceC18186V, InterfaceC18157M interfaceC18157M) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47574L(i, list, interfaceC18157M);
        }
    }

    /* renamed from: Y */
    public static void m47960Y(int i, List<Integer> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47582D(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m47959Z(int i, List<Long> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47585A(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m47958a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(size);
        }
        return size * CodedOutputStream.m48158d(i, true);
    }

    /* renamed from: a0 */
    public static void m47957a0(int i, List<Integer> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47549s(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m47956b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m47955b0(int i, List<Long> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47544x(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m47954c(int i, List<AbstractC18199g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m48169U = size * CodedOutputStream.m48169U(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m48169U += CodedOutputStream.m48152h(list.get(i2));
        }
        return m48169U;
    }

    /* renamed from: c0 */
    public static void m47953c0(int i, List<String> list, InterfaceC18186V interfaceC18186V) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47546v(i, list);
        }
    }

    /* renamed from: d */
    public static int m47952d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m47950e = m47950e(list);
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(m47950e);
        }
        return m47950e + (size * CodedOutputStream.m48169U(i));
    }

    /* renamed from: d0 */
    public static void m47951d0(int i, List<Integer> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47559i(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m47950e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48146l(c18237u.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48146l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m47949e0(int i, List<Long> list, InterfaceC18186V interfaceC18186V, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC18186V.mo47556l(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m47948f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(size * 4);
        }
        return size * CodedOutputStream.m48144m(i, 0);
    }

    /* renamed from: g */
    public static int m47947g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m47946h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(size * 8);
        }
        return size * CodedOutputStream.m48140o(i, 0L);
    }

    /* renamed from: i */
    public static int m47945i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m47944j(int i, List<InterfaceC18149F> list, InterfaceC18157M interfaceC18157M) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m48136s(i, list.get(i3), interfaceC18157M);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m47943k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m47942l = m47942l(list);
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(m47942l);
        }
        return m47942l + (size * CodedOutputStream.m48169U(i));
    }

    /* renamed from: l */
    public static int m47942l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48128w(c18237u.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48128w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m47941m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int m47940n = m47940n(list);
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(m47940n);
        }
        return m47940n + (list.size() * CodedOutputStream.m48169U(i));
    }

    /* renamed from: n */
    public static int m47940n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18141A) {
            C18141A c18141a = (C18141A) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48126y(c18141a.m48218o(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48126y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m47939o(int i, Object obj, InterfaceC18157M interfaceC18157M) {
        if (obj instanceof C18252x) {
            return CodedOutputStream.m48197A(i, (C18252x) obj);
        }
        return CodedOutputStream.m48190F(i, (InterfaceC18149F) obj, interfaceC18157M);
    }

    /* renamed from: p */
    public static int m47938p(int i, List<?> list, InterfaceC18157M interfaceC18157M) {
        int m48186H;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m48169U = CodedOutputStream.m48169U(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C18252x) {
                m48186H = CodedOutputStream.m48196B((C18252x) obj);
            } else {
                m48186H = CodedOutputStream.m48186H((InterfaceC18149F) obj, interfaceC18157M);
            }
            m48169U += m48186H;
        }
        return m48169U;
    }

    /* renamed from: q */
    public static int m47937q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m47936r = m47936r(list);
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(m47936r);
        }
        return m47936r + (size * CodedOutputStream.m48169U(i));
    }

    /* renamed from: r */
    public static int m47936r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48174P(c18237u.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48174P(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m47935s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m47934t = m47934t(list);
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(m47934t);
        }
        return m47934t + (size * CodedOutputStream.m48169U(i));
    }

    /* renamed from: t */
    public static int m47934t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18141A) {
            C18141A c18141a = (C18141A) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48172R(c18141a.m48218o(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48172R(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m47933u(int i, List<?> list) {
        int m48170T;
        int m48170T2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m48169U = CodedOutputStream.m48169U(i) * size;
        if (list instanceof InterfaceC35251Po2) {
            InterfaceC35251Po2 interfaceC35251Po2 = (InterfaceC35251Po2) list;
            while (i2 < size) {
                Object mo11974l = interfaceC35251Po2.mo11974l(i2);
                if (mo11974l instanceof AbstractC18199g) {
                    m48170T2 = CodedOutputStream.m48152h((AbstractC18199g) mo11974l);
                } else {
                    m48170T2 = CodedOutputStream.m48170T((String) mo11974l);
                }
                m48169U += m48170T2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC18199g) {
                    m48170T = CodedOutputStream.m48152h((AbstractC18199g) obj);
                } else {
                    m48170T = CodedOutputStream.m48170T((String) obj);
                }
                m48169U += m48170T;
                i2++;
            }
        }
        return m48169U;
    }

    /* renamed from: v */
    public static int m47932v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m47931w = m47931w(list);
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(m47931w);
        }
        return m47931w + (size * CodedOutputStream.m48169U(i));
    }

    /* renamed from: w */
    public static int m47931w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48167W(c18237u.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48167W(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m47930x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m47929y = m47929y(list);
        if (z) {
            return CodedOutputStream.m48169U(i) + CodedOutputStream.m48195C(m47929y);
        }
        return m47929y + (size * CodedOutputStream.m48169U(i));
    }

    /* renamed from: y */
    public static int m47929y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18141A) {
            C18141A c18141a = (C18141A) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48165Y(c18141a.m48218o(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m48165Y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m47928z(int i, List<Integer> list, C18238v.InterfaceC18242d<?> interfaceC18242d, UB ub, AbstractC18169P<UT, UB> abstractC18169P) {
        if (interfaceC18242d == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC18242d.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m47973L(i, intValue, ub, abstractC18169P);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (interfaceC18242d.findValueByNumber(intValue2) == null) {
                    ub = (UB) m47973L(i, intValue2, ub, abstractC18169P);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
