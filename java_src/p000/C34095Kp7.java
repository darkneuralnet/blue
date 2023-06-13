package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* renamed from: Kp7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C34095Kp7 implements Iterator {

    /* renamed from: b */
    public final Iterator f20264b;

    /* renamed from: c */
    public final Collection f20265c;

    /* renamed from: d */
    public final /* synthetic */ C32700Eq7 f20266d;

    public C34095Kp7(C32700Eq7 c32700Eq7, Iterator it) {
        this.f20266d = c32700Eq7;
        this.f20265c = c32700Eq7.f8186c;
        this.f20264b = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m98260a() {
        this.f20266d.zzb();
        if (this.f20266d.f8186c == this.f20265c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m98260a();
        return this.f20264b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m98260a();
        return this.f20264b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20264b.remove();
        AbstractC38821bt7.m62192g(this.f20266d.f8189f);
        this.f20266d.m108327b();
    }

    public C34095Kp7(C32700Eq7 c32700Eq7) {
        Iterator it;
        this.f20266d = c32700Eq7;
        Collection collection = c32700Eq7.f8186c;
        this.f20265c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f20264b = it;
    }
}
