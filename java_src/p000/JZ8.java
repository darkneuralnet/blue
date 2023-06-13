package p000;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;
/* renamed from: JZ8 */
/* loaded from: classes5.dex */
public final class JZ8 extends FutureTask {

    /* renamed from: b */
    public final /* synthetic */ C41924h59 f17846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JZ8(C41924h59 c41924h59, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f17846b = c41924h59;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        uncaughtExceptionHandler = this.f17846b.f84700b.f30885f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(valueOf);
            Log.e("GAv4", sb.toString());
        }
        super.setException(th);
    }
}
