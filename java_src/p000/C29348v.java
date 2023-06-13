package p000;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p000.C46068o52;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001c\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lv;", "", "Landroid/app/ActivityManager;", "am", "", C17296a.f69688o, "b", "", "I", "myUid", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "", "c", "Ljava/lang/String;", "previousStackTrace", "Ljava/lang/Runnable;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Runnable;", "anrDetectorRunnable", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: v */
/* loaded from: classes5.dex */
public final class C29348v {

    /* renamed from: e */
    public static final C29348v f113292e = new C29348v();

    /* renamed from: a */
    public static final int f113288a = Process.myUid();

    /* renamed from: b */
    public static final ScheduledExecutorService f113289b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    public static String f113290c = "";

    /* renamed from: d */
    public static final Runnable f113291d = RunnableC29349a.f113293b;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: v$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC29349a implements Runnable {

        /* renamed from: b */
        public static final RunnableC29349a f113293b = new RunnableC29349a();

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    Object systemService = C17216a.m52741e().getSystemService("activity");
                    if (systemService != null) {
                        C29348v.m9410a((ActivityManager) systemService);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                } catch (Exception unused) {
                } catch (Throwable th) {
                    TD0.m84205b(th, this);
                }
            } catch (Throwable th2) {
                TD0.m84205b(th2, this);
            }
        }
    }

    private C29348v() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m9410a(ActivityManager activityManager) {
        if (!TD0.m84203d(C29348v.class) && activityManager != null) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f113288a) {
                            Looper mainLooper = Looper.getMainLooper();
                            Intrinsics.checkNotNullExpressionValue(mainLooper, "Looper.getMainLooper()");
                            Thread thread = mainLooper.getThread();
                            Intrinsics.checkNotNullExpressionValue(thread, "Looper.getMainLooper().thread");
                            String m13149d = C49032t52.m13149d(thread);
                            if (!Intrinsics.areEqual(m13149d, f113290c) && C49032t52.m13146g(thread)) {
                                f113290c = m13149d;
                                C46068o52.C26813a.m21820a(processErrorStateInfo.shortMsg, m13149d).m21821g();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TD0.m84205b(th, C29348v.class);
            }
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m9409b() {
        if (TD0.m84203d(C29348v.class)) {
            return;
        }
        try {
            f113289b.scheduleAtFixedRate(f113291d, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TD0.m84205b(th, C29348v.class);
        }
    }
}
