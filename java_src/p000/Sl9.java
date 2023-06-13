package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: Sl9 */
/* loaded from: classes5.dex */
public final class Sl9 extends AbstractList implements RandomAccess, Id9 {

    /* renamed from: b */
    public final Id9 f34238b;

    public Sl9(Id9 id9) {
        this.f34238b = id9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((Yc9) this.f34238b).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C44097kl9(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C40539el9(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34238b.size();
    }

    @Override // p000.Id9
    public final Id9 zze() {
        return this;
    }

    @Override // p000.Id9
    public final Object zzf(int i) {
        return this.f34238b.zzf(i);
    }

    @Override // p000.Id9
    public final List zzh() {
        return this.f34238b.zzh();
    }
}
