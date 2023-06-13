package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC35449Qk2;
import p000.C33811Jk2;
import p000.C42301hk2;
/* renamed from: b9 */
/* loaded from: classes6.dex */
public final class C12300b9 extends AbstractC35449Qk2<C10116Z8> {

    /* renamed from: b9$a */
    /* loaded from: classes6.dex */
    public class C12301a extends D24<InterfaceC40107e21, C10116Z8> {
        public C12301a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC40107e21 mo2650a(C10116Z8 c10116z8) throws GeneralSecurityException {
            return new C9680Y8(c10116z8.m73676I().m47709C());
        }
    }

    /* renamed from: b9$b */
    /* loaded from: classes6.dex */
    public class C12302b extends AbstractC35449Qk2.AbstractC6849a<C10580a9, C10116Z8> {
        public C12302b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<C10580a9>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new AbstractC35449Qk2.AbstractC6849a.C6850a(C10580a9.m71844I().m71841y(64).build(), C33811Jk2.EnumC4220b.TINK));
            hashMap.put("AES256_SIV_RAW", new AbstractC35449Qk2.AbstractC6849a.C6850a(C10580a9.m71844I().m71841y(64).build(), C33811Jk2.EnumC4220b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C10116Z8 mo2648a(C10580a9 c10580a9) throws GeneralSecurityException {
            return C10116Z8.m73674K().m73670y(AbstractC18199g.m47699f(C39961dn4.m43714c(c10580a9.m71845H()))).m73669z(C12300b9.this.m64929k()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C10580a9 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C10580a9.m71843J(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C10580a9 c10580a9) throws GeneralSecurityException {
            if (c10580a9.m71845H() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + c10580a9.m71845H() + ". Valid keys must have 64 bytes.");
        }
    }

    public C12300b9() {
        super(C10116Z8.class, new C12301a(InterfaceC40107e21.class));
    }

    /* renamed from: m */
    public static void m64927m(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new C12300b9(), z);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C10116Z8> mo2658f() {
        return new C12302b(C10580a9.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m64929k() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: l */
    public C10116Z8 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C10116Z8.m73673L(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public void mo2655j(C10116Z8 c10116z8) throws GeneralSecurityException {
        C31700Aj6.m115336c(c10116z8.m73675J(), m64929k());
        if (c10116z8.m73676I().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + c10116z8.m73676I().size() + ". Valid keys must have 64 bytes.");
    }
}
