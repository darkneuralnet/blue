package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.C17216a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/* renamed from: tF0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49125tF0 {

    /* renamed from: a */
    public static final String[] f110217a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: a */
    public static String m12565a() {
        if (TD0.m84203d(C49125tF0.class)) {
            return null;
        }
        try {
            Context m52741e = C17216a.m52741e();
            List<ResolveInfo> queryIntentServices = m52741e.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                HashSet hashSet = new HashSet(Arrays.asList(f110217a));
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C49125tF0.class);
            return null;
        }
    }

    /* renamed from: b */
    public static String m12564b() {
        if (TD0.m84203d(C49125tF0.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + C17216a.m52741e().getPackageName();
        } catch (Throwable th) {
            TD0.m84205b(th, C49125tF0.class);
            return null;
        }
    }

    /* renamed from: c */
    public static String m12563c(String str) {
        if (TD0.m84203d(C49125tF0.class)) {
            return null;
        }
        try {
            if (C48817sj6.m13773e(C17216a.m52741e(), str)) {
                return str;
            }
            if (C48817sj6.m13773e(C17216a.m52741e(), m12564b())) {
                return m12564b();
            }
            return "";
        } catch (Throwable th) {
            TD0.m84205b(th, C49125tF0.class);
            return null;
        }
    }
}
