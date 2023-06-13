package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p000.C38306b16;
/* renamed from: com.google.android.material.badge.a */
/* loaded from: classes6.dex */
public class C17671a extends Drawable implements C38306b16.InterfaceC12272b {

    /* renamed from: o */
    public static final int f72241o = C50021ul4.Widget_MaterialComponents_Badge;

    /* renamed from: p */
    public static final int f72242p = C49961uf4.badgeStyle;

    /* renamed from: b */
    public final WeakReference<Context> f72243b;

    /* renamed from: c */
    public final PM2 f72244c;

    /* renamed from: d */
    public final C38306b16 f72245d;

    /* renamed from: e */
    public final Rect f72246e;

    /* renamed from: f */
    public final BadgeState f72247f;

    /* renamed from: g */
    public float f72248g;

    /* renamed from: h */
    public float f72249h;

    /* renamed from: i */
    public int f72250i;

    /* renamed from: j */
    public float f72251j;

    /* renamed from: k */
    public float f72252k;

    /* renamed from: l */
    public float f72253l;

    /* renamed from: m */
    public WeakReference<View> f72254m;

    /* renamed from: n */
    public WeakReference<FrameLayout> f72255n;

    /* renamed from: com.google.android.material.badge.a$a */
    /* loaded from: classes6.dex */
    public class RunnableC17672a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f72256b;

        /* renamed from: c */
        public final /* synthetic */ FrameLayout f72257c;

