package p000;

import co.bird.android.core.base.BaseCoreActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C48163rd4;
/* renamed from: zO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52763zO0 {

    /* renamed from: zO0$a */
    /* loaded from: classes3.dex */
    public static final class C30991a implements C48163rd4.InterfaceC27956b.InterfaceC27957a {
        @Override // p000.C48163rd4.InterfaceC27956b.InterfaceC27957a
        /* renamed from: a */
        public C48163rd4.InterfaceC27956b mo1437a(InterfaceC44393lG2 interfaceC44393lG2, BaseCoreActivity baseCoreActivity, ScopeProvider scopeProvider, C38883c00 c38883c00, InterfaceC37520Zg3 interfaceC37520Zg3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseCoreActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c38883c00);
            C51679xZ3.m5005b(interfaceC37520Zg3);
            return new C30992b(interfaceC44393lG2, baseCoreActivity, scopeProvider, c38883c00, interfaceC37520Zg3);
        }

        private C30991a() {
        }
    }

    /* renamed from: zO0$b */
    /* loaded from: classes3.dex */
    public static final class C30992b implements C48163rd4.InterfaceC27956b {

        /* renamed from: a */
        public final C30992b f121270a;

        /* renamed from: b */
        public Y94<ScopeProvider> f121271b;

        /* renamed from: c */
        public Y94<C38883c00> f121272c;

        /* renamed from: d */
        public Y94<C52312yd4> f121273d;

        /* renamed from: e */
        public Y94<C36207Tq4> f121274e;

        /* renamed from: f */
        public Y94<InterfaceC37520Zg3> f121275f;

        /* renamed from: g */
        public Y94<InterfaceC42586iD1> f121276g;

        /* renamed from: h */
        public Y94<C51126wd4> f121277h;

        /* renamed from: zO0$b$a */
        /* loaded from: classes3.dex */
        public static final class C30993a implements Y94<InterfaceC42586iD1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f121278a;

            public C30993a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f121278a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC42586iD1 get() {
                return (InterfaceC42586iD1) C51679xZ3.m5003d(this.f121278a.mo27539W2());
            }
        }

        /* renamed from: zO0$b$b */
        /* loaded from: classes3.dex */
        public static final class C30994b implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f121279a;

            public C30994b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f121279a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f121279a.mo27595B1());
            }
        }

        @Override // p000.C48163rd4.InterfaceC27956b
        /* renamed from: a */
        public void mo1436a(C48163rd4 c48163rd4) {
            m1434c(c48163rd4);
        }

        /* renamed from: b */
        public final void m1435b(InterfaceC44393lG2 interfaceC44393lG2, BaseCoreActivity baseCoreActivity, ScopeProvider scopeProvider, C38883c00 c38883c00, InterfaceC37520Zg3 interfaceC37520Zg3) {
            this.f121271b = C39546d52.m44621a(scopeProvider);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c38883c00);
            this.f121272c = m44621a;
            this.f121273d = C52905zd4.m957a(m44621a);
            this.f121274e = new C30994b(interfaceC44393lG2);
            this.f121275f = C39546d52.m44621a(interfaceC37520Zg3);
            C30993a c30993a = new C30993a(interfaceC44393lG2);
            this.f121276g = c30993a;
            this.f121277h = V51.m80429b(C51719xd4.m4920a(this.f121271b, this.f121273d, this.f121274e, this.f121275f, c30993a));
        }

        /* renamed from: c */
        public final C48163rd4 m1434c(C48163rd4 c48163rd4) {
            C48755sd4.m13922b(c48163rd4, this.f121277h.get());
            return c48163rd4;
        }

        public C30992b(InterfaceC44393lG2 interfaceC44393lG2, BaseCoreActivity baseCoreActivity, ScopeProvider scopeProvider, C38883c00 c38883c00, InterfaceC37520Zg3 interfaceC37520Zg3) {
            this.f121270a = this;
            m1435b(interfaceC44393lG2, baseCoreActivity, scopeProvider, c38883c00, interfaceC37520Zg3);
        }
    }

    private C52763zO0() {
    }

    /* renamed from: a */
    public static C48163rd4.InterfaceC27956b.InterfaceC27957a m1438a() {
        return new C30991a();
    }
}
