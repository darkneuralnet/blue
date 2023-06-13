package p000;

import java.util.AbstractSet;
import java.util.Collection;
/* renamed from: nX7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC45737nX7 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return CX7.m112152b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
