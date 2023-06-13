package p000;

import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: iB1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42568iB1 implements P31 {

    /* renamed from: a */
    public final byte[] f86833a = new byte[4];

    /* renamed from: b */
    public int f86834b = 0;

    /* renamed from: c */
    public long f86835c;

    @Override // p000.P31
    /* renamed from: c */
    public void mo31323c(byte b) {
        byte[] bArr = this.f86833a;
        int i = this.f86834b;
        int i2 = i + 1;
        this.f86834b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            mo23329j(bArr, 0);
            this.f86834b = 0;
        }
        this.f86835c++;
    }

    @Override // p000.P31
    /* renamed from: f */
    public void mo31322f(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.f86834b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.f86833a;
                int i5 = this.f86834b;
                int i6 = i5 + 1;
                this.f86834b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    mo23329j(bArr2, 0);
                    this.f86834b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & (-4)) + i3;
        while (i3 < i8) {
            mo23329j(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.f86833a;
            int i9 = this.f86834b;
            this.f86834b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.f86835c += max;
    }

    /* renamed from: g */
    public void m34376g() {
        long j = this.f86835c << 3;
        byte b = ByteCompanionObject.MIN_VALUE;
        while (true) {
            mo31323c(b);
            if (this.f86834b == 0) {
                mo23330i(j);
                mo23331h();
                return;
            }
            b = 0;
        }
    }

    /* renamed from: h */
    public abstract void mo23331h();

    /* renamed from: i */
    public abstract void mo23330i(long j);

    /* renamed from: j */
    public abstract void mo23329j(byte[] bArr, int i);

    /* renamed from: k */
    public void mo23328k() {
        this.f86835c = 0L;
        this.f86834b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f86833a;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }
}
