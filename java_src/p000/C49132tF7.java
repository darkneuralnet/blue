package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* renamed from: tF7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49132tF7 extends ND7 implements List {

    /* renamed from: g */
    public final /* synthetic */ AbstractC42619iG7 f110230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49132tF7(AbstractC42619iG7 abstractC42619iG7, Object obj, List list, ND7 nd7) {
        super(abstractC42619iG7, obj, list, nd7);
        this.f110230g = abstractC42619iG7;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.f24308c.isEmpty();
        ((List) this.f24308c).add(i, obj);
        AbstractC42619iG7 abstractC42619iG7 = this.f110230g;
        i2 = abstractC42619iG7.f87049e;
        abstractC42619iG7.f87049e = i2 + 1;
        if (isEmpty) {
            m94171a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f24308c).addAll(i, collection);
        if (addAll) {
            int size2 = this.f24308c.size();
            AbstractC42619iG7 abstractC42619iG7 = this.f110230g;
            i2 = abstractC42619iG7.f87049e;
            abstractC42619iG7.f87049e = i2 + (size2 - size);
            if (size == 0) {
                m94171a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f24308c).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f24308c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f24308c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new BE7(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.f24308c).remove(i);
        AbstractC42619iG7 abstractC42619iG7 = this.f110230g;
        i2 = abstractC42619iG7.f87049e;
        abstractC42619iG7.f87049e = i2 - 1;
        m94170b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f24308c).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        AbstractC42619iG7 abstractC42619iG7 = this.f110230g;
        Object obj = this.f24307b;
        List subList = ((List) this.f24308c).subList(i, i2);
        ND7 nd7 = this.f24309d;
        if (nd7 == null) {
            nd7 = this;
        }
        return abstractC42619iG7.m34269j(obj, subList, nd7);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new BE7(this, i);
    }
}
