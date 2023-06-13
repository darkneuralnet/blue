package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: Ls5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC34354Ls5 implements Executor {

    /* renamed from: c */
    public final Executor f22163c;

    /* renamed from: b */
    public final Deque<Runnable> f22162b = new ArrayDeque();

    /* renamed from: d */
    public final RunnableC5105b f22164d = new RunnableC5105b();

    /* renamed from: e */
    public EnumC5106c f22165e = EnumC5106c.IDLE;

    /* renamed from: f */
    public long f22166f = 0;

    /* renamed from: Ls5$a */
    /* loaded from: classes.dex */
    public class RunnableC5104a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f22167b;

        public RunnableC5104a(Runnable runnable) {
            this.f22167b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22167b.run();
        }
    }

    /* renamed from: Ls5$b */
    /* loaded from: classes.dex */
    public final class RunnableC5105b implements Runnable {
        public RunnableC5105b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
            p000.C33928Jx2.m99530d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m96258a() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    synchronized (ExecutorC34354Ls5.this.f22162b) {
                        if (!z) {
                            ExecutorC34354Ls5 executorC34354Ls5 = ExecutorC34354Ls5.this;
                            EnumC5106c enumC5106c = executorC34354Ls5.f22165e;
                            EnumC5106c enumC5106c2 = EnumC5106c.RUNNING;
                            if (enumC5106c != enumC5106c2) {
                                executorC34354Ls5.f22166f++;
                                executorC34354Ls5.f22165e = enumC5106c2;
                                z = true;
                            }
                        }
                        Runnable poll = ExecutorC34354Ls5.this.f22162b.poll();
                        if (poll == null) {
                            ExecutorC34354Ls5.this.f22165e = EnumC5106c.IDLE;
                        }
                    }
                    if (z2) {
                        return;
                    }
                    return;
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m96258a();
            } catch (Error e) {
                synchronized (ExecutorC34354Ls5.this.f22162b) {
                    ExecutorC34354Ls5.this.f22165e = EnumC5106c.IDLE;
                    throw e;
                }
            }
        }
    }

    /* renamed from: Ls5$c */
    /* loaded from: classes.dex */
    public enum EnumC5106c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC34354Ls5(Executor executor) {
        this.f22163c = (Executor) HZ3.m103731g(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        EnumC5106c enumC5106c;
        HZ3.m103731g(runnable);
        synchronized (this.f22162b) {
            EnumC5106c enumC5106c2 = this.f22165e;
            if (enumC5106c2 != EnumC5106c.RUNNING && enumC5106c2 != (enumC5106c = EnumC5106c.QUEUED)) {
                long j = this.f22166f;
                RunnableC5104a runnableC5104a = new RunnableC5104a(runnable);
                this.f22162b.add(runnableC5104a);
                EnumC5106c enumC5106c3 = EnumC5106c.QUEUING;
                this.f22165e = enumC5106c3;
                boolean z = true;
                try {
                    this.f22163c.execute(this.f22164d);
                    if (this.f22165e == enumC5106c3) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    synchronized (this.f22162b) {
                        if (this.f22166f == j && this.f22165e == enumC5106c3) {
                            this.f22165e = enumC5106c;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f22162b) {
                        EnumC5106c enumC5106c4 = this.f22165e;
                        if ((enumC5106c4 != EnumC5106c.IDLE && enumC5106c4 != EnumC5106c.QUEUING) || !this.f22162b.removeLastOccurrence(runnableC5104a)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f22162b.add(runnable);
        }
    }
}
