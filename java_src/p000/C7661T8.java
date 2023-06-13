package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC35449Qk2;
import p000.C33811Jk2;
import p000.C42301hk2;
import p000.V46;
/* renamed from: T8 */
/* loaded from: classes6.dex */
public final class C7661T8 extends AbstractC35449Qk2<C7074R8> {

    /* renamed from: T8$a */
    /* loaded from: classes6.dex */
    public class C7662a extends D24<InterfaceC27152p8, C7074R8> {
        public C7662a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC27152p8 mo2650a(C7074R8 c7074r8) throws GeneralSecurityException {
            return new C6684Q8(c7074r8.m87274I().m47709C());
        }
    }

    /* renamed from: T8$b */
    /* loaded from: classes6.dex */
    public class C7663b extends AbstractC35449Qk2.AbstractC6849a<C7344S8, C7074R8> {
        public C7663b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<C7344S8>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            C33811Jk2.EnumC4220b enumC4220b = C33811Jk2.EnumC4220b.TINK;
            hashMap.put("AES128_GCM", C7661T8.m84286l(16, enumC4220b));
            C33811Jk2.EnumC4220b enumC4220b2 = C33811Jk2.EnumC4220b.RAW;
            hashMap.put("AES128_GCM_RAW", C7661T8.m84286l(16, enumC4220b2));
            hashMap.put("AES256_GCM", C7661T8.m84286l(32, enumC4220b));
            hashMap.put("AES256_GCM_RAW", C7661T8.m84286l(32, enumC4220b2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C7074R8 mo2648a(C7344S8 c7344s8) throws GeneralSecurityException {
            return C7074R8.m87272K().m87268y(AbstractC18199g.m47699f(C39961dn4.m43714c(c7344s8.m85930H()))).m87267z(C7661T8.this.m84285m()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C7344S8 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C7344S8.m85928J(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C7344S8 c7344s8) throws GeneralSecurityException {
            C31700Aj6.m115338a(c7344s8.m85930H());
        }
    }

    public C7661T8() {
        super(C7074R8.class, new C7662a(InterfaceC27152p8.class));
    }

    /* renamed from: l */
    public static AbstractC35449Qk2.AbstractC6849a.C6850a<C7344S8> m84286l(int i, C33811Jk2.EnumC4220b enumC4220b) {
        return new AbstractC35449Qk2.AbstractC6849a.C6850a<>(C7344S8.m85929I().m85926y(i).build(), enumC4220b);
    }

    /* renamed from: o */
    public static void m84283o(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new C7661T8(), z);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: a */
    public V46.EnumC8541b mo79950a() {
        return V46.EnumC8541b.f38571c;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C7074R8> mo2658f() {
        return new C7663b(C7344S8.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: m */
    public int m84285m() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public C7074R8 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C7074R8.m87271L(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: p */
    public void mo2655j(C7074R8 c7074r8) throws GeneralSecurityException {
        C31700Aj6.m115336c(c7074r8.m87273J(), m84285m());
        C31700Aj6.m115338a(c7074r8.m87274I().size());
    }
}
