package p000;

import com.google.android.gms.internal.places.AbstractC17530c;
import com.google.android.gms.internal.places.C17540h;
import com.google.android.gms.internal.places.zzaj;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: oZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46348oZ7 {

    /* renamed from: a */
    public static final Class<?> f102146a = m20845s();

    /* renamed from: b */
    public static final I38<?, ?> f102147b = m20893A(false);

    /* renamed from: c */
    public static final I38<?, ?> f102148c = m20893A(true);

    /* renamed from: d */
    public static final I38<?, ?> f102149d = new C17540h();

    /* renamed from: A */
    public static I38<?, ?> m20893A(boolean z) {
        try {
            Class<?> m20844t = m20844t();
            if (m20844t == null) {
                return null;
            }
            return (I38) m20844t.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static void m20892B(int i, List<Long> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15205V(i, list, z);
        }
    }

    /* renamed from: C */
    public static int m20891C(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof PO7) {
            PO7 po7 = (PO7) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m51092f0(po7.m90352b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.m51092f0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static void m20890D(int i, List<Long> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15185s(i, list, z);
        }
    }

    /* renamed from: E */
    public static void m20889E(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC17530c.class.isAssignableFrom(cls) && (cls2 = f102146a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: F */
    public static int m20888F(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C38451bG7) {
            C38451bG7 c38451bG7 = (C38451bG7) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m51119B0(c38451bG7.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.m51119B0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: G */
    public static void m20887G(int i, List<Long> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15184t(i, list, z);
        }
    }

    /* renamed from: H */
    public static int m20886H(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C38451bG7) {
            C38451bG7 c38451bG7 = (C38451bG7) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m51068w0(c38451bG7.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.m51068w0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: I */
    public static void m20885I(int i, List<Integer> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15194j(i, list, z);
        }
    }

    /* renamed from: J */
    public static int m20884J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C38451bG7) {
            C38451bG7 c38451bG7 = (C38451bG7) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m51066x0(c38451bG7.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.m51066x0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static void m20883K(int i, List<Integer> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15188p(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m20882L(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C38451bG7) {
            C38451bG7 c38451bG7 = (C38451bG7) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m51064y0(c38451bG7.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.m51064y0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    public static void m20881M(int i, List<Integer> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15198e(i, list, z);
        }
    }

    /* renamed from: N */
    public static int m20880N(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: O */
    public static void m20879O(int i, List<Integer> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15202a(i, list, z);
        }
    }

    /* renamed from: P */
    public static int m20878P(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: Q */
    public static void m20877Q(int i, List<Integer> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15201b(i, list, z);
        }
    }

    /* renamed from: R */
    public static int m20876R(List<?> list) {
        return list.size();
    }

    /* renamed from: S */
    public static void m20875S(int i, List<Integer> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15190n(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m20874T(int i, List<Boolean> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15200c(i, list, z);
        }
    }

    /* renamed from: U */
    public static int m20873U(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m20841w(list) + (list.size() * zzaj.m51070v0(i));
    }

    /* renamed from: V */
    public static int m20872V(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20838z(list) + (size * zzaj.m51070v0(i));
    }

    /* renamed from: W */
    public static int m20871W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20891C(list) + (size * zzaj.m51070v0(i));
    }

    /* renamed from: X */
    public static int m20870X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20888F(list) + (size * zzaj.m51070v0(i));
    }

    /* renamed from: Y */
    public static int m20869Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20886H(list) + (size * zzaj.m51070v0(i));
    }

    /* renamed from: Z */
    public static int m20868Z(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20884J(list) + (size * zzaj.m51070v0(i));
    }

    /* renamed from: a */
    public static <UT, UB> UB m20867a(int i, int i2, UB ub, I38<UT, UB> i38) {
        if (ub == null) {
            ub = i38.mo51157f();
        }
        i38.mo51162a(ub, i, i2);
        return ub;
    }

    /* renamed from: a0 */
    public static int m20866a0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m20882L(list) + (size * zzaj.m51070v0(i));
    }

    /* renamed from: b */
    public static <UT, UB> UB m20865b(int i, List<Integer> list, SG7 sg7, UB ub, I38<UT, UB> i38) {
        if (sg7 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (sg7.m85783a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m20867a(i, intValue, ub, i38);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!sg7.m85783a(intValue2)) {
                    ub = (UB) m20867a(i, intValue2, ub, i38);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: b0 */
    public static int m20864b0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.m51083m0(i, 0);
    }

    /* renamed from: c */
    public static void m20863c(int i, List<String> list, InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15183u(i, list);
        }
    }

    /* renamed from: c0 */
    public static int m20862c0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.m51094e0(i, 0L);
    }

    /* renamed from: d */
    public static void m20861d(int i, List<?> list, InterfaceC43393ja8 interfaceC43393ja8, LY7 ly7) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15203X(i, list, ly7);
        }
    }

    /* renamed from: d0 */
    public static int m20860d0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaj.m51113I(i, true);
    }

    /* renamed from: e */
    public static void m20859e(int i, List<Double> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15189o(i, list, z);
        }
    }

    /* renamed from: f */
    public static <T, FT extends InterfaceC44828lz7<FT>> void m20858f(AbstractC49521tu7<FT> abstractC49521tu7, T t, T t2) {
        C33231Gx7<FT> mo11227c = abstractC49521tu7.mo11227c(t2);
        if (!mo11227c.f12664a.isEmpty()) {
            abstractC49521tu7.mo11225e(t).m104559j(mo11227c);
        }
    }

    /* renamed from: g */
    public static <T> void m20857g(InterfaceC51611xR7 interfaceC51611xR7, T t, T t2, long j) {
        C49038t58.m13114g(t, j, interfaceC51611xR7.mo5258f(C49038t58.m13129G(t, j), C49038t58.m13129G(t2, j)));
    }

    /* renamed from: h */
    public static <T, UT, UB> void m20856h(I38<UT, UB> i38, T t, T t2) {
        i38.mo51156g(t, i38.mo51154i(i38.mo51152k(t), i38.mo51152k(t2)));
    }

    /* renamed from: i */
    public static void m20855i(int i, List<AbstractC43604jv9> list, InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15207T(i, list);
        }
    }

    /* renamed from: j */
    public static void m20854j(int i, List<?> list, InterfaceC43393ja8 interfaceC43393ja8, LY7 ly7) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15204W(i, list, ly7);
        }
    }

    /* renamed from: k */
    public static void m20853k(int i, List<Float> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15199d(i, list, z);
        }
    }

    /* renamed from: l */
    public static I38<?, ?> m20852l() {
        return f102147b;
    }

    /* renamed from: m */
    public static int m20851m(int i, Object obj, LY7 ly7) {
        if (obj instanceof C40301eM7) {
            return zzaj.m51097d(i, (C40301eM7) obj);
        }
        return zzaj.m51069w(i, (InterfaceC52815zT7) obj, ly7);
    }

    /* renamed from: n */
    public static int m20850n(int i, List<?> list) {
        int m51082n0;
        int m51082n02;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m51070v0 = zzaj.m51070v0(i) * size;
        if (list instanceof KM7) {
            KM7 km7 = (KM7) list;
            while (i2 < size) {
                Object mo64612O1 = km7.mo64612O1(i2);
                if (mo64612O1 instanceof AbstractC43604jv9) {
                    m51082n02 = zzaj.m51067x((AbstractC43604jv9) mo64612O1);
                } else {
                    m51082n02 = zzaj.m51082n0((String) mo64612O1);
                }
                m51070v0 += m51082n02;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC43604jv9) {
                    m51082n0 = zzaj.m51067x((AbstractC43604jv9) obj);
                } else {
                    m51082n0 = zzaj.m51082n0((String) obj);
                }
                m51070v0 += m51082n0;
                i2++;
            }
        }
        return m51070v0;
    }

    /* renamed from: o */
    public static int m20849o(int i, List<?> list, LY7 ly7) {
        int m51093f;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m51070v0 = zzaj.m51070v0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C40301eM7) {
                m51093f = zzaj.m51095e((C40301eM7) obj);
            } else {
                m51093f = zzaj.m51093f((InterfaceC52815zT7) obj, ly7);
            }
            m51070v0 += m51093f;
        }
        return m51070v0;
    }

    /* renamed from: p */
    public static void m20848p(int i, List<Long> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15186r(i, list, z);
        }
    }

    /* renamed from: q */
    public static I38<?, ?> m20847q() {
        return f102148c;
    }

    /* renamed from: r */
    public static I38<?, ?> m20846r() {
        return f102149d;
    }

    /* renamed from: s */
    public static Class<?> m20845s() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static Class<?> m20844t() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static int m20843u(int i, List<AbstractC43604jv9> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m51070v0 = size * zzaj.m51070v0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m51070v0 += zzaj.m51067x(list.get(i2));
        }
        return m51070v0;
    }

    /* renamed from: v */
    public static int m20842v(int i, List<InterfaceC52815zT7> list, LY7 ly7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzaj.m51115G(i, list.get(i3), ly7);
        }
        return i2;
    }

    /* renamed from: w */
    public static int m20841w(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof PO7) {
            PO7 po7 = (PO7) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m51102Y(po7.m90352b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.m51102Y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static void m20840x(int i, List<Long> list, InterfaceC43393ja8 interfaceC43393ja8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC43393ja8.mo15187q(i, list, z);
        }
    }

    /* renamed from: y */
    public static boolean m20839y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: z */
    public static int m20838z(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof PO7) {
            PO7 po7 = (PO7) list;
            i = 0;
            while (i2 < size) {
                i += zzaj.m51099b0(po7.m90352b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzaj.m51099b0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }
}
