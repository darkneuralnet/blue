package co.bird.android.feature.scrap;

import android.content.Context;
import android.os.Handler;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.scrap.ScrapActivity;
import co.bird.android.model.PhotoBannerViewModel;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.scrap.a */
/* loaded from: classes3.dex */
public final class C15523a {

    /* renamed from: co.bird.android.feature.scrap.a$a */
    /* loaded from: classes3.dex */
    public static final class C15524a implements ScrapActivity.InterfaceC15520a.InterfaceC15521a {
        @Override // co.bird.android.feature.scrap.ScrapActivity.InterfaceC15520a.InterfaceC15521a
        /* renamed from: a */
        public ScrapActivity.InterfaceC15520a mo56980a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC47078pn5 interfaceC47078pn5, BaseActivity baseActivity, RecyclerView recyclerView, Button button, ScopeProvider scopeProvider, PhotoBannerViewModel photoBannerViewModel) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(interfaceC47078pn5);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(recyclerView);
            C51679xZ3.m5005b(button);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(photoBannerViewModel);
            return new C15525b(interfaceC44393lG2, interfaceC47078pn5, baseActivity, recyclerView, button, scopeProvider, photoBannerViewModel);
        }

        private C15524a() {
        }
    }

    /* renamed from: co.bird.android.feature.scrap.a$b */
    /* loaded from: classes3.dex */
    public static final class C15525b implements ScrapActivity.InterfaceC15520a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65195a;

        /* renamed from: b */
        public final InterfaceC47078pn5 f65196b;

        /* renamed from: c */
        public final BaseActivity f65197c;

        /* renamed from: d */
        public final RecyclerView f65198d;

        /* renamed from: e */
        public final Button f65199e;

        /* renamed from: f */
        public final ScopeProvider f65200f;

        /* renamed from: g */
        public final PhotoBannerViewModel f65201g;

        /* renamed from: h */
        public final C15525b f65202h;

        @Override // co.bird.android.feature.scrap.ScrapActivity.InterfaceC15520a
        /* renamed from: a */
        public void mo56979a(ScrapActivity scrapActivity) {
            m56978b(scrapActivity);
        }

        /* renamed from: b */
        public final ScrapActivity m56978b(ScrapActivity scrapActivity) {
            C5135Ly.m96068n(scrapActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65195a.mo27461w2()));
            C5135Ly.m96066p(scrapActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65195a.mo27595B1()));
            C5135Ly.m96071k(scrapActivity, (Handler) C51679xZ3.m5003d(this.f65195a.mo27535X2()));
            C5135Ly.m96067o(scrapActivity, (C22454gl) C51679xZ3.m5003d(this.f65195a.mo27479r()));
            C5135Ly.m96080b(scrapActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65195a.mo27519d0()));
            C5135Ly.m96075g(scrapActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65195a.mo27453z2()));
            C5135Ly.m96064r(scrapActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65195a.mo27459x1()));
            C5135Ly.m96081a(scrapActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65195a.mo27474s()));
            C5135Ly.m96073i(scrapActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65195a.mo27558P0()));
            C5135Ly.m96074h(scrapActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65195a.mo27598A0()));
            C5135Ly.m96077e(scrapActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65195a.mo27507i0()));
            C5135Ly.m96070l(scrapActivity, (FO2) C51679xZ3.m5003d(this.f65195a.mo27456y2()));
            C5135Ly.m96065q(scrapActivity, (YR4) C51679xZ3.m5003d(this.f65195a.mo27525b0()));
            C5135Ly.m96079c(scrapActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65195a.mo27460x()));
            C5135Ly.m96078d(scrapActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65195a.mo27517d3()));
            C5135Ly.m96072j(scrapActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65195a.mo27482q()));
            C5135Ly.m96076f(scrapActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65195a.mo27483p3()));
            C37576Zm5.m72532b(scrapActivity, m56975e());
            return scrapActivity;
        }

        /* renamed from: c */
        public final C38166an5 m56977c() {
            return new C38166an5((InterfaceC48923su2) C51679xZ3.m5003d(this.f65195a.mo27505j0()));
        }

        /* renamed from: d */
        public final C49449tn5 m56976d() {
            return new C49449tn5((Context) C51679xZ3.m5003d(this.f65195a.mo27552R1()));
        }

        /* renamed from: e */
        public final C32221Cp5 m56975e() {
            return new C32221Cp5((InterfaceC40565eo5) C51679xZ3.m5003d(this.f65195a.mo27504j1()), (InterfaceC48923su2) C51679xZ3.m5003d(this.f65195a.mo27505j0()), (InterfaceC39352cn5) C51679xZ3.m5003d(this.f65196b.mo18689a()), m56974f(), this.f65200f, m56976d(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65195a.mo27461w2()), this.f65201g);
        }

        /* renamed from: f */
        public final C33859Jp5 m56974f() {
            return new C33859Jp5(this.f65197c, this.f65198d, this.f65199e, m56977c());
        }

        public C15525b(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC47078pn5 interfaceC47078pn5, BaseActivity baseActivity, RecyclerView recyclerView, Button button, ScopeProvider scopeProvider, PhotoBannerViewModel photoBannerViewModel) {
            this.f65202h = this;
            this.f65195a = interfaceC44393lG2;
            this.f65196b = interfaceC47078pn5;
            this.f65197c = baseActivity;
            this.f65198d = recyclerView;
            this.f65199e = button;
            this.f65200f = scopeProvider;
            this.f65201g = photoBannerViewModel;
        }
    }

    private C15523a() {
    }

    /* renamed from: a */
    public static ScrapActivity.InterfaceC15520a.InterfaceC15521a m56981a() {
        return new C15524a();
    }
}
