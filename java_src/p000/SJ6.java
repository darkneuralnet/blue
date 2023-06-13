package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: SJ6 */
/* loaded from: classes6.dex */
public final class SJ6 {

    /* renamed from: c */
    public static final C42061hK6 f33469c = new C42061hK6("MissingSplitsAppComponentsHelper");

    /* renamed from: a */
    public final Context f33470a;

    /* renamed from: b */
    public final PackageManager f33471b;

    public SJ6(Context context, PackageManager packageManager) {
        this.f33470a = context;
        this.f33471b = packageManager;
    }

    /* renamed from: a */
    public final boolean m85738a() {
        for (ComponentInfo componentInfo : m85734e()) {
            if (this.f33471b.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                f33469c.m36538a("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f33469c.m36538a("All non-activity components are disabled", new Object[0]);
        return true;
    }

    /* renamed from: b */
    public final void m85737b() {
        f33469c.m36535d("Disabling all non-activity components", new Object[0]);
        m85735d(m85734e(), 2);
    }

    /* renamed from: c */
    public final void m85736c() {
        f33469c.m36535d("Resetting enabled state of all non-activity components", new Object[0]);
        m85735d(m85734e(), 0);
    }

    /* renamed from: d */
    public final void m85735d(List<ComponentInfo> list, int i) {
        for (ComponentInfo componentInfo : list) {
            this.f33471b.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }

    /* renamed from: e */
    public final List<ComponentInfo> m85734e() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f33471b.getPackageInfo(this.f33470a.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            f33469c.m36534e("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }
}
