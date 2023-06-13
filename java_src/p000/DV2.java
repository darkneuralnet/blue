package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: DV2 */
/* loaded from: classes8.dex */
public class DV2 {
    /* renamed from: a */
    public static int m110353a(C52053yB0[] c52053yB0Arr, int i) {
        int i2 = i;
        while (i2 < c52053yB0Arr.length - 1) {
            int i3 = i2 + 1;
            if (!c52053yB0Arr[i2].m3886g(c52053yB0Arr[i3])) {
                break;
            }
            i2 = i3;
        }
        if (i2 >= c52053yB0Arr.length - 1) {
            return c52053yB0Arr.length - 1;
        }
        int m4963b = C51699xb4.m4963b(c52053yB0Arr[i2], c52053yB0Arr[i2 + 1]);
        while (true) {
            i++;
            if (i >= c52053yB0Arr.length) {
                break;
            }
            int i4 = i - 1;
            if (!c52053yB0Arr[i4].m3886g(c52053yB0Arr[i]) && C51699xb4.m4963b(c52053yB0Arr[i4], c52053yB0Arr[i]) != m4963b) {
                break;
            }
        }
        return i - 1;
    }

    /* renamed from: b */
    public static List m110352b(C52053yB0[] c52053yB0Arr, Object obj) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int m110353a = m110353a(c52053yB0Arr, i);
            arrayList.add(new BV2(c52053yB0Arr, i, m110353a, obj));
            if (m110353a >= c52053yB0Arr.length - 1) {
                return arrayList;
            }
            i = m110353a;
        }
    }
}
