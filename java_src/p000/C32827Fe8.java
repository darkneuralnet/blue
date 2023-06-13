package p000;
/* renamed from: Fe8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32827Fe8 extends W52 {

    /* renamed from: a */
    public final String f9919a;

    @Override // p000.W52
    /* renamed from: a */
    public final String mo78850a() {
        return this.f9919a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W52) {
            return this.f9919a.equals(((W52) obj).mo78850a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9919a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f9919a;
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("IntegrityTokenResponse{token=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
