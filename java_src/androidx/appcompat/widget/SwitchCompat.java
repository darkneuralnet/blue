package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C11581c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: q0 */
    public static final Property<SwitchCompat, Float> f52272q0 = new C11123a(Float.class, "thumbPos");

    /* renamed from: r0 */
    public static final int[] f52273r0 = {16842912};

    /* renamed from: A */
    public float f52274A;

    /* renamed from: B */
    public int f52275B;

    /* renamed from: C */
    public int f52276C;

    /* renamed from: D */
    public int f52277D;

    /* renamed from: E */
    public int f52278E;

    /* renamed from: F */
    public int f52279F;

    /* renamed from: G */
    public int f52280G;

    /* renamed from: H */
    public int f52281H;

    /* renamed from: I */
    public boolean f52282I;

    /* renamed from: J */
    public final TextPaint f52283J;

    /* renamed from: K */
    public ColorStateList f52284K;

    /* renamed from: P */
    public Layout f52285P;

    /* renamed from: Q */
    public Layout f52286Q;

    /* renamed from: R */
    public TransformationMethod f52287R;

    /* renamed from: S */
    public ObjectAnimator f52288S;

    /* renamed from: T */
    public final C1131Ci f52289T;

    /* renamed from: U */
    public C27653qi f52290U;

    /* renamed from: W */
    public C11125c f52291W;

    /* renamed from: b */
    public Drawable f52292b;

    /* renamed from: c */
    public ColorStateList f52293c;

    /* renamed from: d */
    public PorterDuff.Mode f52294d;

    /* renamed from: e */
    public boolean f52295e;

    /* renamed from: f */
    public boolean f52296f;

    /* renamed from: g */
    public Drawable f52297g;

    /* renamed from: h */
    public ColorStateList f52298h;

    /* renamed from: i */
    public PorterDuff.Mode f52299i;

    /* renamed from: j */
    public boolean f52300j;

    /* renamed from: k */
    public boolean f52301k;

    /* renamed from: l */
    public int f52302l;

    /* renamed from: m */
    public int f52303m;

    /* renamed from: n */
    public int f52304n;

    /* renamed from: o */
    public boolean f52305o;

    /* renamed from: p */
    public CharSequence f52306p;

    /* renamed from: p0 */
    public final Rect f52307p0;

    /* renamed from: q */
    public CharSequence f52308q;

    /* renamed from: r */
    public CharSequence f52309r;

    /* renamed from: s */
    public CharSequence f52310s;

    /* renamed from: t */
    public boolean f52311t;

    /* renamed from: u */
    public int f52312u;

    /* renamed from: v */
    public int f52313v;

    /* renamed from: w */
    public float f52314w;

    /* renamed from: x */
    public float f52315x;

    /* renamed from: y */
    public VelocityTracker f52316y;

    /* renamed from: z */
    public int f52317z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: classes.dex */
    public class C11123a extends Property<SwitchCompat, Float> {
        public C11123a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f52274A);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.m69831B(f.floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    /* loaded from: classes.dex */
    public static class C11124b {
        private C11124b() {
        }

        /* renamed from: a */
        public static void m69800a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    /* loaded from: classes.dex */
    public static class C11125c extends C11581c.AbstractC11588f {

        /* renamed from: a */
        public final Reference<SwitchCompat> f52318a;

        public C11125c(SwitchCompat switchCompat) {
            this.f52318a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C11581c.AbstractC11588f
        /* renamed from: a */
        public void mo6704a(Throwable th) {
            SwitchCompat switchCompat = this.f52318a.get();
            if (switchCompat != null) {
                switchCompat.m69808u();
            }
        }

        @Override // androidx.emoji2.text.C11581c.AbstractC11588f
        /* renamed from: b */
        public void mo6703b() {
            SwitchCompat switchCompat = this.f52318a.get();
            if (switchCompat != null) {
                switchCompat.m69808u();
            }
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    public static float m69823f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: A */
    public final void m69832A(CharSequence charSequence) {
        this.f52306p = charSequence;
        this.f52308q = m69822g(charSequence);
        this.f52285P = null;
        if (this.f52311t) {
            m69830C();
        }
    }

    /* renamed from: B */
    public void m69831B(float f) {
        this.f52274A = f;
        invalidate();
    }

    /* renamed from: C */
    public final void m69830C() {
        if (this.f52291W == null && this.f52290U.m17233b() && C11581c.m67521k()) {
            C11581c m67529c = C11581c.m67529c();
            int m67525g = m67529c.m67525g();
            if (m67525g == 3 || m67525g == 0) {
                C11125c c11125c = new C11125c(this);
                this.f52291W = c11125c;
                m67529c.m67510v(c11125c);
            }
        }
    }

    /* renamed from: D */
    public final void m69829D(MotionEvent motionEvent) {
        boolean z;
        this.f52312u = 0;
        boolean z2 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.f52316y.computeCurrentVelocity(1000);
            float xVelocity = this.f52316y.getXVelocity();
            if (Math.abs(xVelocity) > this.f52317z) {
                if (!C37406Yt6.m74027b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
            } else {
                z2 = m69820i();
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        m69824e(motionEvent);
    }

    /* renamed from: a */
    public final void m69828a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f52272q0, f);
        this.f52288S = ofFloat;
        ofFloat.setDuration(250L);
        C11124b.m69800a(this.f52288S, true);
        this.f52288S.start();
    }

    /* renamed from: b */
    public final void m69827b() {
        Drawable drawable = this.f52292b;
        if (drawable != null) {
            if (this.f52295e || this.f52296f) {
                Drawable mutate = P61.m90834r(drawable).mutate();
                this.f52292b = mutate;
                if (this.f52295e) {
                    P61.m90837o(mutate, this.f52293c);
                }
                if (this.f52296f) {
                    P61.m90836p(this.f52292b, this.f52294d);
                }
                if (this.f52292b.isStateful()) {
                    this.f52292b.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m69826c() {
        Drawable drawable = this.f52297g;
        if (drawable != null) {
            if (this.f52300j || this.f52301k) {
                Drawable mutate = P61.m90834r(drawable).mutate();
                this.f52297g = mutate;
                if (this.f52300j) {
                    P61.m90837o(mutate, this.f52298h);
                }
                if (this.f52301k) {
                    P61.m90836p(this.f52297g, this.f52299i);
                }
                if (this.f52297g.isStateful()) {
                    this.f52297g.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m69825d() {
        ObjectAnimator objectAnimator = this.f52288S;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f52307p0;
        int i3 = this.f52278E;
        int i4 = this.f52279F;
        int i5 = this.f52280G;
        int i6 = this.f52281H;
        int m69818k = m69818k() + i3;
        Drawable drawable = this.f52292b;
        if (drawable != null) {
            rect = C39565d71.m44599d(drawable);
        } else {
            rect = C39565d71.f76132c;
        }
        Drawable drawable2 = this.f52297g;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            m69818k += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f52297g.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f52297g.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f52292b;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = m69818k - rect2.left;
            int i16 = m69818k + this.f52277D + rect2.right;
            this.f52292b.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                P61.m90840l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f52292b;
        if (drawable != null) {
            P61.m90841k(drawable, f, f2);
        }
        Drawable drawable2 = this.f52297g;
        if (drawable2 != null) {
            P61.m90841k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f52292b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f52297g;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m69824e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: g */
    public final CharSequence m69822g(CharSequence charSequence) {
        TransformationMethod m17229f = m69821h().m17229f(this.f52287R);
        if (m17229f != null) {
            return m17229f.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C37406Yt6.m74027b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f52275B;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f52304n;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C37406Yt6.m74027b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f52275B;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f52304n;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Q26.m89059q(super.getCustomSelectionActionModeCallback());
    }

    /* renamed from: h */
    public final C27653qi m69821h() {
        if (this.f52290U == null) {
            this.f52290U = new C27653qi(this);
        }
        return this.f52290U;
    }

    /* renamed from: i */
    public final boolean m69820i() {
        return this.f52274A > 0.5f;
    }

    /* renamed from: j */
    public Drawable m69819j() {
        return this.f52292b;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f52292b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f52297g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f52288S;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f52288S.end();
            this.f52288S = null;
        }
    }

    /* renamed from: k */
    public final int m69818k() {
        float f;
        if (C37406Yt6.m74027b(this)) {
            f = 1.0f - this.f52274A;
        } else {
            f = this.f52274A;
        }
        return (int) ((f * m69816m()) + 0.5f);
    }

    /* renamed from: l */
    public final float m69817l() {
        return this.f52274A;
    }

    /* renamed from: m */
    public final int m69816m() {
        Rect rect;
        Drawable drawable = this.f52297g;
        if (drawable != null) {
            Rect rect2 = this.f52307p0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f52292b;
            if (drawable2 != null) {
                rect = C39565d71.m44599d(drawable2);
            } else {
                rect = C39565d71.f76132c;
            }
            return ((((this.f52275B - this.f52277D) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    /* renamed from: n */
    public ColorStateList m69815n() {
        return this.f52293c;
    }

    /* renamed from: o */
    public PorterDuff.Mode m69814o() {
        return this.f52294d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f52273r0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.f52307p0;
        Drawable drawable = this.f52297g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f52279F;
        int i2 = this.f52281H;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f52292b;
        if (drawable != null) {
            if (this.f52305o && drawable2 != null) {
                Rect m44599d = C39565d71.m44599d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m44599d.left;
                rect.right -= m44599d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (m69820i()) {
            layout = this.f52285P;
        } else {
            layout = this.f52286Q;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f52284K;
            if (colorStateList != null) {
                this.f52283J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f52283J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f52306p;
            } else {
                charSequence = this.f52309r;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f52292b != null) {
            Rect rect = this.f52307p0;
            Drawable drawable = this.f52297g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m44599d = C39565d71.m44599d(this.f52292b);
            i5 = Math.max(0, m44599d.left - rect.left);
            i9 = Math.max(0, m44599d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C37406Yt6.m74027b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f52275B + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f52275B) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i7 = this.f52276C;
            } else {
                i8 = getHeight() - getPaddingBottom();
                paddingTop = i8 - this.f52276C;
                this.f52278E = i6;
                this.f52279F = paddingTop;
                this.f52281H = i8;
                this.f52280G = width;
            }
        } else {
            i7 = this.f52276C;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        }
        i8 = i7 + paddingTop;
        this.f52278E = i6;
        this.f52279F = paddingTop;
        this.f52281H = i8;
        this.f52280G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f52311t) {
            if (this.f52285P == null) {
                this.f52285P = m69809t(this.f52308q);
            }
            if (this.f52286Q == null) {
                this.f52286Q = m69809t(this.f52310s);
            }
        }
        Rect rect = this.f52307p0;
        Drawable drawable = this.f52292b;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f52292b.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f52292b.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.f52311t) {
            i5 = Math.max(this.f52285P.getWidth(), this.f52286Q.getWidth()) + (this.f52302l * 2);
        } else {
            i5 = 0;
        }
        this.f52277D = Math.max(i5, i3);
        Drawable drawable2 = this.f52297g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f52297g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f52292b;
        if (drawable3 != null) {
            Rect m44599d = C39565d71.m44599d(drawable3);
            i8 = Math.max(i8, m44599d.left);
            i9 = Math.max(i9, m44599d.right);
        }
        if (this.f52282I) {
            i6 = Math.max(this.f52303m, (this.f52277D * 2) + i8 + i9);
        } else {
            i6 = this.f52303m;
        }
        int max = Math.max(i7, i4);
        this.f52275B = i6;
        this.f52276C = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f52306p;
        } else {
            charSequence = this.f52309r;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        this.f52316y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f52312u;
                    if (i != 1) {
                        if (i == 2) {
                            float x = motionEvent.getX();
                            int m69816m = m69816m();
                            float f2 = x - this.f52314w;
                            if (m69816m != 0) {
                                f = f2 / m69816m;
                            } else if (f2 > 0.0f) {
                                f = 1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (C37406Yt6.m74027b(this)) {
                                f = -f;
                            }
                            float m69823f = m69823f(this.f52274A + f, 0.0f, 1.0f);
                            if (m69823f != this.f52274A) {
                                this.f52314w = x;
                                m69831B(m69823f);
                            }
                            return true;
                        }
                    } else {
                        float x2 = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x2 - this.f52314w) > this.f52313v || Math.abs(y - this.f52315x) > this.f52313v) {
                            this.f52312u = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f52314w = x2;
                            this.f52315x = y;
                            return true;
                        }
                    }
                }
            }
            if (this.f52312u == 2) {
                m69829D(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f52312u = 0;
            this.f52316y.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && m69810s(x3, y2)) {
                this.f52312u = 1;
                this.f52314w = x3;
                this.f52315x = y2;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public Drawable m69813p() {
        return this.f52297g;
    }

    /* renamed from: q */
    public ColorStateList m69812q() {
        return this.f52298h;
    }

    /* renamed from: r */
    public PorterDuff.Mode m69811r() {
        return this.f52299i;
    }

    /* renamed from: s */
    public final boolean m69810s(float f, float f2) {
        if (this.f52292b == null) {
            return false;
        }
        int m69818k = m69818k();
        this.f52292b.getPadding(this.f52307p0);
        int i = this.f52279F;
        int i2 = this.f52313v;
        int i3 = i - i2;
        int i4 = (this.f52278E + m69818k) - i2;
        Rect rect = this.f52307p0;
        int i5 = this.f52277D + i4 + rect.left + rect.right + i2;
        int i6 = this.f52281H + i2;
        if (f <= i4 || f >= i5 || f2 <= i3 || f2 >= i6) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m69821h().m17231d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m69805x();
        } else {
            m69806w();
        }
        if (getWindowToken() != null && C38790bq6.m62504Z(this)) {
            m69828a(isChecked);
            return;
        }
        m69825d();
        if (isChecked) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        m69831B(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q26.m89058r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        m69821h().m17230e(z);
        m69832A(this.f52306p);
        m69803z(this.f52309r);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m69821h().m17234a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f52311t != z) {
            this.f52311t = z;
            requestLayout();
            if (z) {
                m69830C();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f52305o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f52303m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f52304n = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        Z46 m73749t = Z46.m73749t(context, i, C43509jm4.TextAppearance);
        ColorStateList m73766c = m73749t.m73766c(C43509jm4.TextAppearance_android_textColor);
        if (m73766c != null) {
            this.f52284K = m73766c;
        } else {
            this.f52284K = getTextColors();
        }
        int m73763f = m73749t.m73763f(C43509jm4.TextAppearance_android_textSize, 0);
        if (m73763f != 0) {
            float f = m73763f;
            if (f != this.f52283J.getTextSize()) {
                this.f52283J.setTextSize(f);
                requestLayout();
            }
        }
        m69804y(m73749t.m73758k(C43509jm4.TextAppearance_android_typeface, -1), m73749t.m73758k(C43509jm4.TextAppearance_android_textStyle, -1));
        if (m73749t.m73768a(C43509jm4.TextAppearance_textAllCaps, false)) {
            this.f52287R = new C7670T9(getContext());
        } else {
            this.f52287R = null;
        }
        m69832A(this.f52306p);
        m69803z(this.f52309r);
        m73749t.m73746w();
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface create;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int i2 = (~(create != null ? create.getStyle() : 0)) & i;
            this.f52283J.setFakeBoldText((i2 & 1) != 0);
            this.f52283J.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.f52283J.setFakeBoldText(false);
        this.f52283J.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        m69803z(charSequence);
        requestLayout();
        if (!isChecked()) {
            m69806w();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        m69832A(charSequence);
        requestLayout();
        if (isChecked()) {
            m69805x();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f52292b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f52292b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C29611vi.m8248b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f52302l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f52293c = colorStateList;
        this.f52295e = true;
        m69827b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f52294d = mode;
        this.f52296f = true;
        m69827b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f52297g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f52297g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C29611vi.m8248b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f52298h = colorStateList;
        this.f52300j = true;
        m69826c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f52299i = mode;
        this.f52301k = true;
        m69826c();
    }

    /* renamed from: t */
    public final Layout m69809t(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.f52283J;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* renamed from: u */
    public void m69808u() {
        m69832A(this.f52306p);
        m69803z(this.f52309r);
        requestLayout();
    }

    /* renamed from: v */
    public final void m69807v(boolean z) {
        this.f52282I = z;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f52292b || drawable == this.f52297g;
    }

    /* renamed from: w */
    public final void m69806w() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f52309r;
            if (charSequence == null) {
                charSequence = getResources().getString(C49428tl4.abc_capital_off);
            }
            C38790bq6.m62507X0(this, charSequence);
        }
    }

    /* renamed from: x */
    public final void m69805x() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f52306p;
            if (charSequence == null) {
                charSequence = getResources().getString(C49428tl4.abc_capital_on);
            }
            C38790bq6.m62507X0(this, charSequence);
        }
    }

    /* renamed from: y */
    public final void m69804y(int i, int i2) {
        Typeface typeface;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        setSwitchTypeface(typeface, i2);
    }

    /* renamed from: z */
    public final void m69803z(CharSequence charSequence) {
        this.f52309r = charSequence;
        this.f52310s = m69822g(charSequence);
        this.f52286Q = null;
        if (this.f52311t) {
            m69830C();
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52293c = null;
        this.f52294d = null;
        this.f52295e = false;
        this.f52296f = false;
        this.f52298h = null;
        this.f52299i = null;
        this.f52300j = false;
        this.f52301k = false;
        this.f52316y = VelocityTracker.obtain();
        this.f52282I = true;
        this.f52307p0 = new Rect();
        C46645p36.m20010a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f52283J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C43509jm4.SwitchCompat;
        Z46 m73747v = Z46.m73747v(context, attributeSet, iArr, i, 0);
        C38790bq6.m62456t0(this, context, iArr, attributeSet, m73747v.m73751r(), i, 0);
        Drawable m73762g = m73747v.m73762g(C43509jm4.SwitchCompat_android_thumb);
        this.f52292b = m73762g;
        if (m73762g != null) {
            m73762g.setCallback(this);
        }
        Drawable m73762g2 = m73747v.m73762g(C43509jm4.SwitchCompat_track);
        this.f52297g = m73762g2;
        if (m73762g2 != null) {
            m73762g2.setCallback(this);
        }
        m69832A(m73747v.m73753p(C43509jm4.SwitchCompat_android_textOn));
        m69803z(m73747v.m73753p(C43509jm4.SwitchCompat_android_textOff));
        this.f52311t = m73747v.m73768a(C43509jm4.SwitchCompat_showText, true);
        this.f52302l = m73747v.m73763f(C43509jm4.SwitchCompat_thumbTextPadding, 0);
        this.f52303m = m73747v.m73763f(C43509jm4.SwitchCompat_switchMinWidth, 0);
        this.f52304n = m73747v.m73763f(C43509jm4.SwitchCompat_switchPadding, 0);
        this.f52305o = m73747v.m73768a(C43509jm4.SwitchCompat_splitTrack, false);
        ColorStateList m73766c = m73747v.m73766c(C43509jm4.SwitchCompat_thumbTint);
        if (m73766c != null) {
            this.f52293c = m73766c;
            this.f52295e = true;
        }
        PorterDuff.Mode m44598e = C39565d71.m44598e(m73747v.m73758k(C43509jm4.SwitchCompat_thumbTintMode, -1), null);
        if (this.f52294d != m44598e) {
            this.f52294d = m44598e;
            this.f52296f = true;
        }
        if (this.f52295e || this.f52296f) {
            m69827b();
        }
        ColorStateList m73766c2 = m73747v.m73766c(C43509jm4.SwitchCompat_trackTint);
        if (m73766c2 != null) {
            this.f52298h = m73766c2;
            this.f52300j = true;
        }
        PorterDuff.Mode m44598e2 = C39565d71.m44598e(m73747v.m73758k(C43509jm4.SwitchCompat_trackTintMode, -1), null);
        if (this.f52299i != m44598e2) {
            this.f52299i = m44598e2;
            this.f52301k = true;
        }
        if (this.f52300j || this.f52301k) {
            m69826c();
        }
        int m73755n = m73747v.m73755n(C43509jm4.SwitchCompat_switchTextAppearance, 0);
        if (m73755n != 0) {
            setSwitchTextAppearance(context, m73755n);
        }
        C1131Ci c1131Ci = new C1131Ci(this);
        this.f52289T = c1131Ci;
        c1131Ci.m111854m(attributeSet, i);
        m73747v.m73746w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f52313v = viewConfiguration.getScaledTouchSlop();
        this.f52317z = viewConfiguration.getScaledMinimumFlingVelocity();
        m69821h().m17232c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f52283J.getTypeface() == null || this.f52283J.getTypeface().equals(typeface)) && (this.f52283J.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f52283J.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
