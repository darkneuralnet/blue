package p000;

import java.io.IOException;
/* renamed from: B */
/* loaded from: classes8.dex */
public abstract class AbstractC0366B extends AbstractC7305S {

    /* renamed from: b */
    public final boolean f1508b;

    /* renamed from: c */
    public final int f1509c;

    /* renamed from: d */
    public final byte[] f1510d;

    public AbstractC0366B(boolean z, int i, byte[] bArr) {
        this.f1508b = z;
        this.f1509c = i;
        this.f1510d = C0210Ao.m115251d(bArr);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        boolean z = this.f1508b;
        return ((z ? 1 : 0) ^ this.f1509c) ^ C0210Ao.m115244k(this.f1510d);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof AbstractC0366B) {
            AbstractC0366B abstractC0366B = (AbstractC0366B) abstractC7305S;
            return this.f1508b == abstractC0366B.f1508b && this.f1509c == abstractC0366B.f1509c && C0210Ao.m115254a(this.f1510d, abstractC0366B.f1510d);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89160m(z, this.f1508b ? 96 : 64, this.f1509c, this.f1510d);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        return ER5.m109016b(this.f1509c) + ER5.m109017a(this.f1510d.length) + this.f1510d.length;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (mo16143w()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(m114803z()));
        stringBuffer.append("]");
        if (this.f1510d != null) {
            stringBuffer.append(" #");
            str = LL1.m97052c(this.f1510d);
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
        return this.f1508b;
    }

    /* renamed from: z */
    public int m114803z() {
        return this.f1509c;
    }
}
