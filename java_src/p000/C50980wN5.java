package p000;

import java.util.Comparator;
import java.util.SortedSet;
/* renamed from: wN5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50980wN5 {
    private C50980wN5() {
    }

    /* renamed from: a */
    public static <E> Comparator<? super E> m6957a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return AbstractC53114zy3.m58c();
        }
        return comparator;
    }

    /* renamed from: b */
    public static boolean m6956b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        EZ3.m108801n(comparator);
        EZ3.m108801n(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m6957a((SortedSet) iterable);
        } else if (iterable instanceof InterfaceC50387vN5) {
            comparator2 = ((InterfaceC50387vN5) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
