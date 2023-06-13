package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: f71  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40750f71 {
    private C40750f71() {
    }

    /* renamed from: a */
    public static Drawable m42018a(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight;
        int i;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() != -1 && drawable2.getIntrinsicHeight() != -1) {
            if (drawable2.getIntrinsicWidth() <= drawable.getIntrinsicWidth() && drawable2.getIntrinsicHeight() <= drawable.getIntrinsicHeight()) {
                i = drawable2.getIntrinsicWidth();
                intrinsicHeight = drawable2.getIntrinsicHeight();
            } else {
                float intrinsicWidth = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
                if (intrinsicWidth >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                    i = drawable.getIntrinsicWidth();
                    intrinsicHeight = (int) (i / intrinsicWidth);
                } else {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                    i = (int) (intrinsicWidth * intrinsicHeight);
                }
            }
        } else {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
            i = intrinsicWidth2;
        }
        layerDrawable.setLayerSize(1, i, intrinsicHeight);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    /* renamed from: b */
    public static Drawable m42017b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m42015d(drawable, colorStateList, mode, false);
    }

    /* renamed from: c */
    public static Drawable m42016c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m42015d(drawable, colorStateList, mode, false);
    }

    /* renamed from: d */
    public static Drawable m42015d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = P61.m90834r(drawable).mutate();
            if (mode != null) {
                P61.m90836p(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    /* renamed from: e */
    public static int[] m42014e(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    /* renamed from: f */
    public static int[] m42013f(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    /* renamed from: g */
    public static AttributeSet m42012g(Context context, int i, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    /* renamed from: h */
    public static void m42011h(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
        } else if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @TargetApi(21)
    /* renamed from: i */
    public static void m42010i(RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    /* renamed from: j */
    public static void m42009j(Drawable drawable, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            P61.m90838n(drawable, i);
        } else {
            P61.m90837o(drawable, null);
        }
    }

    /* renamed from: k */
    public static PorterDuffColorFilter m42008k(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }
}
