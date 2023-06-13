package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/* renamed from: androidx.transition.d */
/* loaded from: classes.dex */
public class C12058d {

    /* renamed from: a */
    public static final boolean f55994a;

    /* renamed from: b */
    public static final boolean f55995b;

    /* renamed from: c */
    public static final boolean f55996c;

    /* renamed from: androidx.transition.d$a */
    /* loaded from: classes.dex */
    public static class C12059a implements TypeEvaluator<Matrix> {

        /* renamed from: a */
        public final float[] f55997a = new float[9];

        /* renamed from: b */
        public final float[] f55998b = new float[9];

        /* renamed from: c */
        public final Matrix f55999c = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f55997a);
            matrix2.getValues(this.f55998b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f55998b;
                float f2 = fArr[i];
                float f3 = this.f55997a[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.f55999c.setValues(this.f55998b);
            return this.f55999c;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f55994a = true;
        f55995b = true;
        if (i < 28) {
            z = false;
        }
        f55996c = z;
    }

    private C12058d() {
    }

    /* renamed from: a */
    public static View m65796a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        C37172Xt6.m76162j(view, matrix);
        C37172Xt6.m76161k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap m65795b = m65795b(view, matrix, rectF, viewGroup);
        if (m65795b != null) {
            imageView.setImageBitmap(m65795b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* renamed from: b */
    public static Bitmap m65795b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup2;
        if (f55994a) {
            z = !view.isAttachedToWindow();
            if (viewGroup == null) {
                z2 = false;
            } else {
                z2 = viewGroup.isAttachedToWindow();
            }
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = f55995b;
        Bitmap bitmap = null;
        if (z3 && z) {
            if (!z2) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        } else {
            i = 0;
            viewGroup2 = null;
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f55996c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z3 && z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmap;
    }

    /* renamed from: c */
    public static Animator m65794c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
