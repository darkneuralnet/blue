package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.AbstractC35449Qk2;
import p000.C42301hk2;
/* renamed from: yl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52390yl2 extends AbstractC35449Qk2<C51204wl2> {

    /* renamed from: yl2$a */
    /* loaded from: classes6.dex */
    public class C30691a extends D24<InterfaceC27152p8, C51204wl2> {
        public C30691a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC27152p8 mo2650a(C51204wl2 c51204wl2) throws GeneralSecurityException {
            String m4739I = c51204wl2.m6403I().m4739I();
            return new C50611vl2(c51204wl2.m6403I().m4740H(), C50019ul2.m9800a(m4739I).mo11804b(m4739I));
        }
    }

    /* renamed from: yl2$b */
    /* loaded from: classes6.dex */
    public class C30692b extends AbstractC35449Qk2.AbstractC6849a<C51797xl2, C51204wl2> {
        public C30692b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C51204wl2 mo2648a(C51797xl2 c51797xl2) throws GeneralSecurityException {
            return C51204wl2.m6401K().m6397y(c51797xl2).m6396z(C52390yl2.this.m2654k()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C51797xl2 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C51797xl2.m4737K(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C51797xl2 c51797xl2) throws GeneralSecurityException {
            if (!c51797xl2.m4739I().isEmpty() && c51797xl2.m4738J()) {
                return;
            }
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }

    public C52390yl2() {
        super(C51204wl2.class, new C30691a(InterfaceC27152p8.class));
    }

    /* renamed from: m */
    public static void m2652m(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new C52390yl2(), z);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C51204wl2> mo2658f() {
        return new C30692b(C51797xl2.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.REMOTE;
    }

    /* renamed from: k */
    public int m2654k() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: l */
    public C51204wl2 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C51204wl2.m6400L(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public void mo2655j(C51204wl2 c51204wl2) throws GeneralSecurityException {
        C31700Aj6.m115336c(c51204wl2.m6402J(), m2654k());
    }
}
