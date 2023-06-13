package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* renamed from: YC7 */
/* loaded from: classes5.dex */
public class YC7 implements Iterator {

    /* renamed from: b */
    public final Iterator f44837b;

    /* renamed from: c */
    public final Collection f44838c;

    /* renamed from: d */
    public final /* synthetic */ ND7 f44839d;

    public YC7(ND7 nd7, Iterator it) {
        this.f44839d = nd7;
        this.f44838c = nd7.f24308c;
        this.f44837b = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m75417a() {
        this.f44839d.zzb();
        if (this.f44839d.f24308c == this.f44838c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m75417a();
        return this.f44837b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m75417a();
        return this.f44837b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.f44837b.remove();
        AbstractC42619iG7 abstractC42619iG7 = this.f44839d.f24311f;
        i = abstractC42619iG7.f87049e;
        abstractC42619iG7.f87049e = i - 1;
        this.f44839d.m94170b();
    }

    public YC7(ND7 nd7) {
        Iterator it;
        this.f44839d = nd7;
        Collection collection = nd7.f24308c;
        this.f44838c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f44837b = it;
    }
}
