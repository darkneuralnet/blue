package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.util.DateUtils;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C18378b;
import com.google.firebase.remoteconfig.internal.C18381c;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.Constants;
/* loaded from: classes6.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h */
    public static final Pattern f74417h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Context f74418a;

    /* renamed from: b */
    public final String f74419b;

    /* renamed from: c */
    public final String f74420c;

    /* renamed from: d */
    public final String f74421d;

    /* renamed from: e */
    public final String f74422e;

    /* renamed from: f */
    public final long f74423f;

    /* renamed from: g */
    public final long f74424g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f74418a = context;
        this.f74419b = str;
        this.f74420c = str2;
        this.f74421d = m47018f(str);
        this.f74422e = str3;
        this.f74423f = j;
        this.f74424g = j2;
    }

    /* renamed from: e */
    public static C18378b m47019e(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            C18378b.C18380b m46986d = C18378b.m46990j().m46986d(date);
            String str = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                m46986d = m46986d.m46988b(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                m46986d = m46986d.m46987c(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                m46986d = m46986d.m46985e(jSONObject3);
            }
            if (jSONObject.has("templateVersion")) {
                str = jSONObject.getString("templateVersion");
            }
            if (str != null) {
                m46986d.m46984f(Long.parseLong(str));
            }
            return m46986d.m46989a();
        } catch (JSONException e) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e);
        }
    }

    /* renamed from: f */
    public static String m47018f(String str) {
        Matcher matcher = f74417h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m47023a(JSONObject jSONObject) {
        try {
            return !jSONObject.get(TransferTable.COLUMN_STATE).equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public final String m47022b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    /* renamed from: c */
    public final JSONObject m47021c(String str, String str2, Map<String, String> map, Long l) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f74419b);
            Locale locale = this.f74418a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f74418a.getPackageManager().getPackageInfo(this.f74418a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(JD3.m100948a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f74418a.getPackageName());
            hashMap.put("sdkVersion", "21.4.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l != null) {
                hashMap.put("firstOpenTime", m47022b(l.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: d */
    public HttpURLConnection m47020d() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(m47016h(this.f74421d, this.f74422e)).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    @Keep
    public C18381c.C18382a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws FirebaseRemoteConfigException {
        m47011m(httpURLConnection, str3, str2, map2);
        try {
            try {
                m47012l(httpURLConnection, m47021c(str, str2, map, l).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField(Headers.ETAG);
                    JSONObject m47017g = m47017g(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    C18378b m47019e = m47019e(m47017g, date);
                    if (!m47023a(m47017g)) {
                        return C18381c.C18382a.m46954a(date, m47019e);
                    }
                    return C18381c.C18382a.m46953b(m47019e, headerField);
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException | JSONException e) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e);
        }
    }

    /* renamed from: g */
    public final JSONObject m47017g(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    /* renamed from: h */
    public final String m47016h(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    /* renamed from: i */
    public final String m47015i() {
        try {
            Context context = this.f74418a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f74418a.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f74418a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: j */
    public final void m47014j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f74420c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f74418a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m47015i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
        httpURLConnection.setRequestProperty("Accept", Constants.APPLICATION_JSON);
    }

    /* renamed from: k */
    public final void m47013k(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: l */
    public final void m47012l(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: m */
    public final void m47011m(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f74423f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f74424g));
        httpURLConnection.setRequestProperty(Headers.GET_OBJECT_IF_NONE_MATCH, str);
        m47014j(httpURLConnection, str2);
        m47013k(httpURLConnection, map);
    }
}
