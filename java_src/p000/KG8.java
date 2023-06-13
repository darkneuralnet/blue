package p000;

import java.util.Arrays;
/* renamed from: KG8 */
/* loaded from: classes5.dex */
public class KG8 extends C46241oN8 {

    /* renamed from: a */
    public Object[] f19335a = new Object[4];

    /* renamed from: b */
    public int f19336b = 0;

    /* renamed from: c */
    public boolean f19337c;

    public KG8(int i) {
    }

    /* renamed from: a */
    public final KG8 m99054a(Object obj) {
        obj.getClass();
        m99053b(this.f19336b + 1);
        Object[] objArr = this.f19335a;
        int i = this.f19336b;
        this.f19336b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: b */
    public final void m99053b(int i) {
        Object[] objArr = this.f19335a;
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
            this.f19335a = Arrays.copyOf(objArr, i2);
            this.f19337c = false;
        } else if (this.f19337c) {
            this.f19335a = (Object[]) objArr.clone();
            this.f19337c = false;
        }
    }
}
