package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Qm7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35472Qm7 implements Iterator {

    /* renamed from: b */
    public Map.Entry f30924b;

    /* renamed from: c */
    public final /* synthetic */ Iterator f30925c;

    /* renamed from: d */
    public final /* synthetic */ C38178ao7 f30926d;

    public C35472Qm7(C38178ao7 c38178ao7, Iterator it) {
        this.f30926d = c38178ao7;
        this.f30925c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30925c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f30925c.next();
        this.f30924b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.f30924b != null) {
            z = true;
        } else {
            z = false;
        }
        C50566vg7.m8260d(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f30924b.getValue();
        this.f30925c.remove();
        AbstractC38821bt7.m62189k(this.f30926d.f56336c, collection.size());
        collection.clear();
        this.f30924b = null;
    }
}
