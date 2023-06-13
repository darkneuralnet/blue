package p000;

import java.io.IOException;
/* renamed from: pG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46763pG0 extends AbstractC8888W {

    /* renamed from: d */
    public int f103362d;

    public C46763pG0() {
        this.f103362d = -1;
    }

    /* renamed from: H */
    public final int m19683H() throws IOException {
        if (this.f103362d < 0) {
            int length = this.f40179b.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f40179b[i2].mo13850c().mo16142y().mo16144s();
            }
            this.f103362d = i;
        }
        return this.f103362d;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        if (z) {
            c6617q.m89167f(49);
        }
        C6617Q mo27601e = c6617q.mo27601e();
        int length = this.f40179b.length;
        int i = 0;
        if (this.f103362d >= 0 || length > 16) {
            c6617q.m89155r(m19683H());
            while (i < length) {
                mo27601e.mo27600u(this.f40179b[i].mo13850c(), true);
                i++;
            }
            return;
        }
        AbstractC7305S[] abstractC7305SArr = new AbstractC7305S[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC7305S mo16142y = this.f40179b[i3].mo13850c().mo16142y();
            abstractC7305SArr[i3] = mo16142y;
            i2 += mo16142y.mo16144s();
        }
        this.f103362d = i2;
        c6617q.m89155r(i2);
        while (i < length) {
            mo27601e.mo27600u(abstractC7305SArr[i], true);
            i++;
        }
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int m19683H = m19683H();
        return ER5.m109017a(m19683H) + 1 + m19683H;
    }

    @Override // p000.AbstractC8888W, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }

    public C46763pG0(InterfaceC1693E interfaceC1693E) {
        super(interfaceC1693E);
        this.f103362d = -1;
    }

    public C46763pG0(C2042F c2042f) {
        super(c2042f, false);
        this.f103362d = -1;
    }

    public C46763pG0(boolean z, InterfaceC1693E[] interfaceC1693EArr) {
        super(z, interfaceC1693EArr);
        this.f103362d = -1;
    }
}
