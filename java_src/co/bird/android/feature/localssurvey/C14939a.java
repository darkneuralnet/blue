package co.bird.android.feature.localssurvey;

import co.bird.android.feature.localssurvey.InterfaceC14942b;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
/* renamed from: co.bird.android.feature.localssurvey.a */
/* loaded from: classes3.dex */
public final class C14939a {

    /* renamed from: co.bird.android.feature.localssurvey.a$a */
    /* loaded from: classes3.dex */
    public static final class C14940a implements InterfaceC14942b.InterfaceC14943a {
        @Override // co.bird.android.feature.localssurvey.InterfaceC14942b.InterfaceC14943a
        /* renamed from: a */
        public InterfaceC14942b mo57994a(InterfaceC44393lG2 interfaceC44393lG2, AutocompleteSupportFragment autocompleteSupportFragment) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(autocompleteSupportFragment);
            return new C14941b(interfaceC44393lG2, autocompleteSupportFragment);
        }

        private C14940a() {
        }
    }

    /* renamed from: co.bird.android.feature.localssurvey.a$b */
    /* loaded from: classes3.dex */
    public static final class C14941b implements InterfaceC14942b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64144a;

        /* renamed from: b */
        public final AutocompleteSupportFragment f64145b;

        /* renamed from: c */
        public final C14941b f64146c;

        @Override // co.bird.android.feature.localssurvey.InterfaceC14942b
        /* renamed from: a */
        public void mo57995a(LocalsSurveyActivity localsSurveyActivity) {
            m57997b(localsSurveyActivity);
        }

        /* renamed from: b */
        public final LocalsSurveyActivity m57997b(LocalsSurveyActivity localsSurveyActivity) {
            C4650Ky.m98043b(localsSurveyActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64144a.mo27461w2()));
            C4650Ky.m98042c(localsSurveyActivity, (C22454gl) C51679xZ3.m5003d(this.f64144a.mo27479r()));
            C4650Ky.m98041d(localsSurveyActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64144a.mo27595B1()));
            C34378Lv2.m96157b(localsSurveyActivity, m57996c());
            return localsSurveyActivity;
        }

        /* renamed from: c */
        public final C35782Rv2 m57996c() {
            return new C35782Rv2((InterfaceC1880Ea) C51679xZ3.m5003d(this.f64144a.mo27519d0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64144a.mo27461w2()), (C22454gl) C51679xZ3.m5003d(this.f64144a.mo27479r()), this.f64145b);
        }

        public C14941b(InterfaceC44393lG2 interfaceC44393lG2, AutocompleteSupportFragment autocompleteSupportFragment) {
            this.f64146c = this;
            this.f64144a = interfaceC44393lG2;
            this.f64145b = autocompleteSupportFragment;
        }
    }

    private C14939a() {
    }

    /* renamed from: a */
    public static InterfaceC14942b.InterfaceC14943a m57998a() {
        return new C14940a();
    }
}
