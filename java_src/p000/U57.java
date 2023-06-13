package p000;

import java.util.Arrays;
/* renamed from: U57 */
/* loaded from: classes5.dex */
public final class U57 extends R57 {
    public U57() {
        super(4);
    }

    /* renamed from: a */
    public final U57 m81979a(Object obj) {
        int i = this.f31516b + 1;
        Object[] objArr = this.f31515a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f31515a = Arrays.copyOf(objArr, i2);
            this.f31517c = false;
        } else if (this.f31517c) {
            this.f31515a = (Object[]) objArr.clone();
            this.f31517c = false;
        }
        Object[] objArr2 = this.f31515a;
        int i3 = this.f31516b;
        this.f31516b = i3 + 1;
        objArr2[i3] = obj;
        return this;
    }

    /* renamed from: b */
    public final X57 m81978b() {
        this.f31517c = true;
        return X57.m77410j(this.f31515a, this.f31516b);
    }
}
