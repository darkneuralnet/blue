package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwz;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC41030fb7;
import p000.C38048ab7;
/* renamed from: fb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC41030fb7<MessageType extends AbstractC41030fb7<MessageType, BuilderType>, BuilderType extends C38048ab7<MessageType, BuilderType>> extends AbstractC40427ea7<MessageType, BuilderType> {
    private static final Map zbb = new ConcurrentHashMap();
    private int zbd = -1;
    protected C32106Cc7 zbc = C32106Cc7.m111980c();

    /* renamed from: A */
    public static InterfaceC44588lb7 m41149A() {
        return C41623gb7.m37987c();
    }

    /* renamed from: B */
    public static InterfaceC45774nb7 m41148B() {
        return C33267Hb7.m103663c();
    }

    /* renamed from: C */
    public static InterfaceC46367ob7 m41147C() {
        return C41633gc7.m37975b();
    }

    /* renamed from: D */
    public static Object m41146D(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: c */
    public static Object m41144c(InterfaceC36075Tb7 interfaceC36075Tb7, String str, Object[] objArr) {
        return new C42226hc7(interfaceC36075Tb7, str, objArr);
    }

    /* renamed from: l */
    public static void m41135l(Class cls, AbstractC41030fb7 abstractC41030fb7) {
        abstractC41030fb7.m41136k();
        zbb.put(cls, abstractC41030fb7);
    }

    /* renamed from: n */
    public static final boolean m41133n(AbstractC41030fb7 abstractC41030fb7, boolean z) {
        Object obj;
        byte byteValue = ((Byte) abstractC41030fb7.mo1009p(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo33743e = C41040fc7.m41106a().m41105b(abstractC41030fb7.getClass()).mo33743e(abstractC41030fb7);
        if (z) {
            if (true != mo33743e) {
                obj = null;
            } else {
                obj = abstractC41030fb7;
            }
            abstractC41030fb7.mo1009p(2, obj, null);
        }
        return mo33743e;
    }

    /* renamed from: r */
    public static AbstractC41030fb7 m41130r(AbstractC41030fb7 abstractC41030fb7, byte[] bArr, int i, int i2, C34896Oa7 c34896Oa7) throws zbuw {
        AbstractC41030fb7 m41125x = abstractC41030fb7.m41125x();
        try {
            InterfaceC42819ic7 m41105b = C41040fc7.m41106a().m41105b(m41125x.getClass());
            m41105b.mo33744d(m41125x, bArr, 0, i2, new C44578la7(c34896Oa7));
            m41105b.mo33742f(m41125x);
            return m41125x;
        } catch (zbuw e) {
            e.m51257f(m41125x);
            throw e;
        } catch (zbwz e2) {
            zbuw m51255a = e2.m51255a();
            m51255a.m51257f(m41125x);
            throw m51255a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zbuw) {
                throw ((zbuw) e3.getCause());
            }
            zbuw zbuwVar = new zbuw(e3);
            zbuwVar.m51257f(m41125x);
            throw zbuwVar;
        } catch (IndexOutOfBoundsException unused) {
            zbuw m51256g = zbuw.m51256g();
            m51256g.m51257f(m41125x);
            throw m51256g;
        }
    }

    /* renamed from: v */
    public static C40437eb7 m41127v(InterfaceC36075Tb7 interfaceC36075Tb7, Object obj, InterfaceC36075Tb7 interfaceC36075Tb72, InterfaceC42809ib7 interfaceC42809ib7, int i, EnumC35616Rc7 enumC35616Rc7, Class cls) {
        return new C40437eb7(interfaceC36075Tb7, obj, interfaceC36075Tb72, new C39845db7(null, 32149011, enumC35616Rc7, false, false), cls);
    }

    /* renamed from: w */
    public static AbstractC41030fb7 m41126w(Class cls) {
        Map map = zbb;
        AbstractC41030fb7 abstractC41030fb7 = (AbstractC41030fb7) map.get(cls);
        if (abstractC41030fb7 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC41030fb7 = (AbstractC41030fb7) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC41030fb7 == null) {
            abstractC41030fb7 = (AbstractC41030fb7) ((AbstractC41030fb7) C34212Lc7.m96568j(cls)).mo1009p(6, null, null);
            if (abstractC41030fb7 != null) {
                map.put(cls, abstractC41030fb7);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC41030fb7;
    }

    /* renamed from: y */
    public static AbstractC41030fb7 m41124y(AbstractC41030fb7 abstractC41030fb7, byte[] bArr, C34896Oa7 c34896Oa7) throws zbuw {
        AbstractC41030fb7 m41130r = m41130r(abstractC41030fb7, bArr, 0, bArr.length, c34896Oa7);
        if (m41130r != null && !m41130r.mo41142e()) {
            zbuw m51255a = new zbwz(m41130r).m51255a();
            m51255a.m51257f(m41130r);
            throw m51255a;
        }
        return m41130r;
    }

    /* renamed from: z */
    public static InterfaceC43995kb7 m41123z() {
        return C37002Xa7.m76842b();
    }

    @Override // p000.AbstractC40427ea7
    /* renamed from: a */
    public final int mo41145a(InterfaceC42819ic7 interfaceC42819ic7) {
        if (m41132o()) {
            int m41131q = m41131q(interfaceC42819ic7);
            if (m41131q >= 0) {
                return m41131q;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m41131q);
        }
        int i = this.zbd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int m41131q2 = m41131q(interfaceC42819ic7);
        if (m41131q2 >= 0) {
            this.zbd = (this.zbd & Integer.MIN_VALUE) | m41131q2;
            return m41131q2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m41131q2);
    }

    @Override // p000.InterfaceC36075Tb7
    /* renamed from: d */
    public final int mo41143d() {
        int i;
        if (m41132o()) {
            i = m41131q(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zbd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m41131q(null);
                if (i >= 0) {
                    this.zbd = (this.zbd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    @Override // p000.InterfaceC36309Ub7
    /* renamed from: e */
    public final boolean mo41142e() {
        return m41133n(this, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C41040fc7.m41106a().m41105b(getClass()).mo33746b(this, (AbstractC41030fb7) obj);
        }
        return false;
    }

    @Override // p000.InterfaceC36075Tb7
    /* renamed from: f */
    public final /* synthetic */ InterfaceC35841Sb7 mo41141f() {
        return (C38048ab7) mo1009p(5, null, null);
    }

    @Override // p000.InterfaceC36075Tb7
    /* renamed from: g */
    public final /* synthetic */ InterfaceC35841Sb7 mo41140g() {
        C38048ab7 c38048ab7 = (C38048ab7) mo1009p(5, null, null);
        c38048ab7.m71107n(this);
        return c38048ab7;
    }

    @Override // p000.InterfaceC36309Ub7
    /* renamed from: h */
    public final /* synthetic */ InterfaceC36075Tb7 mo41139h() {
        return (AbstractC41030fb7) mo1009p(6, null, null);
    }

    public final int hashCode() {
        if (!m41132o()) {
            int i = this.zba;
            if (i == 0) {
                int m41129t = m41129t();
                this.zba = m41129t;
                return m41129t;
            }
            return i;
        }
        return m41129t();
    }

    /* renamed from: i */
    public final void m41138i() {
        C41040fc7.m41106a().m41105b(getClass()).mo33742f(this);
        m41136k();
    }

    @Override // p000.InterfaceC36075Tb7
    /* renamed from: j */
    public final void mo41137j(AbstractC33726Ja7 abstractC33726Ja7) throws IOException {
        C41040fc7.m41106a().m41105b(getClass()).mo33741g(this, C33960Ka7.m98723M(abstractC33726Ja7));
    }

    /* renamed from: k */
    public final void m41136k() {
        this.zbd &= Integer.MAX_VALUE;
    }

    /* renamed from: m */
    public final void m41134m(int i) {
        this.zbd = (this.zbd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: o */
    public final boolean m41132o() {
        return (this.zbd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: p */
    public abstract Object mo1009p(int i, Object obj, Object obj2);

    /* renamed from: q */
    public final int m41131q(InterfaceC42819ic7 interfaceC42819ic7) {
        if (interfaceC42819ic7 == null) {
            return C41040fc7.m41106a().m41105b(getClass()).mo33747a(this);
        }
        return interfaceC42819ic7.mo33747a(this);
    }

    /* renamed from: t */
    public final int m41129t() {
        return C41040fc7.m41106a().m41105b(getClass()).mo33740h(this);
    }

    public final String toString() {
        return C36543Vb7.m79682a(this, super.toString());
    }

    /* renamed from: u */
    public final C38048ab7 m41128u() {
        return (C38048ab7) mo1009p(5, null, null);
    }

    /* renamed from: x */
    public final AbstractC41030fb7 m41125x() {
        return (AbstractC41030fb7) mo1009p(4, null, null);
    }
}
