package co.bird.android.feature.configurabletutorial;

import co.bird.android.feature.configurabletutorial.InterfaceC14751a;
/* renamed from: co.bird.android.feature.configurabletutorial.b */
/* loaded from: classes3.dex */
public final class C14753b {

    /* renamed from: co.bird.android.feature.configurabletutorial.b$a */
    /* loaded from: classes3.dex */
    public static final class C14754a implements InterfaceC14751a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63735a;

        /* renamed from: b */
        public final C47756qw0 f63736b;

        /* renamed from: c */
        public final Boolean f63737c;

        /* renamed from: d */
        public final C14754a f63738d;

        @Override // co.bird.android.feature.configurabletutorial.InterfaceC14751a
        /* renamed from: a */
        public void mo58402a(C37184Xv0 c37184Xv0) {
            m58393j(c37184Xv0);
        }

        @Override // co.bird.android.feature.configurabletutorial.InterfaceC14751a
        /* renamed from: b */
        public void mo58401b(C36248Tv0 c36248Tv0) {
            m58394i(c36248Tv0);
        }

        @Override // co.bird.android.feature.configurabletutorial.InterfaceC14751a
        /* renamed from: c */
        public void mo58400c(ConfigurableTutorialsActivity configurableTutorialsActivity) {
            m58392k(configurableTutorialsActivity);
        }

        /* renamed from: d */
        public final C34142Kv0 m58399d() {
            return m58395h(C34610Mv0.m94579b());
        }

        /* renamed from: e */
        public final C42419hw0 m58398e() {
            return new C42419hw0((InterfaceC44791lw0) C51679xZ3.m5003d(this.f63735a.mo27487o2()), this.f63736b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63735a.mo27461w2()));
        }

        /* renamed from: f */
        public final C32513Dw0 m58397f() {
            return new C32513Dw0((InterfaceC44791lw0) C51679xZ3.m5003d(this.f63735a.mo27487o2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63735a.mo27519d0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63735a.mo27461w2()), this.f63736b, this.f63737c.booleanValue(), (InterfaceC37014Xc1) C51679xZ3.m5003d(this.f63735a.mo27583F1()));
        }

        /* renamed from: g */
        public final C38854bx0 m58396g() {
            return new C38854bx0((InterfaceC44791lw0) C51679xZ3.m5003d(this.f63735a.mo27487o2()), this.f63736b);
        }

        /* renamed from: h */
        public final C34142Kv0 m58395h(C34142Kv0 c34142Kv0) {
            C34844Nv0.m93194a(c34142Kv0, new C35312Pv0());
            return c34142Kv0;
        }

        /* renamed from: i */
        public final C36248Tv0 m58394i(C36248Tv0 c36248Tv0) {
            C36716Vv0.m79231d(c36248Tv0, m58397f());
            C36716Vv0.m79233b(c36248Tv0, new C35312Pv0());
            C36716Vv0.m79234a(c36248Tv0, m58399d());
            return c36248Tv0;
        }

        /* renamed from: j */
        public final C37184Xv0 m58393j(C37184Xv0 c37184Xv0) {
            C37418Yv0.m74009d(c37184Xv0, m58398e());
            C37418Yv0.m74012a(c37184Xv0, new C36950Wv0());
            C37418Yv0.m74011b(c37184Xv0, new C35312Pv0());
            return c37184Xv0;
        }

        /* renamed from: k */
        public final ConfigurableTutorialsActivity m58392k(ConfigurableTutorialsActivity configurableTutorialsActivity) {
            C4650Ky.m98043b(configurableTutorialsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63735a.mo27461w2()));
            C4650Ky.m98042c(configurableTutorialsActivity, (C22454gl) C51679xZ3.m5003d(this.f63735a.mo27479r()));
            C4650Ky.m98041d(configurableTutorialsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63735a.mo27595B1()));
            C37193Xw0.m76043b(configurableTutorialsActivity, m58396g());
            return configurableTutorialsActivity;
        }

        public C14754a(InterfaceC44393lG2 interfaceC44393lG2, C47756qw0 c47756qw0, Boolean bool) {
            this.f63738d = this;
            this.f63735a = interfaceC44393lG2;
            this.f63736b = c47756qw0;
            this.f63737c = bool;
        }
    }

    /* renamed from: co.bird.android.feature.configurabletutorial.b$b */
    /* loaded from: classes3.dex */
    public static final class C14755b implements InterfaceC14751a.InterfaceC14752a {
        @Override // co.bird.android.feature.configurabletutorial.InterfaceC14751a.InterfaceC14752a
        /* renamed from: a */
        public InterfaceC14751a mo58391a(InterfaceC44393lG2 interfaceC44393lG2, C47756qw0 c47756qw0, boolean z) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c47756qw0);
            C51679xZ3.m5005b(Boolean.valueOf(z));
            return new C14754a(interfaceC44393lG2, c47756qw0, Boolean.valueOf(z));
        }

        private C14755b() {
        }
    }

    private C14753b() {
    }

    /* renamed from: a */
    public static InterfaceC14751a.InterfaceC14752a m58403a() {
        return new C14755b();
    }
}
