package p000;

import java.util.List;
/* renamed from: kt */
/* loaded from: classes5.dex */
public final class C25542kt extends AbstractC6301PF {

    /* renamed from: a */
    public final List<AbstractC47768qx2> f95153a;

    public C25542kt(List<AbstractC47768qx2> list) {
        if (list != null) {
            this.f95153a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // p000.AbstractC6301PF
    /* renamed from: c */
    public List<AbstractC47768qx2> mo28243c() {
        return this.f95153a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6301PF) {
            return this.f95153a.equals(((AbstractC6301PF) obj).mo28243c());
        }
        return false;
    }

    public int hashCode() {
        return this.f95153a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f95153a + "}";
    }
}
