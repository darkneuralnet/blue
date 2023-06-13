package p000;

import java.util.concurrent.atomic.AtomicReference;
import p000.InterfaceC52235yV2;
/* renamed from: wX2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51067wX2 {

    /* renamed from: b */
    public static final C51067wX2 f116125b = new C51067wX2();

    /* renamed from: c */
    public static final C29910b f116126c = new C29910b();

    /* renamed from: a */
    public final AtomicReference<InterfaceC52235yV2> f116127a = new AtomicReference<>();

    /* renamed from: wX2$b */
    /* loaded from: classes6.dex */
    public static class C29910b implements InterfaceC52235yV2 {
        private C29910b() {
        }

        @Override // p000.InterfaceC52235yV2
        /* renamed from: a */
        public InterfaceC52235yV2.InterfaceC30599a mo3445a(C52828zV2 c52828zV2, String str, String str2) {
            return AV2.f637a;
        }
    }

    /* renamed from: b */
    public static C51067wX2 m6701b() {
        return f116125b;
    }

    /* renamed from: a */
    public InterfaceC52235yV2 m6702a() {
        InterfaceC52235yV2 interfaceC52235yV2 = this.f116127a.get();
        if (interfaceC52235yV2 == null) {
            return f116126c;
        }
        return interfaceC52235yV2;
    }
}
