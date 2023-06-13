package p000;

import java.util.concurrent.Executor;
/* renamed from: Ch1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32145Ch1 implements InterfaceC48220rj1<Executor> {

    /* renamed from: Ch1$a */
    /* loaded from: classes5.dex */
    public static final class C1128a {

        /* renamed from: a */
        public static final C32145Ch1 f4483a = new C32145Ch1();

        private C1128a() {
        }
    }

    /* renamed from: a */
    public static C32145Ch1 m111879a() {
        return C1128a.f4483a;
    }

    /* renamed from: b */
    public static Executor m111878b() {
        return (Executor) CZ3.m112115c(AbstractC31911Bh1.m113670a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: c */
    public Executor get() {
        return m111878b();
    }
}
