package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
@Deprecated
/* renamed from: Iu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33673Iu8 extends AbstractList implements RandomAccess, InterfaceC42830id8 {

    /* renamed from: b */
    public final InterfaceC42830id8 f16452b;

    public C33673Iu8(InterfaceC42830id8 interfaceC42830id8) {
        this.f16452b = interfaceC42830id8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C37489Zc8) this.f16452b).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C50115uu8(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C43000iu8(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16452b.size();
    }

    @Override // p000.InterfaceC42830id8
    public final InterfaceC42830id8 zze() {
        return this;
    }

    @Override // p000.InterfaceC42830id8
    public final Object zzf(int i) {
        return this.f16452b.zzf(i);
    }

    @Override // p000.InterfaceC42830id8
    public final List zzh() {
        return this.f16452b.zzh();
    }
}
