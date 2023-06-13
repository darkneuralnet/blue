package p000;

import java.util.AbstractSet;
import java.util.Iterator;
/* renamed from: WY7 */
/* loaded from: classes5.dex */
public final class WY7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ NZ7 f41292b;

    public WY7(NZ7 nz7) {
        this.f41292b = nz7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41292b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41292b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new IX7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f41292b.m93752d(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41292b.f24797d;
    }
}
