package p000;

import java.util.ArrayList;
/* renamed from: jo */
/* loaded from: classes8.dex */
public class C25025jo {
    private C25025jo() {
    }

    /* renamed from: a */
    public static Object[] m29902a(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof Object[]) {
                    for (Object obj2 : m29902a((Object[]) obj)) {
                        arrayList.add(obj2);
                    }
                } else {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.toArray();
    }
}
