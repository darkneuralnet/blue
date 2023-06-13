package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: hr9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42378hr9 {

    /* renamed from: a */
    public static final Class<?> f86009a;

    /* renamed from: b */
    public static final Nr9<?, ?> f86010b;

    /* renamed from: c */
    public static final Nr9<?, ?> f86011c;

    /* renamed from: d */
    public static final Nr9<?, ?> f86012d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f86009a = cls;
        f86010b = m35751C(false);
        f86011c = m35751C(true);
        f86012d = new Rr9();
    }

    /* renamed from: A */
    public static int m35753A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC48228rj9.m15506l(i << 3) + 1);
    }

    /* renamed from: B */
    public static <T> void m35752B(Ap9 ap9, T t, T t2, long j) {
        Fs9.m106332x(t, j, Ap9.m115127b(Fs9.m106345k(t, j), Fs9.m106345k(t2, j)));
    }

    /* renamed from: C */
    public static Nr9<?, ?> m35751C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (Nr9) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m35750D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m35749E(int i, List<AbstractC45836nh9> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15507k = size * AbstractC48228rj9.m15507k(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m15507k += AbstractC48228rj9.m15516b(list.get(i2));
        }
        return m15507k;
    }

    /* renamed from: F */
    public static int m35748F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35747G(list) + (size * AbstractC48228rj9.m15507k(i));
    }

    /* renamed from: G */
    public static int m35747G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15513e(km9.m98295b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15513e(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m35746H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC48228rj9.m15506l(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m35745I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m35744J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC48228rj9.m15506l(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m35743K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m35742L(int i, List<Np9> list, InterfaceC38803br9 interfaceC38803br9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC48228rj9.m15515c(i, list.get(i3), interfaceC38803br9);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m35741M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35740N(list) + (size * AbstractC48228rj9.m15507k(i));
    }

    /* renamed from: N */
    public static int m35740N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15513e(km9.m98295b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15513e(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m35739O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m35738P(list) + (list.size() * AbstractC48228rj9.m15507k(i));
    }

    /* renamed from: P */
    public static int m35738P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41172fp9) {
            C41172fp9 c41172fp9 = (C41172fp9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15505m(c41172fp9.m40784b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15505m(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m35737Q(int i, Object obj, InterfaceC38803br9 interfaceC38803br9) {
        if (obj instanceof C38180ao9) {
            int m15506l = AbstractC48228rj9.m15506l(i << 3);
            int m65454a = ((C38180ao9) obj).m65454a();
            return m15506l + AbstractC48228rj9.m15506l(m65454a) + m65454a;
        }
        return AbstractC48228rj9.m15506l(i << 3) + AbstractC48228rj9.m15510h((Np9) obj, interfaceC38803br9);
    }

    /* renamed from: R */
    public static int m35736R(int i, List<?> list, InterfaceC38803br9 interfaceC38803br9) {
        int m15510h;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15507k = AbstractC48228rj9.m15507k(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C38180ao9) {
                m15510h = AbstractC48228rj9.m15512f((C38180ao9) obj);
            } else {
                m15510h = AbstractC48228rj9.m15510h((Np9) obj, interfaceC38803br9);
            }
            m15507k += m15510h;
        }
        return m15507k;
    }

    /* renamed from: S */
    public static int m35735S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35734T(list) + (size * AbstractC48228rj9.m15507k(i));
    }

    /* renamed from: T */
    public static int m35734T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            i = 0;
            while (i2 < size) {
                int m98295b = km9.m98295b(i2);
                i += AbstractC48228rj9.m15506l((m98295b >> 31) ^ (m98295b + m98295b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += AbstractC48228rj9.m15506l((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m35733U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35732V(list) + (size * AbstractC48228rj9.m15507k(i));
    }

    /* renamed from: V */
    public static int m35732V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41172fp9) {
            C41172fp9 c41172fp9 = (C41172fp9) list;
            i = 0;
            while (i2 < size) {
                long m40784b = c41172fp9.m40784b(i2);
                i += AbstractC48228rj9.m15505m((m40784b >> 63) ^ (m40784b + m40784b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += AbstractC48228rj9.m15505m((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m35731W(int i, List<?> list) {
        int m15508j;
        int m15508j2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m15507k = AbstractC48228rj9.m15507k(i) * size;
        if (list instanceof InterfaceC44127ko9) {
            InterfaceC44127ko9 interfaceC44127ko9 = (InterfaceC44127ko9) list;
            while (i2 < size) {
                Object zzf = interfaceC44127ko9.zzf(i2);
                if (zzf instanceof AbstractC45836nh9) {
                    m15508j2 = AbstractC48228rj9.m15516b((AbstractC45836nh9) zzf);
                } else {
                    m15508j2 = AbstractC48228rj9.m15508j((String) zzf);
                }
                m15507k += m15508j2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC45836nh9) {
                    m15508j = AbstractC48228rj9.m15516b((AbstractC45836nh9) obj);
                } else {
                    m15508j = AbstractC48228rj9.m15508j((String) obj);
                }
                m15507k += m15508j;
                i2++;
            }
        }
        return m15507k;
    }

    /* renamed from: X */
    public static int m35730X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35729Y(list) + (size * AbstractC48228rj9.m15507k(i));
    }

    /* renamed from: Y */
    public static int m35729Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15506l(km9.m98295b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15506l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m35728Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35726a0(list) + (size * AbstractC48228rj9.m15507k(i));
    }

    /* renamed from: a */
    public static Nr9<?, ?> m35727a() {
        return f86011c;
    }

    /* renamed from: a0 */
    public static int m35726a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41172fp9) {
            C41172fp9 c41172fp9 = (C41172fp9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15505m(c41172fp9.m40784b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC48228rj9.m15505m(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static Nr9<?, ?> m35725b() {
        return f86012d;
    }

    /* renamed from: b0 */
    public static Nr9<?, ?> m35724b0() {
        return f86010b;
    }

    /* renamed from: c */
    public static <UT, UB> UB m35723c(int i, List<Integer> list, InterfaceC39356cn9 interfaceC39356cn9, UB ub, Nr9<UT, UB> nr9) {
        if (interfaceC39356cn9 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC39356cn9.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m35722d(i, intValue, ub, nr9);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC39356cn9.zza(intValue2)) {
                    ub = (UB) m35722d(i, intValue2, ub, nr9);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    public static <UT, UB> UB m35722d(int i, int i2, UB ub, Nr9<UT, UB> nr9) {
        if (ub == null) {
            ub = nr9.mo86263f();
        }
        nr9.mo86257l(ub, i, i2);
        return ub;
    }

    /* renamed from: e */
    public static <T, FT extends Pk9<FT>> void m35721e(AbstractC52387yk9<FT> abstractC52387yk9, T t, T t2) {
        abstractC52387yk9.mo2669a(t2);
        throw null;
    }

    /* renamed from: f */
    public static <T, UT, UB> void m35720f(Nr9<UT, UB> nr9, T t, T t2) {
        nr9.mo86254o(t, nr9.mo86264e(nr9.mo86265d(t), nr9.mo86265d(t2)));
    }

    /* renamed from: g */
    public static void m35719g(Class<?> cls) {
        Class<?> cls2;
        if (!Em9.class.isAssignableFrom(cls) && (cls2 = f86009a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m35718h(int i, List<Boolean> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2741a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m35717i(int i, List<AbstractC45836nh9> list, Vs9 vs9) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2730l(i, list);
        }
    }

    /* renamed from: j */
    public static void m35716j(int i, List<Double> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2738d(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m35715k(int i, List<Integer> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2739c(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m35714l(int i, List<Integer> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2740b(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m35713m(int i, List<Long> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2737e(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m35712n(int i, List<Float> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2726p(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m35711o(int i, List<?> list, Vs9 vs9, InterfaceC38803br9 interfaceC38803br9) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C52377yj9) vs9).mo2744I(i, list.get(i2), interfaceC38803br9);
            }
        }
    }

    /* renamed from: p */
    public static void m35710p(int i, List<Integer> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2728n(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m35709q(int i, List<Long> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2725q(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m35708r(int i, List<?> list, Vs9 vs9, InterfaceC38803br9 interfaceC38803br9) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C52377yj9) vs9).mo2746G(i, list.get(i2), interfaceC38803br9);
            }
        }
    }

    /* renamed from: s */
    public static void m35707s(int i, List<Integer> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2748E(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m35706t(int i, List<Long> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2723s(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m35705u(int i, List<Integer> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2717y(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m35704v(int i, List<Long> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2716z(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m35703w(int i, List<String> list, Vs9 vs9) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2752A(i, list);
        }
    }

    /* renamed from: x */
    public static void m35702x(int i, List<Integer> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2718x(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m35701y(int i, List<Long> list, Vs9 vs9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vs9.mo2750C(i, list, z);
        }
    }

    /* renamed from: z */
    public static boolean m35700z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
