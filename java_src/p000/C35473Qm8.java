package p000;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* renamed from: Qm8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35473Qm8 extends Thread {

    /* renamed from: b */
    public final Object f30927b;

    /* renamed from: c */
    public final BlockingQueue f30928c;

    /* renamed from: d */
    public boolean f30929d = false;

    /* renamed from: e */
    public final /* synthetic */ C39965dn8 f30930e;

    public C35473Qm8(C39965dn8 c39965dn8, String str, BlockingQueue blockingQueue) {
        this.f30930e = c39965dn8;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f30927b = new Object();
        this.f30928c = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m87945a() {
        synchronized (this.f30927b) {
            this.f30927b.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m87944b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C35473Qm8 c35473Qm8;
        C35473Qm8 c35473Qm82;
        obj = this.f30930e.f77232i;
        synchronized (obj) {
            if (!this.f30929d) {
                semaphore = this.f30930e.f77233j;
                semaphore.release();
                obj2 = this.f30930e.f77232i;
                obj2.notifyAll();
                C39965dn8 c39965dn8 = this.f30930e;
                c35473Qm8 = c39965dn8.f77226c;
                if (this == c35473Qm8) {
                    c39965dn8.f77226c = null;
                } else {
                    c35473Qm82 = c39965dn8.f77227d;
                    if (this == c35473Qm82) {
                        c39965dn8.f77227d = null;
                    } else {
                        c39965dn8.f100966a.mo22258a().m106893o().m42708a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f30929d = true;
            }
        }
    }

    /* renamed from: c */
    public final void m87943c(InterruptedException interruptedException) {
        this.f30930e.f100966a.mo22258a().m106888t().m42707b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i;
        Object obj;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.f30930e.f77233j;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                m87943c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C35230Pl8 c35230Pl8 = (C35230Pl8) this.f30928c.poll();
                if (c35230Pl8 != null) {
                    if (true != c35230Pl8.f29023c) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    c35230Pl8.run();
                } else {
                    synchronized (this.f30927b) {
                        if (this.f30928c.peek() == null) {
                            boolean unused = this.f30930e.f77234k;
                            try {
                                this.f30927b.wait(30000L);
                            } catch (InterruptedException e2) {
                                m87943c(e2);
                            }
                        }
                    }
                    obj = this.f30930e.f77232i;
                    synchronized (obj) {
                        if (this.f30928c.peek() == null) {
                            m87944b();
                            return;
                        }
                    }
                }
            }
        } finally {
            m87944b();
        }
    }
}
