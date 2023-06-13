package p000;

import java.io.Closeable;
import java.io.IOException;
/* renamed from: Tc8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36085Tc8<T extends Closeable> implements Closeable {

    /* renamed from: b */
    public final T f35787b;

    public C36085Tc8(T t) {
        this.f35787b = t;
    }

    /* renamed from: a */
    public static <T extends Closeable> C36085Tc8<T> m83269a(T t) {
        return new C36085Tc8<>(t);
    }

    /* renamed from: b */
    public final T m83268b() {
        return this.f35787b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        T t = this.f35787b;
        if (t != null) {
            t.close();
        }
    }
}
