package p000;

import android.os.Looper;
import android.util.Log;
/* renamed from: FC7 */
/* loaded from: classes5.dex */
public final class FC7 {

    /* renamed from: a */
    public static volatile ClassLoader f9013a;

    /* renamed from: b */
    public static volatile Thread f9014b;

    /* renamed from: a */
    public static synchronized ClassLoader m107439a() {
        ClassLoader classLoader;
        synchronized (FC7.class) {
            if (f9013a == null) {
                f9013a = m107438b();
            }
            classLoader = f9013a;
        }
        return classLoader;
    }

    /* renamed from: b */
    public static synchronized ClassLoader m107438b() {
        synchronized (FC7.class) {
            ClassLoader classLoader = null;
            if (f9014b == null) {
                f9014b = m107437c();
                if (f9014b == null) {
                    return null;
                }
            }
            synchronized (f9014b) {
                try {
                    classLoader = f9014b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    public static synchronized Thread m107437c() {
        SecurityException e;
        C37272Ye7 c37272Ye7;
        C37272Ye7 c37272Ye72;
        ThreadGroup threadGroup;
        synchronized (FC7.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 < activeGroupCount) {
                            threadGroup = threadGroupArr[i2];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i2++;
                        } else {
                            threadGroup = null;
                            break;
                        }
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i < activeCount) {
                            c37272Ye72 = threadArr[i];
                            if ("GmsDynamite".equals(c37272Ye72.getName())) {
                                break;
                            }
                            i++;
                        } else {
                            c37272Ye72 = null;
                            break;
                        }
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    c37272Ye7 = null;
                }
                if (c37272Ye72 == null) {
                    try {
                        c37272Ye7 = new C37272Ye7(threadGroup, "GmsDynamite");
                        try {
                            c37272Ye7.setContextClassLoader(null);
                            c37272Ye7.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                            c37272Ye72 = c37272Ye7;
                            return c37272Ye72;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        c37272Ye7 = c37272Ye72;
                    }
                    c37272Ye72 = c37272Ye7;
                }
            }
            return c37272Ye72;
        }
    }
}
