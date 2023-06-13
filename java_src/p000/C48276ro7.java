package p000;
/* renamed from: ro7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48276ro7 extends AbstractC50054uo7 {

    /* renamed from: a */
    public final String f107666a;

    /* renamed from: b */
    public final boolean f107667b;

    /* renamed from: c */
    public final int f107668c;

    public /* synthetic */ C48276ro7(String str, boolean z, int i, C47683qo7 c47683qo7) {
        this.f107666a = str;
        this.f107667b = z;
        this.f107668c = i;
    }

    @Override // p000.AbstractC50054uo7
    /* renamed from: a */
    public final int mo9711a() {
        return this.f107668c;
    }

    @Override // p000.AbstractC50054uo7
    /* renamed from: b */
    public final String mo9710b() {
        return this.f107666a;
    }

    @Override // p000.AbstractC50054uo7
    /* renamed from: c */
    public final boolean mo9709c() {
        return this.f107667b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC50054uo7) {
            AbstractC50054uo7 abstractC50054uo7 = (AbstractC50054uo7) obj;
            if (this.f107666a.equals(abstractC50054uo7.mo9710b()) && this.f107667b == abstractC50054uo7.mo9709c() && this.f107668c == abstractC50054uo7.mo9711a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f107666a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f107667b ? 1237 : 1231)) * 1000003) ^ this.f107668c;
    }

    public final String toString() {
        String str = this.f107666a;
        boolean z = this.f107667b;
        int i = this.f107668c;
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
