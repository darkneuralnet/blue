package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.AbstractC35449Qk2;
import p000.C42301hk2;
/* renamed from: J8 */
/* loaded from: classes6.dex */
public class C3897J8 extends AbstractC35449Qk2<C3030H8> {

    /* renamed from: J8$a */
    /* loaded from: classes6.dex */
    public class C3898a extends D24<InterfaceC43656k12, C3030H8> {
        public C3898a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC43656k12 mo2650a(C3030H8 c3030h8) throws GeneralSecurityException {
            return new C2670G8(c3030h8.m104376K().m47709C(), c3030h8.m104375L().m99174I());
        }
    }

    /* renamed from: J8$b */
    /* loaded from: classes6.dex */
    public class C3899b extends AbstractC35449Qk2.AbstractC6849a<C3329I8, C3030H8> {
        public C3899b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C3030H8 mo2648a(C3329I8 c3329i8) throws GeneralSecurityException {
            return C3030H8.m104373N().m104366z(c3329i8.m102925K()).m104367y(AbstractC18199g.m47699f(C39961dn4.m43714c(c3329i8.m102926J()))).m104368A(C3897J8.this.m101111l()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C3329I8 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C3329I8.m102923M(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C3329I8 c3329i8) throws GeneralSecurityException {
            C31700Aj6.m115338a(c3329i8.m102926J());
            C3897J8.this.m101108o(c3329i8.m102925K());
        }
    }

    public C3897J8() {
        super(C3030H8.class, new C3898a(InterfaceC43656k12.class));
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C3030H8> mo2658f() {
        return new C3899b(C3329I8.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: l */
    public int m101111l() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: m */
    public C3030H8 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C3030H8.m104372O(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public void mo2655j(C3030H8 c3030h8) throws GeneralSecurityException {
        C31700Aj6.m115336c(c3030h8.m104374M(), m101111l());
        C31700Aj6.m115338a(c3030h8.m104376K().size());
        m101108o(c3030h8.m104375L());
    }

    /* renamed from: o */
    public final void m101108o(C4353K8 c4353k8) throws GeneralSecurityException {
        if (c4353k8.m99174I() >= 12 && c4353k8.m99174I() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}
