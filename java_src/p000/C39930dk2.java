package p000;

import java.util.Arrays;
import java.util.HashMap;
/* renamed from: dk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39930dk2 {

    /* renamed from: a */
    public HashMap<Object, HashMap<String, float[]>> f77148a = new HashMap<>();

    /* renamed from: a */
    public float m43818a(Object obj, String str, int i) {
        HashMap<String, float[]> hashMap;
        float[] fArr;
        if (!this.f77148a.containsKey(obj) || (hashMap = this.f77148a.get(obj)) == null || !hashMap.containsKey(str) || (fArr = hashMap.get(str)) == null || fArr.length <= i) {
            return Float.NaN;
        }
        return fArr[i];
    }

    /* renamed from: b */
    public void m43817b(Object obj, String str, int i, float f) {
        if (!this.f77148a.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[i + 1];
            fArr[i] = f;
            hashMap.put(str, fArr);
            this.f77148a.put(obj, hashMap);
            return;
        }
        HashMap<String, float[]> hashMap2 = this.f77148a.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i + 1];
            fArr2[i] = f;
            hashMap2.put(str, fArr2);
            this.f77148a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i) {
            fArr3 = Arrays.copyOf(fArr3, i + 1);
        }
        fArr3[i] = f;
        hashMap2.put(str, fArr3);
    }
}
