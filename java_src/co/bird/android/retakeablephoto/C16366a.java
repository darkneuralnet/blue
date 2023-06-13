package co.bird.android.retakeablephoto;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.retakeablephoto.RetakeablePhotoActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.retakeablephoto.a */
/* loaded from: classes4.dex */
public final class C16366a {

    /* renamed from: co.bird.android.retakeablephoto.a$a */
    /* loaded from: classes4.dex */
    public static final class C16367a implements RetakeablePhotoActivity.InterfaceC16362b.InterfaceC16363a {
        @Override // co.bird.android.retakeablephoto.RetakeablePhotoActivity.InterfaceC16362b.InterfaceC16363a
        /* renamed from: a */
        public RetakeablePhotoActivity.InterfaceC16362b mo54964a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, boolean z, boolean z2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(Boolean.valueOf(z));
            C51679xZ3.m5005b(Boolean.valueOf(z2));
            return new C16368b(interfaceC44393lG2, baseActivity, Boolean.valueOf(z), Boolean.valueOf(z2));
        }

        private C16367a() {
        }
    }

    /* renamed from: co.bird.android.retakeablephoto.a$b */
    /* loaded from: classes4.dex */
    public static final class C16368b implements RetakeablePhotoActivity.InterfaceC16362b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f66978a;

        /* renamed from: b */
        public final BaseActivity f66979b;

        /* renamed from: c */
        public final Boolean f66980c;

        /* renamed from: d */
        public final Boolean f66981d;

        /* renamed from: e */
        public final C16368b f66982e;

        /* renamed from: f */
        public Y94<BaseActivity> f66983f;

        /* renamed from: g */
        public Y94<ScopeProvider> f66984g;

        @Override // co.bird.android.retakeablephoto.RetakeablePhotoActivity.InterfaceC16362b
        /* renamed from: a */
        public void mo54963a(RetakeablePhotoActivity retakeablePhotoActivity) {
            m54961c(retakeablePhotoActivity);
        }

        /* renamed from: b */
        public final void m54962b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, Boolean bool, Boolean bool2) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f66983f = m44621a;
            this.f66984g = V51.m80429b(C16369b.m54958a(m44621a));
        }

        /* renamed from: c */
        public final RetakeablePhotoActivity m54961c(RetakeablePhotoActivity retakeablePhotoActivity) {
            C5135Ly.m96068n(retakeablePhotoActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f66978a.mo27461w2()));
            C5135Ly.m96066p(retakeablePhotoActivity, (C36207Tq4) C51679xZ3.m5003d(this.f66978a.mo27595B1()));
            C5135Ly.m96071k(retakeablePhotoActivity, (Handler) C51679xZ3.m5003d(this.f66978a.mo27535X2()));
            C5135Ly.m96067o(retakeablePhotoActivity, (C22454gl) C51679xZ3.m5003d(this.f66978a.mo27479r()));
            C5135Ly.m96080b(retakeablePhotoActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f66978a.mo27519d0()));
            C5135Ly.m96075g(retakeablePhotoActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f66978a.mo27453z2()));
            C5135Ly.m96064r(retakeablePhotoActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f66978a.mo27459x1()));
            C5135Ly.m96081a(retakeablePhotoActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f66978a.mo27474s()));
            C5135Ly.m96073i(retakeablePhotoActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f66978a.mo27558P0()));
            C5135Ly.m96074h(retakeablePhotoActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f66978a.mo27598A0()));
            C5135Ly.m96077e(retakeablePhotoActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f66978a.mo27507i0()));
            C5135Ly.m96070l(retakeablePhotoActivity, (FO2) C51679xZ3.m5003d(this.f66978a.mo27456y2()));
            C5135Ly.m96065q(retakeablePhotoActivity, (YR4) C51679xZ3.m5003d(this.f66978a.mo27525b0()));
            C5135Ly.m96079c(retakeablePhotoActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f66978a.mo27460x()));
            C5135Ly.m96078d(retakeablePhotoActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f66978a.mo27517d3()));
            C5135Ly.m96072j(retakeablePhotoActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f66978a.mo27482q()));
            C5135Ly.m96076f(retakeablePhotoActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f66978a.mo27483p3()));
            C45644nN4.m23926b(retakeablePhotoActivity, m54960d());
            return retakeablePhotoActivity;
        }

        /* renamed from: d */
        public final EN4 m54960d() {
            return new EN4((InterfaceC36675Vq4) C51679xZ3.m5003d(this.f66978a.mo27598A0()), (C36207Tq4) C51679xZ3.m5003d(this.f66978a.mo27595B1()), (InterfaceC40476ef6) C51679xZ3.m5003d(this.f66978a.mo27545U2()), this.f66984g.get(), m54959e(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f66978a.mo27461w2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f66978a.mo27519d0()), this.f66980c.booleanValue(), this.f66981d.booleanValue());
        }

        /* renamed from: e */
        public final GN4 m54959e() {
            return new GN4(this.f66979b);
        }

        public C16368b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, Boolean bool, Boolean bool2) {
            this.f66982e = this;
            this.f66978a = interfaceC44393lG2;
            this.f66979b = baseActivity;
            this.f66980c = bool;
            this.f66981d = bool2;
            m54962b(interfaceC44393lG2, baseActivity, bool, bool2);
        }
    }

    private C16366a() {
    }

    /* renamed from: a */
    public static RetakeablePhotoActivity.InterfaceC16362b.InterfaceC16363a m54965a() {
        return new C16367a();
    }
}
