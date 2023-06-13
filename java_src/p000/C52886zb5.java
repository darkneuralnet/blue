package p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import kotlin.KotlinVersion;
/* renamed from: zb5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52886zb5 {

    /* renamed from: a */
    public static final boolean f121583a = true;

    /* renamed from: b */
    public static final int[] f121584b = {16842919};

    /* renamed from: c */
    public static final int[] f121585c = {16843623, 16842908};

    /* renamed from: d */
    public static final int[] f121586d = {16842908};

    /* renamed from: e */
    public static final int[] f121587e = {16843623};

    /* renamed from: f */
    public static final int[] f121588f = {16842913, 16842919};

    /* renamed from: g */
    public static final int[] f121589g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    public static final int[] f121590h = {16842913, 16842908};

    /* renamed from: i */
    public static final int[] f121591i = {16842913, 16843623};

    /* renamed from: j */
    public static final int[] f121592j = {16842913};

    /* renamed from: k */
    public static final int[] f121593k = {16842910, 16842919};

    /* renamed from: l */
    public static final String f121594l = C52886zb5.class.getSimpleName();

    private C52886zb5() {
    }

    /* renamed from: a */
    public static ColorStateList m1054a(ColorStateList colorStateList) {
        if (f121583a) {
            int[] iArr = f121586d;
            return new ColorStateList(new int[][]{f121592j, iArr, StateSet.NOTHING}, new int[]{m1052c(colorStateList, f121588f), m1052c(colorStateList, iArr), m1052c(colorStateList, f121584b)});
        }
        int[] iArr2 = f121588f;
        int[] iArr3 = f121589g;
        int[] iArr4 = f121590h;
        int[] iArr5 = f121591i;
        int[] iArr6 = f121584b;
        int[] iArr7 = f121585c;
        int[] iArr8 = f121586d;
        int[] iArr9 = f121587e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f121592j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{m1052c(colorStateList, iArr2), m1052c(colorStateList, iArr3), m1052c(colorStateList, iArr4), m1052c(colorStateList, iArr5), 0, m1052c(colorStateList, iArr6), m1052c(colorStateList, iArr7), m1052c(colorStateList, iArr8), m1052c(colorStateList, iArr9), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    public static int m1053b(int i) {
        return C33827Jm0.m99845p(i, Math.min(Color.alpha(i) * 2, (int) KotlinVersion.MAX_COMPONENT_VALUE));
    }

    /* renamed from: c */
    public static int m1052c(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (f121583a) {
            return m1053b(i);
        }
        return i;
    }

    /* renamed from: d */
    public static ColorStateList m1051d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f121593k, 0)) != 0) {
                Log.w(f121594l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: e */
    public static boolean m1050e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
