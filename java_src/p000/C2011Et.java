package p000;

import androidx.camera.core.InterfaceC11183i;
import p000.C51650xW1;
/* renamed from: Et */
/* loaded from: classes.dex */
public final class C2011Et extends C51650xW1.AbstractC30220a {

    /* renamed from: a */
    public final MD3<InterfaceC11183i> f8255a;

    /* renamed from: b */
    public final int f8256b;

    public C2011Et(MD3<InterfaceC11183i> md3, int i) {
        if (md3 != null) {
            this.f8255a = md3;
            this.f8256b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    @Override // p000.C51650xW1.AbstractC30220a
    /* renamed from: a */
    public int mo5101a() {
        return this.f8256b;
    }

    @Override // p000.C51650xW1.AbstractC30220a
    /* renamed from: b */
    public MD3<InterfaceC11183i> mo5100b() {
        return this.f8255a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C51650xW1.AbstractC30220a)) {
            return false;
        }
        C51650xW1.AbstractC30220a abstractC30220a = (C51650xW1.AbstractC30220a) obj;
        if (this.f8255a.equals(abstractC30220a.mo5100b()) && this.f8256b == abstractC30220a.mo5101a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8255a.hashCode() ^ 1000003) * 1000003) ^ this.f8256b;
    }

    public String toString() {
        return "In{packet=" + this.f8255a + ", jpegQuality=" + this.f8256b + "}";
    }
}
