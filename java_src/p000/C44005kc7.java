package p000;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
/* renamed from: kc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44005kc7 {

    /* renamed from: a */
    public static final Class f94645a;

    /* renamed from: b */
    public static final AbstractC31872Bc7 f94646b;

    /* renamed from: c */
    public static final AbstractC31872Bc7 f94647c;

    /* renamed from: d */
    public static final AbstractC31872Bc7 f94648d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f94645a = cls;
        f94646b = m28741y(false);
        f94647c = m28741y(true);
        f94648d = new C32340Dc7();
    }

    /* renamed from: A */
    public static int m28790A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m100166a = size * AbstractC33726Ja7.m100166a(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int mo1072c = ((AbstractC32088Ca7) list.get(i2)).mo1072c();
            m100166a += AbstractC33726Ja7.m100166a(mo1072c) + mo1072c;
        }
        return m100166a;
    }

    /* renamed from: B */
    public static int m28789B(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m28788C(list) + (size * AbstractC33726Ja7.m100166a(i << 3));
    }

    /* renamed from: C */
    public static int m28788C(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41623gb7) {
            C41623gb7 c41623gb7 = (C41623gb7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100170B(c41623gb7.m37988b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100170B(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static int m28787D(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC33726Ja7.m100166a(i << 3) + 4);
    }

    /* renamed from: E */
    public static int m28786E(List list) {
        return list.size() * 4;
    }

    /* renamed from: F */
    public static int m28785F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC33726Ja7.m100166a(i << 3) + 8);
    }

    /* renamed from: G */
    public static int m28784G(List list) {
        return list.size() * 8;
    }

    /* renamed from: H */
    public static int m28783H(int i, List list, InterfaceC42819ic7 interfaceC42819ic7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC33726Ja7.m100171A(i, (InterfaceC36075Tb7) list.get(i3), interfaceC42819ic7);
        }
        return i2;
    }

    /* renamed from: I */
    public static int m28782I(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m28781J(list) + (size * AbstractC33726Ja7.m100166a(i << 3));
    }

    /* renamed from: J */
    public static int m28781J(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41623gb7) {
            C41623gb7 c41623gb7 = (C41623gb7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100170B(c41623gb7.m37988b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100170B(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static int m28780K(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m28779L(list) + (list.size() * AbstractC33726Ja7.m100166a(i << 3));
    }

    /* renamed from: L */
    public static int m28779L(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C33267Hb7) {
            C33267Hb7 c33267Hb7 = (C33267Hb7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100165b(c33267Hb7.m103664b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100165b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    public static int m28778M(int i, Object obj, InterfaceC42819ic7 interfaceC42819ic7) {
        if (obj instanceof C52295yb7) {
            Logger logger = AbstractC33726Ja7.f17883b;
            int m3195a = ((C52295yb7) obj).m3195a();
            return AbstractC33726Ja7.m100166a(i << 3) + AbstractC33726Ja7.m100166a(m3195a) + m3195a;
        }
        return AbstractC33726Ja7.m100166a(i << 3) + AbstractC33726Ja7.m100168D((InterfaceC36075Tb7) obj, interfaceC42819ic7);
    }

    /* renamed from: N */
    public static int m28777N(int i, List list, InterfaceC42819ic7 interfaceC42819ic7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m100166a = AbstractC33726Ja7.m100166a(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C52295yb7) {
                int m3195a = ((C52295yb7) obj).m3195a();
                m100166a += AbstractC33726Ja7.m100166a(m3195a) + m3195a;
            } else {
                m100166a += AbstractC33726Ja7.m100168D((InterfaceC36075Tb7) obj, interfaceC42819ic7);
            }
        }
        return m100166a;
    }

    /* renamed from: O */
    public static int m28776O(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m28775P(list) + (size * AbstractC33726Ja7.m100166a(i << 3));
    }

    /* renamed from: P */
    public static int m28775P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41623gb7) {
            C41623gb7 c41623gb7 = (C41623gb7) list;
            i = 0;
            while (i2 < size) {
                int m37988b = c41623gb7.m37988b(i2);
                i += AbstractC33726Ja7.m100166a((m37988b >> 31) ^ (m37988b + m37988b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += AbstractC33726Ja7.m100166a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m28774Q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m28773R(list) + (size * AbstractC33726Ja7.m100166a(i << 3));
    }

    /* renamed from: R */
    public static int m28773R(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C33267Hb7) {
            C33267Hb7 c33267Hb7 = (C33267Hb7) list;
            i = 0;
            while (i2 < size) {
                long m103664b = c33267Hb7.m103664b(i2);
                i += AbstractC33726Ja7.m100165b((m103664b >> 63) ^ (m103664b + m103664b));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += AbstractC33726Ja7.m100165b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: S */
    public static int m28772S(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        Logger logger = AbstractC33726Ja7.f17883b;
        boolean z = list instanceof InterfaceC31629Ab7;
        int m100166a = AbstractC33726Ja7.m100166a(i << 3) * size;
        if (z) {
            InterfaceC31629Ab7 interfaceC31629Ab7 = (InterfaceC31629Ab7) list;
            while (i2 < size) {
                Object mo1044c1 = interfaceC31629Ab7.mo1044c1(i2);
                if (mo1044c1 instanceof AbstractC32088Ca7) {
                    int mo1072c = ((AbstractC32088Ca7) mo1044c1).mo1072c();
                    m100166a += AbstractC33726Ja7.m100166a(mo1072c) + mo1072c;
                } else {
                    m100166a += AbstractC33726Ja7.m100167E((String) mo1044c1);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC32088Ca7) {
                    int mo1072c2 = ((AbstractC32088Ca7) obj).mo1072c();
                    m100166a += AbstractC33726Ja7.m100166a(mo1072c2) + mo1072c2;
                } else {
                    m100166a += AbstractC33726Ja7.m100167E((String) obj);
                }
                i2++;
            }
        }
        return m100166a;
    }

    /* renamed from: T */
    public static int m28771T(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m28770U(list) + (size * AbstractC33726Ja7.m100166a(i << 3));
    }

    /* renamed from: U */
    public static int m28770U(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C41623gb7) {
            C41623gb7 c41623gb7 = (C41623gb7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100166a(c41623gb7.m37988b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100166a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: V */
    public static int m28769V(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m28768W(list) + (size * AbstractC33726Ja7.m100166a(i << 3));
    }

    /* renamed from: W */
    public static int m28768W(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C33267Hb7) {
            C33267Hb7 c33267Hb7 = (C33267Hb7) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100165b(c33267Hb7.m103664b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC33726Ja7.m100165b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: X */
    public static AbstractC31872Bc7 m28767X() {
        return f94646b;
    }

    /* renamed from: Y */
    public static AbstractC31872Bc7 m28766Y() {
        return f94647c;
    }

    /* renamed from: a */
    public static AbstractC31872Bc7 m28765a() {
        return f94648d;
    }

    /* renamed from: b */
    public static Object m28764b(Object obj, int i, int i2, Object obj2, AbstractC31872Bc7 abstractC31872Bc7) {
        if (obj2 == null) {
            obj2 = abstractC31872Bc7.mo110103c(obj);
        }
        abstractC31872Bc7.mo110099g(obj2, i, i2);
        return obj2;
    }

    /* renamed from: c */
    public static void m28763c(AbstractC35130Pa7 abstractC35130Pa7, Object obj, Object obj2) {
        C36066Ta7 mo88388b = abstractC35130Pa7.mo88388b(obj2);
        if (!mo88388b.f35709a.isEmpty()) {
            abstractC35130Pa7.mo88387c(obj).m83374i(mo88388b);
        }
    }

    /* renamed from: d */
    public static void m28762d(AbstractC31872Bc7 abstractC31872Bc7, Object obj, Object obj2) {
        abstractC31872Bc7.mo110096j(obj, abstractC31872Bc7.mo110101e(abstractC31872Bc7.mo110102d(obj), abstractC31872Bc7.mo110102d(obj2)));
    }

    /* renamed from: e */
    public static void m28761e(Class cls) {
        Class cls2;
        if (!AbstractC41030fb7.class.isAssignableFrom(cls) && (cls2 = f94645a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: f */
    public static void m28760f(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83289g(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m28759g(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83281o(i, list);
        }
    }

    /* renamed from: h */
    public static void m28758h(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83270z(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m28757i(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83304D(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m28756j(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83277s(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m28755k(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83275u(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m28754l(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83298J(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m28753m(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, InterfaceC42819ic7 interfaceC42819ic7) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C33960Ka7) interfaceC36084Tc7).mo83295a(i, list.get(i2), interfaceC42819ic7);
            }
        }
    }

    /* renamed from: n */
    public static void m28752n(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83302F(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m28751o(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83301G(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m28750p(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, InterfaceC42819ic7 interfaceC42819ic7) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C33960Ka7) interfaceC36084Tc7).mo83292d(i, list.get(i2), interfaceC42819ic7);
            }
        }
    }

    /* renamed from: q */
    public static void m28749q(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83291e(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m28748r(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83285k(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m28747s(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83271y(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m28746t(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83272x(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m28745u(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83294b(i, list);
        }
    }

    /* renamed from: v */
    public static void m28744v(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83273w(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m28743w(int i, List list, InterfaceC36084Tc7 interfaceC36084Tc7, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            interfaceC36084Tc7.mo83297K(i, list, z);
        }
    }

    /* renamed from: x */
    public static boolean m28742x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: y */
    public static AbstractC31872Bc7 m28741y(boolean z) {
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
            return (AbstractC31872Bc7) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: z */
    public static int m28740z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC33726Ja7.m100166a(i << 3) + 1);
    }
}
