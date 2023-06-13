package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.bumptech.glide.d */
/* loaded from: classes5.dex */
public class C17105d {

    /* renamed from: a */
    public final Map<Class<?>, Object> f69121a;

    /* renamed from: com.bumptech.glide.d$a */
    /* loaded from: classes5.dex */
    public static final class C17106a {

        /* renamed from: a */
        public final Map<Class<?>, Object> f69122a = new HashMap();

        /* renamed from: b */
        public C17105d m53122b() {
            return new C17105d(this);
        }
    }

    public C17105d(C17106a c17106a) {
        this.f69121a = Collections.unmodifiableMap(new HashMap(c17106a.f69122a));
    }

    /* renamed from: a */
    public boolean m53124a(Class<Object> cls) {
        return this.f69121a.containsKey(cls);
    }
}
