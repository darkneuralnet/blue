package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: Pv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35319Pv7 {

    /* renamed from: a */
    public static final Class f29394a;

    /* renamed from: b */
    public static final AbstractC48948sw7 f29395b;

    /* renamed from: c */
    public static final AbstractC48948sw7 f29396c;

    /* renamed from: d */
    public static final AbstractC48948sw7 f29397d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f29394a = cls;
        f29395b = m89419C(false);
        f29396c = m89419C(true);
        f29397d = new C50134uw7();
    }

    /* renamed from: A */
    public static int m89421A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC50104ut7.m9558m(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m89420B(C38248av7 c38248av7, Object obj, Object obj2, long j) {
        C32286Cw7.m111229x(obj, j, C38248av7.m65248c(C32286Cw7.m111242k(obj, j), C32286Cw7.m111242k(obj2, j)));
    }

    /* renamed from: C */
    public static AbstractC48948sw7 m89419C(boolean z) {
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
            return (AbstractC48948sw7) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m89418D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m89417E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m9559l = size * AbstractC50104ut7.m9559l(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m9559l += AbstractC50104ut7.m9568c((AbstractC44175kt7) list.get(i2));
        }
        return m9559l;
    }

    /* renamed from: F */
    public static int m89416F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m89415G(list) + (size * AbstractC50104ut7.m9559l(i));
    }

    /* renamed from: G */
    public static int m89415G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9565f(c41220fu7.m40573b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9565f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m89414H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC50104ut7.m9558m(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m89413I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m89412J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC50104ut7.m9558m(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m89411K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m89410L(int i, List list, InterfaceC34851Nv7 interfaceC34851Nv7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC50104ut7.m9567d(i, (InterfaceC41230fv7) list.get(i3), interfaceC34851Nv7);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m89409M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m89408N(list) + (size * AbstractC50104ut7.m9559l(i));
    }

    /* renamed from: N */
    public static int m89408N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9565f(c41220fu7.m40573b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9565f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m89407O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m89406P(list) + (list.size() * AbstractC50104ut7.m9559l(i));
    }

    /* renamed from: P */
    public static int m89406P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C36246Tu7) {
            C36246Tu7 c36246Tu7 = (C36246Tu7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9557n(c36246Tu7.m82272b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9557n(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m89405Q(int i, Object obj, InterfaceC34851Nv7 interfaceC34851Nv7) {
        if (obj instanceof C34608Mu7) {
            int m9558m = AbstractC50104ut7.m9558m(i << 3);
            int m94585a = ((C34608Mu7) obj).m94585a();
            return m9558m + AbstractC50104ut7.m9558m(m94585a) + m94585a;
        }
        return AbstractC50104ut7.m9558m(i << 3) + AbstractC50104ut7.m9562i((InterfaceC41230fv7) obj, interfaceC34851Nv7);
    }

    /* renamed from: R */
    public static int m89404R(int i, List list, InterfaceC34851Nv7 interfaceC34851Nv7) {
        int m9562i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m9559l = AbstractC50104ut7.m9559l(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C34608Mu7) {
                m9562i = AbstractC50104ut7.m9564g((C34608Mu7) obj);
            } else {
                m9562i = AbstractC50104ut7.m9562i((InterfaceC41230fv7) obj, interfaceC34851Nv7);
            }
            m9559l += m9562i;
        }
        return m9559l;
    }

    /* renamed from: S */
    public static int m89403S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m89402T(list) + (size * AbstractC50104ut7.m9559l(i));
    }

    /* renamed from: T */
    public static int m89402T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            i = 0;
            while (i2 < size) {
                int m40573b = c41220fu7.m40573b(i2);
                i += AbstractC50104ut7.m9558m((m40573b >> 31) ^ (m40573b + m40573b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += AbstractC50104ut7.m9558m((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m89401U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m89400V(list) + (size * AbstractC50104ut7.m9559l(i));
    }

    /* renamed from: V */
    public static int m89400V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C36246Tu7) {
            C36246Tu7 c36246Tu7 = (C36246Tu7) list;
            i = 0;
            while (i2 < size) {
                long m82272b = c36246Tu7.m82272b(i2);
                i += AbstractC50104ut7.m9557n((m82272b >> 63) ^ (m82272b + m82272b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += AbstractC50104ut7.m9557n((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m89399W(int i, List list) {
        int m9560k;
        int m9560k2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m9559l = AbstractC50104ut7.m9559l(i) * size;
        if (list instanceof InterfaceC35076Ou7) {
            InterfaceC35076Ou7 interfaceC35076Ou7 = (InterfaceC35076Ou7) list;
            while (i2 < size) {
                Object zzf = interfaceC35076Ou7.zzf(i2);
                if (zzf instanceof AbstractC44175kt7) {
                    m9560k2 = AbstractC50104ut7.m9568c((AbstractC44175kt7) zzf);
                } else {
                    m9560k2 = AbstractC50104ut7.m9560k((String) zzf);
                }
                m9559l += m9560k2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC44175kt7) {
                    m9560k = AbstractC50104ut7.m9568c((AbstractC44175kt7) obj);
                } else {
                    m9560k = AbstractC50104ut7.m9560k((String) obj);
                }
                m9559l += m9560k;
                i2++;
            }
        }
        return m9559l;
    }

    /* renamed from: X */
    public static int m89398X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m89397Y(list) + (size * AbstractC50104ut7.m9559l(i));
    }

    /* renamed from: Y */
    public static int m89397Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9558m(c41220fu7.m40573b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9558m(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m89396Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m89394a0(list) + (size * AbstractC50104ut7.m9559l(i));
    }

    /* renamed from: a */
    public static AbstractC48948sw7 m89395a() {
        return f29396c;
    }

    /* renamed from: a0 */
    public static int m89394a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C36246Tu7) {
            C36246Tu7 c36246Tu7 = (C36246Tu7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9557n(c36246Tu7.m82272b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC50104ut7.m9557n(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static AbstractC48948sw7 m89393b() {
        return f29397d;
    }

    /* renamed from: b0 */
    public static AbstractC48948sw7 m89392b0() {
        return f29395b;
    }

    /* renamed from: c */
    public static Object m89391c(int i, List list, InterfaceC42999iu7 interfaceC42999iu7, Object obj, AbstractC48948sw7 abstractC48948sw7) {
        if (interfaceC42999iu7 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (interfaceC42999iu7.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m89390d(i, intValue, obj, abstractC48948sw7);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC42999iu7.zza(intValue2)) {
                    obj = m89390d(i, intValue2, obj, abstractC48948sw7);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m89390d(int i, int i2, Object obj, AbstractC48948sw7 abstractC48948sw7) {
        if (obj == null) {
            obj = abstractC48948sw7.mo9467f();
        }
        abstractC48948sw7.mo9461l(obj, i, i2);
        return obj;
    }

    /* renamed from: e */
    public static void m89389e(AbstractC31791At7 abstractC31791At7, Object obj, Object obj2) {
        C32727Et7 mo113395b = abstractC31791At7.mo113395b(obj2);
        if (!mo113395b.f8278a.isEmpty()) {
            abstractC31791At7.mo113394c(obj).m108240j(mo113395b);
        }
    }

    /* renamed from: f */
    public static void m89388f(AbstractC48948sw7 abstractC48948sw7, Object obj, Object obj2) {
        abstractC48948sw7.mo9458o(obj, abstractC48948sw7.mo9468e(abstractC48948sw7.mo9469d(obj), abstractC48948sw7.mo9469d(obj2)));
    }

    /* renamed from: g */
    public static void m89387g(Class cls) {
        Class cls2;
        if (!AbstractC40627eu7.class.isAssignableFrom(cls) && (cls2 = f29394a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m89386h(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7835a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m89385i(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7824l(i, list);
        }
    }

    /* renamed from: j */
    public static void m89384j(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7832d(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m89383k(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7833c(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m89382l(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7834b(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m89381m(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7831e(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m89380n(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7820p(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m89379o(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, InterfaceC34851Nv7 interfaceC34851Nv7) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C50696vt7) interfaceC34158Kw7).mo7840H(i, list.get(i2), interfaceC34851Nv7);
            }
        }
    }

    /* renamed from: p */
    public static void m89378p(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7822n(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m89377q(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7819q(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m89376r(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, InterfaceC34851Nv7 interfaceC34851Nv7) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C50696vt7) interfaceC34158Kw7).mo7841G(i, list.get(i2), interfaceC34851Nv7);
            }
        }
    }

    /* renamed from: s */
    public static void m89375s(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7815u(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m89374t(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7818r(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m89373u(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7817s(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m89372v(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7846B(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m89371w(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7843E(i, list);
        }
    }

    /* renamed from: x */
    public static void m89370x(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7816t(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m89369y(int i, List list, InterfaceC34158Kw7 interfaceC34158Kw7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC34158Kw7.mo7839I(i, list, z);
        }
    }

    /* renamed from: z */
    public static boolean m89368z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
