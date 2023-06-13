package p000;

import android.opengl.EGLSurface;
import p000.C35891Sh3;
/* renamed from: Rt */
/* loaded from: classes.dex */
public final class C7281Rt extends C35891Sh3.AbstractC7507a {

    /* renamed from: a */
    public final EGLSurface f32789a;

    /* renamed from: b */
    public final int f32790b;

    /* renamed from: c */
    public final int f32791c;

    public C7281Rt(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.f32789a = eGLSurface;
            this.f32790b = i;
            this.f32791c = i2;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    @Override // p000.C35891Sh3.AbstractC7507a
    /* renamed from: a */
    public EGLSurface mo85030a() {
        return this.f32789a;
    }

    @Override // p000.C35891Sh3.AbstractC7507a
    /* renamed from: b */
    public int mo85029b() {
        return this.f32791c;
    }

    @Override // p000.C35891Sh3.AbstractC7507a
    /* renamed from: c */
    public int mo85028c() {
        return this.f32790b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C35891Sh3.AbstractC7507a)) {
            return false;
        }
        C35891Sh3.AbstractC7507a abstractC7507a = (C35891Sh3.AbstractC7507a) obj;
        if (this.f32789a.equals(abstractC7507a.mo85030a()) && this.f32790b == abstractC7507a.mo85028c() && this.f32791c == abstractC7507a.mo85029b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f32789a.hashCode() ^ 1000003) * 1000003) ^ this.f32790b) * 1000003) ^ this.f32791c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f32789a + ", width=" + this.f32790b + ", height=" + this.f32791c + "}";
    }
}
