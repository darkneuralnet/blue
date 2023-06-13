package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: uE7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49716uE7 extends AbstractCollection {

    /* renamed from: b */
    public final /* synthetic */ C43796kF7 f112005b;

    public C49716uE7(C43796kF7 c43796kF7) {
        this.f112005b = c43796kF7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f112005b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C43796kF7 c43796kF7 = this.f112005b;
        Map m29126j = c43796kF7.m29126j();
        if (m29126j != null) {
            return m29126j.values().iterator();
        }
        return new C51339wy7(c43796kF7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f112005b.size();
    }
}
