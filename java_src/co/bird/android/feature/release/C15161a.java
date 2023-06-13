package co.bird.android.feature.release;

import android.app.Activity;
import android.content.Context;
import co.bird.android.feature.release.InterfaceC15164b;
import co.bird.android.model.PhotoBannerViewModel;
/* renamed from: co.bird.android.feature.release.a */
/* loaded from: classes3.dex */
public final class C15161a {

    /* renamed from: co.bird.android.feature.release.a$a */
    /* loaded from: classes3.dex */
    public static final class C15162a implements InterfaceC15164b.InterfaceC15165a {
        @Override // co.bird.android.feature.release.InterfaceC15164b.InterfaceC15165a
        /* renamed from: a */
        public InterfaceC15164b mo57613a(InterfaceC44393lG2 interfaceC44393lG2, PhotoBannerViewModel photoBannerViewModel, Activity activity, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(photoBannerViewModel);
            C51679xZ3.m5005b(activity);
            C51679xZ3.m5005b(dq3);
            return new C15163b(interfaceC44393lG2, photoBannerViewModel, activity, dq3);
        }

        private C15162a() {
        }
    }

    /* renamed from: co.bird.android.feature.release.a$b */
    /* loaded from: classes3.dex */
    public static final class C15163b implements InterfaceC15164b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64558a;

        /* renamed from: b */
        public final DQ3 f64559b;

        /* renamed from: c */
        public final PhotoBannerViewModel f64560c;

        /* renamed from: d */
        public final C15163b f64561d;

        @Override // co.bird.android.feature.release.InterfaceC15164b
        /* renamed from: a */
        public void mo57614a(ReleaseScanActivity releaseScanActivity) {
            m57617b(releaseScanActivity);
        }

        /* renamed from: b */
        public final ReleaseScanActivity m57617b(ReleaseScanActivity releaseScanActivity) {
            C4650Ky.m98043b(releaseScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64558a.mo27461w2()));
            C4650Ky.m98042c(releaseScanActivity, (C22454gl) C51679xZ3.m5003d(this.f64558a.mo27479r()));
            C4650Ky.m98041d(releaseScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64558a.mo27595B1()));
            C36477Uu4.m80639c(releaseScanActivity, m57615d());
            C36477Uu4.m80641a(releaseScanActivity, m57616c());
            return releaseScanActivity;
        }

        /* renamed from: c */
        public final C36945Wu4 m57616c() {
            return new C36945Wu4((Context) C51679xZ3.m5003d(this.f64558a.mo27552R1()));
        }

        /* renamed from: d */
        public final C31806Av4 m57615d() {
            return new C31806Av4((InterfaceC40099e13) C51679xZ3.m5003d(this.f64558a.mo27461w2()), (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64558a.mo27482q()), (InterfaceC48430s43) C51679xZ3.m5003d(this.f64558a.mo27465v1()), this.f64559b, (InterfaceC40476ef6) C51679xZ3.m5003d(this.f64558a.mo27545U2()), (C36207Tq4) C51679xZ3.m5003d(this.f64558a.mo27595B1()), this.f64560c);
        }

        public C15163b(InterfaceC44393lG2 interfaceC44393lG2, PhotoBannerViewModel photoBannerViewModel, Activity activity, DQ3 dq3) {
            this.f64561d = this;
            this.f64558a = interfaceC44393lG2;
            this.f64559b = dq3;
            this.f64560c = photoBannerViewModel;
        }
    }

    private C15161a() {
    }

    /* renamed from: a */
    public static InterfaceC15164b.InterfaceC15165a m57618a() {
        return new C15162a();
    }
}
