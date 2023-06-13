package p000;

import java.util.Map;
/* renamed from: f80  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40759f80 implements Map.Entry<String, C21> {

    /* renamed from: b */
    public final String f79507b;

    /* renamed from: c */
    public final F21 f79508c;

    public C40759f80(String str, F21 f21) {
        this.f79507b = str;
        this.f79508c = f21;
    }

    @Override // java.util.Map.Entry
    /* renamed from: a */
    public String getKey() {
        return this.f79507b;
    }

    @Override // java.util.Map.Entry
    /* renamed from: b */
    public C21 getValue() {
        return this.f79508c.get();
    }

    @Override // java.util.Map.Entry
    /* renamed from: c */
    public C21 setValue(C21 c21) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40759f80)) {
            return false;
        }
        C40759f80 c40759f80 = (C40759f80) obj;
        if (this.f79507b.equals(c40759f80.getKey()) && this.f79508c.equals(c40759f80.f79508c)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (this.f79507b.hashCode() * 31) + this.f79508c.hashCode();
    }
}
