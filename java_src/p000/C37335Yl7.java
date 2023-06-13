package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Yl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37335Yl7 implements Iterator {

    /* renamed from: b */
    public Map.Entry f46543b;

    /* renamed from: c */
    public final /* synthetic */ Iterator f46544c;

    /* renamed from: d */
    public final /* synthetic */ C36408Um7 f46545d;

    public C37335Yl7(C36408Um7 c36408Um7, Iterator it) {
        this.f46545d = c36408Um7;
        this.f46544c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46544c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f46544c.next();
        this.f46543b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f46543b != null) {
            z = true;
        } else {
            z = false;
        }
        C31899Bf7.m113726d(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f46543b.getValue();
        this.f46544c.remove();
        AbstractC37389Yr7 abstractC37389Yr7 = this.f46545d.f37981c;
        i = abstractC37389Yr7.f47501e;
        abstractC37389Yr7.f47501e = i - collection.size();
        collection.clear();
        this.f46543b = null;
    }
}
