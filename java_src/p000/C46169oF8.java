package p000;
/* renamed from: oF8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46169oF8<T> extends EJ8<T> {

    /* renamed from: b */
    public static final C46169oF8<Object> f101677b = new C46169oF8<>();

    private C46169oF8() {
    }

    @Override // p000.EJ8
    /* renamed from: a */
    public final T mo21499a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.EJ8
    /* renamed from: b */
    public final boolean mo21498b() {
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
