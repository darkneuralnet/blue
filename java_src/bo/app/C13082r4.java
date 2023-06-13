package bo.app;

import android.net.Uri;
import com.facebook.share.internal.C17296a;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lbo/app/r4;", "", "", "toString", "Landroid/net/Uri;", "uri", "Landroid/net/Uri;", C17296a.f69688o, "()Landroid/net/Uri;", "Ljava/net/URL;", "url", "Ljava/net/URL;", "b", "()Ljava/net/URL;", "<init>", "(Landroid/net/Uri;)V", "urlString", "(Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.r4 */
/* loaded from: classes.dex */
public final class C13082r4 {

    /* renamed from: a */
    private final String f59210a;

    /* renamed from: b */
    private final Uri f59211b;

    /* renamed from: c */
    private final URL f59212c;

    public C13082r4(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f59211b = uri;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        this.f59210a = uri2;
        this.f59212c = new URL(uri2);
    }

    /* renamed from: a */
    public final Uri m63036a() {
        return this.f59211b;
    }

    /* renamed from: b */
    public final URL m63035b() {
        return this.f59212c;
    }

    public String toString() {
        return this.f59210a;
    }

    public C13082r4(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri parse = Uri.parse(urlString);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(urlString)");
        this.f59211b = parse;
        this.f59210a = urlString;
        this.f59212c = new URL(urlString);
    }
}
