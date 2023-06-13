package p000;

import java.util.Set;
/* renamed from: tt */
/* loaded from: classes6.dex */
public final class C28957tt extends AbstractC32504Dv0 {

    /* renamed from: a */
    public final Set<String> f111319a;

    public C28957tt(Set<String> set) {
        if (set != null) {
            this.f111319a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    @Override // p000.AbstractC32504Dv0
    /* renamed from: b */
    public Set<String> mo11261b() {
        return this.f111319a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC32504Dv0) {
            return this.f111319a.equals(((AbstractC32504Dv0) obj).mo11261b());
        }
        return false;
    }

    public int hashCode() {
        return this.f111319a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f111319a + "}";
    }
}
