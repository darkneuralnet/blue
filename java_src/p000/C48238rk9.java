package p000;
/* renamed from: rk9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48238rk9 extends Ok9 {

    /* renamed from: a */
    public final String f107562a;

    /* renamed from: b */
    public final boolean f107563b;

    /* renamed from: c */
    public final int f107564c;

    public /* synthetic */ C48238rk9(String str, boolean z, int i, C44680lk9 c44680lk9) {
        this.f107562a = str;
        this.f107563b = z;
        this.f107564c = i;
    }

    @Override // p000.Ok9
    /* renamed from: a */
    public final int mo15468a() {
        return this.f107564c;
    }

    @Override // p000.Ok9
    /* renamed from: b */
    public final String mo15467b() {
        return this.f107562a;
    }

    @Override // p000.Ok9
    /* renamed from: c */
    public final boolean mo15466c() {
        return this.f107563b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ok9) {
            Ok9 ok9 = (Ok9) obj;
            if (this.f107562a.equals(ok9.mo15467b()) && this.f107563b == ok9.mo15466c() && this.f107564c == ok9.mo15468a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f107562a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f107563b ? 1237 : 1231)) * 1000003) ^ this.f107564c;
    }

    public final String toString() {
        String str = this.f107562a;
        boolean z = this.f107563b;
        int i = this.f107564c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }
}
