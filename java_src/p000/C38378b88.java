package p000;

import com.google.android.gms.internal.auth.zzew;
/* renamed from: b88  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38378b88 extends C47883r88 {

    /* renamed from: b */
    public final byte[] f56976b;

    /* renamed from: c */
    public int f56977c;

    /* renamed from: d */
    public int f56978d;

    /* renamed from: e */
    public int f56979e;

    public /* synthetic */ C38378b88(byte[] bArr, int i, int i2, boolean z, L78 l78) {
        super(null);
        this.f56979e = Integer.MAX_VALUE;
        this.f56976b = bArr;
        this.f56977c = 0;
    }

    /* renamed from: c */
    public final int m64930c(int i) throws zzew {
        int i2 = this.f56979e;
        this.f56979e = 0;
        int i3 = this.f56977c + this.f56978d;
        this.f56977c = i3;
        if (i3 > 0) {
            this.f56978d = i3;
            this.f56977c = 0;
        } else {
            this.f56978d = 0;
        }
        return i2;
    }
}
