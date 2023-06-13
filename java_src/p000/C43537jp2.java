package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.BirdActionView;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
/* renamed from: jp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43537jp2 implements InterfaceC48812sj1<C42944ip2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f93396a;

    /* renamed from: b */
    public final Y94<ZXingScannerView> f93397b;

    /* renamed from: c */
    public final Y94<ImageView> f93398c;

    /* renamed from: d */
    public final Y94<ImageView> f93399d;

    /* renamed from: e */
    public final Y94<AppCompatEditText> f93400e;

    /* renamed from: f */
    public final Y94<ImageView> f93401f;

    /* renamed from: g */
    public final Y94<TextView> f93402g;

    /* renamed from: h */
    public final Y94<ImageView> f93403h;

    /* renamed from: i */
    public final Y94<BirdActionView> f93404i;

    /* renamed from: j */
    public final Y94<Drawable> f93405j;

    /* renamed from: k */
    public final Y94<Drawable> f93406k;

    public C43537jp2(Y94<BaseActivity> y94, Y94<ZXingScannerView> y942, Y94<ImageView> y943, Y94<ImageView> y944, Y94<AppCompatEditText> y945, Y94<ImageView> y946, Y94<TextView> y947, Y94<ImageView> y948, Y94<BirdActionView> y949, Y94<Drawable> y9410, Y94<Drawable> y9411) {
        this.f93396a = y94;
        this.f93397b = y942;
        this.f93398c = y943;
        this.f93399d = y944;
        this.f93400e = y945;
        this.f93401f = y946;
        this.f93402g = y947;
        this.f93403h = y948;
        this.f93404i = y949;
        this.f93405j = y9410;
        this.f93406k = y9411;
    }

    /* renamed from: a */
    public static C43537jp2 m29879a(Y94<BaseActivity> y94, Y94<ZXingScannerView> y942, Y94<ImageView> y943, Y94<ImageView> y944, Y94<AppCompatEditText> y945, Y94<ImageView> y946, Y94<TextView> y947, Y94<ImageView> y948, Y94<BirdActionView> y949, Y94<Drawable> y9410, Y94<Drawable> y9411) {
        return new C43537jp2(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    /* renamed from: c */
    public static C42944ip2 m29877c(BaseActivity baseActivity, ZXingScannerView zXingScannerView, ImageView imageView, ImageView imageView2, AppCompatEditText appCompatEditText, ImageView imageView3, TextView textView, ImageView imageView4, BirdActionView birdActionView, Drawable drawable, Drawable drawable2) {
        return new C42944ip2(baseActivity, zXingScannerView, imageView, imageView2, appCompatEditText, imageView3, textView, imageView4, birdActionView, drawable, drawable2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C42944ip2 get() {
        return m29877c(this.f93396a.get(), this.f93397b.get(), this.f93398c.get(), this.f93399d.get(), this.f93400e.get(), this.f93401f.get(), this.f93402g.get(), this.f93403h.get(), this.f93404i.get(), this.f93405j.get(), this.f93406k.get());
    }
}
