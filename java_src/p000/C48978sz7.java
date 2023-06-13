package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: sz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48978sz7 implements Iterator {

    /* renamed from: b */
    public Map.Entry f109644b;

    /* renamed from: c */
    public final /* synthetic */ Iterator f109645c;

    /* renamed from: d */
    public final /* synthetic */ C43158jA7 f109646d;

    public C48978sz7(C43158jA7 c43158jA7, Iterator it) {
        this.f109646d = c43158jA7;
        this.f109645c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f109645c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f109645c.next();
        this.f109644b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f109644b != null) {
            z = true;
        } else {
            z = false;
        }
        C34833Nt7.m93210d(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f109644b.getValue();
        this.f109645c.remove();
        AbstractC42619iG7 abstractC42619iG7 = this.f109646d.f92263c;
        i = abstractC42619iG7.f87049e;
        abstractC42619iG7.f87049e = i - collection.size();
        collection.clear();
        this.f109644b = null;
    }
}