        public RunnableC17672a(View view, FrameLayout frameLayout) {
            this.f72256b = view;
            this.f72257c = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17671a.this.m50290A(this.f72256b, this.f72257c);
        }
    }

    public C17671a(Context context, int i, int i2, int i3, BadgeState.State state) {
        this.f72243b = new WeakReference<>(context);
        C46052o36.m21872c(context);
        this.f72246e = new Rect();
        this.f72244c = new PM2();
        C38306b16 c38306b16 = new C38306b16(this);
        this.f72245d = c38306b16;
        c38306b16.m65107e().setTextAlign(Paint.Align.CENTER);
        m50265x(C50021ul4.TextAppearance_MaterialComponents_Badge);
        this.f72247f = new BadgeState(context, i, i2, i3, state);
        m50267v();
    }

    /* renamed from: c */
    public static C17671a m50286c(Context context, BadgeState.State state) {
        return new C17671a(context, 0, f72242p, f72241o, state);
    }

    /* renamed from: z */
    public static void m50263z(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: A */
    public void m50290A(View view, FrameLayout frameLayout) {
        this.f72254m = new WeakReference<>(view);
        boolean z = C17673b.f72259a;
        if (z && frameLayout == null) {
            m50264y(view);
        } else {
            this.f72255n = new WeakReference<>(frameLayout);
        }
        if (!z) {
            m50263z(view);
        }
        m50289B();
        invalidateSelf();
    }

    /* renamed from: B */
    public final void m50289B() {
        View view;
        Context context = this.f72243b.get();
        WeakReference<View> weakReference = this.f72254m;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f72246e);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f72255n;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null || C17673b.f72259a) {
                if (frameLayout == null) {
                    frameLayout = (ViewGroup) view.getParent();
                }
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            m50287b(context, rect2, view);
            C17673b.m50257f(this.f72246e, this.f72248g, this.f72249h, this.f72252k, this.f72253l);
            this.f72244c.m90419X(this.f72251j);
            if (!rect.equals(this.f72246e)) {
                this.f72244c.setBounds(this.f72246e);
            }
        }
    }

    /* renamed from: C */
    public final void m50288C() {
        this.f72250i = ((int) Math.pow(10.0d, m50280i() - 1.0d)) - 1;
    }

    @Override // p000.C38306b16.InterfaceC12272b
    /* renamed from: a */
    public void mo49869a() {
        invalidateSelf();
    }

    /* renamed from: b */
    public final void m50287b(Context context, Rect rect, View view) {
        int i;
        float f;
        float f2;
        float f3;
        int m50276m = m50276m();
        int m50345f = this.f72247f.m50345f();
        if (m50345f != 8388691 && m50345f != 8388693) {
            this.f72249h = rect.top + m50276m;
        } else {
            this.f72249h = rect.bottom - m50276m;
        }
        if (m50279j() <= 9) {
            if (!m50275n()) {
                f3 = this.f72247f.f72220c;
            } else {
                f3 = this.f72247f.f72221d;
            }
            this.f72251j = f3;
            this.f72253l = f3;
            this.f72252k = f3;
        } else {
            float f4 = this.f72247f.f72221d;
            this.f72251j = f4;
            this.f72253l = f4;
            this.f72252k = (this.f72245d.m65106f(m50284e()) / 2.0f) + this.f72247f.f72222e;
        }
        Resources resources = context.getResources();
        if (m50275n()) {
            i = C35172Pf4.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i = C35172Pf4.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int m50277l = m50277l();
        int m50345f2 = this.f72247f.m50345f();
        if (m50345f2 != 8388659 && m50345f2 != 8388691) {
            if (C38790bq6.m62548D(view) == 0) {
                f2 = ((rect.right + this.f72252k) - dimensionPixelSize) - m50277l;
            } else {
                f2 = (rect.left - this.f72252k) + dimensionPixelSize + m50277l;
            }
            this.f72248g = f2;
            return;
        }
        if (C38790bq6.m62548D(view) == 0) {
            f = (rect.left - this.f72252k) + dimensionPixelSize + m50277l;
        } else {
            f = ((rect.right + this.f72252k) - dimensionPixelSize) - m50277l;
        }
        this.f72248g = f;
    }

    /* renamed from: d */
    public final void m50285d(Canvas canvas) {
        Rect rect = new Rect();
        String m50284e = m50284e();
        this.f72245d.m65107e().getTextBounds(m50284e, 0, m50284e.length(), rect);
        canvas.drawText(m50284e, this.f72248g, this.f72249h + (rect.height() / 2), this.f72245d.m65107e());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f72244c.draw(canvas);
            if (m50275n()) {
                m50285d(canvas);
            }
        }
    }

    /* renamed from: e */
    public final String m50284e() {
        if (m50279j() <= this.f72250i) {
            return NumberFormat.getInstance(this.f72247f.m50336o()).format(m50279j());
        }
        Context context = this.f72243b.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f72247f.m50336o(), context.getString(C40534el4.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f72250i), "+");
    }

    /* renamed from: f */
    public CharSequence m50283f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (m50275n()) {
            if (this.f72247f.m50341j() == 0 || (context = this.f72243b.get()) == null) {
                return null;
            }
            if (m50279j() <= this.f72250i) {
                return context.getResources().getQuantityString(this.f72247f.m50341j(), m50279j(), Integer.valueOf(m50279j()));
            }
            return context.getString(this.f72247f.m50343h(), Integer.valueOf(this.f72250i));
        }
        return this.f72247f.m50342i();
    }

    /* renamed from: g */
    public FrameLayout m50282g() {
        WeakReference<FrameLayout> weakReference = this.f72255n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f72247f.m50347d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f72246e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f72246e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int m50281h() {
        return this.f72247f.m50339l();
    }

    /* renamed from: i */
    public int m50280i() {
        return this.f72247f.m50338m();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int m50279j() {
        if (m50275n()) {
            return this.f72247f.m50337n();
        }
        return 0;
    }

    /* renamed from: k */
    public BadgeState.State m50278k() {
        return this.f72247f.m50335p();
    }

    /* renamed from: l */
    public final int m50277l() {
        int m50339l;
        if (m50275n()) {
            m50339l = this.f72247f.m50340k();
        } else {
            m50339l = this.f72247f.m50339l();
        }
        return m50339l + this.f72247f.m50349b();
    }

    /* renamed from: m */
    public final int m50276m() {
        int m50333r;
        if (m50275n()) {
            m50333r = this.f72247f.m50334q();
        } else {
            m50333r = this.f72247f.m50333r();
        }
        return m50333r + this.f72247f.m50348c();
    }

    /* renamed from: n */
    public boolean m50275n() {
        return this.f72247f.m50332s();
    }

    /* renamed from: o */
    public final void m50274o() {
        this.f72245d.m65107e().setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p000.C38306b16.InterfaceC12272b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public final void m50273p() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f72247f.m50346e());
        if (this.f72244c.m90379x() != valueOf) {
            this.f72244c.m90416a0(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public final void m50272q() {
        FrameLayout frameLayout;
        WeakReference<View> weakReference = this.f72254m;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.f72254m.get();
            WeakReference<FrameLayout> weakReference2 = this.f72255n;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            } else {
                frameLayout = null;
            }
            m50290A(view, frameLayout);
        }
    }

    /* renamed from: r */
    public final void m50271r() {
        this.f72245d.m65107e().setColor(this.f72247f.m50344g());
        invalidateSelf();
    }

    /* renamed from: s */
    public final void m50270s() {
        m50288C();
        this.f72245d.m65103i(true);
        m50289B();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f72247f.m50329v(i);
        m50274o();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public final void m50269t() {
        this.f72245d.m65103i(true);
        m50289B();
        invalidateSelf();
    }

    /* renamed from: u */
    public final void m50268u() {
        boolean m50331t = this.f72247f.m50331t();
        setVisible(m50331t, false);
        if (C17673b.f72259a && m50282g() != null && !m50331t) {
            ((ViewGroup) m50282g().getParent()).invalidate();
        }
    }

    /* renamed from: v */
    public final void m50267v() {
        m50270s();
        m50269t();
        m50274o();
        m50273p();
        m50271r();
        m50272q();
        m50289B();
        m50268u();
    }

    /* renamed from: w */
    public final void m50266w(N06 n06) {
        Context context;
        if (this.f72245d.m65108d() == n06 || (context = this.f72243b.get()) == null) {
            return;
        }
        this.f72245d.m65104h(n06, context);
        m50289B();
    }

    /* renamed from: x */
    public final void m50265x(int i) {
        Context context = this.f72243b.get();
        if (context == null) {
            return;
        }
        m50266w(new N06(context, i));
    }

    /* renamed from: y */
    public final void m50264y(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C33795Ji4.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f72255n;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            m50263z(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(C33795Ji4.mtrl_anchor_parent);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, indexOfChild);
            this.f72255n = new WeakReference<>(frameLayout);
            frameLayout.post(new RunnableC17672a(view, frameLayout));
        }
    }
}
