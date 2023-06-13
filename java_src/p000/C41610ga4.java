package p000;

import android.content.Context;
import android.content.SharedPreferences;
/* renamed from: ga4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41610ga4 {
    private C41610ga4() {
    }

    /* renamed from: a */
    public static SharedPreferences m39149a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* renamed from: b */
    public static boolean m39148b(Context context) {
        return m39149a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* renamed from: c */
    public static void m39147c(Context context, boolean z) {
        SharedPreferences.Editor edit = m39149a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
