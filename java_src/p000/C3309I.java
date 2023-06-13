package p000;

import java.io.IOException;
/* renamed from: I */
/* loaded from: classes8.dex */
public class C3309I extends AbstractC7305S {

    /* renamed from: b */
    public byte[] f14307b;

    public C3309I(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f14307b = bArr;
        if (!m103088D(0) || !m103088D(1) || !m103088D(2) || !m103088D(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    /* renamed from: A */
    public boolean m103090A() {
        return m103088D(10) && m103088D(11);
    }

    /* renamed from: C */
    public boolean m103089C() {
        return m103088D(12) && m103088D(13);
    }

    /* renamed from: D */
    public final boolean m103088D(int i) {
        byte b;
        byte[] bArr = this.f14307b;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f14307b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C3309I) {
            return C0210Ao.m115254a(this.f14307b, ((C3309I) abstractC7305S).f14307b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 24, this.f14307b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        int length = this.f14307b.length;
        return ER5.m109017a(length) + 1 + length;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return new QF0(this.f14307b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return new QF0(this.f14307b);
    }

    /* renamed from: z */
    public boolean m103087z() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f14307b;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }
}
