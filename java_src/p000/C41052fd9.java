package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: fd9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41052fd9 extends C43203jF7 {

    /* renamed from: c */
    public final /* synthetic */ Jt9 f80385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41052fd9(Jt9 jt9, Map map) {
        super(map);
        this.f80385c = jt9;
    }

    @Override // p000.C43203jF7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C37695Zz7.m72141a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f92402b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f92402b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f92402b.keySet().hashCode();
    }

    @Override // p000.C43203jF7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C40185e99(this, this.f92402b.entrySet().iterator());
    }

    @Override // p000.C43203jF7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f92402b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            Jt9.m99585k(this.f80385c, size);
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
