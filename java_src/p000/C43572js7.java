package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* renamed from: js7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43572js7 implements InterfaceC33572Ij6 {

    /* renamed from: a */
    public boolean f93495a = false;

    /* renamed from: b */
    public boolean f93496b = false;

    /* renamed from: c */
    public C35916Sk1 f93497c;

    /* renamed from: d */
    public final C36660Vo7 f93498d;

    public C43572js7(C36660Vo7 c36660Vo7) {
        this.f93498d = c36660Vo7;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: a */
    public final InterfaceC33572Ij6 mo8615a(String str) throws IOException {
        m29795d();
        this.f93498d.m79407g(this.f93497c, str, this.f93496b);
        return this;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: b */
    public final InterfaceC33572Ij6 mo8614b(boolean z) throws IOException {
        m29795d();
        this.f93498d.m79406h(this.f93497c, z ? 1 : 0, this.f93496b);
        return this;
    }

    /* renamed from: c */
    public final void m29796c(C35916Sk1 c35916Sk1, boolean z) {
        this.f93495a = false;
        this.f93497c = c35916Sk1;
        this.f93496b = z;
    }

    /* renamed from: d */
    public final void m29795d() {
        if (this.f93495a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f93495a = true;
    }
}
