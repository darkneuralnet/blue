package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* renamed from: E91 */
/* loaded from: classes8.dex */
public class E91 {
    /* renamed from: a */
    public static List<C47886r91> m109342a(List<C47886r91> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C47886r91 c47886r91 : list) {
            C91 m112738b = C91.m112738b(c47886r91);
            C47886r91 c47886r912 = (C47886r91) hashMap.get(m112738b);
            if (c47886r912 == null) {
                hashMap.put(m112738b, c47886r91);
                arrayList.add(c47886r91);
            } else {
                if (c47886r912.m16334s() == c47886r91.m16334s()) {
                    z = true;
                } else {
                    z = false;
                }
                C4596Ko.m98281d(z, "Merge of edges of different sizes - probable noding error.");
                c47886r912.m16337p(c47886r91);
            }
        }
        return arrayList;
    }
}
