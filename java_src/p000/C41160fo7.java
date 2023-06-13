package p000;

import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzakk;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzwl;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* renamed from: fo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41160fo7 {

    /* renamed from: f */
    public static final MediaType f80739f = MediaType.parse("application/json; charset=utf-8");

    /* renamed from: a */
    public final C41753go7 f80740a;

    /* renamed from: b */
    public final OkHttpClient f80741b;

    /* renamed from: c */
    public C45904no7 f80742c;

    /* renamed from: d */
    public final C44125ko7 f80743d;

    /* renamed from: e */
    public final String f80744e;

    public C41160fo7(C41753go7 c41753go7, C44125ko7 c44125ko7) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f80741b = builder.connectTimeout(AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit).readTimeout(AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit).writeTimeout(AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit).build();
        this.f80740a = c41753go7;
        this.f80743d = c44125ko7;
        this.f80742c = null;
        this.f80744e = "https://firebaseinstallations.googleapis.com/v1";
    }

    /* renamed from: a */
    public final C45904no7 m40798a() {
        return this.f80742c;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean m40797b(C39974do7 c39974do7, C43532jo7 c43532jo7) throws zzakk, IOException, InterruptedException {
        C44125ko7 c44125ko7;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String format = String.format("%s/projects/%s/installations", this.f80744e, this.f80740a.m37460c());
        Headers build = new Headers.Builder().add("x-goog-api-key", this.f80740a.m37462a()).build();
        String format2 = String.format("{fid: '%s', appId: '%s', authVersion: '%s', sdkVersion: '%s'}", c39974do7.m43686a(), this.f80740a.m37461b(), "FIS_v2", "o:a:mlkit:1.0.0");
        long currentTimeMillis = System.currentTimeMillis();
        C43532jo7 c43532jo72 = new C43532jo7();
        c43532jo72.m29887g();
        Request build2 = new Request.Builder().headers(build).url(format).post(RequestBody.create(f80739f, format2)).build();
        String str7 = null;
        try {
            Response execute = this.f80741b.newCall(build2).execute();
            int code = execute.code();
            c43532jo72.m29888f(code);
            if (code >= 200 && code < 300) {
                try {
                    ResponseBody body = execute.body();
                    String string = body.string();
                    body.close();
                    str7 = string;
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 60);
                    sb.append("Error retrieving response body from HTTPS POST request to <");
                    sb.append(format);
                    sb.append(">");
                    Log.e("MLKitFbInstsRestClient", sb.toString(), e);
                    EnumC52998zm7 enumC52998zm7 = EnumC52998zm7.RPC_ERROR;
                    c43532jo72.m29890d(enumC52998zm7);
                    c43532jo7.m29892b(enumC52998zm7);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 57);
                sb2.append("Got HTTP status ");
                sb2.append(code);
                sb2.append(" from HTTPS POST request to <");
                sb2.append(format);
                sb2.append(">");
                Log.e("MLKitFbInstsRestClient", sb2.toString());
                try {
                    ResponseBody body2 = execute.body();
                    str5 = body2.string();
                    body2.close();
                } catch (IOException unused) {
                    str5 = "<none>";
                }
                String valueOf = String.valueOf(str5);
                if (valueOf.length() != 0) {
                    str6 = "HTTP Response Body:\n".concat(valueOf);
                } else {
                    str6 = new String("HTTP Response Body:\n");
                }
                Log.d("MLKitFbInstsRestClient", str6);
                EnumC52998zm7 enumC52998zm72 = EnumC52998zm7.RPC_ERROR;
                c43532jo72.m29890d(enumC52998zm72);
                c43532jo7.m29892b(enumC52998zm72);
            }
        } catch (IOException e2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(format).length() + 62);
            sb3.append("Connection error (or timeout) sending HTTPS POST request to <");
            sb3.append(format);
            sb3.append(">");
            Log.e("MLKitFbInstsRestClient", sb3.toString(), e2);
            c43532jo72.m29890d(EnumC52998zm7.NO_CONNECTION);
            c43532jo7.m29892b(EnumC52998zm7.NO_CONNECTION);
        }
        c43532jo72.m29889e();
        try {
            if (str7 == null) {
                return false;
            }
            try {
                Uv9 m89367a = Wv9.m77616b(str7).m89367a();
                try {
                    String m76050e = m89367a.m80611c("name").m76050e();
                    C39974do7 c39974do72 = new C39974do7(m89367a.m80611c("fid").m76050e());
                    String m76050e2 = m89367a.m80611c("refreshToken").m76050e();
                    Uv9 m80612b = m89367a.m80612b("authToken");
                    String m76050e3 = m80612b.m80611c("token").m76050e();
                    String m76050e4 = m80612b.m80611c("expiresIn").m76050e();
                    long parseLong = currentTimeMillis + (Long.parseLong(m76050e4.replaceFirst("s$", "")) * 1000);
                    String valueOf2 = String.valueOf(m76050e);
                    if (valueOf2.length() != 0) {
                        str = "installation name: ".concat(valueOf2);
                    } else {
                        str = new String("installation name: ");
                    }
                    Log.i("MLKitFbInstsRestClient", str);
                    String valueOf3 = String.valueOf(c39974do72.m43686a());
                    if (valueOf3.length() != 0) {
                        str2 = "fid: ".concat(valueOf3);
                    } else {
                        str2 = new String("fid: ");
                    }
                    Log.d("MLKitFbInstsRestClient", str2);
                    String valueOf4 = String.valueOf(m76050e2);
                    if (valueOf4.length() != 0) {
                        str3 = "refresh_token: ".concat(valueOf4);
                    } else {
                        str3 = new String("refresh_token: ");
                    }
                    Log.d("MLKitFbInstsRestClient", str3);
                    String valueOf5 = String.valueOf(m80612b);
                    StringBuilder sb4 = new StringBuilder(valueOf5.length() + 12);
                    sb4.append("auth token: ");
                    sb4.append(valueOf5);
                    Log.d("MLKitFbInstsRestClient", sb4.toString());
                    if (m76050e4.length() != 0) {
                        str4 = "auth token expires in: ".concat(m76050e4);
                    } else {
                        str4 = new String("auth token expires in: ");
                    }
                    Log.d("MLKitFbInstsRestClient", str4);
                    StringBuilder sb5 = new StringBuilder(39);
                    sb5.append("auth token expiry: ");
                    sb5.append(parseLong);
                    Log.d("MLKitFbInstsRestClient", sb5.toString());
                    this.f80742c = new C45904no7(c39974do72, m76050e2, m76050e3, parseLong);
                    this.f80743d.m28436a(EnumC36858Wk7.INSTALLATION_ID_FIS_CREATE_INSTALLATION, c43532jo72);
                    return true;
                } catch (ClassCastException | IllegalStateException | NullPointerException e3) {
                    String obj = m89367a.toString();
                    StringBuilder sb6 = new StringBuilder(String.valueOf(format).length() + 75 + str7.length() + obj.length());
                    sb6.append("Error traversing JSON object returned from url <");
                    sb6.append(format);
                    sb6.append(">:\nraw json:\n");
                    sb6.append(str7);
                    sb6.append("\nparsed json:\n");
                    sb6.append(obj);
                    Log.e("MLKitFbInstsRestClient", sb6.toString(), e3);
                    EnumC52998zm7 enumC52998zm73 = EnumC52998zm7.RPC_RETURNED_INVALID_RESULT;
                    c43532jo72.m29890d(enumC52998zm73);
                    c43532jo7.m29892b(enumC52998zm73);
                    c44125ko7 = this.f80743d;
                    c44125ko7.m28436a(EnumC36858Wk7.INSTALLATION_ID_FIS_CREATE_INSTALLATION, c43532jo72);
                    return false;
                }
            } catch (zzwl | IllegalStateException | NullPointerException e4) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(format).length() + 44 + str7.length());
                sb7.append("Error parsing JSON object returned from <");
                sb7.append(format);
                sb7.append(">:\n");
                sb7.append(str7);
                Log.e("MLKitFbInstsRestClient", sb7.toString(), e4);
                EnumC52998zm7 enumC52998zm74 = EnumC52998zm7.RPC_RETURNED_MALFORMED_RESULT;
                c43532jo72.m29890d(enumC52998zm74);
                c43532jo7.m29892b(enumC52998zm74);
                c44125ko7 = this.f80743d;
            }
        } finally {
            this.f80743d.m28436a(EnumC36858Wk7.INSTALLATION_ID_FIS_CREATE_INSTALLATION, c43532jo72);
        }
    }
}
