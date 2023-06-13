package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC48443s56;
import p000.Z42;
/* renamed from: Nm1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34764Nm1 {

    /* renamed from: d */
    public static final Pattern f25148d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f25149e = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: a */
    public final Context f25150a;

    /* renamed from: b */
    public final X94<InterfaceC49746uI1> f25151b;

    /* renamed from: c */
    public final SI4 f25152c = new SI4();

    public C34764Nm1(Context context, X94<InterfaceC49746uI1> x94) {
        this.f25150a = context;
        this.f25151b = x94;
    }

    /* renamed from: a */
    public static String m93459a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    public static JSONObject m93458b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.3");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static JSONObject m93457c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: h */
    public static byte[] m93452h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes(Constants.DEFAULT_ENCODING);
    }

    /* renamed from: i */
    public static boolean m93451i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    public static void m93450j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    public static void m93449k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m93445o = m93445o(httpURLConnection);
        if (!TextUtils.isEmpty(m93445o)) {
            Log.w("Firebase-Installations", m93445o);
            Log.w("Firebase-Installations", m93459a(str, str2, str3));
        }
    }

    @VisibleForTesting
    /* renamed from: m */
    public static long m93447m(String str) {
        Preconditions.checkArgument(f25148d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    /* renamed from: o */
    public static String m93445o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f25149e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static void m93441s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* renamed from: d */
    public Z42 m93456d(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        int responseCode;
        Z42 m93446n;
        if (this.f25152c.m85767b()) {
            URL m93453g = m93453g(String.format("projects/%s/installations", str3));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m93448l = m93448l(m93453g, str);
                try {
                    m93448l.setRequestMethod("POST");
                    m93448l.setDoOutput(true);
                    if (str5 != null) {
                        m93448l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m93443q(m93448l, str2, str4);
                    responseCode = m93448l.getResponseCode();
                    this.f25152c.m85763f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m93448l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (m93451i(responseCode)) {
                    m93446n = m93446n(m93448l);
                } else {
                    m93449k(m93448l, str4, str, str3);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            m93450j();
                            m93446n = Z42.m73783a().mo73773e(Z42.EnumC10112b.BAD_CONFIG).mo73777a();
                        } else {
                            m93448l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    } else {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC18342a.TOO_MANY_REQUESTS);
                    }
                }
                m93448l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m93446n;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC18342a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC18342a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC48443s56 m93455e(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        int responseCode;
        AbstractC48443s56 m93444p;
        if (this.f25152c.m85767b()) {
            URL m93453g = m93453g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection m93448l = m93448l(m93453g, str);
                try {
                    m93448l.setRequestMethod("POST");
                    m93448l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m93448l.setDoOutput(true);
                    m93442r(m93448l);
                    responseCode = m93448l.getResponseCode();
                    this.f25152c.m85763f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m93448l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (m93451i(responseCode)) {
                    m93444p = m93444p(m93448l);
                } else {
                    m93449k(m93448l, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                m93450j();
                                m93444p = AbstractC48443s56.m14793a().mo14788b(AbstractC48443s56.EnumC28177b.BAD_CONFIG).mo14789a();
                            } else {
                                m93448l.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC18342a.TOO_MANY_REQUESTS);
                        }
                    }
                    m93444p = AbstractC48443s56.m14793a().mo14788b(AbstractC48443s56.EnumC28177b.AUTH_ERROR).mo14789a();
                }
                m93448l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m93444p;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC18342a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC18342a.UNAVAILABLE);
    }

    /* renamed from: f */
    public final String m93454f() {
        try {
            Context context = this.f25150a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f25150a.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f25150a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    public final URL m93453g(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.EnumC18342a.UNAVAILABLE);
        }
    }

    /* renamed from: l */
    public final HttpURLConnection m93448l(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", zendesk.core.Constants.APPLICATION_JSON);
            httpURLConnection.addRequestProperty("Accept", zendesk.core.Constants.APPLICATION_JSON);
            httpURLConnection.addRequestProperty(Headers.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty(Headers.CACHE_CONTROL, "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f25150a.getPackageName());
            InterfaceC49746uI1 interfaceC49746uI1 = this.f25151b.get();
            if (interfaceC49746uI1 != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(interfaceC49746uI1.mo10477b()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m93454f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC18342a.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    public final Z42 m93446n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f25149e));
        AbstractC48443s56.AbstractC28176a m14793a = AbstractC48443s56.m14793a();
        Z42.AbstractC10111a m73783a = Z42.m73783a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m73783a.mo73772f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m73783a.mo73775c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m73783a.mo73774d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m14793a.mo14787c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m14793a.mo14786d(m93447m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m73783a.mo73776b(m14793a.mo14789a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m73783a.mo73773e(Z42.EnumC10112b.OK).mo73777a();
    }

    /* renamed from: p */
    public final AbstractC48443s56 m93444p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f25149e));
        AbstractC48443s56.AbstractC28176a m14793a = AbstractC48443s56.m14793a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m14793a.mo14787c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m14793a.mo14786d(m93447m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m14793a.mo14788b(AbstractC48443s56.EnumC28177b.OK).mo14789a();
    }

    /* renamed from: q */
    public final void m93443q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m93441s(httpURLConnection, m93452h(m93458b(str, str2)));
    }

    /* renamed from: r */
    public final void m93442r(HttpURLConnection httpURLConnection) throws IOException {
        m93441s(httpURLConnection, m93452h(m93457c()));
    }
}
