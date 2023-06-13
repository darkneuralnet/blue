package p000;

import java.util.Map;
/* renamed from: zZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52869zZ7 implements Map.Entry {

    /* renamed from: b */
    public C52869zZ7 f121540b;

    /* renamed from: c */
    public C52869zZ7 f121541c;

    /* renamed from: d */
    public C52869zZ7 f121542d;

    /* renamed from: e */
    public C52869zZ7 f121543e;

    /* renamed from: f */
    public C52869zZ7 f121544f;

    /* renamed from: g */
    public final Object f121545g;

    /* renamed from: h */
    public Object f121546h;

    /* renamed from: i */
    public int f121547i;

    public C52869zZ7() {
        this.f121545g = null;
        this.f121544f = this;
        this.f121543e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f121545g;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f121546h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f121545g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f121546h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object obj = this.f121545g;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f121546h;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f121546h;
        this.f121546h = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f121545g);
        String valueOf2 = String.valueOf(this.f121546h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public C52869zZ7(C52869zZ7 c52869zZ7, Object obj, C52869zZ7 c52869zZ72, C52869zZ7 c52869zZ73) {
        this.f121540b = c52869zZ7;
        this.f121545g = obj;
        this.f121547i = 1;
        this.f121543e = c52869zZ72;
        this.f121544f = c52869zZ73;
        c52869zZ73.f121543e = this;
        c52869zZ72.f121544f = this;
    }
}
