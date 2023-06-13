package p000;

import java.util.Arrays;
/* renamed from: w52  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50810w52 {

    /* renamed from: a */
    public int[] f115252a;

    /* renamed from: b */
    public int f115253b;

    public C50810w52() {
        this(10);
    }

    /* renamed from: a */
    public void m7455a(int i) {
        m7454b(this.f115253b + 1);
        int[] iArr = this.f115252a;
        int i2 = this.f115253b;
        iArr[i2] = i;
        this.f115253b = i2 + 1;
    }

    /* renamed from: b */
    public void m7454b(int i) {
        int[] iArr = this.f115252a;
        if (i <= iArr.length) {
            return;
        }
        this.f115252a = Arrays.copyOf(this.f115252a, Math.max(i, iArr.length * 2));
    }

    /* renamed from: c */
    public int[] m7453c() {
        int i = this.f115253b;
        int[] iArr = new int[i];
        System.arraycopy(this.f115252a, 0, iArr, 0, i);
        return iArr;
    }

    public C50810w52(int i) {
        this.f115253b = 0;
        this.f115252a = new int[i];
    }
}
