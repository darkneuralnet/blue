package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
/* renamed from: h79  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41944h79 extends C50837w79 {

    /* renamed from: b */
    public final byte[] f84721b;

    /* renamed from: c */
    public int f84722c;

    /* renamed from: d */
    public int f84723d;

    /* renamed from: e */
    public int f84724e;

    public /* synthetic */ C41944h79(byte[] bArr, int i, int i2, boolean z, C37776a79 c37776a79) {
        super(null);
        this.f84724e = Integer.MAX_VALUE;
        this.f84721b = bArr;
        this.f84722c = 0;
    }

    /* renamed from: c */
    public final int m36836c(int i) throws zzov {
        int i2 = this.f84724e;
        this.f84724e = 0;
        int i3 = this.f84722c + this.f84723d;
        this.f84722c = i3;
        if (i3 > 0) {
            this.f84723d = i3;
            this.f84722c = 0;
        } else {
            this.f84723d = 0;
        }
        return i2;
    }
}
