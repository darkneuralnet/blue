package p000;

import java.util.Map;
/* renamed from: pc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46970pc7 implements Map.Entry, Comparable {

    /* renamed from: b */
    public final Comparable f103856b;

    /* renamed from: c */
    public Object f103857c;

    /* renamed from: d */
    public final /* synthetic */ C50526vc7 f103858d;

    public C46970pc7(C50526vc7 c50526vc7, Comparable comparable, Object obj) {
        this.f103858d = c50526vc7;
        this.f103856b = comparable;
        this.f103857c = obj;
    }

    /* renamed from: b */
    public static final boolean m19061b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m19062a() {
        return this.f103856b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f103856b.compareTo(((C46970pc7) obj).f103856b);
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
        if (m19061b(this.f103856b, entry.getKey()) && m19061b(this.f103857c, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f103856b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f103857c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f103856b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f103857c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f103858d.m8351n();
        Object obj2 = this.f103857c;
        this.f103857c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103856b);
        String valueOf2 = String.valueOf(this.f103857c);
        return valueOf + "=" + valueOf2;
    }
}
