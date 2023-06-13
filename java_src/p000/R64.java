package p000;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.C12120a;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/a;", "configuration", "", "b", "", C17296a.f69688o, "Ljava/lang/String;", "TAG", "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
@JvmName(name = "ProcessUtils")
/* renamed from: R64 */
/* loaded from: classes.dex */
public final class R64 {

    /* renamed from: a */
    public static final String f31531a;

    static {
        String m113270i = AbstractC32056Bx2.m113270i("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(m113270i, "tagWithPrefix(\"ProcessUtils\")");
        f31531a = m113270i;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* renamed from: a */
    public static final String m87315a(Context context) {
        Object obj;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            return C12473bh.f57871a.m64171a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, ZC6.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Intrinsics.checkNotNull(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            AbstractC32056Bx2.m113272e().mo113268b(f31531a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo == null) {
            return null;
        }
        return runningAppProcessInfo.processName;
    }

    /* renamed from: b */
    public static final boolean m87314b(Context context, C12120a configuration) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String m87315a = m87315a(context);
        String m65607c = configuration.m65607c();
        if (m65607c != null && m65607c.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return Intrinsics.areEqual(m87315a, configuration.m65607c());
        }
        return Intrinsics.areEqual(m87315a, context.getApplicationInfo().processName);
    }
}
