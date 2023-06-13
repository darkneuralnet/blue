package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p000.C42732iT3;
/* renamed from: wY1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51075wY1 extends AbstractC30874z2<ImageView> {

    /* renamed from: m */
    public I80 f116144m;

    public C51075wY1(C42732iT3 c42732iT3, ImageView imageView, C47378qI4 c47378qI4, int i, int i2, int i3, Drawable drawable, String str, Object obj, I80 i80, boolean z) {
        super(c42732iT3, imageView, c47378qI4, i, i2, i3, drawable, str, obj, z);
        this.f116144m = i80;
    }

    @Override // p000.AbstractC30874z2
    /* renamed from: a */
    public void mo1990a() {
        super.mo1990a();
        if (this.f116144m != null) {
            this.f116144m = null;
        }
    }

    @Override // p000.AbstractC30874z2
    /* renamed from: b */
    public void mo1989b(Bitmap bitmap, C42732iT3.EnumC23266e enumC23266e) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f120630c.get();
            if (imageView == null) {
                return;
            }
            C42732iT3 c42732iT3 = this.f120628a;
            C43325jT3.m30581c(imageView, c42732iT3.f87361d, bitmap, enumC23266e, this.f120631d, c42732iT3.f87369l);
            I80 i80 = this.f116144m;
            if (i80 != null) {
                i80.onSuccess();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // p000.AbstractC30874z2
    /* renamed from: c */
    public void mo1988c(Exception exc) {
        ImageView imageView = (ImageView) this.f120630c.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i = this.f120634g;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable2 = this.f120635h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        I80 i80 = this.f116144m;
        if (i80 != null) {
            i80.onError(exc);
        }
    }
}
