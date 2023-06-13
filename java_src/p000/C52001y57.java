package p000;
/* renamed from: y57  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52001y57 extends I57 {

    /* renamed from: b */
    public static final C52001y57 f118737b = new C52001y57();

    private C52001y57() {
    }

    @Override // p000.I57
    /* renamed from: a */
    public final Object mo4153a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.I57
    /* renamed from: b */
    public final Object mo4152b(Object obj) {
        return "";
    }

    @Override // p000.I57
    /* renamed from: c */
    public final boolean mo4151c() {
        return false;
    }

    @Override // p000.I57
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p000.I57
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
