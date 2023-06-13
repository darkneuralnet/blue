package p000;
/* renamed from: r29  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47824r29 extends L29 {

    /* renamed from: a */
    public final String f106324a;

    /* renamed from: b */
    public final boolean f106325b;

    /* renamed from: c */
    public final int f106326c;

    public /* synthetic */ C47824r29(String str, boolean z, int i, C41894h29 c41894h29) {
        this.f106324a = str;
        this.f106325b = z;
        this.f106326c = i;
    }

    @Override // p000.L29
    /* renamed from: a */
    public final int mo16572a() {
        return this.f106326c;
    }

    @Override // p000.L29
    /* renamed from: b */
    public final String mo16571b() {
        return this.f106324a;
    }

    @Override // p000.L29
    /* renamed from: c */
    public final boolean mo16570c() {
        return this.f106325b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof L29) {
            L29 l29 = (L29) obj;
            if (this.f106324a.equals(l29.mo16571b()) && this.f106325b == l29.mo16570c() && this.f106326c == l29.mo16572a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f106324a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f106325b ? 1237 : 1231)) * 1000003) ^ this.f106326c;
    }

    public final String toString() {
        String str = this.f106324a;
        boolean z = this.f106325b;
        int i = this.f106326c;
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
