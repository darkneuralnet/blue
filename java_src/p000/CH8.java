package p000;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: CH8 */
/* loaded from: classes5.dex */
public abstract class CH8 extends ZF8 implements List, RandomAccess {

    /* renamed from: c */
    public static final AbstractC49169tJ8 f3890c = new C51513xG8(C51531xI8.f117358f, 0);

    /* renamed from: j */
    public static CH8 m112390j(Object[] objArr, int i) {
        if (i == 0) {
            return C51531xI8.f117358f;
        }
        return new C51531xI8(objArr, i);
    }

    /* renamed from: o */
    public static CH8 m112389o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C44417lI8.m27432b(objArr, 2);
        return m112390j(objArr, 2);
    }

    /* renamed from: s */
    public static CH8 m112388s(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"auto", Stripe3ds2AuthParams.FIELD_APP, "am"};
        C44417lI8.m27432b(objArr, 3);
        return m112390j(objArr, 3);
    }

    /* renamed from: u */
    public static CH8 m112387u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        C44417lI8.m27432b(objArr, 7);
        return m112390j(objArr, 7);
    }

    @Override // p000.ZF8
    /* renamed from: a */
    public int mo5562a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ZF8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p000.ZF8
    /* renamed from: e */
    public final AbstractC42054hJ8 mo73473e() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (FC8.m107436a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!FC8.m107436a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* renamed from: h */
    public CH8 subList(int i, int i2) {
        C38425bD8.m64817c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C51531xI8.f117358f;
        }
        return new JG8(this, i, i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.ZF8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v */
    public final AbstractC49169tJ8 listIterator(int i) {
        C38425bD8.m64818b(i, size(), "index");
        if (isEmpty()) {
            return f3890c;
        }
        return new C51513xG8(this, i);
    }
}
