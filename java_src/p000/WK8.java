package p000;
/* renamed from: WK8 */
/* loaded from: classes6.dex */
public final class WK8 extends GL8 {

    /* renamed from: i */
    public final /* synthetic */ C42665iL8 f40774i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WK8(C42665iL8 c42665iL8, SL8 sl8, CharSequence charSequence) {
        super(sl8, charSequence);
        this.f40774i = c42665iL8;
    }

    @Override // p000.GL8
    /* renamed from: c */
    public final int mo78583c(int i) {
        return i + 1;
    }

    @Override // p000.GL8
    /* renamed from: d */
    public final int mo78582d(int i) {
        BH8 bh8 = this.f40774i.f87193a;
        CharSequence charSequence = this.f11714d;
        int length = charSequence.length();
        C52142yK8.m3663b(i, length, "index");
        while (i < length) {
            if (!bh8.mo29109a(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
