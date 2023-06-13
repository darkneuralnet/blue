package co.bird.android.feature.bulkscanner.scan.serviceprogress;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity;
import co.bird.android.feature.bulkscanner.widgets.BulkScanListSheetView;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.widget.BirdActionView;
import com.uber.autodispose.ScopeProvider;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
/* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.c */
/* loaded from: classes3.dex */
public final class C14659c {

    /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.c$a */
    /* loaded from: classes3.dex */
    public static final class C14660a implements BulkServiceProgressScannerActivity.InterfaceC14652a {

        /* renamed from: A */
        public Y94<ScopeProvider> f63539A;

        /* renamed from: B */
        public C44171kt3 f63540B;

        /* renamed from: C */
        public Y94<InterfaceC42985it3> f63541C;

        /* renamed from: D */
        public Y94<InterfaceC40613et3> f63542D;

        /* renamed from: a */
        public final InterfaceC44393lG2 f63543a;

        /* renamed from: b */
        public final ScopeProvider f63544b;

        /* renamed from: c */
        public final BaseActivity f63545c;

        /* renamed from: d */
        public final ImageView f63546d;

        /* renamed from: e */
        public final AppCompatEditText f63547e;

        /* renamed from: f */
        public final ImageView f63548f;

        /* renamed from: g */
        public final View f63549g;

        /* renamed from: h */
        public final BulkScanListSheetView f63550h;

        /* renamed from: i */
        public final ImageView f63551i;

        /* renamed from: j */
        public final BulkScanPurpose f63552j;

        /* renamed from: k */
        public final C14660a f63553k;

        /* renamed from: l */
        public Y94<BaseActivity> f63554l;

        /* renamed from: m */
        public Y94<ZXingScannerView> f63555m;

        /* renamed from: n */
        public Y94<ImageView> f63556n;

        /* renamed from: o */
        public Y94<ImageView> f63557o;

        /* renamed from: p */
        public Y94<AppCompatEditText> f63558p;

        /* renamed from: q */
        public Y94<ImageView> f63559q;

        /* renamed from: r */
        public Y94<TextView> f63560r;

        /* renamed from: s */
        public Y94<TextView> f63561s;

        /* renamed from: t */
        public Y94<ImageView> f63562t;

        /* renamed from: u */
        public Y94<BirdActionView> f63563u;

        /* renamed from: v */
        public Y94<Drawable> f63564v;

        /* renamed from: w */
        public Y94<C48042rQ3> f63565w;

        /* renamed from: x */
        public Y94<Drawable> f63566x;

        /* renamed from: y */
        public Y94<C42944ip2> f63567y;

        /* renamed from: z */
        public Y94<InterfaceC42324hm5> f63568z;

        /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.c$a$a */
        /* loaded from: classes3.dex */
        public static final class C14661a implements Y94<Drawable> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63569a;

            public C14661a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63569a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Drawable get() {
                return this.f63569a.mo24063d();
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.c$a$b */
        /* loaded from: classes3.dex */
        public static final class C14662b implements Y94<Drawable> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63570a;

            public C14662b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63570a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Drawable get() {
                return this.f63570a.mo24067b();
            }
        }

        @Override // co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity.InterfaceC14652a
        /* renamed from: a */
        public void mo58551a(BulkServiceProgressScannerActivity bulkServiceProgressScannerActivity) {
            m58547e(bulkServiceProgressScannerActivity);
        }

        /* renamed from: b */
        public final C50798w40 m58550b() {
            return new C50798w40(this.f63545c, this.f63546d, this.f63547e, this.f63548f, this.f63549g, this.f63550h, this.f63568z.get(), this.f63551i);
        }

