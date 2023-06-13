package p000;

import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import p000.C44621lf0;
/* renamed from: qt */
/* loaded from: classes.dex */
public final class C27729qt extends C44621lf0.AbstractC25755b {

    /* renamed from: c */
    public final Size f106027c;

    /* renamed from: d */
    public final int f106028d;

    /* renamed from: e */
    public final C48478s91<C40753f74> f106029e;

    /* renamed from: f */
    public final C48478s91<ImageCaptureException> f106030f;

    public C27729qt(Size size, int i, C48478s91<C40753f74> c48478s91, C48478s91<ImageCaptureException> c48478s912) {
        if (size != null) {
            this.f106027c = size;
            this.f106028d = i;
            if (c48478s91 != null) {
                this.f106029e = c48478s91;
                if (c48478s912 != null) {
                    this.f106030f = c48478s912;
                    return;
                }
                throw new NullPointerException("Null errorEdge");
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null size");
    }

    @Override // p000.C44621lf0.AbstractC25755b
    /* renamed from: b */
    public C48478s91<ImageCaptureException> mo16814b() {
        return this.f106030f;
    }

    @Override // p000.C44621lf0.AbstractC25755b
    /* renamed from: c */
    public int mo16813c() {
        return this.f106028d;
    }

    @Override // p000.C44621lf0.AbstractC25755b
    /* renamed from: d */
    public C48478s91<C40753f74> mo16812d() {
        return this.f106029e;
    }

    @Override // p000.C44621lf0.AbstractC25755b
    /* renamed from: e */
    public Size mo16811e() {
        return this.f106027c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C44621lf0.AbstractC25755b)) {
            return false;
        }
        C44621lf0.AbstractC25755b abstractC25755b = (C44621lf0.AbstractC25755b) obj;
        if (this.f106027c.equals(abstractC25755b.mo16811e()) && this.f106028d == abstractC25755b.mo16813c() && this.f106029e.equals(abstractC25755b.mo16812d()) && this.f106030f.equals(abstractC25755b.mo16814b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f106027c.hashCode() ^ 1000003) * 1000003) ^ this.f106028d) * 1000003) ^ this.f106029e.hashCode()) * 1000003) ^ this.f106030f.hashCode();
    }

    public String toString() {
        return "In{size=" + this.f106027c + ", format=" + this.f106028d + ", requestEdge=" + this.f106029e + ", errorEdge=" + this.f106030f + "}";
    }
}
