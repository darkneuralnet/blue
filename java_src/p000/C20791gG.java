package p000;

import java.util.HashMap;
import java.util.LinkedHashSet;
/* renamed from: gG */
/* loaded from: classes6.dex */
public class C20791gG {

    /* renamed from: a */
    public static HashMap<Class<?>, LinkedHashSet<Class<?>>> f81859a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<Class<?>, HashMap<String, String>> f81860b = new HashMap<>();

    static {
        m39780a(Object.class, PW0.class);
        m39780a(Object.class, C47904rB0.class);
    }

    /* renamed from: a */
    public static void m39780a(Class<?> cls, Class<?> cls2) {
        synchronized (f81859a) {
            LinkedHashSet<Class<?>> linkedHashSet = f81859a.get(cls);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                f81859a.put(cls, linkedHashSet);
            }
            linkedHashSet.add(cls2);
        }
    }
}
