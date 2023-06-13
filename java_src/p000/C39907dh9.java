package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.services.p026s3.Headers;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.Constants;
/* renamed from: dh9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39907dh9 {

    /* renamed from: f */
    public static final Pattern f77067f = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Context f77068a;

    /* renamed from: b */
    public final String f77069b;

    /* renamed from: c */
    public final String f77070c;

    /* renamed from: d */
    public final String f77071d;

    /* renamed from: e */
    public final C39316cj9 f77072e;

    public C39907dh9(Context context, String str, String str2, String str3, long j, long j2, C39316cj9 c39316cj9) {
        String str4;
        this.f77068a = context;
        this.f77069b = str;
        this.f77070c = str2;
        Matcher matcher = f77067f.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.f77071d = str4;
        this.f77072e = c39316cj9;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:86|87|88)|89|90|91|92|(1:94)|95|96|(1:98)|99|100|87|88) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03aa, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03b7, code lost:
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0401 A[Catch: all -> 0x04bf, TryCatch #12 {all -> 0x04e3, blocks: (B:64:0x025f, B:65:0x0271, B:91:0x037d, B:92:0x0386, B:95:0x0395, B:97:0x039a, B:98:0x03a3, B:102:0x03ad, B:103:0x03b0, B:107:0x03ba, B:108:0x03bd, B:109:0x03c1, B:113:0x03cf, B:114:0x03de, B:151:0x04cb, B:152:0x04e2, B:66:0x028e, B:70:0x02ae, B:80:0x0315, B:81:0x031b, B:82:0x0330, B:84:0x0337, B:85:0x033c, B:86:0x0345, B:88:0x0351, B:90:0x035c, B:89:0x0356, B:116:0x03e0, B:117:0x03ef, B:119:0x03f1, B:120:0x0400, B:73:0x02b5, B:74:0x02c1, B:76:0x02c7, B:77:0x02d7, B:79:0x02dd, B:121:0x0401, B:131:0x0471, B:133:0x0478, B:135:0x047e, B:137:0x048f, B:139:0x049f, B:141:0x04a9, B:140:0x04a4, B:142:0x04ac, B:143:0x04b5, B:145:0x04b7, B:146:0x04be, B:124:0x0411, B:125:0x041d, B:127:0x0423, B:128:0x0433, B:130:0x0439), top: B:179:0x025f }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[LOOP:0: B:20:0x00b6->B:22:0x00bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ad  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C44650lh9 m43877a(HttpURLConnection httpURLConnection, String str, String str2, Map map, String str3, Map map2, Date date, String str4, String str5, Yb9 yb9) throws Vi9 {
        String str6;
        String str7;
        Yb9 yb92;
        int responseCode;
        InputStream errorStream;
        C44650lh9 m26946c;
        PackageInfo packageInfo;
        byte[] packageCertificateHashBytes;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(5L));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(5L));
        httpURLConnection.setRequestProperty(Headers.GET_OBJECT_IF_NONE_MATCH, null);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f77070c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f77068a.getPackageName());
        try {
            Context context = this.f77068a;
            packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(this.f77068a.getPackageName());
            Log.e("MLKitRemoteConfigFetch", valueOf.length() != 0 ? "No such package: ".concat(valueOf) : new String("No such package: "), e);
        }
        if (packageCertificateHashBytes == null) {
            String valueOf2 = String.valueOf(this.f77068a.getPackageName());
            Log.e("MLKitRemoteConfigFetch", valueOf2.length() != 0 ? "Could not get fingerprint hash for package: ".concat(valueOf2) : new String("Could not get fingerprint hash for package: "));
            str6 = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", str6);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
            httpURLConnection.setRequestProperty("Accept", Constants.APPLICATION_JSON);
            for (Map.Entry entry : ((AbstractC50746vy7) map2).entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
                for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getRequestProperties().entrySet()) {
                    String key = entry2.getKey();
                    if (!C51732xe7.m4900a(key).contains("api-key") && !C51732xe7.m4900a(key).contains("android-cert")) {
                        for (String str8 : entry2.getValue()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 23 + String.valueOf(str8).length());
                            sb.append("HTTP Request Header: ");
                            sb.append(key);
                            sb.append(": ");
                            sb.append(str8);
                            Log.d("MLKitRemoteConfigFetch", sb.toString());
                        }
                    }
                }
            }
            HashMap hashMap = new HashMap();
            if (str == null) {
                hashMap.put("appInstanceId", str);
                hashMap.put("appInstanceIdToken", str2);
                hashMap.put("appId", this.f77069b);
                Locale locale = this.f77068a.getResources().getConfiguration().locale;
                hashMap.put("countryCode", locale.getCountry());
                hashMap.put("languageCode", locale.toString());
                hashMap.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
                hashMap.put("timeZone", TimeZone.getDefault().getID());
                try {
                    packageInfo = this.f77068a.getPackageManager().getPackageInfo(this.f77068a.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                try {
                    try {
                        if (packageInfo != null) {
                            str7 = packageInfo.versionName;
                            String format = String.format("%s-MLKit-%s", str7, str5);
                            String valueOf3 = String.valueOf(format);
                            Log.d("MLKitRemoteConfigFetch", valueOf3.length() == 0 ? "APP_VERSION: ".concat(valueOf3) : new String("APP_VERSION: "));
                            hashMap.put("appVersion", format);
                            hashMap.put("packageName", this.f77068a.getPackageName());
                            hashMap.put("sdkVersion", "o:a:mlkit:1.0.0");
                            hashMap.put("analyticsUserProperties", new JSONObject(map));
                            JSONObject jSONObject = new JSONObject(hashMap);
                            if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
                                JSONObject jSONObject2 = new JSONObject();
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    try {
                                        jSONObject2.put(next, jSONObject.get(next));
                                    } catch (JSONException e2) {
                                        throw new IllegalStateException("shallowCopyJsonObject: concurrent mutation?", e2);
                                    }
                                }
                                jSONObject2.remove("appInstanceIdToken");
                                Log.d("MLKitRemoteConfigFetch", "HTTP Request Body: ".concat(jSONObject2.toString()));
                            }
                            byte[] bytes = jSONObject.toString().getBytes(TB7.f34885c);
                            yb92 = new Yb9();
                            yb92.m74819g();
                            Log.d("MLKitRemoteConfigFetch", "Getting remote config");
                            Log.d("MLKitRemoteConfigFetch", "Connecting: ".concat(String.valueOf(httpURLConnection)));
                            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            bufferedOutputStream.write(bytes);
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            httpURLConnection.connect();
                            responseCode = httpURLConnection.getResponseCode();
                            yb92.m74820f(responseCode);
                            StringBuilder sb2 = new StringBuilder(44);
                            sb2.append("Remote config: got response code ");
                            sb2.append(responseCode);
                            Log.d("MLKitRemoteConfigFetch", sb2.toString());
                            if (responseCode != 200) {
                                if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
                                    for (Map.Entry<String, List<String>> entry3 : httpURLConnection.getHeaderFields().entrySet()) {
                                        for (String str9 : entry3.getValue()) {
                                            String key2 = entry3.getKey();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(key2).length() + 24 + String.valueOf(str9).length());
                                            sb3.append("HTTP Response Header: ");
                                            sb3.append(key2);
                                            sb3.append(": ");
                                            sb3.append(str9);
                                            Log.d("MLKitRemoteConfigFetch", sb3.toString());
                                        }
                                    }
                                }
                                String headerField = httpURLConnection.getHeaderField(Headers.ETAG);
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), TB7.f34885c));
                                    StringBuilder sb4 = new StringBuilder();
                                    while (true) {
                                        int read = bufferedReader.read();
                                        if (read == -1) {
                                            break;
                                        }
                                        sb4.append((char) read);
                                    }
                                    JSONObject jSONObject3 = new JSONObject(sb4.toString());
                                    String valueOf4 = String.valueOf(headerField);
                                    Log.d("MLKitRemoteConfigFetch", valueOf4.length() != 0 ? "Remote config: got response ETag: ".concat(valueOf4) : new String("Remote config: got response ETag: "));
                                    String obj = jSONObject3.toString();
                                    StringBuilder sb5 = new StringBuilder(obj.length() + 29);
                                    sb5.append("Remote config: got response: ");
                                    sb5.append(obj);
                                    Log.d("MLKitRemoteConfigFetch", sb5.toString());
                                    Log.d("MLKitRemoteConfigFetch", "Remote config: disconnecting...");
                                    httpURLConnection.disconnect();
                                    Log.d("MLKitRemoteConfigFetch", "Remote config: disconnected");
                                    try {
                                        if (jSONObject3.get(TransferTable.COLUMN_STATE).equals("NO_CHANGE")) {
                                            m26946c = C44650lh9.m26947b(date);
                                            return m26946c;
                                        }
                                        Ng9 m79572a = Vg9.m79572a();
                                        m79572a.m93578c(date);
                                        JSONObject jSONObject4 = jSONObject3.getJSONObject("entries");
                                        if (jSONObject4 != null) {
                                            m79572a.m93580a(jSONObject4);
                                        }
                                        JSONArray jSONArray = jSONObject3.getJSONArray("experimentDescriptions");
                                        if (jSONArray != null) {
                                            m79572a.m93579b(jSONArray);
                                        }
                                        m26946c = C44650lh9.m26946c(m79572a.m93577d(), headerField);
                                        return m26946c;
                                    } catch (JSONException e3) {
                                        EnumC38962c79 enumC38962c79 = EnumC38962c79.RPC_RETURNED_INVALID_RESULT;
                                        yb92.m74822d(enumC38962c79);
                                        yb9.m74824b(enumC38962c79);
                                        throw new Oi9("Fetch failed: fetch response could not be parsed.", e3);
                                    }
                                } catch (IOException e4) {
                                    EnumC38962c79 enumC38962c792 = EnumC38962c79.RPC_ERROR;
                                    yb92.m74822d(enumC38962c792);
                                    yb9.m74824b(enumC38962c792);
                                    throw new Oi9("The client had an error while calling the backend!", e4);
                                } catch (JSONException e5) {
                                    EnumC38962c79 enumC38962c793 = EnumC38962c79.RPC_RETURNED_MALFORMED_RESULT;
                                    yb92.m74822d(enumC38962c793);
                                    yb9.m74824b(enumC38962c793);
                                    throw new Oi9("Error parsing the server output", e5);
                                }
                            }
                            EnumC38962c79 enumC38962c794 = EnumC38962c79.RPC_ERROR;
                            yb92.m74822d(enumC38962c794);
                            yb9.m74824b(enumC38962c794);
                            if (Log.isLoggable("MLKitRemoteConfigFetch", 4)) {
                                for (Map.Entry<String, List<String>> entry4 : httpURLConnection.getHeaderFields().entrySet()) {
                                    for (String str10 : entry4.getValue()) {
                                        String key3 = entry4.getKey();
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(key3).length() + 24 + String.valueOf(str10).length());
                                        sb6.append("HTTP Response Header: ");
                                        sb6.append(key3);
                                        sb6.append(": ");
                                        sb6.append(str10);
                                        Log.i("MLKitRemoteConfigFetch", sb6.toString());
                                    }
                                }
                            }
                            if (Log.isLoggable("MLKitRemoteConfigFetch", 5) && (errorStream = httpURLConnection.getErrorStream()) != null) {
                                Scanner useDelimiter = new Scanner(errorStream).useDelimiter("\\A");
                                if (useDelimiter.hasNext()) {
                                    String valueOf5 = String.valueOf(useDelimiter.next());
                                    Log.w("MLKitRemoteConfigFetch", valueOf5.length() != 0 ? "HTTP Error Stream: ".concat(valueOf5) : new String("HTTP Error Stream: "));
                                }
                            }
                            try {
                                throw new C51191wj9(responseCode, httpURLConnection.getResponseMessage());
                            } catch (IOException e6) {
                                throw new C51191wj9(responseCode, "<error reading HTTP response>", e6);
                            }
                        }
                        httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        bufferedOutputStream2.write(bytes);
                        bufferedOutputStream2.flush();
                        bufferedOutputStream2.close();
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        yb92.m74820f(responseCode);
                        StringBuilder sb22 = new StringBuilder(44);
                        sb22.append("Remote config: got response code ");
                        sb22.append(responseCode);
                        Log.d("MLKitRemoteConfigFetch", sb22.toString());
                        if (responseCode != 200) {
                        }
                    } catch (IOException e7) {
                        EnumC38962c79 enumC38962c795 = EnumC38962c79.NO_CONNECTION;
                        yb92.m74822d(enumC38962c795);
                        yb9.m74824b(enumC38962c795);
                        throw new Oi9("Error connecting to ".concat(String.valueOf(httpURLConnection)), e7);
                    }
                    Log.d("MLKitRemoteConfigFetch", "Getting remote config");
                    Log.d("MLKitRemoteConfigFetch", "Connecting: ".concat(String.valueOf(httpURLConnection)));
                } finally {
                    yb92.m74821e();
                    this.f77072e.m61016d(yb92);
                }
                str7 = null;
                String format2 = String.format("%s-MLKit-%s", str7, str5);
                String valueOf32 = String.valueOf(format2);
                Log.d("MLKitRemoteConfigFetch", valueOf32.length() == 0 ? "APP_VERSION: ".concat(valueOf32) : new String("APP_VERSION: "));
                hashMap.put("appVersion", format2);
                hashMap.put("packageName", this.f77068a.getPackageName());
                hashMap.put("sdkVersion", "o:a:mlkit:1.0.0");
                hashMap.put("analyticsUserProperties", new JSONObject(map));
                JSONObject jSONObject5 = new JSONObject(hashMap);
                if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
                }
                byte[] bytes2 = jSONObject5.toString().getBytes(TB7.f34885c);
                yb92 = new Yb9();
                yb92.m74819g();
            } else {
                throw new Oi9("Fetch failed: Firebase instance id is null.");
            }
        } else {
            str6 = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            httpURLConnection.setRequestProperty("X-Android-Cert", str6);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
            httpURLConnection.setRequestProperty("Accept", Constants.APPLICATION_JSON);
            while (r0.hasNext()) {
            }
            if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
            }
            HashMap hashMap2 = new HashMap();
            if (str == null) {
            }
        }
    }

    /* renamed from: b */
    public final HttpURLConnection m43876b() throws Vi9 {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.f77071d, "firebase")).openConnection();
        } catch (IOException e) {
            throw new Vi9(e.getMessage());
        }
    }
}
