package p000;

import java.util.Map;
/* renamed from: sb8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48739sb8 implements Comparable, Map.Entry {

    /* renamed from: b */
    public final Comparable f109033b;

    /* renamed from: c */
    public Object f109034c;

    /* renamed from: d */
    public final /* synthetic */ C48485s98 f109035d;

    public C48739sb8(C48485s98 c48485s98, Comparable comparable, Object obj) {
        this.f109035d = c48485s98;
        this.f109033b = comparable;
        this.f109034c = obj;
    }

    /* renamed from: a */
    public static boolean m13953a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C48739sb8) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return m13953a(this.f109033b, entry.getKey()) && m13953a(this.f109034c, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f109033b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f109034c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f109033b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f109034c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f109035d.m14619o();
        Object obj2 = this.f109034c;
        this.f109034c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f109033b);
        String valueOf2 = String.valueOf(this.f109034c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public C48739sb8(C48485s98 c48485s98, Map.Entry entry) {
        this(c48485s98, (Comparable) entry.getKey(), entry.getValue());
    }
}
