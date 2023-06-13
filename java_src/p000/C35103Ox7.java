package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Ox7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35103Ox7 implements Iterator {

    /* renamed from: b */
    public final Iterator f27611b;

    /* renamed from: c */
    public Collection f27612c;

    /* renamed from: d */
    public final /* synthetic */ C32772Ey7 f27613d;

    public C35103Ox7(C32772Ey7 c32772Ey7) {
        this.f27613d = c32772Ey7;
        this.f27611b = c32772Ey7.f8388e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27611b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f27611b.next();
        this.f27612c = (Collection) entry.getValue();
        C32772Ey7 c32772Ey7 = this.f27613d;
        Object key = entry.getKey();
        return new C43886kP7(key, c32772Ey7.f8389f.mo28115g(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f27612c != null) {
            z = true;
        } else {
            z = false;
        }
        C34833Nt7.m93210d(z, "no calls to next() since the last call to remove()");
        this.f27611b.remove();
        AbstractC42619iG7 abstractC42619iG7 = this.f27613d.f8389f;
        i = abstractC42619iG7.f87049e;
        abstractC42619iG7.f87049e = i - this.f27612c.size();
        this.f27612c.clear();
        this.f27612c = null;
    }
}
