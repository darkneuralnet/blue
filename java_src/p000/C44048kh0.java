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
/* renamed from: kh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44048kh0 extends AbstractC35449Qk2<C42862ih0> {

    /* renamed from: kh0$a */
    /* loaded from: classes6.dex */
    public class C25211a extends D24<InterfaceC27152p8, C42862ih0> {
        public C25211a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC27152p8 mo2650a(C42862ih0 c42862ih0) throws GeneralSecurityException {
            return new C42269hh0(c42862ih0.m33593I().m47709C());
        }
    }

    /* renamed from: kh0$b */
    /* loaded from: classes6.dex */
    public class C25212b extends AbstractC35449Qk2.AbstractC6849a<C43455jh0, C42862ih0> {
        public C25212b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<C43455jh0>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new AbstractC35449Qk2.AbstractC6849a.C6850a(C43455jh0.m30107G(), C33811Jk2.EnumC4220b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new AbstractC35449Qk2.AbstractC6849a.C6850a(C43455jh0.m30107G(), C33811Jk2.EnumC4220b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C42862ih0 mo2648a(C43455jh0 c43455jh0) throws GeneralSecurityException {
            return C42862ih0.m33591K().m33586z(C44048kh0.this.m28643k()).m33587y(AbstractC18199g.m47699f(C39961dn4.m43714c(32))).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C43455jh0 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C43455jh0.m30106H(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C43455jh0 c43455jh0) throws GeneralSecurityException {
        }
    }

    public C44048kh0() {
        super(C42862ih0.class, new C25211a(InterfaceC27152p8.class));
    }

    /* renamed from: m */
    public static void m28641m(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new C44048kh0(), z);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C42862ih0> mo2658f() {
        return new C25212b(C43455jh0.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m28643k() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: l */
    public C42862ih0 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C42862ih0.m33590L(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public void mo2655j(C42862ih0 c42862ih0) throws GeneralSecurityException {
        C31700Aj6.m115336c(c42862ih0.m33592J(), m28643k());
        if (c42862ih0.m33593I().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }
}
