package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
/* renamed from: ET2 */
/* loaded from: classes6.dex */
public class ET2 {

    /* renamed from: a */
    public final Context f7520a;

    /* renamed from: b */
    public String f7521b;

    /* renamed from: c */
    public String f7522c;

    /* renamed from: d */
    public int f7523d;

    /* renamed from: e */
    public int f7524e = 0;

    public ET2(Context context) {
        this.f7520a = context;
    }

    /* renamed from: c */
    public static String m108940c(C31722Am1 c31722Am1) {
        String m18704d = c31722Am1.m115290m().m18704d();
        if (m18704d != null) {
            return m18704d;
        }
        String m18705c = c31722Am1.m115290m().m18705c();
        if (!m18705c.startsWith("1:")) {
            return m18705c;
        }
        String[] split = m18705c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized String m108942a() {
        if (this.f7521b == null) {
            m108935h();
        }
        return this.f7521b;
    }

    /* renamed from: b */
    public synchronized String m108941b() {
        if (this.f7522c == null) {
            m108935h();
        }
        return this.f7522c;
    }

    /* renamed from: d */
    public synchronized int m108939d() {
        PackageInfo m108937f;
        if (this.f7523d == 0 && (m108937f = m108937f("com.google.android.gms")) != null) {
            this.f7523d = m108937f.versionCode;
        }
        return this.f7523d;
    }

    /* renamed from: e */
    public synchronized int m108938e() {
        int i = this.f7524e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f7520a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f7524e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f7524e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f7524e = 2;
        } else {
            this.f7524e = 1;
        }
        return this.f7524e;
    }

    /* renamed from: f */
    public final PackageInfo m108937f(String str) {
        try {
            return this.f7520a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: g */
    public boolean m108936g() {
        return m108938e() != 0;
    }

    /* renamed from: h */
    public final synchronized void m108935h() {
        PackageInfo m108937f = m108937f(this.f7520a.getPackageName());
        if (m108937f != null) {
            this.f7521b = Integer.toString(m108937f.versionCode);
            this.f7522c = m108937f.versionName;
        }
    }
}
