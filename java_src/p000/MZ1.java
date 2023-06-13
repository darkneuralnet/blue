package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.C17216a;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C32172Ck1;
/* renamed from: MZ1 */
/* loaded from: classes5.dex */
public final class MZ1 {

    /* renamed from: a */
    public static final AtomicBoolean f23247a = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m95165a() {
        if (TD0.m84203d(MZ1.class)) {
            return;
        }
        try {
            f23247a.set(true);
            m95164b();
        } catch (Throwable th) {
            TD0.m84205b(th, MZ1.class);
        }
    }

    /* renamed from: b */
    public static void m95164b() {
        if (TD0.m84203d(MZ1.class)) {
            return;
        }
        try {
            if (f23247a.get()) {
                if (m95163c() && C32172Ck1.m111754g(C32172Ck1.EnumC1165b.IapLoggingLib2)) {
                    IZ1.m101926c(C17216a.m52741e());
                } else {
                    HZ1.m103739g();
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, MZ1.class);
        }
    }

    /* renamed from: c */
    public static boolean m95163c() {
        if (TD0.m84203d(MZ1.class)) {
            return false;
        }
        try {
            Context m52741e = C17216a.m52741e();
            ApplicationInfo applicationInfo = m52741e.getPackageManager().getApplicationInfo(m52741e.getPackageName(), 128);
            if (applicationInfo == null) {
                return false;
            }
            if (Integer.parseInt(applicationInfo.metaData.getString("com.google.android.play.billingclient.version").split("\\.", 3)[0]) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, MZ1.class);
            return false;
        }
    }
}
