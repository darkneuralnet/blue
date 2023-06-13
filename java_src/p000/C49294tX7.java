package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: tX7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49294tX7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ NZ7 f110670b;

    public C49294tX7(NZ7 nz7) {
        this.f110670b = nz7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f110670b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f110670b.m93754b((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C40400eX7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C52869zZ7 m93754b;
        if (!(obj instanceof Map.Entry) || (m93754b = this.f110670b.m93754b((Map.Entry) obj)) == null) {
            return false;
        }
        this.f110670b.m93751e(m93754b, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f110670b.f24797d;
    }
}
