package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: SY0 */
/* loaded from: classes6.dex */
public class SY0 {

    /* renamed from: a */
    public final C42172hX0 f33861a;

    /* renamed from: b */
    public final Executor f33862b;

    /* renamed from: c */
    public final ScheduledExecutorService f33863c;

    /* renamed from: d */
    public volatile ScheduledFuture<?> f33864d;

    /* renamed from: e */
    public volatile long f33865e = -1;

    public SY0(C42172hX0 c42172hX0, @InterfaceC36673Vq2 Executor executor, @InterfaceC8305UW ScheduledExecutorService scheduledExecutorService) {
        this.f33861a = (C42172hX0) Preconditions.checkNotNull(c42172hX0);
        this.f33862b = executor;
        this.f33863c = scheduledExecutorService;
    }

    /* renamed from: e */
    public /* synthetic */ void m85301e(Exception exc) {
        m85298h();
    }

    /* renamed from: c */
    public void m85303c() {
        if (this.f33864d != null && !this.f33864d.isDone()) {
            this.f33864d.cancel(false);
        }
    }

    /* renamed from: d */
    public final long m85302d() {
        if (this.f33865e == -1) {
            return 30L;
        }
        if (this.f33865e * 2 >= 960) {
            return 960L;
        }
        return this.f33865e * 2;
    }

    /* renamed from: f */
    public final void m85300f() {
        this.f33861a.m36239k().addOnFailureListener(this.f33862b, new OnFailureListener() { // from class: RY0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                SY0.this.m85301e(exc);
            }
        });
    }

    /* renamed from: g */
    public void m85299g(long j) {
        m85303c();
        this.f33865e = -1L;
        this.f33864d = this.f33863c.schedule(new QY0(this), Math.max(0L, j), TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    public final void m85298h() {
        m85303c();
        this.f33865e = m85302d();
        this.f33864d = this.f33863c.schedule(new QY0(this), this.f33865e, TimeUnit.SECONDS);
    }
}
