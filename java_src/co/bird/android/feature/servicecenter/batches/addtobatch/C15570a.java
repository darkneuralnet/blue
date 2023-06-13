package co.bird.android.feature.servicecenter.batches.addtobatch;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.batches.addtobatch.AddToBatchActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.a */
/* loaded from: classes3.dex */
public final class C15570a {

    /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.a$a */
    /* loaded from: classes3.dex */
    public static final class C15571a implements AddToBatchActivity.InterfaceC15567a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65267a;

        /* renamed from: b */
        public final C15571a f65268b;

        /* renamed from: c */
        public Y94<BaseActivity> f65269c;

        /* renamed from: d */
        public Y94<C6231P2> f65270d;

        /* renamed from: e */
        public Y94<C9636Y7> f65271e;

        /* renamed from: f */
        public Y94<ScopeProvider> f65272f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f65273g;

        /* renamed from: h */
        public Y94<InterfaceC20340fF> f65274h;

        /* renamed from: i */
        public Y94<C36207Tq4> f65275i;

        /* renamed from: j */
        public Y94<Context> f65276j;

        /* renamed from: k */
        public Y94<C2652G7> f65277k;

        /* renamed from: l */
        public Y94<C7333S7> f65278l;

        /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C15572a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65279a;

            public C15572a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65279a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f65279a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.a$a$b */
        /* loaded from: classes3.dex */
        public static final class C15573b implements Y94<InterfaceC20340fF> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65280a;

            public C15573b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65280a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC20340fF get() {
                return (InterfaceC20340fF) C51679xZ3.m5003d(this.f65280a.mo27591C1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.a$a$c */
        /* loaded from: classes3.dex */
        public static final class C15574c implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65281a;

            public C15574c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65281a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65281a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.a$a$d */
        /* loaded from: classes3.dex */
        public static final class C15575d implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65282a;

            public C15575d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65282a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65282a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.servicecenter.batches.addtobatch.AddToBatchActivity.InterfaceC15567a
        /* renamed from: a */
        public void mo56916a(AddToBatchActivity addToBatchActivity) {
            m56914c(addToBatchActivity);
        }

        /* renamed from: b */
        public final void m56915b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, C6231P2 c6231p2, ScopeProvider scopeProvider) {
            this.f65269c = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c6231p2);
            this.f65270d = m44621a;
            this.f65271e = V51.m80429b(C10115Z7.m73723a(this.f65269c, m44621a));
            this.f65272f = C39546d52.m44621a(scopeProvider);
            this.f65273g = new C15574c(interfaceC44393lG2);
            this.f65274h = new C15573b(interfaceC44393lG2);
            this.f65275i = new C15575d(interfaceC44393lG2);
            C15572a c15572a = new C15572a(interfaceC44393lG2);
            this.f65276j = c15572a;
            Y94<C2652G7> m80429b = V51.m80429b(C3024H7.m104396a(this.f65275i, c15572a));
            this.f65277k = m80429b;
            this.f65278l = V51.m80429b(C7660T7.m84300a(this.f65271e, this.f65272f, this.f65273g, this.f65274h, m80429b));
        }

        /* renamed from: c */
        public final AddToBatchActivity m56914c(AddToBatchActivity addToBatchActivity) {
            C5135Ly.m96068n(addToBatchActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65267a.mo27461w2()));
            C5135Ly.m96066p(addToBatchActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65267a.mo27595B1()));
            C5135Ly.m96071k(addToBatchActivity, (Handler) C51679xZ3.m5003d(this.f65267a.mo27535X2()));
            C5135Ly.m96067o(addToBatchActivity, (C22454gl) C51679xZ3.m5003d(this.f65267a.mo27479r()));
            C5135Ly.m96080b(addToBatchActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65267a.mo27519d0()));
            C5135Ly.m96075g(addToBatchActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65267a.mo27453z2()));
            C5135Ly.m96064r(addToBatchActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65267a.mo27459x1()));
            C5135Ly.m96081a(addToBatchActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65267a.mo27474s()));
            C5135Ly.m96073i(addToBatchActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65267a.mo27558P0()));
            C5135Ly.m96074h(addToBatchActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65267a.mo27598A0()));
            C5135Ly.m96077e(addToBatchActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65267a.mo27507i0()));
            C5135Ly.m96070l(addToBatchActivity, (FO2) C51679xZ3.m5003d(this.f65267a.mo27456y2()));
            C5135Ly.m96065q(addToBatchActivity, (YR4) C51679xZ3.m5003d(this.f65267a.mo27525b0()));
            C5135Ly.m96079c(addToBatchActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65267a.mo27460x()));
            C5135Ly.m96078d(addToBatchActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65267a.mo27517d3()));
            C5135Ly.m96072j(addToBatchActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65267a.mo27482q()));
            C5135Ly.m96076f(addToBatchActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65267a.mo27483p3()));
            C30917z7.m1783b(addToBatchActivity, this.f65278l.get());
            return addToBatchActivity;
        }

        public C15571a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, C6231P2 c6231p2, ScopeProvider scopeProvider) {
            this.f65268b = this;
            this.f65267a = interfaceC44393lG2;
            m56915b(interfaceC44393lG2, baseActivity, c6231p2, scopeProvider);
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.a$b */
    /* loaded from: classes3.dex */
    public static final class C15576b implements AddToBatchActivity.InterfaceC15567a.InterfaceC15568a {
        @Override // co.bird.android.feature.servicecenter.batches.addtobatch.AddToBatchActivity.InterfaceC15567a.InterfaceC15568a
        /* renamed from: a */
        public AddToBatchActivity.InterfaceC15567a mo56909a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, C6231P2 c6231p2, ScopeProvider scopeProvider) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(c6231p2);
            C51679xZ3.m5005b(scopeProvider);
            return new C15571a(interfaceC44393lG2, baseActivity, c6231p2, scopeProvider);
        }

        private C15576b() {
        }
    }

    private C15570a() {
    }

    /* renamed from: a */
    public static AddToBatchActivity.InterfaceC15567a.InterfaceC15568a m56917a() {
        return new C15576b();
    }
}
