package p000;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C17216a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: bb */
/* loaded from: classes5.dex */
public class C12452bb {

    /* renamed from: a */
    public static final String f57736a = "bb";

    /* renamed from: c */
    public static String f57738c;

    /* renamed from: b */
    public static ReentrantReadWriteLock f57737b = new ReentrantReadWriteLock();

    /* renamed from: d */
    public static volatile boolean f57739d = false;

    /* renamed from: bb$a */
    /* loaded from: classes5.dex */
    public static class RunnableC12453a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C12452bb.m64301c();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: b */
    public static String m64302b() {
        if (!f57739d) {
            Log.w(f57736a, "initStore should have been called before calling setUserID");
            m64301c();
        }
        f57737b.readLock().lock();
        try {
            return f57738c;
        } finally {
            f57737b.readLock().unlock();
        }
    }

    /* renamed from: c */
    public static void m64301c() {
        if (f57739d) {
            return;
        }
        f57737b.writeLock().lock();
        try {
            if (f57739d) {
                return;
            }
            f57738c = PreferenceManager.getDefaultSharedPreferences(C17216a.m52741e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f57739d = true;
        } finally {
            f57737b.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public static void m64300d() {
        if (f57739d) {
            return;
        }
        C45485n62.m24344b().execute(new RunnableC12453a());
    }
}
