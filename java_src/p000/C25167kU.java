package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* renamed from: kU */
/* loaded from: classes4.dex */
public class C25167kU {
    /* renamed from: a */
    public static Bitmap m28923a(Drawable drawable) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (!drawable.getBounds().isEmpty()) {
            intrinsicWidth = drawable.getBounds().width();
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (!drawable.getBounds().isEmpty()) {
            intrinsicHeight = drawable.getBounds().height();
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }
}
