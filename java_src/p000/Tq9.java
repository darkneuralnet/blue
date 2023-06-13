package p000;
/* renamed from: Tq9 */
/* loaded from: classes5.dex */
public final class Tq9 extends AbstractC52497yv9 {

    /* renamed from: i */
    public final /* synthetic */ C50688vs9 f36337i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tq9(C50688vs9 c50688vs9, Cw9 cw9, CharSequence charSequence) {
        super(cw9, charSequence);
        this.f36337i = c50688vs9;
    }

    @Override // p000.AbstractC52497yv9
    /* renamed from: c */
    public final int mo2249c(int i) {
        return i + 1;
    }

    @Override // p000.AbstractC52497yv9
    /* renamed from: d */
    public final int mo2248d(int i) {
        A99 a99 = this.f36337i.f114842a;
        CharSequence charSequence = this.f120423d;
        int length = charSequence.length();
        Uo9.m80801b(i, length, "index");
        while (i < length) {
            if (!a99.mo44614a(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
