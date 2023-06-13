package p000;

import java.util.Iterator;
/* renamed from: v96  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC50261v96<F, T> implements Iterator<T> {

    /* renamed from: b */
    public final Iterator<? extends F> f113634b;

    public AbstractC50261v96(Iterator<? extends F> it) {
        this.f113634b = (Iterator) EZ3.m108801n(it);
    }

    /* renamed from: a */
    public abstract T mo574a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f113634b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo574a(this.f113634b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f113634b.remove();
    }
}
