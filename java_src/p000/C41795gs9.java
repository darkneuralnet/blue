package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* renamed from: gs9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C41795gs9 extends Do9 implements List {

    /* renamed from: g */
    public final /* synthetic */ Jt9 f84400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41795gs9(Jt9 jt9, Object obj, List list, Do9 do9) {
        super(jt9, obj, list, do9);
        this.f84400g = jt9;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f6378c.isEmpty();
        ((List) this.f6378c).add(i, obj);
        Jt9.m99588f(this.f84400g);
        if (isEmpty) {
            m109899a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f6378c).addAll(i, collection);
        if (addAll) {
            Jt9.m99586j(this.f84400g, this.f6378c.size() - size);
            if (size == 0) {
                m109899a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f6378c).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f6378c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f6378c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new Bq9(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f6378c).remove(i);
        Jt9.m99587g(this.f84400g);
        m109898b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f6378c).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        Jt9 jt9 = this.f84400g;
        Object obj = this.f6377b;
        List subList = ((List) this.f6378c).subList(i, i2);
        Do9 do9 = this.f6379d;
        if (do9 == null) {
            do9 = this;
        }
        return jt9.m99583m(obj, subList, do9);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new Bq9(this, i);
    }
}
