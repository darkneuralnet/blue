package p000;

import android.content.Context;
/* renamed from: LR3 */
/* loaded from: classes2.dex */
public class LR3 {
    /* renamed from: a */
    public static String m96943a(String str, Context context) {
        return context.getApplicationContext().getSharedPreferences("com.braintreepayament.browserswitch.persistentstore", 0).getString(str, null);
    }

    /* renamed from: b */
    public static void m96942b(String str, String str2, Context context) {
        context.getApplicationContext().getSharedPreferences("com.braintreepayament.browserswitch.persistentstore", 0).edit().putString(str, str2).apply();
    }

    /* renamed from: c */
    public static void m96941c(String str, Context context) {
        context.getApplicationContext().getSharedPreferences("com.braintreepayament.browserswitch.persistentstore", 0).edit().remove(str).apply();
    }
}
