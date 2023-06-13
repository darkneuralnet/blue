package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import kotlin.Pair;
import p000.B13;
/* renamed from: qM0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47410qM0 {

    /* renamed from: qM0$a */
    /* loaded from: classes2.dex */
    public static final class C27584a implements B13.InterfaceC0373b.InterfaceC0374a {
        @Override // p000.B13.InterfaceC0373b.InterfaceC0374a
        /* renamed from: a */
        public B13.InterfaceC0373b mo17600a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C51975y31 c51975y31, AbstractC24569h<Pair<Integer, Integer>> abstractC24569h, AbstractC24569h<Integer> abstractC24569h2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c51975y31);
            C51679xZ3.m5005b(abstractC24569h);
            C51679xZ3.m5005b(abstractC24569h2);
            return new C27585b(interfaceC44393lG2, baseActivity, scopeProvider, c51975y31, abstractC24569h, abstractC24569h2);
        }

        private C27584a() {
        }
    }

    /* renamed from: qM0$b */
    /* loaded from: classes2.dex */
    public static final class C27585b implements B13.InterfaceC0373b {

        /* renamed from: a */
        public final C27585b f105171a;

        /* renamed from: b */
        public Y94<C22454gl> f105172b;

        /* renamed from: c */
        public Y94<C36207Tq4> f105173c;

        /* renamed from: d */
        public Y94<ScopeProvider> f105174d;

        /* renamed from: e */
        public Y94<BaseActivity> f105175e;

        /* renamed from: f */
        public Y94<C51975y31> f105176f;

        /* renamed from: g */
        public Y94<P13> f105177g;

        /* renamed from: h */
        public Y94<M13> f105178h;

        /* renamed from: i */
        public Y94<AbstractC24569h<Pair<Integer, Integer>>> f105179i;

        /* renamed from: j */
        public Y94<AbstractC24569h<Integer>> f105180j;

        /* renamed from: k */
        public Y94<K13> f105181k;

        /* renamed from: l */
        public Y94<D13> f105182l;

        /* renamed from: qM0$b$a */
        /* loaded from: classes2.dex */
        public static final class C27586a implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f105183a;

            public C27586a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f105183a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f105183a.mo27479r());
            }
        }

        /* renamed from: qM0$b$b */
        /* loaded from: classes2.dex */
        public static final class C27587b implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f105184a;

            public C27587b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f105184a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f105184a.mo27595B1());
            }
        }

        @Override // p000.B13.InterfaceC0373b
        /* renamed from: a */
        public void mo17599a(B13 b13) {
            m17597c(b13);
        }

        /* renamed from: b */
        public final void m17598b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C51975y31 c51975y31, AbstractC24569h<Pair<Integer, Integer>> abstractC24569h, AbstractC24569h<Integer> abstractC24569h2) {
            this.f105172b = new C27586a(interfaceC44393lG2);
            this.f105173c = new C27587b(interfaceC44393lG2);
            this.f105174d = C39546d52.m44621a(scopeProvider);
            this.f105175e = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c51975y31);
            this.f105176f = m44621a;
            Q13 m89114a = Q13.m89114a(this.f105175e, m44621a);
            this.f105177g = m89114a;
            this.f105178h = V51.m80429b(m89114a);
            this.f105179i = C39546d52.m44621a(abstractC24569h);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(abstractC24569h2);
            this.f105180j = m44621a2;
            L13 m97924a = L13.m97924a(this.f105172b, this.f105173c, this.f105174d, this.f105178h, this.f105179i, m44621a2);
            this.f105181k = m97924a;
            this.f105182l = V51.m80429b(m97924a);
        }

        /* renamed from: c */
        public final B13 m17597c(B13 b13) {
            C13.m113001b(b13, this.f105182l.get());
            return b13;
        }

        public C27585b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C51975y31 c51975y31, AbstractC24569h<Pair<Integer, Integer>> abstractC24569h, AbstractC24569h<Integer> abstractC24569h2) {
            this.f105171a = this;
            m17598b(interfaceC44393lG2, baseActivity, scopeProvider, c51975y31, abstractC24569h, abstractC24569h2);
        }
    }

    private C47410qM0() {
    }

    /* renamed from: a */
    public static B13.InterfaceC0373b.InterfaceC0374a m17601a() {
        return new C27584a();
    }
}
