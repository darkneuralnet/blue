package p000;

import com.google.android.gms.internal.auth.zzew;
import com.google.android.gms.internal.auth.zzgo;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC35140Pb8;
import p000.C45775nb8;
/* renamed from: Pb8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC35140Pb8<MessageType extends AbstractC35140Pb8<MessageType, BuilderType>, BuilderType extends C45775nb8<MessageType, BuilderType>> extends AbstractC45451n28<MessageType, BuilderType> {
    private static final Map<Object, AbstractC35140Pb8<?, ?>> zzb = new ConcurrentHashMap();
    protected C35275Pq8 zzc = C35275Pq8.m89701a();

    /* renamed from: a */
    public static <T extends AbstractC35140Pb8> T m90069a(Class<T> cls) {
        Map<Object, AbstractC35140Pb8<?, ?>> map = zzb;
        AbstractC35140Pb8<?, ?> abstractC35140Pb8 = map.get(cls);
        if (abstractC35140Pb8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC35140Pb8 = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC35140Pb8 == null) {
            abstractC35140Pb8 = (AbstractC35140Pb8) ((AbstractC35140Pb8) C38229at8.m65317e(cls)).mo42375h(6, null, null);
            if (abstractC35140Pb8 != null) {
                map.put(cls, abstractC35140Pb8);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC35140Pb8;
    }

    /* renamed from: b */
    public static <T extends AbstractC35140Pb8<T, ?>> T m90068b(T t, byte[] bArr) throws zzew {
        Object obj;
        boolean z = false;
        T t2 = (T) m90067c(t, bArr, 0, bArr.length, W88.m78782a());
        if (t2 != null) {
            byte byteValue = ((Byte) t2.mo42375h(1, null, null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = C34528Ml8.m94915a().m94914b(t2.getClass()).mo2693c(t2);
                if (true != z) {
                    obj = null;
                } else {
                    obj = t2;
                }
                t2.mo42375h(2, obj, null);
            }
            if (!z) {
                zzew zzewVar = new zzew(new zzgo(t2).getMessage());
                zzewVar.m51575e(t2);
                throw zzewVar;
            }
        }
        return t2;
    }

    /* renamed from: c */
    public static <T extends AbstractC35140Pb8<T, ?>> T m90067c(T t, byte[] bArr, int i, int i2, W88 w88) throws zzew {
        T t2 = (T) t.mo42375h(4, null, null);
        try {
            InterfaceC45895nn8 m94914b = C34528Ml8.m94915a().m94914b(t2.getClass());
            m94914b.mo2691e(t2, bArr, 0, i2, new C39532d38(w88));
            m94914b.mo2694b(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzew e) {
            e.m51575e(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzew) {
                throw ((zzew) e2.getCause());
            }
            zzew zzewVar = new zzew(e2);
            zzewVar.m51575e(t2);
            throw zzewVar;
        } catch (IndexOutOfBoundsException unused) {
            zzew m51574f = zzew.m51574f();
            m51574f.m51575e(t2);
            throw m51574f;
        }
    }

    /* renamed from: d */
    public static <E> InterfaceC35383Qc8<E> m90066d() {
        return C37570Zl8.m72546b();
    }

    /* renamed from: e */
    public static Object m90065e(Method method, Object obj, Object... objArr) {
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

    /* renamed from: f */
    public static Object m90064f(InterfaceC34042Kj8 interfaceC34042Kj8, String str, Object[] objArr) {
        return new C38169an8(interfaceC34042Kj8, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    /* renamed from: g */
    public static <T extends AbstractC35140Pb8> void m90063g(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C34528Ml8.m94915a().m94914b(getClass()).mo2692d(this, (AbstractC35140Pb8) obj);
    }

    /* renamed from: h */
    public abstract Object mo42375h(int i, Object obj, Object obj2);

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = C34528Ml8.m94915a().m94914b(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return C44679lk8.m26886a(this, super.toString());
    }

    @Override // p000.InterfaceC34042Kj8
    public final /* bridge */ /* synthetic */ InterfaceC51783xj8 zze() {
        C45775nb8 c45775nb8 = (C45775nb8) mo42375h(5, null, null);
        c45775nb8.m23457g(this);
        return c45775nb8;
    }

    @Override // p000.InterfaceC37318Yj8
    public final /* bridge */ /* synthetic */ InterfaceC34042Kj8 zzh() {
        return (AbstractC35140Pb8) mo42375h(6, null, null);
    }
}
