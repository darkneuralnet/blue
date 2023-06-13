package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: df8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39886df8 extends AbstractList<String> implements WW7, RandomAccess {

    /* renamed from: b */
    public final WW7 f77015b;

    public C39886df8(WW7 ww7) {
        this.f77015b = ww7;
    }

    @Override // p000.WW7
    /* renamed from: N2 */
    public final List<?> mo43925N2() {
        return this.f77015b.mo43925N2();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f77015b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C33070Gf8(this);
    }

    @Override // p000.WW7
    /* renamed from: l */
    public final Object mo43923l(int i) {
        return this.f77015b.mo43923l(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C48779sf8(this, i);
    }

    @Override // p000.WW7
    /* renamed from: s3 */
    public final WW7 mo43922s3() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f77015b.size();
    }
}
