package p000;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C52394yl6;
/* renamed from: vR0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50418vR0 {

    /* renamed from: vR0$a */
    /* loaded from: classes3.dex */
    public static final class C29537a implements C52394yl6.InterfaceC30694b.InterfaceC30695a {
        @Override // p000.C52394yl6.InterfaceC30694b.InterfaceC30695a
        /* renamed from: a */
        public C52394yl6.InterfaceC30694b mo2639a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(recyclerView);
            return new C29538b(interfaceC44393lG2, baseActivity, scopeProvider, recyclerView);
        }

        private C29537a() {
        }
    }

    /* renamed from: vR0$b */
    /* loaded from: classes3.dex */
    public static final class C29538b implements C52394yl6.InterfaceC30694b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f114063a;

        /* renamed from: b */
        public final ScopeProvider f114064b;

        /* renamed from: c */
        public final C29538b f114065c;

        /* renamed from: d */
        public Y94<BaseActivity> f114066d;

        /* renamed from: e */
        public Y94<RecyclerView> f114067e;

        /* renamed from: f */
        public Y94<C34058Kl6> f114068f;

        @Override // p000.C52394yl6.InterfaceC30694b
        /* renamed from: a */
        public void mo2640a(C52394yl6 c52394yl6) {
            m8672d(c52394yl6);
        }

        /* renamed from: b */
        public final C31739Ao0 m8674b() {
            return new C31739Ao0((InterfaceC36185To0) C51679xZ3.m5003d(this.f114063a.mo27481q2()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f114063a.mo27584F0()), (InterfaceC48164rd5) C51679xZ3.m5003d(this.f114063a.mo27463w()), this.f114064b, this.f114068f.get());
        }

        /* renamed from: c */
        public final void m8673c(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView) {
            this.f114066d = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(recyclerView);
            this.f114067e = m44621a;
            this.f114068f = V51.m80429b(C34292Ll6.m96375a(this.f114066d, m44621a));
        }

        /* renamed from: d */
        public final C52394yl6 m8672d(C52394yl6 c52394yl6) {
            C52987zl6.m452b(c52394yl6, m8670f());
            return c52394yl6;
        }

        /* renamed from: e */
        public final C51801xl6 m8671e() {
            return new C51801xl6((C36207Tq4) C51679xZ3.m5003d(this.f114063a.mo27595B1()), (Context) C51679xZ3.m5003d(this.f114063a.mo27552R1()));
        }

        /* renamed from: f */
        public final C33356Hl6 m8670f() {
            return new C33356Hl6((InterfaceC10636aM) C51679xZ3.m5003d(this.f114063a.mo27460x()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f114063a.mo27584F0()), (InterfaceC36176Tn0) C51679xZ3.m5003d(this.f114063a.mo27574J2()), (GI3) C51679xZ3.m5003d(this.f114063a.mo27565M2()), m8674b(), this.f114068f.get(), this.f114064b, m8671e());
        }

        public C29538b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView) {
            this.f114065c = this;
            this.f114063a = interfaceC44393lG2;
            this.f114064b = scopeProvider;
            m8673c(interfaceC44393lG2, baseActivity, scopeProvider, recyclerView);
        }
    }

    private C50418vR0() {
    }

    /* renamed from: a */
    public static C52394yl6.InterfaceC30694b.InterfaceC30695a m8675a() {
        return new C29537a();
    }
}
