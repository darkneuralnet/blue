package zendesk.support.suas;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class Executors {

    /* loaded from: classes8.dex */
    public static class AndroidExecutor implements Executor {
        private final Handler handler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.handler.post(runnable);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class DefaultCurrentThreadExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor getAndroidExecutor() {
        return new AndroidExecutor();
    }

    public static Executor getDefaultExecutor() {
        return new DefaultCurrentThreadExecutor();
    }
}
