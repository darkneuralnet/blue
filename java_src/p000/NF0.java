package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* renamed from: NF0 */
/* loaded from: classes8.dex */
public class NF0 extends AbstractC2996H {
    public NF0(C5448N c5448n, C4295K c4295k, AbstractC7305S abstractC7305S, int i, AbstractC7305S abstractC7305S2) {
        super(c5448n, c4295k, abstractC7305S, i, abstractC7305S2);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C5448N c5448n = this.f12702b;
        if (c5448n != null) {
            byteArrayOutputStream.write(c5448n.m96022h("DER"));
        }
        C4295K c4295k = this.f12703c;
        if (c4295k != null) {
            byteArrayOutputStream.write(c4295k.m96022h("DER"));
        }
        AbstractC7305S abstractC7305S = this.f12704d;
        if (abstractC7305S != null) {
            byteArrayOutputStream.write(abstractC7305S.m96022h("DER"));
        }
        byteArrayOutputStream.write(new C39037cG0(true, this.f12705e, this.f12706f).m96022h("DER"));
        c6617q.m89160m(z, 32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // p000.AbstractC2996H, p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        return getEncoded().length;
    }

    @Override // p000.AbstractC2996H, p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return this;
    }

    @Override // p000.AbstractC2996H, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }
}
