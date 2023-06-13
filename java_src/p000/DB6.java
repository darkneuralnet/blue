package p000;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* renamed from: DB6 */
/* loaded from: classes.dex */
public class DB6 {

    /* renamed from: b */
    public static final DB6 f5337b;

    /* renamed from: a */
    public final C1427l f5338a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: DB6$a */
    /* loaded from: classes.dex */
    public static class C1416a {

        /* renamed from: a */
        public static Field f5339a;

        /* renamed from: b */
        public static Field f5340b;

        /* renamed from: c */
        public static Field f5341c;

        /* renamed from: d */
        public static boolean f5342d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f5339a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f5340b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f5341c = declaredField3;
                declaredField3.setAccessible(true);
                f5342d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        private C1416a() {
        }

        /* renamed from: a */
        public static DB6 m110763a(View view) {
            if (f5342d && view.isAttachedToWindow()) {
                try {
                    Object obj = f5339a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f5340b.get(obj);
                        Rect rect2 = (Rect) f5341c.get(obj);
                        if (rect != null && rect2 != null) {
                            DB6 m110762a = new C1417b().m110760c(D32.m111004c(rect)).m110759d(D32.m111004c(rect2)).m110762a();
                            m110762a.m110768v(m110762a);
                            m110762a.m110786d(view.getRootView());
                            return m110762a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: DB6$e */
    /* loaded from: classes.dex */
    public static class C1420e extends C1419d {
        public C1420e() {
        }

        @Override // p000.DB6.C1421f
        /* renamed from: c */
        public void mo110755c(int i, D32 d32) {
            this.f5350c.setInsets(C1429n.m110712a(i), d32.m111002e());
        }

        public C1420e(DB6 db6) {
            super(db6);
        }
    }

    /* renamed from: DB6$f */
    /* loaded from: classes.dex */
    public static class C1421f {

        /* renamed from: a */
        public final DB6 f5351a;

        /* renamed from: b */
        public D32[] f5352b;

        public C1421f() {
            this(new DB6((DB6) null));
        }

        /* renamed from: a */
        public final void m110757a() {
            D32[] d32Arr = this.f5352b;
            if (d32Arr != null) {
                D32 d32 = d32Arr[C1428m.m110719d(1)];
                D32 d322 = this.f5352b[C1428m.m110719d(2)];
                if (d322 == null) {
                    d322 = this.f5351a.m110784f(2);
                }
                if (d32 == null) {
                    d32 = this.f5351a.m110784f(1);
                }
                mo110751g(D32.m111006a(d32, d322));
                D32 d323 = this.f5352b[C1428m.m110719d(16)];
                if (d323 != null) {
                    mo110752f(d323);
                }
                D32 d324 = this.f5352b[C1428m.m110719d(32)];
                if (d324 != null) {
                    mo110754d(d324);
                }
                D32 d325 = this.f5352b[C1428m.m110719d(64)];
                if (d325 != null) {
                    mo110750h(d325);
                }
            }
        }

        /* renamed from: b */
        public DB6 mo110756b() {
            m110757a();
            return this.f5351a;
        }

        /* renamed from: c */
        public void mo110755c(int i, D32 d32) {
            if (this.f5352b == null) {
                this.f5352b = new D32[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f5352b[C1428m.m110719d(i2)] = d32;
                }
            }
        }

        /* renamed from: d */
        public void mo110754d(D32 d32) {
        }

        /* renamed from: e */
        public void mo110753e(D32 d32) {
        }

        /* renamed from: f */
        public void mo110752f(D32 d32) {
        }

        /* renamed from: g */
        public void mo110751g(D32 d32) {
        }

        /* renamed from: h */
        public void mo110750h(D32 d32) {
        }

        public C1421f(DB6 db6) {
            this.f5351a = db6;
        }
    }

    /* renamed from: DB6$i */
    /* loaded from: classes.dex */
    public static class C1424i extends C1423h {
        public C1424i(DB6 db6, WindowInsets windowInsets) {
            super(db6, windowInsets);
        }

        @Override // p000.DB6.C1427l
        /* renamed from: a */
        public DB6 mo110743a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f5358c.consumeDisplayCutout();
            return DB6.m110765y(consumeDisplayCutout);
        }

        @Override // p000.DB6.C1422g, p000.DB6.C1427l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1424i)) {
                return false;
            }
            C1424i c1424i = (C1424i) obj;
            if (Objects.equals(this.f5358c, c1424i.f5358c) && Objects.equals(this.f5362g, c1424i.f5362g)) {
                return true;
            }
            return false;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: f */
        public C40730f51 mo110738f() {
            DisplayCutout displayCutout;
            displayCutout = this.f5358c.getDisplayCutout();
            return C40730f51.m42114f(displayCutout);
        }

        @Override // p000.DB6.C1427l
        public int hashCode() {
            return this.f5358c.hashCode();
        }

        public C1424i(DB6 db6, C1424i c1424i) {
            super(db6, c1424i);
        }
    }

    /* renamed from: DB6$k */
    /* loaded from: classes.dex */
    public static class C1426k extends C1425j {

        /* renamed from: q */
        public static final DB6 f5367q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f5367q = DB6.m110765y(windowInsets);
        }

        public C1426k(DB6 db6, WindowInsets windowInsets) {
            super(db6, windowInsets);
        }

        @Override // p000.DB6.C1422g, p000.DB6.C1427l
        /* renamed from: d */
        public final void mo110740d(View view) {
        }

        @Override // p000.DB6.C1422g, p000.DB6.C1427l
        /* renamed from: g */
        public D32 mo110737g(int i) {
            Insets insets;
            insets = this.f5358c.getInsets(C1429n.m110712a(i));
            return D32.m111003d(insets);
        }

        @Override // p000.DB6.C1422g, p000.DB6.C1427l
        /* renamed from: h */
        public D32 mo110736h(int i) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f5358c.getInsetsIgnoringVisibility(C1429n.m110712a(i));
            return D32.m111003d(insetsIgnoringVisibility);
        }

        @Override // p000.DB6.C1422g, p000.DB6.C1427l
        /* renamed from: q */
        public boolean mo110727q(int i) {
            boolean isVisible;
            isVisible = this.f5358c.isVisible(C1429n.m110712a(i));
            return isVisible;
        }

        public C1426k(DB6 db6, C1426k c1426k) {
            super(db6, c1426k);
        }
    }

