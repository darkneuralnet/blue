package co.bird.android.feature.workorders.issues;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.workorders.issues.LegacyWorkOrderIssuesActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.workorders.issues.a */
/* loaded from: classes3.dex */
public final class C15944a {

    /* renamed from: co.bird.android.feature.workorders.issues.a$a */
    /* loaded from: classes3.dex */
    public static final class C15945a implements LegacyWorkOrderIssuesActivity.InterfaceC15941b.InterfaceC15942a {
        @Override // co.bird.android.feature.workorders.issues.LegacyWorkOrderIssuesActivity.InterfaceC15941b.InterfaceC15942a
        /* renamed from: a */
        public LegacyWorkOrderIssuesActivity.InterfaceC15941b mo56234a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19672d4 c19672d4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c19672d4);
            return new C15946b(interfaceC44393lG2, baseActivity, scopeProvider, c19672d4);
        }

        private C15945a() {
        }
    }

    /* renamed from: co.bird.android.feature.workorders.issues.a$b */
    /* loaded from: classes3.dex */
    public static final class C15946b implements LegacyWorkOrderIssuesActivity.InterfaceC15941b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65949a;

        /* renamed from: b */
        public final C15946b f65950b;

        /* renamed from: c */
        public Y94<InterfaceC40099e13> f65951c;

        /* renamed from: d */
        public Y94<ScopeProvider> f65952d;

        /* renamed from: e */
        public Y94<BaseActivity> f65953e;

        /* renamed from: f */
        public Y94<C19672d4> f65954f;

        /* renamed from: g */
        public Y94<FF6> f65955g;

        /* renamed from: h */
        public Y94<InterfaceC46167oF6> f65956h;

        /* renamed from: i */
        public Y94<C36207Tq4> f65957i;

        /* renamed from: j */
        public Y94<CF6> f65958j;

        /* renamed from: co.bird.android.feature.workorders.issues.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15947a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65959a;

            public C15947a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65959a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65959a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.issues.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15948b implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65960a;

            public C15948b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65960a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65960a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.workorders.issues.LegacyWorkOrderIssuesActivity.InterfaceC15941b
        /* renamed from: a */
        public void mo56233a(LegacyWorkOrderIssuesActivity legacyWorkOrderIssuesActivity) {
            m56231c(legacyWorkOrderIssuesActivity);
        }

        /* renamed from: b */
        public final void m56232b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19672d4 c19672d4) {
            this.f65951c = new C15947a(interfaceC44393lG2);
            this.f65952d = C39546d52.m44621a(scopeProvider);
            this.f65953e = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c19672d4);
            this.f65954f = m44621a;
            this.f65955g = V51.m80429b(GF6.m105586a(this.f65953e, m44621a));
            this.f65956h = V51.m80429b(C47946rF6.m16150a());
            C15948b c15948b = new C15948b(interfaceC44393lG2);
            this.f65957i = c15948b;
            this.f65958j = V51.m80429b(DF6.m110639a(this.f65951c, this.f65952d, this.f65955g, this.f65956h, c15948b));
        }

        /* renamed from: c */
        public final LegacyWorkOrderIssuesActivity m56231c(LegacyWorkOrderIssuesActivity legacyWorkOrderIssuesActivity) {
            C5135Ly.m96068n(legacyWorkOrderIssuesActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65949a.mo27461w2()));
            C5135Ly.m96066p(legacyWorkOrderIssuesActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65949a.mo27595B1()));
            C5135Ly.m96071k(legacyWorkOrderIssuesActivity, (Handler) C51679xZ3.m5003d(this.f65949a.mo27535X2()));
            C5135Ly.m96067o(legacyWorkOrderIssuesActivity, (C22454gl) C51679xZ3.m5003d(this.f65949a.mo27479r()));
            C5135Ly.m96080b(legacyWorkOrderIssuesActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65949a.mo27519d0()));
            C5135Ly.m96075g(legacyWorkOrderIssuesActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65949a.mo27453z2()));
            C5135Ly.m96064r(legacyWorkOrderIssuesActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65949a.mo27459x1()));
            C5135Ly.m96081a(legacyWorkOrderIssuesActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65949a.mo27474s()));
            C5135Ly.m96073i(legacyWorkOrderIssuesActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65949a.mo27558P0()));
            C5135Ly.m96074h(legacyWorkOrderIssuesActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65949a.mo27598A0()));
            C5135Ly.m96077e(legacyWorkOrderIssuesActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65949a.mo27507i0()));
            C5135Ly.m96070l(legacyWorkOrderIssuesActivity, (FO2) C51679xZ3.m5003d(this.f65949a.mo27456y2()));
            C5135Ly.m96065q(legacyWorkOrderIssuesActivity, (YR4) C51679xZ3.m5003d(this.f65949a.mo27525b0()));
            C5135Ly.m96079c(legacyWorkOrderIssuesActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65949a.mo27460x()));
            C5135Ly.m96078d(legacyWorkOrderIssuesActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65949a.mo27517d3()));
            C5135Ly.m96072j(legacyWorkOrderIssuesActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65949a.mo27482q()));
            C5135Ly.m96076f(legacyWorkOrderIssuesActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65949a.mo27483p3()));
            C40582eq2.m42487b(legacyWorkOrderIssuesActivity, this.f65958j.get());
            return legacyWorkOrderIssuesActivity;
        }

        public C15946b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C19672d4 c19672d4) {
            this.f65950b = this;
            this.f65949a = interfaceC44393lG2;
            m56232b(interfaceC44393lG2, baseActivity, scopeProvider, c19672d4);
        }
    }

    private C15944a() {
    }

    /* renamed from: a */
    public static LegacyWorkOrderIssuesActivity.InterfaceC15941b.InterfaceC15942a m56235a() {
        return new C15945a();
    }
}
