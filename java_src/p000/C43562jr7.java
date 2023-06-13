package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* renamed from: jr7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C43562jr7 extends C51842xp7 implements List {

    /* renamed from: g */
    public final /* synthetic */ AbstractC37389Yr7 f93463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43562jr7(AbstractC37389Yr7 abstractC37389Yr7, Object obj, List list, C51842xp7 c51842xp7) {
        super(abstractC37389Yr7, obj, list, c51842xp7);
        this.f93463g = abstractC37389Yr7;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.f118196c.isEmpty();
        ((List) this.f118196c).add(i, obj);
        AbstractC37389Yr7 abstractC37389Yr7 = this.f93463g;
        i2 = abstractC37389Yr7.f47501e;
        abstractC37389Yr7.f47501e = i2 + 1;
        if (isEmpty) {
            m4585a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f118196c).addAll(i, collection);
        if (addAll) {
            int size2 = this.f118196c.size();
            AbstractC37389Yr7 abstractC37389Yr7 = this.f93463g;
            i2 = abstractC37389Yr7.f47501e;
            abstractC37389Yr7.f47501e = i2 + (size2 - size);
            if (size == 0) {
                m4585a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f118196c).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f118196c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f118196c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C47703qq7(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.f118196c).remove(i);
        AbstractC37389Yr7 abstractC37389Yr7 = this.f93463g;
        i2 = abstractC37389Yr7.f47501e;
        abstractC37389Yr7.f47501e = i2 - 1;
        m4584b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f118196c).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        AbstractC37389Yr7 abstractC37389Yr7 = this.f93463g;
        Object obj = this.f118195b;
        List subList = ((List) this.f118196c).subList(i, i2);
        C51842xp7 c51842xp7 = this.f118197d;
        if (c51842xp7 == null) {
            c51842xp7 = this;
        }
        return abstractC37389Yr7.m74086j(obj, subList, c51842xp7);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C47703qq7(this, i);
    }
}
