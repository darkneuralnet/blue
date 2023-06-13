package p000;

import com.google.android.gms.internal.clearcut.zzbn;
/* renamed from: OH7 */
/* loaded from: classes5.dex */
public final class OH7 {

    /* renamed from: a */
    public final zzbn f26299a;

    /* renamed from: b */
    public final byte[] f26300b;

    public OH7(int i) {
        byte[] bArr = new byte[i];
        this.f26300b = bArr;
        this.f26299a = zzbn.m51427S(bArr);
    }

    /* renamed from: a */
    public final TD7 m92563a() {
        if (this.f26299a.mo51360u() == 0) {
            return new C50353vJ7(this.f26300b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zzbn m92562b() {
        return this.f26299a;
    }

    public /* synthetic */ OH7(int i, C52087yE7 c52087yE7) {
        this(i);
    }
}
