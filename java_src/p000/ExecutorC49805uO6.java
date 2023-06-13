package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* renamed from: uO6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC49805uO6 implements Executor {

    /* renamed from: b */
    public final Handler f112297b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f112297b.post(runnable);
    }
}
