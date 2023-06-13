package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: hZ8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42198hZ8 implements Iterator {

    /* renamed from: b */
    public final Iterator f85489b;

    /* renamed from: c */
    public Collection f85490c;

    /* renamed from: d */
    public final /* synthetic */ I49 f85491d;

    public C42198hZ8(I49 i49) {
        this.f85491d = i49;
        this.f85489b = i49.f14460e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f85489b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f85489b.next();
        this.f85490c = (Collection) entry.getValue();
        I49 i49 = this.f85491d;
        Object key = entry.getKey();
        return new C40617et7(key, i49.f14461f.mo16017e(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.f85490c != null) {
            z = true;
        } else {
            z = false;
        }
        C41211ft8.m40585e(z, "no calls to next() since the last call to remove()");
        this.f85489b.remove();
        Jt9.m99585k(this.f85491d.f14461f, this.f85490c.size());
        this.f85490c.clear();
        this.f85490c = null;
    }
}
