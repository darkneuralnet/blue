package co.bird.android.feature.identification;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.identification.IdentificationActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.identification.a */
/* loaded from: classes3.dex */
public final class C14895a {

    /* renamed from: co.bird.android.feature.identification.a$a */
    /* loaded from: classes3.dex */
    public static final class C14896a implements IdentificationActivity.InterfaceC14889a.InterfaceC14890a {
        @Override // co.bird.android.feature.identification.IdentificationActivity.InterfaceC14889a.InterfaceC14890a
        /* renamed from: a */
        public IdentificationActivity.InterfaceC14889a mo58057a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7059R3 c7059r3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c7059r3);
            return new C14897b(interfaceC44393lG2, baseActivity, scopeProvider, c7059r3);
        }

        private C14896a() {
        }
    }

    /* renamed from: co.bird.android.feature.identification.a$b */
    /* loaded from: classes3.dex */
    public static final class C14897b implements IdentificationActivity.InterfaceC14889a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64088a;

        /* renamed from: b */
        public final BaseActivity f64089b;

        /* renamed from: c */
        public final C7059R3 f64090c;

        /* renamed from: d */
        public final ScopeProvider f64091d;

        /* renamed from: e */
        public final C14897b f64092e;

        @Override // co.bird.android.feature.identification.IdentificationActivity.InterfaceC14889a
        /* renamed from: a */
        public void mo58056a(IdentificationActivity identificationActivity) {
            m58052e(identificationActivity);
        }

        /* renamed from: b */
        public final C40951fT1 m58055b() {
            return new C40951fT1((Context) C51679xZ3.m5003d(this.f64088a.mo27552R1()), (InterfaceC6097Oh) C51679xZ3.m5003d(this.f64088a.mo27470t0()), (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f64088a.mo27500k1()), (C22454gl) C51679xZ3.m5003d(this.f64088a.mo27479r()));
        }

        /* renamed from: c */
        public final C43341jV1 m58054c() {
            return new C43341jV1((InterfaceC45102mT1) C51679xZ3.m5003d(this.f64088a.mo27568L1()), m58053d(), this.f64091d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64088a.mo27461w2()), m58055b(), (C22454gl) C51679xZ3.m5003d(this.f64088a.mo27479r()), (C36207Tq4) C51679xZ3.m5003d(this.f64088a.mo27595B1()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64088a.mo27519d0()));
        }

        /* renamed from: d */
        public final C41571gW1 m58053d() {
            return new C41571gW1(this.f64089b, this.f64090c);
        }

        /* renamed from: e */
        public final IdentificationActivity m58052e(IdentificationActivity identificationActivity) {
            C5135Ly.m96068n(identificationActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64088a.mo27461w2()));
            C5135Ly.m96066p(identificationActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64088a.mo27595B1()));
            C5135Ly.m96071k(identificationActivity, (Handler) C51679xZ3.m5003d(this.f64088a.mo27535X2()));
            C5135Ly.m96067o(identificationActivity, (C22454gl) C51679xZ3.m5003d(this.f64088a.mo27479r()));
            C5135Ly.m96080b(identificationActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64088a.mo27519d0()));
            C5135Ly.m96075g(identificationActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64088a.mo27453z2()));
            C5135Ly.m96064r(identificationActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64088a.mo27459x1()));
            C5135Ly.m96081a(identificationActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64088a.mo27474s()));
            C5135Ly.m96073i(identificationActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64088a.mo27558P0()));
            C5135Ly.m96074h(identificationActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64088a.mo27598A0()));
            C5135Ly.m96077e(identificationActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64088a.mo27507i0()));
            C5135Ly.m96070l(identificationActivity, (FO2) C51679xZ3.m5003d(this.f64088a.mo27456y2()));
            C5135Ly.m96065q(identificationActivity, (YR4) C51679xZ3.m5003d(this.f64088a.mo27525b0()));
            C5135Ly.m96079c(identificationActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64088a.mo27460x()));
            C5135Ly.m96078d(identificationActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64088a.mo27517d3()));
            C5135Ly.m96072j(identificationActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64088a.mo27482q()));
            C5135Ly.m96076f(identificationActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64088a.mo27483p3()));
            JS1.m100441b(identificationActivity, m58054c());
            return identificationActivity;
        }

        public C14897b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7059R3 c7059r3) {
            this.f64092e = this;
            this.f64088a = interfaceC44393lG2;
            this.f64089b = baseActivity;
            this.f64090c = c7059r3;
            this.f64091d = scopeProvider;
        }
    }

    private C14895a() {
    }

    /* renamed from: a */
    public static IdentificationActivity.InterfaceC14889a.InterfaceC14890a m58058a() {
        return new C14896a();
    }
}
