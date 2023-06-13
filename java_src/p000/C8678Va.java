package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import com.braintreepayments.api.models.Authorization;
import com.braintreepayments.api.models.ClientToken;
import com.stripe.android.networking.FraudDetectionData;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Va */
/* loaded from: classes2.dex */
public class C8678Va {

    /* renamed from: Va$a */
    /* loaded from: classes2.dex */
    public static class C8679a implements HN1 {

        /* renamed from: a */
        public final /* synthetic */ C20467fa f39250a;

        /* renamed from: b */
        public final /* synthetic */ List f39251b;

        public C8679a(C20467fa c20467fa, List list) {
            this.f39250a = c20467fa;
            this.f39251b = list;
        }

        @Override // p000.HN1
        /* renamed from: a */
        public void mo10871a(Exception exc) {
        }

        @Override // p000.HN1
        public void success(String str) {
            this.f39250a.m41169f(this.f39251b);
        }
    }

    /* renamed from: a */
    public static String m79742a() {
        String str = Build.PRODUCT;
        if (!"google_sdk".equalsIgnoreCase(str) && !SdkAction.ACTION_TYPE.equalsIgnoreCase(str) && !"Genymotion".equalsIgnoreCase(Build.MANUFACTURER) && !Build.FINGERPRINT.contains("generic")) {
            return "false";
        }
        return "true";
    }

    /* renamed from: b */
    public static String m79741b(Context context) {
        ApplicationInfo applicationInfo;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        String str = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            str = (String) packageManager.getApplicationLabel(applicationInfo);
        }
        if (str == null) {
            return "ApplicationNameUnknown";
        }
        return str;
    }

    /* renamed from: c */
    public static String m79740c() {
        boolean z;
        boolean z2;
        boolean z3;
        String str = Build.TAGS;
        boolean z4 = true;
        if (str != null && str.contains("test-keys")) {
            z = true;
        } else {
            z = false;
        }
        try {
            z2 = new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            z2 = false;
        }
        if (new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"}).getInputStream())).readLine() != null) {
            z3 = true;
            if (!z && !z2 && !z3) {
                z4 = false;
            }
            return Boolean.toString(z4);
        }
        z3 = false;
        if (!z) {
            z4 = false;
        }
        return Boolean.toString(z4);
    }

    /* renamed from: d */
    public static void m79739d(Context context, Authorization authorization, K10 k10, String str, boolean z) {
        C20467fa m41172b = C20467fa.m41172b(context);
        try {
            for (List<C24929ja> list : m41172b.m41171c()) {
                JSONObject m79738e = m79738e(context, authorization, list);
                if (z) {
                    try {
                        k10.mo3549d(str, m79738e.toString());
                        m41172b.m41169f(list);
                    } catch (Exception unused) {
                    }
                } else {
                    k10.mo3548e(str, m79738e.toString(), new C8679a(m41172b, list));
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: e */
    public static JSONObject m79738e(Context context, Authorization authorization, List<C24929ja> list) throws JSONException {
        C24929ja c24929ja = list.get(0);
        JSONObject jSONObject = new JSONObject();
        if (authorization instanceof ClientToken) {
            jSONObject.put("authorization_fingerprint", authorization.mo53279b());
        } else {
            jSONObject.put("tokenization_key", authorization.mo53279b());
        }
        jSONObject.put("_meta", c24929ja.f92936d.put("platform", "Android").put("platformVersion", Integer.toString(Build.VERSION.SDK_INT)).put("sdkVersion", "3.17.2").put("merchantAppId", context.getPackageName()).put("merchantAppName", m79741b(context)).put("deviceRooted", m79740c()).put("deviceManufacturer", Build.MANUFACTURER).put("deviceModel", Build.MODEL).put("deviceAppGeneratedPersistentUuid", C47572qd6.m17309b(context)).put("isSimulator", m79742a()));
        JSONArray jSONArray = new JSONArray();
        for (C24929ja c24929ja2 : list) {
            jSONArray.put(new JSONObject().put("kind", c24929ja2.f92934b).put(FraudDetectionData.KEY_TIMESTAMP, c24929ja2.f92935c));
        }
        jSONObject.put("analytics", jSONArray);
        return jSONObject;
    }
}
