package p000;

import com.google.android.gms.internal.places.zzbk;
/* renamed from: Go7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33150Go7 extends AbstractC36642Vm7 {

    /* renamed from: d */
    public final byte[] f12494d;

    /* renamed from: e */
    public final boolean f12495e;

    /* renamed from: f */
    public int f12496f;

    /* renamed from: g */
    public int f12497g;

    /* renamed from: h */
    public int f12498h;

    /* renamed from: i */
    public int f12499i;

    /* renamed from: j */
    public int f12500j;

    public C33150Go7(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f12500j = Integer.MAX_VALUE;
        this.f12494d = bArr;
        this.f12496f = i2 + i;
        this.f12498h = i;
        this.f12499i = i;
        this.f12495e = z;
    }

    @Override // p000.AbstractC36642Vm7
    /* renamed from: a */
    public final int mo79426a() {
        return this.f12498h - this.f12499i;
    }

    @Override // p000.AbstractC36642Vm7
    /* renamed from: d */
    public final int mo79423d(int i) throws zzbk {
        if (i >= 0) {
            int mo79426a = i + mo79426a();
            int i2 = this.f12500j;
            if (mo79426a <= i2) {
                this.f12500j = mo79426a;
                int i3 = this.f12496f + this.f12497g;
                this.f12496f = i3;
                int i4 = i3 - this.f12499i;
                if (i4 > mo79426a) {
                    int i5 = i4 - mo79426a;
                    this.f12497g = i5;
                    this.f12496f = i3 - i5;
                } else {
                    this.f12497g = 0;
                }
                return i2;
            }
            throw zzbk.m51038a();
        }
        throw zzbk.m51037b();
    }
}
