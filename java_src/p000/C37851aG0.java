package p000;

import java.io.IOException;
/* renamed from: aG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37851aG0 extends AbstractC8888W {

    /* renamed from: d */
    public int f50190d;

    public C37851aG0() {
        this.f50190d = -1;
    }

    /* renamed from: H */
    public static boolean m71735H(boolean z) {
        if (z) {
            return z;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    /* renamed from: I */
    public final int m71734I() throws IOException {
        if (this.f50190d < 0) {
            int length = this.f40179b.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f40179b[i2].mo13850c().mo35868x().mo16144s();
            }
            this.f50190d = i;
        }
        return this.f50190d;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        if (z) {
            c6617q.m89167f(49);
        }
        XF0 mo77165d = c6617q.mo77165d();
        int length = this.f40179b.length;
        int i = 0;
        if (this.f50190d >= 0 || length > 16) {
            c6617q.m89155r(m71734I());
            while (i < length) {
                this.f40179b[i].mo13850c().mo35868x().mo16145o(mo77165d, true);
                i++;
            }
            return;
        }
        AbstractC7305S[] abstractC7305SArr = new AbstractC7305S[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC7305S mo35868x = this.f40179b[i3].mo13850c().mo35868x();
            abstractC7305SArr[i3] = mo35868x;
            i2 += mo35868x.mo16144s();
        }
        this.f50190d = i2;
        c6617q.m89155r(i2);
        while (i < length) {
            abstractC7305SArr[i].mo16145o(mo77165d, true);
            i++;
        }
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int m71734I = m71734I();
        return ER5.m109017a(m71734I) + 1 + m71734I;
    }

    @Override // p000.AbstractC8888W, p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return this.f40180c ? this : super.mo35868x();
    }

    @Override // p000.AbstractC8888W, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }

    public C37851aG0(boolean z, InterfaceC1693E[] interfaceC1693EArr) {
        super(m71735H(z), interfaceC1693EArr);
        this.f50190d = -1;
    }
}
