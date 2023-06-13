package p000;

import java.util.AbstractSet;
import java.util.Iterator;
/* renamed from: hw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42428hw9 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C44207kw9 f86222b;

    public C42428hw9(C44207kw9 c44207kw9) {
        this.f86222b = c44207kw9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f86222b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f86222b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C41835gw9(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f86222b.m28106d(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f86222b.f95255d;
    }
}
