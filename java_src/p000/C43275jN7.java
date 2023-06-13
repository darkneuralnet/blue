package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: jN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43275jN7 extends AbstractCollection {

    /* renamed from: b */
    public final /* synthetic */ C52761zN7 f92623b;

    public C43275jN7(C52761zN7 c52761zN7) {
        this.f92623b = c52761zN7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f92623b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C52761zN7 c52761zN7 = this.f92623b;
        Map m1449j = c52761zN7.m1449j();
        if (m1449j != null) {
            return m1449j.values().iterator();
        }
        return new C47408qL7(c52761zN7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f92623b.size();
    }
}
