package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
/* renamed from: Ea7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32556Ea7 extends C33024Ga7 {

    /* renamed from: b */
    public final byte[] f7753b;

    /* renamed from: c */
    public int f7754c;

    /* renamed from: d */
    public int f7755d;

    /* renamed from: e */
    public int f7756e;

    public /* synthetic */ C32556Ea7(byte[] bArr, int i, int i2, boolean z, C32322Da7 c32322Da7) {
        super(null);
        this.f7756e = Integer.MAX_VALUE;
        this.f7753b = bArr;
        this.f7754c = 0;
    }

    /* renamed from: c */
    public final int m108743c(int i) throws zbuw {
        int i2 = this.f7756e;
        this.f7756e = 0;
        int i3 = this.f7754c + this.f7755d;
        this.f7754c = i3;
        if (i3 > 0) {
            this.f7755d = i3;
            this.f7754c = i3 - i3;
        } else {
            this.f7755d = 0;
        }
        return i2;
    }
}
