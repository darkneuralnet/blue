package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C11032g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: cV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39177cV5 extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f60727e;

    /* renamed from: f */
    public static final Class<?>[] f60728f;

    /* renamed from: a */
    public final Object[] f60729a;

    /* renamed from: b */
    public final Object[] f60730b;

    /* renamed from: c */
    public Context f60731c;

    /* renamed from: d */
    public Object f60732d;

    /* renamed from: cV5$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC13584a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public static final Class<?>[] f60733d = {MenuItem.class};

        /* renamed from: b */
        public Object f60734b;

        /* renamed from: c */
        public Method f60735c;

        public MenuItem$OnMenuItemClickListenerC13584a(Object obj, String str) {
            this.f60734b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f60735c = cls.getMethod(str, f60733d);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f60735c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f60735c.invoke(this.f60734b, menuItem)).booleanValue();
                }
                this.f60735c.invoke(this.f60734b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: cV5$b */
    /* loaded from: classes.dex */
    public class C13585b {

        /* renamed from: A */
        public AbstractC3314I2 f60736A;

        /* renamed from: B */
        public CharSequence f60737B;

        /* renamed from: C */
        public CharSequence f60738C;

        /* renamed from: D */
        public ColorStateList f60739D = null;

        /* renamed from: E */
        public PorterDuff.Mode f60740E = null;

        /* renamed from: a */
        public Menu f60742a;

        /* renamed from: b */
        public int f60743b;

        /* renamed from: c */
        public int f60744c;

        /* renamed from: d */
        public int f60745d;

        /* renamed from: e */
        public int f60746e;

        /* renamed from: f */
        public boolean f60747f;

        /* renamed from: g */
        public boolean f60748g;

        /* renamed from: h */
        public boolean f60749h;

        /* renamed from: i */
        public int f60750i;

        /* renamed from: j */
        public int f60751j;

        /* renamed from: k */
        public CharSequence f60752k;

        /* renamed from: l */
        public CharSequence f60753l;

        /* renamed from: m */
        public int f60754m;

        /* renamed from: n */
        public char f60755n;

        /* renamed from: o */
        public int f60756o;

        /* renamed from: p */
        public char f60757p;

        /* renamed from: q */
        public int f60758q;

        /* renamed from: r */
        public int f60759r;

        /* renamed from: s */
        public boolean f60760s;

        /* renamed from: t */
        public boolean f60761t;

        /* renamed from: u */
        public boolean f60762u;

        /* renamed from: v */
        public int f60763v;

        /* renamed from: w */
        public int f60764w;

        /* renamed from: x */
        public String f60765x;

        /* renamed from: y */
        public String f60766y;

        /* renamed from: z */
        public String f60767z;

        public C13585b(Menu menu) {
            this.f60742a = menu;
            m61262h();
        }

        /* renamed from: a */
        public void m61269a() {
            this.f60749h = true;
            m61261i(this.f60742a.add(this.f60743b, this.f60750i, this.f60751j, this.f60752k));
        }

        /* renamed from: b */
        public SubMenu m61268b() {
            this.f60749h = true;
            SubMenu addSubMenu = this.f60742a.addSubMenu(this.f60743b, this.f60750i, this.f60751j, this.f60752k);
            m61261i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char m61267c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean m61266d() {
            return this.f60749h;
        }

        /* renamed from: e */
        public final <T> T m61265e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C39177cV5.this.f60731c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: f */
        public void m61264f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C39177cV5.this.f60731c.obtainStyledAttributes(attributeSet, C43509jm4.MenuGroup);
            this.f60743b = obtainStyledAttributes.getResourceId(C43509jm4.MenuGroup_android_id, 0);
            this.f60744c = obtainStyledAttributes.getInt(C43509jm4.MenuGroup_android_menuCategory, 0);
            this.f60745d = obtainStyledAttributes.getInt(C43509jm4.MenuGroup_android_orderInCategory, 0);
            this.f60746e = obtainStyledAttributes.getInt(C43509jm4.MenuGroup_android_checkableBehavior, 0);
            this.f60747f = obtainStyledAttributes.getBoolean(C43509jm4.MenuGroup_android_visible, true);
            this.f60748g = obtainStyledAttributes.getBoolean(C43509jm4.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m61263g(AttributeSet attributeSet) {
            boolean z;
            Z46 m73748u = Z46.m73748u(C39177cV5.this.f60731c, attributeSet, C43509jm4.MenuItem);
            this.f60750i = m73748u.m73755n(C43509jm4.MenuItem_android_id, 0);
            this.f60751j = (m73748u.m73758k(C43509jm4.MenuItem_android_menuCategory, this.f60744c) & (-65536)) | (m73748u.m73758k(C43509jm4.MenuItem_android_orderInCategory, this.f60745d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f60752k = m73748u.m73753p(C43509jm4.MenuItem_android_title);
            this.f60753l = m73748u.m73753p(C43509jm4.MenuItem_android_titleCondensed);
            this.f60754m = m73748u.m73755n(C43509jm4.MenuItem_android_icon, 0);
            this.f60755n = m61267c(m73748u.m73754o(C43509jm4.MenuItem_android_alphabeticShortcut));
            this.f60756o = m73748u.m73758k(C43509jm4.MenuItem_alphabeticModifiers, 4096);
            this.f60757p = m61267c(m73748u.m73754o(C43509jm4.MenuItem_android_numericShortcut));
            this.f60758q = m73748u.m73758k(C43509jm4.MenuItem_numericModifiers, 4096);
            int i = C43509jm4.MenuItem_android_checkable;
            if (m73748u.m73750s(i)) {
                this.f60759r = m73748u.m73768a(i, false) ? 1 : 0;
            } else {
                this.f60759r = this.f60746e;
            }
            this.f60760s = m73748u.m73768a(C43509jm4.MenuItem_android_checked, false);
            this.f60761t = m73748u.m73768a(C43509jm4.MenuItem_android_visible, this.f60747f);
            this.f60762u = m73748u.m73768a(C43509jm4.MenuItem_android_enabled, this.f60748g);
            this.f60763v = m73748u.m73758k(C43509jm4.MenuItem_showAsAction, -1);
            this.f60767z = m73748u.m73754o(C43509jm4.MenuItem_android_onClick);
            this.f60764w = m73748u.m73755n(C43509jm4.MenuItem_actionLayout, 0);
            this.f60765x = m73748u.m73754o(C43509jm4.MenuItem_actionViewClass);
            String m73754o = m73748u.m73754o(C43509jm4.MenuItem_actionProviderClass);
            this.f60766y = m73754o;
            if (m73754o != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f60764w == 0 && this.f60765x == null) {
                this.f60736A = (AbstractC3314I2) m61265e(m73754o, C39177cV5.f60728f, C39177cV5.this.f60730b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f60736A = null;
            }
            this.f60737B = m73748u.m73753p(C43509jm4.MenuItem_contentDescription);
            this.f60738C = m73748u.m73753p(C43509jm4.MenuItem_tooltipText);
            int i2 = C43509jm4.MenuItem_iconTintMode;
            if (m73748u.m73750s(i2)) {
                this.f60740E = C39565d71.m44598e(m73748u.m73758k(i2, -1), this.f60740E);
            } else {
                this.f60740E = null;
            }
            int i3 = C43509jm4.MenuItem_iconTint;
            if (m73748u.m73750s(i3)) {
                this.f60739D = m73748u.m73766c(i3);
            } else {
                this.f60739D = null;
            }
            m73748u.m73746w();
            this.f60749h = false;
        }

        /* renamed from: h */
        public void m61262h() {
            this.f60743b = 0;
            this.f60744c = 0;
            this.f60745d = 0;
            this.f60746e = 0;
            this.f60747f = true;
            this.f60748g = true;
        }

        /* renamed from: i */
        public final void m61261i(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f60760s).setVisible(this.f60761t).setEnabled(this.f60762u);
            boolean z2 = false;
            if (this.f60759r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f60753l).setIcon(this.f60754m);
            int i = this.f60763v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f60767z != null) {
                if (!C39177cV5.this.f60731c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC13584a(C39177cV5.this.m61271b(), this.f60767z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f60759r >= 2) {
                if (menuItem instanceof C11032g) {
                    ((C11032g) menuItem).m70101t(true);
                } else if (menuItem instanceof MenuItemC47448qQ2) {
                    ((MenuItemC47448qQ2) menuItem).m17527h(true);
                }
            }
            String str = this.f60765x;
            if (str != null) {
                menuItem.setActionView((View) m61265e(str, C39177cV5.f60727e, C39177cV5.this.f60729a));
                z2 = true;
            }
            int i2 = this.f60764w;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC3314I2 abstractC3314I2 = this.f60736A;
            if (abstractC3314I2 != null) {
                C45669nQ2.m23827a(menuItem, abstractC3314I2);
            }
            C45669nQ2.m23825c(menuItem, this.f60737B);
            C45669nQ2.m23821g(menuItem, this.f60738C);
            C45669nQ2.m23826b(menuItem, this.f60755n, this.f60756o);
            C45669nQ2.m23822f(menuItem, this.f60757p, this.f60758q);
            PorterDuff.Mode mode = this.f60740E;
            if (mode != null) {
                C45669nQ2.m23823e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f60739D;
            if (colorStateList != null) {
                C45669nQ2.m23824d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f60727e = clsArr;
        f60728f = clsArr;
    }

    public C39177cV5(Context context) {
        super(context);
        this.f60731c = context;
        Object[] objArr = {context};
        this.f60729a = objArr;
        this.f60730b = objArr;
    }

    /* renamed from: a */
    public final Object m61272a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return m61272a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: b */
    public Object m61271b() {
        if (this.f60732d == null) {
            this.f60732d = m61272a(this.f60731c);
        }
        return this.f60732d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.m61262h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.m61266d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.f60736A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.mo17526a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.m61268b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.m61269a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.m61264f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.m61263g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        m61270c(r13, r14, r0.m61268b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m61270c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C13585b c13585b = new C13585b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC38584bV5)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f60731c.getResources().getLayout(i);
                    m61270c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
