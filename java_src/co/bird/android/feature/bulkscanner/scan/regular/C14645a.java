package co.bird.android.feature.bulkscanner.scan.regular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.bulkscanner.scan.regular.DefaultBulkScannerActivity;
import co.bird.android.feature.bulkscanner.widgets.BulkScanListSheetView;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.widget.BirdActionView;
import com.uber.autodispose.ScopeProvider;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
/* renamed from: co.bird.android.feature.bulkscanner.scan.regular.a */
/* loaded from: classes3.dex */
public final class C14645a {

    /* renamed from: co.bird.android.feature.bulkscanner.scan.regular.a$a */
    /* loaded from: classes3.dex */
    public static final class C14646a implements DefaultBulkScannerActivity.InterfaceC14640a {

        /* renamed from: A */
        public Y94<InterfaceC42324hm5> f63488A;

        /* renamed from: B */
        public Y94<ScopeProvider> f63489B;

        /* renamed from: C */
        public C44171kt3 f63490C;

        /* renamed from: D */
        public Y94<InterfaceC42985it3> f63491D;

        /* renamed from: E */
        public Y94<InterfaceC40613et3> f63492E;

        /* renamed from: a */
        public final InterfaceC44393lG2 f63493a;

        /* renamed from: b */
        public final ScopeProvider f63494b;

        /* renamed from: c */
        public final BaseActivity f63495c;

        /* renamed from: d */
        public final ImageView f63496d;

        /* renamed from: e */
        public final AppCompatEditText f63497e;

        /* renamed from: f */
        public final ImageView f63498f;

        /* renamed from: g */
        public final View f63499g;

        /* renamed from: h */
        public final BulkScanListSheetView f63500h;

        /* renamed from: i */
        public final ImageView f63501i;

        /* renamed from: j */
        public final BulkScanPurpose f63502j;

        /* renamed from: k */
        public final WireBatch f63503k;

        /* renamed from: l */
        public final C14646a f63504l;

        /* renamed from: m */
        public Y94<BaseActivity> f63505m;

        /* renamed from: n */
        public Y94<ZXingScannerView> f63506n;

        /* renamed from: o */
        public Y94<ImageView> f63507o;

        /* renamed from: p */
        public Y94<ImageView> f63508p;

        /* renamed from: q */
        public Y94<AppCompatEditText> f63509q;

        /* renamed from: r */
        public Y94<ImageView> f63510r;

        /* renamed from: s */
        public Y94<TextView> f63511s;

        /* renamed from: t */
        public Y94<TextView> f63512t;

        /* renamed from: u */
        public Y94<ImageView> f63513u;

        /* renamed from: v */
        public Y94<BirdActionView> f63514v;

        /* renamed from: w */
        public Y94<Drawable> f63515w;

        /* renamed from: x */
        public Y94<C48042rQ3> f63516x;

        /* renamed from: y */
        public Y94<Drawable> f63517y;

        /* renamed from: z */
        public Y94<C42944ip2> f63518z;

        /* renamed from: co.bird.android.feature.bulkscanner.scan.regular.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C14647a implements Y94<Drawable> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63519a;

            public C14647a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63519a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Drawable get() {
                return this.f63519a.mo24063d();
            }
        }

        /* renamed from: co.bird.android.feature.bulkscanner.scan.regular.a$a$b */
        /* loaded from: classes3.dex */
        public static final class C14648b implements Y94<Drawable> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f63520a;

            public C14648b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f63520a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Drawable get() {
                return this.f63520a.mo24067b();
            }
        }

        @Override // co.bird.android.feature.bulkscanner.scan.regular.DefaultBulkScannerActivity.InterfaceC14640a
        /* renamed from: a */
        public void mo58579a(DefaultBulkScannerActivity defaultBulkScannerActivity) {
            m58574f(defaultBulkScannerActivity);
        }

