package io.reactivex.internal.schedulers;

import io.reactivex.AbstractC23437E;
import java.util.concurrent.ThreadFactory;
/* renamed from: io.reactivex.internal.schedulers.g */
/* loaded from: classes8.dex */
public final class C24428g extends AbstractC23437E {

    /* renamed from: e */
    public static final ThreadFactoryC24431j f90979e = new ThreadFactoryC24431j("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: d */
    public final ThreadFactory f90980d;

    public C24428g() {
        this(f90979e);
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        return new C24429h(this.f90980d);
    }

    public C24428g(ThreadFactory threadFactory) {
        this.f90980d = threadFactory;
    }
}
