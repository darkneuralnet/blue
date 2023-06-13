package p000;
/* renamed from: gQ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41523gQ7 extends V52 {

    /* renamed from: a */
    public final String f82170a;

    /* renamed from: b */
    public final Long f82171b;

    public /* synthetic */ C41523gQ7(String str, Long l, C49105tC7 c49105tC7) {
        this.f82170a = str;
        this.f82171b = l;
    }

    @Override // p000.V52
    /* renamed from: b */
    public final Long mo39483b() {
        return this.f82171b;
    }

    @Override // p000.V52
    /* renamed from: c */
    public final String mo39482c() {
        return this.f82170a;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof V52) {
            V52 v52 = (V52) obj;
            if (this.f82170a.equals(v52.mo39482c()) && ((l = this.f82171b) != null ? l.equals(v52.mo39483b()) : v52.mo39483b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f82170a.hashCode() ^ 1000003) * 1000003;
        Long l = this.f82171b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String str = this.f82170a;
        String valueOf = String.valueOf(this.f82171b);
        StringBuilder sb = new StringBuilder(str.length() + 50 + valueOf.length());
        sb.append("IntegrityTokenRequest{nonce=");
        sb.append(str);
        sb.append(", cloudProjectNumber=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
