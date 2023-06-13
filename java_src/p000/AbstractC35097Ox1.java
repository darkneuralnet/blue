package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* renamed from: Ox1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35097Ox1<E> extends AbstractC34395Lx1<E> implements SortedSet<E> {
    @Override // p000.AbstractC34395Lx1, p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
    /* renamed from: b */
    public abstract SortedSet<E> delegate();

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return delegate().headSet(e);
    }

    @Override // java.util.SortedSet
    public E last() {
        return delegate().last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC31821Ax1
    public boolean standardContains(Object obj) {
        try {
            if (AbstractC34863Nx1.m93167c(comparator(), tailSet(obj).first(), obj) != 0) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC31821Ax1
    public boolean standardRemove(Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (AbstractC34863Nx1.m93167c(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return delegate().subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return delegate().tailSet(e);
    }
}
