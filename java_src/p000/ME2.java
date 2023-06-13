package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
@KeepForSdk
/* renamed from: ME2 */
/* loaded from: classes6.dex */
public class ME2 {

    /* renamed from: b */
    public static final Object f22913b = new Object();

    /* renamed from: c */
    public static ME2 f22914c;

    /* renamed from: a */
    public final Handler f22915a;

    public ME2(Looper looper) {
        this.f22915a = new HandlerC46990pe7(looper);
    }

    @KeepForSdk
    /* renamed from: a */
    public static ME2 m95480a() {
        ME2 me2;
        synchronized (f22913b) {
            if (f22914c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f22914c = new ME2(handlerThread.getLooper());
            }
            me2 = f22914c;
        }
        return me2;
    }

    @KeepForSdk
    /* renamed from: d */
    public static Executor m95477d() {
        return EnumC52476yt8.f120376b;
    }

    @KeepForSdk
    /* renamed from: b */
    public <ResultT> Task<ResultT> m95479b(final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m95478c(new Runnable() { // from class: Ke8
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e) {
                    taskCompletionSource2.setException(e);
                } catch (Exception e2) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    /* renamed from: c */
    public void m95478c(Runnable runnable) {
        m95477d().execute(runnable);
    }
}
