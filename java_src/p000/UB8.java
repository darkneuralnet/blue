package p000;

import java.io.Closeable;
/* renamed from: UB8 */
/* loaded from: classes6.dex */
public final class UB8 implements Runnable, Closeable {

    /* renamed from: b */
    public PC8 f36941b;

    /* renamed from: c */
    public PC8 f36942c;

    /* renamed from: d */
    public final boolean f36943d = Q48.m88951b();

    /* renamed from: e */
    public boolean f36944e;

    /* renamed from: f */
    public boolean f36945f;

    public UB8(PC8 pc8) {
        this.f36941b = pc8;
        this.f36942c = pc8;
    }

    /* renamed from: a */
    public final <V, T extends Mb9<V>> T m81881a(T t) {
        if (!this.f36944e) {
            if (!this.f36945f) {
                this.f36945f = true;
                t.mo9243o(this, Hc9.m103649b());
                return t;
            }
            throw new IllegalStateException("Signal is already attached to future");
        }
        throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    /* renamed from: b */
    public final void m81880b() {
        this.f36944e = true;
        if (this.f36943d && !this.f36945f) {
            Q48.m88951b();
        }
        this.f36941b = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PC8 pc8 = this.f36942c;
        this.f36942c = null;
        try {
            if (!this.f36945f) {
                if (!this.f36944e) {
                    m81880b();
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
        } finally {
            FE8.m107397f(pc8);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f36944e && this.f36945f) {
            m81880b();
            return;
        }
        Q48.m88952a().post(IB8.f14648b);
    }
}
