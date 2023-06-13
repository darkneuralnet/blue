package co.bird.android.feature.identification.trampoline;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.identification.trampoline.IdentificationTrampolineActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.identification.trampoline.a */
/* loaded from: classes3.dex */
public final class C14904a {

    /* renamed from: co.bird.android.feature.identification.trampoline.a$a */
    /* loaded from: classes3.dex */
    public static final class C14905a implements IdentificationTrampolineActivity.InterfaceC14901a.InterfaceC14902a {
        @Override // co.bird.android.feature.identification.trampoline.IdentificationTrampolineActivity.InterfaceC14901a.InterfaceC14902a
        /* renamed from: a */
        public IdentificationTrampolineActivity.InterfaceC14901a mo58043a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            return new C14906b(interfaceC44393lG2, baseActivity, scopeProvider);
        }

        private C14905a() {
        }
    }

    /* renamed from: co.bird.android.feature.identification.trampoline.a$b */
    /* loaded from: classes3.dex */
    public static final class C14906b implements IdentificationTrampolineActivity.InterfaceC14901a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64099a;

        /* renamed from: b */
        public final ScopeProvider f64100b;

        /* renamed from: c */
        public final C14906b f64101c;

        @Override // co.bird.android.feature.identification.trampoline.IdentificationTrampolineActivity.InterfaceC14901a
        /* renamed from: a */
        public void mo58042a(IdentificationTrampolineActivity identificationTrampolineActivity) {
            m58040c(identificationTrampolineActivity);
        }

        /* renamed from: b */
        public final C38589bW1 m58041b() {
            return new C38589bW1((InterfaceC45102mT1) C51679xZ3.m5003d(this.f64099a.mo27568L1()), this.f64100b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64099a.mo27461w2()), (C22454gl) C51679xZ3.m5003d(this.f64099a.mo27479r()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64099a.mo27519d0()));
        }

        /* renamed from: c */
        public final IdentificationTrampolineActivity m58040c(IdentificationTrampolineActivity identificationTrampolineActivity) {
            C5135Ly.m96068n(identificationTrampolineActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64099a.mo27461w2()));
            C5135Ly.m96066p(identificationTrampolineActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64099a.mo27595B1()));
            C5135Ly.m96071k(identificationTrampolineActivity, (Handler) C51679xZ3.m5003d(this.f64099a.mo27535X2()));
            C5135Ly.m96067o(identificationTrampolineActivity, (C22454gl) C51679xZ3.m5003d(this.f64099a.mo27479r()));
            C5135Ly.m96080b(identificationTrampolineActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64099a.mo27519d0()));
            C5135Ly.m96075g(identificationTrampolineActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64099a.mo27453z2()));
            C5135Ly.m96064r(identificationTrampolineActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64099a.mo27459x1()));
            C5135Ly.m96081a(identificationTrampolineActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64099a.mo27474s()));
            C5135Ly.m96073i(identificationTrampolineActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64099a.mo27558P0()));
            C5135Ly.m96074h(identificationTrampolineActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64099a.mo27598A0()));
            C5135Ly.m96077e(identificationTrampolineActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64099a.mo27507i0()));
            C5135Ly.m96070l(identificationTrampolineActivity, (FO2) C51679xZ3.m5003d(this.f64099a.mo27456y2()));
            C5135Ly.m96065q(identificationTrampolineActivity, (YR4) C51679xZ3.m5003d(this.f64099a.mo27525b0()));
            C5135Ly.m96079c(identificationTrampolineActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64099a.mo27460x()));
            C5135Ly.m96078d(identificationTrampolineActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64099a.mo27517d3()));
            C5135Ly.m96072j(identificationTrampolineActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64099a.mo27482q()));
            C5135Ly.m96076f(identificationTrampolineActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64099a.mo27483p3()));
            C37996aW1.m71267b(identificationTrampolineActivity, m58041b());
            return identificationTrampolineActivity;
        }

        public C14906b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider) {
            this.f64101c = this;
            this.f64099a = interfaceC44393lG2;
            this.f64100b = scopeProvider;
        }
    }

    private C14904a() {
    }

    /* renamed from: a */
    public static IdentificationTrampolineActivity.InterfaceC14901a.InterfaceC14902a m58044a() {
        return new C14905a();
    }
}
