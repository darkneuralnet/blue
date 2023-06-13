package p000;

import com.google.android.gms.internal.recaptcha.zzhu;
/* renamed from: kB8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43761kB8 extends AbstractC33943Jy8<C43761kB8> implements InterfaceC41864gz8 {

    /* renamed from: f */
    public static final zzhu f94062f = new zzhu();

    /* renamed from: e */
    public final zzhu f94063e;

    public C43761kB8() {
        super("", C32782Ez8.m108153b().m108152c());
        this.f94063e = f94062f;
    }

    @Override // p000.PC8
    /* renamed from: D2 */
    public final PC8 mo7268D2(String str, EC8 ec8) {
        J38 j38 = FE8.f9066a;
        return mo7267T0(str, ec8, true);
    }

    @Override // p000.InterfaceC41864gz8
    /* renamed from: T0 */
    public final PC8 mo7267T0(String str, EC8 ec8, boolean z) {
        if (z) {
            J38 j38 = FE8.f9066a;
        }
        return new C50875wB8(str, this, ec8, z);
    }

    @Override // p000.InterfaceC41864gz8
    public final /* bridge */ /* synthetic */ Exception zze() {
        return this.f94063e;
    }
}
