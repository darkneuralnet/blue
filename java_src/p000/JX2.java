package p000;

import android.util.ArrayMap;
import java.util.Map;
/* renamed from: JX2 */
/* loaded from: classes.dex */
public class JX2 extends C51672xY5 {
    public JX2(Map<String, Object> map) {
        super(map);
    }

    /* renamed from: f */
    public static JX2 m100301f() {
        return new JX2(new ArrayMap());
    }

    /* renamed from: g */
    public static JX2 m100300g(C51672xY5 c51672xY5) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c51672xY5.m5015d()) {
            arrayMap.put(str, c51672xY5.m5016c(str));
        }
        return new JX2(arrayMap);
    }

    /* renamed from: e */
    public void m100302e(C51672xY5 c51672xY5) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f117801a;
        if (map2 != null && (map = c51672xY5.f117801a) != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: h */
    public void m100299h(String str, Object obj) {
        this.f117801a.put(str, obj);
    }
}
