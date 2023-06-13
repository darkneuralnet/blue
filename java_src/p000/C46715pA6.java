package p000;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LpA6;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/webkit/WebResourceRequest;", C17296a.f69688o, "Landroid/webkit/WebResourceRequest;", "getRequest", "()Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "b", "Landroid/webkit/WebResourceError;", "getError", "()Landroid/webkit/WebResourceError;", "error", "<init>", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: pA6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46715pA6 {

    /* renamed from: a */
    public final WebResourceRequest f103227a;

    /* renamed from: b */
    public final WebResourceError f103228b;

    public C46715pA6(WebResourceRequest webResourceRequest, WebResourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f103227a = webResourceRequest;
        this.f103228b = error;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46715pA6) {
            C46715pA6 c46715pA6 = (C46715pA6) obj;
            return Intrinsics.areEqual(this.f103227a, c46715pA6.f103227a) && Intrinsics.areEqual(this.f103228b, c46715pA6.f103228b);
        }
        return false;
    }

    public int hashCode() {
        WebResourceRequest webResourceRequest = this.f103227a;
        return ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31) + this.f103228b.hashCode();
    }

    public String toString() {
        return "WebViewError(request=" + this.f103227a + ", error=" + this.f103228b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
