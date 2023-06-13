package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: ku6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44184ku6 {

    /* renamed from: b */
    public static Method f95185b;

    /* renamed from: c */
    public static boolean f95186c;

    /* renamed from: d */
    public static Field f95187d;

    /* renamed from: e */
    public static boolean f95188e;

    /* renamed from: a */
    public float[] f95189a;

    /* renamed from: a */
    public void mo28187a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C36351Ug4.save_non_transition_alpha, null);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    public final void m28186b() {
        if (!f95186c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f95185b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f95186c = true;
        }
    }

    /* renamed from: c */
    public float mo28185c(View view) {
        Float f = (Float) view.getTag(C36351Ug4.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo28184d(View view) {
        int i = C36351Ug4.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo28183e(View view, Matrix matrix) {
        int i;
        if (matrix != null && !matrix.isIdentity()) {
            float[] fArr = this.f95189a;
            if (fArr == null) {
                fArr = new float[9];
                this.f95189a = fArr;
            }
            matrix.getValues(fArr);
            float f = fArr[3];
            float sqrt = (float) Math.sqrt(1.0f - (f * f));
            if (fArr[0] < 0.0f) {
                i = -1;
            } else {
                i = 1;
            }
            float f2 = sqrt * i;
            float degrees = (float) Math.toDegrees(Math.atan2(f, f2));
            float f3 = fArr[0] / f2;
            float f4 = fArr[4] / f2;
            float f5 = fArr[2];
            float f6 = fArr[5];
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setTranslationX(f5);
            view.setTranslationY(f6);
            view.setRotation(degrees);
            view.setScaleX(f3);
            view.setScaleY(f4);
            return;
        }
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
    }

    /* renamed from: f */
    public void mo28182f(View view, int i, int i2, int i3, int i4) {
        m28186b();
        Method method = f95185b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: g */
    public void mo28181g(View view, float f) {
        Float f2 = (Float) view.getTag(C36351Ug4.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: h */
    public void mo28180h(View view, int i) {
        if (!f95188e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f95187d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f95188e = true;
        }
        Field field = f95187d;
        if (field != null) {
            try {
                f95187d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: i */
    public void mo28179i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo28179i(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: j */
    public void mo28178j(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo28178j(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
