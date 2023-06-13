package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;
/* renamed from: Iq9 */
/* loaded from: classes5.dex */
public final class Iq9 {

    /* renamed from: a */
    public final Context f16314a;

    /* renamed from: b */
    public int f16315b;

    /* renamed from: c */
    public int f16316c = 0;

    public Iq9(Context context) {
        this.f16314a = context;
    }

    /* renamed from: a */
    public final synchronized int m101600a() {
        PackageInfo packageInfo;
        if (this.f16315b == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.f16314a).getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f16315b = packageInfo.versionCode;
            }
        }
        return this.f16315b;
    }

    /* renamed from: b */
    public final synchronized int m101599b() {
        int i = this.f16316c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f16314a.getPackageManager();
        if (Wrappers.packageManager(this.f16314a).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f16316c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f16316c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f16316c = 2;
            i2 = 2;
        } else {
            this.f16316c = 1;
        }
        return i2;
    }
}
