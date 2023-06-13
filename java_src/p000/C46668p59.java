package p000;

import java.util.Map;
/* renamed from: p59  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46668p59 implements Map.Entry, Comparable {

    /* renamed from: b */
    public final Comparable f103125b;

    /* renamed from: c */
    public Object f103126c;

    /* renamed from: d */
    public final /* synthetic */ C44306l69 f103127d;

    public C46668p59(C44306l69 c44306l69, Comparable comparable, Object obj) {
        this.f103127d = c44306l69;
        this.f103125b = comparable;
        this.f103126c = obj;
    }

    /* renamed from: b */
    public static final boolean m19965b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m19966a() {
        return this.f103125b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f103125b.compareTo(((C46668p59) obj).f103125b);
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
        if (m19965b(this.f103125b, entry.getKey()) && m19965b(this.f103126c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f103125b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f103126c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f103125b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f103126c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f103127d.m27841n();
        Object obj2 = this.f103126c;
        this.f103126c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103125b);
        String valueOf2 = String.valueOf(this.f103126c);
        return valueOf + "=" + valueOf2;
    }
}
