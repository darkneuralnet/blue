package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: g39  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41311g39 extends AbstractC38922c39 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater<C45462n39, Thread> f81493a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater<C45462n39, C45462n39> f81494b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater<AbstractC50204v39, C45462n39> f81495c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater<AbstractC50204v39, C40718f39> f81496d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater<AbstractC50204v39, Object> f81497e;

    public C41311g39(AtomicReferenceFieldUpdater<C45462n39, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C45462n39, C45462n39> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC50204v39, C45462n39> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC50204v39, C40718f39> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC50204v39, Object> atomicReferenceFieldUpdater5) {
        super(null);
        this.f81493a = atomicReferenceFieldUpdater;
        this.f81494b = atomicReferenceFieldUpdater2;
        this.f81495c = atomicReferenceFieldUpdater3;
        this.f81496d = atomicReferenceFieldUpdater4;
        this.f81497e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: a */
    public final void mo26406a(C45462n39 c45462n39, C45462n39 c45462n392) {
        this.f81494b.lazySet(c45462n39, c45462n392);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: b */
    public final void mo26405b(C45462n39 c45462n39, Thread thread) {
        this.f81493a.lazySet(c45462n39, thread);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: c */
    public final boolean mo26404c(AbstractC50204v39<?> abstractC50204v39, C40718f39 c40718f39, C40718f39 c40718f392) {
        return C22859i1.m35391a(this.f81496d, abstractC50204v39, c40718f39, c40718f392);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: d */
    public final boolean mo26403d(AbstractC50204v39<?> abstractC50204v39, Object obj, Object obj2) {
        return C22859i1.m35391a(this.f81497e, abstractC50204v39, obj, obj2);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: e */
    public final boolean mo26402e(AbstractC50204v39<?> abstractC50204v39, C45462n39 c45462n39, C45462n39 c45462n392) {
        return C22859i1.m35391a(this.f81495c, abstractC50204v39, c45462n39, c45462n392);
    }
}
