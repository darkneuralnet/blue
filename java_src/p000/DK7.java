package p000;

import java.util.Arrays;
/* renamed from: DK7 */
/* loaded from: classes5.dex */
public final class DK7 extends IH7 {
    public DK7() {
        super(4);
    }

    /* renamed from: a */
    public final DK7 m110573a(Object obj) {
        obj.getClass();
        int i = this.f15092b + 1;
        Object[] objArr = this.f15091a;
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
            this.f15091a = Arrays.copyOf(objArr, i2);
            this.f15093c = false;
        } else if (this.f15093c) {
            this.f15091a = (Object[]) objArr.clone();
            this.f15093c = false;
        }
        Object[] objArr2 = this.f15091a;
        int i3 = this.f15092b;
        this.f15092b = i3 + 1;
        objArr2[i3] = obj;
        return this;
    }

    /* renamed from: b */
    public final AbstractC51557xL7 m110572b() {
        this.f15093c = true;
        return AbstractC51557xL7.m5426j(this.f15091a, this.f15092b);
    }
}
