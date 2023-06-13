package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.stripe.android.model.PaymentMethod;
/* renamed from: H21 */
/* loaded from: classes6.dex */
public class H21 {
    /* renamed from: a */
    public static String m104488a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m104487b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str.equalsIgnoreCase("unknown") && !str2.startsWith(str)) {
            return str + " " + str2;
        }
        return str2;
    }

    /* renamed from: c */
    public static String m104486c() {
        return "Android " + Build.VERSION.RELEASE;
    }

    /* renamed from: d */
    public static String m104485d(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE)).getSimOperatorName();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
