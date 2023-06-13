package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: dn8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39965dn8 extends AbstractC32017Bs8 {

    /* renamed from: l */
    public static final AtomicLong f77225l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    public C35473Qm8 f77226c;

    /* renamed from: d */
    public C35473Qm8 f77227d;

    /* renamed from: e */
    public final PriorityBlockingQueue f77228e;

    /* renamed from: f */
    public final BlockingQueue f77229f;

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f77230g;

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f77231h;

    /* renamed from: i */
    public final Object f77232i;

    /* renamed from: j */
    public final Semaphore f77233j;

    /* renamed from: k */
    public volatile boolean f77234k;

    public C39965dn8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f77232i = new Object();
        this.f77233j = new Semaphore(2);
        this.f77228e = new PriorityBlockingQueue();
        this.f77229f = new LinkedBlockingQueue();
        this.f77230g = new C32188Cl8(this, "Thread death: Uncaught exception on worker thread");
        this.f77231h = new C32188Cl8(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: B */
    public final boolean m43709B() {
        return Thread.currentThread() == this.f77226c;
    }

    /* renamed from: D */
    public final void m43708D(C35230Pl8 c35230Pl8) {
        synchronized (this.f77232i) {
            this.f77228e.add(c35230Pl8);
            C35473Qm8 c35473Qm8 = this.f77226c;
            if (c35473Qm8 == null) {
                C35473Qm8 c35473Qm82 = new C35473Qm8(this, "Measurement Worker", this.f77228e);
                this.f77226c = c35473Qm82;
                c35473Qm82.setUncaughtExceptionHandler(this.f77230g);
                this.f77226c.start();
            } else {
                c35473Qm8.m87945a();
            }
        }
    }

    @Override // p000.C45945ns8
    /* renamed from: d */
    public final void mo22256d() {
        if (Thread.currentThread() == this.f77227d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override // p000.C45945ns8
    /* renamed from: e */
    public final void mo19953e() {
        if (Thread.currentThread() == this.f77226c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // p000.AbstractC32017Bs8
    /* renamed from: g */
    public final boolean mo43707g() {
        return false;
    }

    /* renamed from: o */
    public final Object m43703o(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f100966a.mo22257c().m43695w(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                C40448ec8 m106888t = this.f100966a.mo22258a().m106888t();
                m106888t.m42708a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f100966a.mo22258a().m106888t().m42708a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* renamed from: p */
    public final Future m43702p(Callable callable) throws IllegalStateException {
        m113419h();
        Preconditions.checkNotNull(callable);
        C35230Pl8 c35230Pl8 = new C35230Pl8(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f77226c) {
            if (!this.f77228e.isEmpty()) {
                this.f100966a.mo22258a().m106888t().m42708a("Callable skipped the worker queue.");
            }
            c35230Pl8.run();
        } else {
            m43708D(c35230Pl8);
        }
        return c35230Pl8;
    }

    /* renamed from: q */
    public final Future m43701q(Callable callable) throws IllegalStateException {
        m113419h();
        Preconditions.checkNotNull(callable);
        C35230Pl8 c35230Pl8 = new C35230Pl8(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f77226c) {
            c35230Pl8.run();
        } else {
            m43708D(c35230Pl8);
        }
        return c35230Pl8;
    }

    /* renamed from: v */
    public final void m43696v(Runnable runnable) throws IllegalStateException {
        m113419h();
        Preconditions.checkNotNull(runnable);
        C35230Pl8 c35230Pl8 = new C35230Pl8(this, runnable, false, "Task exception on network thread");
        synchronized (this.f77232i) {
            this.f77229f.add(c35230Pl8);
            C35473Qm8 c35473Qm8 = this.f77227d;
            if (c35473Qm8 == null) {
                C35473Qm8 c35473Qm82 = new C35473Qm8(this, "Measurement Network", this.f77229f);
                this.f77227d = c35473Qm82;
                c35473Qm82.setUncaughtExceptionHandler(this.f77231h);
                this.f77227d.start();
            } else {
                c35473Qm8.m87945a();
            }
        }
    }

    /* renamed from: w */
    public final void m43695w(Runnable runnable) throws IllegalStateException {
        m113419h();
        Preconditions.checkNotNull(runnable);
        m43708D(new C35230Pl8(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: x */
    public final void m43694x(Runnable runnable) throws IllegalStateException {
        m113419h();
        Preconditions.checkNotNull(runnable);
        m43708D(new C35230Pl8(this, runnable, true, "Task exception on worker thread"));
    }
}
