package p000;

import android.util.SparseIntArray;
/* renamed from: Ny1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34872Ny1 {

    /* renamed from: Ny1$a */
    /* loaded from: classes6.dex */
    public static class C5752a {

        /* renamed from: a */
        public int f25415a;

        /* renamed from: b */
        public int f25416b;

        /* renamed from: c */
        public int f25417c;

        public C5752a(int i, int i2, int i3) {
            this.f25415a = i;
            this.f25416b = i2;
            this.f25417c = i3;
        }

        /* renamed from: a */
        public C5752a m93158a(C5752a c5752a) {
            return new C5752a(this.f25415a - c5752a.m93155d(), this.f25416b - c5752a.m93156c(), this.f25417c - c5752a.m93157b());
        }

        /* renamed from: b */
        public int m93157b() {
            return this.f25417c;
        }

        /* renamed from: c */
        public int m93156c() {
            return this.f25416b;
        }

        /* renamed from: d */
        public int m93155d() {
            return this.f25415a;
        }
    }

    /* renamed from: a */
    public static C5752a m93159a(SparseIntArray[] sparseIntArrayArr) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int i3 = 0;
        if (sparseIntArrayArr != null && (sparseIntArray = sparseIntArrayArr[0]) != null) {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i2 += valueAt;
                }
                if (keyAt > 16) {
                    i += valueAt;
                }
                i3++;
            }
            i3 = i4;
        } else {
            i = 0;
            i2 = 0;
        }
        return new C5752a(i3, i, i2);
    }
}
