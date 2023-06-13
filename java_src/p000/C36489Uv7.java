package p000;

import java.util.Map;
/* renamed from: Uv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36489Uv7 implements Map.Entry, Comparable {

    /* renamed from: b */
    public final Comparable f38279b;

    /* renamed from: c */
    public Object f38280c;

    /* renamed from: d */
    public final /* synthetic */ C37191Xv7 f38281d;

    public C36489Uv7(C37191Xv7 c37191Xv7, Comparable comparable, Object obj) {
        this.f38281d = c37191Xv7;
        this.f38279b = comparable;
        this.f38280c = obj;
    }

    /* renamed from: b */
    public static final boolean m80613b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m80614a() {
        return this.f38279b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f38279b.compareTo(((C36489Uv7) obj).f38279b);
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
        if (m80613b(this.f38279b, entry.getKey()) && m80613b(this.f38280c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f38279b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f38280c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f38279b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f38280c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f38281d.m76084n();
        Object obj2 = this.f38280c;
        this.f38280c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f38279b);
        String valueOf2 = String.valueOf(this.f38280c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
