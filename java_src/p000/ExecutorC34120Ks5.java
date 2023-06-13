package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
/* renamed from: Ks5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC34120Ks5 implements Executor {

    /* renamed from: g */
    public static final Logger f20294g = Logger.getLogger(ExecutorC34120Ks5.class.getName());

    /* renamed from: b */
    public final Executor f20295b;

    /* renamed from: c */
    public final Deque<Runnable> f20296c = new ArrayDeque();

    /* renamed from: d */
    public EnumC4610c f20297d = EnumC4610c.IDLE;

    /* renamed from: e */
    public long f20298e = 0;

    /* renamed from: f */
    public final RunnableC4609b f20299f = new RunnableC4609b(this, null);

    /* renamed from: Ks5$a */
    /* loaded from: classes6.dex */
    public class RunnableC4608a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f20300b;

        public RunnableC4608a(Runnable runnable) {
            this.f20300b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20300b.run();
        }

        public String toString() {
            return this.f20300b.toString();
        }
    }

    /* renamed from: Ks5$b */
    /* loaded from: classes6.dex */
    public final class RunnableC4609b implements Runnable {

        /* renamed from: b */
        public Runnable f20302b;

        public RunnableC4609b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
            r8.f20302b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
            p000.ExecutorC34120Ks5.f20294g.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f20302b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m98207a() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    synchronized (ExecutorC34120Ks5.this.f20296c) {
                        if (!z) {
                            EnumC4610c enumC4610c = ExecutorC34120Ks5.this.f20297d;
                            EnumC4610c enumC4610c2 = EnumC4610c.RUNNING;
                            if (enumC4610c != enumC4610c2) {
                                ExecutorC34120Ks5.m98209d(ExecutorC34120Ks5.this);
                                ExecutorC34120Ks5.this.f20297d = enumC4610c2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) ExecutorC34120Ks5.this.f20296c.poll();
                        this.f20302b = runnable;
                        if (runnable == null) {
                            ExecutorC34120Ks5.this.f20297d = EnumC4610c.IDLE;
                        }
                    }
                    if (z2) {
                        return;
                    }
                    return;
                    this.f20302b = null;
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
                m98207a();
            } catch (Error e) {
                synchronized (ExecutorC34120Ks5.this.f20296c) {
                    ExecutorC34120Ks5.this.f20297d = EnumC4610c.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f20302b;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC34120Ks5.this.f20297d + "}";
        }

        public /* synthetic */ RunnableC4609b(ExecutorC34120Ks5 executorC34120Ks5, RunnableC4608a runnableC4608a) {
            this();
        }
    }

    /* renamed from: Ks5$c */
    /* loaded from: classes6.dex */
    public enum EnumC4610c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC34120Ks5(Executor executor) {
        this.f20295b = (Executor) Preconditions.checkNotNull(executor);
    }

    /* renamed from: d */
    public static /* synthetic */ long m98209d(ExecutorC34120Ks5 executorC34120Ks5) {
        long j = executorC34120Ks5.f20298e;
        executorC34120Ks5.f20298e = 1 + j;
        return j;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        EnumC4610c enumC4610c;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f20296c) {
            EnumC4610c enumC4610c2 = this.f20297d;
            if (enumC4610c2 != EnumC4610c.RUNNING && enumC4610c2 != (enumC4610c = EnumC4610c.QUEUED)) {
                long j = this.f20298e;
                RunnableC4608a runnableC4608a = new RunnableC4608a(runnable);
                this.f20296c.add(runnableC4608a);
                EnumC4610c enumC4610c3 = EnumC4610c.QUEUING;
                this.f20297d = enumC4610c3;
                boolean z = true;
                try {
                    this.f20295b.execute(this.f20299f);
                    if (this.f20297d == enumC4610c3) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    synchronized (this.f20296c) {
                        if (this.f20298e == j && this.f20297d == enumC4610c3) {
                            this.f20297d = enumC4610c;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f20296c) {
                        EnumC4610c enumC4610c4 = this.f20297d;
                        if ((enumC4610c4 != EnumC4610c.IDLE && enumC4610c4 != EnumC4610c.QUEUING) || !this.f20296c.removeLastOccurrence(runnableC4608a)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f20296c.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f20295b + "}";
    }
}
