package p000;

import java.util.Arrays;
/* renamed from: ES8 */
/* loaded from: classes5.dex */
public class ES8 extends PS8 {

    /* renamed from: a */
    public Object[] f7510a = new Object[4];

    /* renamed from: b */
    public int f7511b = 0;

    /* renamed from: c */
    public boolean f7512c;

    public ES8(int i) {
    }

    /* renamed from: a */
    public final ES8 m108965a(Object obj) {
        obj.getClass();
        m108964b(this.f7511b + 1);
        Object[] objArr = this.f7510a;
        int i = this.f7511b;
        this.f7511b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: b */
    public final void m108964b(int i) {
        Object[] objArr = this.f7510a;
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
            this.f7510a = Arrays.copyOf(objArr, i2);
            this.f7512c = false;
        } else if (this.f7512c) {
            this.f7510a = (Object[]) objArr.clone();
            this.f7512c = false;
        }
    }
}
