package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: g52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41324g52 {

    /* renamed from: a */
    public static Boolean f81543a;

    /* renamed from: b */
    public static Context f81544b;

    /* renamed from: c */
    public static C20725a f81545c;

    /* renamed from: g52$a */
    /* loaded from: classes6.dex */
    public static class C20725a {

        /* renamed from: b */
        public static Method f81546b;

        /* renamed from: a */
        public final PackageManager f81547a;

        public C20725a(PackageManager packageManager) {
            this.f81547a = packageManager;
        }

        /* renamed from: a */
        public Boolean m40135a() {
            if (!C41324g52.m40137b()) {
                return null;
            }
            if (f81546b == null) {
                try {
                    f81546b = PackageManager.class.getDeclaredMethod(NamedConstantsKt.IS_INSTANT_APP, new Class[0]);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return (Boolean) f81546b.invoke(this.f81547a, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return null;
            }
        }
    }

    private C41324g52() {
    }

    /* renamed from: b */
    public static boolean m40137b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: c */
    public static boolean m40136c(@NonNull Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                if (f81543a != null && applicationContext.equals(f81544b)) {
                    return f81543a.booleanValue();
                }
                Boolean bool = null;
                f81543a = null;
                if (m40137b()) {
                    if (f81545c == null || !applicationContext.equals(f81544b)) {
                        f81545c = new C20725a(applicationContext.getPackageManager());
                    }
                    bool = f81545c.m40135a();
                }
                f81544b = applicationContext;
                if (bool != null) {
                    f81543a = bool;
                } else {
                    try {
                        applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f81543a = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        f81543a = Boolean.FALSE;
                    }
                }
                return f81543a.booleanValue();
            }
            throw new IllegalStateException("Application context is null!");
        }
        throw new IllegalArgumentException("Context must be non-null");
    }
}