    /* renamed from: DB6$l */
    /* loaded from: classes.dex */
    public static class C1427l {

        /* renamed from: b */
        public static final DB6 f5368b = new C1417b().m110762a().m110789a().m110788b().m110787c();

        /* renamed from: a */
        public final DB6 f5369a;

        public C1427l(DB6 db6) {
            this.f5369a = db6;
        }

        /* renamed from: a */
        public DB6 mo110743a() {
            return this.f5369a;
        }

        /* renamed from: b */
        public DB6 mo110742b() {
            return this.f5369a;
        }

        /* renamed from: c */
        public DB6 mo110741c() {
            return this.f5369a;
        }

        /* renamed from: d */
        public void mo110740d(View view) {
        }

        /* renamed from: e */
        public void mo110739e(DB6 db6) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1427l)) {
                return false;
            }
            C1427l c1427l = (C1427l) obj;
            if (mo110728p() == c1427l.mo110728p() && mo110729o() == c1427l.mo110729o() && C37259Yd3.m74780a(mo110732l(), c1427l.mo110732l()) && C37259Yd3.m74780a(mo110734j(), c1427l.mo110734j()) && C37259Yd3.m74780a(mo110738f(), c1427l.mo110738f())) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public C40730f51 mo110738f() {
            return null;
        }

        /* renamed from: g */
        public D32 mo110737g(int i) {
            return D32.f5125e;
        }

