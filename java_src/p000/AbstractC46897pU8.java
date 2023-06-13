package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC46897pU8;
import p000.US8;
/* renamed from: pU8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC46897pU8<MessageType extends AbstractC46897pU8<MessageType, BuilderType>, BuilderType extends US8<MessageType, BuilderType>> extends QJ8<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected Y69 zzc = Y69.m75687c();

    /* renamed from: k */
    public static AbstractC46897pU8 m19207k(Class cls) {
        Map map = zza;
        AbstractC46897pU8 abstractC46897pU8 = (AbstractC46897pU8) map.get(cls);
        if (abstractC46897pU8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC46897pU8 = (AbstractC46897pU8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC46897pU8 == null) {
            abstractC46897pU8 = (AbstractC46897pU8) ((AbstractC46897pU8) C44919m89.m26269j(cls)).mo8350A(6, null, null);
            if (abstractC46897pU8 != null) {
                map.put(cls, abstractC46897pU8);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC46897pU8;
    }

    /* renamed from: n */
    public static InterfaceC48092rV8 m19205n() {
        return AU8.m115722c();
    }

    /* renamed from: o */
    public static CV8 m19204o() {
        return IY8.m101935b();
    }

    /* renamed from: p */
    public static CV8 m19203p(CV8 cv8) {
        int i;
        int size = cv8.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return cv8.zze(i);
    }

    /* renamed from: q */
    public static NV8 m19202q() {
        return C38329b39.m65048b();
    }

    /* renamed from: r */
    public static NV8 m19201r(NV8 nv8) {
        int i;
        int size = nv8.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return nv8.mo21037d(i);
    }

    /* renamed from: s */
    public static Object m19200s(Method method, Object obj, Object... objArr) {
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

    /* renamed from: t */
    public static Object m19199t(InterfaceC47814r19 interfaceC47814r19, String str, Object[] objArr) {
        return new C50797w39(interfaceC47814r19, str, objArr);
    }

    /* renamed from: w */
    public static void m19196w(Class cls, AbstractC46897pU8 abstractC46897pU8) {
        abstractC46897pU8.m19197v();
        zza.put(cls, abstractC46897pU8);
    }

    /* renamed from: A */
    public abstract Object mo8350A(int i, Object obj, Object obj2);

    @Override // p000.QJ8
    /* renamed from: a */
    public final int mo19212a(F39 f39) {
        if (m19194y()) {
            int m19210h = m19210h(f39);
            if (m19210h >= 0) {
                return m19210h;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m19210h);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int m19210h2 = m19210h(f39);
        if (m19210h2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | m19210h2;
            return m19210h2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m19210h2);
    }

    @Override // p000.InterfaceC47814r19
    /* renamed from: d */
    public final void mo16628d(QP8 qp8) throws IOException {
        R29.m87386a().m87385b(getClass()).mo43316d(this, C38542bQ8.m64535J(qp8));
    }

    @Override // p000.InterfaceC47814r19
    /* renamed from: e */
    public final /* synthetic */ InterfaceC41884h19 mo16627e() {
        return (US8) mo8350A(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return R29.m87386a().m87385b(getClass()).mo43317c(this, (AbstractC46897pU8) obj);
        }
        return false;
    }

    @Override // p000.A19
    /* renamed from: f */
    public final /* synthetic */ InterfaceC47814r19 mo19211f() {
        return (AbstractC46897pU8) mo8350A(6, null, null);
    }

    /* renamed from: h */
    public final int m19210h(F39 f39) {
        if (f39 == null) {
            return R29.m87386a().m87385b(getClass()).zza(this);
        }
        return f39.zza(this);
    }

    public final int hashCode() {
        if (!m19194y()) {
            int i = this.zzb;
            if (i == 0) {
                int m19193z = m19193z();
                this.zzb = m19193z;
                return m19193z;
            }
            return i;
        }
        return m19193z();
    }

    /* renamed from: i */
    public final US8 m19209i() {
        return (US8) mo8350A(5, null, null);
    }

    /* renamed from: j */
    public final US8 m19208j() {
        US8 us8 = (US8) mo8350A(5, null, null);
        us8.m81478o(this);
        return us8;
    }

    /* renamed from: l */
    public final AbstractC46897pU8 m19206l() {
        return (AbstractC46897pU8) mo8350A(4, null, null);
    }

    @Override // p000.InterfaceC47814r19
    /* renamed from: m */
    public final int mo16625m() {
        int i;
        if (m19194y()) {
            i = m19210h(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m19210h(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    public final String toString() {
        return K19.m99329a(this, super.toString());
    }

    /* renamed from: u */
    public final void m19198u() {
        R29.m87386a().m87385b(getClass()).zzf(this);
        m19197v();
    }

    /* renamed from: v */
    public final void m19197v() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: x */
    public final void m19195x(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: y */
    public final boolean m19194y() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: z */
    public final int m19193z() {
        return R29.m87386a().m87385b(getClass()).zzb(this);
    }
}
