package p000;

import java.util.AbstractSet;
import java.util.Collection;
/* renamed from: cM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC39098cM7 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return C48602sM7.m14269b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
