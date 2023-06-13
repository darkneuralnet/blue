package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: fw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41242fw9 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C44207kw9 f81188b;

    public C41242fw9(C44207kw9 c44207kw9) {
        this.f81188b = c44207kw9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f81188b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f81188b.m28108b((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C40649ew9(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C43614jw9 m28108b;
        if (!(obj instanceof Map.Entry) || (m28108b = this.f81188b.m28108b((Map.Entry) obj)) == null) {
            return false;
        }
        this.f81188b.m28105e(m28108b, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f81188b.f95255d;
    }
}
