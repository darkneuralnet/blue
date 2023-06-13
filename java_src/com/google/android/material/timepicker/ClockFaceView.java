package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p000.C27125p2;
/* loaded from: classes6.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.InterfaceC17941b {

    /* renamed from: e */
    public final ClockHandView f73606e;

    /* renamed from: f */
    public final Rect f73607f;

    /* renamed from: g */
    public final RectF f73608g;

    /* renamed from: h */
    public final Rect f73609h;

    /* renamed from: i */
    public final SparseArray<TextView> f73610i;

    /* renamed from: j */
    public final C5148M1 f73611j;

    /* renamed from: k */
    public final int[] f73612k;

    /* renamed from: l */
    public final float[] f73613l;

    /* renamed from: m */
    public final int f73614m;

    /* renamed from: n */
    public final int f73615n;

    /* renamed from: o */
    public final int f73616o;

    /* renamed from: p */
    public final int f73617p;

    /* renamed from: q */
    public String[] f73618q;

    /* renamed from: r */
    public float f73619r;

    /* renamed from: s */
    public final ColorStateList f73620s;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: classes6.dex */
    public class ViewTreeObserver$OnPreDrawListenerC17938a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC17938a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo48515i(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f73606e.m48529i()) - ClockFaceView.this.f73614m);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: classes6.dex */
    public class C17939b extends C5148M1 {
        public C17939b() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            int intValue = ((Integer) view.getTag(C33795Ji4.material_value_index)).intValue();
            if (intValue > 0) {
                c27125p2.m20108P0((View) ClockFaceView.this.f73610i.get(intValue - 1));
            }
            c27125p2.m20074i0(C27125p2.C27128c.m20033a(0, 1, intValue, 1, false, view.isSelected()));
            c27125p2.m20078g0(true);
            c27125p2.m20089b(C27125p2.C27126a.f102997i);
        }

        @Override // p000.C5148M1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.f73607f);
                float centerX = ClockFaceView.this.f73607f.centerX();
                float centerY = ClockFaceView.this.f73607f.centerY();
                ClockFaceView.this.f73606e.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                ClockFaceView.this.f73606e.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                return true;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.materialClockStyle);
    }

    /* renamed from: u */
    public static float m48540u(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC17941b
    /* renamed from: d */
    public void mo48520d(float f, boolean z) {
        if (Math.abs(this.f73619r - f) > 0.001f) {
            this.f73619r = f;
            m48543r();
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    /* renamed from: i */
    public void mo48515i(int i) {
        if (i != m48516h()) {
            super.mo48515i(i);
            this.f73606e.m48525m(m48516h());
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    /* renamed from: k */
    public void mo48513k() {
        super.mo48513k();
        for (int i = 0; i < this.f73610i.size(); i++) {
            this.f73610i.get(i).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C27125p2.m20096V0(accessibilityNodeInfo).m20076h0(C27125p2.C27127b.m20034b(1, this.f73618q.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m48543r();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m48540u = (int) (this.f73617p / m48540u(this.f73615n / displayMetrics.heightPixels, this.f73616o / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m48540u, 1073741824);
        setMeasuredDimension(m48540u, m48540u);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    /* renamed from: r */
    public final void m48543r() {
        boolean z;
        RectF m48533e = this.f73606e.m48533e();
        TextView m48541t = m48541t(m48533e);
        for (int i = 0; i < this.f73610i.size(); i++) {
            TextView textView = this.f73610i.get(i);
            if (textView != null) {
                if (textView == m48541t) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setSelected(z);
                textView.getPaint().setShader(m48542s(m48533e, textView));
                textView.invalidate();
            }
        }
    }

    /* renamed from: s */
    public final RadialGradient m48542s(RectF rectF, TextView textView) {
        textView.getHitRect(this.f73607f);
        this.f73608g.set(this.f73607f);
        textView.getLineBounds(0, this.f73609h);
        RectF rectF2 = this.f73608g;
        Rect rect = this.f73609h;
        rectF2.inset(rect.left, rect.top);
        if (!RectF.intersects(rectF, this.f73608g)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f73608g.left, rectF.centerY() - this.f73608g.top, rectF.width() * 0.5f, this.f73612k, this.f73613l, Shader.TileMode.CLAMP);
    }

    /* renamed from: t */
    public final TextView m48541t(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.f73610i.size(); i++) {
            TextView textView2 = this.f73610i.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.f73607f);
                this.f73608g.set(this.f73607f);
                this.f73608g.union(rectF);
                float width = this.f73608g.width() * this.f73608g.height();
                if (width < f) {
                    textView = textView2;
                    f = width;
                }
            }
        }
        return textView;
    }

    /* renamed from: v */
    public void m48539v(String[] strArr, int i) {
        this.f73618q = strArr;
        m48538w(i);
    }

    /* renamed from: w */
    public final void m48538w(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f73610i.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f73618q.length, size); i2++) {
            TextView textView = this.f73610i.get(i2);
            if (i2 >= this.f73618q.length) {
                removeView(textView);
                this.f73610i.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C50603vk4.material_clockface_textview, (ViewGroup) this, false);
                    this.f73610i.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f73618q[i2]);
                textView.setTag(C33795Ji4.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(C33795Ji4.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                C38790bq6.m62452v0(textView, this.f73611j);
                textView.setTextColor(this.f73620s);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f73618q[i2]));
                }
            }
        }
        this.f73606e.m48521q(z);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f73607f = new Rect();
        this.f73608g = new RectF();
        this.f73609h = new Rect();
        this.f73610i = new SparseArray<>();
        this.f73613l = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.ClockFaceView, i, C50021ul4.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m94029b = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.ClockFaceView_clockNumberTextColor);
        this.f73620s = m94029b;
        LayoutInflater.from(context).inflate(C50603vk4.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C33795Ji4.material_clock_hand);
        this.f73606e = clockHandView;
        this.f73614m = resources.getDimensionPixelSize(C35172Pf4.material_clock_hand_padding);
        int colorForState = m94029b.getColorForState(new int[]{16842913}, m94029b.getDefaultColor());
        this.f73612k = new int[]{colorForState, colorForState, m94029b.getDefaultColor()};
        clockHandView.m48536b(this);
        int defaultColor = C29611vi.m8249a(context, C33768Jf4.material_timepicker_clockface).getDefaultColor();
        ColorStateList m94029b2 = NM2.m94029b(context, obtainStyledAttributes, C37098Xl4.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(m94029b2 != null ? m94029b2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC17938a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f73611j = new C17939b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m48539v(strArr, 0);
        this.f73615n = resources.getDimensionPixelSize(C35172Pf4.material_time_picker_minimum_screen_height);
        this.f73616o = resources.getDimensionPixelSize(C35172Pf4.material_time_picker_minimum_screen_width);
        this.f73617p = resources.getDimensionPixelSize(C35172Pf4.material_clock_size);
    }
}
