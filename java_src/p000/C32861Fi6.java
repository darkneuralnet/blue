package p000;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
/* renamed from: Fi6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32861Fi6 {

    /* renamed from: a */
    public static final StringBuilder f9989a = new StringBuilder();

    /* renamed from: b */
    public static final M70 f9990b = M70.m95809d("RIFF");

    /* renamed from: c */
    public static final M70 f9991c = M70.m95809d("WEBP");

    /* renamed from: Fi6$a */
    /* loaded from: classes6.dex */
    public static class HandlerC2410a extends Handler {
        public HandlerC2410a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* renamed from: Fi6$b */
    /* loaded from: classes6.dex */
    public static class C2411b extends Thread {
        public C2411b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: Fi6$c */
    /* loaded from: classes6.dex */
    public static class ThreadFactoryC2412c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C2411b(runnable);
        }
    }

    private C32861Fi6() {
    }

    @TargetApi(18)
    /* renamed from: a */
    public static long m106711a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800L), 5242880L);
    }

    /* renamed from: b */
    public static int m106710b(Context context) {
        boolean z;
        int memoryClass;
        ActivityManager activityManager = (ActivityManager) m106698n(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            memoryClass = activityManager.getLargeMemoryClass();
        } else {
            memoryClass = activityManager.getMemoryClass();
        }
        return (int) ((memoryClass * FileSize.MB_COEFFICIENT) / 7);
    }

    /* renamed from: c */
    public static void m106709c() {
        if (m106695q()) {
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    /* renamed from: d */
    public static <T> T m106708d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static File m106707e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    public static String m106706f(C47378qI4 c47378qI4) {
        StringBuilder sb = f9989a;
        String m106705g = m106705g(c47378qI4, sb);
        sb.setLength(0);
        return m106705g;
    }

    /* renamed from: g */
    public static String m106705g(C47378qI4 c47378qI4, StringBuilder sb) {
        String str = c47378qI4.f105061f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(c47378qI4.f105061f);
        } else {
            Uri uri = c47378qI4.f105059d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(c47378qI4.f105060e);
            }
        }
        sb.append('\n');
        if (c47378qI4.f105069n != 0.0f) {
            sb.append("rotation:");
            sb.append(c47378qI4.f105069n);
            if (c47378qI4.f105072q) {
                sb.append('@');
                sb.append(c47378qI4.f105070o);
                sb.append('x');
                sb.append(c47378qI4.f105071p);
            }
            sb.append('\n');
        }
        if (c47378qI4.m17648c()) {
            sb.append("resize:");
            sb.append(c47378qI4.f105063h);
            sb.append('x');
            sb.append(c47378qI4.f105064i);
            sb.append('\n');
        }
        if (c47378qI4.f105065j) {
            sb.append("centerCrop:");
            sb.append(c47378qI4.f105066k);
            sb.append('\n');
        } else if (c47378qI4.f105067l) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<InterfaceC47298q96> list = c47378qI4.f105062g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(c47378qI4.f105062g.get(i).key());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static void m106704h(Looper looper) {
        HandlerC2410a handlerC2410a = new HandlerC2410a(looper);
        handlerC2410a.sendMessageDelayed(handlerC2410a.obtainMessage(), 1000L);
    }

    /* renamed from: i */
    public static int m106703i(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: j */
    public static String m106702j(RunnableC9043WT runnableC9043WT) {
        return m106701k(runnableC9043WT, "");
    }

    /* renamed from: k */
    public static String m106701k(RunnableC9043WT runnableC9043WT, String str) {
        StringBuilder sb = new StringBuilder(str);
        AbstractC30874z2 m78363h = runnableC9043WT.m78363h();
        if (m78363h != null) {
            sb.append(m78363h.f120629b.m17647d());
        }
        List<AbstractC30874z2> m78362i = runnableC9043WT.m78362i();
        if (m78362i != null) {
            int size = m78362i.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || m78363h != null) {
                    sb.append(", ");
                }
                sb.append(m78362i.get(i).f120629b.m17647d());
            }
        }
        return sb.toString();
    }

    /* renamed from: l */
    public static int m106700l(Resources resources, C47378qI4 c47378qI4) throws FileNotFoundException {
        Uri uri;
        int i = c47378qI4.f105060e;
        if (i == 0 && (uri = c47378qI4.f105059d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                List<String> pathSegments = c47378qI4.f105059d.getPathSegments();
                if (pathSegments != null && !pathSegments.isEmpty()) {
                    if (pathSegments.size() == 1) {
                        try {
                            return Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Last path segment is not a resource ID: " + c47378qI4.f105059d);
                        }
                    } else if (pathSegments.size() == 2) {
                        return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + c47378qI4.f105059d);
                    }
                }
                throw new FileNotFoundException("No path segments: " + c47378qI4.f105059d);
            }
            throw new FileNotFoundException("No package provided: " + c47378qI4.f105059d);
        }
        return i;
    }

    /* renamed from: m */
    public static Resources m106699m(Context context, C47378qI4 c47378qI4) throws FileNotFoundException {
        Uri uri;
        if (c47378qI4.f105060e == 0 && (uri = c47378qI4.f105059d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    return context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException("Unable to obtain resources for package: " + c47378qI4.f105059d);
                }
            }
            throw new FileNotFoundException("No package provided: " + c47378qI4.f105059d);
        }
        return context.getResources();
    }

    /* renamed from: n */
    public static <T> T m106698n(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    /* renamed from: o */
    public static boolean m106697o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: p */
    public static boolean m106696p(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
                return false;
            }
            return true;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m106695q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: r */
    public static boolean m106694r(InterfaceC46046o30 interfaceC46046o30) throws IOException {
        if (interfaceC46046o30.mo21933p3(0L, f9990b) && interfaceC46046o30.mo21933p3(8L, f9991c)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static void m106693s(String str, String str2, String str3) {
        m106692t(str, str2, str3, "");
    }

    /* renamed from: t */
    public static void m106692t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
