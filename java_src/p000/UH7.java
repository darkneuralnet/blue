package p000;

import java.util.Arrays;
/* renamed from: UH7 */
/* loaded from: classes5.dex */
public class UH7 extends NI7 {

    /* renamed from: a */
    public Object[] f37184a = new Object[4];

    /* renamed from: b */
    public int f37185b = 0;

    /* renamed from: c */
    public boolean f37186c;

    public UH7(int i) {
    }

    /* renamed from: a */
    public final UH7 m81677a(Object obj) {
        obj.getClass();
        m81676b(this.f37185b + 1);
        Object[] objArr = this.f37184a;
        int i = this.f37185b;
        this.f37185b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: b */
    public final void m81676b(int i) {
        Object[] objArr = this.f37184a;
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
            this.f37184a = Arrays.copyOf(objArr, i2);
            this.f37186c = false;
        } else if (this.f37186c) {
            this.f37184a = (Object[]) objArr.clone();
            this.f37186c = false;
        }
    }
}