        /* renamed from: c */
        public final C43694k50 m58549c() {
            return new C43694k50((InterfaceC37097Xl3) C51679xZ3.m5003d(this.f63543a.mo27542V2()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f63543a.mo27584F0()), (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63543a.mo27517d3()), this.f63544b, m58550b(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63543a.mo27461w2()), this.f63552j, this.f63542D.get(), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63543a.mo27519d0()), this.f63545c, (C36207Tq4) C51679xZ3.m5003d(this.f63543a.mo27595B1()), (InterfaceC33193Gt5) C51679xZ3.m5003d(this.f63543a.mo27534Y()), m58546f());
        }

        /* renamed from: d */
        public final void m58548d(BulkServiceProgressScannerActivity.C14655b c14655b, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, AppCompatEditText appCompatEditText, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, BirdActionView birdActionView, View view, BulkScanListSheetView bulkScanListSheetView, ZXingScannerView zXingScannerView, BulkScanPurpose bulkScanPurpose) {
            this.f63554l = C39546d52.m44621a(baseActivity);
            this.f63555m = C39546d52.m44621a(zXingScannerView);
            this.f63556n = C39546d52.m44621a(imageView4);
            this.f63557o = C39546d52.m44621a(imageView);
            this.f63558p = C39546d52.m44621a(appCompatEditText);
            this.f63559q = C39546d52.m44621a(imageView2);
            this.f63560r = C39546d52.m44620b(textView);
            this.f63561s = C39546d52.m44620b(textView2);
            this.f63562t = C39546d52.m44620b(imageView5);
            this.f63563u = C39546d52.m44620b(birdActionView);
            C14661a c14661a = new C14661a(interfaceC44393lG2);
            this.f63564v = c14661a;
            this.f63565w = C48634sQ3.m14221a(this.f63554l, this.f63555m, this.f63556n, this.f63557o, this.f63558p, this.f63559q, this.f63560r, this.f63561s, this.f63562t, this.f63563u, c14661a);
            C14662b c14662b = new C14662b(interfaceC44393lG2);
            this.f63566x = c14662b;
            C43537jp2 m29879a = C43537jp2.m29879a(this.f63554l, this.f63555m, this.f63556n, this.f63557o, this.f63558p, this.f63559q, this.f63561s, this.f63562t, this.f63563u, this.f63564v, c14662b);
            this.f63567y = m29879a;
            this.f63568z = V51.m80429b(C14657a.m58558a(c14655b, this.f63565w, m29879a));
            this.f63539A = C39546d52.m44621a(scopeProvider);
            C44171kt3 m28241a = C44171kt3.m28241a();
            this.f63540B = m28241a;
            Y94<InterfaceC42985it3> m29781b = C43578jt3.m29781b(m28241a);
            this.f63541C = m29781b;
            this.f63542D = V51.m80429b(C14658b.m58555a(c14655b, this.f63539A, this.f63568z, this.f63555m, m29781b));
        }

