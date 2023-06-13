package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* renamed from: TY7 */
/* loaded from: classes5.dex */
public final class TY7 implements InterfaceC33572Ij6 {

    /* renamed from: a */
    public boolean f35668a = false;

    /* renamed from: b */
    public boolean f35669b = false;

    /* renamed from: c */
    public C35916Sk1 f35670c;

    /* renamed from: d */
    public final MW7 f35671d;

    public TY7(MW7 mw7) {
        this.f35671d = mw7;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: a */
    public final InterfaceC33572Ij6 mo8615a(String str) throws IOException {
        m83397d();
        this.f35671d.m95231g(this.f35670c, str, this.f35669b);
        return this;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: b */
    public final InterfaceC33572Ij6 mo8614b(boolean z) throws IOException {
        m83397d();
        this.f35671d.m95230h(this.f35670c, z ? 1 : 0, this.f35669b);
        return this;
    }

    /* renamed from: c */
    public final void m83398c(C35916Sk1 c35916Sk1, boolean z) {
        this.f35668a = false;
        this.f35670c = c35916Sk1;
        this.f35669b = z;
    }

    /* renamed from: d */
    public final void m83397d() {
        if (this.f35668a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f35668a = true;
    }
}
