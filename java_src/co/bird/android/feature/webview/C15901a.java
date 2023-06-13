package co.bird.android.feature.webview;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.webview.WebViewActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.webview.a */
/* loaded from: classes3.dex */
public final class C15901a {

    /* renamed from: co.bird.android.feature.webview.a$a */
    /* loaded from: classes3.dex */
    public static final class C15902a implements WebViewActivity.InterfaceC15897a.InterfaceC15898a {
        @Override // co.bird.android.feature.webview.WebViewActivity.InterfaceC15897a.InterfaceC15898a
        /* renamed from: a */
        public WebViewActivity.InterfaceC15897a mo56305a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, CA6 ca6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(ca6);
            return new C15903b(interfaceC44393lG2, baseActivity, scopeProvider, ca6);
        }

        private C15902a() {
        }
    }

    /* renamed from: co.bird.android.feature.webview.a$b */
    /* loaded from: classes3.dex */
    public static final class C15903b implements WebViewActivity.InterfaceC15897a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65891a;

        /* renamed from: b */
        public final ScopeProvider f65892b;

        /* renamed from: c */
        public final CA6 f65893c;

        /* renamed from: d */
        public final C15903b f65894d;

        @Override // co.bird.android.feature.webview.WebViewActivity.InterfaceC15897a
        /* renamed from: a */
        public void mo56304a(WebViewActivity webViewActivity) {
            m56303b(webViewActivity);
        }

        /* renamed from: b */
        public final WebViewActivity m56303b(WebViewActivity webViewActivity) {
            C5135Ly.m96068n(webViewActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65891a.mo27461w2()));
            C5135Ly.m96066p(webViewActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65891a.mo27595B1()));
            C5135Ly.m96071k(webViewActivity, (Handler) C51679xZ3.m5003d(this.f65891a.mo27535X2()));
            C5135Ly.m96067o(webViewActivity, (C22454gl) C51679xZ3.m5003d(this.f65891a.mo27479r()));
            C5135Ly.m96080b(webViewActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65891a.mo27519d0()));
            C5135Ly.m96075g(webViewActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65891a.mo27453z2()));
            C5135Ly.m96064r(webViewActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65891a.mo27459x1()));
            C5135Ly.m96081a(webViewActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65891a.mo27474s()));
            C5135Ly.m96073i(webViewActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65891a.mo27558P0()));
            C5135Ly.m96074h(webViewActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65891a.mo27598A0()));
            C5135Ly.m96077e(webViewActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65891a.mo27507i0()));
            C5135Ly.m96070l(webViewActivity, (FO2) C51679xZ3.m5003d(this.f65891a.mo27456y2()));
            C5135Ly.m96065q(webViewActivity, (YR4) C51679xZ3.m5003d(this.f65891a.mo27525b0()));
            C5135Ly.m96079c(webViewActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65891a.mo27460x()));
            C5135Ly.m96078d(webViewActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65891a.mo27517d3()));
            C5135Ly.m96072j(webViewActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65891a.mo27482q()));
            C5135Ly.m96076f(webViewActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65891a.mo27483p3()));
            C39600dA6.m44550b(webViewActivity, m56302c());
            return webViewActivity;
        }

        /* renamed from: c */
        public final C52050yA6 m56302c() {
            return new C52050yA6(this.f65892b, this.f65893c, (InterfaceC46194oI6) C51679xZ3.m5003d(this.f65891a.mo27543V1()));
        }

        public C15903b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, CA6 ca6) {
            this.f65894d = this;
            this.f65891a = interfaceC44393lG2;
            this.f65892b = scopeProvider;
            this.f65893c = ca6;
        }
    }

    private C15901a() {
    }

    /* renamed from: a */
    public static WebViewActivity.InterfaceC15897a.InterfaceC15898a m56306a() {
        return new C15902a();
    }
}
