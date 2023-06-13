package co.bird.android.feature.transferorder.container.processing;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.transferorder.container.processing.ProcessContainerOrderActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.transferorder.container.processing.a */
/* loaded from: classes3.dex */
public final class C15792a {

    /* renamed from: co.bird.android.feature.transferorder.container.processing.a$a */
    /* loaded from: classes3.dex */
    public static final class C15793a implements ProcessContainerOrderActivity.InterfaceC15790a.InterfaceC15791a {
        @Override // co.bird.android.feature.transferorder.container.processing.ProcessContainerOrderActivity.InterfaceC15790a.InterfaceC15791a
        /* renamed from: a */
        public ProcessContainerOrderActivity.InterfaceC15790a mo56558a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7321S4 c7321s4, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c7321s4);
            C51679xZ3.m5005b(str);
            return new C15794b(interfaceC44393lG2, baseActivity, scopeProvider, c7321s4, str);
        }

        private C15793a() {
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.container.processing.a$b */
    /* loaded from: classes3.dex */
    public static final class C15794b implements ProcessContainerOrderActivity.InterfaceC15790a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65683a;

        /* renamed from: b */
        public final BaseActivity f65684b;

        /* renamed from: c */
        public final C7321S4 f65685c;

        /* renamed from: d */
        public final ScopeProvider f65686d;

        /* renamed from: e */
        public final String f65687e;

        /* renamed from: f */
        public final C15794b f65688f;

        @Override // co.bird.android.feature.transferorder.container.processing.ProcessContainerOrderActivity.InterfaceC15790a
        /* renamed from: a */
        public void mo56557a(ProcessContainerOrderActivity processContainerOrderActivity) {
            m56556b(processContainerOrderActivity);
        }

        /* renamed from: b */
        public final ProcessContainerOrderActivity m56556b(ProcessContainerOrderActivity processContainerOrderActivity) {
            C5135Ly.m96068n(processContainerOrderActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65683a.mo27461w2()));
            C5135Ly.m96066p(processContainerOrderActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65683a.mo27595B1()));
            C5135Ly.m96071k(processContainerOrderActivity, (Handler) C51679xZ3.m5003d(this.f65683a.mo27535X2()));
            C5135Ly.m96067o(processContainerOrderActivity, (C22454gl) C51679xZ3.m5003d(this.f65683a.mo27479r()));
            C5135Ly.m96080b(processContainerOrderActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65683a.mo27519d0()));
            C5135Ly.m96075g(processContainerOrderActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65683a.mo27453z2()));
            C5135Ly.m96064r(processContainerOrderActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65683a.mo27459x1()));
            C5135Ly.m96081a(processContainerOrderActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65683a.mo27474s()));
            C5135Ly.m96073i(processContainerOrderActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65683a.mo27558P0()));
            C5135Ly.m96074h(processContainerOrderActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65683a.mo27598A0()));
            C5135Ly.m96077e(processContainerOrderActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65683a.mo27507i0()));
            C5135Ly.m96070l(processContainerOrderActivity, (FO2) C51679xZ3.m5003d(this.f65683a.mo27456y2()));
            C5135Ly.m96065q(processContainerOrderActivity, (YR4) C51679xZ3.m5003d(this.f65683a.mo27525b0()));
            C5135Ly.m96079c(processContainerOrderActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65683a.mo27460x()));
            C5135Ly.m96078d(processContainerOrderActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65683a.mo27517d3()));
            C5135Ly.m96072j(processContainerOrderActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65683a.mo27482q()));
            C5135Ly.m96076f(processContainerOrderActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65683a.mo27483p3()));
            C48451s64.m14772b(processContainerOrderActivity, m56554d());
            return processContainerOrderActivity;
        }

        /* renamed from: c */
        public final C50229v64 m56555c() {
            return new C50229v64((Context) C51679xZ3.m5003d(this.f65683a.mo27552R1()));
        }

        /* renamed from: d */
        public final G64 m56554d() {
            return new G64(m56553e(), m56555c(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65683a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f65683a.mo27595B1()), this.f65686d, (O86) C51679xZ3.m5003d(this.f65683a.mo27485p()), this.f65687e);
        }

        /* renamed from: e */
        public final L64 m56553e() {
            return new L64(this.f65684b, this.f65685c);
        }

        public C15794b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7321S4 c7321s4, String str) {
            this.f65688f = this;
            this.f65683a = interfaceC44393lG2;
            this.f65684b = baseActivity;
            this.f65685c = c7321s4;
            this.f65686d = scopeProvider;
            this.f65687e = str;
        }
    }

    private C15792a() {
    }

    /* renamed from: a */
    public static ProcessContainerOrderActivity.InterfaceC15790a.InterfaceC15791a m56559a() {
        return new C15793a();
    }
}
