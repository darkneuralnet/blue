package p000;

import android.util.Size;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.InterfaceC11225s;
import p000.F90;
/* renamed from: mt */
/* loaded from: classes.dex */
public final class C26283mt extends F90.AbstractC2186i {

    /* renamed from: a */
    public final String f98973a;

    /* renamed from: b */
    public final Class<?> f98974b;

    /* renamed from: c */
    public final C11213q f98975c;

    /* renamed from: d */
    public final InterfaceC11225s<?> f98976d;

    /* renamed from: e */
    public final Size f98977e;

    public C26283mt(String str, Class<?> cls, C11213q c11213q, InterfaceC11225s<?> interfaceC11225s, Size size) {
        if (str != null) {
            this.f98973a = str;
            if (cls != null) {
                this.f98974b = cls;
                if (c11213q != null) {
                    this.f98975c = c11213q;
                    if (interfaceC11225s != null) {
                        this.f98976d = interfaceC11225s;
                        this.f98977e = size;
                        return;
                    }
                    throw new NullPointerException("Null useCaseConfig");
                }
                throw new NullPointerException("Null sessionConfig");
            }
            throw new NullPointerException("Null useCaseType");
        }
        throw new NullPointerException("Null useCaseId");
    }

    @Override // p000.F90.AbstractC2186i
    /* renamed from: c */
    public C11213q mo24781c() {
        return this.f98975c;
    }

    @Override // p000.F90.AbstractC2186i
    /* renamed from: d */
    public Size mo24780d() {
        return this.f98977e;
    }

    @Override // p000.F90.AbstractC2186i
    /* renamed from: e */
    public InterfaceC11225s<?> mo24779e() {
        return this.f98976d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F90.AbstractC2186i)) {
            return false;
        }
        F90.AbstractC2186i abstractC2186i = (F90.AbstractC2186i) obj;
        if (this.f98973a.equals(abstractC2186i.mo24778f()) && this.f98974b.equals(abstractC2186i.mo24777g()) && this.f98975c.equals(abstractC2186i.mo24781c()) && this.f98976d.equals(abstractC2186i.mo24779e())) {
            Size size = this.f98977e;
            if (size == null) {
                if (abstractC2186i.mo24780d() == null) {
                    return true;
                }
            } else if (size.equals(abstractC2186i.mo24780d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.F90.AbstractC2186i
    /* renamed from: f */
    public String mo24778f() {
        return this.f98973a;
    }

    @Override // p000.F90.AbstractC2186i
    /* renamed from: g */
    public Class<?> mo24777g() {
        return this.f98974b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f98973a.hashCode() ^ 1000003) * 1000003) ^ this.f98974b.hashCode()) * 1000003) ^ this.f98975c.hashCode()) * 1000003) ^ this.f98976d.hashCode()) * 1000003;
        Size size = this.f98977e;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f98973a + ", useCaseType=" + this.f98974b + ", sessionConfig=" + this.f98975c + ", useCaseConfig=" + this.f98976d + ", surfaceResolution=" + this.f98977e + "}";
    }
}
