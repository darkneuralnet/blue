package co.bird.android.app.feature.physicallock;

import android.os.Handler;
import co.bird.android.app.feature.physicallock.InterfaceC14017b;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: co.bird.android.app.feature.physicallock.a */
/* loaded from: classes2.dex */
public final class C14009a {

    /* renamed from: co.bird.android.app.feature.physicallock.a$a */
    /* loaded from: classes2.dex */
    public static final class C14010a implements InterfaceC14017b.InterfaceC14018a {
        @Override // co.bird.android.app.feature.physicallock.InterfaceC14017b.InterfaceC14018a
        /* renamed from: a */
        public InterfaceC14017b mo60170a(InterfaceC44393lG2 interfaceC44393lG2, FS3 fs3, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(fs3);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(lifecycleScopeProvider);
            return new C14011b(fs3, interfaceC44393lG2, baseActivity, lifecycleScopeProvider);
        }

        private C14010a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.physicallock.a$b */
    /* loaded from: classes2.dex */
    public static final class C14011b implements InterfaceC14017b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f61980a;

        /* renamed from: b */
        public final C14011b f61981b;

        /* renamed from: c */
        public Y94<LifecycleScopeProvider<EnumC7097RE>> f61982c;

        /* renamed from: d */
        public Y94<InterfaceC40099e13> f61983d;

        /* renamed from: e */
        public Y94<YR4> f61984e;

        /* renamed from: f */
        public Y94<C22454gl> f61985f;

        /* renamed from: g */
        public Y94<InterfaceC1880Ea> f61986g;

        /* renamed from: h */
        public Y94<InterfaceC44791lw0> f61987h;

        /* renamed from: i */
        public Y94<BaseActivity> f61988i;

        /* renamed from: j */
        public Y94<InterfaceC41546gT3> f61989j;

        /* renamed from: k */
        public Y94<PS3> f61990k;

        /* renamed from: l */
        public Y94<HS3> f61991l;

        /* renamed from: co.bird.android.app.feature.physicallock.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C14012a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61992a;

            public C14012a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61992a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61992a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.app.feature.physicallock.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C14013b implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61993a;

            public C14013b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61993a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f61993a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.app.feature.physicallock.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C14014c implements Y94<InterfaceC44791lw0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61994a;

            public C14014c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61994a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44791lw0 get() {
                return (InterfaceC44791lw0) C51679xZ3.m5003d(this.f61994a.mo27487o2());
            }
        }

        /* renamed from: co.bird.android.app.feature.physicallock.a$b$d */
        /* loaded from: classes2.dex */
        public static final class C14015d implements Y94<YR4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61995a;

            public C14015d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61995a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public YR4 get() {
                return (YR4) C51679xZ3.m5003d(this.f61995a.mo27525b0());
            }
        }

        /* renamed from: co.bird.android.app.feature.physicallock.a$b$e */
        /* loaded from: classes2.dex */
        public static final class C14016e implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61996a;

            public C14016e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61996a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f61996a.mo27461w2());
            }
        }

        @Override // co.bird.android.app.feature.physicallock.InterfaceC14017b
        /* renamed from: a */
        public void mo60171a(PhysicalLockActivity physicalLockActivity) {
            m60177c(physicalLockActivity);
        }

        /* renamed from: b */
        public final void m60178b(FS3 fs3, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider) {
            this.f61982c = C39546d52.m44621a(lifecycleScopeProvider);
            this.f61983d = new C14016e(interfaceC44393lG2);
            this.f61984e = new C14015d(interfaceC44393lG2);
            this.f61985f = new C14013b(interfaceC44393lG2);
            this.f61986g = new C14012a(interfaceC44393lG2);
            this.f61987h = new C14014c(interfaceC44393lG2);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f61988i = m44621a;
            Y94<InterfaceC41546gT3> m80429b = V51.m80429b(GS3.m105082a(fs3, m44621a));
            this.f61989j = m80429b;
            QS3 m88501a = QS3.m88501a(this.f61982c, this.f61983d, this.f61984e, this.f61985f, this.f61986g, this.f61987h, m80429b);
            this.f61990k = m88501a;
            this.f61991l = V51.m80429b(m88501a);
        }

        /* renamed from: c */
        public final PhysicalLockActivity m60177c(PhysicalLockActivity physicalLockActivity) {
            C5135Ly.m96068n(physicalLockActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61980a.mo27461w2()));
            C5135Ly.m96066p(physicalLockActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61980a.mo27595B1()));
            C5135Ly.m96071k(physicalLockActivity, (Handler) C51679xZ3.m5003d(this.f61980a.mo27535X2()));
            C5135Ly.m96067o(physicalLockActivity, (C22454gl) C51679xZ3.m5003d(this.f61980a.mo27479r()));
            C5135Ly.m96080b(physicalLockActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61980a.mo27519d0()));
            C5135Ly.m96075g(physicalLockActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61980a.mo27453z2()));
            C5135Ly.m96064r(physicalLockActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61980a.mo27459x1()));
            C5135Ly.m96081a(physicalLockActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61980a.mo27474s()));
            C5135Ly.m96073i(physicalLockActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61980a.mo27558P0()));
            C5135Ly.m96074h(physicalLockActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61980a.mo27598A0()));
            C5135Ly.m96077e(physicalLockActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61980a.mo27507i0()));
            C5135Ly.m96070l(physicalLockActivity, (FO2) C51679xZ3.m5003d(this.f61980a.mo27456y2()));
            C5135Ly.m96065q(physicalLockActivity, (YR4) C51679xZ3.m5003d(this.f61980a.mo27525b0()));
            C5135Ly.m96079c(physicalLockActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61980a.mo27460x()));
            C5135Ly.m96078d(physicalLockActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61980a.mo27517d3()));
            C5135Ly.m96072j(physicalLockActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61980a.mo27482q()));
            C5135Ly.m96076f(physicalLockActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61980a.mo27483p3()));
            C48060rS3.m15932b(physicalLockActivity, this.f61991l.get());
            return physicalLockActivity;
        }

        public C14011b(FS3 fs3, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider) {
            this.f61981b = this;
            this.f61980a = interfaceC44393lG2;
            m60178b(fs3, interfaceC44393lG2, baseActivity, lifecycleScopeProvider);
        }
    }

    private C14009a() {
    }

    /* renamed from: a */
    public static InterfaceC14017b.InterfaceC14018a m60179a() {
        return new C14010a();
    }
}
