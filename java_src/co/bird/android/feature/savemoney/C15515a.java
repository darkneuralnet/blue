package co.bird.android.feature.savemoney;

import co.bird.android.feature.savemoney.InterfaceC15518b;
/* renamed from: co.bird.android.feature.savemoney.a */
/* loaded from: classes3.dex */
public final class C15515a {

    /* renamed from: co.bird.android.feature.savemoney.a$a */
    /* loaded from: classes3.dex */
    public static final class C15516a implements InterfaceC15518b.InterfaceC15519a {
        @Override // co.bird.android.feature.savemoney.InterfaceC15518b.InterfaceC15519a
        /* renamed from: a */
        public InterfaceC15518b mo56986a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C15517b(interfaceC44393lG2);
        }

        private C15516a() {
        }
    }

    /* renamed from: co.bird.android.feature.savemoney.a$b */
    /* loaded from: classes3.dex */
    public static final class C15517b implements InterfaceC15518b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65192a;

        /* renamed from: b */
        public final C15517b f65193b;

        @Override // co.bird.android.feature.savemoney.InterfaceC15518b
        /* renamed from: a */
        public void mo56987a(SaveMoneyActivity saveMoneyActivity) {
            m56989b(saveMoneyActivity);
        }

        /* renamed from: b */
        public final SaveMoneyActivity m56989b(SaveMoneyActivity saveMoneyActivity) {
            C4650Ky.m98043b(saveMoneyActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65192a.mo27461w2()));
            C4650Ky.m98042c(saveMoneyActivity, (C22454gl) C51679xZ3.m5003d(this.f65192a.mo27479r()));
            C4650Ky.m98041d(saveMoneyActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65192a.mo27595B1()));
            C39913di5.m43869b(saveMoneyActivity, m56988c());
            return saveMoneyActivity;
        }

        /* renamed from: c */
        public final C52956zi5 m56988c() {
            return new C52956zi5((InterfaceC40099e13) C51679xZ3.m5003d(this.f65192a.mo27461w2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65192a.mo27519d0()), (InterfaceC4077JQ) C51679xZ3.m5003d(this.f65192a.mo27570L()), (InterfaceC41639gd3) C51679xZ3.m5003d(this.f65192a.mo27467u0()), (VM3) C51679xZ3.m5003d(this.f65192a.mo27585F()), (WU4) C51679xZ3.m5003d(this.f65192a.mo27457y1()), (C22454gl) C51679xZ3.m5003d(this.f65192a.mo27479r()), (C36207Tq4) C51679xZ3.m5003d(this.f65192a.mo27595B1()));
        }

        public C15517b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65193b = this;
            this.f65192a = interfaceC44393lG2;
        }
    }

    private C15515a() {
    }

    /* renamed from: a */
    public static InterfaceC15518b.InterfaceC15519a m56990a() {
        return new C15516a();
    }
}
