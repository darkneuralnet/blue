package p000;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
/* renamed from: X39 */
/* loaded from: classes5.dex */
public final class X39 {

    /* renamed from: a */
    public static final Class f42592a;

    /* renamed from: b */
    public static final Q69 f42593b;

    /* renamed from: c */
    public static final Q69 f42594c;

    /* renamed from: d */
    public static final Q69 f42595d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f42592a = cls;
        f42593b = m77449x(false);
        f42594c = m77449x(true);
        f42595d = new C40758f79();
    }

    /* renamed from: A */
    public static int m77496A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m77495B(list) + (size * QP8.m88514y(i << 3));
    }

    /* renamed from: B */
    public static int m77495B(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AU8) {
            AU8 au8 = (AU8) list;
            i = 0;
            while (i2 < size) {
                i += QP8.m88517v(au8.m115723b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += QP8.m88517v(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: C */
    public static int m77494C(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (QP8.m88514y(i << 3) + 4);
    }

    /* renamed from: D */
    public static int m77493D(List list) {
        return list.size() * 4;
    }

    /* renamed from: E */
    public static int m77492E(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (QP8.m88514y(i << 3) + 8);
    }

    /* renamed from: F */
    public static int m77491F(List list) {
        return list.size() * 8;
    }

    /* renamed from: G */
    public static int m77490G(int i, List list, F39 f39) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += QP8.m88518u(i, (InterfaceC47814r19) list.get(i3), f39);
        }
        return i2;
    }

    /* renamed from: H */
    public static int m77489H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m77488I(list) + (size * QP8.m88514y(i << 3));
    }

    /* renamed from: I */
    public static int m77488I(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AU8) {
            AU8 au8 = (AU8) list;
            i = 0;
            while (i2 < size) {
                i += QP8.m88517v(au8.m115723b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += QP8.m88517v(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    public static int m77487J(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m77486K(list) + (list.size() * QP8.m88514y(i << 3));
    }

    /* renamed from: K */
    public static int m77486K(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IY8) {
            IY8 iy8 = (IY8) list;
            i = 0;
            while (i2 < size) {
                i += QP8.m88513z(iy8.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += QP8.m88513z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: L */
    public static int m77485L(int i, Object obj, F39 f39) {
        if (obj instanceof YW8) {
            Logger logger = QP8.f30335b;
            int m74939a = ((YW8) obj).m74939a();
            return QP8.m88514y(i << 3) + QP8.m88514y(m74939a) + m74939a;
        }
        return QP8.m88514y(i << 3) + QP8.m88516w((InterfaceC47814r19) obj, f39);
    }

    /* renamed from: M */
    public static int m77484M(int i, List list, F39 f39) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m88514y = QP8.m88514y(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof YW8) {
                int m74939a = ((YW8) obj).m74939a();
                m88514y += QP8.m88514y(m74939a) + m74939a;
            } else {
                m88514y += QP8.m88516w((InterfaceC47814r19) obj, f39);
            }
        }
        return m88514y;
    }

    /* renamed from: N */
    public static int m77483N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m77482O(list) + (size * QP8.m88514y(i << 3));
    }

    /* renamed from: O */
    public static int m77482O(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AU8) {
            AU8 au8 = (AU8) list;
            i = 0;
            while (i2 < size) {
                int m115723b = au8.m115723b(i2);
                i += QP8.m88514y((m115723b >> 31) ^ (m115723b + m115723b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += QP8.m88514y((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: P */
    public static int m77481P(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m77480Q(list) + (size * QP8.m88514y(i << 3));
    }

    /* renamed from: Q */
    public static int m77480Q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IY8) {
            IY8 iy8 = (IY8) list;
            i = 0;
            while (i2 < size) {
                long zza = iy8.zza(i2);
                i += QP8.m88513z((zza >> 63) ^ (zza + zza));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += QP8.m88513z((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: R */
    public static int m77479R(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        Logger logger = QP8.f30335b;
        boolean z = list instanceof InterfaceC48702sX8;
        int m88514y = QP8.m88514y(i << 3) * size;
        if (z) {
            InterfaceC48702sX8 interfaceC48702sX8 = (InterfaceC48702sX8) list;
            while (i2 < size) {
                Object zzf = interfaceC48702sX8.zzf(i2);
                if (zzf instanceof AbstractC40913fO8) {
                    int mo41437c = ((AbstractC40913fO8) zzf).mo41437c();
                    m88514y += QP8.m88514y(mo41437c) + mo41437c;
                } else {
                    m88514y += QP8.m88515x((String) zzf);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC40913fO8) {
                    int mo41437c2 = ((AbstractC40913fO8) obj).mo41437c();
                    m88514y += QP8.m88514y(mo41437c2) + mo41437c2;
                } else {
                    m88514y += QP8.m88515x((String) obj);
                }
                i2++;
            }
        }
        return m88514y;
    }

    /* renamed from: S */
    public static int m77478S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m77477T(list) + (size * QP8.m88514y(i << 3));
    }

    /* renamed from: T */
    public static int m77477T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AU8) {
            AU8 au8 = (AU8) list;
            i = 0;
            while (i2 < size) {
                i += QP8.m88514y(au8.m115723b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += QP8.m88514y(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m77476U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m77475V(list) + (size * QP8.m88514y(i << 3));
    }

    /* renamed from: V */
    public static int m77475V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IY8) {
            IY8 iy8 = (IY8) list;
            i = 0;
            while (i2 < size) {
                i += QP8.m88513z(iy8.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += QP8.m88513z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static Q69 m77474W() {
        return f42593b;
    }

    /* renamed from: X */
    public static Q69 m77473X() {
        return f42594c;
    }

    /* renamed from: a */
    public static Q69 m77472a() {
        return f42595d;
    }

    /* renamed from: b */
    public static Object m77471b(Object obj, int i, int i2, Object obj2, Q69 q69) {
        if (obj2 == null) {
            obj2 = q69.mo41974c(obj);
        }
        q69.mo41971f(obj2, i, i2);
        return obj2;
    }

    /* renamed from: c */
    public static void m77470c(Q69 q69, Object obj, Object obj2) {
        q69.mo41969h(obj, q69.mo41972e(q69.mo41973d(obj), q69.mo41973d(obj2)));
    }

    /* renamed from: d */
    public static void m77469d(Class cls) {
        Class cls2;
        if (!AbstractC46897pU8.class.isAssignableFrom(cls) && (cls2 = f42592a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: e */
    public static void m77468e(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64329a(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m77467f(int i, List list, InterfaceC38633ba9 interfaceC38633ba9) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64318l(i, list);
        }
    }

    /* renamed from: g */
    public static void m77466g(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64326d(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m77465h(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64327c(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m77464i(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64328b(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m77463j(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64325e(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m77462k(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64314p(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m77461l(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, F39 f39) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C38542bQ8) interfaceC38633ba9).mo64330I(i, list.get(i2), f39);
            }
        }
    }

    /* renamed from: m */
    public static void m77460m(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64316n(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m77459n(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64313q(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m77458o(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, F39 f39) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C38542bQ8) interfaceC38633ba9).mo64334E(i, list.get(i2), f39);
            }
        }
    }

    /* renamed from: p */
    public static void m77457p(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64331H(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m77456q(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64309u(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m77455r(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64312r(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m77454s(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64311s(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m77453t(int i, List list, InterfaceC38633ba9 interfaceC38633ba9) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64336C(i, list);
        }
    }

    /* renamed from: u */
    public static void m77452u(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64338A(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m77451v(int i, List list, InterfaceC38633ba9 interfaceC38633ba9, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC38633ba9.mo64310t(i, list, z);
        }
    }

    /* renamed from: w */
    public static boolean m77450w(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: x */
    public static Q69 m77449x(boolean z) {
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
            return (Q69) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: y */
    public static int m77448y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (QP8.m88514y(i << 3) + 1);
    }

    /* renamed from: z */
    public static int m77447z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m88514y = size * QP8.m88514y(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int mo41437c = ((AbstractC40913fO8) list.get(i2)).mo41437c();
            m88514y += QP8.m88514y(mo41437c) + mo41437c;
        }
        return m88514y;
    }
}
