package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: Ti9 */
/* loaded from: classes5.dex */
public final class Ti9 {

    /* renamed from: a */
    public static final Class f35976a;

    /* renamed from: b */
    public static final Mk9 f35977b;

    /* renamed from: c */
    public static final Mk9 f35978c;

    /* renamed from: d */
    public static final Mk9 f35979d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f35976a = cls;
        f35977b = m83129C(false);
        f35978c = m83129C(true);
        f35979d = new Yk9();
    }

    /* renamed from: A */
    public static int m83131A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (Z79.m73702d(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m83130B(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36786l(i, list, z);
        }
    }

    /* renamed from: C */
    public static Mk9 m83129C(boolean z) {
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
            return (Mk9) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m83128D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m83127E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m73703c = size * Z79.m73703c(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m73703c += Z79.m73711B((T69) list.get(i2));
        }
        return m73703c;
    }

    /* renamed from: F */
    public static int m83126F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m83125G(list) + (size * Z79.m73703c(i));
    }

    /* renamed from: G */
    public static int m83125G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Bb9) {
            Bb9 bb9 = (Bb9) list;
            i = 0;
            while (i2 < size) {
                i += Z79.m73708E(bb9.m113810b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Z79.m73708E(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m83124H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (Z79.m73702d(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m83123I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m83122J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (Z79.m73702d(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m83121K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m83120L(int i, List list, Ei9 ei9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += Z79.m73710C(i, (InterfaceC47012pg9) list.get(i3), ei9);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m83119M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m83118N(list) + (size * Z79.m73703c(i));
    }

    /* renamed from: N */
    public static int m83118N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Bb9) {
            Bb9 bb9 = (Bb9) list;
            i = 0;
            while (i2 < size) {
                i += Z79.m73708E(bb9.m113810b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Z79.m73708E(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m83117O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m83116P(list) + (list.size() * Z79.m73703c(i));
    }

    /* renamed from: P */
    public static int m83116P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Je9) {
            Je9 je9 = (Je9) list;
            i = 0;
            while (i2 < size) {
                i += Z79.m73701e(je9.m100053b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Z79.m73701e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m83115Q(int i, Object obj, Ei9 ei9) {
        if (obj instanceof Rc9) {
            int m73702d = Z79.m73702d(i << 3);
            int m86542a = ((Rc9) obj).m86542a();
            return m73702d + Z79.m73702d(m86542a) + m86542a;
        }
        return Z79.m73702d(i << 3) + Z79.m73705a((InterfaceC47012pg9) obj, ei9);
    }

    /* renamed from: R */
    public static int m83114R(int i, List list, Ei9 ei9) {
        int m73705a;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m73703c = Z79.m73703c(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof Rc9) {
                m73705a = Z79.m73707F((Rc9) obj);
            } else {
                m73705a = Z79.m73705a((InterfaceC47012pg9) obj, ei9);
            }
            m73703c += m73705a;
        }
        return m73703c;
    }

    /* renamed from: S */
    public static int m83113S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m83112T(list) + (size * Z79.m73703c(i));
    }

    /* renamed from: T */
    public static int m83112T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Bb9) {
            Bb9 bb9 = (Bb9) list;
            i = 0;
            while (i2 < size) {
                int m113810b = bb9.m113810b(i2);
                i += Z79.m73702d((m113810b >> 31) ^ (m113810b + m113810b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += Z79.m73702d((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m83111U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m83110V(list) + (size * Z79.m73703c(i));
    }

    /* renamed from: V */
    public static int m83110V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Je9) {
            Je9 je9 = (Je9) list;
            i = 0;
            while (i2 < size) {
                long m100053b = je9.m100053b(i2);
                i += Z79.m73701e((m100053b >> 63) ^ (m100053b + m100053b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += Z79.m73701e((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m83109W(int i, List list) {
        int m73704b;
        int m73704b2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m73703c = Z79.m73703c(i) * size;
        if (list instanceof Id9) {
            Id9 id9 = (Id9) list;
            while (i2 < size) {
                Object zzf = id9.zzf(i2);
                if (zzf instanceof T69) {
                    m73704b2 = Z79.m73711B((T69) zzf);
                } else {
                    m73704b2 = Z79.m73704b((String) zzf);
                }
                m73703c += m73704b2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof T69) {
                    m73704b = Z79.m73711B((T69) obj);
                } else {
                    m73704b = Z79.m73704b((String) obj);
                }
                m73703c += m73704b;
                i2++;
            }
        }
        return m73703c;
    }

    /* renamed from: X */
    public static int m83108X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m83107Y(list) + (size * Z79.m73703c(i));
    }

    /* renamed from: Y */
    public static int m83107Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Bb9) {
            Bb9 bb9 = (Bb9) list;
            i = 0;
            while (i2 < size) {
                i += Z79.m73702d(bb9.m113810b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Z79.m73702d(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m83106Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m83104a0(list) + (size * Z79.m73703c(i));
    }

    /* renamed from: a */
    public static Mk9 m83105a() {
        return f35978c;
    }

    /* renamed from: a0 */
    public static int m83104a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Je9) {
            Je9 je9 = (Je9) list;
            i = 0;
            while (i2 < size) {
                i += Z79.m73701e(je9.m100053b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Z79.m73701e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static Mk9 m83103b() {
        return f35979d;
    }

    /* renamed from: b0 */
    public static Mk9 m83102b0() {
        return f35977b;
    }

    /* renamed from: c */
    public static Object m83101c(int i, List list, Wb9 wb9, Object obj, Mk9 mk9) {
        if (wb9 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (wb9.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m83100d(i, intValue, obj, mk9);
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
                if (!wb9.zza(intValue2)) {
                    obj = m83100d(i, intValue2, obj, mk9);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m83100d(int i, int i2, Object obj, Mk9 mk9) {
        if (obj == null) {
            obj = mk9.mo74327e();
        }
        mk9.mo74326f(obj, i, i2);
        return obj;
    }

    /* renamed from: e */
    public static void m83099e(U89 u89, Object obj, Object obj2) {
        C39837da9 mo81915b = u89.mo81915b(obj2);
        if (!mo81915b.f76816a.isEmpty()) {
            u89.mo81914c(obj).m44103i(mo81915b);
        }
    }

    /* renamed from: f */
    public static void m83098f(Mk9 mk9, Object obj, Object obj2) {
        mk9.mo74324h(obj, mk9.mo74328d(mk9.mo74329c(obj), mk9.mo74329c(obj2)));
    }

    /* renamed from: g */
    public static void m83097g(Class cls) {
        Class cls2;
        if (!AbstractC49926ub9.class.isAssignableFrom(cls) && (cls2 = f35976a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m83096h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: i */
    public static void m83095i(Ef9 ef9, Object obj, Object obj2, long j) {
        C51221wm9.m6343x(obj, j, Ef9.m108585b(C51221wm9.m6356k(obj, j), C51221wm9.m6356k(obj2, j)));
    }

    /* renamed from: j */
    public static void m83094j(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36783o(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m83093k(int i, List list, C41954h89 c41954h89) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36781q(i, list);
        }
    }

    /* renamed from: l */
    public static void m83092l(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36779s(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m83091m(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36776v(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m83090n(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36774x(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m83089o(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36772z(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m83088p(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36808B(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m83087q(int i, List list, C41954h89 c41954h89, Ei9 ei9) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                c41954h89.m36807C(i, list.get(i2), ei9);
            }
        }
    }

    /* renamed from: r */
    public static void m83086r(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36805E(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m83085s(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36803G(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m83084t(int i, List list, C41954h89 c41954h89, Ei9 ei9) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                c41954h89.m36802H(i, list.get(i2), ei9);
            }
        }
    }

    /* renamed from: u */
    public static void m83083u(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36799K(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m83082v(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36797a(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m83081w(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36795c(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m83080x(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36793e(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m83079y(int i, List list, C41954h89 c41954h89) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36790h(i, list);
        }
    }

    /* renamed from: z */
    public static void m83078z(int i, List list, C41954h89 c41954h89, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c41954h89.m36788j(i, list, z);
        }
    }
}
