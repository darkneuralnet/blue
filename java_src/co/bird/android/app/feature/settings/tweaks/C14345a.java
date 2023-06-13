package co.bird.android.app.feature.settings.tweaks;

import android.os.Handler;
import co.bird.android.app.feature.settings.tweaks.InterfaceC14348b;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.settings.tweaks.a */
/* loaded from: classes2.dex */
public final class C14345a {

    /* renamed from: co.bird.android.app.feature.settings.tweaks.a$a */
    /* loaded from: classes2.dex */
    public static final class C14346a implements InterfaceC14348b.InterfaceC14349a {
        @Override // co.bird.android.app.feature.settings.tweaks.InterfaceC14348b.InterfaceC14349a
        /* renamed from: a */
        public InterfaceC14348b mo59340a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27140p6 c27140p6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c27140p6);
            return new C14347b(interfaceC44393lG2, baseActivity, scopeProvider, c27140p6);
        }

        private C14346a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.settings.tweaks.a$b */
    /* loaded from: classes2.dex */
    public static final class C14347b implements InterfaceC14348b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f62827a;

        /* renamed from: b */
        public final ScopeProvider f62828b;

        /* renamed from: c */
        public final C14347b f62829c;

        /* renamed from: d */
        public Y94<BaseActivity> f62830d;

        /* renamed from: e */
        public Y94<C27140p6> f62831e;

        /* renamed from: f */
        public Y94<C48145rb6> f62832f;

        /* renamed from: g */
        public Y94<InterfaceC47552qb6> f62833g;

        /* renamed from: h */
        public Y94<InterfaceC37469Za6> f62834h;

        @Override // co.bird.android.app.feature.settings.tweaks.InterfaceC14348b
        /* renamed from: a */
        public void mo59341a(TweaksActivity tweaksActivity) {
            m59343c(tweaksActivity);
        }

        /* renamed from: b */
        public final void m59344b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27140p6 c27140p6) {
            this.f62830d = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c27140p6);
            this.f62831e = m44621a;
            C48737sb6 m13957a = C48737sb6.m13957a(this.f62830d, m44621a);
            this.f62832f = m13957a;
            this.f62833g = V51.m80429b(m13957a);
            this.f62834h = V51.m80429b(C39233cb6.m61186a());
        }

        /* renamed from: c */
        public final TweaksActivity m59343c(TweaksActivity tweaksActivity) {
            C5135Ly.m96068n(tweaksActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f62827a.mo27461w2()));
            C5135Ly.m96066p(tweaksActivity, (C36207Tq4) C51679xZ3.m5003d(this.f62827a.mo27595B1()));
            C5135Ly.m96071k(tweaksActivity, (Handler) C51679xZ3.m5003d(this.f62827a.mo27535X2()));
            C5135Ly.m96067o(tweaksActivity, (C22454gl) C51679xZ3.m5003d(this.f62827a.mo27479r()));
            C5135Ly.m96080b(tweaksActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f62827a.mo27519d0()));
            C5135Ly.m96075g(tweaksActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f62827a.mo27453z2()));
            C5135Ly.m96064r(tweaksActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f62827a.mo27459x1()));
            C5135Ly.m96081a(tweaksActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f62827a.mo27474s()));
            C5135Ly.m96073i(tweaksActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f62827a.mo27558P0()));
            C5135Ly.m96074h(tweaksActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f62827a.mo27598A0()));
            C5135Ly.m96077e(tweaksActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f62827a.mo27507i0()));
            C5135Ly.m96070l(tweaksActivity, (FO2) C51679xZ3.m5003d(this.f62827a.mo27456y2()));
            C5135Ly.m96065q(tweaksActivity, (YR4) C51679xZ3.m5003d(this.f62827a.mo27525b0()));
            C5135Ly.m96079c(tweaksActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f62827a.mo27460x()));
            C5135Ly.m96078d(tweaksActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f62827a.mo27517d3()));
            C5135Ly.m96072j(tweaksActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f62827a.mo27482q()));
            C5135Ly.m96076f(tweaksActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f62827a.mo27483p3()));
            C36299Ua6.m81304b(tweaksActivity, m59342d());
            return tweaksActivity;
        }

        /* renamed from: d */
        public final C45773nb6 m59342d() {
            return new C45773nb6((C36207Tq4) C51679xZ3.m5003d(this.f62827a.mo27595B1()), this.f62828b, this.f62833g.get(), this.f62834h.get());
        }

        public C14347b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27140p6 c27140p6) {
            this.f62829c = this;
            this.f62827a = interfaceC44393lG2;
            this.f62828b = scopeProvider;
            m59344b(interfaceC44393lG2, baseActivity, scopeProvider, c27140p6);
        }
    }

    private C14345a() {
    }

    /* renamed from: a */
    public static InterfaceC14348b.InterfaceC14349a m59345a() {
        return new C14346a();
    }
}
