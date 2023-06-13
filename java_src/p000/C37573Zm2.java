package p000;

import java.util.Objects;
import java.util.function.Supplier;
/* renamed from: Zm2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37573Zm2<T> {

    /* renamed from: a */
    public final Supplier<? extends T> f49201a;

    /* renamed from: b */
    public T f49202b;

    /* renamed from: c */
    public boolean f49203c;

    public C37573Zm2(Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is required");
        this.f49201a = supplier;
    }

    /* renamed from: a */
    public T m72540a() {
        synchronized (this) {
            if (this.f49203c) {
                return this.f49202b;
            }
            this.f49203c = true;
            T t = this.f49201a.get();
            this.f49202b = t;
            return t;
        }
    }
}
