package co.bird.android.feature.workorders.details;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.workorders.details.WorkOrderDetailsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.workorders.details.a */
/* loaded from: classes3.dex */
public final class C15925a {

    /* renamed from: co.bird.android.feature.workorders.details.a$a */
    /* loaded from: classes3.dex */
    public static final class C15926a implements WorkOrderDetailsActivity.InterfaceC15922a.InterfaceC15923a {
        @Override // co.bird.android.feature.workorders.details.WorkOrderDetailsActivity.InterfaceC15922a.InterfaceC15923a
        /* renamed from: a */
        public WorkOrderDetailsActivity.InterfaceC15922a mo56261a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30038x6 c30038x6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c30038x6);
            return new C15927b(interfaceC44393lG2, baseActivity, scopeProvider, c30038x6);
        }

        private C15926a() {
        }
    }

    /* renamed from: co.bird.android.feature.workorders.details.a$b */
    /* loaded from: classes3.dex */
    public static final class C15927b implements WorkOrderDetailsActivity.InterfaceC15922a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65921a;

        /* renamed from: b */
        public final C15927b f65922b;

        /* renamed from: c */
        public Y94<InterfaceC10636aM> f65923c;

        /* renamed from: d */
        public Y94<InterfaceC44647lh6> f65924d;

        /* renamed from: e */
        public Y94<InterfaceC37857aG6> f65925e;

        /* renamed from: f */
        public Y94<C36207Tq4> f65926f;

        /* renamed from: g */
        public Y94<BaseActivity> f65927g;

        /* renamed from: h */
        public Y94<C30038x6> f65928h;

        /* renamed from: i */
        public Y94<DD6> f65929i;

        /* renamed from: j */
        public Y94<ScopeProvider> f65930j;

        /* renamed from: k */
        public Y94<InterfaceC40099e13> f65931k;

        /* renamed from: l */
        public Y94<Context> f65932l;

        /* renamed from: m */
        public Y94<C44963mD6> f65933m;

        /* renamed from: n */
        public Y94<C52077yD6> f65934n;

        /* renamed from: co.bird.android.feature.workorders.details.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15928a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65935a;

            public C15928a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65935a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f65935a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.details.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15929b implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65936a;

            public C15929b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65936a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f65936a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.details.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15930c implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65937a;

            public C15930c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65937a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65937a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.details.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15931d implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65938a;

            public C15931d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65938a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65938a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.details.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15932e implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65939a;

            public C15932e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65939a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65939a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.feature.workorders.details.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C15933f implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65940a;

            public C15933f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65940a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f65940a.mo27549T2());
            }
        }

        @Override // co.bird.android.feature.workorders.details.WorkOrderDetailsActivity.InterfaceC15922a
        /* renamed from: a */
        public void mo56260a(WorkOrderDetailsActivity workOrderDetailsActivity) {
            m56258c(workOrderDetailsActivity);
        }

        /* renamed from: b */
        public final void m56259b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30038x6 c30038x6) {
            this.f65923c = new C15929b(interfaceC44393lG2);
            this.f65924d = new C15932e(interfaceC44393lG2);
            this.f65925e = new C15933f(interfaceC44393lG2);
            this.f65926f = new C15931d(interfaceC44393lG2);
            this.f65927g = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c30038x6);
            this.f65928h = m44621a;
            this.f65929i = V51.m80429b(ED6.m109289a(this.f65927g, m44621a));
            this.f65930j = C39546d52.m44621a(scopeProvider);
            this.f65931k = new C15930c(interfaceC44393lG2);
            C15928a c15928a = new C15928a(interfaceC44393lG2);
            this.f65932l = c15928a;
            C45556nD6 m24141a = C45556nD6.m24141a(c15928a, this.f65926f);
            this.f65933m = m24141a;
            this.f65934n = V51.m80429b(BD6.m114205a(this.f65923c, this.f65924d, this.f65925e, this.f65926f, this.f65929i, this.f65930j, this.f65931k, m24141a));
        }

        /* renamed from: c */
        public final WorkOrderDetailsActivity m56258c(WorkOrderDetailsActivity workOrderDetailsActivity) {
            C5135Ly.m96068n(workOrderDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65921a.mo27461w2()));
            C5135Ly.m96066p(workOrderDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65921a.mo27595B1()));
            C5135Ly.m96071k(workOrderDetailsActivity, (Handler) C51679xZ3.m5003d(this.f65921a.mo27535X2()));
            C5135Ly.m96067o(workOrderDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f65921a.mo27479r()));
            C5135Ly.m96080b(workOrderDetailsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65921a.mo27519d0()));
            C5135Ly.m96075g(workOrderDetailsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65921a.mo27453z2()));
            C5135Ly.m96064r(workOrderDetailsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65921a.mo27459x1()));
            C5135Ly.m96081a(workOrderDetailsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65921a.mo27474s()));
            C5135Ly.m96073i(workOrderDetailsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65921a.mo27558P0()));
            C5135Ly.m96074h(workOrderDetailsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65921a.mo27598A0()));
            C5135Ly.m96077e(workOrderDetailsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65921a.mo27507i0()));
            C5135Ly.m96070l(workOrderDetailsActivity, (FO2) C51679xZ3.m5003d(this.f65921a.mo27456y2()));
            C5135Ly.m96065q(workOrderDetailsActivity, (YR4) C51679xZ3.m5003d(this.f65921a.mo27525b0()));
            C5135Ly.m96079c(workOrderDetailsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65921a.mo27460x()));
            C5135Ly.m96078d(workOrderDetailsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65921a.mo27517d3()));
            C5135Ly.m96072j(workOrderDetailsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65921a.mo27482q()));
            C5135Ly.m96076f(workOrderDetailsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65921a.mo27483p3()));
            C41998hD6.m36597b(workOrderDetailsActivity, this.f65934n.get());
            return workOrderDetailsActivity;
        }

        public C15927b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30038x6 c30038x6) {
            this.f65922b = this;
            this.f65921a = interfaceC44393lG2;
            m56259b(interfaceC44393lG2, baseActivity, scopeProvider, c30038x6);
        }
    }

    private C15925a() {
    }

    /* renamed from: a */
    public static WorkOrderDetailsActivity.InterfaceC15922a.InterfaceC15923a m56262a() {
        return new C15926a();
    }
}
