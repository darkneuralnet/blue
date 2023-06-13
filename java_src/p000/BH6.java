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
/* renamed from: BH6 */
/* loaded from: classes6.dex */
public class BH6 extends AbstractC35449Qk2<C52706zH6> {

    /* renamed from: BH6$a */
    /* loaded from: classes6.dex */
    public class C0592a extends D24<InterfaceC27152p8, C52706zH6> {
        public C0592a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC27152p8 mo2650a(C52706zH6 c52706zH6) throws GeneralSecurityException {
            return new C52113yH6(c52706zH6.m1565I().m47709C());
        }
    }

    /* renamed from: BH6$b */
    /* loaded from: classes6.dex */
    public class C0593b extends AbstractC35449Qk2.AbstractC6849a<AH6, C52706zH6> {
        public C0593b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<AH6>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new AbstractC35449Qk2.AbstractC6849a.C6850a(AH6.m115934G(), C33811Jk2.EnumC4220b.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new AbstractC35449Qk2.AbstractC6849a.C6850a(AH6.m115934G(), C33811Jk2.EnumC4220b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C52706zH6 mo2648a(AH6 ah6) throws GeneralSecurityException {
            return C52706zH6.m1563K().m1557z(BH6.this.m114140k()).m1558y(AbstractC18199g.m47699f(C39961dn4.m43714c(32))).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public AH6 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return AH6.m115933H(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(AH6 ah6) throws GeneralSecurityException {
        }
    }

    public BH6() {
        super(C52706zH6.class, new C0592a(InterfaceC27152p8.class));
    }

    /* renamed from: m */
    public static void m114138m(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new BH6(), z);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C52706zH6> mo2658f() {
        return new C0593b(AH6.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m114140k() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: l */
    public C52706zH6 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C52706zH6.m1562L(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public void mo2655j(C52706zH6 c52706zH6) throws GeneralSecurityException {
        C31700Aj6.m115336c(c52706zH6.m1564J(), m114140k());
        if (c52706zH6.m1565I().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }
}
