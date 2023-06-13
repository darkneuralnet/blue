package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: E59 */
/* loaded from: classes6.dex */
public final class E59 extends AbstractC50817w59 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater<U59<?>, Set<Throwable>> f6960a;

    /* renamed from: b */
    public final AtomicIntegerFieldUpdater<U59<?>> f6961b;

    public E59(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f6960a = atomicReferenceFieldUpdater;
        this.f6961b = atomicIntegerFieldUpdater;
    }

    @Override // p000.AbstractC50817w59
    /* renamed from: a */
    public final int mo7447a(U59<?> u59) {
        return this.f6961b.decrementAndGet(u59);
    }

    @Override // p000.AbstractC50817w59
    /* renamed from: b */
    public final void mo7446b(U59<?> u59, Set<Throwable> set, Set<Throwable> set2) {
        C22859i1.m35391a(this.f6960a, u59, null, set2);
    }
}
