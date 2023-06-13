package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
/* renamed from: FS0 */
/* loaded from: classes6.dex */
public class FS0 {

    /* renamed from: a */
    public final Context f9378a;

    /* renamed from: b */
    public final SharedPreferences f9379b;

    /* renamed from: c */
    public final InterfaceC46354oa4 f9380c;

    /* renamed from: d */
    public boolean f9381d;

    public FS0(Context context, String str, InterfaceC46354oa4 interfaceC46354oa4) {
        Context m107144a = m107144a(context);
        this.f9378a = m107144a;
        this.f9379b = m107144a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f9380c = interfaceC46354oa4;
        this.f9381d = m107142c();
    }

    /* renamed from: a */
    public static Context m107144a(Context context) {
        return NA0.m94302b(context);
    }

    /* renamed from: b */
    public synchronized boolean m107143b() {
        return this.f9381d;
    }

    /* renamed from: c */
    public final boolean m107142c() {
        if (this.f9379b.contains("firebase_data_collection_default_enabled")) {
            return this.f9379b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m107141d();
    }

    /* renamed from: d */
    public final boolean m107141d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f9378a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f9378a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
