package p000;

import java.util.Arrays;
/* renamed from: Nf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C34707Nf7 extends C34248Lg7 {

    /* renamed from: a */
    public Object[] f24964a = new Object[4];

    /* renamed from: b */
    public int f24965b = 0;

    /* renamed from: c */
    public boolean f24966c;

    public C34707Nf7(int i) {
    }

    /* renamed from: a */
    public final C34707Nf7 m93590a(Object obj) {
        obj.getClass();
        m93589b(this.f24965b + 1);
        Object[] objArr = this.f24964a;
        int i = this.f24965b;
        this.f24965b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: b */
    public final void m93589b(int i) {
        Object[] objArr = this.f24964a;
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
            this.f24964a = Arrays.copyOf(objArr, i2);
            this.f24966c = false;
        } else if (this.f24966c) {
            this.f24964a = (Object[]) objArr.clone();
            this.f24966c = false;
        }
    }
}
