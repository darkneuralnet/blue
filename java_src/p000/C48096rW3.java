package p000;

import android.os.Bundle;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: rW3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48096rW3 {

    /* renamed from: a */
    public static final Set<String> f107238a = new HashSet(Arrays.asList("app_update", "review"));

    /* renamed from: b */
    public static final Set<String> f107239b = new HashSet(Arrays.asList(AnalyticsRequestV2Factory.PLUGIN_NATIVE, "unity"));

    /* renamed from: c */
    public static final Map<String, Map<String, Integer>> f107240c = new HashMap();

    /* renamed from: d */
    public static final C42061hK6 f107241d = new C42061hK6("PlayCoreVersion");

    private C48096rW3() {
    }

    /* renamed from: a */
    public static synchronized Map<String, Integer> m15830a(String str) {
        Map<String, Integer> map;
        synchronized (C48096rW3.class) {
            Map<String, Map<String, Integer>> map2 = f107240c;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11000);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        return map;
    }

    /* renamed from: b */
    public static Bundle m15829b(String str) {
        Bundle bundle = new Bundle();
        Map<String, Integer> m15830a = m15830a(str);
        bundle.putInt("playcore_version_code", m15830a.get("java").intValue());
        if (m15830a.containsKey(AnalyticsRequestV2Factory.PLUGIN_NATIVE)) {
            bundle.putInt("playcore_native_version", m15830a.get(AnalyticsRequestV2Factory.PLUGIN_NATIVE).intValue());
        }
        if (m15830a.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", m15830a.get("unity").intValue());
        }
        return bundle;
    }
}
