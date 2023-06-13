package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: Sk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35917Sk2 {

    /* renamed from: a */
    public static final Map<C35683Rk2, Set<EnumC52380yk2>> f34189a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(C35683Rk2.f32497c, new HashSet(Arrays.asList(EnumC52380yk2.SIGN, EnumC52380yk2.VERIFY)));
        hashMap.put(C35683Rk2.f32498d, new HashSet(Arrays.asList(EnumC52380yk2.ENCRYPT, EnumC52380yk2.DECRYPT, EnumC52380yk2.WRAP_KEY, EnumC52380yk2.UNWRAP_KEY)));
        f34189a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static boolean m84924a(C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set) {
        if (c35683Rk2 == null || set == null) {
            return true;
        }
        Map<C35683Rk2, Set<EnumC52380yk2>> map = f34189a;
        return !map.containsKey(c35683Rk2) || map.get(c35683Rk2).containsAll(set);
    }
}
