package p000;

import java.util.Map;
/* renamed from: Bj9 */
/* loaded from: classes5.dex */
public final class Bj9 implements Map.Entry, Comparable {

    /* renamed from: b */
    public final Comparable f2789b;

    /* renamed from: c */
    public Object f2790c;

    /* renamed from: d */
    public final /* synthetic */ C47052pk9 f2791d;

    public Bj9(C47052pk9 c47052pk9, Comparable comparable, Object obj) {
        this.f2791d = c47052pk9;
        this.f2789b = comparable;
        this.f2790c = obj;
    }

    /* renamed from: b */
    public static final boolean m113570b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m113571a() {
        return this.f2789b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2789b.compareTo(((Bj9) obj).f2789b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (m113570b(this.f2789b, entry.getKey()) && m113570b(this.f2790c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f2789b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2790c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2789b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2790c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2791d.m18831n();
        Object obj2 = this.f2790c;
        this.f2790c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2789b);
        String valueOf2 = String.valueOf(this.f2790c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
