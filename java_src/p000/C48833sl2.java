package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.AbstractC35449Qk2;
import p000.C42301hk2;
/* renamed from: sl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48833sl2 extends AbstractC35449Qk2<C47648ql2> {

    /* renamed from: sl2$a */
    /* loaded from: classes6.dex */
    public class C28380a extends D24<InterfaceC27152p8, C47648ql2> {
        public C28380a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC27152p8 mo2650a(C47648ql2 c47648ql2) throws GeneralSecurityException {
            String m15461H = c47648ql2.m17138I().m15461H();
            return C50019ul2.m9800a(m15461H).mo11804b(m15461H);
        }
    }

    /* renamed from: sl2$b */
    /* loaded from: classes6.dex */
    public class C28381b extends AbstractC35449Qk2.AbstractC6849a<C48241rl2, C47648ql2> {
        public C28381b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C47648ql2 mo2648a(C48241rl2 c48241rl2) throws GeneralSecurityException {
            return C47648ql2.m17136K().m17132y(c48241rl2).m17131z(C48833sl2.this.m13712k()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C48241rl2 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C48241rl2.m15460I(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C48241rl2 c48241rl2) throws GeneralSecurityException {
        }
    }

    public C48833sl2() {
        super(C47648ql2.class, new C28380a(InterfaceC27152p8.class));
    }

    /* renamed from: m */
    public static void m13710m(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new C48833sl2(), z);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C47648ql2> mo2658f() {
        return new C28381b(C48241rl2.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.REMOTE;
    }

    /* renamed from: k */
    public int m13712k() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: l */
    public C47648ql2 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C47648ql2.m17135L(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public void mo2655j(C47648ql2 c47648ql2) throws GeneralSecurityException {
        C31700Aj6.m115336c(c47648ql2.m17137J(), m13712k());
    }
}
