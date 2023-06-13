package p000;

import p000.InterfaceC48831sl0;
/* renamed from: KH0 */
/* loaded from: classes3.dex */
public final class KH0 {

    /* renamed from: KH0$a */
    /* loaded from: classes3.dex */
    public static final class C4389a implements InterfaceC48831sl0 {

        /* renamed from: a */
        public final C4389a f19339a;

        @Override // p000.InterfaceC48831sl0
        /* renamed from: a */
        public void mo13716a(C47646ql0 c47646ql0) {
            m99051b(c47646ql0);
        }

        /* renamed from: b */
        public final C47646ql0 m99051b(C47646ql0 c47646ql0) {
            C48239rl0.m15464b(c47646ql0, new C50609vl0());
            return c47646ql0;
        }

        public C4389a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f19339a = this;
        }
    }

    /* renamed from: KH0$b */
    /* loaded from: classes3.dex */
    public static final class C4390b implements InterfaceC48831sl0.InterfaceC28379a {
        @Override // p000.InterfaceC48831sl0.InterfaceC28379a
        /* renamed from: a */
        public InterfaceC48831sl0 mo13715a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C4389a(interfaceC44393lG2);
        }

        private C4390b() {
        }
    }

    private KH0() {
    }

    /* renamed from: a */
    public static InterfaceC48831sl0.InterfaceC28379a m99052a() {
        return new C4390b();
    }
}
