package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.C11243o;
/* renamed from: androidx.camera.core.b */
/* loaded from: classes.dex */
public final class C11150b extends C11243o.AbstractC11250g {

    /* renamed from: a */
    public final int f52437a;

    /* renamed from: b */
    public final Surface f52438b;

    public C11150b(int i, Surface surface) {
        this.f52437a = i;
        if (surface != null) {
            this.f52438b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    @Override // androidx.camera.core.C11243o.AbstractC11250g
    /* renamed from: a */
    public int mo69088a() {
        return this.f52437a;
    }

    @Override // androidx.camera.core.C11243o.AbstractC11250g
    /* renamed from: b */
    public Surface mo69087b() {
        return this.f52438b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11243o.AbstractC11250g)) {
            return false;
        }
        C11243o.AbstractC11250g abstractC11250g = (C11243o.AbstractC11250g) obj;
        if (this.f52437a == abstractC11250g.mo69088a() && this.f52438b.equals(abstractC11250g.mo69087b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f52437a ^ 1000003) * 1000003) ^ this.f52438b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f52437a + ", surface=" + this.f52438b + "}";
    }
}
