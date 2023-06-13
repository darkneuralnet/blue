package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzqu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC49926ub9;
import p000.Fa9;
/* renamed from: ub9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC49926ub9<MessageType extends AbstractC49926ub9<MessageType, BuilderType>, BuilderType extends Fa9<MessageType, BuilderType>> extends A39<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected Sk9 zzc = Sk9.m84915c();
    protected int zzd = -1;

    /* renamed from: e */
    public static InterfaceC39857dc9 m9991e() {
        return C47032pi9.m18902b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Object m9990f(Method method, Object obj, Object... objArr) {
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

    /* renamed from: j */
    public static Object m9988j(InterfaceC47012pg9 interfaceC47012pg9, String str, Object[] objArr) {
        return new C51181wi9(interfaceC47012pg9, str, objArr);
    }

    /* renamed from: k */
    public static void m9987k(Class cls, AbstractC49926ub9 abstractC49926ub9) {
        zzb.put(cls, abstractC49926ub9);
    }

    /* renamed from: l */
    public static final boolean m9986l(AbstractC49926ub9 abstractC49926ub9, boolean z) {
        Object obj;
        byte byteValue = ((Byte) abstractC49926ub9.mo9690n(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo83162e = C42288hi9.m36060a().m36059b(abstractC49926ub9.getClass()).mo83162e(abstractC49926ub9);
        if (z) {
            if (true != mo83162e) {
                obj = null;
            } else {
                obj = abstractC49926ub9;
            }
            abstractC49926ub9.mo9690n(2, obj, null);
        }
        return mo83162e;
    }

    /* renamed from: m */
    public static AbstractC49926ub9 m9985m(AbstractC49926ub9 abstractC49926ub9, byte[] bArr, int i, int i2, N89 n89) throws zzov {
        AbstractC49926ub9 abstractC49926ub92 = (AbstractC49926ub9) abstractC49926ub9.mo9690n(4, null, null);
        try {
            Ei9 m36059b = C42288hi9.m36060a().m36059b(abstractC49926ub92.getClass());
            m36059b.mo83165b(abstractC49926ub92, bArr, 0, i2, new C43100j49(n89));
            m36059b.zzf(abstractC49926ub92);
            if (abstractC49926ub92.zza == 0) {
                return abstractC49926ub92;
            }
            throw new RuntimeException();
        } catch (zzov e) {
            e.m51290f(abstractC49926ub92);
            throw e;
        } catch (zzqu e2) {
            zzov m51288a = e2.m51288a();
            m51288a.m51290f(abstractC49926ub92);
            throw m51288a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzov) {
                throw ((zzov) e3.getCause());
            }
            zzov zzovVar = new zzov(e3);
            zzovVar.m51290f(abstractC49926ub92);
            throw zzovVar;
        } catch (IndexOutOfBoundsException unused) {
            zzov m51289g = zzov.m51289g();
            m51289g.m51290f(abstractC49926ub92);
            throw m51289g;
        }
    }

    /* renamed from: p */
    public static C42218hb9 m9983p(InterfaceC47012pg9 interfaceC47012pg9, InterfaceC47012pg9 interfaceC47012pg92, Pb9 pb9, int i, EnumC41152fn9 enumC41152fn9, boolean z, Class cls) {
        return new C42218hb9(interfaceC47012pg9, Collections.emptyList(), interfaceC47012pg92, new C38050ab9(null, 202056002, enumC41152fn9, true, false), cls);
    }

    /* renamed from: s */
    public static AbstractC49926ub9 m9980s(Class cls) {
        Map map = zzb;
        AbstractC49926ub9 abstractC49926ub9 = (AbstractC49926ub9) map.get(cls);
        if (abstractC49926ub9 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC49926ub9 = (AbstractC49926ub9) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC49926ub9 == null) {
            abstractC49926ub9 = (AbstractC49926ub9) ((AbstractC49926ub9) C51221wm9.m6357j(cls)).mo9690n(6, null, null);
            if (abstractC49926ub9 != null) {
                map.put(cls, abstractC49926ub9);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC49926ub9;
    }

    /* renamed from: t */
    public static AbstractC49926ub9 m9979t(AbstractC49926ub9 abstractC49926ub9, byte[] bArr, N89 n89) throws zzov {
        AbstractC49926ub9 m9985m = m9985m(abstractC49926ub9, bArr, 0, bArr.length, n89);
        if (m9985m != null && !m9985m.zzv()) {
            zzov m51288a = new zzqu(m9985m).m51288a();
            m51288a.m51290f(m9985m);
            throw m51288a;
        }
        return m9985m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.A39
    /* renamed from: a */
    public final int mo9994a() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.A39
    /* renamed from: b */
    public final void mo9993b(int i) {
        this.zzd = i;
    }

    @Override // p000.InterfaceC47012pg9
    /* renamed from: d */
    public final void mo9992d(Z79 z79) throws IOException {
        C42288hi9.m36060a().m36059b(getClass()).mo83163d(this, C41954h89.m36785m(z79));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C42288hi9.m36060a().m36059b(getClass()).mo83164c(this, (AbstractC49926ub9) obj);
        }
        return false;
    }

    @Override // p000.InterfaceC51161wg9
    /* renamed from: g */
    public final /* synthetic */ InterfaceC47012pg9 mo6491g() {
        return (AbstractC49926ub9) mo9690n(6, null, null);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = C42288hi9.m36060a().m36059b(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    @Override // p000.InterfaceC47012pg9
    /* renamed from: i */
    public final int mo9989i() {
        int i = this.zzd;
        if (i == -1) {
            int zza = C42288hi9.m36060a().m36059b(getClass()).zza(this);
            this.zzd = zza;
            return zza;
        }
        return i;
    }

    /* renamed from: n */
    public abstract Object mo9690n(int i, Object obj, Object obj2);

    /* renamed from: o */
    public final Fa9 m9984o() {
        return (Fa9) mo9690n(5, null, null);
    }

    @Override // p000.InterfaceC47012pg9
    /* renamed from: q */
    public final /* synthetic */ InterfaceC42861ig9 mo9982q() {
        return (Fa9) mo9690n(5, null, null);
    }

    @Override // p000.InterfaceC47012pg9
    /* renamed from: r */
    public final /* synthetic */ InterfaceC42861ig9 mo9981r() {
        Fa9 fa9 = (Fa9) mo9690n(5, null, null);
        fa9.m106922l(this);
        return fa9;
    }

    public final String toString() {
        return Dg9.m110012a(this, super.toString());
    }

    @Override // p000.InterfaceC51161wg9
    public final boolean zzv() {
        return m9986l(this, true);
    }
}
