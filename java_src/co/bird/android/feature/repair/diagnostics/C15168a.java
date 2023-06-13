package co.bird.android.feature.repair.diagnostics;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.diagnostics.DiagnosticsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.repair.diagnostics.a */
/* loaded from: classes3.dex */
public final class C15168a {

    /* renamed from: co.bird.android.feature.repair.diagnostics.a$a */
    /* loaded from: classes3.dex */
    public static final class C15169a implements DiagnosticsActivity.InterfaceC15166a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64563a;

        /* renamed from: b */
        public final BaseActivity f64564b;

        /* renamed from: c */
        public final C29744w3 f64565c;

        /* renamed from: d */
        public final ScopeProvider f64566d;

        /* renamed from: e */
        public final C15169a f64567e;

        @Override // co.bird.android.feature.repair.diagnostics.DiagnosticsActivity.InterfaceC15166a
        /* renamed from: a */
        public void mo57610a(DiagnosticsActivity diagnosticsActivity) {
            m57606e(diagnosticsActivity);
        }

        /* renamed from: b */
        public final C40710f31 m57609b() {
            return new C40710f31((Context) C51679xZ3.m5003d(this.f64563a.mo27552R1()));
        }

        /* renamed from: c */
        public final C43675k31 m57608c() {
            return new C43675k31((InterfaceC36176Tn0) C51679xZ3.m5003d(this.f64563a.mo27574J2()), m57609b(), m57607d(), this.f64566d);
        }

        /* renamed from: d */
        public final C44268l31 m57607d() {
            return new C44268l31(this.f64564b, this.f64565c);
        }

        /* renamed from: e */
        public final DiagnosticsActivity m57606e(DiagnosticsActivity diagnosticsActivity) {
            C5135Ly.m96068n(diagnosticsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64563a.mo27461w2()));
            C5135Ly.m96066p(diagnosticsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64563a.mo27595B1()));
            C5135Ly.m96071k(diagnosticsActivity, (Handler) C51679xZ3.m5003d(this.f64563a.mo27535X2()));
            C5135Ly.m96067o(diagnosticsActivity, (C22454gl) C51679xZ3.m5003d(this.f64563a.mo27479r()));
            C5135Ly.m96080b(diagnosticsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64563a.mo27519d0()));
            C5135Ly.m96075g(diagnosticsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64563a.mo27453z2()));
            C5135Ly.m96064r(diagnosticsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64563a.mo27459x1()));
            C5135Ly.m96081a(diagnosticsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64563a.mo27474s()));
            C5135Ly.m96073i(diagnosticsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64563a.mo27558P0()));
            C5135Ly.m96074h(diagnosticsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64563a.mo27598A0()));
            C5135Ly.m96077e(diagnosticsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64563a.mo27507i0()));
            C5135Ly.m96070l(diagnosticsActivity, (FO2) C51679xZ3.m5003d(this.f64563a.mo27456y2()));
            C5135Ly.m96065q(diagnosticsActivity, (YR4) C51679xZ3.m5003d(this.f64563a.mo27525b0()));
            C5135Ly.m96079c(diagnosticsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64563a.mo27460x()));
            C5135Ly.m96078d(diagnosticsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64563a.mo27517d3()));
            C5135Ly.m96072j(diagnosticsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64563a.mo27482q()));
            C5135Ly.m96076f(diagnosticsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64563a.mo27483p3()));
            C39525d31.m44659b(diagnosticsActivity, m57608c());
            return diagnosticsActivity;
        }

        public C15169a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C29744w3 c29744w3) {
            this.f64567e = this;
            this.f64563a = interfaceC44393lG2;
            this.f64564b = baseActivity;
            this.f64565c = c29744w3;
            this.f64566d = scopeProvider;
        }
    }

    /* renamed from: co.bird.android.feature.repair.diagnostics.a$b */
    /* loaded from: classes3.dex */
    public static final class C15170b implements DiagnosticsActivity.InterfaceC15166a.InterfaceC15167a {
        @Override // co.bird.android.feature.repair.diagnostics.DiagnosticsActivity.InterfaceC15166a.InterfaceC15167a
        /* renamed from: a */
        public DiagnosticsActivity.InterfaceC15166a mo57605a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C29744w3 c29744w3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c29744w3);
            return new C15169a(interfaceC44393lG2, baseActivity, scopeProvider, c29744w3);
        }

        private C15170b() {
        }
    }

    private C15168a() {
    }

    /* renamed from: a */
    public static DiagnosticsActivity.InterfaceC15166a.InterfaceC15167a m57611a() {
        return new C15170b();
    }
}
