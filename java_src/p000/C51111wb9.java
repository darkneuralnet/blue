package p000;

import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcq;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzqm;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* renamed from: wb9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51111wb9 {

    /* renamed from: f */
    public static final MediaType f116256f = MediaType.parse("application/json; charset=utf-8");

    /* renamed from: a */
    public final Db9 f116257a;

    /* renamed from: b */
    public final OkHttpClient f116258b;

    /* renamed from: c */
    public C52307yc9 f116259c;

    /* renamed from: d */
    public final C41042fc9 f116260d;

    /* renamed from: e */
    public final String f116261e;

    public C51111wb9(Db9 db9, C41042fc9 c41042fc9) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f116258b = builder.connectTimeout(AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit).readTimeout(AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit).writeTimeout(AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit).build();
        this.f116257a = db9;
        this.f116260d = c41042fc9;
        this.f116259c = null;
        this.f116261e = "https://firebaseinstallations.googleapis.com/v1";
    }

    /* renamed from: e */
    public static long m6600e(long j, String str) {
        return j + (Long.parseLong(str.replaceFirst("s$", "")) * 1000);
    }

    /* renamed from: a */
    public final C52307yc9 m6604a() {
        return this.f116259c;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean m6603b(C39236cb9 c39236cb9, Yb9 yb9) throws zzqm, IOException, InterruptedException {
        C41042fc9 c41042fc9;
        String str;
        String str2;
        String str3;
        String str4;
        String format = String.format("%s/projects/%s/installations", this.f116261e, this.f116257a.m110115c());
        Headers build = new Headers.Builder().add("x-goog-api-key", this.f116257a.m110117a()).build();
        String format2 = String.format("{fid: '%s', appId: '%s', authVersion: '%s', sdkVersion: '%s'}", c39236cb9.m61181a(), this.f116257a.m110116b(), "FIS_v2", "o:a:mlkit:1.0.0");
        long currentTimeMillis = System.currentTimeMillis();
        Yb9 yb92 = new Yb9();
        yb92.m74819g();
        String m6599f = m6599f(build, format, format2, yb9, yb92);
        yb92.m74821e();
        try {
            if (m6599f == null) {
                c41042fc9 = this.f116260d;
            } else {
                try {
                    C43931kU7 m5236a = KU7.m98833b(m6599f).m5236a();
                    try {
                        String m74990e = m5236a.m28918c("name").m74990e();
                        C39236cb9 c39236cb92 = new C39236cb9(m5236a.m28918c("fid").m74990e());
                        String m74990e2 = m5236a.m28918c("refreshToken").m74990e();
                        C43931kU7 m28919b = m5236a.m28919b("authToken");
                        String m74990e3 = m28919b.m28918c("token").m74990e();
                        String m74990e4 = m28919b.m28918c("expiresIn").m74990e();
                        long m6600e = m6600e(currentTimeMillis, m74990e4);
                        String valueOf = String.valueOf(m74990e);
                        if (valueOf.length() != 0) {
                            str = "installation name: ".concat(valueOf);
                        } else {
                            str = new String("installation name: ");
                        }
                        Log.i("MLKitFbInstsRestClient", str);
                        String valueOf2 = String.valueOf(c39236cb92.m61181a());
                        if (valueOf2.length() != 0) {
                            str2 = "fid: ".concat(valueOf2);
                        } else {
                            str2 = new String("fid: ");
                        }
                        Log.d("MLKitFbInstsRestClient", str2);
                        String valueOf3 = String.valueOf(m74990e2);
                        if (valueOf3.length() != 0) {
                            str3 = "refresh_token: ".concat(valueOf3);
                        } else {
                            str3 = new String("refresh_token: ");
                        }
                        Log.d("MLKitFbInstsRestClient", str3);
                        String valueOf4 = String.valueOf(m28919b);
                        StringBuilder sb = new StringBuilder(valueOf4.length() + 12);
                        sb.append("auth token: ");
                        sb.append(valueOf4);
                        Log.d("MLKitFbInstsRestClient", sb.toString());
                        String valueOf5 = String.valueOf(m74990e4);
                        if (valueOf5.length() != 0) {
                            str4 = "auth token expires in: ".concat(valueOf5);
                        } else {
                            str4 = new String("auth token expires in: ");
                        }
                        Log.d("MLKitFbInstsRestClient", str4);
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("auth token expiry: ");
                        sb2.append(m6600e);
                        Log.d("MLKitFbInstsRestClient", sb2.toString());
                        this.f116259c = new C52307yc9(c39236cb92, m74990e2, m74990e3, m6600e);
                        return true;
                    } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                        String obj = m5236a.toString();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(format).length() + 75 + m6599f.length() + obj.length());
                        sb3.append("Error traversing JSON object returned from url <");
                        sb3.append(format);
                        sb3.append(">:\nraw json:\n");
                        sb3.append(m6599f);
                        sb3.append("\nparsed json:\n");
                        sb3.append(obj);
                        Log.e("MLKitFbInstsRestClient", sb3.toString(), e);
                        EnumC38962c79 enumC38962c79 = EnumC38962c79.RPC_RETURNED_INVALID_RESULT;
                        yb92.m74822d(enumC38962c79);
                        yb9.m74824b(enumC38962c79);
                        c41042fc9 = this.f116260d;
                    }
                } catch (zzcq | IllegalStateException | NullPointerException e2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(format).length() + 44 + m6599f.length());
                    sb4.append("Error parsing JSON object returned from <");
                    sb4.append(format);
                    sb4.append(">:\n");
                    sb4.append(m6599f);
                    Log.e("MLKitFbInstsRestClient", sb4.toString(), e2);
                    EnumC38962c79 enumC38962c792 = EnumC38962c79.RPC_RETURNED_MALFORMED_RESULT;
                    yb92.m74822d(enumC38962c792);
                    yb9.m74824b(enumC38962c792);
                    c41042fc9 = this.f116260d;
                }
            }
            c41042fc9.m41104a(EnumC45136mW8.INSTALLATION_ID_FIS_CREATE_INSTALLATION, yb92);
            return false;
        } finally {
            this.f116260d.m41104a(EnumC45136mW8.INSTALLATION_ID_FIS_CREATE_INSTALLATION, yb92);
        }
    }

    /* renamed from: c */
    public final boolean m6602c(final Yb9 yb9) throws InterruptedException {
        if (this.f116259c == null) {
            return false;
        }
        boolean m76495a = Xj9.m76495a(new Qj9() { // from class: pb9
            @Override // p000.Qj9
            public final boolean zza() {
                return C51111wb9.this.m6601d(yb9);
            }
        });
        if (!m76495a) {
            yb9.m74823c(EnumC38962c79.RPC_EXPONENTIAL_BACKOFF_FAILED);
        }
        return m76495a;
    }

    /* renamed from: d */
    public final boolean m6601d(Yb9 yb9) {
        String str;
        C41042fc9 c41042fc9;
        String str2;
        String str3;
        String format = String.format("%s/projects/%s/installations/%s/authTokens:generate", this.f116261e, this.f116257a.m110115c(), this.f116259c.m3164b().m61181a());
        Headers.Builder builder = new Headers.Builder();
        String valueOf = String.valueOf(this.f116259c.m3163c());
        if (valueOf.length() != 0) {
            str = "FIS_v2 ".concat(valueOf);
        } else {
            str = new String("FIS_v2 ");
        }
        Headers build = builder.add("authorization", str).add("x-goog-api-key", this.f116257a.m110117a()).build();
        String format2 = String.format("{installation:{sdkVersion:'%s'}}", "o:a:mlkit:1.0.0");
        long currentTimeMillis = System.currentTimeMillis();
        Yb9 yb92 = new Yb9();
        yb92.m74819g();
        String m6599f = m6599f(build, format, format2, yb9, yb92);
        yb92.m74821e();
        if (m6599f == null) {
            c41042fc9 = this.f116260d;
        } else {
            try {
                try {
                    C43931kU7 m5236a = KU7.m98833b(m6599f).m5236a();
                    try {
                        String m74990e = m5236a.m28918c("token").m74990e();
                        String m74990e2 = m5236a.m28918c("expiresIn").m74990e();
                        long m6600e = m6600e(currentTimeMillis, m74990e2);
                        String valueOf2 = String.valueOf(m74990e);
                        if (valueOf2.length() != 0) {
                            str2 = "refreshed auth token: ".concat(valueOf2);
                        } else {
                            str2 = new String("refreshed auth token: ");
                        }
                        Log.d("MLKitFbInstsRestClient", str2);
                        String valueOf3 = String.valueOf(m74990e2);
                        if (valueOf3.length() != 0) {
                            str3 = "auth token expires in: ".concat(valueOf3);
                        } else {
                            str3 = new String("auth token expires in: ");
                        }
                        Log.d("MLKitFbInstsRestClient", str3);
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("auth token expiry: ");
                        sb.append(m6600e);
                        Log.d("MLKitFbInstsRestClient", sb.toString());
                        this.f116259c = new C52307yc9(this.f116259c.m3164b(), this.f116259c.m3163c(), m74990e, m6600e);
                        return true;
                    } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                        EnumC38962c79 enumC38962c79 = EnumC38962c79.RPC_RETURNED_INVALID_RESULT;
                        yb92.m74822d(enumC38962c79);
                        yb9.m74824b(enumC38962c79);
                        String obj = m5236a.toString();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 71 + m6599f.length() + obj.length());
                        sb2.append("Error traversing JSON object returned from <");
                        sb2.append(format);
                        sb2.append(">:\nraw json:\n");
                        sb2.append(m6599f);
                        sb2.append("\nparsed json:\n");
                        sb2.append(obj);
                        Log.e("MLKitFbInstsRestClient", sb2.toString(), e);
                        c41042fc9 = this.f116260d;
                    }
                } catch (zzcq e2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(format).length() + 44 + m6599f.length());
                    sb3.append("Error parsing JSON object returned from <");
                    sb3.append(format);
                    sb3.append(">:\n");
                    sb3.append(m6599f);
                    Log.e("MLKitFbInstsRestClient", sb3.toString(), e2);
                    EnumC38962c79 enumC38962c792 = EnumC38962c79.RPC_RETURNED_MALFORMED_RESULT;
                    yb92.m74822d(enumC38962c792);
                    yb9.m74824b(enumC38962c792);
                    c41042fc9 = this.f116260d;
                }
            } finally {
                this.f116260d.m41104a(EnumC45136mW8.INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN, yb92);
            }
        }
        c41042fc9.m41104a(EnumC45136mW8.INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN, yb92);
        return false;
    }

    /* renamed from: f */
    public final String m6599f(Headers headers, String str, String str2, Yb9 yb9, Yb9 yb92) {
        String str3;
        String str4;
        try {
            Response execute = this.f116258b.newCall(new Request.Builder().headers(headers).url(str).post(RequestBody.create(f116256f, str2)).build()).execute();
            int code = execute.code();
            yb92.m74820f(code);
            if (code >= 200 && code < 300) {
                try {
                    ResponseBody body = execute.body();
                    String string = body.string();
                    body.close();
                    return string;
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
                    sb.append("Error retrieving response body from HTTPS POST request to <");
                    sb.append(str);
                    sb.append(">");
                    Log.e("MLKitFbInstsRestClient", sb.toString(), e);
                    EnumC38962c79 enumC38962c79 = EnumC38962c79.RPC_ERROR;
                    yb92.m74822d(enumC38962c79);
                    yb9.m74824b(enumC38962c79);
                    return null;
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 57);
            sb2.append("Got HTTP status ");
            sb2.append(code);
            sb2.append(" from HTTPS POST request to <");
            sb2.append(str);
            sb2.append(">");
            Log.e("MLKitFbInstsRestClient", sb2.toString());
            try {
                ResponseBody body2 = execute.body();
                str3 = body2.string();
                body2.close();
            } catch (IOException unused) {
                str3 = "<none>";
            }
            String valueOf = String.valueOf(str3);
            if (valueOf.length() != 0) {
                str4 = "HTTP Response Body:\n".concat(valueOf);
            } else {
                str4 = new String("HTTP Response Body:\n");
            }
            Log.d("MLKitFbInstsRestClient", str4);
            EnumC38962c79 enumC38962c792 = EnumC38962c79.RPC_ERROR;
            yb92.m74822d(enumC38962c792);
            yb9.m74824b(enumC38962c792);
            return null;
        } catch (IOException e2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 62);
            sb3.append("Connection error (or timeout) sending HTTPS POST request to <");
            sb3.append(str);
            sb3.append(">");
            Log.e("MLKitFbInstsRestClient", sb3.toString(), e2);
            yb92.m74822d(EnumC38962c79.NO_CONNECTION);
            yb9.m74824b(EnumC38962c79.NO_CONNECTION);
            return null;
        }
    }
}
