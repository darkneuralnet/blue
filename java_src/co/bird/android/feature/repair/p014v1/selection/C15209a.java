package co.bird.android.feature.repair.p014v1.selection;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.p014v1.selection.RepairSelectionActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.repair.v1.selection.a */
/* loaded from: classes3.dex */
public final class C15209a {

    /* renamed from: co.bird.android.feature.repair.v1.selection.a$a */
    /* loaded from: classes3.dex */
    public static final class C15210a implements RepairSelectionActivity.InterfaceC15206b.InterfaceC15207a {
        @Override // co.bird.android.feature.repair.p014v1.selection.RepairSelectionActivity.InterfaceC15206b.InterfaceC15207a
        /* renamed from: a */
        public RepairSelectionActivity.InterfaceC15206b mo57553a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C24709j5 c24709j5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c24709j5);
            return new C15211b(interfaceC44393lG2, baseActivity, scopeProvider, c24709j5);
        }

        private C15210a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.v1.selection.a$b */
    /* loaded from: classes3.dex */
    public static final class C15211b implements RepairSelectionActivity.InterfaceC15206b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64626a;

        /* renamed from: b */
        public final C15211b f64627b;

        /* renamed from: c */
        public Y94<ScopeProvider> f64628c;

        /* renamed from: d */
        public Y94<BaseActivity> f64629d;

        /* renamed from: e */
        public Y94<C24709j5> f64630e;

        /* renamed from: f */
        public Y94<C46147oD4> f64631f;

        /* renamed from: g */
        public Y94<InterfaceC45554nD4> f64632g;

        /* renamed from: h */
        public Y94<InterfaceC40099e13> f64633h;

        /* renamed from: i */
        public Y94<InterfaceC38421bD4> f64634i;

        /* renamed from: j */
        public Y94<C44368lD4> f64635j;

        /* renamed from: k */
        public Y94<InterfaceC40810fD4> f64636k;

        /* renamed from: co.bird.android.feature.repair.v1.selection.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15212a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64637a;

            public C15212a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64637a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64637a.mo27461w2());
            }
        }

        @Override // co.bird.android.feature.repair.p014v1.selection.RepairSelectionActivity.InterfaceC15206b
        /* renamed from: a */
        public void mo57552a(RepairSelectionActivity repairSelectionActivity) {
            m57550c(repairSelectionActivity);
        }

        /* renamed from: b */
        public final void m57551b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C24709j5 c24709j5) {
            this.f64628c = C39546d52.m44621a(scopeProvider);
            this.f64629d = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c24709j5);
            this.f64630e = m44621a;
            C46740pD4 m19815a = C46740pD4.m19815a(this.f64629d, m44621a);
            this.f64631f = m19815a;
            this.f64632g = V51.m80429b(m19815a);
            this.f64633h = new C15212a(interfaceC44393lG2);
            Y94<InterfaceC38421bD4> m80429b = V51.m80429b(C40217eD4.m43093a());
            this.f64634i = m80429b;
            C44961mD4 m26001a = C44961mD4.m26001a(this.f64628c, this.f64632g, this.f64633h, m80429b);
            this.f64635j = m26001a;
            this.f64636k = V51.m80429b(m26001a);
        }

        /* renamed from: c */
        public final RepairSelectionActivity m57550c(RepairSelectionActivity repairSelectionActivity) {
            C5135Ly.m96068n(repairSelectionActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64626a.mo27461w2()));
            C5135Ly.m96066p(repairSelectionActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64626a.mo27595B1()));
            C5135Ly.m96071k(repairSelectionActivity, (Handler) C51679xZ3.m5003d(this.f64626a.mo27535X2()));
            C5135Ly.m96067o(repairSelectionActivity, (C22454gl) C51679xZ3.m5003d(this.f64626a.mo27479r()));
            C5135Ly.m96080b(repairSelectionActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64626a.mo27519d0()));
            C5135Ly.m96075g(repairSelectionActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64626a.mo27453z2()));
            C5135Ly.m96064r(repairSelectionActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64626a.mo27459x1()));
            C5135Ly.m96081a(repairSelectionActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64626a.mo27474s()));
            C5135Ly.m96073i(repairSelectionActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64626a.mo27558P0()));
            C5135Ly.m96074h(repairSelectionActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64626a.mo27598A0()));
            C5135Ly.m96077e(repairSelectionActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64626a.mo27507i0()));
            C5135Ly.m96070l(repairSelectionActivity, (FO2) C51679xZ3.m5003d(this.f64626a.mo27456y2()));
            C5135Ly.m96065q(repairSelectionActivity, (YR4) C51679xZ3.m5003d(this.f64626a.mo27525b0()));
            C5135Ly.m96079c(repairSelectionActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64626a.mo27460x()));
            C5135Ly.m96078d(repairSelectionActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64626a.mo27517d3()));
            C5135Ly.m96072j(repairSelectionActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64626a.mo27482q()));
            C5135Ly.m96076f(repairSelectionActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64626a.mo27483p3()));
            YC4.m75421b(repairSelectionActivity, this.f64636k.get());
            return repairSelectionActivity;
        }

        public C15211b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C24709j5 c24709j5) {
            this.f64627b = this;
            this.f64626a = interfaceC44393lG2;
            m57551b(interfaceC44393lG2, baseActivity, scopeProvider, c24709j5);
        }
    }

    private C15209a() {
    }

    /* renamed from: a */
    public static RepairSelectionActivity.InterfaceC15206b.InterfaceC15207a m57554a() {
        return new C15210a();
    }
}
