package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgx;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C43702k58;
import p000.V78;
/* renamed from: V78 */
/* loaded from: classes5.dex */
public abstract class V78<MessageType extends V78<MessageType, BuilderType>, BuilderType extends C43702k58<MessageType, BuilderType>> extends GT7<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected C36463Us8 zzc = C36463Us8.m80680c();

    /* renamed from: C */
    public static final boolean m80357C(V78 v78, boolean z) {
        Object obj;
        byte byteValue = ((Byte) v78.mo3770G(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo40918b = C48247rl8.m15451a().m15450b(v78.getClass()).mo40918b(v78);
        if (z) {
            if (true != mo40918b) {
                obj = null;
            } else {
                obj = v78;
            }
            v78.mo3770G(2, obj, null);
        }
        return mo40918b;
    }

    /* renamed from: F */
    public static V78 m80354F(V78 v78, byte[] bArr, int i, int i2, J28 j28) throws zzeo {
        V78 m80347j = v78.m80347j();
        try {
            InterfaceC32449Do8 m15450b = C48247rl8.m15451a().m15450b(m80347j.getClass());
            m15450b.mo40916d(m80347j, bArr, 0, i2, new FU7(j28));
            m15450b.zzf(m80347j);
            return m80347j;
        } catch (zzeo e) {
            e.m51316f(m80347j);
            throw e;
        } catch (zzgx e2) {
            zzeo m51314a = e2.m51314a();
            m51314a.m51316f(m80347j);
            throw m51314a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzeo) {
                throw ((zzeo) e3.getCause());
            }
            zzeo zzeoVar = new zzeo(e3);
            zzeoVar.m51316f(m80347j);
            throw zzeoVar;
        } catch (IndexOutOfBoundsException unused) {
            zzeo m51315g = zzeo.m51315g();
            m51315g.m51316f(m80347j);
            throw m51315g;
        }
    }

    /* renamed from: h */
    public static C47280q78 m80349h(InterfaceC39926dj8 interfaceC39926dj8, Object obj, InterfaceC39926dj8 interfaceC39926dj82, Q88 q88, int i, EnumC50737vx8 enumC50737vx8, Class cls) {
        return new C47280q78(interfaceC39926dj8, obj, interfaceC39926dj82, new C38368b78(null, i, enumC50737vx8, false, false), cls);
    }

    /* renamed from: i */
    public static V78 m80348i(Class cls) {
        Map map = zza;
        V78 v78 = (V78) map.get(cls);
        if (v78 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                v78 = (V78) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (v78 == null) {
            v78 = (V78) ((V78) C37192Xv8.m76069j(cls)).mo3770G(6, null, null);
            if (v78 != null) {
                map.put(cls, v78);
            } else {
                throw new IllegalStateException();
            }
        }
        return v78;
    }

    /* renamed from: k */
    public static V78 m80346k(V78 v78, byte[] bArr, J28 j28) throws zzeo {
        V78 m80354F = m80354F(v78, bArr, 0, bArr.length, j28);
        if (m80354F != null && !m80354F.mo15534d()) {
            zzeo m51314a = new zzgx(m80354F).m51314a();
            m51314a.m51316f(m80354F);
            throw m51314a;
        }
        return m80354F;
    }

    /* renamed from: m */
    public static InterfaceC50263v98 m80345m() {
        return F48.m107812b();
    }

    /* renamed from: n */
    public static InterfaceC50263v98 m80344n(InterfaceC50263v98 interfaceC50263v98) {
        int i;
        int size = interfaceC50263v98.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return interfaceC50263v98.zzf(i);
    }

    /* renamed from: o */
    public static K98 m80343o() {
        return C44325l88.m27745c();
    }

    /* renamed from: p */
    public static InterfaceC47544qa8 m80342p() {
        return C33124Gl8.m104781b();
    }

    /* renamed from: r */
    public static InterfaceC47544qa8 m80341r(InterfaceC47544qa8 interfaceC47544qa8) {
        int i;
        int size = interfaceC47544qa8.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return interfaceC47544qa8.mo17376d(i);
    }

    /* renamed from: s */
    public static Object m80340s(Method method, Object obj, Object... objArr) {
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
    public static Object m80339t(InterfaceC39926dj8 interfaceC39926dj8, String str, Object[] objArr) {
        return new C36166Tl8(interfaceC39926dj8, str, objArr);
    }

    /* renamed from: w */
    public static void m80336w(Class cls, V78 v78) {
        v78.m80337v();
        zza.put(cls, v78);
    }

    @Override // p000.InterfaceC39926dj8
    /* renamed from: A */
    public final /* synthetic */ InterfaceC35437Qi8 mo43833A() {
        return (C43702k58) mo3770G(5, null, null);
    }

    @Override // p000.InterfaceC39926dj8
    /* renamed from: B */
    public final /* synthetic */ InterfaceC35437Qi8 mo43832B() {
        C43702k58 c43702k58 = (C43702k58) mo3770G(5, null, null);
        c43702k58.m29318h(this);
        return c43702k58;
    }

    /* renamed from: D */
    public final boolean m80356D() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: E */
    public final int m80355E(InterfaceC32449Do8 interfaceC32449Do8) {
        if (interfaceC32449Do8 == null) {
            return C48247rl8.m15451a().m15450b(getClass()).zza(this);
        }
        return interfaceC32449Do8.zza(this);
    }

    /* renamed from: G */
    public abstract Object mo3770G(int i, Object obj, Object obj2);

    @Override // p000.GT7
    /* renamed from: b */
    public final int mo80353b(InterfaceC32449Do8 interfaceC32449Do8) {
        if (m80356D()) {
            int m80355E = m80355E(interfaceC32449Do8);
            if (m80355E >= 0) {
                return m80355E;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m80355E);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int m80355E2 = m80355E(interfaceC32449Do8);
        if (m80355E2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | m80355E2;
            return m80355E2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m80355E2);
    }

    @Override // p000.InterfaceC48227rj8
    /* renamed from: d */
    public final boolean mo15534d() {
        return m80357C(this, true);
    }

    /* renamed from: e */
    public final int m80352e() {
        return C48247rl8.m15451a().m15450b(getClass()).zzb(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C48247rl8.m15451a().m15450b(getClass()).mo40917c(this, (V78) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final C43702k58 m80351f() {
        return (C43702k58) mo3770G(5, null, null);
    }

    /* renamed from: g */
    public final C43702k58 m80350g() {
        C43702k58 c43702k58 = (C43702k58) mo3770G(5, null, null);
        c43702k58.m29318h(this);
        return c43702k58;
    }

    public final int hashCode() {
        if (!m80356D()) {
            int i = this.zzb;
            if (i == 0) {
                int m80352e = m80352e();
                this.zzb = m80352e;
                return m80352e;
            }
            return i;
        }
        return m80352e();
    }

    /* renamed from: j */
    public final V78 m80347j() {
        return (V78) mo3770G(4, null, null);
    }

    @Override // p000.InterfaceC39926dj8
    /* renamed from: l */
    public final int mo43831l() {
        int i;
        if (m80356D()) {
            i = m80355E(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m80355E(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    @Override // p000.InterfaceC48227rj8
    /* renamed from: q */
    public final /* synthetic */ InterfaceC39926dj8 mo15533q() {
        return (V78) mo3770G(6, null, null);
    }

    public final String toString() {
        return C32638Ej8.m108550a(this, super.toString());
    }

    /* renamed from: u */
    public final void m80338u() {
        C48247rl8.m15451a().m15450b(getClass()).zzf(this);
        m80337v();
    }

    /* renamed from: v */
    public final void m80337v() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: x */
    public final void m80335x(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // p000.InterfaceC39926dj8
    /* renamed from: z */
    public final void mo43829z(AbstractC47813r18 abstractC47813r18) throws IOException {
        C48247rl8.m15451a().m15450b(getClass()).mo40915e(this, E18.m109492K(abstractC47813r18));
    }
}
