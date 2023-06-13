package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* renamed from: yy */
/* loaded from: classes6.dex */
public final class C30789yy {

    /* renamed from: a */
    public final Map<Integer, Integer> f120457a = new HashMap();

    /* renamed from: a */
    public int[] m2207a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.f120457a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C47332qD3.m17896b(arrayList);
    }

    /* renamed from: b */
    public void m2206b(int i) {
        Integer num = this.f120457a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f120457a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
