package p000;

import java.util.AbstractSet;
import java.util.Collection;
/* renamed from: fT7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40957fT7 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return C49851uT7.m10232b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
