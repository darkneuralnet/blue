package p000;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC34828Nt2;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R*\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@PX\u0096.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lw2;", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", "view", "", "title", "", "onReceivedTitle", "Landroid/graphics/Bitmap;", "icon", "onReceivedIcon", "", "newProgress", "onProgressChanged", "LBA6;", "<set-?>", C17296a.f69688o, "LBA6;", "()LBA6;", "b", "(LBA6;)V", TransferTable.COLUMN_STATE, "<init>", "()V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: w2 */
/* loaded from: classes5.dex */
public class C29742w2 extends WebChromeClient {

    /* renamed from: a */
    public BA6 f115173a;

    /* renamed from: a */
    public BA6 m7551a() {
        BA6 ba6 = this.f115173a;
        if (ba6 != null) {
            return ba6;
        }
        Intrinsics.throwUninitializedPropertyAccessException(TransferTable.COLUMN_STATE);
        return null;
    }

    /* renamed from: b */
    public void m7550b(BA6 ba6) {
        Intrinsics.checkNotNullParameter(ba6, "<set-?>");
        this.f115173a = ba6;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (m7551a().m114309c() instanceof AbstractC34828Nt2.C5733a) {
            return;
        }
        m7551a().m114307e(new AbstractC34828Nt2.C5735c(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        m7551a().m114306f(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        m7551a().m114305g(str);
    }
}
