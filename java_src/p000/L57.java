package p000;
/* renamed from: L57 */
/* loaded from: classes5.dex */
public final class L57 extends N57 {

    /* renamed from: h */
    public final /* synthetic */ M57 f20748h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L57(M57 m57, O57 o57, CharSequence charSequence) {
        super(o57, charSequence);
        this.f20748h = m57;
    }

    @Override // p000.N57
    /* renamed from: c */
    public final int mo94380c(int i) {
        return i + this.f20748h.f22624a.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        r6 = r6 + 1;
     */
    @Override // p000.N57
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo94379d(int i) {
        int length = this.f20748h.f22624a.length();
        int length2 = this.f24147d.length() - length;
        while (i <= length2) {
            for (int i2 = 0; i2 < length; i2++) {
                if (this.f24147d.charAt(i2 + i) != this.f20748h.f22624a.charAt(i2)) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }
}
