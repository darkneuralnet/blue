package p000;

import java.io.IOException;
/* renamed from: nG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45577nG0 extends AbstractC8166U {

    /* renamed from: c */
    public int f99701c;

    public C45577nG0() {
        this.f99701c = -1;
    }

    /* renamed from: E */
    public final int m24101E() throws IOException {
        if (this.f99701c < 0) {
            int length = this.f36590b.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f36590b[i2].mo13850c().mo16142y().mo16144s();
            }
            this.f99701c = i;
        }
        return this.f99701c;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        if (z) {
            c6617q.m89167f(48);
        }
        C6617Q mo27601e = c6617q.mo27601e();
        int length = this.f36590b.length;
        int i = 0;
        if (this.f99701c >= 0 || length > 16) {
            c6617q.m89155r(m24101E());
            while (i < length) {
                mo27601e.mo27600u(this.f36590b[i].mo13850c(), true);
                i++;
            }
            return;
        }
        AbstractC7305S[] abstractC7305SArr = new AbstractC7305S[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC7305S mo16142y = this.f36590b[i3].mo13850c().mo16142y();
            abstractC7305SArr[i3] = mo16142y;
            i2 += mo16142y.mo16144s();
        }
        this.f99701c = i2;
        c6617q.m89155r(i2);
        while (i < length) {
            mo27601e.mo27600u(abstractC7305SArr[i], true);
            i++;
        }
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int m24101E = m24101E();
        return ER5.m109017a(m24101E) + 1 + m24101E;
    }

    @Override // p000.AbstractC8166U, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }

    public C45577nG0(C2042F c2042f) {
        super(c2042f);
        this.f99701c = -1;
    }

    public C45577nG0(InterfaceC1693E[] interfaceC1693EArr, boolean z) {
        super(interfaceC1693EArr, z);
        this.f99701c = -1;
    }
}
