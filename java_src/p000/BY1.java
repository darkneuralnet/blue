package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
/* renamed from: BY1 */
/* loaded from: classes.dex */
public class BY1 {

    /* renamed from: a */
    public static boolean f2503a = true;

    private BY1() {
    }

    /* renamed from: a */
    public static void m113880a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            m113879b(imageView, matrix);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m113879b(ImageView imageView, Matrix matrix) {
        if (f2503a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f2503a = false;
            }
        }
    }
}