        /* renamed from: h */
        public D32 mo110736h(int i) {
            if ((i & 8) == 0) {
                return D32.f5125e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return C37259Yd3.m74779b(Boolean.valueOf(mo110728p()), Boolean.valueOf(mo110729o()), mo110732l(), mo110734j(), mo110738f());
        }

        /* renamed from: i */
        public D32 mo110735i() {
            return mo110732l();
        }

        /* renamed from: j */
        public D32 mo110734j() {
            return D32.f5125e;
        }

        /* renamed from: k */
        public D32 mo110733k() {
            return mo110732l();
        }

        /* renamed from: l */
        public D32 mo110732l() {
            return D32.f5125e;
        }

        /* renamed from: m */
        public D32 mo110731m() {
            return mo110732l();
        }

        /* renamed from: n */
        public DB6 mo110730n(int i, int i2, int i3, int i4) {
            return f5368b;
        }

        /* renamed from: o */
        public boolean mo110729o() {
            return false;
        }

        /* renamed from: p */
        public boolean mo110728p() {
            return false;
        }

        /* renamed from: q */
        public boolean mo110727q(int i) {
            return true;
        }

        /* renamed from: r */
        public void mo110726r(D32[] d32Arr) {
        }

        /* renamed from: s */
        public void mo110725s(D32 d32) {
        }

        /* renamed from: t */
        public void mo110724t(DB6 db6) {
        }

        /* renamed from: u */
        public void mo110723u(D32 d32) {
        }
    }

    /* renamed from: DB6$m */
    /* loaded from: classes.dex */
    public static final class C1428m {
        private C1428m() {
        }

        /* renamed from: a */
        public static int m110722a() {
            return 4;
        }

        /* renamed from: b */
        public static int m110721b() {
            return 128;
        }

        /* renamed from: c */
        public static int m110720c() {
            return 8;
        }

        /* renamed from: d */
        public static int m110719d(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        /* renamed from: e */
        public static int m110718e() {
            return 32;
        }

        /* renamed from: f */
        public static int m110717f() {
            return 2;
        }

        /* renamed from: g */
        public static int m110716g() {
            return 1;
        }

        /* renamed from: h */
        public static int m110715h() {
            return 7;
        }

        /* renamed from: i */
        public static int m110714i() {
            return 16;
        }

        /* renamed from: j */
        public static int m110713j() {
            return 64;
        }
    }

    /* renamed from: DB6$n */
    /* loaded from: classes.dex */
    public static final class C1429n {
        private C1429n() {
        }

