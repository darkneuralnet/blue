package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* renamed from: LU7 */
/* loaded from: classes5.dex */
public final class LU7 {
    /* renamed from: a */
    public static int m96794a(Set set) {
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
    public static boolean m96793b(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof DS7) {
            collection = ((DS7) collection).zza();
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
        return m96792c(set, collection.iterator());
    }

    /* renamed from: c */
    public static boolean m96792c(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
