package p000;
/* renamed from: LZ8 */
/* loaded from: classes5.dex */
public final class LZ8 extends AbstractC51360x09 {

    /* renamed from: a */
    public final String f21689a;

    /* renamed from: b */
    public final boolean f21690b;

    /* renamed from: c */
    public final int f21691c;

    public /* synthetic */ LZ8(String str, boolean z, int i, UY8 uy8) {
        this.f21689a = str;
        this.f21690b = z;
        this.f21691c = i;
    }

    @Override // p000.AbstractC51360x09
    /* renamed from: a */
    public final int mo5987a() {
        return this.f21691c;
    }

    @Override // p000.AbstractC51360x09
    /* renamed from: b */
    public final String mo5986b() {
        return this.f21689a;
    }

    @Override // p000.AbstractC51360x09
    /* renamed from: c */
    public final boolean mo5985c() {
        return this.f21690b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC51360x09) {
            AbstractC51360x09 abstractC51360x09 = (AbstractC51360x09) obj;
            if (this.f21689a.equals(abstractC51360x09.mo5986b()) && this.f21690b == abstractC51360x09.mo5985c() && this.f21691c == abstractC51360x09.mo5987a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21689a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f21690b ? 1237 : 1231)) * 1000003) ^ this.f21691c;
    }

    public final String toString() {
        String str = this.f21689a;
        boolean z = this.f21690b;
        int i = this.f21691c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }
}
