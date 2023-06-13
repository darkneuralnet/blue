package p000;

import com.google.android.gms.internal.clearcut.zzco;
/* renamed from: nL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45629nL7 extends HK7 {

    /* renamed from: d */
    public final byte[] f99782d;

    /* renamed from: e */
    public final boolean f99783e;

    /* renamed from: f */
    public int f99784f;

    /* renamed from: g */
    public int f99785g;

    /* renamed from: h */
    public int f99786h;

    /* renamed from: i */
    public int f99787i;

    /* renamed from: j */
    public int f99788j;

    public C45629nL7(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f99788j = Integer.MAX_VALUE;
        this.f99782d = bArr;
        this.f99784f = i2 + i;
        this.f99786h = i;
        this.f99787i = i;
        this.f99783e = z;
    }

    @Override // p000.HK7
    /* renamed from: c */
    public final int mo23950c() {
        return this.f99786h - this.f99787i;
    }

    @Override // p000.HK7
    /* renamed from: d */
    public final int mo23949d(int i) throws zzco {
        if (i >= 0) {
            int mo23950c = i + mo23950c();
            int i2 = this.f99788j;
            if (mo23950c <= i2) {
                this.f99788j = mo23950c;
                int i3 = this.f99784f + this.f99785g;
                this.f99784f = i3;
                int i4 = i3 - this.f99787i;
                if (i4 > mo23950c) {
                    int i5 = i4 - mo23950c;
                    this.f99785g = i5;
                    this.f99784f = i3 - i5;
                } else {
                    this.f99785g = 0;
                }
                return i2;
            }
            throw zzco.m51357a();
        }
        throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
