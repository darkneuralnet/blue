package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: X69 */
/* loaded from: classes6.dex */
public abstract class X69<T> extends Fb9<T> {

    /* renamed from: d */
    public final Executor f42678d;

    /* renamed from: e */
    public final /* synthetic */ C40165e79 f42679e;

    public X69(C40165e79 c40165e79, Executor executor) {
        this.f42679e = c40165e79;
        executor.getClass();
        this.f42678d = executor;
    }

    @Override // p000.Fb9
    /* renamed from: d */
    public final void mo61095d(Throwable th) {
        this.f42679e.f77984p = null;
        if (th instanceof ExecutionException) {
            this.f42679e.m9234x(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f42679e.cancel(false);
        } else {
            this.f42679e.m9234x(th);
        }
    }

    @Override // p000.Fb9
    /* renamed from: e */
    public final void mo61094e(T t) {
        this.f42679e.f77984p = null;
        mo77369h(t);
    }

    @Override // p000.Fb9
    /* renamed from: f */
    public final boolean mo61093f() {
        return this.f42679e.isDone();
    }

    /* renamed from: h */
    public abstract void mo77369h(T t);

    /* renamed from: i */
    public final void m77368i() {
        try {
            this.f42678d.execute(this);
        } catch (RejectedExecutionException e) {
            this.f42679e.m9234x(e);
        }
    }
}
