package p000;
/* renamed from: WM8 */
/* loaded from: classes5.dex */
public final class WM8 extends LP8 {

    /* renamed from: b */
    public static final WM8 f40909b = new WM8();

    private WM8() {
    }

    @Override // p000.LP8
    /* renamed from: a */
    public final Object mo78527a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.LP8
    /* renamed from: b */
    public final Object mo78526b(Object obj) {
        DQ8.m110468c(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    @Override // p000.LP8
    /* renamed from: c */
    public final boolean mo78525c() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
