package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* renamed from: K39 */
/* loaded from: classes5.dex */
public final class K39 implements InterfaceC33572Ij6 {

    /* renamed from: a */
    public boolean f19010a = false;

    /* renamed from: b */
    public boolean f19011b = false;

    /* renamed from: c */
    public C35916Sk1 f19012c;

    /* renamed from: d */
    public final M29 f19013d;

    public K39(M29 m29) {
        this.f19013d = m29;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: a */
    public final InterfaceC33572Ij6 mo8615a(String str) throws IOException {
        m99276d();
        this.f19013d.m95964g(this.f19012c, str, this.f19011b);
        return this;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: b */
    public final InterfaceC33572Ij6 mo8614b(boolean z) throws IOException {
        m99276d();
        this.f19013d.m95963h(this.f19012c, z ? 1 : 0, this.f19011b);
        return this;
    }

    /* renamed from: c */
    public final void m99277c(C35916Sk1 c35916Sk1, boolean z) {
        this.f19010a = false;
        this.f19012c = c35916Sk1;
        this.f19011b = z;
    }

    /* renamed from: d */
    public final void m99276d() {
        if (this.f19010a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f19010a = true;
    }
}
