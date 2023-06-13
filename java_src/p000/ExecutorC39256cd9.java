package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
/* renamed from: cd9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC39256cd9 implements Executor {

    /* renamed from: g */
    public static final Logger f60966g = Logger.getLogger(ExecutorC39256cd9.class.getName());

    /* renamed from: b */
    public final Executor f60967b;

    /* renamed from: c */
    public final Deque<Runnable> f60968c = new ArrayDeque();

    /* renamed from: f */
    public int f60971f = 1;

    /* renamed from: d */
    public long f60969d = 0;

    /* renamed from: e */
    public final Vc9 f60970e = new Vc9(this, null);

    public ExecutorC39256cd9(Executor executor) {
        executor.getClass();
        this.f60967b = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ long m61145a(ExecutorC39256cd9 executorC39256cd9) {
        long j = executorC39256cd9.f60969d;
        executorC39256cd9.f60969d = 1 + j;
        return j;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f60968c) {
            int i = this.f60971f;
            if (i != 4 && i != 3) {
                long j = this.f60969d;
                Oc9 oc9 = new Oc9(this, runnable);
                this.f60968c.add(oc9);
                this.f60971f = 2;
                try {
                    this.f60967b.execute(this.f60970e);
                    if (this.f60971f != 2) {
                        return;
                    }
                    synchronized (this.f60968c) {
                        if (this.f60969d == j && this.f60971f == 2) {
                            this.f60971f = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f60968c) {
                        int i2 = this.f60971f;
                        boolean z = false;
                        if ((i2 == 1 || i2 == 2) && this.f60968c.removeLastOccurrence(oc9)) {
                            z = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f60968c.add(runnable);
        }
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.f60967b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
