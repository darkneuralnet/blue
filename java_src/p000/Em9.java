package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C38753bm9;
import p000.Em9;
/* renamed from: Em9 */
/* loaded from: classes6.dex */
public abstract class Em9<MessageType extends Em9<MessageType, BuilderType>, BuilderType extends C38753bm9<MessageType, BuilderType>> extends Ne9<MessageType, BuilderType> {
    private static final Map<Object, Em9<?, ?>> zzb = new ConcurrentHashMap();
    protected Pr9 zzc = Pr9.m89676c();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Object m108373k(Method method, Object obj, Object... objArr) {
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

    /* renamed from: l */
    public static Object m108372l(Np9 np9, String str, Object[] objArr) {
        return new C49483tq9(np9, str, objArr);
    }

    /* renamed from: m */
    public static <T extends Em9> void m108371m(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: r */
    public static <T extends Em9> T m108368r(Class<T> cls) {
        Map<Object, Em9<?, ?>> map = zzb;
        Em9<?, ?> em9 = map.get(cls);
        if (em9 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                em9 = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (em9 == null) {
            em9 = (Em9) ((Em9) Fs9.m106346j(cls)).mo1998n(6, null, null);
            if (em9 != null) {
                map.put(cls, em9);
            } else {
                throw new IllegalStateException();
            }
        }
        return em9;
    }

    /* renamed from: s */
    public static <T extends Em9<T, ?>> T m108367s(T t, AbstractC49403ti9 abstractC49403ti9, C48830sk9 c48830sk9) throws zzrr {
        T t2 = (T) t.mo1998n(4, null, null);
        try {
            InterfaceC38803br9 m22328b = C45926nq9.m22329a().m22328b(t2.getClass());
            m22328b.mo62272b(t2, Ai9.m115363O(abstractC49403ti9), c48830sk9);
            m22328b.mo62273a(t2);
            return t2;
        } catch (zzrr e) {
            e = e;
            if (e.m51019l()) {
                e = new zzrr(e);
            }
            e.m51023h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzrr) {
                throw ((zzrr) e2.getCause());
            }
            zzrr zzrrVar = new zzrr(e2);
            zzrrVar.m51023h(t2);
            throw zzrrVar;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzrr) {
                throw ((zzrr) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: u */
    public static InterfaceC42931in9 m108366u() {
        return Km9.m98294c();
    }

    /* renamed from: v */
    public static <E> An9<E> m108365v() {
        return C47705qq9.m16913b();
    }

    @Override // p000.Ne9
    /* renamed from: a */
    public final int mo93595a() {
        return this.zzd;
    }

    @Override // p000.Pp9
    /* renamed from: d */
    public final boolean mo89719d() {
        Em9<MessageType, BuilderType> em9;
        byte byteValue = ((Byte) mo1998n(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo62271c = C45926nq9.m22329a().m22328b(getClass()).mo62271c(this);
        if (true != mo62271c) {
            em9 = null;
        } else {
            em9 = this;
        }
        mo1998n(2, em9, null);
        return mo62271c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C45926nq9.m22329a().m22328b(getClass()).mo62270d(this, (Em9) obj);
    }

    @Override // p000.Np9
    /* renamed from: g */
    public final int mo93341g() {
        int i = this.zzd;
        if (i == -1) {
            int zza = C45926nq9.m22329a().m22328b(getClass()).zza(this);
            this.zzd = zza;
            return zza;
        }
        return i;
    }

    @Override // p000.Pp9
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Np9 mo64027h() {
        return (Em9) mo1998n(6, null, null);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = C45926nq9.m22329a().m22328b(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    @Override // p000.Ne9
    /* renamed from: i */
    final void mo93593i(int i) {
        this.zzd = i;
    }

    @Override // p000.Np9
    /* renamed from: j */
    public final void mo81209j(AbstractC48228rj9 abstractC48228rj9) throws IOException {
        C45926nq9.m22329a().m22328b(getClass()).mo62269e(this, C52377yj9.m2742K(abstractC48228rj9));
    }

    /* renamed from: n */
    public abstract Object mo1998n(int i, Object obj, Object obj2);

    /* renamed from: o */
    public final <MessageType extends Em9<MessageType, BuilderType>, BuilderType extends C38753bm9<MessageType, BuilderType>> BuilderType m108370o() {
        return (BuilderType) mo1998n(5, null, null);
    }

    @Override // p000.Np9
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ Kp9 mo81208p() {
        return (C38753bm9) mo1998n(5, null, null);
    }

    /* renamed from: q */
    public final BuilderType m108369q() {
        BuilderType buildertype = (BuilderType) mo1998n(5, null, null);
        buildertype.m64022o(this);
        return buildertype;
    }

    @Override // p000.Np9
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ Kp9 mo81207t() {
        C38753bm9 c38753bm9 = (C38753bm9) mo1998n(5, null, null);
        c38753bm9.m64022o(this);
        return c38753bm9;
    }

    public final String toString() {
        return Sp9.m84803a(this, super.toString());
    }

    @Override // p000.Np9
    /* renamed from: z */
    public final InterfaceC42368hq9<MessageType> mo93340z() {
        return (InterfaceC42368hq9) mo1998n(7, null, null);
    }
}
