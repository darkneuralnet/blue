package p000;

import android.content.Context;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import p000.C38161an0;
/* renamed from: PH0 */
/* loaded from: classes2.dex */
public final class PH0 {

    /* renamed from: PH0$a */
    /* loaded from: classes2.dex */
    public static final class C6306a implements C38161an0.InterfaceC10856a {

        /* renamed from: a */
        public final C6306a f28180a;

        /* renamed from: b */
        public Y94<InterfaceC36185To0> f28181b;

        /* renamed from: c */
        public Y94<InterfaceC46473om3> f28182c;

        /* renamed from: d */
        public Y94<InterfaceC48164rd5> f28183d;

        /* renamed from: e */
        public Y94<ScopeProvider> f28184e;

        /* renamed from: f */
        public Y94<BaseActivity> f28185f;

        /* renamed from: g */
        public Y94<C4490KZ> f28186g;

        /* renamed from: h */
        public Y94<C45314mp0> f28187h;

        /* renamed from: i */
        public Y94<C31739Ao0> f28188i;

        /* renamed from: j */
        public Y94<InterfaceC50047uo0> f28189j;

        /* renamed from: k */
        public Y94<Context> f28190k;

        /* renamed from: l */
        public Y94<C34313Lo0> f28191l;

        /* renamed from: m */
        public Y94<InterfaceC33845Jo0> f28192m;

        /* renamed from: n */
        public Y94<C35483Qo0> f28193n;

        /* renamed from: PH0$a$a */
        /* loaded from: classes2.dex */
        public static final class C6307a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f28194a;

            public C6307a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f28194a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f28194a.mo27552R1());
            }
        }

        /* renamed from: PH0$a$b */
        /* loaded from: classes2.dex */
        public static final class C6308b implements Y94<InterfaceC36185To0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f28195a;

            public C6308b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f28195a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36185To0 get() {
                return (InterfaceC36185To0) C51679xZ3.m5003d(this.f28195a.mo27481q2());
            }
        }

        /* renamed from: PH0$a$c */
        /* loaded from: classes2.dex */
        public static final class C6309c implements Y94<InterfaceC48164rd5> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f28196a;

            public C6309c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f28196a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC48164rd5 get() {
                return (InterfaceC48164rd5) C51679xZ3.m5003d(this.f28196a.mo27463w());
            }
        }

        /* renamed from: PH0$a$d */
        /* loaded from: classes2.dex */
        public static final class C6310d implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f28197a;

            public C6310d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f28197a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f28197a.mo27584F0());
            }
        }

        @Override // p000.C38161an0.InterfaceC10856a
        /* renamed from: a */
        public void mo70747a(C38161an0 c38161an0) {
            m90523c(c38161an0);
        }

        /* renamed from: b */
        public final void m90524b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C4490KZ c4490kz) {
            this.f28181b = new C6308b(interfaceC44393lG2);
            this.f28182c = new C6310d(interfaceC44393lG2);
            this.f28183d = new C6309c(interfaceC44393lG2);
            this.f28184e = C39546d52.m44621a(scopeProvider);
            this.f28185f = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c4490kz);
            this.f28186g = m44621a;
            Y94<C45314mp0> m80429b = V51.m80429b(C45907np0.m22339a(this.f28185f, m44621a));
            this.f28187h = m80429b;
            C33611Io0 m101706a = C33611Io0.m101706a(this.f28181b, this.f28182c, this.f28183d, this.f28184e, m80429b);
            this.f28188i = m101706a;
            this.f28189j = V51.m80429b(m101706a);
            C6307a c6307a = new C6307a(interfaceC44393lG2);
            this.f28190k = c6307a;
            C34547Mo0 m94786a = C34547Mo0.m94786a(c6307a);
            this.f28191l = m94786a;
            Y94<InterfaceC33845Jo0> m80429b2 = V51.m80429b(m94786a);
            this.f28192m = m80429b2;
            this.f28193n = V51.m80429b(C35717Ro0.m86285a(this.f28189j, this.f28184e, this.f28187h, m80429b2));
        }

        /* renamed from: c */
        public final C38161an0 m90523c(C38161an0 c38161an0) {
            C38754bn0.m63988b(c38161an0, this.f28193n.get());
            return c38161an0;
        }

        public C6306a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C4490KZ c4490kz) {
            this.f28180a = this;
            m90524b(interfaceC44393lG2, baseActivity, scopeProvider, c4490kz);
        }
    }

    /* renamed from: PH0$b */
    /* loaded from: classes2.dex */
    public static final class C6311b implements C38161an0.InterfaceC10856a.InterfaceC10857a {
        @Override // p000.C38161an0.InterfaceC10856a.InterfaceC10857a
        /* renamed from: a */
        public C38161an0.InterfaceC10856a mo70746a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C4490KZ c4490kz) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c4490kz);
            return new C6306a(interfaceC44393lG2, baseActivity, scopeProvider, c4490kz);
        }

        private C6311b() {
        }
    }

    private PH0() {
    }

    /* renamed from: a */
    public static C38161an0.InterfaceC10856a.InterfaceC10857a m90525a() {
        return new C6311b();
    }
}
