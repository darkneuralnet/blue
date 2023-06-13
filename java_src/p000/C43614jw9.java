package p000;

import java.util.Map;
/* renamed from: jw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43614jw9 implements Map.Entry {

    /* renamed from: b */
    public C43614jw9 f93586b;

    /* renamed from: c */
    public C43614jw9 f93587c;

    /* renamed from: d */
    public C43614jw9 f93588d;

    /* renamed from: e */
    public C43614jw9 f93589e;

    /* renamed from: f */
    public C43614jw9 f93590f;

    /* renamed from: g */
    public final Object f93591g;

    /* renamed from: h */
    public Object f93592h;

    /* renamed from: i */
    public int f93593i;

    public C43614jw9() {
        this.f93591g = null;
        this.f93590f = this;
        this.f93589e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f93591g;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f93592h;
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
        return this.f93591g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f93592h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object obj = this.f93591g;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f93592h;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f93592h;
        this.f93592h = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f93591g);
        String valueOf2 = String.valueOf(this.f93592h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public C43614jw9(C43614jw9 c43614jw9, Object obj, C43614jw9 c43614jw92, C43614jw9 c43614jw93) {
        this.f93586b = c43614jw9;
        this.f93591g = obj;
        this.f93593i = 1;
        this.f93589e = c43614jw92;
        this.f93590f = c43614jw93;
        c43614jw93.f93589e = this;
        c43614jw92.f93590f = this;
    }
}
