package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: oM4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46228oM4 {

    /* renamed from: i */
    public static C46228oM4 f101837i;

    /* renamed from: a */
    public WeakHashMap<Context, LN5<ColorStateList>> f101839a;

    /* renamed from: b */
    public NA5<String, InterfaceC26926b> f101840b;

    /* renamed from: c */
    public LN5<String> f101841c;

    /* renamed from: d */
    public final WeakHashMap<Context, C46602oz2<WeakReference<Drawable.ConstantState>>> f101842d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f101843e;

    /* renamed from: f */
    public boolean f101844f;

    /* renamed from: g */
    public InterfaceC26927c f101845g;

    /* renamed from: h */
    public static final PorterDuff.Mode f101836h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final C26925a f101838j = new C26925a(6);

    /* renamed from: oM4$a */
    /* loaded from: classes.dex */
    public static class C26925a extends C50303vE2<Integer, PorterDuffColorFilter> {
        public C26925a(int i) {
            super(i);
        }

        /* renamed from: k */
        public static int m21263k(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: l */
        public PorterDuffColorFilter m21262l(int i, PorterDuff.Mode mode) {
            return m8993d(Integer.valueOf(m21263k(i, mode)));
        }

        /* renamed from: m */
        public PorterDuffColorFilter m21261m(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m8992e(Integer.valueOf(m21263k(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: oM4$b */
    /* loaded from: classes.dex */
    public interface InterfaceC26926b {
        /* renamed from: a */
        Drawable m21260a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: oM4$c */
    /* loaded from: classes.dex */
    public interface InterfaceC26927c {
        /* renamed from: a */
        Drawable mo20603a(C46228oM4 c46228oM4, Context context, int i);

        /* renamed from: b */
        ColorStateList mo20602b(Context context, int i);

        /* renamed from: c */
        PorterDuff.Mode mo20601c(int i);

        /* renamed from: d */
        boolean mo20600d(Context context, int i, Drawable drawable);

        /* renamed from: e */
        boolean mo20599e(Context context, int i, Drawable drawable);
    }

    /* renamed from: d */
    public static long m21283d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    public static PorterDuffColorFilter m21281f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return m21276k(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    /* renamed from: g */
    public static synchronized C46228oM4 m21280g() {
        C46228oM4 c46228oM4;
        synchronized (C46228oM4.class) {
            if (f101837i == null) {
                C46228oM4 c46228oM42 = new C46228oM4();
                f101837i = c46228oM42;
                m21272o(c46228oM42);
            }
            c46228oM4 = f101837i;
        }
        return c46228oM4;
    }

    /* renamed from: k */
    public static synchronized PorterDuffColorFilter m21276k(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m21262l;
        synchronized (C46228oM4.class) {
            C26925a c26925a = f101838j;
            m21262l = c26925a.m21262l(i, mode);
            if (m21262l == null) {
                m21262l = new PorterDuffColorFilter(i, mode);
                c26925a.m21261m(i, mode, m21262l);
            }
        }
        return m21262l;
    }

    /* renamed from: o */
    public static void m21272o(C46228oM4 c46228oM4) {
    }

    /* renamed from: p */
    public static boolean m21271p(Drawable drawable) {
        if (!(drawable instanceof C37550Zj6) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static void m21265v(Drawable drawable, X46 x46, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        boolean z;
        int[] state = drawable.getState();
        if (C39565d71.m44602a(drawable)) {
            if (drawable.mutate() == drawable) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = x46.f42623d;
        if (!z2 && !x46.f42622c) {
            drawable.clearColorFilter();
            return;
        }
        if (z2) {
            colorStateList = x46.f42620a;
        } else {
            colorStateList = null;
        }
        if (x46.f42622c) {
            mode = x46.f42621b;
        } else {
            mode = f101836h;
        }
        drawable.setColorFilter(m21281f(colorStateList, mode, iArr));
    }

    /* renamed from: a */
    public final synchronized boolean m21286a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C46602oz2<WeakReference<Drawable.ConstantState>> c46602oz2 = this.f101842d.get(context);
            if (c46602oz2 == null) {
                c46602oz2 = new C46602oz2<>();
                this.f101842d.put(context, c46602oz2);
            }
            c46602oz2.m20191n(j, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m21285b(Context context, int i, ColorStateList colorStateList) {
        if (this.f101839a == null) {
            this.f101839a = new WeakHashMap<>();
        }
        LN5<ColorStateList> ln5 = this.f101839a.get(context);
        if (ln5 == null) {
            ln5 = new LN5<>();
            this.f101839a.put(context, ln5);
        }
        ln5.m96989d(i, colorStateList);
    }

    /* renamed from: c */
    public final void m21284c(Context context) {
        if (this.f101844f) {
            return;
        }
        this.f101844f = true;
        Drawable m21278i = m21278i(context, C45821ng4.abc_vector_test);
        if (m21278i != null && m21271p(m21278i)) {
            return;
        }
        this.f101844f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    /* renamed from: e */
    public final Drawable m21282e(Context context, int i) {
        Drawable mo20603a;
        if (this.f101843e == null) {
            this.f101843e = new TypedValue();
        }
        TypedValue typedValue = this.f101843e;
        context.getResources().getValue(i, typedValue, true);
        long m21283d = m21283d(typedValue);
        Drawable m21279h = m21279h(context, m21283d);
        if (m21279h != null) {
            return m21279h;
        }
        InterfaceC26927c interfaceC26927c = this.f101845g;
        if (interfaceC26927c == null) {
            mo20603a = null;
        } else {
            mo20603a = interfaceC26927c.mo20603a(this, context, i);
        }
        if (mo20603a != null) {
            mo20603a.setChangingConfigurations(typedValue.changingConfigurations);
            m21286a(context, m21283d, mo20603a);
        }
        return mo20603a;
    }

    /* renamed from: h */
    public final synchronized Drawable m21279h(Context context, long j) {
        C46602oz2<WeakReference<Drawable.ConstantState>> c46602oz2 = this.f101842d.get(context);
        if (c46602oz2 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m20196h = c46602oz2.m20196h(j);
        if (m20196h != null) {
            Drawable.ConstantState constantState = m20196h.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c46602oz2.m20190o(j);
        }
        return null;
    }

    /* renamed from: i */
    public synchronized Drawable m21278i(Context context, int i) {
        return m21277j(context, i, false);
    }

    /* renamed from: j */
    public synchronized Drawable m21277j(Context context, int i, boolean z) {
        Drawable m21270q;
        m21284c(context);
        m21270q = m21270q(context, i);
        if (m21270q == null) {
            m21270q = m21282e(context, i);
        }
        if (m21270q == null) {
            m21270q = NA0.m94299e(context, i);
        }
        if (m21270q != null) {
            m21270q = m21266u(context, i, z, m21270q);
        }
        if (m21270q != null) {
            C39565d71.m44601b(m21270q);
        }
        return m21270q;
    }

    /* renamed from: l */
    public synchronized ColorStateList m21275l(Context context, int i) {
        ColorStateList m21274m;
        m21274m = m21274m(context, i);
        if (m21274m == null) {
            InterfaceC26927c interfaceC26927c = this.f101845g;
            if (interfaceC26927c == null) {
                m21274m = null;
            } else {
                m21274m = interfaceC26927c.mo20602b(context, i);
            }
            if (m21274m != null) {
                m21285b(context, i, m21274m);
            }
        }
        return m21274m;
    }

    /* renamed from: m */
    public final ColorStateList m21274m(Context context, int i) {
        LN5<ColorStateList> ln5;
        WeakHashMap<Context, LN5<ColorStateList>> weakHashMap = this.f101839a;
        if (weakHashMap == null || (ln5 = weakHashMap.get(context)) == null) {
            return null;
        }
        return ln5.m96983k(i);
    }

    /* renamed from: n */
    public PorterDuff.Mode m21273n(int i) {
        InterfaceC26927c interfaceC26927c = this.f101845g;
        if (interfaceC26927c == null) {
            return null;
        }
        return interfaceC26927c.mo20601c(i);
    }

    /* renamed from: q */
    public final Drawable m21270q(Context context, int i) {
        int next;
        NA5<String, InterfaceC26926b> na5 = this.f101840b;
        if (na5 == null || na5.isEmpty()) {
            return null;
        }
        LN5<String> ln5 = this.f101841c;
        if (ln5 != null) {
            String m96983k = ln5.m96983k(i);
            if ("appcompat_skip_skip".equals(m96983k) || (m96983k != null && this.f101840b.get(m96983k) == null)) {
                return null;
            }
        } else {
            this.f101841c = new LN5<>();
        }
        if (this.f101843e == null) {
            this.f101843e = new TypedValue();
        }
        TypedValue typedValue = this.f101843e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m21283d = m21283d(typedValue);
        Drawable m21279h = m21279h(context, m21283d);
        if (m21279h != null) {
            return m21279h;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f101841c.m96989d(i, name);
                    InterfaceC26926b interfaceC26926b = this.f101840b.get(name);
                    if (interfaceC26926b != null) {
                        m21279h = interfaceC26926b.m21260a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (m21279h != null) {
                        m21279h.setChangingConfigurations(typedValue.changingConfigurations);
                        m21286a(context, m21283d, m21279h);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (m21279h == null) {
            this.f101841c.m96989d(i, "appcompat_skip_skip");
        }
        return m21279h;
    }

    /* renamed from: r */
    public synchronized void m21269r(Context context) {
        C46602oz2<WeakReference<Drawable.ConstantState>> c46602oz2 = this.f101842d.get(context);
        if (c46602oz2 != null) {
            c46602oz2.m20200d();
        }
    }

    /* renamed from: s */
    public synchronized Drawable m21268s(Context context, C38137ak6 c38137ak6, int i) {
        Drawable m21270q = m21270q(context, i);
        if (m21270q == null) {
            m21270q = c38137ak6.m112292a(i);
        }
        if (m21270q != null) {
            return m21266u(context, i, false, m21270q);
        }
        return null;
    }

    /* renamed from: t */
    public synchronized void m21267t(InterfaceC26927c interfaceC26927c) {
        this.f101845g = interfaceC26927c;
    }

    /* renamed from: u */
    public final Drawable m21266u(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m21275l = m21275l(context, i);
        if (m21275l != null) {
            if (C39565d71.m44602a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m90834r = P61.m90834r(drawable);
            P61.m90837o(m90834r, m21275l);
            PorterDuff.Mode m21273n = m21273n(i);
            if (m21273n != null) {
                P61.m90836p(m90834r, m21273n);
                return m90834r;
            }
            return m90834r;
        }
        InterfaceC26927c interfaceC26927c = this.f101845g;
        if ((interfaceC26927c == null || !interfaceC26927c.mo20600d(context, i, drawable)) && !m21264w(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    public boolean m21264w(Context context, int i, Drawable drawable) {
        InterfaceC26927c interfaceC26927c = this.f101845g;
        return interfaceC26927c != null && interfaceC26927c.mo20599e(context, i, drawable);
    }
}
