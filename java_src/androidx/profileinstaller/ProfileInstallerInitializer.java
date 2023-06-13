package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.C11817c;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements E22<C11813c> {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    /* loaded from: classes.dex */
    public static class C11811a {
        private C11811a() {
        }

        /* renamed from: c */
        public static void m66818c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: z74
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    /* loaded from: classes.dex */
    public static class C11812b {
        private C11812b() {
        }

        /* renamed from: a */
        public static Handler m66817a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    /* loaded from: classes.dex */
    public static class C11813c {
    }

    /* renamed from: j */
    public static void m66821j(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: y74
            @Override // java.lang.Runnable
            public final void run() {
                C11817c.m66791i(context);
            }
        });
    }

    @Override // p000.E22
    /* renamed from: d */
    public C11813c create(Context context) {
        m66826e(context.getApplicationContext());
        return new C11813c();
    }

    @Override // p000.E22
    public List<Class<? extends E22<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* renamed from: e */
    public void m66826e(final Context context) {
        C11811a.m66818c(new Runnable() { // from class: w74
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.m66824g(context);
            }
        });
    }

    /* renamed from: f */
    public void m66824g(final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C11812b.m66817a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: x74
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m66821j(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
