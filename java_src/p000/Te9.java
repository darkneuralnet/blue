package p000;
/* renamed from: Te9 */
/* loaded from: classes5.dex */
public enum Te9 implements InterfaceC41586gX7 {
    TYPE_UNKNOWN(0),
    LATIN(1),
    LATIN_AND_CHINESE(2),
    LATIN_AND_DEVANAGARI(3),
    LATIN_AND_JAPANESE(4),
    LATIN_AND_KOREAN(5),
    CREDIT_CARD(6),
    DOCUMENT(7);
    

    /* renamed from: b */
    public final int f35833b;

    Te9(int i) {
        this.f35833b = i;
    }

    @Override // p000.InterfaceC41586gX7
    public final int zza() {
        return this.f35833b;
    }
}
