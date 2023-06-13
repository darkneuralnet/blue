package co.bird.android.feature.hardcount;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.hardcount.HardCountActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.hardcount.a */
/* loaded from: classes3.dex */
public final class C14869a {

    /* renamed from: co.bird.android.feature.hardcount.a$a */
    /* loaded from: classes3.dex */
    public static final class C14870a implements HardCountActivity.InterfaceC14865a.InterfaceC14866a {
        @Override // co.bird.android.feature.hardcount.HardCountActivity.InterfaceC14865a.InterfaceC14866a
        /* renamed from: a */
        public HardCountActivity.InterfaceC14865a mo58095a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3013H3 c3013h3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c3013h3);
            return new C14871b(interfaceC44393lG2, baseActivity, scopeProvider, c3013h3);
        }

        private C14870a() {
        }
    }

    /* renamed from: co.bird.android.feature.hardcount.a$b */
    /* loaded from: classes3.dex */
    public static final class C14871b implements HardCountActivity.InterfaceC14865a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64057a;

        /* renamed from: b */
        public final BaseActivity f64058b;

        /* renamed from: c */
        public final C3013H3 f64059c;

        /* renamed from: d */
        public final ScopeProvider f64060d;

        /* renamed from: e */
        public final C14871b f64061e;

        /* renamed from: f */
        public Y94<BaseActivity> f64062f;

        /* renamed from: g */
        public Y94<M92> f64063g;

        /* renamed from: h */
        public Y94<N92> f64064h;

        @Override // co.bird.android.feature.hardcount.HardCountActivity.InterfaceC14865a
        /* renamed from: a */
        public void mo58094a(HardCountActivity hardCountActivity) {
            m58089f(hardCountActivity);
        }

        /* renamed from: b */
        public final C41418gF1 m58093b() {
            return new C41418gF1((Context) C51679xZ3.m5003d(this.f64057a.mo27552R1()));
        }

        /* renamed from: c */
        public final ZG1 m58092c() {
            return new ZG1((XF1) C51679xZ3.m5003d(this.f64057a.mo27569L0()), m58091d(), this.f64060d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64057a.mo27461w2()), m58093b(), this.f64064h.get());
        }

        /* renamed from: d */
        public final C46773pH1 m58091d() {
            return new C46773pH1(this.f64058b, this.f64059c);
        }

        /* renamed from: e */
        public final void m58090e(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3013H3 c3013h3) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f64062f = m44621a;
            P92 m90630a = P92.m90630a(m44621a);
            this.f64063g = m90630a;
            this.f64064h = V51.m80429b(O92.m92712a(this.f64062f, m90630a));
        }

        /* renamed from: f */
        public final HardCountActivity m58089f(HardCountActivity hardCountActivity) {
            C5135Ly.m96068n(hardCountActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64057a.mo27461w2()));
            C5135Ly.m96066p(hardCountActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64057a.mo27595B1()));
            C5135Ly.m96071k(hardCountActivity, (Handler) C51679xZ3.m5003d(this.f64057a.mo27535X2()));
            C5135Ly.m96067o(hardCountActivity, (C22454gl) C51679xZ3.m5003d(this.f64057a.mo27479r()));
            C5135Ly.m96080b(hardCountActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64057a.mo27519d0()));
            C5135Ly.m96075g(hardCountActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64057a.mo27453z2()));
            C5135Ly.m96064r(hardCountActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64057a.mo27459x1()));
            C5135Ly.m96081a(hardCountActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64057a.mo27474s()));
            C5135Ly.m96073i(hardCountActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64057a.mo27558P0()));
            C5135Ly.m96074h(hardCountActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64057a.mo27598A0()));
            C5135Ly.m96077e(hardCountActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64057a.mo27507i0()));
            C5135Ly.m96070l(hardCountActivity, (FO2) C51679xZ3.m5003d(this.f64057a.mo27456y2()));
            C5135Ly.m96065q(hardCountActivity, (YR4) C51679xZ3.m5003d(this.f64057a.mo27525b0()));
            C5135Ly.m96079c(hardCountActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64057a.mo27460x()));
            C5135Ly.m96078d(hardCountActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64057a.mo27517d3()));
            C5135Ly.m96072j(hardCountActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64057a.mo27482q()));
            C5135Ly.m96076f(hardCountActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64057a.mo27483p3()));
            C37843aF1.m71738b(hardCountActivity, m58092c());
            return hardCountActivity;
        }

        public C14871b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3013H3 c3013h3) {
            this.f64061e = this;
            this.f64057a = interfaceC44393lG2;
            this.f64058b = baseActivity;
            this.f64059c = c3013h3;
            this.f64060d = scopeProvider;
            m58090e(interfaceC44393lG2, baseActivity, scopeProvider, c3013h3);
        }
    }

    private C14869a() {
    }

    /* renamed from: a */
    public static HardCountActivity.InterfaceC14865a.InterfaceC14866a m58096a() {
        return new C14870a();
    }
}
