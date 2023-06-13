package p000;
/* renamed from: me9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45213me9 extends AbstractC45223mf9 {

    /* renamed from: a */
    public final String f98514a;

    /* renamed from: b */
    public final boolean f98515b;

    /* renamed from: c */
    public final int f98516c;

    public /* synthetic */ C45213me9(String str, boolean z, int i, C40469ee9 c40469ee9) {
        this.f98514a = str;
        this.f98515b = z;
        this.f98516c = i;
    }

    @Override // p000.AbstractC45223mf9
    /* renamed from: a */
    public final int mo25203a() {
        return this.f98516c;
    }

    @Override // p000.AbstractC45223mf9
    /* renamed from: b */
    public final String mo25202b() {
        return this.f98514a;
    }

    @Override // p000.AbstractC45223mf9
    /* renamed from: c */
    public final boolean mo25201c() {
        return this.f98515b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC45223mf9) {
            AbstractC45223mf9 abstractC45223mf9 = (AbstractC45223mf9) obj;
            if (this.f98514a.equals(abstractC45223mf9.mo25202b()) && this.f98515b == abstractC45223mf9.mo25201c() && this.f98516c == abstractC45223mf9.mo25203a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f98514a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f98515b ? 1237 : 1231)) * 1000003) ^ this.f98516c;
    }

    public final String toString() {
        String str = this.f98514a;
        boolean z = this.f98515b;
        int i = this.f98516c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }
}
