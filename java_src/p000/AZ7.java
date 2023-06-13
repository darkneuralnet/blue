package p000;
/* renamed from: AZ7 */
/* loaded from: classes5.dex */
public final class AZ7<T> extends AbstractC38891c08<T> {

    /* renamed from: b */
    public static final AZ7<Object> f806b = new AZ7<>();

    private AZ7() {
    }

    @Override // p000.AbstractC38891c08
    /* renamed from: a */
    public final T mo16672a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.AbstractC38891c08
    /* renamed from: b */
    public final boolean mo16671b() {
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
