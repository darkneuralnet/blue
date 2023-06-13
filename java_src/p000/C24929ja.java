package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ch.qos.logback.core.CoreConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: ja */
/* loaded from: classes2.dex */
public class C24929ja {

    /* renamed from: a */
    public int f92933a;

    /* renamed from: b */
    public String f92934b;

    /* renamed from: c */
    public long f92935c;

    /* renamed from: d */
    public JSONObject f92936d;

    public C24929ja() {
        this.f92936d = new JSONObject();
    }

    /* renamed from: b */
    public static String m30314b() {
        return (String) C33800Jj0.m99916a("com.braintreepayments.api.dropin.BuildConfig", CoreConstants.VERSION_NAME_KEY);
    }

    /* renamed from: a */
    public final String m30315a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "VersionUnknown";
        }
    }

    /* renamed from: c */
    public final String m30313c(Context context) {
        String str;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            str = activeNetworkInfo.getTypeName();
        } else {
            str = null;
        }
        if (str == null) {
            return "none";
        }
        return str;
    }

    /* renamed from: d */
    public final String m30312d(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? "Unknown" : "Landscape" : "Portrait";
    }

    /* renamed from: e */
    public final boolean m30311e(Context context) {
        try {
            Class.forName(C46811pL3.class.getName());
            return C46811pL3.m19460f(context);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public C24929ja(Context context, String str, String str2, String str3) {
        this.f92936d = new JSONObject();
        this.f92934b = "android." + str3;
        this.f92935c = System.currentTimeMillis();
        try {
            this.f92936d.put("sessionId", str).put("integrationType", str2).put("deviceNetworkType", m30313c(context)).put("userInterfaceOrientation", m30312d(context)).put("merchantAppVersion", m30315a(context)).put("paypalInstalled", m30311e(context)).put("venmoInstalled", C51831xo6.m4608b(context)).put("dropinVersion", m30314b());
        } catch (JSONException unused) {
        }
    }
}