        /* renamed from: b */
        public final C49613u40 m58578b() {
            return new C49613u40((InterfaceC37097Xl3) C51679xZ3.m5003d(this.f63493a.mo27542V2()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f63493a.mo27584F0()), (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63493a.mo27517d3()), (InterfaceC12495bn) C51679xZ3.m5003d(this.f63493a.mo27516e0()), this.f63494b, m58577c(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63493a.mo27461w2()), this.f63502j, this.f63492E.get(), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63493a.mo27519d0()), this.f63503k, this.f63495c, (C36207Tq4) C51679xZ3.m5003d(this.f63493a.mo27595B1()), m58576d());
        }

        /* renamed from: c */
        public final C50798w40 m58577c() {
            return new C50798w40(this.f63495c, this.f63496d, this.f63497e, this.f63498f, this.f63499g, this.f63500h, this.f63488A.get(), this.f63501i);
        }

        /* renamed from: d */
        public final C50463vW0 m58576d() {
            return new C50463vW0((Context) C51679xZ3.m5003d(this.f63493a.mo27552R1()));
        }

        /* renamed from: e */
        public final void m58575e(DefaultBulkScannerActivity.C14643b c14643b, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, AppCompatEditText appCompatEditText, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, BirdActionView birdActionView, View view, BulkScanListSheetView bulkScanListSheetView, ZXingScannerView zXingScannerView, BulkScanPurpose bulkScanPurpose, WireBatch wireBatch) {
            this.f63505m = C39546d52.m44621a(baseActivity);
            this.f63506n = C39546d52.m44621a(zXingScannerView);
            this.f63507o = C39546d52.m44621a(imageView4);
            this.f63508p = C39546d52.m44621a(imageView);
            this.f63509q = C39546d52.m44621a(appCompatEditText);
            this.f63510r = C39546d52.m44621a(imageView2);
            this.f63511s = C39546d52.m44620b(textView);
            this.f63512t = C39546d52.m44620b(textView2);
            this.f63513u = C39546d52.m44620b(imageView5);
            this.f63514v = C39546d52.m44620b(birdActionView);
            C14647a c14647a = new C14647a(interfaceC44393lG2);
            this.f63515w = c14647a;
            this.f63516x = C48634sQ3.m14221a(this.f63505m, this.f63506n, this.f63507o, this.f63508p, this.f63509q, this.f63510r, this.f63511s, this.f63512t, this.f63513u, this.f63514v, c14647a);
            C14648b c14648b = new C14648b(interfaceC44393lG2);
            this.f63517y = c14648b;
            C43537jp2 m29879a = C43537jp2.m29879a(this.f63505m, this.f63506n, this.f63507o, this.f63508p, this.f63509q, this.f63510r, this.f63512t, this.f63513u, this.f63514v, this.f63515w, c14648b);
            this.f63518z = m29879a;
            this.f63488A = V51.m80429b(C14650b.m58570a(c14643b, this.f63516x, m29879a));
            this.f63489B = C39546d52.m44621a(scopeProvider);
            C44171kt3 m28241a = C44171kt3.m28241a();
            this.f63490C = m28241a;
            Y94<InterfaceC42985it3> m29781b = C43578jt3.m29781b(m28241a);
            this.f63491D = m29781b;
            this.f63492E = V51.m80429b(C14651c.m58567a(c14643b, this.f63489B, this.f63488A, this.f63506n, m29781b));
        }

        /* renamed from: f */
        public final DefaultBulkScannerActivity m58574f(DefaultBulkScannerActivity defaultBulkScannerActivity) {
            C5135Ly.m96068n(defaultBulkScannerActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63493a.mo27461w2()));
            C5135Ly.m96066p(defaultBulkScannerActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63493a.mo27595B1()));
            C5135Ly.m96071k(defaultBulkScannerActivity, (Handler) C51679xZ3.m5003d(this.f63493a.mo27535X2()));
            C5135Ly.m96067o(defaultBulkScannerActivity, (C22454gl) C51679xZ3.m5003d(this.f63493a.mo27479r()));
            C5135Ly.m96080b(defaultBulkScannerActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63493a.mo27519d0()));
            C5135Ly.m96075g(defaultBulkScannerActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63493a.mo27453z2()));
            C5135Ly.m96064r(defaultBulkScannerActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63493a.mo27459x1()));
            C5135Ly.m96081a(defaultBulkScannerActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63493a.mo27474s()));
            C5135Ly.m96073i(defaultBulkScannerActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63493a.mo27558P0()));
            C5135Ly.m96074h(defaultBulkScannerActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63493a.mo27598A0()));
            C5135Ly.m96077e(defaultBulkScannerActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63493a.mo27507i0()));
            C5135Ly.m96070l(defaultBulkScannerActivity, (FO2) C51679xZ3.m5003d(this.f63493a.mo27456y2()));
            C5135Ly.m96065q(defaultBulkScannerActivity, (YR4) C51679xZ3.m5003d(this.f63493a.mo27525b0()));
            C5135Ly.m96079c(defaultBulkScannerActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63493a.mo27460x()));
            C5135Ly.m96078d(defaultBulkScannerActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63493a.mo27517d3()));
            C5135Ly.m96072j(defaultBulkScannerActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63493a.mo27482q()));
            C5135Ly.m96076f(defaultBulkScannerActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63493a.mo27483p3()));
            C51056wW0.m6724b(defaultBulkScannerActivity, m58578b());
            return defaultBulkScannerActivity;
        }

        public C14646a(DefaultBulkScannerActivity.C14643b c14643b, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, AppCompatEditText appCompatEditText, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, BirdActionView birdActionView, View view, BulkScanListSheetView bulkScanListSheetView, ZXingScannerView zXingScannerView, BulkScanPurpose bulkScanPurpose, WireBatch wireBatch) {
            this.f63504l = this;
            this.f63493a = interfaceC44393lG2;
            this.f63494b = scopeProvider;
            this.f63495c = baseActivity;
            this.f63496d = imageView;
            this.f63497e = appCompatEditText;
            this.f63498f = imageView2;
            this.f63499g = view;
            this.f63500h = bulkScanListSheetView;
            this.f63501i = imageView3;
            this.f63502j = bulkScanPurpose;
            this.f63503k = wireBatch;
            m58575e(c14643b, interfaceC44393lG2, baseActivity, scopeProvider, imageView, appCompatEditText, imageView2, imageView3, imageView4, textView, textView2, imageView5, birdActionView, view, bulkScanListSheetView, zXingScannerView, bulkScanPurpose, wireBatch);
        }
    }

    /* renamed from: co.bird.android.feature.bulkscanner.scan.regular.a$b */
    /* loaded from: classes3.dex */
    public static final class C14649b implements DefaultBulkScannerActivity.InterfaceC14640a.InterfaceC14641a {
        @Override // co.bird.android.feature.bulkscanner.scan.regular.DefaultBulkScannerActivity.InterfaceC14640a.InterfaceC14641a
        /* renamed from: a */
        public DefaultBulkScannerActivity.InterfaceC14640a mo58571a(InterfaceC44393lG2 interfaceC44393lG2, DefaultBulkScannerActivity.C14643b c14643b, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, AppCompatEditText appCompatEditText, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, BirdActionView birdActionView, View view, BulkScanListSheetView bulkScanListSheetView, ZXingScannerView zXingScannerView, BulkScanPurpose bulkScanPurpose, WireBatch wireBatch) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c14643b);
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
            return new C14646a(c14643b, interfaceC44393lG2, baseActivity, scopeProvider, imageView, appCompatEditText, imageView2, imageView3, imageView4, textView, textView2, imageView5, birdActionView, view, bulkScanListSheetView, zXingScannerView, bulkScanPurpose, wireBatch);
        }

        private C14649b() {
        }
    }

    private C14645a() {
    }

    /* renamed from: a */
    public static DefaultBulkScannerActivity.InterfaceC14640a.InterfaceC14641a m58580a() {
        return new C14649b();
    }
}
