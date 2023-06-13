package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* renamed from: sM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48602sM7 {
    /* renamed from: a */
    public static int m14270a(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: b */
    public static boolean m14269b(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC47390qJ7) {
            collection = ((InterfaceC47390qJ7) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return m14268c(set, collection.iterator());
    }

    /* renamed from: c */
    public static boolean m14268c(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
