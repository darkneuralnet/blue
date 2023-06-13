package p000;

import java.util.Collections;
import java.util.TreeMap;
/* renamed from: Jy9 */
/* loaded from: classes5.dex */
public final class Jy9 {

    /* renamed from: a */
    public final TreeMap f18876a = new TreeMap();

    /* renamed from: b */
    public final TreeMap f18877b = new TreeMap();

    /* renamed from: c */
    public static final int m99406c(C38159am8 c38159am8, C42386hs7 c42386hs7, InterfaceC37164Xs7 interfaceC37164Xs7) {
        InterfaceC37164Xs7 mo4521d = c42386hs7.mo4521d(c38159am8, Collections.singletonList(interfaceC37164Xs7));
        if (mo4521d instanceof C44105km7) {
            return C38822bt8.m62182b(mo4521d.zzh().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void m99408a(String str, int i, C42386hs7 c42386hs7, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f18877b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f18876a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), c42386hs7);
    }

    /* renamed from: b */
    public final void m99407b(C38159am8 c38159am8, C34950Og7 c34950Og7) {
        RT8 rt8 = new RT8(c34950Og7);
        for (Integer num : this.f18876a.keySet()) {
            C35175Pf7 clone = c34950Og7.m91683b().clone();
            int m99406c = m99406c(c38159am8, (C42386hs7) this.f18876a.get(num), rt8);
            if (m99406c == 2 || m99406c == -1) {
                c34950Og7.m91679f(clone);
            }
        }
        for (Integer num2 : this.f18877b.keySet()) {
            m99406c(c38159am8, (C42386hs7) this.f18877b.get(num2), rt8);
        }
    }
}
