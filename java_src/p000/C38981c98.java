package p000;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import com.google.android.gms.internal.clearcut.C17507h;
import com.google.android.gms.internal.clearcut.zzbn;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: c98  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38981c98 {

    /* renamed from: a */
    public static final Class<?> f60221a = m61872C();

    /* renamed from: b */
    public static final AbstractC32584Ed8<?, ?> f60222b = m61821w(false);

    /* renamed from: c */
    public static final AbstractC32584Ed8<?, ?> f60223c = m61821w(true);

    /* renamed from: d */
    public static final AbstractC32584Ed8<?, ?> f60224d = new C17507h();

    /* renamed from: A */
    public static AbstractC32584Ed8<?, ?> m61874A() {
        return f60223c;
    }

    /* renamed from: B */
    public static AbstractC32584Ed8<?, ?> m61873B() {
        return f60224d;
    }

    /* renamed from: C */
    public static Class<?> m61872C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class<?> m61871D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static int m61870E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LS7) {
            LS7 ls7 = (LS7) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m51444C0(ls7.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.m51444C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static void m61869F(int i, List<Long> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34078e(i, list, z);
    }

    /* renamed from: G */
    public static int m61868G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LS7) {
            LS7 ls7 = (LS7) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m51442D0(ls7.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.m51442D0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static void m61867H(int i, List<Long> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34066q(i, list, z);
    }

    /* renamed from: I */
    public static void m61866I(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC17497c.class.isAssignableFrom(cls) && (cls2 = f60221a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: J */
    public static int m61865J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LS7) {
            LS7 ls7 = (LS7) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m51440E0(ls7.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.m51440E0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static void m61864K(int i, List<Long> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34081b(i, list, z);
    }

    /* renamed from: L */
    public static int m61863L(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: M */
    public static void m61862M(int i, List<Integer> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34061v(i, list, z);
    }

    /* renamed from: N */
    public static int m61861N(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: O */
    public static void m61860O(int i, List<Integer> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34080c(i, list, z);
    }

    /* renamed from: P */
    public static int m61859P(List<?> list) {
        return list.size();
    }

    /* renamed from: Q */
    public static void m61858Q(int i, List<Integer> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34063t(i, list, z);
    }

    /* renamed from: R */
    public static void m61857R(int i, List<Integer> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34073j(i, list, z);
    }

    /* renamed from: S */
    public static void m61856S(int i, List<Integer> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34067p(i, list, z);
    }

    /* renamed from: T */
    public static void m61855T(int i, List<Integer> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34068o(i, list, z);
    }

    /* renamed from: U */
    public static void m61854U(int i, List<Boolean> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34069n(i, list, z);
    }

    /* renamed from: V */
    public static int m61853V(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m61848a(list) + (list.size() * zzbn.m51446B0(i));
    }

    /* renamed from: W */
    public static int m61852W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m61834j(list) + (size * zzbn.m51446B0(i));
    }

    /* renamed from: X */
    public static int m61851X(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m61827q(list) + (size * zzbn.m51446B0(i));
    }

    /* renamed from: Y */
    public static int m61850Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m61822v(list) + (size * zzbn.m51446B0(i));
    }

    /* renamed from: Z */
    public static int m61849Z(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m61870E(list) + (size * zzbn.m51446B0(i));
    }

    /* renamed from: a */
    public static int m61848a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C48127rZ7) {
            C48127rZ7 c48127rZ7 = (C48127rZ7) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m51417e0(c48127rZ7.m15759b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.m51417e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a0 */
    public static int m61847a0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m61868G(list) + (size * zzbn.m51446B0(i));
    }

    /* renamed from: b */
    public static <UT, UB> UB m61846b(int i, int i2, UB ub, AbstractC32584Ed8<UT, UB> abstractC32584Ed8) {
        if (ub == null) {
            ub = abstractC32584Ed8.mo51490f();
        }
        abstractC32584Ed8.mo51495a(ub, i, i2);
        return ub;
    }

    /* renamed from: b0 */
    public static int m61845b0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m61865J(list) + (size * zzbn.m51446B0(i));
    }

    /* renamed from: c */
    public static <UT, UB> UB m61844c(int i, List<Integer> list, DT7<?> dt7, UB ub, AbstractC32584Ed8<UT, UB> abstractC32584Ed8) {
        if (dt7 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dt7.mo51476g(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m61846b(i, intValue, ub, abstractC32584Ed8);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dt7.mo51476g(intValue2) == null) {
                    ub = (UB) m61846b(i, intValue2, ub, abstractC32584Ed8);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: c0 */
    public static int m61843c0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m51397t0(i, 0);
    }

    /* renamed from: d */
    public static void m61842d(int i, List<String> list, InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34092H(i, list);
    }

    /* renamed from: d0 */
    public static int m61841d0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m51407k0(i, 0L);
    }

    /* renamed from: e */
    public static void m61840e(int i, List<?> list, InterfaceC35212Pj8 interfaceC35212Pj8, InterfaceC51439x88 interfaceC51439x88) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34089K(i, list, interfaceC51439x88);
    }

    /* renamed from: e0 */
    public static int m61839e0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m51429Q(i, true);
    }

    /* renamed from: f */
    public static void m61838f(int i, List<Double> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34079d(i, list, z);
    }

    /* renamed from: g */
    public static <T, FT extends HQ7<FT>> void m61837g(LN7<FT> ln7, T t, T t2) {
        TO7<FT> mo51571b = ln7.mo51571b(t2);
        if (mo51571b.m83695b()) {
            return;
        }
        ln7.mo51568e(t).m83689h(mo51571b);
    }

    /* renamed from: h */
    public static <T> void m61836h(InterfaceC46034o18 interfaceC46034o18, T t, T t2, long j) {
        C35410Qf8.m88237i(t, j, interfaceC46034o18.mo21971f(C35410Qf8.m88254M(t, j), C35410Qf8.m88254M(t2, j)));
    }

    /* renamed from: i */
    public static <T, UT, UB> void m61835i(AbstractC32584Ed8<UT, UB> abstractC32584Ed8, T t, T t2) {
        abstractC32584Ed8.mo51489g(t, abstractC32584Ed8.mo51487i(abstractC32584Ed8.mo51485k(t), abstractC32584Ed8.mo51485k(t2)));
    }

    /* renamed from: j */
    public static int m61834j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C48127rZ7) {
            C48127rZ7 c48127rZ7 = (C48127rZ7) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m51412h0(c48127rZ7.m15759b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.m51412h0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public static void m61833k(int i, List<TD7> list, InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34062u(i, list);
    }

    /* renamed from: l */
    public static void m61832l(int i, List<?> list, InterfaceC35212Pj8 interfaceC35212Pj8, InterfaceC51439x88 interfaceC51439x88) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34090J(i, list, interfaceC51439x88);
    }

    /* renamed from: m */
    public static void m61831m(int i, List<Float> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34064s(i, list, z);
    }

    /* renamed from: n */
    public static int m61830n(int i, Object obj, InterfaceC51439x88 interfaceC51439x88) {
        return obj instanceof C50470vW7 ? zzbn.m51420d(i, (C50470vW7) obj) : zzbn.m51445C(i, (H28) obj, interfaceC51439x88);
    }

    /* renamed from: o */
    public static int m61829o(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m51446B0 = zzbn.m51446B0(i) * size;
        if (list instanceof WW7) {
            WW7 ww7 = (WW7) list;
            while (i2 < size) {
                Object mo43923l = ww7.mo43923l(i2);
                m51446B0 += mo43923l instanceof TD7 ? zzbn.m51443D((TD7) mo43923l) : zzbn.m51401q0((String) mo43923l);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                m51446B0 += obj instanceof TD7 ? zzbn.m51443D((TD7) obj) : zzbn.m51401q0((String) obj);
                i2++;
            }
        }
        return m51446B0;
    }

    /* renamed from: p */
    public static int m61828p(int i, List<?> list, InterfaceC51439x88 interfaceC51439x88) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m51446B0 = zzbn.m51446B0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            m51446B0 += obj instanceof C50470vW7 ? zzbn.m51418e((C50470vW7) obj) : zzbn.m51441E((H28) obj, interfaceC51439x88);
        }
        return m51446B0;
    }

    /* renamed from: q */
    public static int m61827q(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C48127rZ7) {
            C48127rZ7 c48127rZ7 = (C48127rZ7) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m51406l0(c48127rZ7.m15759b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.m51406l0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: r */
    public static void m61826r(int i, List<Long> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34082a(i, list, z);
    }

    /* renamed from: s */
    public static boolean m61825s(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: t */
    public static int m61824t(int i, List<TD7> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m51446B0 = size * zzbn.m51446B0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m51446B0 += zzbn.m51443D(list.get(i2));
        }
        return m51446B0;
    }

    /* renamed from: u */
    public static int m61823u(int i, List<H28> list, InterfaceC51439x88 interfaceC51439x88) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbn.m51430P(i, list.get(i3), interfaceC51439x88);
        }
        return i2;
    }

    /* renamed from: v */
    public static int m61822v(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LS7) {
            LS7 ls7 = (LS7) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m51435H0(ls7.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.m51435H0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: w */
    public static AbstractC32584Ed8<?, ?> m61821w(boolean z) {
        try {
            Class<?> m61871D = m61871D();
            if (m61871D == null) {
                return null;
            }
            return (AbstractC32584Ed8) m61871D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static void m61820x(int i, List<Long> list, InterfaceC35212Pj8 interfaceC35212Pj8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC35212Pj8.mo34065r(i, list, z);
    }

    /* renamed from: y */
    public static boolean m61819y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: z */
    public static AbstractC32584Ed8<?, ?> m61818z() {
        return f60222b;
    }
}
