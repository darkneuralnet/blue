package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* renamed from: m38  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44868m38 implements InterfaceC33572Ij6 {

    /* renamed from: a */
    public boolean f97248a = false;

    /* renamed from: b */
    public boolean f97249b = false;

    /* renamed from: c */
    public C35916Sk1 f97250c;

    /* renamed from: d */
    public final C40707f28 f97251d;

    public C44868m38(C40707f28 c40707f28) {
        this.f97251d = c40707f28;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: a */
    public final InterfaceC33572Ij6 mo8615a(String str) throws IOException {
        m26407d();
        this.f97251d.m42255g(this.f97250c, str, this.f97249b);
        return this;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: b */
    public final InterfaceC33572Ij6 mo8614b(boolean z) throws IOException {
        m26407d();
        this.f97251d.m42254h(this.f97250c, z ? 1 : 0, this.f97249b);
        return this;
    }

    /* renamed from: c */
    public final void m26408c(C35916Sk1 c35916Sk1, boolean z) {
        this.f97248a = false;
        this.f97250c = c35916Sk1;
        this.f97249b = z;
    }

    /* renamed from: d */
    public final void m26407d() {
        if (this.f97248a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f97248a = true;
    }
}
