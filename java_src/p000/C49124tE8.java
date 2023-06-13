package p000;
/* renamed from: tE8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49124tE8 implements LD8 {

    /* renamed from: d */
    public static final LD8 f110214d = C42602iE8.f87030b;

    /* renamed from: b */
    public volatile LD8 f110215b;

    /* renamed from: c */
    public Object f110216c;

    public C49124tE8(LD8 ld8) {
        ld8.getClass();
        this.f110215b = ld8;
    }

    public final String toString() {
        Object obj = this.f110215b;
        if (obj == f110214d) {
            obj = "<supplier that returned " + String.valueOf(this.f110216c) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // p000.LD8
    public final Object zza() {
        LD8 ld8 = this.f110215b;
        LD8 ld82 = f110214d;
        if (ld8 != ld82) {
            synchronized (this) {
                if (this.f110215b != ld82) {
                    Object zza = this.f110215b.zza();
                    this.f110216c = zza;
                    this.f110215b = ld82;
                    return zza;
                }
            }
        }
        return this.f110216c;
    }
}
