package p000;
/* renamed from: fg1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC41074fg1 {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: g */
    public static final EnumC41074fg1[] f80436g;

    /* renamed from: b */
    public final int f80438b;

    static {
        EnumC41074fg1 enumC41074fg1 = L;
        EnumC41074fg1 enumC41074fg12 = M;
        EnumC41074fg1 enumC41074fg13 = Q;
        f80436g = new EnumC41074fg1[]{enumC41074fg12, enumC41074fg1, H, enumC41074fg13};
    }

    EnumC41074fg1(int i) {
        this.f80438b = i;
    }

    /* renamed from: a */
    public static EnumC41074fg1 m41045a(int i) {
        if (i >= 0) {
            EnumC41074fg1[] enumC41074fg1Arr = f80436g;
            if (i < enumC41074fg1Arr.length) {
                return enumC41074fg1Arr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int m41044b() {
        return this.f80438b;
    }
}
