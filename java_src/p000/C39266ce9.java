package p000;

import java.util.concurrent.Callable;
/* renamed from: ce9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39266ce9 extends Fb9 {

    /* renamed from: d */
    public final Callable f61016d;

    /* renamed from: e */
    public final /* synthetic */ RunnableFutureC44027ke9 f61017e;

    public C39266ce9(RunnableFutureC44027ke9 runnableFutureC44027ke9, Callable callable) {
        this.f61017e = runnableFutureC44027ke9;
        callable.getClass();
        this.f61016d = callable;
    }

    @Override // p000.Fb9
    /* renamed from: a */
    public final Object mo61097a() throws Exception {
        return this.f61016d.call();
    }

    @Override // p000.Fb9
    /* renamed from: b */
    public final String mo61096b() {
        return this.f61016d.toString();
    }

    @Override // p000.Fb9
    /* renamed from: d */
    public final void mo61095d(Throwable th) {
        this.f61017e.m9234x(th);
    }

    @Override // p000.Fb9
    /* renamed from: e */
    public final void mo61094e(Object obj) {
        this.f61017e.mo9235w(obj);
    }

    @Override // p000.Fb9
    /* renamed from: f */
    public final boolean mo61093f() {
        return this.f61017e.isDone();
    }
}
