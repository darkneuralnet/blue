package p000;

import p000.InterfaceC44108kn0;
/* renamed from: UH0 */
/* loaded from: classes3.dex */
public final class UH0 {

    /* renamed from: UH0$a */
    /* loaded from: classes3.dex */
    public static final class C8250a implements InterfaceC44108kn0 {

        /* renamed from: a */
        public final C8250a f37168a;

        /* renamed from: b */
        public Y94<InterfaceC1880Ea> f37169b;

        /* renamed from: c */
        public Y94<InterfaceC33193Gt5> f37170c;

        /* renamed from: d */
        public Y94<InterfaceC6097Oh> f37171d;

        /* renamed from: e */
        public Y94<InterfaceC40550en0> f37172e;

        /* renamed from: UH0$a$a */
        /* loaded from: classes3.dex */
        public static final class C8251a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f37173a;

            public C8251a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f37173a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f37173a.mo27519d0());
            }
        }

        /* renamed from: UH0$a$b */
        /* loaded from: classes3.dex */
        public static final class C8252b implements Y94<InterfaceC6097Oh> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f37174a;

            public C8252b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f37174a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC6097Oh get() {
                return (InterfaceC6097Oh) C51679xZ3.m5003d(this.f37174a.mo27470t0());
            }
        }

        /* renamed from: UH0$a$c */
        /* loaded from: classes3.dex */
        public static final class C8253c implements Y94<InterfaceC33193Gt5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f37175a;

            public C8253c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f37175a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC33193Gt5 get() {
                return (InterfaceC33193Gt5) C51679xZ3.m5003d(this.f37175a.mo27534Y());
            }
        }

        @Override // p000.InterfaceC44108kn0
        /* renamed from: a */
        public InterfaceC40550en0 mo28448a() {
            return this.f37172e.get();
        }

        /* renamed from: b */
        public final void m81755b(C42329hn0 c42329hn0, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f37169b = new C8251a(interfaceC44393lG2);
            this.f37170c = new C8253c(interfaceC44393lG2);
            C8252b c8252b = new C8252b(interfaceC44393lG2);
            this.f37171d = c8252b;
            this.f37172e = V51.m80429b(C42922in0.m33497b(c42329hn0, this.f37169b, this.f37170c, c8252b));
        }

        public C8250a(C42329hn0 c42329hn0, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f37168a = this;
            m81755b(c42329hn0, interfaceC44393lG2);
        }
    }

    /* renamed from: UH0$b */
    /* loaded from: classes3.dex */
    public static final class C8254b implements InterfaceC44108kn0.InterfaceC25238a {
        @Override // p000.InterfaceC44108kn0.InterfaceC25238a
        /* renamed from: a */
        public InterfaceC44108kn0 mo28447a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C8250a(new C42329hn0(), interfaceC44393lG2);
        }

        private C8254b() {
        }
    }

    private UH0() {
    }

    /* renamed from: a */
    public static InterfaceC44108kn0.InterfaceC25238a m81756a() {
        return new C8254b();
    }
}
