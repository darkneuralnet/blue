package p000;
/* renamed from: YQ8 */
/* loaded from: classes5.dex */
public final class YQ8 extends AbstractC48648sR8 {

    /* renamed from: h */
    public final /* synthetic */ C42719iR8 f45878h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YQ8(C42719iR8 c42719iR8, CR8 cr8, CharSequence charSequence) {
        super(cr8, charSequence);
        this.f45878h = c42719iR8;
    }

    @Override // p000.AbstractC48648sR8
    /* renamed from: c */
    public final int mo14186c(int i) {
        return i + this.f45878h.f87336a.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        r6 = r6 + 1;
     */
    @Override // p000.AbstractC48648sR8
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo14185d(int i) {
        int length = this.f45878h.f87336a.length();
        int length2 = this.f108822d.length() - length;
        while (i <= length2) {
            for (int i2 = 0; i2 < length; i2++) {
                if (this.f108822d.charAt(i2 + i) != this.f45878h.f87336a.charAt(i2)) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }
}
