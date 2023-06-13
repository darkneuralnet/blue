package p000;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* renamed from: yb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52288yb0 {

    /* renamed from: e */
    public static final List<Integer> f119790e = Arrays.asList(1, 2, 3);

    /* renamed from: a */
    public final int f119791a;

    /* renamed from: b */
    public final Executor f119792b;

    /* renamed from: c */
    public final TV5 f119793c;

    /* renamed from: d */
    public final HX1 f119794d;

    /* renamed from: a */
    public UV5 m3212a() {
        TV5 m3209d = m3209d();
        Objects.requireNonNull(m3209d);
        return new C38593bW5(m3209d, m3211b());
    }

    /* renamed from: b */
    public Executor m3211b() {
        return this.f119792b;
    }

    /* renamed from: c */
    public HX1 m3210c() {
        return this.f119794d;
    }

    /* renamed from: d */
    public TV5 m3209d() {
        return this.f119793c;
    }

    /* renamed from: e */
    public int m3208e() {
        return this.f119791a;
    }
}
