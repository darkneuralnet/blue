package p000;

import java.util.Iterator;
/* renamed from: SL8 */
/* loaded from: classes6.dex */
public final class SL8 {

    /* renamed from: a */
    public final BH8 f33504a;

    /* renamed from: b */
    public final boolean f33505b;

    /* renamed from: c */
    public final C42665iL8 f33506c;

    public SL8(C42665iL8 c42665iL8, boolean z, BH8 bh8, int i, byte[] bArr) {
        this.f33506c = c42665iL8;
        this.f33505b = z;
        this.f33504a = bh8;
    }

    /* renamed from: c */
    public static SL8 m85706c(String str) {
        return new SL8(new C42665iL8(new C43806kG8("+".charAt(0))), false, IG8.f14952b, Integer.MAX_VALUE, null);
    }

    /* renamed from: e */
    public static /* synthetic */ Iterator m85704e(SL8 sl8, CharSequence charSequence) {
        return new WK8(sl8.f33506c, sl8, charSequence);
    }

    /* renamed from: b */
    public final SL8 m85707b() {
        return new SL8(this.f33506c, true, this.f33504a, Integer.MAX_VALUE, null);
    }

    /* renamed from: d */
    public final Iterable<String> m85705d(CharSequence charSequence) {
        charSequence.getClass();
        return new C49780uL8(this, charSequence);
    }
}
