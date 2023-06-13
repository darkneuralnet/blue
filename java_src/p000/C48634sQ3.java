package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.BirdActionView;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
/* renamed from: sQ3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48634sQ3 implements InterfaceC48812sj1<C48042rQ3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f108753a;

    /* renamed from: b */
    public final Y94<ZXingScannerView> f108754b;

    /* renamed from: c */
    public final Y94<ImageView> f108755c;

    /* renamed from: d */
    public final Y94<ImageView> f108756d;

    /* renamed from: e */
    public final Y94<AppCompatEditText> f108757e;

    /* renamed from: f */
    public final Y94<ImageView> f108758f;

    /* renamed from: g */
    public final Y94<TextView> f108759g;

    /* renamed from: h */
    public final Y94<TextView> f108760h;

    /* renamed from: i */
    public final Y94<ImageView> f108761i;

    /* renamed from: j */
    public final Y94<BirdActionView> f108762j;

    /* renamed from: k */
    public final Y94<Drawable> f108763k;

    public C48634sQ3(Y94<BaseActivity> y94, Y94<ZXingScannerView> y942, Y94<ImageView> y943, Y94<ImageView> y944, Y94<AppCompatEditText> y945, Y94<ImageView> y946, Y94<TextView> y947, Y94<TextView> y948, Y94<ImageView> y949, Y94<BirdActionView> y9410, Y94<Drawable> y9411) {
        this.f108753a = y94;
        this.f108754b = y942;
        this.f108755c = y943;
        this.f108756d = y944;
        this.f108757e = y945;
        this.f108758f = y946;
        this.f108759g = y947;
        this.f108760h = y948;
        this.f108761i = y949;
        this.f108762j = y9410;
        this.f108763k = y9411;
    }

    /* renamed from: a */
    public static C48634sQ3 m14221a(Y94<BaseActivity> y94, Y94<ZXingScannerView> y942, Y94<ImageView> y943, Y94<ImageView> y944, Y94<AppCompatEditText> y945, Y94<ImageView> y946, Y94<TextView> y947, Y94<TextView> y948, Y94<ImageView> y949, Y94<BirdActionView> y9410, Y94<Drawable> y9411) {
        return new C48634sQ3(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    /* renamed from: c */
    public static C48042rQ3 m14219c(BaseActivity baseActivity, ZXingScannerView zXingScannerView, ImageView imageView, ImageView imageView2, AppCompatEditText appCompatEditText, ImageView imageView3, TextView textView, TextView textView2, ImageView imageView4, BirdActionView birdActionView, Drawable drawable) {
        return new C48042rQ3(baseActivity, zXingScannerView, imageView, imageView2, appCompatEditText, imageView3, textView, textView2, imageView4, birdActionView, drawable);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48042rQ3 get() {
        return m14219c(this.f108753a.get(), this.f108754b.get(), this.f108755c.get(), this.f108756d.get(), this.f108757e.get(), this.f108758f.get(), this.f108759g.get(), this.f108760h.get(), this.f108761i.get(), this.f108762j.get(), this.f108763k.get());
    }
}
