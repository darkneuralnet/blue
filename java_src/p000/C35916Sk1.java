package p000;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Sk1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35916Sk1 {

    /* renamed from: a */
    public final String f34185a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f34186b;

    /* renamed from: Sk1$b */
    /* loaded from: classes6.dex */
    public static final class C7526b {

        /* renamed from: a */
        public final String f34187a;

        /* renamed from: b */
        public Map<Class<?>, Object> f34188b = null;

        public C7526b(String str) {
            this.f34187a = str;
        }

        /* renamed from: a */
        public C35916Sk1 m84926a() {
            Map unmodifiableMap;
            String str = this.f34187a;
            if (this.f34188b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f34188b));
            }
            return new C35916Sk1(str, unmodifiableMap);
        }

        /* renamed from: b */
        public <T extends Annotation> C7526b m84925b(T t) {
            if (this.f34188b == null) {
                this.f34188b = new HashMap();
            }
            this.f34188b.put(t.annotationType(), t);
            return this;
        }
    }

    /* renamed from: a */
    public static C7526b m84930a(String str) {
        return new C7526b(str);
    }

    /* renamed from: d */
    public static C35916Sk1 m84927d(String str) {
        return new C35916Sk1(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m84929b() {
        return this.f34185a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m84928c(Class<T> cls) {
        return (T) this.f34186b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35916Sk1)) {
            return false;
        }
        C35916Sk1 c35916Sk1 = (C35916Sk1) obj;
        if (this.f34185a.equals(c35916Sk1.f34185a) && this.f34186b.equals(c35916Sk1.f34186b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34185a.hashCode() * 31) + this.f34186b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f34185a + ", properties=" + this.f34186b.values() + "}";
    }

    public C35916Sk1(String str, Map<Class<?>, Object> map) {
        this.f34185a = str;
        this.f34186b = map;
    }
}