        /* renamed from: e */
        public final BulkServiceProgressScannerActivity m58547e(BulkServiceProgressScannerActivity bulkServiceProgressScannerActivity) {
            C5135Ly.m96068n(bulkServiceProgressScannerActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63543a.mo27461w2()));
            C5135Ly.m96066p(bulkServiceProgressScannerActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63543a.mo27595B1()));
            C5135Ly.m96071k(bulkServiceProgressScannerActivity, (Handler) C51679xZ3.m5003d(this.f63543a.mo27535X2()));
            C5135Ly.m96067o(bulkServiceProgressScannerActivity, (C22454gl) C51679xZ3.m5003d(this.f63543a.mo27479r()));
            C5135Ly.m96080b(bulkServiceProgressScannerActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63543a.mo27519d0()));
            C5135Ly.m96075g(bulkServiceProgressScannerActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63543a.mo27453z2()));
            C5135Ly.m96064r(bulkServiceProgressScannerActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63543a.mo27459x1()));
            C5135Ly.m96081a(bulkServiceProgressScannerActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63543a.mo27474s()));
            C5135Ly.m96073i(bulkServiceProgressScannerActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63543a.mo27558P0()));
            C5135Ly.m96074h(bulkServiceProgressScannerActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63543a.mo27598A0()));
            C5135Ly.m96077e(bulkServiceProgressScannerActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63543a.mo27507i0()));
            C5135Ly.m96070l(bulkServiceProgressScannerActivity, (FO2) C51679xZ3.m5003d(this.f63543a.mo27456y2()));
            C5135Ly.m96065q(bulkServiceProgressScannerActivity, (YR4) C51679xZ3.m5003d(this.f63543a.mo27525b0()));
            C5135Ly.m96079c(bulkServiceProgressScannerActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63543a.mo27460x()));
            C5135Ly.m96078d(bulkServiceProgressScannerActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63543a.mo27517d3()));
            C5135Ly.m96072j(bulkServiceProgressScannerActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63543a.mo27482q()));
            C5135Ly.m96076f(bulkServiceProgressScannerActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63543a.mo27483p3()));
            C38933c50.m61948b(bulkServiceProgressScannerActivity, m58549c());
            return bulkServiceProgressScannerActivity;
        }

        /* renamed from: f */
        public final C31789At5 m58546f() {
            return new C31789At5((Context) C51679xZ3.m5003d(this.f63543a.mo27552R1()));
        }

        public C14660a(BulkServiceProgressScannerActivity.C14655b c14655b, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, AppCompatEditText appCompatEditText, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, BirdActionView birdActionView, View view, BulkScanListSheetView bulkScanListSheetView, ZXingScannerView zXingScannerView, BulkScanPurpose bulkScanPurpose) {
            this.f63553k = this;
            this.f63543a = interfaceC44393lG2;
            this.f63544b = scopeProvider;
            this.f63545c = baseActivity;
            this.f63546d = imageView;
            this.f63547e = appCompatEditText;
            this.f63548f = imageView2;
            this.f63549g = view;
            this.f63550h = bulkScanListSheetView;
            this.f63551i = imageView3;
            this.f63552j = bulkScanPurpose;
            m58548d(c14655b, interfaceC44393lG2, baseActivity, scopeProvider, imageView, appCompatEditText, imageView2, imageView3, imageView4, textView, textView2, imageView5, birdActionView, view, bulkScanListSheetView, zXingScannerView, bulkScanPurpose);
        }
    }

    /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.c$b */
    /* loaded from: classes3.dex */
    public static final class C14663b implements BulkServiceProgressScannerActivity.InterfaceC14652a.InterfaceC14653a {
        @Override // co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity.InterfaceC14652a.InterfaceC14653a
        /* renamed from: a */
        public BulkServiceProgressScannerActivity.InterfaceC14652a mo58543a(InterfaceC44393lG2 interfaceC44393lG2, BulkServiceProgressScannerActivity.C14655b c14655b, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, AppCompatEditText appCompatEditText, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, BirdActionView birdActionView, View view, BulkScanListSheetView bulkScanListSheetView, ZXingScannerView zXingScannerView, BulkScanPurpose bulkScanPurpose) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c14655b);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(imageView);
            C51679xZ3.m5005b(appCompatEditText);
            C51679xZ3.m5005b(imageView2);
            C51679xZ3.m5005b(imageView3);
            C51679xZ3.m5005b(imageView4);
            C51679xZ3.m5005b(view);
            C51679xZ3.m5005b(bulkScanListSheetView);
            C51679xZ3.m5005b(zXingScannerView);
            C51679xZ3.m5005b(bulkScanPurpose);
            return new C14660a(c14655b, interfaceC44393lG2, baseActivity, scopeProvider, imageView, appCompatEditText, imageView2, imageView3, imageView4, textView, textView2, imageView5, birdActionView, view, bulkScanListSheetView, zXingScannerView, bulkScanPurpose);
        }

        private C14663b() {
        }
    }

    private C14659c() {
    }

    /* renamed from: a */
    public static BulkServiceProgressScannerActivity.InterfaceC14652a.InterfaceC14653a m58552a() {
        return new C14663b();
    }
}
