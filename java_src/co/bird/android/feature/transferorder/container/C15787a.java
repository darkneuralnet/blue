package co.bird.android.feature.transferorder.container;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.transferorder.container.ContainerDetailsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.transferorder.container.a */
/* loaded from: classes3.dex */
public final class C15787a {

    /* renamed from: co.bird.android.feature.transferorder.container.a$a */
    /* loaded from: classes3.dex */
    public static final class C15788a implements ContainerDetailsActivity.InterfaceC15785a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65676a;

        /* renamed from: b */
        public final BaseActivity f65677b;

        /* renamed from: c */
        public final C27825r3 f65678c;

        /* renamed from: d */
        public final ScopeProvider f65679d;

        /* renamed from: e */
        public final String f65680e;

        /* renamed from: f */
        public final C15788a f65681f;

        @Override // co.bird.android.feature.transferorder.container.ContainerDetailsActivity.InterfaceC15785a
        /* renamed from: a */
        public void mo56566a(ContainerDetailsActivity containerDetailsActivity) {
            m56562e(containerDetailsActivity);
        }

        /* renamed from: b */
        public final C32072Bz0 m56565b() {
            return new C32072Bz0((Context) C51679xZ3.m5003d(this.f65676a.mo27552R1()));
        }

        /* renamed from: c */
        public final C34880Nz0 m56564c() {
            return new C34880Nz0(m56563d(), m56565b(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65676a.mo27461w2()), this.f65679d, (O86) C51679xZ3.m5003d(this.f65676a.mo27485p()), this.f65680e);
        }

        /* renamed from: d */
        public final C35348Pz0 m56563d() {
            return new C35348Pz0(this.f65677b, this.f65678c);
        }

        /* renamed from: e */
        public final ContainerDetailsActivity m56562e(ContainerDetailsActivity containerDetailsActivity) {
            C5135Ly.m96068n(containerDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65676a.mo27461w2()));
            C5135Ly.m96066p(containerDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65676a.mo27595B1()));
            C5135Ly.m96071k(containerDetailsActivity, (Handler) C51679xZ3.m5003d(this.f65676a.mo27535X2()));
            C5135Ly.m96067o(containerDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f65676a.mo27479r()));
            C5135Ly.m96080b(containerDetailsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65676a.mo27519d0()));
            C5135Ly.m96075g(containerDetailsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65676a.mo27453z2()));
            C5135Ly.m96064r(containerDetailsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65676a.mo27459x1()));
            C5135Ly.m96081a(containerDetailsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65676a.mo27474s()));
            C5135Ly.m96073i(containerDetailsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65676a.mo27558P0()));
            C5135Ly.m96074h(containerDetailsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65676a.mo27598A0()));
            C5135Ly.m96077e(containerDetailsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65676a.mo27507i0()));
            C5135Ly.m96070l(containerDetailsActivity, (FO2) C51679xZ3.m5003d(this.f65676a.mo27456y2()));
            C5135Ly.m96065q(containerDetailsActivity, (YR4) C51679xZ3.m5003d(this.f65676a.mo27525b0()));
            C5135Ly.m96079c(containerDetailsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65676a.mo27460x()));
            C5135Ly.m96078d(containerDetailsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65676a.mo27517d3()));
            C5135Ly.m96072j(containerDetailsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65676a.mo27482q()));
            C5135Ly.m96076f(containerDetailsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65676a.mo27483p3()));
            C50749vz0.m7620b(containerDetailsActivity, m56564c());
            return containerDetailsActivity;
        }

        public C15788a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27825r3 c27825r3, String str) {
            this.f65681f = this;
            this.f65676a = interfaceC44393lG2;
            this.f65677b = baseActivity;
            this.f65678c = c27825r3;
            this.f65679d = scopeProvider;
            this.f65680e = str;
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.container.a$b */
    /* loaded from: classes3.dex */
    public static final class C15789b implements ContainerDetailsActivity.InterfaceC15785a.InterfaceC15786a {
        @Override // co.bird.android.feature.transferorder.container.ContainerDetailsActivity.InterfaceC15785a.InterfaceC15786a
        /* renamed from: a */
        public ContainerDetailsActivity.InterfaceC15785a mo56561a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27825r3 c27825r3, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c27825r3);
            C51679xZ3.m5005b(str);
            return new C15788a(interfaceC44393lG2, baseActivity, scopeProvider, c27825r3, str);
        }

        private C15789b() {
        }
    }

    private C15787a() {
    }

    /* renamed from: a */
    public static ContainerDetailsActivity.InterfaceC15785a.InterfaceC15786a m56567a() {
        return new C15789b();
    }
}
