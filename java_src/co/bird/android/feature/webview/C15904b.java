package co.bird.android.feature.webview;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.webview.WebViewArchiveActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.webview.b */
/* loaded from: classes3.dex */
public final class C15904b {

    /* renamed from: co.bird.android.feature.webview.b$a */
    /* loaded from: classes3.dex */
    public static final class C15905a implements WebViewArchiveActivity.InterfaceC15899a.InterfaceC15900a {
        @Override // co.bird.android.feature.webview.WebViewArchiveActivity.InterfaceC15899a.InterfaceC15900a
        /* renamed from: a */
        public WebViewArchiveActivity.InterfaceC15899a mo56300a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            return new C15906b(interfaceC44393lG2, baseActivity, scopeProvider);
        }

        private C15905a() {
        }
    }

    /* renamed from: co.bird.android.feature.webview.b$b */
    /* loaded from: classes3.dex */
    public static final class C15906b implements WebViewArchiveActivity.InterfaceC15899a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65895a;

        /* renamed from: b */
        public final ScopeProvider f65896b;

        /* renamed from: c */
        public final BaseActivity f65897c;

        /* renamed from: d */
        public final C15906b f65898d;

        @Override // co.bird.android.feature.webview.WebViewArchiveActivity.InterfaceC15899a
        /* renamed from: a */
        public void mo56299a(WebViewArchiveActivity webViewArchiveActivity) {
            m56298b(webViewArchiveActivity);
        }

        /* renamed from: b */
        public final WebViewArchiveActivity m56298b(WebViewArchiveActivity webViewArchiveActivity) {
            C5135Ly.m96068n(webViewArchiveActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65895a.mo27461w2()));
            C5135Ly.m96066p(webViewArchiveActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65895a.mo27595B1()));
            C5135Ly.m96071k(webViewArchiveActivity, (Handler) C51679xZ3.m5003d(this.f65895a.mo27535X2()));
            C5135Ly.m96067o(webViewArchiveActivity, (C22454gl) C51679xZ3.m5003d(this.f65895a.mo27479r()));
            C5135Ly.m96080b(webViewArchiveActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65895a.mo27519d0()));
            C5135Ly.m96075g(webViewArchiveActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65895a.mo27453z2()));
            C5135Ly.m96064r(webViewArchiveActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65895a.mo27459x1()));
            C5135Ly.m96081a(webViewArchiveActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65895a.mo27474s()));
            C5135Ly.m96073i(webViewArchiveActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65895a.mo27558P0()));
            C5135Ly.m96074h(webViewArchiveActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65895a.mo27598A0()));
            C5135Ly.m96077e(webViewArchiveActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65895a.mo27507i0()));
            C5135Ly.m96070l(webViewArchiveActivity, (FO2) C51679xZ3.m5003d(this.f65895a.mo27456y2()));
            C5135Ly.m96065q(webViewArchiveActivity, (YR4) C51679xZ3.m5003d(this.f65895a.mo27525b0()));
            C5135Ly.m96079c(webViewArchiveActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65895a.mo27460x()));
            C5135Ly.m96078d(webViewArchiveActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65895a.mo27517d3()));
            C5135Ly.m96072j(webViewArchiveActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65895a.mo27482q()));
            C5135Ly.m96076f(webViewArchiveActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65895a.mo27483p3()));
            C40192eA6.m43155b(webViewArchiveActivity, m56297c());
            return webViewArchiveActivity;
        }

        /* renamed from: c */
        public final C15907c m56297c() {
            return new C15907c(this.f65896b, (InterfaceC31844Az6) C51679xZ3.m5003d(this.f65895a.mo27466u2()), (InterfaceC22767hq) C51679xZ3.m5003d(this.f65895a.mo27540W1()), (InterfaceC0650Bc) C51679xZ3.m5003d(this.f65895a.mo27572K0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65895a.mo27461w2()), (C51174wi2) C51679xZ3.m5003d(this.f65895a.mo27492m2()), m56296d(), (InterfaceC6097Oh) C51679xZ3.m5003d(this.f65895a.mo27470t0()));
        }

        /* renamed from: d */
        public final C45529nA6 m56296d() {
            return new C45529nA6(this.f65897c);
        }

        public C15906b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider) {
            this.f65898d = this;
            this.f65895a = interfaceC44393lG2;
            this.f65896b = scopeProvider;
            this.f65897c = baseActivity;
        }
    }

    private C15904b() {
    }

    /* renamed from: a */
    public static WebViewArchiveActivity.InterfaceC15899a.InterfaceC15900a m56301a() {
        return new C15905a();
    }
}
