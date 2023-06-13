package p000;

import android.content.Context;
import co.bird.android.feature.suggestanest.SuggestNestActivity;
import co.bird.android.model.PhotoBannerViewModel;
import p000.InterfaceC42150hU5;
/* renamed from: RQ0 */
/* loaded from: classes3.dex */
public final class RQ0 {

    /* renamed from: RQ0$a */
    /* loaded from: classes3.dex */
    public static final class C7166a implements InterfaceC42150hU5.InterfaceC22666a {
        @Override // p000.InterfaceC42150hU5.InterfaceC22666a
        /* renamed from: a */
        public InterfaceC42150hU5 mo36356a(InterfaceC44393lG2 interfaceC44393lG2, PhotoBannerViewModel photoBannerViewModel) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(photoBannerViewModel);
            return new C7167b(interfaceC44393lG2, photoBannerViewModel);
        }

        private C7166a() {
        }
    }

    /* renamed from: RQ0$b */
    /* loaded from: classes3.dex */
    public static final class C7167b implements InterfaceC42150hU5 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f32015a;

        /* renamed from: b */
        public final PhotoBannerViewModel f32016b;

        /* renamed from: c */
        public final C7167b f32017c;

        @Override // p000.InterfaceC42150hU5
        /* renamed from: a */
        public void mo36357a(SuggestNestActivity suggestNestActivity) {
            m86767b(suggestNestActivity);
        }

        /* renamed from: b */
        public final SuggestNestActivity m86767b(SuggestNestActivity suggestNestActivity) {
            C4650Ky.m98043b(suggestNestActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f32015a.mo27461w2()));
            C4650Ky.m98042c(suggestNestActivity, (C22454gl) C51679xZ3.m5003d(this.f32015a.mo27479r()));
            C4650Ky.m98041d(suggestNestActivity, (C36207Tq4) C51679xZ3.m5003d(this.f32015a.mo27595B1()));
            C39779dU5.m44217d(suggestNestActivity, m86765d());
            C39779dU5.m44220a(suggestNestActivity, m86766c());
            C39779dU5.m44219b(suggestNestActivity, (IL2) C51679xZ3.m5003d(this.f32015a.mo27478r0()));
            return suggestNestActivity;
        }

        /* renamed from: c */
        public final C42743iU5 m86766c() {
            return new C42743iU5((Context) C51679xZ3.m5003d(this.f32015a.mo27552R1()));
        }

        /* renamed from: d */
        public final LU5 m86765d() {
            return new LU5((InterfaceC40001dr4) C51679xZ3.m5003d(this.f32015a.mo27482q()), (InterfaceC48430s43) C51679xZ3.m5003d(this.f32015a.mo27465v1()), (InterfaceC32950Fs5) C51679xZ3.m5003d(this.f32015a.mo27473s2()), (C36207Tq4) C51679xZ3.m5003d(this.f32015a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f32015a.mo27461w2()), this.f32016b);
        }

        public C7167b(InterfaceC44393lG2 interfaceC44393lG2, PhotoBannerViewModel photoBannerViewModel) {
            this.f32017c = this;
            this.f32015a = interfaceC44393lG2;
            this.f32016b = photoBannerViewModel;
        }
    }

    private RQ0() {
    }

    /* renamed from: a */
    public static InterfaceC42150hU5.InterfaceC22666a m86768a() {
        return new C7166a();
    }
}
