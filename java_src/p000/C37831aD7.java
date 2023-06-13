package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: aD7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37831aD7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C50910wF7 f50093b;

    public C37831aD7(C50910wF7 c50910wF7) {
        this.f50093b = c50910wF7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f50093b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f50093b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C50910wF7 c50910wF7 = this.f50093b;
        Map m7070n = c50910wF7.m7070n();
        if (m7070n != null) {
            return m7070n.keySet().iterator();
        }
        return new C35571Qx7(c50910wF7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m7058z;
        Object obj2;
        Map m7070n = this.f50093b.m7070n();
        if (m7070n != null) {
            return m7070n.keySet().remove(obj);
        }
        m7058z = this.f50093b.m7058z(obj);
        obj2 = C50910wF7.f115733k;
        if (m7058z == obj2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f50093b.size();
    }
}
