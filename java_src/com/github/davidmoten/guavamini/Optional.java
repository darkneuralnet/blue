package com.github.davidmoten.guavamini;
/* loaded from: classes5.dex */
public final class Optional<T> {

    /* renamed from: a */
    public final T f69973a;

    /* renamed from: b */
    public final boolean f69974b;

    /* loaded from: classes5.dex */
    public static class NotPresentException extends RuntimeException {
        private static final long serialVersionUID = -4444814681271790328L;
    }

    public Optional(T t, boolean z) {
        this.f69973a = t;
        this.f69974b = z;
    }

    /* renamed from: a */
    public static <T> Optional<T> m52064a() {
        return new Optional<>();
    }

    /* renamed from: d */
    public static <T> Optional<T> m52061d(T t) {
        return new Optional<>(t, true);
    }

    /* renamed from: b */
    public T m52063b() {
        if (this.f69974b) {
            return this.f69973a;
        }
        throw new NotPresentException();
    }

    /* renamed from: c */
    public boolean m52062c() {
        return this.f69974b;
    }

    public String toString() {
        return this.f69974b ? String.format("Optional.of(%s)", this.f69973a) : "Optional.absent";
    }

    private Optional() {
        this(null, false);
    }
}
