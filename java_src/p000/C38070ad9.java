package p000;
/* renamed from: ad9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38070ad9 extends Sd9 {

    /* renamed from: a */
    public final String f50845a;

    /* renamed from: b */
    public final boolean f50846b;

    /* renamed from: c */
    public final int f50847c;

    public /* synthetic */ C38070ad9(String str, boolean z, int i, Tc9 tc9) {
        this.f50845a = str;
        this.f50846b = z;
        this.f50847c = i;
    }

    @Override // p000.Sd9
    /* renamed from: a */
    public final int mo70988a() {
        return this.f50847c;
    }

    @Override // p000.Sd9
    /* renamed from: b */
    public final String mo70987b() {
        return this.f50845a;
    }

    @Override // p000.Sd9
    /* renamed from: c */
    public final boolean mo70986c() {
        return this.f50846b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Sd9) {
            Sd9 sd9 = (Sd9) obj;
            if (this.f50845a.equals(sd9.mo70987b()) && this.f50846b == sd9.mo70986c() && this.f50847c == sd9.mo70988a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50845a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f50846b ? 1237 : 1231)) * 1000003) ^ this.f50847c;
    }

    public final String toString() {
        String str = this.f50845a;
        boolean z = this.f50846b;
        int i = this.f50847c;
        StringBuilder sb = new StringBuilder(str.length() + 84);
        sb.append("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z);
        sb.append(", firelogEventType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
