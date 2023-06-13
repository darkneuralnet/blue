package p000;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
/* renamed from: cp8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39393cp8 {

    /* renamed from: a */
    public static final Class f75682a;

    /* renamed from: b */
    public static final AbstractC32953Fs8 f75683b;

    /* renamed from: c */
    public static final AbstractC32953Fs8 f75684c;

    /* renamed from: d */
    public static final AbstractC32953Fs8 f75685d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f75682a = cls;
        f75683b = m45003y(false);
        f75684c = m45003y(true);
        f75685d = new C36238Tt8();
    }

    /* renamed from: A */
    public static int m45052A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16656A = size * AbstractC47813r18.m16656A(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int mo5074e = ((AbstractC41604gZ7) list.get(i2)).mo5074e();
            m16656A += AbstractC47813r18.m16656A(mo5074e) + mo5074e;
        }
        return m16656A;
    }

    /* renamed from: B */
    public static int m45051B(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45050C(list) + (size * AbstractC47813r18.m16656A(i << 3));
    }

    /* renamed from: C */
    public static int m45050C(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C44325l88) {
            C44325l88 c44325l88 = (C44325l88) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16632w(c44325l88.m27746b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16632w(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static int m45049D(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC47813r18.m16656A(i << 3) + 4);
    }

    /* renamed from: E */
    public static int m45048E(List list) {
        return list.size() * 4;
    }

    /* renamed from: F */
    public static int m45047F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC47813r18.m16656A(i << 3) + 8);
    }

    /* renamed from: G */
    public static int m45046G(List list) {
        return list.size() * 8;
    }

    /* renamed from: H */
    public static int m45045H(int i, List list, InterfaceC32449Do8 interfaceC32449Do8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC47813r18.m16633v(i, (InterfaceC39926dj8) list.get(i3), interfaceC32449Do8);
        }
        return i2;
    }

    /* renamed from: I */
    public static int m45044I(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45043J(list) + (size * AbstractC47813r18.m16656A(i << 3));
    }

    /* renamed from: J */
    public static int m45043J(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C44325l88) {
            C44325l88 c44325l88 = (C44325l88) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16632w(c44325l88.m27746b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16632w(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static int m45042K(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m45041L(list) + (list.size() * AbstractC47813r18.m16656A(i << 3));
    }

    /* renamed from: L */
    public static int m45041L(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C37516Zf8) {
            C37516Zf8 c37516Zf8 = (C37516Zf8) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16655B(c37516Zf8.m72784b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16655B(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    public static int m45040M(int i, Object obj, InterfaceC32449Do8 interfaceC32449Do8) {
        if (obj instanceof C33979Kc8) {
            Logger logger = AbstractC47813r18.f106235b;
            int m98652a = ((C33979Kc8) obj).m98652a();
            return AbstractC47813r18.m16656A(i << 3) + AbstractC47813r18.m16656A(m98652a) + m98652a;
        }
        return AbstractC47813r18.m16656A(i << 3) + AbstractC47813r18.m16630y((InterfaceC39926dj8) obj, interfaceC32449Do8);
    }

    /* renamed from: N */
    public static int m45039N(int i, List list, InterfaceC32449Do8 interfaceC32449Do8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16656A = AbstractC47813r18.m16656A(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C33979Kc8) {
                int m98652a = ((C33979Kc8) obj).m98652a();
                m16656A += AbstractC47813r18.m16656A(m98652a) + m98652a;
            } else {
                m16656A += AbstractC47813r18.m16630y((InterfaceC39926dj8) obj, interfaceC32449Do8);
            }
        }
        return m16656A;
    }

    /* renamed from: O */
    public static int m45038O(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45037P(list) + (size * AbstractC47813r18.m16656A(i << 3));
    }

    /* renamed from: P */
    public static int m45037P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C44325l88) {
            C44325l88 c44325l88 = (C44325l88) list;
            i = 0;
            while (i2 < size) {
                int m27746b = c44325l88.m27746b(i2);
                i += AbstractC47813r18.m16656A((m27746b >> 31) ^ (m27746b + m27746b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += AbstractC47813r18.m16656A((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m45036Q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45035R(list) + (size * AbstractC47813r18.m16656A(i << 3));
    }

    /* renamed from: R */
    public static int m45035R(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C37516Zf8) {
            C37516Zf8 c37516Zf8 = (C37516Zf8) list;
            i = 0;
            while (i2 < size) {
                long m72784b = c37516Zf8.m72784b(i2);
                i += AbstractC47813r18.m16655B((m72784b >> 63) ^ (m72784b + m72784b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += AbstractC47813r18.m16655B((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: S */
    public static int m45034S(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        Logger logger = AbstractC47813r18.f106235b;
        boolean z = list instanceof InterfaceC42830id8;
        int m16656A = AbstractC47813r18.m16656A(i << 3) * size;
        if (z) {
            InterfaceC42830id8 interfaceC42830id8 = (InterfaceC42830id8) list;
            while (i2 < size) {
                Object zzf = interfaceC42830id8.zzf(i2);
                if (zzf instanceof AbstractC41604gZ7) {
                    int mo5074e = ((AbstractC41604gZ7) zzf).mo5074e();
                    m16656A += AbstractC47813r18.m16656A(mo5074e) + mo5074e;
                } else {
                    m16656A += AbstractC47813r18.m16629z((String) zzf);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC41604gZ7) {
                    int mo5074e2 = ((AbstractC41604gZ7) obj).mo5074e();
                    m16656A += AbstractC47813r18.m16656A(mo5074e2) + mo5074e2;
                } else {
                    m16656A += AbstractC47813r18.m16629z((String) obj);
                }
                i2++;
            }
        }
        return m16656A;
    }

    /* renamed from: T */
    public static int m45033T(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45032U(list) + (size * AbstractC47813r18.m16656A(i << 3));
    }

    /* renamed from: U */
    public static int m45032U(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C44325l88) {
            C44325l88 c44325l88 = (C44325l88) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16656A(c44325l88.m27746b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16656A(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: V */
    public static int m45031V(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m45030W(list) + (size * AbstractC47813r18.m16656A(i << 3));
    }

    /* renamed from: W */
    public static int m45030W(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C37516Zf8) {
            C37516Zf8 c37516Zf8 = (C37516Zf8) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16655B(c37516Zf8.m72784b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC47813r18.m16655B(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: X */
    public static AbstractC32953Fs8 m45029X() {
        return f75683b;
    }

    /* renamed from: Y */
    public static AbstractC32953Fs8 m45028Y() {
        return f75684c;
    }

    /* renamed from: a */
    public static AbstractC32953Fs8 m45027a() {
        return f75685d;
    }

    /* renamed from: b */
    public static Object m45026b(Object obj, int i, int i2, Object obj2, AbstractC32953Fs8 abstractC32953Fs8) {
        if (obj2 == null) {
            obj2 = abstractC32953Fs8.mo82291c(obj);
        }
        abstractC32953Fs8.mo82288f(obj2, i, i2);
        return obj2;
    }

    /* renamed from: c */
    public static void m45025c(W28 w28, Object obj, Object obj2) {
        C39542d48 mo24513b = w28.mo24513b(obj2);
        if (!mo24513b.f76101a.isEmpty()) {
            w28.mo24512c(obj).m44634h(mo24513b);
        }
    }

    /* renamed from: d */
    public static void m45024d(AbstractC32953Fs8 abstractC32953Fs8, Object obj, Object obj2) {
        abstractC32953Fs8.mo82286h(obj, abstractC32953Fs8.mo82289e(abstractC32953Fs8.mo82290d(obj), abstractC32953Fs8.mo82290d(obj2)));
    }

    /* renamed from: e */
    public static void m45023e(Class cls) {
        Class cls2;
        if (!V78.class.isAssignableFrom(cls) && (cls2 = f75682a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: f */
    public static void m45022f(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84558a(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m45021g(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84547l(i, list);
        }
    }

    /* renamed from: h */
    public static void m45020h(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84555d(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m45019i(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84556c(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m45018j(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84557b(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m45017k(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84554e(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m45016l(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84543p(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m45015m(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, InterfaceC32449Do8 interfaceC32449Do8) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((E18) interfaceC36040Sx8).mo84561H(i, list.get(i2), interfaceC32449Do8);
            }
        }
    }

    /* renamed from: n */
    public static void m45014n(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84545n(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m45013o(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84542q(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m45012p(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, InterfaceC32449Do8 interfaceC32449Do8) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((E18) interfaceC36040Sx8).mo84562G(i, list.get(i2), interfaceC32449Do8);
            }
        }
    }

    /* renamed from: q */
    public static void m45011q(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84564E(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m45010r(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84540s(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m45009s(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84534y(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m45008t(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84533z(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m45007u(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84568A(i, list);
        }
    }

    /* renamed from: v */
    public static void m45006v(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84535x(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m45005w(int i, List list, InterfaceC36040Sx8 interfaceC36040Sx8, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36040Sx8.mo84566C(i, list, z);
        }
    }

    /* renamed from: x */
    public static boolean m45004x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: y */
    public static AbstractC32953Fs8 m45003y(boolean z) {
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
            return (AbstractC32953Fs8) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: z */
    public static int m45002z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC47813r18.m16656A(i << 3) + 1);
    }
}
