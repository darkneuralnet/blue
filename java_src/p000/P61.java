package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: P61 */
/* loaded from: classes.dex */
public final class P61 {

    /* renamed from: P61$a */
    /* loaded from: classes.dex */
    public static class C6242a {
        private C6242a() {
        }

        /* renamed from: a */
        public static int m90833a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        public static Drawable m90832b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        public static Drawable m90831c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        public static boolean m90830d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        public static void m90829e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: P61$b */
    /* loaded from: classes.dex */
    public static class C6243b {
        private C6243b() {
        }

        /* renamed from: a */
        public static void m90828a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        public static boolean m90827b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        public static ColorFilter m90826c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        public static void m90825d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        public static void m90824e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        public static void m90823f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m90822g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        public static void m90821h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        public static void m90820i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: P61$c */
    /* loaded from: classes.dex */
    public static class C6244c {
        private C6244c() {
        }

        /* renamed from: a */
        public static int m90819a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        public static boolean m90818b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    private P61() {
    }

    /* renamed from: a */
    public static void m90851a(Drawable drawable, Resources.Theme theme) {
        C6243b.m90828a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m90850b(Drawable drawable) {
        return C6243b.m90827b(drawable);
    }

    /* renamed from: c */
    public static void m90849c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m90848d(Drawable drawable) {
        return C6242a.m90833a(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m90847e(Drawable drawable) {
        return C6243b.m90826c(drawable);
    }

    /* renamed from: f */
    public static int m90846f(Drawable drawable) {
        return C6244c.m90819a(drawable);
    }

    /* renamed from: g */
    public static void m90845g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C6243b.m90825d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m90844h(Drawable drawable) {
        return C6242a.m90830d(drawable);
    }

    @Deprecated
    /* renamed from: i */
    public static void m90843i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m90842j(Drawable drawable, boolean z) {
        C6242a.m90829e(drawable, z);
    }

    /* renamed from: k */
    public static void m90841k(Drawable drawable, float f, float f2) {
        C6243b.m90824e(drawable, f, f2);
    }

    /* renamed from: l */
    public static void m90840l(Drawable drawable, int i, int i2, int i3, int i4) {
        C6243b.m90823f(drawable, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static boolean m90839m(Drawable drawable, int i) {
        return C6244c.m90818b(drawable, i);
    }

    /* renamed from: n */
    public static void m90838n(Drawable drawable, int i) {
        C6243b.m90822g(drawable, i);
    }

    /* renamed from: o */
    public static void m90837o(Drawable drawable, ColorStateList colorStateList) {
        C6243b.m90821h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m90836p(Drawable drawable, PorterDuff.Mode mode) {
        C6243b.m90820i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static <T extends Drawable> T m90835q(Drawable drawable) {
        if (drawable instanceof ZG6) {
            return (T) ((ZG6) drawable).m73376b();
        }
        return drawable;
    }

    /* renamed from: r */
    public static Drawable m90834r(Drawable drawable) {
        return drawable;
    }
}
