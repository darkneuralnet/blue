package p000;

import java.util.Arrays;
/* renamed from: lG8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44399lG8 extends BF8 {
    public C44399lG8() {
        super(4);
    }

    /* renamed from: a */
    public final C44399lG8 m27444a(Object... objArr) {
        C44417lI8.m27432b(objArr, 15);
        int i = this.f2151b + 15;
        Object[] objArr2 = this.f2150a;
        int length = objArr2.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f2150a = Arrays.copyOf(objArr2, i2);
            this.f2152c = false;
        } else if (this.f2152c) {
            this.f2150a = (Object[]) objArr2.clone();
            this.f2152c = false;
        }
        System.arraycopy(objArr, 0, this.f2150a, this.f2151b, 15);
        this.f2151b += 15;
        return this;
    }

    /* renamed from: b */
    public final CH8 m27443b() {
        this.f2152c = true;
        return CH8.m112390j(this.f2150a, this.f2151b);
    }
}
