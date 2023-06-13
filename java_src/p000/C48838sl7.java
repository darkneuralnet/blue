package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: sl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48838sl7 implements Iterator {

    /* renamed from: b */
    public final Iterator f109219b;

    /* renamed from: c */
    public Collection f109220c;

    /* renamed from: d */
    public final /* synthetic */ C36399Ul7 f109221d;

    public C48838sl7(C36399Ul7 c36399Ul7) {
        this.f109221d = c36399Ul7;
        this.f109219b = c36399Ul7.f37957e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f109219b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f109219b.next();
        this.f109220c = (Collection) entry.getValue();
        C36399Ul7 c36399Ul7 = this.f109221d;
        Object key = entry.getKey();
        return new C47399qK7(key, c36399Ul7.f37958f.mo466e(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.f109220c != null) {
            z = true;
        } else {
            z = false;
        }
        C50566vg7.m8260d(z, "no calls to next() since the last call to remove()");
        this.f109219b.remove();
        AbstractC38821bt7.m62189k(this.f109221d.f37958f, this.f109220c.size());
        this.f109220c.clear();
        this.f109220c = null;
    }
}
