package co.bird.android.feature.cannotaccess.report;

import android.os.Handler;
import co.bird.android.feature.cannotaccess.report.InterfaceC14669a;
/* renamed from: co.bird.android.feature.cannotaccess.report.b */
/* loaded from: classes3.dex */
public final class C14671b {

    /* renamed from: co.bird.android.feature.cannotaccess.report.b$a */
    /* loaded from: classes3.dex */
    public static final class C14672a implements InterfaceC14669a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63584a;

        /* renamed from: b */
        public final C14672a f63585b;

        /* renamed from: c */
        public Y94<InterfaceC10636aM> f63586c;

        /* renamed from: d */
        public Y94<InterfaceC1880Ea> f63587d;

        /* renamed from: e */
        public Y94<InterfaceC30556yL> f63588e;

        /* renamed from: f */
        public Y94<C22454gl> f63589f;

        /* renamed from: g */
        public Y94<C36207Tq4> f63590g;

        /* renamed from: h */
        public Y94<InterfaceC40001dr4> f63591h;

        /* renamed from: i */
        public C33044Gd0 f63592i;

        /* renamed from: j */
        public Y94<InterfaceC32576Ed0> f63593j;

        /* renamed from: co.bird.android.feature.cannotaccess.report.b$a$a */
        /* loaded from: classes3.dex */
        public static final class C14673a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63594a;

            public C14673a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63594a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63594a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.cannotaccess.report.b$a$b */
        /* loaded from: classes3.dex */
        public static final class C14674b implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63595a;

            public C14674b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63595a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f63595a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.cannotaccess.report.b$a$c */
        /* loaded from: classes3.dex */
        public static final class C14675c implements Y94<InterfaceC30556yL> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63596a;

            public C14675c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63596a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC30556yL get() {
                return (InterfaceC30556yL) C51679xZ3.m5003d(this.f63596a.mo27509g3());
            }
        }

        /* renamed from: co.bird.android.feature.cannotaccess.report.b$a$d */
        /* loaded from: classes3.dex */
        public static final class C14676d implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63597a;

            public C14676d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63597a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f63597a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.cannotaccess.report.b$a$e */
        /* loaded from: classes3.dex */
        public static final class C14677e implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63598a;

            public C14677e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63598a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f63598a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.cannotaccess.report.b$a$f */
        /* loaded from: classes3.dex */
        public static final class C14678f implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63599a;

            public C14678f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63599a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63599a.mo27482q());
            }
        }

        @Override // co.bird.android.feature.cannotaccess.report.InterfaceC14669a
        /* renamed from: a */
        public void mo58526a(CannotAccessActivity cannotAccessActivity) {
            m58524c(cannotAccessActivity);
        }

        /* renamed from: b */
        public final void m58525b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f63586c = new C14676d(interfaceC44393lG2);
            this.f63587d = new C14673a(interfaceC44393lG2);
            this.f63588e = new C14675c(interfaceC44393lG2);
            this.f63589f = new C14674b(interfaceC44393lG2);
            this.f63590g = new C14677e(interfaceC44393lG2);
            C14678f c14678f = new C14678f(interfaceC44393lG2);
            this.f63591h = c14678f;
            C33044Gd0 m104950a = C33044Gd0.m104950a(this.f63586c, this.f63587d, this.f63588e, this.f63589f, this.f63590g, c14678f);
            this.f63592i = m104950a;
            this.f63593j = C32810Fd0.m106873b(m104950a);
        }

        /* renamed from: c */
        public final CannotAccessActivity m58524c(CannotAccessActivity cannotAccessActivity) {
            C5135Ly.m96068n(cannotAccessActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63584a.mo27461w2()));
            C5135Ly.m96066p(cannotAccessActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63584a.mo27595B1()));
            C5135Ly.m96071k(cannotAccessActivity, (Handler) C51679xZ3.m5003d(this.f63584a.mo27535X2()));
            C5135Ly.m96067o(cannotAccessActivity, (C22454gl) C51679xZ3.m5003d(this.f63584a.mo27479r()));
            C5135Ly.m96080b(cannotAccessActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63584a.mo27519d0()));
            C5135Ly.m96075g(cannotAccessActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63584a.mo27453z2()));
            C5135Ly.m96064r(cannotAccessActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63584a.mo27459x1()));
            C5135Ly.m96081a(cannotAccessActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63584a.mo27474s()));
            C5135Ly.m96073i(cannotAccessActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63584a.mo27558P0()));
            C5135Ly.m96074h(cannotAccessActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63584a.mo27598A0()));
            C5135Ly.m96077e(cannotAccessActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63584a.mo27507i0()));
            C5135Ly.m96070l(cannotAccessActivity, (FO2) C51679xZ3.m5003d(this.f63584a.mo27456y2()));
            C5135Ly.m96065q(cannotAccessActivity, (YR4) C51679xZ3.m5003d(this.f63584a.mo27525b0()));
            C5135Ly.m96079c(cannotAccessActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63584a.mo27460x()));
            C5135Ly.m96078d(cannotAccessActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63584a.mo27517d3()));
            C5135Ly.m96072j(cannotAccessActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63584a.mo27482q()));
            C5135Ly.m96076f(cannotAccessActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63584a.mo27483p3()));
            C42822id0.m33727a(cannotAccessActivity, this.f63593j.get());
            return cannotAccessActivity;
        }

        public C14672a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f63585b = this;
            this.f63584a = interfaceC44393lG2;
            m58525b(interfaceC44393lG2);
        }
    }

    /* renamed from: co.bird.android.feature.cannotaccess.report.b$b */
    /* loaded from: classes3.dex */
    public static final class C14679b implements InterfaceC14669a.InterfaceC14670a {
        @Override // co.bird.android.feature.cannotaccess.report.InterfaceC14669a.InterfaceC14670a
        /* renamed from: a */
        public InterfaceC14669a mo58517a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C14672a(interfaceC44393lG2);
        }

        private C14679b() {
        }
    }

    private C14671b() {
    }

    /* renamed from: a */
    public static InterfaceC14669a.InterfaceC14670a m58527a() {
        return new C14679b();
    }
}
