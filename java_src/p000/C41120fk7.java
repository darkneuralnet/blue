package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: fk7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41120fk7 implements Iterator {

    /* renamed from: b */
    public final Iterator f80552b;

    /* renamed from: c */
    public Collection f80553c;

    /* renamed from: d */
    public final /* synthetic */ C39334cl7 f80554d;

    public C41120fk7(C39334cl7 c39334cl7) {
        this.f80554d = c39334cl7;
        this.f80552b = c39334cl7.f61206e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f80552b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f80552b.next();
        this.f80553c = (Collection) entry.getValue();
        C39334cl7 c39334cl7 = this.f80554d;
        Object key = entry.getKey();
        return new C41469gK7(key, c39334cl7.f61207f.mo17203g(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f80553c != null) {
            z = true;
        } else {
            z = false;
        }
        C31899Bf7.m113726d(z, "no calls to next() since the last call to remove()");
        this.f80552b.remove();
        AbstractC37389Yr7 abstractC37389Yr7 = this.f80554d.f61207f;
        i = abstractC37389Yr7.f47501e;
        abstractC37389Yr7.f47501e = i - this.f80553c.size();
        this.f80553c.clear();
        this.f80553c = null;
    }
}
