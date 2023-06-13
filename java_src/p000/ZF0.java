package p000;

import java.io.IOException;
/* renamed from: ZF0 */
/* loaded from: classes8.dex */
public class ZF0 extends AbstractC8166U {

    /* renamed from: c */
    public int f48026c;

    public ZF0() {
        this.f48026c = -1;
    }

    /* renamed from: E */
    public final int m73518E() throws IOException {
        if (this.f48026c < 0) {
            int length = this.f36590b.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f36590b[i2].mo13850c().mo35868x().mo16144s();
            }
            this.f48026c = i;
        }
        return this.f48026c;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        if (z) {
            c6617q.m89167f(48);
        }
        XF0 mo77165d = c6617q.mo77165d();
        int length = this.f36590b.length;
        int i = 0;
        if (this.f48026c >= 0 || length > 16) {
            c6617q.m89155r(m73518E());
            while (i < length) {
                this.f36590b[i].mo13850c().mo35868x().mo16145o(mo77165d, true);
                i++;
            }
            return;
        }
        AbstractC7305S[] abstractC7305SArr = new AbstractC7305S[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC7305S mo35868x = this.f36590b[i3].mo13850c().mo35868x();
            abstractC7305SArr[i3] = mo35868x;
            i2 += mo35868x.mo16144s();
        }
        this.f48026c = i2;
        c6617q.m89155r(i2);
        while (i < length) {
            abstractC7305SArr[i].mo16145o(mo77165d, true);
            i++;
        }
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int m73518E = m73518E();
        return ER5.m109017a(m73518E) + 1 + m73518E;
    }

    @Override // p000.AbstractC8166U, p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return this;
    }

    @Override // p000.AbstractC8166U, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }

    public ZF0(C2042F c2042f) {
        super(c2042f);
        this.f48026c = -1;
    }

    public ZF0(InterfaceC1693E[] interfaceC1693EArr, boolean z) {
        super(interfaceC1693EArr, z);
        this.f48026c = -1;
    }
}
