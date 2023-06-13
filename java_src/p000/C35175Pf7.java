package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: Pf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35175Pf7 {

    /* renamed from: a */
    public String f28871a;

    /* renamed from: b */
    public final long f28872b;

    /* renamed from: c */
    public final Map f28873c;

    public C35175Pf7(String str, long j, Map map) {
        this.f28871a = str;
        this.f28872b = j;
        HashMap hashMap = new HashMap();
        this.f28873c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long m89963a() {
        return this.f28872b;
    }

    /* renamed from: b */
    public final C35175Pf7 clone() {
        return new C35175Pf7(this.f28871a, this.f28872b, new HashMap(this.f28873c));
    }

    /* renamed from: c */
    public final Object m89961c(String str) {
        if (this.f28873c.containsKey(str)) {
            return this.f28873c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String m89960d() {
        return this.f28871a;
    }

    /* renamed from: e */
    public final Map m89959e() {
        return this.f28873c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35175Pf7)) {
            return false;
        }
        C35175Pf7 c35175Pf7 = (C35175Pf7) obj;
        if (this.f28872b != c35175Pf7.f28872b || !this.f28871a.equals(c35175Pf7.f28871a)) {
            return false;
        }
        return this.f28873c.equals(c35175Pf7.f28873c);
    }

    /* renamed from: f */
    public final void m89958f(String str) {
        this.f28871a = str;
    }

    /* renamed from: g */
    public final void m89957g(String str, Object obj) {
        if (obj == null) {
            this.f28873c.remove(str);
        } else {
            this.f28873c.put(str, obj);
        }
    }

    public final int hashCode() {
        long j = this.f28872b;
        return (((this.f28871a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f28873c.hashCode();
    }

    public final String toString() {
        String str = this.f28871a;
        long j = this.f28872b;
        String obj = this.f28873c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
