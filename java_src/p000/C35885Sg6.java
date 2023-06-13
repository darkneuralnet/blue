package p000;

import android.annotation.SuppressLint;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import com.amazonaws.services.p026s3.internal.Constants;
import com.amazonaws.services.p026s3.util.Mimetypes;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LSg6;", "LxE;", "LRg6;", "", MessageExtension.FIELD_DATA, "", "Ad", "Lio/reactivex/Observable;", "M0", "", "title", "setTitle", "", "cancelable", "setCancelable", "Lio/reactivex/subjects/d;", "b", "Lio/reactivex/subjects/d;", "agreementSubject", "Landroid/webkit/WebView;", "c", "Landroid/webkit/WebView;", "webView", "Landroid/view/View;", "rootView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Landroid/view/View;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: Sg6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35885Sg6 extends AbstractC30071xE implements InterfaceC35651Rg6 {

    /* renamed from: b */
    public final C24558d<String> f34048b;

    /* renamed from: c */
    public final WebView f34049c;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0006"}, m28432d2 = {"Sg6$a", "Lh9;", "", "payload", "", "agree", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Sg6$a */
    /* loaded from: classes2.dex */
    public static final class C7500a extends AbstractC22562h9 {
        public C7500a() {
        }

        @Override // p000.AbstractC22562h9
        @JavascriptInterface
        public void agree(String payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            C35885Sg6.this.f34048b.onNext(payload);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35885Sg6(View rootView, BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create()");
        this.f34048b = m31902e;
        WebView webView = (WebView) C49520tu6.m11243h(rootView, C36585Vg4.webView);
        this.f34049c = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new C7500a(), "agreementHandler");
    }

    @Override // p000.InterfaceC35651Rg6
    /* renamed from: Ad */
    public void mo85139Ad(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f34049c.scrollTo(0, 0);
        this.f34049c.loadDataWithBaseURL(null, data, Mimetypes.MIMETYPE_HTML, Constants.DEFAULT_ENCODING, null);
    }

    @Override // p000.InterfaceC35651Rg6
    /* renamed from: M0 */
    public Observable<String> mo85138M0() {
        Observable<String> hide = this.f34048b.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "agreementSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC35651Rg6
    public void setCancelable(boolean z) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70212v(z);
            supportActionBar.mo70245B(z);
        }
    }

    @Override // p000.InterfaceC35651Rg6
    public void setTitle(int i) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(getActivity().getResources().getString(i));
    }
}
