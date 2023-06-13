package p000;

import java.io.IOException;
/* renamed from: T */
/* loaded from: classes8.dex */
public abstract class AbstractC7627T extends AbstractC7305S {

    /* renamed from: b */
    public final boolean f34595b;

    /* renamed from: c */
    public final int f34596c;

    /* renamed from: d */
    public final byte[] f34597d;

    public AbstractC7627T(boolean z, int i, byte[] bArr) {
        this.f34595b = z;
        this.f34596c = i;
        this.f34597d = C0210Ao.m115251d(bArr);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        boolean z = this.f34595b;
        return ((z ? 1 : 0) ^ this.f34596c) ^ C0210Ao.m115244k(this.f34597d);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof AbstractC7627T) {
            AbstractC7627T abstractC7627T = (AbstractC7627T) abstractC7305S;
            return this.f34595b == abstractC7627T.f34595b && this.f34596c == abstractC7627T.f34596c && C0210Ao.m115254a(this.f34597d, abstractC7627T.f34597d);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89160m(z, this.f34595b ? 224 : 192, this.f34596c, this.f34597d);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        return ER5.m109016b(this.f34596c) + ER5.m109017a(this.f34597d.length) + this.f34597d.length;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (mo16143w()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(m84495z()));
        stringBuffer.append("]");
        if (this.f34597d != null) {
            stringBuffer.append(" #");
            str = LL1.m97052c(this.f34597d);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return this.f34595b;
    }

    /* renamed from: z */
    public int m84495z() {
        return this.f34596c;
    }
}
