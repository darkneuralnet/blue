package p000;

import android.graphics.Bitmap;
import p000.InterfaceC49099tC1;
/* renamed from: sC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48506sC1 implements InterfaceC49099tC1.InterfaceC28552a {

    /* renamed from: a */
    public final InterfaceC20044eU f108440a;

    /* renamed from: b */
    public final InterfaceC28820to f108441b;

    public C48506sC1(InterfaceC20044eU interfaceC20044eU, InterfaceC28820to interfaceC28820to) {
        this.f108440a = interfaceC20044eU;
        this.f108441b = interfaceC28820to;
    }

    @Override // p000.InterfaceC49099tC1.InterfaceC28552a
    /* renamed from: a */
    public byte[] mo12907a(int i) {
        InterfaceC28820to interfaceC28820to = this.f108441b;
        if (interfaceC28820to == null) {
            return new byte[i];
        }
        return (byte[]) interfaceC28820to.mo11761c(i, byte[].class);
    }

    @Override // p000.InterfaceC49099tC1.InterfaceC28552a
    /* renamed from: b */
    public Bitmap mo12906b(int i, int i2, Bitmap.Config config) {
        return this.f108440a.mo16191e(i, i2, config);
    }

    @Override // p000.InterfaceC49099tC1.InterfaceC28552a
    /* renamed from: c */
    public void mo12905c(Bitmap bitmap) {
        this.f108440a.mo16193c(bitmap);
    }

    @Override // p000.InterfaceC49099tC1.InterfaceC28552a
    /* renamed from: d */
    public int[] mo12904d(int i) {
        InterfaceC28820to interfaceC28820to = this.f108441b;
        if (interfaceC28820to == null) {
            return new int[i];
        }
        return (int[]) interfaceC28820to.mo11761c(i, int[].class);
    }

    @Override // p000.InterfaceC49099tC1.InterfaceC28552a
    /* renamed from: e */
    public void mo12903e(byte[] bArr) {
        InterfaceC28820to interfaceC28820to = this.f108441b;
        if (interfaceC28820to == null) {
            return;
        }
        interfaceC28820to.put(bArr);
    }

    @Override // p000.InterfaceC49099tC1.InterfaceC28552a
    /* renamed from: f */
    public void mo12902f(int[] iArr) {
        InterfaceC28820to interfaceC28820to = this.f108441b;
        if (interfaceC28820to == null) {
            return;
        }
        interfaceC28820to.put(iArr);
    }
}
