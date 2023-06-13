package p000;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: Gh7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC33087Gh7 extends AbstractCollection implements Serializable {

    /* renamed from: b */
    public static final Object[] f12279b = new Object[0];

    /* renamed from: a */
    int mo26865a(Object[] objArr, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    int mo17168b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17167c() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public AbstractC44688ll7 mo26864e() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: f */
    public abstract AbstractC36183Tn7 iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract boolean mo17166h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Object[] mo17165j() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f12279b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] mo17165j = mo17165j();
            if (mo17165j == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                return Arrays.copyOfRange(mo17165j, mo17167c(), mo17168b(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        mo26865a(objArr, 0);
        return objArr;
    }
}
