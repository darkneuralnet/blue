package p000;
/* renamed from: aW8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38003aW8 extends AbstractC51064wW8 {

    /* renamed from: a */
    public final String f50608a;

    /* renamed from: b */
    public final boolean f50609b;

    /* renamed from: c */
    public final int f50610c;

    public /* synthetic */ C38003aW8(String str, boolean z, int i, RV8 rv8) {
        this.f50608a = str;
        this.f50609b = z;
        this.f50610c = i;
    }

    @Override // p000.AbstractC51064wW8
    /* renamed from: a */
    public final int mo6711a() {
        return this.f50610c;
    }

    @Override // p000.AbstractC51064wW8
    /* renamed from: b */
    public final String mo6710b() {
        return this.f50608a;
    }

    @Override // p000.AbstractC51064wW8
    /* renamed from: c */
    public final boolean mo6709c() {
        return this.f50609b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC51064wW8) {
            AbstractC51064wW8 abstractC51064wW8 = (AbstractC51064wW8) obj;
            if (this.f50608a.equals(abstractC51064wW8.mo6710b()) && this.f50609b == abstractC51064wW8.mo6709c() && this.f50610c == abstractC51064wW8.mo6711a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50608a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f50609b ? 1237 : 1231)) * 1000003) ^ this.f50610c;
    }

    public final String toString() {
        String str = this.f50608a;
        boolean z = this.f50609b;
        int i = this.f50610c;
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
