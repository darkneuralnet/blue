package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
@KeepForSdk
/* renamed from: AZ5 */
/* loaded from: classes6.dex */
public class AZ5 {

    /* renamed from: b */
    public boolean f803b;

    /* renamed from: a */
    public final Object f802a = new Object();

    /* renamed from: c */
    public final Queue f804c = new ArrayDeque();

    /* renamed from: d */
    public final AtomicReference f805d = new AtomicReference();

    @KeepForSdk
    /* renamed from: a */
    public void m115549a(Executor executor, Runnable runnable) {
        synchronized (this.f802a) {
            if (this.f803b) {
                this.f804c.add(new Xt9(executor, runnable, null));
                return;
            }
            this.f803b = true;
            m115545e(executor, runnable);
        }
    }

    /* renamed from: d */
    public final void m115546d() {
        synchronized (this.f802a) {
            if (this.f804c.isEmpty()) {
                this.f803b = false;
                return;
            }
            Xt9 xt9 = (Xt9) this.f804c.remove();
            m115545e(xt9.f44162a, xt9.f44163b);
        }
    }

    /* renamed from: e */
    public final void m115545e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: Pq9
                @Override // java.lang.Runnable
                public final void run() {
                    AZ5 az5 = AZ5.this;
                    Runnable runnable2 = runnable;
                    C53100zw9 c53100zw9 = new C53100zw9(az5, null);
                    try {
                        runnable2.run();
                        c53100zw9.close();
                    } catch (Throwable th) {
                        try {
                            c53100zw9.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            m115546d();
        }
    }
}
