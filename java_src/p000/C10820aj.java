package p000;

import p000.C32172Ck1;
import p000.C34746Nk1;
/* renamed from: aj */
/* loaded from: classes5.dex */
public class C10820aj {

    /* renamed from: aj$a */
    /* loaded from: classes5.dex */
    public static class C10821a implements C34746Nk1.InterfaceC5662b {

        /* renamed from: aj$a$a */
        /* loaded from: classes5.dex */
        public class C10822a implements C32172Ck1.InterfaceC1164a {
            public C10822a() {
            }

            @Override // p000.C32172Ck1.InterfaceC1164a
            /* renamed from: a */
            public void mo16504a(boolean z) {
                if (z) {
                    KT2.m98852c();
                }
            }
        }

        /* renamed from: aj$a$b */
        /* loaded from: classes5.dex */
        public class C10823b implements C32172Ck1.InterfaceC1164a {
            public C10823b() {
            }

            @Override // p000.C32172Ck1.InterfaceC1164a
            /* renamed from: a */
            public void mo16504a(boolean z) {
                if (z) {
                    TM4.m83728a();
                }
            }
        }

        /* renamed from: aj$a$c */
        /* loaded from: classes5.dex */
        public class C10824c implements C32172Ck1.InterfaceC1164a {
            public C10824c() {
            }

            @Override // p000.C32172Ck1.InterfaceC1164a
            /* renamed from: a */
            public void mo16504a(boolean z) {
                if (z) {
                    C37988aV2.m71307g();
                }
            }
        }

        /* renamed from: aj$a$d */
        /* loaded from: classes5.dex */
        public class C10825d implements C32172Ck1.InterfaceC1164a {
            public C10825d() {
            }

            @Override // p000.C32172Ck1.InterfaceC1164a
            /* renamed from: a */
            public void mo16504a(boolean z) {
                if (z) {
                    C33306Hg1.m103542a();
                }
            }
        }

        /* renamed from: aj$a$e */
        /* loaded from: classes5.dex */
        public class C10826e implements C32172Ck1.InterfaceC1164a {
            public C10826e() {
            }

            @Override // p000.C32172Ck1.InterfaceC1164a
            /* renamed from: a */
            public void mo16504a(boolean z) {
                if (z) {
                    MZ1.m95165a();
                }
            }
        }

        @Override // p000.C34746Nk1.InterfaceC5662b
        /* renamed from: a */
        public void mo70828a(C34512Mk1 c34512Mk1) {
            C32172Ck1.m111760a(C32172Ck1.EnumC1165b.AAM, new C10822a());
            C32172Ck1.m111760a(C32172Ck1.EnumC1165b.RestrictiveDataFiltering, new C10823b());
            C32172Ck1.m111760a(C32172Ck1.EnumC1165b.PrivacyProtection, new C10824c());
            C32172Ck1.m111760a(C32172Ck1.EnumC1165b.EventDeactivation, new C10825d());
            C32172Ck1.m111760a(C32172Ck1.EnumC1165b.IapLogging, new C10826e());
        }

        @Override // p000.C34746Nk1.InterfaceC5662b
        public void onError() {
        }
    }

    /* renamed from: a */
    public static void m70829a() {
        if (TD0.m84203d(C10820aj.class)) {
            return;
        }
        try {
            C34746Nk1.m93524h(new C10821a());
        } catch (Throwable th) {
            TD0.m84205b(th, C10820aj.class);
        }
    }
}
