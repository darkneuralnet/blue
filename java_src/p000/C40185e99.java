package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: e99  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40185e99 implements Iterator {

    /* renamed from: b */
    public Map.Entry f78034b;

    /* renamed from: c */
    public final /* synthetic */ Iterator f78035c;

    /* renamed from: d */
    public final /* synthetic */ C41052fd9 f78036d;

    public C40185e99(C41052fd9 c41052fd9, Iterator it) {
        this.f78036d = c41052fd9;
        this.f78035c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f78035c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f78035c.next();
        this.f78034b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.f78034b != null) {
            z = true;
        } else {
            z = false;
        }
        C41211ft8.m40585e(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f78034b.getValue();
        this.f78035c.remove();
        Jt9.m99585k(this.f78036d.f80385c, collection.size());
        collection.clear();
        this.f78034b = null;
    }
}
