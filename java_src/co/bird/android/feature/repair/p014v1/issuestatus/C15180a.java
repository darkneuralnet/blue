package co.bird.android.feature.repair.p014v1.issuestatus;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.p014v1.issuestatus.IssueStatusActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.repair.v1.issuestatus.a */
/* loaded from: classes3.dex */
public final class C15180a {

    /* renamed from: co.bird.android.feature.repair.v1.issuestatus.a$a */
    /* loaded from: classes3.dex */
    public static final class C15181a implements IssueStatusActivity.InterfaceC15177b.InterfaceC15178a {
        @Override // co.bird.android.feature.repair.p014v1.issuestatus.IssueStatusActivity.InterfaceC15177b.InterfaceC15178a
        /* renamed from: a */
        public IssueStatusActivity.InterfaceC15177b mo57590a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10556a4 c10556a4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c10556a4);
            return new C15182b(interfaceC44393lG2, baseActivity, scopeProvider, c10556a4);
        }

        private C15181a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.v1.issuestatus.a$b */
    /* loaded from: classes3.dex */
    public static final class C15182b implements IssueStatusActivity.InterfaceC15177b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64577a;

        /* renamed from: b */
        public final C15182b f64578b;

        /* renamed from: c */
        public Y94<BaseActivity> f64579c;

        /* renamed from: d */
        public Y94<C10556a4> f64580d;

        /* renamed from: e */
        public Y94<C51094wa2> f64581e;

        /* renamed from: f */
        public Y94<InterfaceC40099e13> f64582f;

        /* renamed from: g */
        public Y94<ScopeProvider> f64583g;

        /* renamed from: h */
        public Y94<C48723sa2> f64584h;

        /* renamed from: co.bird.android.feature.repair.v1.issuestatus.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15183a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64585a;

            public C15183a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64585a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64585a.mo27461w2());
            }
        }

        @Override // co.bird.android.feature.repair.p014v1.issuestatus.IssueStatusActivity.InterfaceC15177b
        /* renamed from: a */
        public void mo57589a(IssueStatusActivity issueStatusActivity) {
            m57587c(issueStatusActivity);
        }

        /* renamed from: b */
        public final void m57588b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10556a4 c10556a4) {
            this.f64579c = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c10556a4);
            this.f64580d = m44621a;
            this.f64581e = V51.m80429b(C51687xa2.m4997a(this.f64579c, m44621a));
            this.f64582f = new C15183a(interfaceC44393lG2);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(scopeProvider);
            this.f64583g = m44621a2;
            this.f64584h = V51.m80429b(C49316ta2.m12036a(this.f64581e, this.f64582f, m44621a2));
        }

        /* renamed from: c */
        public final IssueStatusActivity m57587c(IssueStatusActivity issueStatusActivity) {
            C5135Ly.m96068n(issueStatusActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64577a.mo27461w2()));
            C5135Ly.m96066p(issueStatusActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64577a.mo27595B1()));
            C5135Ly.m96071k(issueStatusActivity, (Handler) C51679xZ3.m5003d(this.f64577a.mo27535X2()));
            C5135Ly.m96067o(issueStatusActivity, (C22454gl) C51679xZ3.m5003d(this.f64577a.mo27479r()));
            C5135Ly.m96080b(issueStatusActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64577a.mo27519d0()));
            C5135Ly.m96075g(issueStatusActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64577a.mo27453z2()));
            C5135Ly.m96064r(issueStatusActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64577a.mo27459x1()));
            C5135Ly.m96081a(issueStatusActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64577a.mo27474s()));
            C5135Ly.m96073i(issueStatusActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64577a.mo27558P0()));
            C5135Ly.m96074h(issueStatusActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64577a.mo27598A0()));
            C5135Ly.m96077e(issueStatusActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64577a.mo27507i0()));
            C5135Ly.m96070l(issueStatusActivity, (FO2) C51679xZ3.m5003d(this.f64577a.mo27456y2()));
            C5135Ly.m96065q(issueStatusActivity, (YR4) C51679xZ3.m5003d(this.f64577a.mo27525b0()));
            C5135Ly.m96079c(issueStatusActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64577a.mo27460x()));
            C5135Ly.m96078d(issueStatusActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64577a.mo27517d3()));
            C5135Ly.m96072j(issueStatusActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64577a.mo27482q()));
            C5135Ly.m96076f(issueStatusActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64577a.mo27483p3()));
            C45759na2.m23498b(issueStatusActivity, this.f64584h.get());
            return issueStatusActivity;
        }

        public C15182b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10556a4 c10556a4) {
            this.f64578b = this;
            this.f64577a = interfaceC44393lG2;
            m57588b(interfaceC44393lG2, baseActivity, scopeProvider, c10556a4);
        }
    }

    private C15180a() {
    }

    /* renamed from: a */
    public static IssueStatusActivity.InterfaceC15177b.InterfaceC15178a m57591a() {
        return new C15181a();
    }
}
