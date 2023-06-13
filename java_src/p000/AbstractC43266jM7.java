package p000;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* renamed from: jM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC43266jM7<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    public static final Object[] f92607b = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: a */
    public abstract MN7<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @NullableDecl
    /* renamed from: b */
    public Object[] mo5318b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo5317c() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    int mo5316e() {
        throw null;
    }

    /* renamed from: f */
    public AbstractC42089hN7<E> mo30753f() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract boolean mo5315h();

    /* renamed from: j */
    public int mo5314j(Object[] objArr, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f92607b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] mo5318b = mo5318b();
            if (mo5318b == null) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            } else {
                return (T[]) Arrays.copyOfRange(mo5318b, mo5317c(), mo5316e(), tArr.getClass());
            }
        } else if (length > size) {
            tArr[size] = null;
        }
        mo5314j(tArr, 0);
        return tArr;
    }
}
