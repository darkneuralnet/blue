package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: CV5 */
/* loaded from: classes.dex */
public final class CV5 {

    /* renamed from: a */
    public final List<DV5> f4137a = new ArrayList();

    /* renamed from: b */
    public static void m112185b(List<int[]> list, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 < i2) {
                    if (i3 == iArr[i4]) {
                        z = true;
                        break;
                    }
                    i4++;
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                m112185b(list, i, iArr, i2 + 1);
            }
        }
    }

    /* renamed from: a */
    public boolean m112186a(DV5 dv5) {
        return this.f4137a.add(dv5);
    }

    /* renamed from: c */
    public final List<int[]> m112184c(int i) {
        ArrayList arrayList = new ArrayList();
        m112185b(arrayList, i, new int[i], 0);
        return arrayList;
    }

    /* renamed from: d */
    public boolean m112183d(List<DV5> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f4137a.size()) {
            return false;
        }
        for (int[] iArr : m112184c(this.f4137a.size())) {
            boolean z = true;
            for (int i = 0; i < this.f4137a.size() && (iArr[i] >= list.size() || ((z = z & this.f4137a.get(i).m110347e(list.get(iArr[i]))))); i++) {
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
