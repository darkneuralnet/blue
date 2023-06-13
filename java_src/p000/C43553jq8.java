package p000;

import java.util.Map;
/* renamed from: jq8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43553jq8 implements Map.Entry, Comparable {

    /* renamed from: b */
    public final Comparable f93435b;

    /* renamed from: c */
    public Object f93436c;

    /* renamed from: d */
    public final /* synthetic */ C33178Gr8 f93437d;

    public C43553jq8(C33178Gr8 c33178Gr8, Comparable comparable, Object obj) {
        this.f93437d = c33178Gr8;
        this.f93435b = comparable;
        this.f93436c = obj;
    }

    /* renamed from: b */
    public static final boolean m29841b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m29842a() {
        return this.f93435b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f93435b.compareTo(((C43553jq8) obj).f93435b);
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
        if (m29841b(this.f93435b, entry.getKey()) && m29841b(this.f93436c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f93435b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f93436c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f93435b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f93436c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f93437d.m104656n();
        Object obj2 = this.f93436c;
        this.f93436c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f93435b);
        String valueOf2 = String.valueOf(this.f93436c);
        return valueOf + "=" + valueOf2;
    }
}
