package p000;

import java.io.IOException;
/* renamed from: VF0 */
/* loaded from: classes8.dex */
public class VF0 extends AbstractC5803O {
    public VF0(InterfaceC1693E interfaceC1693E) throws IOException {
        super(interfaceC1693E.mo13850c().m96022h("DER"));
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 4, this.f25500b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f25500b.length) + 1 + this.f25500b.length;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    @Override // p000.AbstractC5803O, p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return this;
    }

    @Override // p000.AbstractC5803O, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }

    public VF0(byte[] bArr) {
        super(bArr);
    }
}
