package co.bird.android.feature.sober;

import co.bird.android.feature.sober.InterfaceC15762b;
/* renamed from: co.bird.android.feature.sober.a */
/* loaded from: classes3.dex */
public final class C15759a {

    /* renamed from: co.bird.android.feature.sober.a$a */
    /* loaded from: classes3.dex */
    public static final class C15760a implements InterfaceC15762b.InterfaceC15763a {
        @Override // co.bird.android.feature.sober.InterfaceC15762b.InterfaceC15763a
        /* renamed from: a */
        public InterfaceC15762b mo56650a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C15761b(interfaceC44393lG2);
        }

        private C15760a() {
        }
    }

    /* renamed from: co.bird.android.feature.sober.a$b */
    /* loaded from: classes3.dex */
    public static final class C15761b implements InterfaceC15762b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65630a;

        /* renamed from: b */
        public final C15761b f65631b;

        @Override // co.bird.android.feature.sober.InterfaceC15762b
        /* renamed from: a */
        public void mo56651a(SoberStartActivity soberStartActivity) {
            m56653b(soberStartActivity);
        }

        /* renamed from: b */
        public final SoberStartActivity m56653b(SoberStartActivity soberStartActivity) {
            C4650Ky.m98043b(soberStartActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65630a.mo27461w2()));
            C4650Ky.m98042c(soberStartActivity, (C22454gl) C51679xZ3.m5003d(this.f65630a.mo27479r()));
            C4650Ky.m98041d(soberStartActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65630a.mo27595B1()));
            UM5.m81585b(soberStartActivity, m56652c());
            return soberStartActivity;
        }

        /* renamed from: c */
        public final C40308eN5 m56652c() {
            return new C40308eN5((YR4) C51679xZ3.m5003d(this.f65630a.mo27525b0()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65630a.mo27519d0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65630a.mo27461w2()));
        }

        public C15761b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65631b = this;
            this.f65630a = interfaceC44393lG2;
        }
    }

    private C15759a() {
    }

    /* renamed from: a */
    public static InterfaceC15762b.InterfaceC15763a m56654a() {
        return new C15760a();
    }
}
