package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* renamed from: R94 */
/* loaded from: classes6.dex */
public class R94 implements InterfaceC33572Ij6 {

    /* renamed from: a */
    public boolean f31612a = false;

    /* renamed from: b */
    public boolean f31613b = false;

    /* renamed from: c */
    public C35916Sk1 f31614c;

    /* renamed from: d */
    public final O94 f31615d;

    public R94(O94 o94) {
        this.f31615d = o94;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: a */
    public InterfaceC33572Ij6 mo8615a(String str) throws IOException {
        m87232c();
        this.f31615d.m92705h(this.f31614c, str, this.f31613b);
        return this;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: b */
    public InterfaceC33572Ij6 mo8614b(boolean z) throws IOException {
        m87232c();
        this.f31615d.m92699n(this.f31614c, z, this.f31613b);
        return this;
    }

    /* renamed from: c */
    public final void m87232c() {
        if (!this.f31612a) {
            this.f31612a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: d */
    public void m87231d(C35916Sk1 c35916Sk1, boolean z) {
        this.f31612a = false;
        this.f31614c = c35916Sk1;
        this.f31613b = z;
    }
}
