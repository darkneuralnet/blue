package p000;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* renamed from: B36 */
/* loaded from: classes6.dex */
public class B36 {

    /* renamed from: a */
    public static Executor f1584a;

    /* renamed from: b */
    public static Executor f1585b;

    /* renamed from: B36$a */
    /* loaded from: classes6.dex */
    public class ExecutorC0383a implements Executor {

        /* renamed from: b */
        public final Handler f1586b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1586b.post(runnable);
        }
    }

    private B36() {
    }

    /* renamed from: a */
    public static Executor m114761a() {
        if (f1584a == null) {
            f1584a = new ExecutorC0383a();
        }
        return f1584a;
    }

    /* renamed from: b */
    public static Executor m114760b() {
        Executor executor = f1585b;
        if (executor == null) {
            return AsyncTask.THREAD_POOL_EXECUTOR;
        }
        return executor;
    }
}
