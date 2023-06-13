package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.AbstractC34828Nt2;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J&\u0010\u0012\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R*\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0016@PX\u0096.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u001d8\u0016@PX\u0096.¢\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"Lx2;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "onPageFinished", "", "isReload", "doUpdateVisitedHistory", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "shouldOverrideUrlLoading", "LBA6;", "<set-?>", C17296a.f69688o, "LBA6;", "b", "()LBA6;", DateTokenConverter.CONVERTER_KEY, "(LBA6;)V", TransferTable.COLUMN_STATE, "LvA6;", "LvA6;", "()LvA6;", "c", "(LvA6;)V", "navigator", "<init>", "()V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: x2 */
/* loaded from: classes5.dex */
public class C30027x2 extends WebViewClient {

    /* renamed from: a */
    public BA6 f117012a;

    /* renamed from: b */
    public C50271vA6 f117013b;

    /* renamed from: a */
    public C50271vA6 m5917a() {
        C50271vA6 c50271vA6 = this.f117013b;
        if (c50271vA6 != null) {
            return c50271vA6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: b */
    public BA6 m5916b() {
        BA6 ba6 = this.f117012a;
        if (ba6 != null) {
            return ba6;
        }
        Intrinsics.throwUninitializedPropertyAccessException(TransferTable.COLUMN_STATE);
        return null;
    }

    /* renamed from: c */
    public void m5915c(C50271vA6 c50271vA6) {
        Intrinsics.checkNotNullParameter(c50271vA6, "<set-?>");
        this.f117013b = c50271vA6;
    }

    /* renamed from: d */
    public void m5914d(BA6 ba6) {
        Intrinsics.checkNotNullParameter(ba6, "<set-?>");
        this.f117012a = ba6;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        boolean startsWith$default;
        super.doUpdateVisitedHistory(webView, str, z);
        if (str != null) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "data:text/html", false, 2, null);
            if (!startsWith$default && !Intrinsics.areEqual(m5916b().m114311a().m79023a(), str)) {
                m5916b().m114308d(C49679uA6.m10696j(m5916b().m114311a(), str));
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        boolean z;
        super.onPageFinished(webView, str);
        m5916b().m114307e(AbstractC34828Nt2.C5733a.f25336a);
        C50271vA6 m5917a = m5917a();
        boolean z2 = false;
        if (webView != null) {
            z = webView.canGoBack();
        } else {
            z = false;
        }
        m5917a.m9060d(z);
        C50271vA6 m5917a2 = m5917a();
        if (webView != null) {
            z2 = webView.canGoForward();
        }
        m5917a2.m9059e(z2);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        m5916b().m114307e(new AbstractC34828Nt2.C5735c(0.0f));
        m5916b().m114310b().clear();
        m5916b().m114305g(null);
        m5916b().m114306f(null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            m5916b().m114310b().add(new C46715pA6(webResourceRequest, webResourceError));
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Uri uri = null;
        if (webView != null) {
            str = webView.getUrl();
        } else {
            str = null;
        }
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        }
        if (Intrinsics.areEqual(str, String.valueOf(uri))) {
            return false;
        }
        if (webResourceRequest != null) {
            BA6 m5916b = m5916b();
            AbstractC36758Vz6 m114311a = m5916b().m114311a();
            String uri2 = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "it.url.toString()");
            m5916b.m114308d(C49679uA6.m10696j(m114311a, uri2));
            return true;
        }
        return true;
    }
}
