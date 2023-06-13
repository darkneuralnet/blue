package p000;

import android.graphics.Bitmap;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.S74;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\f0\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"LNz5;", "LxE;", "LaM5;", "", "url", "", "headers", "", "Tl", "javascript", "Ql", "Lio/reactivex/Observable;", "Lqz5;", "Sl", "title", "t", "Lwi2;", "b", "Lwi2;", "deserializer", "Landroid/webkit/WebView;", "c", "Landroid/webkit/WebView;", "webView", "Lma4;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lma4;", "events", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lwi2;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nz5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34885Nz5 extends AbstractC30071xE {

    /* renamed from: b */
    public final C51174wi2 f25490b;

    /* renamed from: c */
    public final WebView f25491c;

    /* renamed from: d */
    public final C45168ma4<InterfaceC47791qz5> f25492d;

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000b"}, m28432d2 = {"Nz5$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "onPageFinished", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Nz5$a */
    /* loaded from: classes2.dex */
    public static final class C5800a extends WebViewClient {
        public C5800a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onPageFinished(view, str);
            S74.C7343a.showProgress$default(C34885Nz5.this, false, 0, 2, null);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String str, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onPageStarted(view, str, bitmap);
            S74.C7343a.showProgress$default(C34885Nz5.this, true, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0006"}, m28432d2 = {"Nz5$b", "Lsz5;", "", "payload", "", "send", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Nz5$b */
    /* loaded from: classes2.dex */
    public static final class C5801b extends AbstractC48976sz5 {

        @Metadata(m28433d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m28432d2 = {"Nz5$b$a", "LFb6;", "", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Nz5$b$a */
        /* loaded from: classes2.dex */
        public static final class C5802a extends C32798Fb6<Object> {
        }

        public C5801b() {
        }

        @Override // p000.AbstractC48976sz5
        @JavascriptInterface
        public void send(String payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            C41318g46.m40151m("received event: " + payload, new Object[0]);
            try {
                C51174wi2 c51174wi2 = C34885Nz5.this.f25490b;
                Type type = new C5802a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<GenericShopEvent>() {}.type");
                EnumC48383rz5 command = ((InterfaceC47791qz5) c51174wi2.m6460b(payload, type)).getCommand();
                C34885Nz5.this.f25492d.accept((InterfaceC47791qz5) C34885Nz5.this.f25490b.m6460b(payload, command.m14907b()));
            } catch (Throwable th) {
                C41318g46.m40159e(th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34885Nz5(C51174wi2 deserializer, BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f25490b = deserializer;
        WebView webView = (WebView) C40788fB0.m41779c(activity, C36585Vg4.webView);
        this.f25491c = webView;
        C45168ma4<InterfaceC47791qz5> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<ShopEvent>()");
        this.f25492d = m25409g;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new C5800a());
        webView.addJavascriptInterface(new C5801b(), "shopHandler");
    }

    /* renamed from: Rl */
    public static final void m93024Rl(String javascript, String str) {
        Intrinsics.checkNotNullParameter(javascript, "$javascript");
        C41318g46.m40157g(javascript, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadUrl$default(C34885Nz5 c34885Nz5, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        c34885Nz5.m93022Tl(str, map);
    }

    /* renamed from: Ql */
    public final void m93025Ql(final String javascript) {
        Intrinsics.checkNotNullParameter(javascript, "javascript");
        this.f25491c.evaluateJavascript(javascript, new ValueCallback() { // from class: Mz5
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C34885Nz5.m93024Rl(javascript, (String) obj);
            }
        });
    }

    /* renamed from: Sl */
    public final Observable<InterfaceC47791qz5> m93023Sl() {
        Observable<InterfaceC47791qz5> hide = this.f25492d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "events.hide()");
        return hide;
    }

    /* renamed from: Tl */
    public final void m93022Tl(String url, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f25491c.loadUrl(url);
    }

    /* renamed from: t */
    public final void m93021t(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(title);
        }
    }
}
