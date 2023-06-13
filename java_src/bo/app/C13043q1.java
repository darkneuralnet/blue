package bo.app;

import android.net.TrafficStats;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p053io.CloseableKt;
import kotlin.p053io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\bH\u0002J2\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, m28432d2 = {"Lbo/app/q1;", "Lbo/app/h2;", "Ljava/net/URL;", "url", "Lorg/json/JSONObject;", "payload", "", "", "Lcom/braze/communication/HttpHeaders;", "headers", "Ljava/net/HttpURLConnection;", C17296a.f69688o, "Lbo/app/r4;", "requestTarget", "requestHeaders", "", "socketTimeout", "<init>", "(I)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.q1 */
/* loaded from: classes.dex */
public final class C13043q1 implements InterfaceC12715h2 {

    /* renamed from: b */
    public static final C13044a f59121b = new C13044a(null);

    /* renamed from: c */
    private static final int f59122c = (int) TimeUnit.SECONDS.toMillis(15);

    /* renamed from: a */
    private final int f59123a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lbo/app/q1$a;", "", "Ljava/net/HttpURLConnection;", "connection", "Ljava/io/InputStream;", C17296a.f69688o, "", "CONNECTION_ESTABLISHED_TIMEOUT_MS", "I", "getCONNECTION_ESTABLISHED_TIMEOUT_MS$annotations", "()V", "", "GZIP", "Ljava/lang/String;", "UTF_8", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q1$a */
    /* loaded from: classes.dex */
    public static final class C13044a {
        public /* synthetic */ C13044a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13044a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final InputStream m63098a(HttpURLConnection httpURLConnection) {
            boolean equals;
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode / 100 == 2) {
                equals = StringsKt__StringsJVMKt.equals("gzip", httpURLConnection.getContentEncoding(), true);
                if (equals) {
                    return new GZIPInputStream(httpURLConnection.getInputStream());
                }
                return new BufferedInputStream(httpURLConnection.getInputStream());
            }
            throw new C12910m3("Bad HTTP response code from Braze: [" + responseCode + "] to url: " + httpURLConnection.getURL());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q1$b */
    /* loaded from: classes.dex */
    public static final class C13045b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONException f59124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13045b(JSONException jSONException) {
            super(0);
            this.f59124b = jSONException;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unable to parse json response from server. Response: [" + this.f59124b + ']';
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q1$c */
    /* loaded from: classes.dex */
    public static final class C13046c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ URL f59125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13046c(URL url) {
            super(0);
            this.f59125b = url;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get result from [" + this.f59125b + "].";
        }
    }

    public C13043q1(int i) {
        this.f59123a = i;
    }

    @Override // bo.app.InterfaceC12715h2
    /* renamed from: a */
    public JSONObject mo63101a(C13082r4 requestTarget, Map<String, String> requestHeaders, JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        TrafficStats.setThreadStatsTag(1337);
        URL m63035b = requestTarget.m63035b();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(f59121b.m63098a(m63100a(m63035b, payload, requestHeaders)), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return new JSONObject(readText);
            } finally {
            }
        } catch (IOException e) {
            throw new C12910m3("Failed request to [" + m63035b + "], with message: [" + ((Object) e.getMessage()) + ']', e);
        } catch (JSONException e2) {
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.E, null, false, new C13045b(e2), 6, null);
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, new C13046c(m63035b), 6, null);
            throw new RuntimeException("Failed to get result from [" + m63035b + ']');
        }
    }

    /* renamed from: a */
    private final HttpURLConnection m63100a(URL url, JSONObject jSONObject, Map<String, String> map) {
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "payload.toString()");
        Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
        byte[] bytes = jSONObject2.getBytes(forName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        HttpURLConnection m63194a = C12986o6.f59033a.m63194a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m63194a.setRequestProperty(entry.getKey(), entry.getValue());
        }
        m63194a.setConnectTimeout(f59122c);
        m63194a.setReadTimeout(this.f59123a);
        m63194a.setUseCaches(false);
        m63194a.setInstanceFollowRedirects(false);
        m63194a.setRequestMethod("POST");
        m63194a.setDoOutput(true);
        m63194a.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = m63194a.getOutputStream();
        try {
            outputStream.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStream, null);
            return m63194a;
        } finally {
        }
    }
}