        /* renamed from: a */
        public static int m110712a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 4) {
                                if (i3 != 8) {
                                    if (i3 != 16) {
                                        if (i3 != 32) {
                                            if (i3 != 64) {
                                                if (i3 == 128) {
                                                    statusBars = WindowInsets.Type.displayCutout();
                                                }
                                            } else {
                                                statusBars = WindowInsets.Type.tappableElement();
                                            }
                                        } else {
                                            statusBars = WindowInsets.Type.mandatorySystemGestures();
                                        }
                                    } else {
                                        statusBars = WindowInsets.Type.systemGestures();
                                    }
                                } else {
                                    statusBars = WindowInsets.Type.ime();
                                }
                            } else {
                                statusBars = WindowInsets.Type.captionBar();
                            }
                        } else {
                            statusBars = WindowInsets.Type.navigationBars();
                        }
                    } else {
                        statusBars = WindowInsets.Type.statusBars();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5337b = C1426k.f5367q;
        } else {
            f5337b = C1427l.f5368b;
        }
    }

    public DB6(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f5338a = new C1426k(this, windowInsets);
        } else if (i >= 29) {
            this.f5338a = new C1425j(this, windowInsets);
        } else if (i >= 28) {
            this.f5338a = new C1424i(this, windowInsets);
        } else {
            this.f5338a = new C1423h(this, windowInsets);
        }
    }

    /* renamed from: p */
    public static D32 m110774p(D32 d32, int i, int i2, int i3, int i4) {
        int max = Math.max(0, d32.f5126a - i);
        int max2 = Math.max(0, d32.f5127b - i2);
        int max3 = Math.max(0, d32.f5128c - i3);
        int max4 = Math.max(0, d32.f5129d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return d32;
        }
        return D32.m111005b(max, max2, max3, max4);
    }

    /* renamed from: y */
    public static DB6 m110765y(WindowInsets windowInsets) {
        return m110764z(windowInsets, null);
    }

    /* renamed from: z */
    public static DB6 m110764z(WindowInsets windowInsets, View view) {
        DB6 db6 = new DB6((WindowInsets) HZ3.m103731g(windowInsets));
        if (view != null && C38790bq6.m62506Y(view)) {
            db6.m110768v(C38790bq6.m62534K(view));
            db6.m110786d(view.getRootView());
        }
        return db6;
    }

    @Deprecated
    /* renamed from: a */
    public DB6 m110789a() {
        return this.f5338a.mo110743a();
    }

    @Deprecated
    /* renamed from: b */
    public DB6 m110788b() {
        return this.f5338a.mo110742b();
    }

    @Deprecated
    /* renamed from: c */
    public DB6 m110787c() {
        return this.f5338a.mo110741c();
    }

    /* renamed from: d */
    public void m110786d(View view) {
        this.f5338a.mo110740d(view);
    }

    /* renamed from: e */
    public C40730f51 m110785e() {
        return this.f5338a.mo110738f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DB6)) {
            return false;
        }
        return C37259Yd3.m74780a(this.f5338a, ((DB6) obj).f5338a);
    }

    /* renamed from: f */
    public D32 m110784f(int i) {
        return this.f5338a.mo110737g(i);
    }

    /* renamed from: g */
    public D32 m110783g(int i) {
        return this.f5338a.mo110736h(i);
    }

    @Deprecated
    /* renamed from: h */
    public D32 m110782h() {
        return this.f5338a.mo110734j();
    }

    public int hashCode() {
        C1427l c1427l = this.f5338a;
        if (c1427l == null) {
            return 0;
        }
        return c1427l.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public D32 m110781i() {
        return this.f5338a.mo110733k();
    }

    @Deprecated
    /* renamed from: j */
    public int m110780j() {
        return this.f5338a.mo110732l().f5129d;
    }

    @Deprecated
    /* renamed from: k */
    public int m110779k() {
        return this.f5338a.mo110732l().f5126a;
    }

    @Deprecated
    /* renamed from: l */
    public int m110778l() {
        return this.f5338a.mo110732l().f5128c;
    }

    @Deprecated
    /* renamed from: m */
    public int m110777m() {
        return this.f5338a.mo110732l().f5127b;
    }

    @Deprecated
    /* renamed from: n */
    public boolean m110776n() {
        return !this.f5338a.mo110732l().equals(D32.f5125e);
    }

    /* renamed from: o */
    public DB6 m110775o(int i, int i2, int i3, int i4) {
        return this.f5338a.mo110730n(i, i2, i3, i4);
    }

    /* renamed from: q */
    public boolean m110773q() {
        return this.f5338a.mo110729o();
    }

    /* renamed from: r */
    public boolean m110772r(int i) {
        return this.f5338a.mo110727q(i);
    }

    @Deprecated
    /* renamed from: s */
    public DB6 m110771s(int i, int i2, int i3, int i4) {
        return new C1417b(this).m110759d(D32.m111005b(i, i2, i3, i4)).m110762a();
    }

    /* renamed from: t */
    public void m110770t(D32[] d32Arr) {
        this.f5338a.mo110726r(d32Arr);
    }

    /* renamed from: u */
    public void m110769u(D32 d32) {
        this.f5338a.mo110725s(d32);
    }

    /* renamed from: v */
    public void m110768v(DB6 db6) {
        this.f5338a.mo110724t(db6);
    }

    /* renamed from: w */
    public void m110767w(D32 d32) {
        this.f5338a.mo110723u(d32);
    }

    /* renamed from: x */
    public WindowInsets m110766x() {
        C1427l c1427l = this.f5338a;
        if (c1427l instanceof C1422g) {
            return ((C1422g) c1427l).f5358c;
        }
        return null;
    }

    /* renamed from: DB6$c */
    /* loaded from: classes.dex */
    public static class C1418c extends C1421f {

        /* renamed from: e */
        public static Field f5344e = null;

        /* renamed from: f */
        public static boolean f5345f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f5346g = null;

        /* renamed from: h */
        public static boolean f5347h = false;

        /* renamed from: c */
        public WindowInsets f5348c;

        /* renamed from: d */
        public D32 f5349d;

        public C1418c() {
            this.f5348c = m110758i();
        }

        /* renamed from: i */
        private static WindowInsets m110758i() {
            if (!f5345f) {
                try {
                    f5344e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f5345f = true;
            }
            Field field = f5344e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f5347h) {
                try {
                    f5346g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f5347h = true;
            }
            Constructor<WindowInsets> constructor = f5346g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // p000.DB6.C1421f
        /* renamed from: b */
        public DB6 mo110756b() {
            m110757a();
            DB6 m110765y = DB6.m110765y(this.f5348c);
            m110765y.m110770t(this.f5352b);
            m110765y.m110767w(this.f5349d);
            return m110765y;
        }

        @Override // p000.DB6.C1421f
        /* renamed from: e */
        public void mo110753e(D32 d32) {
            this.f5349d = d32;
        }

        @Override // p000.DB6.C1421f
        /* renamed from: g */
        public void mo110751g(D32 d32) {
            WindowInsets windowInsets = this.f5348c;
            if (windowInsets != null) {
                this.f5348c = windowInsets.replaceSystemWindowInsets(d32.f5126a, d32.f5127b, d32.f5128c, d32.f5129d);
            }
        }

        public C1418c(DB6 db6) {
            super(db6);
            this.f5348c = db6.m110766x();
        }
    }

    /* renamed from: DB6$d */
    /* loaded from: classes.dex */
    public static class C1419d extends C1421f {

        /* renamed from: c */
        public final WindowInsets.Builder f5350c;

        public C1419d() {
            MB6.m95600a();
            this.f5350c = KB6.m99106a();
        }

        @Override // p000.DB6.C1421f
        /* renamed from: b */
        public DB6 mo110756b() {
            WindowInsets build;
            m110757a();
            build = this.f5350c.build();
            DB6 m110765y = DB6.m110765y(build);
            m110765y.m110770t(this.f5352b);
            return m110765y;
        }

        @Override // p000.DB6.C1421f
        /* renamed from: d */
        public void mo110754d(D32 d32) {
            this.f5350c.setMandatorySystemGestureInsets(d32.m111002e());
        }

        @Override // p000.DB6.C1421f
        /* renamed from: e */
        public void mo110753e(D32 d32) {
            this.f5350c.setStableInsets(d32.m111002e());
        }

        @Override // p000.DB6.C1421f
        /* renamed from: f */
        public void mo110752f(D32 d32) {
            this.f5350c.setSystemGestureInsets(d32.m111002e());
        }

        @Override // p000.DB6.C1421f
        /* renamed from: g */
        public void mo110751g(D32 d32) {
            this.f5350c.setSystemWindowInsets(d32.m111002e());
        }

        @Override // p000.DB6.C1421f
        /* renamed from: h */
        public void mo110750h(D32 d32) {
            this.f5350c.setTappableElementInsets(d32.m111002e());
        }

        public C1419d(DB6 db6) {
            super(db6);
            WindowInsets.Builder m99106a;
            WindowInsets m110766x = db6.m110766x();
            if (m110766x != null) {
                MB6.m95600a();
                m99106a = LB6.m97605a(m110766x);
            } else {
                MB6.m95600a();
                m99106a = KB6.m99106a();
            }
            this.f5350c = m99106a;
        }
    }

    /* renamed from: DB6$h */
    /* loaded from: classes.dex */
    public static class C1423h extends C1422g {

        /* renamed from: m */
        public D32 f5363m;

        public C1423h(DB6 db6, WindowInsets windowInsets) {
            super(db6, windowInsets);
            this.f5363m = null;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: b */
        public DB6 mo110742b() {
            return DB6.m110765y(this.f5358c.consumeStableInsets());
        }

        @Override // p000.DB6.C1427l
        /* renamed from: c */
        public DB6 mo110741c() {
            return DB6.m110765y(this.f5358c.consumeSystemWindowInsets());
        }

        @Override // p000.DB6.C1427l
        /* renamed from: j */
        public final D32 mo110734j() {
            if (this.f5363m == null) {
                this.f5363m = D32.m111005b(this.f5358c.getStableInsetLeft(), this.f5358c.getStableInsetTop(), this.f5358c.getStableInsetRight(), this.f5358c.getStableInsetBottom());
            }
            return this.f5363m;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: o */
        public boolean mo110729o() {
            return this.f5358c.isConsumed();
        }

        @Override // p000.DB6.C1427l
        /* renamed from: u */
        public void mo110723u(D32 d32) {
            this.f5363m = d32;
        }

        public C1423h(DB6 db6, C1423h c1423h) {
            super(db6, c1423h);
            this.f5363m = null;
            this.f5363m = c1423h.f5363m;
        }
    }

    /* renamed from: DB6$g */
    /* loaded from: classes.dex */
    public static class C1422g extends C1427l {

        /* renamed from: h */
        public static boolean f5353h = false;

        /* renamed from: i */
        public static Method f5354i;

        /* renamed from: j */
        public static Class<?> f5355j;

        /* renamed from: k */
        public static Field f5356k;

        /* renamed from: l */
        public static Field f5357l;

        /* renamed from: c */
        public final WindowInsets f5358c;

        /* renamed from: d */
        public D32[] f5359d;

        /* renamed from: e */
        public D32 f5360e;

        /* renamed from: f */
        public DB6 f5361f;

        /* renamed from: g */
        public D32 f5362g;

        public C1422g(DB6 db6, WindowInsets windowInsets) {
            super(db6);
            this.f5360e = null;
            this.f5358c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: A */
        private static void m110749A() {
            try {
                f5354i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5355j = cls;
                f5356k = cls.getDeclaredField("mVisibleInsets");
                f5357l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f5356k.setAccessible(true);
                f5357l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f5353h = true;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: v */
        private D32 m110748v(int i, boolean z) {
            D32 d32 = D32.f5125e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    d32 = D32.m111006a(d32, m110747w(i2, z));
                }
            }
            return d32;
        }

        /* renamed from: x */
        private D32 m110746x() {
            DB6 db6 = this.f5361f;
            if (db6 != null) {
                return db6.m110782h();
            }
            return D32.f5125e;
        }

        /* renamed from: y */
        private D32 m110745y(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f5353h) {
                    m110749A();
                }
                Method method = f5354i;
                if (method != null && f5355j != null && f5356k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f5356k.get(f5357l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return D32.m111004c(rect);
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // p000.DB6.C1427l
        /* renamed from: d */
        public void mo110740d(View view) {
            D32 m110745y = m110745y(view);
            if (m110745y == null) {
                m110745y = D32.f5125e;
            }
            mo110725s(m110745y);
        }

        @Override // p000.DB6.C1427l
        /* renamed from: e */
        public void mo110739e(DB6 db6) {
            db6.m110768v(this.f5361f);
            db6.m110769u(this.f5362g);
        }

        @Override // p000.DB6.C1427l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f5362g, ((C1422g) obj).f5362g);
        }

        @Override // p000.DB6.C1427l
        /* renamed from: g */
        public D32 mo110737g(int i) {
            return m110748v(i, false);
        }

        @Override // p000.DB6.C1427l
        /* renamed from: h */
        public D32 mo110736h(int i) {
            return m110748v(i, true);
        }

        @Override // p000.DB6.C1427l
        /* renamed from: l */
        public final D32 mo110732l() {
            if (this.f5360e == null) {
                this.f5360e = D32.m111005b(this.f5358c.getSystemWindowInsetLeft(), this.f5358c.getSystemWindowInsetTop(), this.f5358c.getSystemWindowInsetRight(), this.f5358c.getSystemWindowInsetBottom());
            }
            return this.f5360e;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: n */
        public DB6 mo110730n(int i, int i2, int i3, int i4) {
            C1417b c1417b = new C1417b(DB6.m110765y(this.f5358c));
            c1417b.m110759d(DB6.m110774p(mo110732l(), i, i2, i3, i4));
            c1417b.m110760c(DB6.m110774p(mo110734j(), i, i2, i3, i4));
            return c1417b.m110762a();
        }

        @Override // p000.DB6.C1427l
        /* renamed from: p */
        public boolean mo110728p() {
            return this.f5358c.isRound();
        }

        @Override // p000.DB6.C1427l
        @SuppressLint({"WrongConstant"})
        /* renamed from: q */
        public boolean mo110727q(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !m110744z(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: r */
        public void mo110726r(D32[] d32Arr) {
            this.f5359d = d32Arr;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: s */
        public void mo110725s(D32 d32) {
            this.f5362g = d32;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: t */
        public void mo110724t(DB6 db6) {
            this.f5361f = db6;
        }

        /* renamed from: w */
        public D32 m110747w(int i, boolean z) {
            int i2;
            C40730f51 mo110738f;
            if (i != 1) {
                D32 d32 = null;
                if (i != 2) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                if (i != 64) {
                                    if (i != 128) {
                                        return D32.f5125e;
                                    }
                                    DB6 db6 = this.f5361f;
                                    if (db6 != null) {
                                        mo110738f = db6.m110785e();
                                    } else {
                                        mo110738f = mo110738f();
                                    }
                                    if (mo110738f != null) {
                                        return D32.m111005b(mo110738f.m42118b(), mo110738f.m42116d(), mo110738f.m42117c(), mo110738f.m42119a());
                                    }
                                    return D32.f5125e;
                                }
                                return mo110731m();
                            }
                            return mo110735i();
                        }
                        return mo110733k();
                    }
                    D32[] d32Arr = this.f5359d;
                    if (d32Arr != null) {
                        d32 = d32Arr[C1428m.m110719d(8)];
                    }
                    if (d32 != null) {
                        return d32;
                    }
                    D32 mo110732l = mo110732l();
                    D32 m110746x = m110746x();
                    int i3 = mo110732l.f5129d;
                    if (i3 > m110746x.f5129d) {
                        return D32.m111005b(0, 0, 0, i3);
                    }
                    D32 d322 = this.f5362g;
                    if (d322 != null && !d322.equals(D32.f5125e) && (i2 = this.f5362g.f5129d) > m110746x.f5129d) {
                        return D32.m111005b(0, 0, 0, i2);
                    }
                    return D32.f5125e;
                } else if (z) {
                    D32 m110746x2 = m110746x();
                    D32 mo110734j = mo110734j();
                    return D32.m111005b(Math.max(m110746x2.f5126a, mo110734j.f5126a), 0, Math.max(m110746x2.f5128c, mo110734j.f5128c), Math.max(m110746x2.f5129d, mo110734j.f5129d));
                } else {
                    D32 mo110732l2 = mo110732l();
                    DB6 db62 = this.f5361f;
                    if (db62 != null) {
                        d32 = db62.m110782h();
                    }
                    int i4 = mo110732l2.f5129d;
                    if (d32 != null) {
                        i4 = Math.min(i4, d32.f5129d);
                    }
                    return D32.m111005b(mo110732l2.f5126a, 0, mo110732l2.f5128c, i4);
                }
            } else if (z) {
                return D32.m111005b(0, Math.max(m110746x().f5127b, mo110732l().f5127b), 0, 0);
            } else {
                return D32.m111005b(0, mo110732l().f5127b, 0, 0);
            }
        }

        /* renamed from: z */
        public boolean m110744z(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !m110747w(i, false).equals(D32.f5125e);
        }

        public C1422g(DB6 db6, C1422g c1422g) {
            this(db6, new WindowInsets(c1422g.f5358c));
        }
    }

    /* renamed from: DB6$j */
    /* loaded from: classes.dex */
    public static class C1425j extends C1424i {

        /* renamed from: n */
        public D32 f5364n;

        /* renamed from: o */
        public D32 f5365o;

        /* renamed from: p */
        public D32 f5366p;

        public C1425j(DB6 db6, WindowInsets windowInsets) {
            super(db6, windowInsets);
            this.f5364n = null;
            this.f5365o = null;
            this.f5366p = null;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: i */
        public D32 mo110735i() {
            Insets mandatorySystemGestureInsets;
            if (this.f5365o == null) {
                mandatorySystemGestureInsets = this.f5358c.getMandatorySystemGestureInsets();
                this.f5365o = D32.m111003d(mandatorySystemGestureInsets);
            }
            return this.f5365o;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: k */
        public D32 mo110733k() {
            Insets systemGestureInsets;
            if (this.f5364n == null) {
                systemGestureInsets = this.f5358c.getSystemGestureInsets();
                this.f5364n = D32.m111003d(systemGestureInsets);
            }
            return this.f5364n;
        }

        @Override // p000.DB6.C1427l
        /* renamed from: m */
        public D32 mo110731m() {
            Insets tappableElementInsets;
            if (this.f5366p == null) {
                tappableElementInsets = this.f5358c.getTappableElementInsets();
                this.f5366p = D32.m111003d(tappableElementInsets);
            }
            return this.f5366p;
        }

        @Override // p000.DB6.C1422g, p000.DB6.C1427l
        /* renamed from: n */
        public DB6 mo110730n(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.f5358c.inset(i, i2, i3, i4);
            return DB6.m110765y(inset);
        }

        @Override // p000.DB6.C1423h, p000.DB6.C1427l
        /* renamed from: u */
        public void mo110723u(D32 d32) {
        }

        public C1425j(DB6 db6, C1425j c1425j) {
            super(db6, c1425j);
            this.f5364n = null;
            this.f5365o = null;
            this.f5366p = null;
        }
    }

    /* renamed from: DB6$b */
    /* loaded from: classes.dex */
    public static final class C1417b {

        /* renamed from: a */
        public final C1421f f5343a;

        public C1417b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f5343a = new C1420e();
            } else if (i >= 29) {
                this.f5343a = new C1419d();
            } else {
                this.f5343a = new C1418c();
            }
        }

        /* renamed from: a */
        public DB6 m110762a() {
            return this.f5343a.mo110756b();
        }

        /* renamed from: b */
        public C1417b m110761b(int i, D32 d32) {
            this.f5343a.mo110755c(i, d32);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C1417b m110760c(D32 d32) {
            this.f5343a.mo110753e(d32);
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public C1417b m110759d(D32 d32) {
            this.f5343a.mo110751g(d32);
            return this;
        }

        public C1417b(DB6 db6) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f5343a = new C1420e(db6);
            } else if (i >= 29) {
                this.f5343a = new C1419d(db6);
            } else {
                this.f5343a = new C1418c(db6);
            }
        }
    }

    public DB6(DB6 db6) {
        if (db6 != null) {
            C1427l c1427l = db6.f5338a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (c1427l instanceof C1426k)) {
                this.f5338a = new C1426k(this, (C1426k) c1427l);
            } else if (i >= 29 && (c1427l instanceof C1425j)) {
                this.f5338a = new C1425j(this, (C1425j) c1427l);
            } else if (i >= 28 && (c1427l instanceof C1424i)) {
                this.f5338a = new C1424i(this, (C1424i) c1427l);
            } else if (c1427l instanceof C1423h) {
                this.f5338a = new C1423h(this, (C1423h) c1427l);
            } else if (c1427l instanceof C1422g) {
                this.f5338a = new C1422g(this, (C1422g) c1427l);
            } else {
                this.f5338a = new C1427l(this);
            }
            c1427l.mo110739e(this);
            return;
        }
        this.f5338a = new C1427l(this);
    }
}
