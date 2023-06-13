package p000;

import com.google.android.gms.internal.places.zzaj;
/* renamed from: mj7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45261mj7 {

    /* renamed from: a */
    public final zzaj f98651a;

    /* renamed from: b */
    public final byte[] f98652b;

    public C45261mj7(int i) {
        byte[] bArr = new byte[i];
        this.f98652b = bArr;
        this.f98651a = zzaj.m51065y(bArr);
    }

    /* renamed from: a */
    public final AbstractC43604jv9 m25134a() {
        if (this.f98651a.mo51051b() == 0) {
            return new C39945dl7(this.f98652b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zzaj m25133b() {
        return this.f98651a;
    }

    public /* synthetic */ C45261mj7(int i, Lt9 lt9) {
        this(i);
    }
}
