package bo.app;

import com.facebook.share.internal.C17296a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lbo/app/o6;", "", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", C17296a.f69688o, "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.o6 */
/* loaded from: classes.dex */
public final class C12986o6 {

    /* renamed from: a */
    public static final C12986o6 f59033a = new C12986o6();

    /* renamed from: b */
    private static C13054q5 f59034b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o6$a */
    /* loaded from: classes.dex */
    public static final class C12987a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12987a f59035b = new C12987a();

        public C12987a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Exception initializing static TLS socket factory.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o6$b */
    /* loaded from: classes.dex */
    public static final class C12988b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12988b f59036b = new C12988b();

        public C12988b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Exception setting TLS socket factory on url connection.";
        }
    }

    static {
        try {
            f59034b = new C13054q5();
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f59033a, C43664k20.EnumC25082a.E, e, false, C12987a.f59035b, 4, null);
        }
    }

    private C12986o6() {
    }

    /* renamed from: a */
    public final HttpURLConnection m63194a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        if (Intrinsics.areEqual(url.getProtocol(), "https")) {
            try {
                if (uRLConnection != null) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
                    C13054q5 c13054q5 = f59034b;
                    if (c13054q5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("socketFactory");
                        c13054q5 = null;
                    }
                    httpsURLConnection.setSSLSocketFactory(c13054q5);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12988b.f59036b, 4, null);
            }
        }
        if (uRLConnection != null) {
            return (HttpURLConnection) uRLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }
}
