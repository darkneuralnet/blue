package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* renamed from: ks7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44165ks7 extends C32700Eq7 implements List {

    /* renamed from: g */
    public final /* synthetic */ AbstractC38821bt7 f95147g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44165ks7(AbstractC38821bt7 abstractC38821bt7, Object obj, List list, C32700Eq7 c32700Eq7) {
        super(abstractC38821bt7, obj, list, c32700Eq7);
        this.f95147g = abstractC38821bt7;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f8186c.isEmpty();
        ((List) this.f8186c).add(i, obj);
        AbstractC38821bt7.m62193f(this.f95147g);
        if (isEmpty) {
            m108328a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f8186c).addAll(i, collection);
        if (addAll) {
            AbstractC38821bt7.m62190j(this.f95147g, this.f8186c.size() - size);
            if (size == 0) {
                m108328a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f8186c).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f8186c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f8186c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C50676vr7(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f8186c).remove(i);
        AbstractC38821bt7.m62192g(this.f95147g);
        m108327b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f8186c).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        AbstractC38821bt7 abstractC38821bt7 = this.f95147g;
        Object obj = this.f8185b;
        List subList = ((List) this.f8186c).subList(i, i2);
        C32700Eq7 c32700Eq7 = this.f8187d;
        if (c32700Eq7 == null) {
            c32700Eq7 = this;
        }
        return abstractC38821bt7.m62187m(obj, subList, c32700Eq7);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C50676vr7(this, i);
    }
}
