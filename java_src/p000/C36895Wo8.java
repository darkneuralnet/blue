package p000;

import java.util.Map;
/* renamed from: Wo8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36895Wo8 implements Map.Entry, Comparable<C36895Wo8> {

    /* renamed from: b */
    public final Comparable f42130b;

    /* renamed from: c */
    public Object f42131c;

    /* renamed from: d */
    public final /* synthetic */ C33394Hp8 f42132d;

    public C36895Wo8(C33394Hp8 c33394Hp8, Comparable comparable, Object obj) {
        this.f42132d = c33394Hp8;
        this.f42130b = comparable;
        this.f42131c = obj;
    }

    /* renamed from: b */
    public static final boolean m77824b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m77825a() {
        return this.f42130b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C36895Wo8 c36895Wo8) {
        return this.f42130b.compareTo(c36895Wo8.f42130b);
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
        if (m77824b(this.f42130b, entry.getKey()) && m77824b(this.f42131c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f42130b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42131c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f42130b;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f42131c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f42132d.m103393n();
        Object obj2 = this.f42131c;
        this.f42131c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42130b);
        String valueOf2 = String.valueOf(this.f42131c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
