package p000;

import java.util.Map;
/* renamed from: BW8 */
/* loaded from: classes6.dex */
public final class BW8 implements Comparable, Map.Entry {

    /* renamed from: b */
    public final Comparable f2479b;

    /* renamed from: c */
    public Object f2480c;

    /* renamed from: d */
    public final /* synthetic */ BV8 f2481d;

    public BW8(BV8 bv8, Map.Entry entry) {
        this(bv8, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public static boolean m113906a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((BW8) obj).getKey());
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
        if (m113906a(this.f2479b, entry.getKey()) && m113906a(this.f2480c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f2479b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2480c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2479b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2480c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2481d.m113927p();
        Object obj2 = this.f2480c;
        this.f2480c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2479b);
        String valueOf2 = String.valueOf(this.f2480c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public BW8(BV8 bv8, Comparable comparable, Object obj) {
        this.f2481d = bv8;
        this.f2479b = comparable;
        this.f2480c = obj;
    }
}
