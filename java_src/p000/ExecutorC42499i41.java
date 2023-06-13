package p000;

import java.util.concurrent.Executor;
/* renamed from: i41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC42499i41 implements Executor {

    /* renamed from: b */
    public static volatile ExecutorC42499i41 f86687b;

    /* renamed from: a */
    public static Executor m34504a() {
        if (f86687b != null) {
            return f86687b;
        }
        synchronized (ExecutorC42499i41.class) {
            if (f86687b == null) {
                f86687b = new ExecutorC42499i41();
            }
        }
        return f86687b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
