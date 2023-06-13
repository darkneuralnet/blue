package p000;

import com.google.android.gms.internal.vision.AbstractC17554G;
import com.google.android.gms.internal.vision.C17565L;
import com.google.android.gms.internal.vision.zzii;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: UU8 */
/* loaded from: classes6.dex */
public final class UU8 {

    /* renamed from: a */
    public static final Class<?> f37475a = m81455F();

    /* renamed from: b */
    public static final AbstractC41003fY8<?, ?> f37476b = m81422i(false);

    /* renamed from: c */
    public static final AbstractC41003fY8<?, ?> f37477c = m81422i(true);

    /* renamed from: d */
    public static final AbstractC41003fY8<?, ?> f37478d = new C17565L();

    /* renamed from: A */
    public static int m81460A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m50804n0(pm8.m90368c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.m50804n0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static AbstractC41003fY8<?, ?> m81459B() {
        return f37478d;
    }

    /* renamed from: C */
    public static void m81458C(int i, List<Long> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21600a(i, list, z);
        }
    }

    /* renamed from: D */
    public static int m81457D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m81456E(list) + (size * zzii.m50814g0(i));
    }

    /* renamed from: E */
    public static int m81456E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m50845B0(c37877aI8.m71673b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.m50845B0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static Class<?> m81455F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static void m81454G(int i, List<Long> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21583r(i, list, z);
        }
    }

    /* renamed from: H */
    public static int m81453H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m81452I(list) + (size * zzii.m50814g0(i));
    }

    /* renamed from: I */
    public static int m81452I(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m50808k0(c37877aI8.m71673b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.m50808k0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    public static Class<?> m81451J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static void m81450K(int i, List<Long> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21596e(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m81449L(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m81448M(list) + (size * zzii.m50814g0(i));
    }

    /* renamed from: M */
    public static int m81448M(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m50803o0(c37877aI8.m71673b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.m50803o0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: N */
    public static void m81447N(int i, List<Long> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21584q(i, list, z);
        }
    }

    /* renamed from: O */
    public static int m81446O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m81445P(list) + (size * zzii.m50814g0(i));
    }

    /* renamed from: P */
    public static int m81445P(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m50799s0(c37877aI8.m71673b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.m50799s0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static void m81444Q(int i, List<Long> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21599b(i, list, z);
        }
    }

    /* renamed from: R */
    public static int m81443R(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.m50793x0(i, 0);
    }

    /* renamed from: S */
    public static int m81442S(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: T */
    public static void m81441T(int i, List<Integer> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21579v(i, list, z);
        }
    }

    /* renamed from: U */
    public static int m81440U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.m50801q0(i, 0L);
    }

    /* renamed from: V */
    public static int m81439V(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: W */
    public static void m81438W(int i, List<Integer> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21598c(i, list, z);
        }
    }

    /* renamed from: X */
    public static int m81437X(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.m50836H(i, true);
    }

    /* renamed from: Y */
    public static int m81436Y(List<?> list) {
        return list.size();
    }

    /* renamed from: Z */
    public static void m81435Z(int i, List<Integer> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21581t(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m81434a(int i, Object obj, InterfaceC52825zU8 interfaceC52825zU8) {
        if (obj instanceof IL8) {
            return zzii.m50821c(i, (IL8) obj);
        }
        return zzii.m50837G(i, (InterfaceC44489lQ8) obj, interfaceC52825zU8);
    }

    /* renamed from: a0 */
    public static void m81433a0(int i, List<Integer> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21591j(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m81432b(int i, List<?> list) {
        int m50835I;
        int m50835I2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m50814g0 = zzii.m50814g0(i) * size;
        if (list instanceof InterfaceC41488gM8) {
            InterfaceC41488gM8 interfaceC41488gM8 = (InterfaceC41488gM8) list;
            while (i2 < size) {
                Object mo6975g = interfaceC41488gM8.mo6975g(i2);
                if (mo6975g instanceof AbstractC53119zy8) {
                    m50835I2 = zzii.m50834J((AbstractC53119zy8) mo6975g);
                } else {
                    m50835I2 = zzii.m50835I((String) mo6975g);
                }
                m50814g0 += m50835I2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC53119zy8) {
                    m50835I = zzii.m50834J((AbstractC53119zy8) obj);
                } else {
                    m50835I = zzii.m50835I((String) obj);
                }
                m50814g0 += m50835I;
                i2++;
            }
        }
        return m50814g0;
    }

    /* renamed from: b0 */
    public static void m81431b0(int i, List<Integer> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21585p(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m81430c(int i, List<?> list, InterfaceC52825zU8 interfaceC52825zU8) {
        int m50817e;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m50814g0 = zzii.m50814g0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof IL8) {
                m50817e = zzii.m50819d((IL8) obj);
            } else {
                m50817e = zzii.m50817e((InterfaceC44489lQ8) obj, interfaceC52825zU8);
            }
            m50814g0 += m50817e;
        }
        return m50814g0;
    }

    /* renamed from: c0 */
    public static void m81429c0(int i, List<Integer> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21586o(i, list, z);
        }
    }

    /* renamed from: d */
    public static int m81428d(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m81426e(list) + (list.size() * zzii.m50814g0(i));
    }

    /* renamed from: d0 */
    public static void m81427d0(int i, List<Boolean> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21587n(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m81426e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m50818d0(pm8.m90368c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.m50818d0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static <UT, UB> UB m81425f(int i, int i2, UB ub, AbstractC41003fY8<UT, UB> abstractC41003fY8) {
        if (ub == null) {
            ub = abstractC41003fY8.mo41197a();
        }
        abstractC41003fY8.mo41194d(ub, i, i2);
        return ub;
    }

    /* renamed from: g */
    public static <UT, UB> UB m81424g(int i, List<Integer> list, KI8 ki8, UB ub, AbstractC41003fY8<UT, UB> abstractC41003fY8) {
        if (ki8 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (ki8.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m81425f(i, intValue, ub, abstractC41003fY8);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!ki8.zza(intValue2)) {
                    ub = (UB) m81425f(i, intValue2, ub, abstractC41003fY8);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: h */
    public static AbstractC41003fY8<?, ?> m81423h() {
        return f37476b;
    }

    /* renamed from: i */
    public static AbstractC41003fY8<?, ?> m81422i(boolean z) {
        try {
            Class<?> m81451J = m81451J();
            if (m81451J == null) {
                return null;
            }
            return (AbstractC41003fY8) m81451J.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m81421j(int i, List<String> list, InterfaceC37736a39 interfaceC37736a39) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21607H(i, list);
        }
    }

    /* renamed from: k */
    public static void m81420k(int i, List<?> list, InterfaceC37736a39 interfaceC37736a39, InterfaceC52825zU8 interfaceC52825zU8) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21608G(i, list, interfaceC52825zU8);
        }
    }

    /* renamed from: l */
    public static void m81419l(int i, List<Double> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21597d(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m81418m(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC17554G.class.isAssignableFrom(cls) && (cls2 = f37475a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: n */
    public static <T, FT extends OF8<FT>> void m81417n(AbstractC50309vE8<FT> abstractC50309vE8, T t, T t2) {
        C47355qF8<FT> mo8967d = abstractC50309vE8.mo8967d(t2);
        if (!mo8967d.f104998a.isEmpty()) {
            abstractC50309vE8.mo8962i(t).m17726f(mo8967d);
        }
    }

    /* renamed from: o */
    public static <T> void m81416o(EP8 ep8, T t, T t2, long j) {
        SZ8.m85254j(t, j, ep8.mo14229c(SZ8.m85273F(t, j), SZ8.m85273F(t2, j)));
    }

    /* renamed from: p */
    public static <T, UT, UB> void m81415p(AbstractC41003fY8<UT, UB> abstractC41003fY8, T t, T t2) {
        abstractC41003fY8.mo41191g(t, abstractC41003fY8.mo41182p(abstractC41003fY8.mo41187k(t), abstractC41003fY8.mo41187k(t2)));
    }

    /* renamed from: q */
    public static boolean m81414q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: r */
    public static int m81413r(int i, List<AbstractC53119zy8> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m50814g0 = size * zzii.m50814g0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m50814g0 += zzii.m50834J(list.get(i2));
        }
        return m50814g0;
    }

    /* renamed from: s */
    public static int m81412s(int i, List<InterfaceC44489lQ8> list, InterfaceC52825zU8 interfaceC52825zU8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzii.m50826U(i, list.get(i3), interfaceC52825zU8);
        }
        return i2;
    }

    /* renamed from: t */
    public static int m81411t(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m81410u(list) + (size * zzii.m50814g0(i));
    }

    /* renamed from: u */
    public static int m81410u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            i = 0;
            while (i2 < size) {
                i += zzii.m50810i0(pm8.m90368c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.m50810i0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v */
    public static AbstractC41003fY8<?, ?> m81409v() {
        return f37477c;
    }

    /* renamed from: w */
    public static void m81408w(int i, List<AbstractC53119zy8> list, InterfaceC37736a39 interfaceC37736a39) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21580u(i, list);
        }
    }

    /* renamed from: x */
    public static void m81407x(int i, List<?> list, InterfaceC37736a39 interfaceC37736a39, InterfaceC52825zU8 interfaceC52825zU8) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21612C(i, list, interfaceC52825zU8);
        }
    }

    /* renamed from: y */
    public static void m81406y(int i, List<Float> list, InterfaceC37736a39 interfaceC37736a39, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC37736a39.mo21582s(i, list, z);
        }
    }

    /* renamed from: z */
    public static int m81405z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m81460A(list) + (size * zzii.m50814g0(i));
    }
}
