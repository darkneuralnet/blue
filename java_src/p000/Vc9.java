package p000;

import java.util.Deque;
/* renamed from: Vc9 */
/* loaded from: classes6.dex */
public final class Vc9 implements Runnable {

    /* renamed from: b */
    public Runnable f39350b;

    /* renamed from: c */
    public final /* synthetic */ ExecutorC39256cd9 f39351c;

    public /* synthetic */ Vc9(ExecutorC39256cd9 executorC39256cd9, Oc9 oc9) {
        this.f39351c = executorC39256cd9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        r11.f39350b.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        r4 = p000.ExecutorC39256cd9.f60966g;
        r5 = java.util.logging.Level.SEVERE;
        r3 = java.lang.String.valueOf(r11.f39350b);
        r10 = new java.lang.StringBuilder(r3.length() + 35);
        r10.append("Exception while executing runnable ");
        r10.append(r3);
        r4.logp(r5, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", r10.toString(), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        r11.f39350b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        r11.f39350b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Deque deque;
        Deque deque2;
        int i;
        Deque deque3;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                deque2 = this.f39351c.f60968c;
                synchronized (deque2) {
                    if (!z) {
                        i = this.f39351c.f60971f;
                        if (i != 4) {
                            ExecutorC39256cd9.m61145a(this.f39351c);
                            this.f39351c.f60971f = 4;
                        }
                    }
                    deque3 = this.f39351c.f60968c;
                    Runnable runnable = (Runnable) deque3.poll();
                    this.f39350b = runnable;
                    if (runnable == null) {
                        this.f39351c.f60971f = 1;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
                z = true;
            } catch (Error e) {
                deque = this.f39351c.f60968c;
                synchronized (deque) {
                    this.f39351c.f60971f = 1;
                    throw e;
                }
            }
        }
    }

    public final String toString() {
        int i;
        String str;
        Runnable runnable = this.f39350b;
        if (runnable != null) {
            String valueOf = String.valueOf(runnable);
            StringBuilder sb = new StringBuilder(valueOf.length() + 34);
            sb.append("SequentialExecutorWorker{running=");
            sb.append(valueOf);
            sb.append("}");
            return sb.toString();
        }
        i = this.f39351c.f60971f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "RUNNING";
                    }
                } else {
                    str = "QUEUED";
                }
            } else {
                str = "QUEUING";
            }
        } else {
            str = "IDLE";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append("SequentialExecutorWorker{state=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
