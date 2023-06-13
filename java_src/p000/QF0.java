package p000;

import java.io.IOException;
/* renamed from: QF0 */
/* loaded from: classes8.dex */
public class QF0 extends C3309I {
    public QF0(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: E */
    public final byte[] m88699E() {
        byte[] bArr = this.f14307b;
        if (bArr[bArr.length - 1] == 90) {
            if (!m103090A()) {
                byte[] bArr2 = this.f14307b;
                byte[] bArr3 = new byte[bArr2.length + 4];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
                System.arraycopy(C46876pS5.m19296d("0000Z"), 0, bArr3, this.f14307b.length - 1, 5);
                return bArr3;
            } else if (!m103089C()) {
                byte[] bArr4 = this.f14307b;
                byte[] bArr5 = new byte[bArr4.length + 2];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
                System.arraycopy(C46876pS5.m19296d("00Z"), 0, bArr5, this.f14307b.length - 1, 3);
                return bArr5;
            } else if (m103087z()) {
                int length = this.f14307b.length - 2;
                while (length > 0 && this.f14307b[length] == 48) {
                    length--;
                }
                byte[] bArr6 = this.f14307b;
                if (bArr6[length] == 46) {
                    byte[] bArr7 = new byte[length + 1];
                    System.arraycopy(bArr6, 0, bArr7, 0, length);
                    bArr7[length] = 90;
                    return bArr7;
                }
                byte[] bArr8 = new byte[length + 2];
                int i = length + 1;
                System.arraycopy(bArr6, 0, bArr8, 0, i);
                bArr8[i] = 90;
                return bArr8;
            } else {
                return this.f14307b;
            }
        }
        return bArr;
    }

    @Override // p000.C3309I, p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 24, m88699E());
    }

    @Override // p000.C3309I, p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        int length = m88699E().length;
        return ER5.m109017a(length) + 1 + length;
    }

    @Override // p000.C3309I, p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return this;
    }

    @Override // p000.C3309I, p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }
}
