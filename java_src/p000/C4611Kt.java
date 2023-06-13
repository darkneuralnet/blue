package p000;
/* renamed from: Kt */
/* loaded from: classes6.dex */
public final class C4611Kt extends AbstractC49476tq2 {

    /* renamed from: a */
    public final String f20317a;

    /* renamed from: b */
    public final String f20318b;

    public C4611Kt(String str, String str2) {
        if (str != null) {
            this.f20317a = str;
            if (str2 != null) {
                this.f20318b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // p000.AbstractC49476tq2
    /* renamed from: b */
    public String mo11690b() {
        return this.f20317a;
    }

    @Override // p000.AbstractC49476tq2
    /* renamed from: c */
    public String mo11689c() {
        return this.f20318b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC49476tq2)) {
            return false;
        }
        AbstractC49476tq2 abstractC49476tq2 = (AbstractC49476tq2) obj;
        if (this.f20317a.equals(abstractC49476tq2.mo11690b()) && this.f20318b.equals(abstractC49476tq2.mo11689c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20317a.hashCode() ^ 1000003) * 1000003) ^ this.f20318b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f20317a + ", version=" + this.f20318b + "}";
    }
}
