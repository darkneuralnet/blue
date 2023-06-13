package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* renamed from: s08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48395s08 implements InterfaceC33572Ij6 {

    /* renamed from: a */
    public boolean f108130a = false;

    /* renamed from: b */
    public boolean f108131b = false;

    /* renamed from: c */
    public C35916Sk1 f108132c;

    /* renamed from: d */
    public final C45755nZ7 f108133d;

    public C48395s08(C45755nZ7 c45755nZ7) {
        this.f108133d = c45755nZ7;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: a */
    public final InterfaceC33572Ij6 mo8615a(String str) throws IOException {
        m14890d();
        this.f108133d.m23526g(this.f108132c, str, this.f108131b);
        return this;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: b */
    public final InterfaceC33572Ij6 mo8614b(boolean z) throws IOException {
        m14890d();
        this.f108133d.m23525h(this.f108132c, z ? 1 : 0, this.f108131b);
        return this;
    }

    /* renamed from: c */
    public final void m14891c(C35916Sk1 c35916Sk1, boolean z) {
        this.f108130a = false;
        this.f108132c = c35916Sk1;
        this.f108131b = z;
    }

    /* renamed from: d */
    public final void m14890d() {
        if (this.f108130a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f108130a = true;
    }
}
