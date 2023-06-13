package p000;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* renamed from: b5 */
/* loaded from: classes.dex */
public final class C12286b5 {

    /* renamed from: a */
    public static final Class<?> f56885a;

    /* renamed from: b */
    public static final Field f56886b;

    /* renamed from: c */
    public static final Field f56887c;

    /* renamed from: d */
    public static final Method f56888d;

    /* renamed from: e */
    public static final Method f56889e;

    /* renamed from: f */
    public static final Method f56890f;

    /* renamed from: g */
    public static final Handler f56891g = new Handler(Looper.getMainLooper());

    /* renamed from: b5$a */
    /* loaded from: classes.dex */
    public class RunnableC12287a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C12290d f56892b;

        /* renamed from: c */
        public final /* synthetic */ Object f56893c;

        public RunnableC12287a(C12290d c12290d, Object obj) {
            this.f56892b = c12290d;
            this.f56893c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56892b.f56898b = this.f56893c;
        }
    }

    /* renamed from: b5$b */
    /* loaded from: classes.dex */
    public class RunnableC12288b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Application f56894b;

        /* renamed from: c */
        public final /* synthetic */ C12290d f56895c;

        public RunnableC12288b(Application application, C12290d c12290d) {
            this.f56894b = application;
            this.f56895c = c12290d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56894b.unregisterActivityLifecycleCallbacks(this.f56895c);
        }
    }

    /* renamed from: b5$c */
    /* loaded from: classes.dex */
    public class RunnableC12289c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Object f56896b;

        /* renamed from: c */
        public final /* synthetic */ Object f56897c;

        public RunnableC12289c(Object obj, Object obj2) {
            this.f56896b = obj;
            this.f56897c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C12286b5.f56888d;
                if (method != null) {
                    method.invoke(this.f56896b, this.f56897c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C12286b5.f56889e.invoke(this.f56896b, this.f56897c, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: b5$d */
    /* loaded from: classes.dex */
    public static final class C12290d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        public Object f56898b;

        /* renamed from: c */
        public Activity f56899c;

        /* renamed from: d */
        public final int f56900d;

        /* renamed from: e */
        public boolean f56901e = false;

        /* renamed from: f */
        public boolean f56902f = false;

        /* renamed from: g */
        public boolean f56903g = false;

        public C12290d(Activity activity) {
            this.f56899c = activity;
            this.f56900d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f56899c == activity) {
                this.f56899c = null;
                this.f56902f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f56902f && !this.f56903g && !this.f56901e && C12286b5.m64994h(this.f56898b, this.f56900d, activity)) {
                this.f56903g = true;
                this.f56898b = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f56899c == activity) {
                this.f56901e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> m65001a = m65001a();
        f56885a = m65001a;
        f56886b = m65000b();
        f56887c = m64996f();
        f56888d = m64998d(m65001a);
        f56889e = m64999c(m65001a);
        f56890f = m64997e(m65001a);
    }

    private C12286b5() {
    }

    /* renamed from: a */
    public static Class<?> m65001a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m65000b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m64999c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m64998d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m64997e(Class<?> cls) {
        if (m64995g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Field m64996f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m64995g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    public static boolean m64994h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f56887c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f56891g.postAtFrontOfQueue(new RunnableC12289c(f56886b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m64993i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m64995g() && f56890f == null) {
            return false;
        } else {
            if (f56889e == null && f56888d == null) {
                return false;
            }
            try {
                Object obj2 = f56887c.get(activity);
                if (obj2 == null || (obj = f56886b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C12290d c12290d = new C12290d(activity);
                application.registerActivityLifecycleCallbacks(c12290d);
                Handler handler = f56891g;
                handler.post(new RunnableC12287a(c12290d, obj2));
                if (m64995g()) {
                    Method method = f56890f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC12288b(application, c12290d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
