package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* renamed from: QJ2 */
/* loaded from: classes5.dex */
public final class QJ2 {

    /* renamed from: a */
    public final Context f30205a;

    public QJ2(Context context) {
        this.f30205a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LC1 m88660b(String str) {
        Class cls;
        Class cls2;
        Class cls3;
        Object obj;
        Class cls4;
        try {
            try {
                obj = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                m88659c(cls4, e);
                obj = null;
                if (obj instanceof LC1) {
                }
            } catch (InstantiationException e2) {
                m88659c(cls3, e2);
                obj = null;
                if (obj instanceof LC1) {
                }
            } catch (NoSuchMethodException e3) {
                m88659c(cls2, e3);
                obj = null;
                if (obj instanceof LC1) {
                }
            } catch (InvocationTargetException e4) {
                m88659c(cls, e4);
                obj = null;
                if (obj instanceof LC1) {
                }
            }
            if (obj instanceof LC1) {
                return (LC1) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: c */
    public static void m88659c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public List<LC1> m88661a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f30205a.getPackageManager().getApplicationInfo(this.f30205a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(m88660b(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
