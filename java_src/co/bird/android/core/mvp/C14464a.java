package co.bird.android.core.mvp;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
/* renamed from: co.bird.android.core.mvp.a */
/* loaded from: classes2.dex */
public final class C14464a {

    /* renamed from: co.bird.android.core.mvp.a$a */
    /* loaded from: classes2.dex */
    public static final class C14465a implements BaseActivity.InterfaceC14461a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63128a;

        /* renamed from: b */
        public final C14465a f63129b;

        @Override // co.bird.android.core.mvp.BaseActivity.InterfaceC14461a
        /* renamed from: a */
        public void mo58952a(BaseActivity baseActivity) {
            m58951b(baseActivity);
        }

        /* renamed from: b */
        public final BaseActivity m58951b(BaseActivity baseActivity) {
            C5135Ly.m96068n(baseActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63128a.mo27461w2()));
            C5135Ly.m96066p(baseActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63128a.mo27595B1()));
            C5135Ly.m96071k(baseActivity, (Handler) C51679xZ3.m5003d(this.f63128a.mo27535X2()));
            C5135Ly.m96067o(baseActivity, (C22454gl) C51679xZ3.m5003d(this.f63128a.mo27479r()));
            C5135Ly.m96080b(baseActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63128a.mo27519d0()));
            C5135Ly.m96075g(baseActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63128a.mo27453z2()));
            C5135Ly.m96064r(baseActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63128a.mo27459x1()));
            C5135Ly.m96081a(baseActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63128a.mo27474s()));
            C5135Ly.m96073i(baseActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63128a.mo27558P0()));
            C5135Ly.m96074h(baseActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63128a.mo27598A0()));
            C5135Ly.m96077e(baseActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63128a.mo27507i0()));
            C5135Ly.m96070l(baseActivity, (FO2) C51679xZ3.m5003d(this.f63128a.mo27456y2()));
            C5135Ly.m96065q(baseActivity, (YR4) C51679xZ3.m5003d(this.f63128a.mo27525b0()));
            C5135Ly.m96079c(baseActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63128a.mo27460x()));
            C5135Ly.m96078d(baseActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63128a.mo27517d3()));
            C5135Ly.m96072j(baseActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63128a.mo27482q()));
            C5135Ly.m96076f(baseActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63128a.mo27483p3()));
            return baseActivity;
        }

        public C14465a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f63129b = this;
            this.f63128a = interfaceC44393lG2;
        }
    }

    /* renamed from: co.bird.android.core.mvp.a$b */
    /* loaded from: classes2.dex */
    public static final class C14466b implements BaseActivity.InterfaceC14461a.InterfaceC14462a {

        /* renamed from: a */
        public InterfaceC44393lG2 f63130a;

        @Override // co.bird.android.core.mvp.BaseActivity.InterfaceC14461a.InterfaceC14462a
        /* renamed from: b */
        public C14466b mo58950a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f63130a = (InterfaceC44393lG2) C51679xZ3.m5005b(interfaceC44393lG2);
            return this;
        }

        @Override // co.bird.android.core.mvp.BaseActivity.InterfaceC14461a.InterfaceC14462a
        public BaseActivity.InterfaceC14461a build() {
            C51679xZ3.m5006a(this.f63130a, InterfaceC44393lG2.class);
            return new C14465a(this.f63130a);
        }

        private C14466b() {
        }
    }

    private C14464a() {
    }

    /* renamed from: a */
    public static BaseActivity.InterfaceC14461a.InterfaceC14462a m58953a() {
        return new C14466b();
    }
}
