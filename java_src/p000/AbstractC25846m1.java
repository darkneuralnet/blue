package p000;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: m1 */
/* loaded from: classes8.dex */
public abstract class AbstractC25846m1 extends AbstractC40635ev5 implements Comparable<AbstractC40635ev5> {

    /* renamed from: e */
    public static final Comparator<Object> f97074e = new Comparator() { // from class: l1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m26541c;
            m26541c = AbstractC25846m1.m26541c(obj, obj2);
            return m26541c;
        }
    };

    /* renamed from: c */
    public final Map<Class, List<Object>> f97075c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map<Class, Object> f97076d = new ConcurrentHashMap();

    /* renamed from: c */
    public static int m26541c(Object obj, Object obj2) {
        return obj2.getClass().getSimpleName().compareTo(obj.getClass().getSimpleName());
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(AbstractC40635ev5 abstractC40635ev5) {
        return Integer.compare(mo42382a(), abstractC40635ev5.mo42382a());
    }
}
