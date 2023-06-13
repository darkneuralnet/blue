package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
/* renamed from: vT7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50443vT7 implements InterfaceC33572Ij6 {

    /* renamed from: a */
    public boolean f114153a = false;

    /* renamed from: b */
    public boolean f114154b = false;

    /* renamed from: c */
    public C35916Sk1 f114155c;

    /* renamed from: d */
    public final C45099mS7 f114156d;

    public C50443vT7(C45099mS7 c45099mS7) {
        this.f114156d = c45099mS7;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: a */
    public final InterfaceC33572Ij6 mo8615a(String str) throws IOException {
        m8612d();
        this.f114156d.m25584g(this.f114155c, str, this.f114154b);
        return this;
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: b */
    public final InterfaceC33572Ij6 mo8614b(boolean z) throws IOException {
        m8612d();
        this.f114156d.m25583h(this.f114155c, z ? 1 : 0, this.f114154b);
        return this;
    }

    /* renamed from: c */
    public final void m8613c(C35916Sk1 c35916Sk1, boolean z) {
        this.f114153a = false;
        this.f114155c = c35916Sk1;
        this.f114154b = z;
    }

    /* renamed from: d */
    public final void m8612d() {
        if (this.f114153a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f114153a = true;
    }
}
