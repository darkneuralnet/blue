package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: jm */
/* loaded from: classes5.dex */
public final class C25013jm {

    /* renamed from: a */
    public static final ConcurrentMap<String, InterfaceC38133ak2> f93307a = new ConcurrentHashMap();

    private C25013jm() {
    }

    /* renamed from: a */
    public static PackageInfo m29960a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m29959b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static InterfaceC38133ak2 m29958c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, InterfaceC38133ak2> concurrentMap = f93307a;
        InterfaceC38133ak2 interfaceC38133ak2 = concurrentMap.get(packageName);
        if (interfaceC38133ak2 == null) {
            InterfaceC38133ak2 m29957d = m29957d(context);
            InterfaceC38133ak2 putIfAbsent = concurrentMap.putIfAbsent(packageName, m29957d);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return m29957d;
        }
        return interfaceC38133ak2;
    }

    /* renamed from: d */
    public static InterfaceC38133ak2 m29957d(Context context) {
        return new C35387Qd3(m29959b(m29960a(context)));
    }
}
