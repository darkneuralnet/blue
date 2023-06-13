package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* renamed from: TS7 */
/* loaded from: classes5.dex */
public final class TS7 implements InterfaceC33572Ij6 {

    /* renamed from: a */
    public boolean f35509a = false;

    /* renamed from: b */
    public boolean f35510b = false;

    /* renamed from: c */
    public C35916Sk1 f35511c;

    /* renamed from: d */
    public final JR7 f35512d;

    public TS7(JR7 jr7) {
        this.f35512d = jr7;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: a */
    public final InterfaceC33572Ij6 mo8615a(String str) throws IOException {
        m83585d();
        this.f35512d.m100455g(this.f35511c, str, this.f35510b);
        return this;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: b */
    public final InterfaceC33572Ij6 mo8614b(boolean z) throws IOException {
        m83585d();
        this.f35512d.m100454h(this.f35511c, z ? 1 : 0, this.f35510b);
        return this;
    }

    /* renamed from: c */
    public final void m83586c(C35916Sk1 c35916Sk1, boolean z) {
        this.f35509a = false;
        this.f35511c = c35916Sk1;
        this.f35510b = z;
    }

    /* renamed from: d */
    public final void m83585d() {
        if (this.f35509a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f35509a = true;
    }
}
