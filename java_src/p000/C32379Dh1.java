package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: Dh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32379Dh1 {

    /* renamed from: Dh1$a */
    /* loaded from: classes.dex */
    public static class ExecutorC1584a implements Executor {

        /* renamed from: b */
        public final Handler f6193b;

        public ExecutorC1584a(Handler handler) {
            this.f6193b = (Handler) HZ3.m103731g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f6193b.post((Runnable) HZ3.m103731g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f6193b + " is shutting down");
        }
    }

    private C32379Dh1() {
    }

    /* renamed from: a */
    public static Executor m110004a(Handler handler) {
        return new ExecutorC1584a(handler);
    }
}
