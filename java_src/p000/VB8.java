package p000;
/* renamed from: VB8 */
/* loaded from: classes5.dex */
public final class VB8 extends QC8 {

    /* renamed from: b */
    public static final VB8 f38729b = new VB8();

    private VB8() {
    }

    @Override // p000.QC8
    /* renamed from: a */
    public final Object mo24138a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.QC8
    /* renamed from: b */
    public final boolean mo24137b() {
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
