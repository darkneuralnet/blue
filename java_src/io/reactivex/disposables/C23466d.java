package io.reactivex.disposables;

import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
/* renamed from: io.reactivex.disposables.d */
/* loaded from: classes6.dex */
public final class C23466d {
    private C23466d() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static InterfaceC23465c m33023a() {
        return EnumC23502e.INSTANCE;
    }

    /* renamed from: b */
    public static InterfaceC23465c m33022b() {
        return m33020d(C23506a.f88246b);
    }

    /* renamed from: c */
    public static InterfaceC23465c m33021c(InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23478a, "run is null");
        return new C23463a(interfaceC23478a);
    }

    /* renamed from: d */
    public static InterfaceC23465c m33020d(Runnable runnable) {
        C23544b.m32923e(runnable, "run is null");
        return new C23468f(runnable);
    }
}
