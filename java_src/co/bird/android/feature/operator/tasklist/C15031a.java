package co.bird.android.feature.operator.tasklist;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.operator.tasklist.OperatorTaskListActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.operator.tasklist.a */
/* loaded from: classes3.dex */
public final class C15031a {

    /* renamed from: co.bird.android.feature.operator.tasklist.a$a */
    /* loaded from: classes3.dex */
    public static final class C15032a implements OperatorTaskListActivity.InterfaceC15028a.InterfaceC15029a {
        @Override // co.bird.android.feature.operator.tasklist.OperatorTaskListActivity.InterfaceC15028a.InterfaceC15029a
        /* renamed from: a */
        public OperatorTaskListActivity.InterfaceC15028a mo57862a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C0848C4 c0848c4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c0848c4);
            return new C15033b(interfaceC44393lG2, baseActivity, scopeProvider, c0848c4);
        }

        private C15032a() {
        }
    }

    /* renamed from: co.bird.android.feature.operator.tasklist.a$b */
    /* loaded from: classes3.dex */
    public static final class C15033b implements OperatorTaskListActivity.InterfaceC15028a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64295a;

        /* renamed from: b */
        public final C15033b f64296b;

        /* renamed from: c */
        public Y94<InterfaceC46473om3> f64297c;

        /* renamed from: d */
        public Y94<InterfaceC27246pJ> f64298d;

        /* renamed from: e */
        public Y94<C36207Tq4> f64299e;

        /* renamed from: f */
        public Y94<ScopeProvider> f64300f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f64301g;

        /* renamed from: h */
        public Y94<InterfaceC36476Uu3> f64302h;

        /* renamed from: i */
        public Y94<BaseActivity> f64303i;

        /* renamed from: j */
        public Y94<C0848C4> f64304j;

        /* renamed from: k */
        public Y94<C33677Iv3> f64305k;

        /* renamed from: l */
        public Y94<InterfaceC33443Hv3> f64306l;

        /* renamed from: m */
        public Y94<C32273Cv3> f64307m;

        /* renamed from: n */
        public Y94<InterfaceC41226fv3> f64308n;

        /* renamed from: co.bird.android.feature.operator.tasklist.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15034a implements Y94<InterfaceC27246pJ> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64309a;

            public C15034a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64309a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC27246pJ get() {
                return (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64309a.mo27517d3());
            }
        }

        /* renamed from: co.bird.android.feature.operator.tasklist.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15035b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64310a;

            public C15035b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64310a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64310a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.operator.tasklist.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15036c implements Y94<InterfaceC46473om3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64311a;

            public C15036c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64311a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46473om3 get() {
                return (InterfaceC46473om3) C51679xZ3.m5003d(this.f64311a.mo27584F0());
            }
        }

        /* renamed from: co.bird.android.feature.operator.tasklist.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15037d implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64312a;

            public C15037d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64312a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64312a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.operator.tasklist.OperatorTaskListActivity.InterfaceC15028a
        /* renamed from: a */
        public void mo57861a(OperatorTaskListActivity operatorTaskListActivity) {
            m57859c(operatorTaskListActivity);
        }

        /* renamed from: b */
        public final void m57860b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C0848C4 c0848c4) {
            this.f64297c = new C15036c(interfaceC44393lG2);
            this.f64298d = new C15034a(interfaceC44393lG2);
            this.f64299e = new C15037d(interfaceC44393lG2);
            this.f64300f = C39546d52.m44621a(scopeProvider);
            this.f64301g = new C15035b(interfaceC44393lG2);
            this.f64302h = V51.m80429b(C37178Xu3.m76117a());
            this.f64303i = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c0848c4);
            this.f64304j = m44621a;
            C33911Jv3 m99562a = C33911Jv3.m99562a(this.f64303i, m44621a);
            this.f64305k = m99562a;
            Y94<InterfaceC33443Hv3> m80429b = V51.m80429b(m99562a);
            this.f64306l = m80429b;
            C33209Gv3 m104585a = C33209Gv3.m104585a(this.f64297c, this.f64298d, this.f64299e, this.f64300f, this.f64301g, this.f64302h, m80429b);
            this.f64307m = m104585a;
            this.f64308n = V51.m80429b(m104585a);
        }

        /* renamed from: c */
        public final OperatorTaskListActivity m57859c(OperatorTaskListActivity operatorTaskListActivity) {
            C5135Ly.m96068n(operatorTaskListActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64295a.mo27461w2()));
            C5135Ly.m96066p(operatorTaskListActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64295a.mo27595B1()));
            C5135Ly.m96071k(operatorTaskListActivity, (Handler) C51679xZ3.m5003d(this.f64295a.mo27535X2()));
            C5135Ly.m96067o(operatorTaskListActivity, (C22454gl) C51679xZ3.m5003d(this.f64295a.mo27479r()));
            C5135Ly.m96080b(operatorTaskListActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64295a.mo27519d0()));
            C5135Ly.m96075g(operatorTaskListActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64295a.mo27453z2()));
            C5135Ly.m96064r(operatorTaskListActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64295a.mo27459x1()));
            C5135Ly.m96081a(operatorTaskListActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64295a.mo27474s()));
            C5135Ly.m96073i(operatorTaskListActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64295a.mo27558P0()));
            C5135Ly.m96074h(operatorTaskListActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64295a.mo27598A0()));
            C5135Ly.m96077e(operatorTaskListActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64295a.mo27507i0()));
            C5135Ly.m96070l(operatorTaskListActivity, (FO2) C51679xZ3.m5003d(this.f64295a.mo27456y2()));
            C5135Ly.m96065q(operatorTaskListActivity, (YR4) C51679xZ3.m5003d(this.f64295a.mo27525b0()));
            C5135Ly.m96079c(operatorTaskListActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64295a.mo27460x()));
            C5135Ly.m96078d(operatorTaskListActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64295a.mo27517d3()));
            C5135Ly.m96072j(operatorTaskListActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64295a.mo27482q()));
            C5135Ly.m96076f(operatorTaskListActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64295a.mo27483p3()));
            C40633ev3.m42383b(operatorTaskListActivity, this.f64308n.get());
            return operatorTaskListActivity;
        }

        public C15033b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C0848C4 c0848c4) {
            this.f64296b = this;
            this.f64295a = interfaceC44393lG2;
            m57860b(interfaceC44393lG2, baseActivity, scopeProvider, c0848c4);
        }
    }

    private C15031a() {
    }

    /* renamed from: a */
    public static OperatorTaskListActivity.InterfaceC15028a.InterfaceC15029a m57863a() {
        return new C15032a();
    }
}
