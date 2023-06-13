package co.bird.android.feature.tutorial;

import android.content.Context;
import co.bird.android.feature.tutorial.InterfaceC15879b;
/* renamed from: co.bird.android.feature.tutorial.a */
/* loaded from: classes3.dex */
public final class C15873a {

    /* renamed from: co.bird.android.feature.tutorial.a$a */
    /* loaded from: classes3.dex */
    public static final class C15874a implements InterfaceC15879b.InterfaceC15880a {
        @Override // co.bird.android.feature.tutorial.InterfaceC15879b.InterfaceC15880a
        /* renamed from: a */
        public InterfaceC15879b mo56341a(InterfaceC44393lG2 interfaceC44393lG2, C33257Ha6 c33257Ha6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c33257Ha6);
            return new C15875b(c33257Ha6, interfaceC44393lG2);
        }

        private C15874a() {
        }
    }

    /* renamed from: co.bird.android.feature.tutorial.a$b */
    /* loaded from: classes3.dex */
    public static final class C15875b implements InterfaceC15879b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65851a;

        /* renamed from: b */
        public final C15875b f65852b;

        /* renamed from: c */
        public Y94<InterfaceC40099e13> f65853c;

        /* renamed from: d */
        public Y94<C36207Tq4> f65854d;

        /* renamed from: e */
        public Y94<AbstractC34661Na6> f65855e;

        /* renamed from: f */
        public Y94<Context> f65856f;

        /* renamed from: g */
        public Y94<C32789Fa6> f65857g;

        /* renamed from: co.bird.android.feature.tutorial.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15876a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65858a;

            public C15876a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65858a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f65858a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.tutorial.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15877b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65859a;

            public C15877b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65859a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65859a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.tutorial.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15878c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65860a;

            public C15878c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65860a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65860a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.tutorial.InterfaceC15879b
        /* renamed from: a */
        public void mo56342a(TutorialActivity tutorialActivity) {
            m56346c(tutorialActivity);
        }

        /* renamed from: b */
        public final void m56347b(C33257Ha6 c33257Ha6, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65853c = new C15877b(interfaceC44393lG2);
            C15878c c15878c = new C15878c(interfaceC44393lG2);
            this.f65854d = c15878c;
            this.f65855e = V51.m80429b(C33491Ia6.m101902a(c33257Ha6, this.f65853c, c15878c));
            C15876a c15876a = new C15876a(interfaceC44393lG2);
            this.f65856f = c15876a;
            this.f65857g = V51.m80429b(C33023Ga6.m104997a(c15876a));
        }

        /* renamed from: c */
        public final TutorialActivity m56346c(TutorialActivity tutorialActivity) {
            C4650Ky.m98043b(tutorialActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65851a.mo27461w2()));
            C4650Ky.m98042c(tutorialActivity, (C22454gl) C51679xZ3.m5003d(this.f65851a.mo27479r()));
            C4650Ky.m98041d(tutorialActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65851a.mo27595B1()));
            C32087Ca6.m112099c(tutorialActivity, this.f65855e.get());
            C32087Ca6.m112101a(tutorialActivity, this.f65857g.get());
            return tutorialActivity;
        }

        public C15875b(C33257Ha6 c33257Ha6, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65852b = this;
            this.f65851a = interfaceC44393lG2;
            m56347b(c33257Ha6, interfaceC44393lG2);
        }
    }

    private C15873a() {
    }

    /* renamed from: a */
    public static InterfaceC15879b.InterfaceC15880a m56348a() {
        return new C15874a();
    }
}
