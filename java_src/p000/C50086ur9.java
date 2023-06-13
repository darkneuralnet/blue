package p000;

import java.util.Map;
/* renamed from: ur9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50086ur9 implements Map.Entry, Comparable<C50086ur9> {

    /* renamed from: b */
    public final Comparable f113104b;

    /* renamed from: c */
    public Object f113105c;

    /* renamed from: d */
    public final /* synthetic */ Ar9 f113106d;

    public C50086ur9(Ar9 ar9, Comparable comparable, Object obj) {
        this.f113106d = ar9;
        this.f113104b = comparable;
        this.f113105c = obj;
    }

    /* renamed from: b */
    public static final boolean m9645b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m9646a() {
        return this.f113104b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C50086ur9 c50086ur9) {
        return this.f113104b.compareTo(c50086ur9.f113104b);
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
        if (m9645b(this.f113104b, entry.getKey()) && m9645b(this.f113105c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f113104b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f113105c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f113104b;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f113105c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f113106d.m115009n();
        Object obj2 = this.f113105c;
        this.f113105c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f113104b);
        String valueOf2 = String.valueOf(this.f113105c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
