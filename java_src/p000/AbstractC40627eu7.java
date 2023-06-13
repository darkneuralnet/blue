package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzatc;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC40627eu7;
import p000.C37641Zt7;
/* renamed from: eu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40627eu7<MessageType extends AbstractC40627eu7<MessageType, BuilderType>, BuilderType extends C37641Zt7<MessageType, BuilderType>> extends AbstractC52465ys7<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected C49541tw7 zzc = C49541tw7.m11184c();
    protected int zzd = -1;

    /* renamed from: A */
    public static final boolean m42410A(AbstractC40627eu7 abstractC40627eu7, boolean z) {
        Object obj;
        byte byteValue = ((Byte) abstractC40627eu7.mo5B(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo29760d = C32979Fv7.m106247a().m106246b(abstractC40627eu7.getClass()).mo29760d(abstractC40627eu7);
        if (z) {
            if (true != mo29760d) {
                obj = null;
            } else {
                obj = abstractC40627eu7;
            }
            abstractC40627eu7.mo5B(2, obj, null);
        }
        return mo29760d;
    }

    /* renamed from: C */
    public static AbstractC40627eu7 m42409C(AbstractC40627eu7 abstractC40627eu7) throws zzaqw {
        if (abstractC40627eu7 != null && !abstractC40627eu7.mo37320n()) {
            zzaqw zzaqwVar = new zzaqw(new zzatc(abstractC40627eu7).getMessage());
            zzaqwVar.m51280h(abstractC40627eu7);
            throw zzaqwVar;
        }
        return abstractC40627eu7;
    }

    /* renamed from: j */
    public static AbstractC40627eu7 m42406j(Class cls) {
        Map map = zzb;
        AbstractC40627eu7 abstractC40627eu7 = (AbstractC40627eu7) map.get(cls);
        if (abstractC40627eu7 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC40627eu7 = (AbstractC40627eu7) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC40627eu7 == null) {
            abstractC40627eu7 = (AbstractC40627eu7) ((AbstractC40627eu7) C32286Cw7.m111243j(cls)).mo5B(6, null, null);
            if (abstractC40627eu7 != null) {
                map.put(cls, abstractC40627eu7);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC40627eu7;
    }

    /* renamed from: l */
    public static AbstractC40627eu7 m42405l(AbstractC40627eu7 abstractC40627eu7, InputStream inputStream, C53068zt7 c53068zt7) throws zzaqw {
        AbstractC46547ot7 c45954nt7;
        int i = AbstractC46547ot7.f102727d;
        if (inputStream == null) {
            byte[] bArr = C46557ou7.f102754d;
            int length = bArr.length;
            c45954nt7 = AbstractC46547ot7.m20345g(bArr, 0, 0, false);
        } else {
            c45954nt7 = new C45954nt7(inputStream, 4096, null);
        }
        AbstractC40627eu7 abstractC40627eu72 = (AbstractC40627eu7) abstractC40627eu7.mo5B(4, null, null);
        try {
            InterfaceC34851Nv7 m106246b = C32979Fv7.m106247a().m106246b(abstractC40627eu72.getClass());
            m106246b.mo29756h(abstractC40627eu72, C47140pt7.m18542O(c45954nt7), c53068zt7);
            m106246b.zzf(abstractC40627eu72);
            m42409C(abstractC40627eu72);
            return abstractC40627eu72;
        } catch (zzaqw e) {
            e = e;
            if (e.m51276l()) {
                e = new zzaqw(e);
            }
            e.m51280h(abstractC40627eu72);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzaqw) {
                throw ((zzaqw) e2.getCause());
            }
            zzaqw zzaqwVar = new zzaqw(e2);
            zzaqwVar.m51280h(abstractC40627eu72);
            throw zzaqwVar;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzaqw) {
                throw ((zzaqw) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: m */
    public static AbstractC40627eu7 m42404m(AbstractC40627eu7 abstractC40627eu7, byte[] bArr, C53068zt7 c53068zt7) throws zzaqw {
        AbstractC40627eu7 m42403o = m42403o(abstractC40627eu7, bArr, 0, bArr.length, c53068zt7);
        m42409C(m42403o);
        return m42403o;
    }

    /* renamed from: o */
    public static AbstractC40627eu7 m42403o(AbstractC40627eu7 abstractC40627eu7, byte[] bArr, int i, int i2, C53068zt7 c53068zt7) throws zzaqw {
        AbstractC40627eu7 abstractC40627eu72 = (AbstractC40627eu7) abstractC40627eu7.mo5B(4, null, null);
        try {
            InterfaceC34851Nv7 m106246b = C32979Fv7.m106247a().m106246b(abstractC40627eu72.getClass());
            m106246b.mo29759e(abstractC40627eu72, bArr, 0, i2, new C32952Fs7(c53068zt7));
            m106246b.zzf(abstractC40627eu72);
            if (abstractC40627eu72.zza == 0) {
                return abstractC40627eu72;
            }
            throw new RuntimeException();
        } catch (zzaqw e) {
            e = e;
            if (e.m51276l()) {
                e = new zzaqw(e);
            }
            e.m51280h(abstractC40627eu72);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzaqw) {
                throw ((zzaqw) e2.getCause());
            }
            zzaqw zzaqwVar = new zzaqw(e2);
            zzaqwVar.m51280h(abstractC40627eu72);
            throw zzaqwVar;
        } catch (IndexOutOfBoundsException unused) {
            zzaqw m51278j = zzaqw.m51278j();
            m51278j.m51280h(abstractC40627eu72);
            throw m51278j;
        }
    }

    /* renamed from: p */
    public static InterfaceC43592ju7 m42402p() {
        return C36939Wt7.m77730b();
    }

    /* renamed from: q */
    public static InterfaceC44185ku7 m42401q() {
        return C41220fu7.m40572c();
    }

    /* renamed from: r */
    public static InterfaceC45371mu7 m42400r() {
        return C36246Tu7.m82271c();
    }

    /* renamed from: s */
    public static InterfaceC45964nu7 m42399s() {
        return C33213Gv7.m104581b();
    }

    /* renamed from: t */
    public static InterfaceC45964nu7 m42398t(InterfaceC45964nu7 interfaceC45964nu7) {
        int i;
        int size = interfaceC45964nu7.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return interfaceC45964nu7.mo6153d(i);
    }

    /* renamed from: u */
    public static Object m42397u(Method method, Object obj, Object... objArr) {
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

    /* renamed from: v */
    public static Object m42396v(InterfaceC41230fv7 interfaceC41230fv7, String str, Object[] objArr) {
        return new C33447Hv7(interfaceC41230fv7, str, objArr);
    }

    /* renamed from: x */
    public static void m42395x(Class cls, AbstractC40627eu7 abstractC40627eu7) {
        zzb.put(cls, abstractC40627eu7);
    }

    /* renamed from: B */
    public abstract Object mo5B(int i, Object obj, Object obj2);

    @Override // p000.AbstractC52465ys7
    /* renamed from: b */
    final int mo2344b() {
        return this.zzd;
    }

    @Override // p000.AbstractC52465ys7
    /* renamed from: d */
    public final void mo2342d(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C32979Fv7.m106247a().m106246b(getClass()).mo29757g(this, (AbstractC40627eu7) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final C37641Zt7 m42408f() {
        return (C37641Zt7) mo5B(5, null, null);
    }

    /* renamed from: h */
    public final C37641Zt7 m42407h() {
        C37641Zt7 c37641Zt7 = (C37641Zt7) mo5B(5, null, null);
        c37641Zt7.m72342j(this);
        return c37641Zt7;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = C32979Fv7.m106247a().m106246b(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    @Override // p000.InterfaceC41230fv7
    /* renamed from: k */
    public final /* synthetic */ InterfaceC40637ev7 mo191k() {
        return (C37641Zt7) mo5B(5, null, null);
    }

    @Override // p000.InterfaceC41823gv7
    /* renamed from: n */
    public final boolean mo37320n() {
        return m42410A(this, true);
    }

    public final String toString() {
        return C42416hv7.m35487a(this, super.toString());
    }

    @Override // p000.InterfaceC41230fv7
    /* renamed from: w */
    public final int mo40440w() {
        int i = this.zzd;
        if (i == -1) {
            int zza = C32979Fv7.m106247a().m106246b(getClass()).zza(this);
            this.zzd = zza;
            return zza;
        }
        return i;
    }

    @Override // p000.InterfaceC41230fv7
    /* renamed from: y */
    public final void mo190y(AbstractC50104ut7 abstractC50104ut7) throws IOException {
        C32979Fv7.m106247a().m106246b(getClass()).mo29758f(this, C50696vt7.m7836L(abstractC50104ut7));
    }

    @Override // p000.InterfaceC41230fv7
    /* renamed from: z */
    public final /* synthetic */ InterfaceC40637ev7 mo189z() {
        C37641Zt7 c37641Zt7 = (C37641Zt7) mo5B(5, null, null);
        c37641Zt7.m72342j(this);
        return c37641Zt7;
    }

    @Override // p000.InterfaceC41823gv7
    public final /* synthetic */ InterfaceC41230fv7 zzw() {
        return (AbstractC40627eu7) mo5B(6, null, null);
    }
}
