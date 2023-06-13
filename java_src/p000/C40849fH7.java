package p000;

import java.util.Arrays;
/* renamed from: fH7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C40849fH7 extends VH7 {

    /* renamed from: a */
    public Object[] f79800a = new Object[4];

    /* renamed from: b */
    public int f79801b = 0;

    /* renamed from: c */
    public boolean f79802c;

    public C40849fH7(int i) {
    }

    /* renamed from: a */
    public final C40849fH7 m41615a(Object obj) {
        obj.getClass();
        m41614b(this.f79801b + 1);
        Object[] objArr = this.f79800a;
        int i = this.f79801b;
        this.f79801b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: b */
    public final void m41614b(int i) {
        Object[] objArr = this.f79800a;
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
            this.f79800a = Arrays.copyOf(objArr, i2);
            this.f79802c = false;
        } else if (this.f79802c) {
            this.f79800a = (Object[]) objArr.clone();
            this.f79802c = false;
        }
    }
}
