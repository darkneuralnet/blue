package p000;

import java.util.Map;
/* renamed from: y18  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51962y18 implements Comparable, Map.Entry {

    /* renamed from: b */
    public final Comparable f118632b;

    /* renamed from: c */
    public Object f118633c;

    /* renamed from: d */
    public final /* synthetic */ ZY7 f118634d;

    public C51962y18(ZY7 zy7, Map.Entry entry) {
        this(zy7, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public static boolean m4232a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C51962y18) obj).getKey());
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
        if (m4232a(this.f118632b, entry.getKey()) && m4232a(this.f118633c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f118632b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f118633c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f118632b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f118633c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f118634d.m72942n();
        Object obj2 = this.f118633c;
        this.f118633c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f118632b);
        String valueOf2 = String.valueOf(this.f118633c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public C51962y18(ZY7 zy7, Comparable comparable, Object obj) {
        this.f118634d = zy7;
        this.f118632b = comparable;
        this.f118633c = obj;
    }
}
