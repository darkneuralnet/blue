package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p000.C42732iT3;
/* renamed from: OY5 */
/* loaded from: classes6.dex */
public final class OY5 extends AbstractC30874z2<MY5> {
    public OY5(C42732iT3 c42732iT3, MY5 my5, C47378qI4 c47378qI4, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(c42732iT3, my5, c47378qI4, i, i2, i3, drawable, str, obj, false);
    }

    @Override // p000.AbstractC30874z2
    /* renamed from: b */
    public void mo1989b(Bitmap bitmap, C42732iT3.EnumC23266e enumC23266e) {
        if (bitmap != null) {
            MY5 m1980k = m1980k();
            if (m1980k != null) {
                m1980k.onBitmapLoaded(bitmap, enumC23266e);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // p000.AbstractC30874z2
    /* renamed from: c */
    public void mo1988c(Exception exc) {
        MY5 m1980k = m1980k();
        if (m1980k != null) {
            if (this.f120634g != 0) {
                m1980k.onBitmapFailed(exc, this.f120628a.f87361d.getResources().getDrawable(this.f120634g));
            } else {
                m1980k.onBitmapFailed(exc, this.f120635h);
            }
        }
    }
}
