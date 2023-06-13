package p000;

import java.io.IOException;
import kotlin.KotlinVersion;
/* renamed from: MF0 */
/* loaded from: classes8.dex */
public class MF0 extends AbstractC0808C {
    public MF0(InterfaceC1693E interfaceC1693E) throws IOException {
        super(interfaceC1693E.mo13850c().m96022h("DER"), 0);
    }

    /* renamed from: E */
    public static MF0 m95473E(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new MF0(bArr2, b);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* renamed from: F */
    public static MF0 m95472F(AbstractC10088Z abstractC10088Z, boolean z) {
        AbstractC7305S m73929A = abstractC10088Z.m73929A();
        return (z || (m73929A instanceof MF0)) ? m95471G(m73929A) : m95473E(AbstractC5803O.m93018A(m73929A).m93017C());
    }

    /* renamed from: G */
    public static MF0 m95471G(Object obj) {
        if (obj == null || (obj instanceof MF0)) {
            return (MF0) obj;
        }
        if (obj instanceof C42612iG0) {
            C42612iG0 c42612iG0 = (C42612iG0) obj;
            return new MF0(c42612iG0.f3196b, c42612iG0.f3197c);
        } else if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        } else {
            try {
                return (MF0) AbstractC7305S.m86134v((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        }
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        int i;
        byte[] bArr = this.f3196b;
        int length = bArr.length;
        if (length != 0 && (i = this.f3197c) != 0) {
            int i2 = length - 1;
            byte b = bArr[i2];
            if (b != ((byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i) & b))) {
                c6617q.m89161l(z, 3, (byte) i, bArr, 0, i2, (byte) (b & (KotlinVersion.MAX_COMPONENT_VALUE << i)));
                return;
            }
        }
        c6617q.m89162k(z, 3, (byte) this.f3197c, bArr);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f3196b.length + 1) + 1 + this.f3196b.length + 1;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    @Override // p000.AbstractC0808C, p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return this;
    }

    @Override // p000.AbstractC0808C, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }

    public MF0(byte[] bArr) {
        this(bArr, 0);
    }

    public MF0(byte[] bArr, int i) {
        super(bArr, i);
    }
}
