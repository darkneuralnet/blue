package p000;

import android.content.Context;
/* renamed from: ut */
/* loaded from: classes5.dex */
public final class C29321ut extends CE0 {

    /* renamed from: a */
    public final Context f113134a;

    /* renamed from: b */
    public final InterfaceC38734bl0 f113135b;

    /* renamed from: c */
    public final InterfaceC38734bl0 f113136c;

    /* renamed from: d */
    public final String f113137d;

    public C29321ut(Context context, InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02, String str) {
        if (context != null) {
            this.f113134a = context;
            if (interfaceC38734bl0 != null) {
                this.f113135b = interfaceC38734bl0;
                if (interfaceC38734bl02 != null) {
                    this.f113136c = interfaceC38734bl02;
                    if (str != null) {
                        this.f113137d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // p000.CE0
    /* renamed from: b */
    public Context mo9619b() {
        return this.f113134a;
    }

    @Override // p000.CE0
    /* renamed from: c */
    public String mo9618c() {
        return this.f113137d;
    }

    @Override // p000.CE0
    /* renamed from: d */
    public InterfaceC38734bl0 mo9617d() {
        return this.f113136c;
    }

    @Override // p000.CE0
    /* renamed from: e */
    public InterfaceC38734bl0 mo9616e() {
        return this.f113135b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CE0)) {
            return false;
        }
        CE0 ce0 = (CE0) obj;
        if (this.f113134a.equals(ce0.mo9619b()) && this.f113135b.equals(ce0.mo9616e()) && this.f113136c.equals(ce0.mo9617d()) && this.f113137d.equals(ce0.mo9618c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f113134a.hashCode() ^ 1000003) * 1000003) ^ this.f113135b.hashCode()) * 1000003) ^ this.f113136c.hashCode()) * 1000003) ^ this.f113137d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f113134a + ", wallClock=" + this.f113135b + ", monotonicClock=" + this.f113136c + ", backendName=" + this.f113137d + "}";
    }
}
