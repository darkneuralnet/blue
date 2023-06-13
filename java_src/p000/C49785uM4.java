package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p000.C32514Dw1;
import p000.C49785uM4;
/* renamed from: uM4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49785uM4 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f112252a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<C29182d, SparseArray<C29181c>> f112253b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f112254c = new Object();

    /* renamed from: uM4$a */
    /* loaded from: classes.dex */
    public static class C29179a {
        private C29179a() {
        }

        /* renamed from: a */
        public static Drawable m10387a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        public static Drawable m10386b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: uM4$b */
    /* loaded from: classes.dex */
    public static class C29180b {
        private C29180b() {
        }

        /* renamed from: a */
        public static int m10385a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        public static ColorStateList m10384b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: uM4$c */
    /* loaded from: classes.dex */
    public static class C29181c {

        /* renamed from: a */
        public final ColorStateList f112255a;

        /* renamed from: b */
        public final Configuration f112256b;

        /* renamed from: c */
        public final int f112257c;

        public C29181c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.f112255a = colorStateList;
            this.f112256b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.f112257c = hashCode;
        }
    }

    /* renamed from: uM4$d */
    /* loaded from: classes.dex */
    public static final class C29182d {

        /* renamed from: a */
        public final Resources f112258a;

        /* renamed from: b */
        public final Resources.Theme f112259b;

        public C29182d(Resources resources, Resources.Theme theme) {
            this.f112258a = resources;
            this.f112259b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C29182d.class != obj.getClass()) {
                return false;
            }
            C29182d c29182d = (C29182d) obj;
            if (this.f112258a.equals(c29182d.f112258a) && C37259Yd3.m74780a(this.f112259b, c29182d.f112259b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C37259Yd3.m74779b(this.f112258a, this.f112259b);
        }
    }

    /* renamed from: uM4$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC29183e {
        /* renamed from: e */
        public static Handler m10379e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m10381c(final int i, Handler handler) {
            m10379e(handler).post(new Runnable() { // from class: wM4
                @Override // java.lang.Runnable
                public final void run() {
                    C49785uM4.AbstractC29183e.this.m10378f(i);
                }
            });
        }

        /* renamed from: d */
        public final void m10380d(final Typeface typeface, Handler handler) {
            m10379e(handler).post(new Runnable() { // from class: vM4
                @Override // java.lang.Runnable
                public final void run() {
                    C49785uM4.AbstractC29183e.this.m10377g(typeface);
                }
            });
        }

        /* renamed from: h */
        public abstract void m10378f(int i);

        /* renamed from: i */
        public abstract void m10377g(Typeface typeface);
    }

    /* renamed from: uM4$f */
    /* loaded from: classes.dex */
    public static final class C29184f {

        /* renamed from: uM4$f$a */
        /* loaded from: classes.dex */
        public static class C29185a {

            /* renamed from: a */
            public static final Object f112260a = new Object();

            /* renamed from: b */
            public static Method f112261b;

            /* renamed from: c */
            public static boolean f112262c;

            private C29185a() {
            }

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            public static void m10373a(Resources.Theme theme) {
                synchronized (f112260a) {
                    if (!f112262c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f112261b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f112262c = true;
                    }
                    Method method = f112261b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f112261b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: uM4$f$b */
        /* loaded from: classes.dex */
        public static class C29186b {
            private C29186b() {
            }

            /* renamed from: a */
            public static void m10372a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        private C29184f() {
        }

        /* renamed from: a */
        public static void m10374a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C29186b.m10372a(theme);
            } else {
                C29185a.m10373a(theme);
            }
        }
    }

    private C49785uM4() {
    }

    /* renamed from: a */
    public static void m10402a(C29182d c29182d, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f112254c) {
            WeakHashMap<C29182d, SparseArray<C29181c>> weakHashMap = f112253b;
            SparseArray<C29181c> sparseArray = weakHashMap.get(c29182d);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(c29182d, sparseArray);
            }
            sparseArray.append(i, new C29181c(colorStateList, c29182d.f112258a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    public static ColorStateList m10401b(C29182d c29182d, int i) {
        C29181c c29181c;
        Resources.Theme theme;
        synchronized (f112254c) {
            SparseArray<C29181c> sparseArray = f112253b.get(c29182d);
            if (sparseArray != null && sparseArray.size() > 0 && (c29181c = sparseArray.get(i)) != null) {
                if (c29181c.f112256b.equals(c29182d.f112258a.getConfiguration()) && (((theme = c29182d.f112259b) == null && c29181c.f112257c == 0) || (theme != null && c29181c.f112257c == theme.hashCode()))) {
                    return c29181c.f112255a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static Typeface m10400c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m10389n(context, i, new TypedValue(), 0, null, null, false, true);
    }

    /* renamed from: d */
    public static int m10399d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return C29180b.m10385a(resources, i, theme);
    }

    /* renamed from: e */
    public static ColorStateList m10398e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        C29182d c29182d = new C29182d(resources, theme);
        ColorStateList m10401b = m10401b(c29182d, i);
        if (m10401b != null) {
            return m10401b;
        }
        ColorStateList m10391l = m10391l(resources, i, theme);
        if (m10391l != null) {
            m10402a(c29182d, i, m10391l, theme);
            return m10391l;
        }
        return C29180b.m10384b(resources, i, theme);
    }

    /* renamed from: f */
    public static Drawable m10397f(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return C29179a.m10387a(resources, i, theme);
    }

    /* renamed from: g */
    public static Drawable m10396g(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return C29179a.m10386b(resources, i, i2, theme);
    }

    /* renamed from: h */
    public static Typeface m10395h(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m10389n(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: i */
    public static Typeface m10394i(Context context, int i, TypedValue typedValue, int i2, AbstractC29183e abstractC29183e) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m10389n(context, i, typedValue, i2, abstractC29183e, null, true, false);
    }

    /* renamed from: j */
    public static void m10393j(Context context, int i, AbstractC29183e abstractC29183e, Handler handler) throws Resources.NotFoundException {
        HZ3.m103731g(abstractC29183e);
        if (context.isRestricted()) {
            abstractC29183e.m10381c(-4, handler);
        } else {
            m10389n(context, i, new TypedValue(), 0, abstractC29183e, handler, false, false);
        }
    }

    /* renamed from: k */
    public static TypedValue m10392k() {
        ThreadLocal<TypedValue> threadLocal = f112252a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: l */
    public static ColorStateList m10391l(Resources resources, int i, Resources.Theme theme) {
        if (m10390m(resources, i)) {
            return null;
        }
        try {
            return C33125Gm0.m104774a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m10390m(Resources resources, int i) {
        TypedValue m10392k = m10392k();
        resources.getValue(i, m10392k, true);
        int i2 = m10392k.type;
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static Typeface m10389n(Context context, int i, TypedValue typedValue, int i2, AbstractC29183e abstractC29183e, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m10388o = m10388o(context, resources, typedValue, i, i2, abstractC29183e, handler, z, z2);
        if (m10388o == null && abstractC29183e == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m10388o;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m10388o(Context context, Resources resources, TypedValue typedValue, int i, int i2, AbstractC29183e abstractC29183e, Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                if (abstractC29183e != null) {
                    abstractC29183e.m10381c(-3, handler);
                }
                return null;
            }
            Typeface m100124f = C33734Jb6.m100124f(resources, i, charSequence2, typedValue.assetCookie, i2);
            if (m100124f != null) {
                if (abstractC29183e != null) {
                    abstractC29183e.m10380d(m100124f, handler);
                }
                return m100124f;
            } else if (z2) {
                return null;
            } else {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        C32514Dw1.InterfaceC1670b m109618b = C32514Dw1.m109618b(resources.getXml(i), resources);
                        if (m109618b == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC29183e != null) {
                                abstractC29183e.m10381c(-3, handler);
                            }
                            return null;
                        }
                        return C33734Jb6.m100127c(context, m109618b, resources, i, charSequence2, typedValue.assetCookie, i2, abstractC29183e, handler, z);
                    }
                    Typeface m100126d = C33734Jb6.m100126d(context, resources, i, charSequence2, typedValue.assetCookie, i2);
                    if (abstractC29183e != null) {
                        if (m100126d != null) {
                            abstractC29183e.m10380d(m100126d, handler);
                        } else {
                            abstractC29183e.m10381c(-3, handler);
                        }
                    }
                    return m100126d;
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource " + charSequence2, e);
                    if (abstractC29183e != null) {
                        abstractC29183e.m10381c(-3, handler);
                    }
                    return null;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource " + charSequence2, e2);
                    if (abstractC29183e != null) {
                    }
                    return null;
                }
            }
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
    }
}
