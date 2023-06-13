package co.bird.android.feature.nestflagging;

import co.bird.android.feature.nestflagging.InterfaceC15004b;
/* renamed from: co.bird.android.feature.nestflagging.a */
/* loaded from: classes3.dex */
public final class C15001a {

    /* renamed from: co.bird.android.feature.nestflagging.a$a */
    /* loaded from: classes3.dex */
    public static final class C15002a implements InterfaceC15004b.InterfaceC15005a {
        @Override // co.bird.android.feature.nestflagging.InterfaceC15004b.InterfaceC15005a
        /* renamed from: a */
        public InterfaceC15004b mo57903a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C15003b(interfaceC44393lG2);
        }

        private C15002a() {
        }
    }

    /* renamed from: co.bird.android.feature.nestflagging.a$b */
    /* loaded from: classes3.dex */
    public static final class C15003b implements InterfaceC15004b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64257a;

        /* renamed from: b */
        public final C15003b f64258b;

        @Override // co.bird.android.feature.nestflagging.InterfaceC15004b
        /* renamed from: a */
        public void mo57904a(NestFlaggingActivity nestFlaggingActivity) {
            m57906b(nestFlaggingActivity);
        }

        /* renamed from: b */
        public final NestFlaggingActivity m57906b(NestFlaggingActivity nestFlaggingActivity) {
            C4650Ky.m98043b(nestFlaggingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64257a.mo27461w2()));
            C4650Ky.m98042c(nestFlaggingActivity, (C22454gl) C51679xZ3.m5003d(this.f64257a.mo27479r()));
            C4650Ky.m98041d(nestFlaggingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64257a.mo27595B1()));
            C44270l33.m27980b(nestFlaggingActivity, m57905c());
            return nestFlaggingActivity;
        }

        /* renamed from: c */
        public final C52570z33 m57905c() {
            return new C52570z33((InterfaceC48430s43) C51679xZ3.m5003d(this.f64257a.mo27465v1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64257a.mo27461w2()));
        }

        public C15003b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f64258b = this;
            this.f64257a = interfaceC44393lG2;
        }
    }

    private C15001a() {
    }

    /* renamed from: a */
    public static InterfaceC15004b.InterfaceC15005a m57907a() {
        return new C15002a();
    }
}
