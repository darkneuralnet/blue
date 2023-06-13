package co.bird.android.library.lightbox;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.library.lightbox.LightboxActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.library.lightbox.a */
/* loaded from: classes3.dex */
public final class C16045a {

    /* renamed from: co.bird.android.library.lightbox.a$a */
    /* loaded from: classes3.dex */
    public static final class C16046a implements LightboxActivity.InterfaceC16040b.InterfaceC16041a {
        @Override // co.bird.android.library.lightbox.LightboxActivity.InterfaceC16040b.InterfaceC16041a
        /* renamed from: a */
        public LightboxActivity.InterfaceC16040b mo56026a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            return new C16047b(interfaceC44393lG2, baseActivity);
        }

        private C16046a() {
        }
    }

    /* renamed from: co.bird.android.library.lightbox.a$b */
    /* loaded from: classes3.dex */
    public static final class C16047b implements LightboxActivity.InterfaceC16040b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f66108a;

        /* renamed from: b */
        public final BaseActivity f66109b;

        /* renamed from: c */
        public final C16047b f66110c;

        /* renamed from: d */
        public Y94<BaseActivity> f66111d;

        /* renamed from: e */
        public Y94<ScopeProvider> f66112e;

        @Override // co.bird.android.library.lightbox.LightboxActivity.InterfaceC16040b
        /* renamed from: a */
        public void mo56025a(LightboxActivity lightboxActivity) {
            m56023c(lightboxActivity);
        }

        /* renamed from: b */
        public final void m56024b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f66111d = m44621a;
            this.f66112e = V51.m80429b(C16048b.m56020a(m44621a));
        }

        /* renamed from: c */
        public final LightboxActivity m56023c(LightboxActivity lightboxActivity) {
            C5135Ly.m96068n(lightboxActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f66108a.mo27461w2()));
            C5135Ly.m96066p(lightboxActivity, (C36207Tq4) C51679xZ3.m5003d(this.f66108a.mo27595B1()));
            C5135Ly.m96071k(lightboxActivity, (Handler) C51679xZ3.m5003d(this.f66108a.mo27535X2()));
            C5135Ly.m96067o(lightboxActivity, (C22454gl) C51679xZ3.m5003d(this.f66108a.mo27479r()));
            C5135Ly.m96080b(lightboxActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f66108a.mo27519d0()));
            C5135Ly.m96075g(lightboxActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f66108a.mo27453z2()));
            C5135Ly.m96064r(lightboxActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f66108a.mo27459x1()));
            C5135Ly.m96081a(lightboxActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f66108a.mo27474s()));
            C5135Ly.m96073i(lightboxActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f66108a.mo27558P0()));
            C5135Ly.m96074h(lightboxActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f66108a.mo27598A0()));
            C5135Ly.m96077e(lightboxActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f66108a.mo27507i0()));
            C5135Ly.m96070l(lightboxActivity, (FO2) C51679xZ3.m5003d(this.f66108a.mo27456y2()));
            C5135Ly.m96065q(lightboxActivity, (YR4) C51679xZ3.m5003d(this.f66108a.mo27525b0()));
            C5135Ly.m96079c(lightboxActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f66108a.mo27460x()));
            C5135Ly.m96078d(lightboxActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f66108a.mo27517d3()));
            C5135Ly.m96072j(lightboxActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f66108a.mo27482q()));
            C5135Ly.m96076f(lightboxActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f66108a.mo27483p3()));
            C35035Oq2.m91301b(lightboxActivity, m56022d());
            return lightboxActivity;
        }

        /* renamed from: d */
        public final C35971Sq2 m56022d() {
            return new C35971Sq2(this.f66112e.get(), m56021e(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f66108a.mo27461w2()));
        }

        /* renamed from: e */
        public final C36439Uq2 m56021e() {
            return new C36439Uq2(this.f66109b);
        }

        public C16047b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            this.f66110c = this;
            this.f66108a = interfaceC44393lG2;
            this.f66109b = baseActivity;
            m56024b(interfaceC44393lG2, baseActivity);
        }
    }

    private C16045a() {
    }

    /* renamed from: a */
    public static LightboxActivity.InterfaceC16040b.InterfaceC16041a m56027a() {
        return new C16046a();
    }
}
