package co.bird.android.feature.hardcount.details;

import android.content.Context;
import android.os.Handler;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.hardcount.details.HardCountDetailsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.hardcount.details.a */
/* loaded from: classes3.dex */
public final class C14875a {

    /* renamed from: co.bird.android.feature.hardcount.details.a$a */
    /* loaded from: classes3.dex */
    public static final class C14876a implements HardCountDetailsActivity.InterfaceC14872a.InterfaceC14873a {
        @Override // co.bird.android.feature.hardcount.details.HardCountDetailsActivity.InterfaceC14872a.InterfaceC14873a
        /* renamed from: a */
        public HardCountDetailsActivity.InterfaceC14872a mo58083a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(recyclerView);
            C51679xZ3.m5005b(textView);
            C51679xZ3.m5005b(constraintLayout);
            return new C14877b(interfaceC44393lG2, baseActivity, scopeProvider, recyclerView, textView, constraintLayout);
        }

        private C14876a() {
        }
    }

    /* renamed from: co.bird.android.feature.hardcount.details.a$b */
    /* loaded from: classes3.dex */
    public static final class C14877b implements HardCountDetailsActivity.InterfaceC14872a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64066a;

        /* renamed from: b */
        public final BaseActivity f64067b;

        /* renamed from: c */
        public final TextView f64068c;

        /* renamed from: d */
        public final RecyclerView f64069d;

        /* renamed from: e */
        public final ConstraintLayout f64070e;

        /* renamed from: f */
        public final ScopeProvider f64071f;

        /* renamed from: g */
        public final C14877b f64072g;

        @Override // co.bird.android.feature.hardcount.details.HardCountDetailsActivity.InterfaceC14872a
        /* renamed from: a */
        public void mo58082a(HardCountDetailsActivity hardCountDetailsActivity) {
            m58078e(hardCountDetailsActivity);
        }

        /* renamed from: b */
        public final C46755pF1 m58081b() {
            return new C46755pF1((Context) C51679xZ3.m5003d(this.f64066a.mo27552R1()));
        }

        /* renamed from: c */
        public final BF1 m58080c() {
            return new BF1(m58079d(), this.f64071f, m58081b(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64066a.mo27461w2()), (XF1) C51679xZ3.m5003d(this.f64066a.mo27569L0()));
        }

        /* renamed from: d */
        public final EF1 m58079d() {
            return new EF1(this.f64067b, this.f64068c, this.f64069d, this.f64070e);
        }

        /* renamed from: e */
        public final HardCountDetailsActivity m58078e(HardCountDetailsActivity hardCountDetailsActivity) {
            C5135Ly.m96068n(hardCountDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64066a.mo27461w2()));
            C5135Ly.m96066p(hardCountDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64066a.mo27595B1()));
            C5135Ly.m96071k(hardCountDetailsActivity, (Handler) C51679xZ3.m5003d(this.f64066a.mo27535X2()));
            C5135Ly.m96067o(hardCountDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f64066a.mo27479r()));
            C5135Ly.m96080b(hardCountDetailsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64066a.mo27519d0()));
            C5135Ly.m96075g(hardCountDetailsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64066a.mo27453z2()));
            C5135Ly.m96064r(hardCountDetailsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64066a.mo27459x1()));
            C5135Ly.m96081a(hardCountDetailsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64066a.mo27474s()));
            C5135Ly.m96073i(hardCountDetailsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64066a.mo27558P0()));
            C5135Ly.m96074h(hardCountDetailsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64066a.mo27598A0()));
            C5135Ly.m96077e(hardCountDetailsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64066a.mo27507i0()));
            C5135Ly.m96070l(hardCountDetailsActivity, (FO2) C51679xZ3.m5003d(this.f64066a.mo27456y2()));
            C5135Ly.m96065q(hardCountDetailsActivity, (YR4) C51679xZ3.m5003d(this.f64066a.mo27525b0()));
            C5135Ly.m96079c(hardCountDetailsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64066a.mo27460x()));
            C5135Ly.m96078d(hardCountDetailsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64066a.mo27517d3()));
            C5135Ly.m96072j(hardCountDetailsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64066a.mo27482q()));
            C5135Ly.m96076f(hardCountDetailsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64066a.mo27483p3()));
            C43790kF1.m29137b(hardCountDetailsActivity, m58080c());
            return hardCountDetailsActivity;
        }

        public C14877b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout) {
            this.f64072g = this;
            this.f64066a = interfaceC44393lG2;
            this.f64067b = baseActivity;
            this.f64068c = textView;
            this.f64069d = recyclerView;
            this.f64070e = constraintLayout;
            this.f64071f = scopeProvider;
        }
    }

    private C14875a() {
    }

    /* renamed from: a */
    public static HardCountDetailsActivity.InterfaceC14872a.InterfaceC14873a m58084a() {
        return new C14876a();
    }
}
