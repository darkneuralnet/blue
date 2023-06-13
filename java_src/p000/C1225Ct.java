package p000;

import java.util.List;
/* renamed from: Ct */
/* loaded from: classes6.dex */
public final class C1225Ct extends DI1 {

    /* renamed from: a */
    public final String f4852a;

    /* renamed from: b */
    public final List<String> f4853b;

    public C1225Ct(String str, List<String> list) {
        if (str != null) {
            this.f4852a = str;
            if (list != null) {
                this.f4853b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // p000.DI1
    /* renamed from: b */
    public List<String> mo110607b() {
        return this.f4853b;
    }

    @Override // p000.DI1
    /* renamed from: c */
    public String mo110606c() {
        return this.f4852a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DI1)) {
            return false;
        }
        DI1 di1 = (DI1) obj;
        if (this.f4852a.equals(di1.mo110606c()) && this.f4853b.equals(di1.mo110607b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4852a.hashCode() ^ 1000003) * 1000003) ^ this.f4853b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f4852a + ", usedDates=" + this.f4853b + "}";
    }
}
