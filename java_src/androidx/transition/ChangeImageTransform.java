package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C12058d;
import java.util.Map;
/* loaded from: classes.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: P */
    public static final String[] f55846P = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: Q */
    public static final TypeEvaluator<Matrix> f55847Q = new C12018a();

    /* renamed from: R */
    public static final Property<ImageView, Matrix> f55848R = new C12019b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    /* loaded from: classes.dex */
    public static class C12018a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    /* loaded from: classes.dex */
    public static class C12019b extends Property<ImageView, Matrix> {
        public C12019b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            BY1.m113880a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C12020c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55849a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f55849a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55849a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    /* renamed from: B0 */
    public static Matrix m65946B0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    /* renamed from: C0 */
    public static Matrix m65945C0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = C12020c.f55849a[imageView.getScaleType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return m65946B0(imageView);
                }
            } else {
                return m65942H0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: H0 */
    public static Matrix m65942H0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    /* renamed from: A0 */
    public final void m65947A0(N96 n96) {
        View view = n96.f24200b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = n96.f24199a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeImageTransform:matrix", m65945C0(imageView));
        }
    }

    /* renamed from: F0 */
    public final ObjectAnimator m65944F0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f55848R, (TypeEvaluator) new C12058d.C12059a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    /* renamed from: G0 */
    public final ObjectAnimator m65943G0(ImageView imageView) {
        Property<ImageView, Matrix> property = f55848R;
        TypeEvaluator<Matrix> typeEvaluator = f55847Q;
        Matrix matrix = C47421qN2.f105198a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    @Override // androidx.transition.Transition
    /* renamed from: S */
    public String[] mo65829S() {
        return f55846P;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        m65947A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        m65947A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: r */
    public Animator mo65825r(ViewGroup viewGroup, N96 n96, N96 n962) {
        boolean z;
        if (n96 == null || n962 == null) {
            return null;
        }
        Rect rect = (Rect) n96.f24199a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) n962.f24199a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) n96.f24199a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) n962.f24199a.get("android:changeImageTransform:matrix");
        if ((matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2))) {
            z = true;
        } else {
            z = false;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) n962.f24200b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (matrix == null) {
                matrix = C47421qN2.f105198a;
            }
            if (matrix2 == null) {
                matrix2 = C47421qN2.f105198a;
            }
            f55848R.set(imageView, matrix);
            return m65944F0(imageView, matrix, matrix2);
        }
        return m65943G0(imageView);
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
