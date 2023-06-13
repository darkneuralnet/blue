package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.C27125p2;
import p000.InterfaceC7079RB;
import p000.InterfaceC7350SB;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends InterfaceC7079RB<S>, T extends InterfaceC7350SB<S>> extends View {

    /* renamed from: A0 */
    public static final String f73271A0 = "BaseSlider";

    /* renamed from: B0 */
    public static final int f73272B0 = C50021ul4.Widget_MaterialComponents_Slider;

    /* renamed from: C0 */
    public static final int f73273C0 = C49961uf4.motionDurationMedium4;

    /* renamed from: D0 */
    public static final int f73274D0 = C49961uf4.motionDurationShort3;

    /* renamed from: E0 */
    public static final int f73275E0 = C49961uf4.motionEasingEmphasizedInterpolator;

    /* renamed from: F0 */
    public static final int f73276F0 = C49961uf4.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: A */
    public int f73277A;

    /* renamed from: B */
    public int f73278B;

    /* renamed from: C */
    public int f73279C;

    /* renamed from: D */
    public int f73280D;

    /* renamed from: E */
    public float f73281E;

    /* renamed from: F */
    public MotionEvent f73282F;

    /* renamed from: G */
    public boolean f73283G;

    /* renamed from: H */
    public float f73284H;

    /* renamed from: I */
    public float f73285I;

    /* renamed from: J */
    public ArrayList<Float> f73286J;

    /* renamed from: K */
    public int f73287K;

    /* renamed from: P */
    public int f73288P;

    /* renamed from: Q */
    public float f73289Q;

    /* renamed from: R */
    public float[] f73290R;

    /* renamed from: S */
    public boolean f73291S;

    /* renamed from: T */
    public int f73292T;

    /* renamed from: U */
    public boolean f73293U;

    /* renamed from: W */
    public boolean f73294W;

    /* renamed from: b */
    public final Paint f73295b;

    /* renamed from: c */
    public final Paint f73296c;

    /* renamed from: d */
    public final Paint f73297d;

    /* renamed from: e */
    public final Paint f73298e;

    /* renamed from: f */
    public final Paint f73299f;

    /* renamed from: g */
    public final Paint f73300g;

    /* renamed from: h */
    public final C17875d f73301h;

    /* renamed from: i */
    public final AccessibilityManager f73302i;

    /* renamed from: j */
    public BaseSlider<S, L, T>.RunnableC17874c f73303j;

    /* renamed from: k */
    public int f73304k;

    /* renamed from: l */
    public final List<I56> f73305l;

    /* renamed from: m */
    public final List<L> f73306m;

    /* renamed from: n */
    public final List<T> f73307n;

    /* renamed from: o */
    public boolean f73308o;

    /* renamed from: p */
    public ValueAnimator f73309p;

    /* renamed from: p0 */
    public boolean f73310p0;

    /* renamed from: q */
    public ValueAnimator f73311q;

    /* renamed from: q0 */
    public ColorStateList f73312q0;

    /* renamed from: r */
    public final int f73313r;

    /* renamed from: r0 */
    public ColorStateList f73314r0;

    /* renamed from: s */
    public int f73315s;

    /* renamed from: s0 */
    public ColorStateList f73316s0;

    /* renamed from: t */
    public int f73317t;

    /* renamed from: t0 */
    public ColorStateList f73318t0;

    /* renamed from: u */
    public int f73319u;

    /* renamed from: u0 */
    public ColorStateList f73320u0;

    /* renamed from: v */
    public int f73321v;

    /* renamed from: v0 */
    public final PM2 f73322v0;

    /* renamed from: w */
    public int f73323w;

    /* renamed from: w0 */
    public Drawable f73324w0;

    /* renamed from: x */
    public int f73325x;

    /* renamed from: x0 */
    public List<Drawable> f73326x0;

    /* renamed from: y */
    public int f73327y;

    /* renamed from: y0 */
    public float f73328y0;

    /* renamed from: z */
    public int f73329z;

    /* renamed from: z0 */
    public int f73330z0;

    /* loaded from: classes6.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C17871a();

        /* renamed from: b */
        public float f73331b;

        /* renamed from: c */
        public float f73332c;

        /* renamed from: d */
        public ArrayList<Float> f73333d;

        /* renamed from: e */
        public float f73334e;

        /* renamed from: f */
        public boolean f73335f;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        /* loaded from: classes6.dex */
        public class C17871a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, C17872a c17872a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f73331b);
            parcel.writeFloat(this.f73332c);
            parcel.writeList(this.f73333d);
            parcel.writeFloat(this.f73334e);
            parcel.writeBooleanArray(new boolean[]{this.f73335f});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f73331b = parcel.readFloat();
            this.f73332c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f73333d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f73334e = parcel.readFloat();
            this.f73335f = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    /* loaded from: classes6.dex */
    public class C17872a implements ValueAnimator.AnimatorUpdateListener {
        public C17872a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (I56 i56 : BaseSlider.this.f73305l) {
                i56.m102975A0(floatValue);
            }
            C38790bq6.m62470m0(BaseSlider.this);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    /* loaded from: classes6.dex */
    public class C17873b extends AnimatorListenerAdapter {
        public C17873b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            InterfaceC52464ys6 m79300h = C36704Vt6.m79300h(BaseSlider.this);
            for (I56 i56 : BaseSlider.this.f73305l) {
                m79300h.mo2347a(i56);
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    /* loaded from: classes6.dex */
    public static class C17875d extends AbstractC51766xi1 {

        /* renamed from: n */
        public final BaseSlider<?, ?, ?> f73340n;

        /* renamed from: o */
        public final Rect f73341o;

        public C17875d(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f73341o = new Rect();
            this.f73340n = baseSlider;
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: C */
        public void mo4856C(int i, C27125p2 c27125p2) {
            c27125p2.m20089b(C27125p2.C27126a.f102983L);
            List<Float> mo48952K = this.f73340n.mo48952K();
            float floatValue = mo48952K.get(i).floatValue();
            float mo48944G = this.f73340n.mo48944G();
            float mo48943J = this.f73340n.mo48943J();
            if (this.f73340n.isEnabled()) {
                if (floatValue > mo48944G) {
                    c27125p2.m20091a(8192);
                }
                if (floatValue < mo48943J) {
                    c27125p2.m20091a(4096);
                }
            }
            c27125p2.m20130E0(C27125p2.C27129d.m20032a(1, mo48944G, mo48943J, floatValue));
            c27125p2.m20080f0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f73340n.getContentDescription() != null) {
                sb.append(this.f73340n.getContentDescription());
                sb.append(",");
            }
            String m48960z = this.f73340n.m48960z(floatValue);
            String string = this.f73340n.getContext().getString(C40534el4.material_slider_value);
            if (mo48952K.size() > 1) {
                string = m48955L(i);
            }
            sb.append(String.format(Locale.US, "%s, %s", string, m48960z));
            c27125p2.m20072j0(sb.toString());
            this.f73340n.m48975r0(i, this.f73341o);
            c27125p2.m20090a0(this.f73341o);
        }

        /* renamed from: L */
        public final String m48955L(int i) {
            if (i == this.f73340n.mo48952K().size() - 1) {
                return this.f73340n.getContext().getString(C40534el4.material_slider_range_end);
            }
            if (i == 0) {
                return this.f73340n.getContext().getString(C40534el4.material_slider_range_start);
            }
            return "";
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: o */
        public int mo4833o(float f, float f2) {
            for (int i = 0; i < this.f73340n.mo48952K().size(); i++) {
                this.f73340n.m48975r0(i, this.f73341o);
                if (this.f73341o.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: p */
        public void mo4832p(List<Integer> list) {
            for (int i = 0; i < this.f73340n.mo48952K().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: y */
        public boolean mo4823y(int i, int i2, Bundle bundle) {
            if (!this.f73340n.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f73340n.m48979p0(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f73340n.m48973s0();
                        this.f73340n.postInvalidate();
                        m4830r(i);
                        return true;
                    }
                }
                return false;
            }
            float m48990k = this.f73340n.m48990k(20);
            if (i2 == 8192) {
                m48990k = -m48990k;
            }
            if (this.f73340n.m49019Q()) {
                m48990k = -m48990k;
            }
            if (!this.f73340n.m48979p0(i, C40898fN2.m41476b(this.f73340n.mo48952K().get(i).floatValue() + m48990k, this.f73340n.mo48944G(), this.f73340n.mo48943J()))) {
                return false;
            }
            this.f73340n.m48973s0();
            this.f73340n.postInvalidate();
            m4830r(i);
            return true;
        }
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    public static float m49030C(ValueAnimator valueAnimator, float f) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f;
    }

    /* renamed from: e0 */
    public static int m49001e0(float[] fArr, float f) {
        return Math.round(f * ((fArr.length / 2) - 1));
    }

    /* renamed from: A */
    public final float[] m49033A() {
        float floatValue = ((Float) Collections.max(mo48952K())).floatValue();
        float floatValue2 = ((Float) Collections.min(mo48952K())).floatValue();
        if (this.f73286J.size() == 1) {
            floatValue2 = this.f73284H;
        }
        float m49010Z = m49010Z(floatValue2);
        float m49010Z2 = m49010Z(floatValue);
        return m49019Q() ? new float[]{m49010Z2, m49010Z} : new float[]{m49010Z, m49010Z2};
    }

    /* renamed from: A0 */
    public final void m49032A0() {
        Iterator<Float> it = this.f73286J.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() >= this.f73284H && next.floatValue() <= this.f73285I) {
                if (this.f73289Q > 0.0f && !m49031B0(next.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", next, Float.valueOf(this.f73284H), Float.valueOf(this.f73289Q), Float.valueOf(this.f73289Q)));
                }
            } else {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", next, Float.valueOf(this.f73284H), Float.valueOf(this.f73285I)));
            }
        }
    }

    /* renamed from: B */
    public int mo48945B() {
        return this.f73287K;
    }

    /* renamed from: B0 */
    public final boolean m49031B0(float f) {
        return m49020P(f - this.f73284H);
    }

    /* renamed from: C0 */
    public final float m49029C0(float f) {
        return (m49010Z(f) * this.f73292T) + this.f73277A;
    }

    /* renamed from: D */
    public final float m49028D(int i, float f) {
        float floatValue;
        float floatValue2;
        float mo48953F = mo48953F();
        if (this.f73330z0 == 0) {
            mo48953F = m48980p(mo48953F);
        }
        if (m49019Q()) {
            mo48953F = -mo48953F;
        }
        int i2 = i + 1;
        if (i2 >= this.f73286J.size()) {
            floatValue = this.f73285I;
        } else {
            floatValue = this.f73286J.get(i2).floatValue() - mo48953F;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            floatValue2 = this.f73284H;
        } else {
            floatValue2 = this.f73286J.get(i3).floatValue() + mo48953F;
        }
        return C40898fN2.m41476b(f, floatValue2, floatValue);
    }

    /* renamed from: D0 */
    public final void m49027D0() {
        float f = this.f73289Q;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            Log.w(f73271A0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f)));
        }
        float f2 = this.f73284H;
        if (((int) f2) != f2) {
            Log.w(f73271A0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f2)));
        }
        float f3 = this.f73285I;
        if (((int) f3) != f3) {
            Log.w(f73271A0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f3)));
        }
    }

    /* renamed from: E */
    public final int m49026E(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: F */
    public float mo48953F() {
        return 0.0f;
    }

    /* renamed from: G */
    public float mo48944G() {
        return this.f73284H;
    }

    /* renamed from: H */
    public final float m49025H() {
        double m48981o0 = m48981o0(this.f73328y0);
        if (m49019Q()) {
            m48981o0 = 1.0d - m48981o0;
        }
        float f = this.f73285I;
        float f2 = this.f73284H;
        return (float) ((m48981o0 * (f - f2)) + f2);
    }

    /* renamed from: I */
    public final float m49024I() {
        float f = this.f73328y0;
        if (m49019Q()) {
            f = 1.0f - f;
        }
        float f2 = this.f73285I;
        float f3 = this.f73284H;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: J */
    public float mo48943J() {
        return this.f73285I;
    }

    /* renamed from: K */
    public List<Float> mo48952K() {
        return new ArrayList(this.f73286J);
    }

    /* renamed from: L */
    public boolean mo48942L() {
        return false;
    }

    /* renamed from: M */
    public final Drawable m49023M(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        m48998g(newDrawable);
        return newDrawable;
    }

    /* renamed from: N */
    public final void m49022N() {
        this.f73295b.setStrokeWidth(this.f73329z);
        this.f73296c.setStrokeWidth(this.f73329z);
        this.f73299f.setStrokeWidth(this.f73329z / 2.0f);
        this.f73300g.setStrokeWidth(this.f73329z / 2.0f);
    }

    /* renamed from: O */
    public final boolean m49021O() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: P */
    public final boolean m49020P(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f73289Q)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(doubleValue) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean m49019Q() {
        return C38790bq6.m62548D(this) == 1;
    }

    /* renamed from: R */
    public final void m49018R(Resources resources) {
        this.f73323w = resources.getDimensionPixelSize(C35172Pf4.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C35172Pf4.mtrl_slider_track_side_padding);
        this.f73315s = dimensionPixelOffset;
        this.f73277A = dimensionPixelOffset;
        this.f73317t = resources.getDimensionPixelSize(C35172Pf4.mtrl_slider_thumb_radius);
        this.f73319u = resources.getDimensionPixelSize(C35172Pf4.mtrl_slider_track_height);
        this.f73280D = resources.getDimensionPixelSize(C35172Pf4.mtrl_slider_label_padding);
    }

    /* renamed from: S */
    public final void m49017S() {
        if (this.f73289Q <= 0.0f) {
            return;
        }
        m48967v0();
        int min = Math.min((int) (((this.f73285I - this.f73284H) / this.f73289Q) + 1.0f), (this.f73292T / (this.f73329z * 2)) + 1);
        float[] fArr = this.f73290R;
        if (fArr == null || fArr.length != min * 2) {
            this.f73290R = new float[min * 2];
        }
        float f = this.f73292T / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.f73290R;
            fArr2[i] = this.f73277A + ((i / 2.0f) * f);
            fArr2[i + 1] = m48988l();
        }
    }

    /* renamed from: T */
    public final void m49016T(Canvas canvas, int i, int i2) {
        if (m48985m0()) {
            int m49010Z = (int) (this.f73277A + (m49010Z(this.f73286J.get(this.f73288P).floatValue()) * i));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f73279C;
                canvas.clipRect(m49010Z - i3, i2 - i3, m49010Z + i3, i3 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(m49010Z, i2, this.f73279C, this.f73298e);
        }
    }

    /* renamed from: U */
    public final void m49015U(Canvas canvas) {
        if (this.f73291S && this.f73289Q > 0.0f) {
            float[] m49033A = m49033A();
            int m49001e0 = m49001e0(this.f73290R, m49033A[0]);
            int m49001e02 = m49001e0(this.f73290R, m49033A[1]);
            int i = m49001e0 * 2;
            canvas.drawPoints(this.f73290R, 0, i, this.f73299f);
            int i2 = m49001e02 * 2;
            canvas.drawPoints(this.f73290R, i, i2 - i, this.f73300g);
            float[] fArr = this.f73290R;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f73299f);
        }
    }

    /* renamed from: V */
    public final boolean m49014V() {
        int max = this.f73315s + Math.max(Math.max(this.f73278B - this.f73317t, 0), Math.max((this.f73329z - this.f73319u) / 2, 0));
        if (this.f73277A == max) {
            return false;
        }
        this.f73277A = max;
        if (C38790bq6.m62504Z(this)) {
            m48971t0(getWidth());
            return true;
        }
        return true;
    }

    /* renamed from: W */
    public final boolean m49013W() {
        int max = Math.max(this.f73323w, Math.max(this.f73329z + getPaddingTop() + getPaddingBottom(), (this.f73278B * 2) + getPaddingTop() + getPaddingBottom()));
        if (max == this.f73325x) {
            return false;
        }
        this.f73325x = max;
        return true;
    }

    /* renamed from: X */
    public final boolean m49012X(int i) {
        int i2 = this.f73288P;
        int m41474d = (int) C40898fN2.m41474d(i2 + i, 0L, this.f73286J.size() - 1);
        this.f73288P = m41474d;
        if (m41474d == i2) {
            return false;
        }
        if (this.f73287K != -1) {
            this.f73287K = m41474d;
        }
        m48973s0();
        postInvalidate();
        return true;
    }

    /* renamed from: Y */
    public final boolean m49011Y(int i) {
        if (m49019Q()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return m49012X(i);
    }

    /* renamed from: Z */
    public final float m49010Z(float f) {
        float f2 = this.f73284H;
        float f3 = (f - f2) / (this.f73285I - f2);
        if (m49019Q()) {
            return 1.0f - f3;
        }
        return f3;
    }

    /* renamed from: a0 */
    public final Boolean m49008a0(int i, KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i != 69) {
                        if (i != 70) {
                            switch (i) {
                                case 21:
                                    m49011Y(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    m49011Y(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        m49012X(-1);
                        return Boolean.TRUE;
                    }
                }
                m49012X(1);
                return Boolean.TRUE;
            }
            this.f73287K = this.f73288P;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m49012X(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(m49012X(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: b0 */
    public final void m49006b0() {
        for (T t : this.f73307n) {
            t.m85859a(this);
        }
    }

    /* renamed from: c0 */
    public final void m49004c0() {
        for (T t : this.f73307n) {
            t.m85858b(this);
        }
    }

    /* renamed from: d0 */
    public boolean mo48941d0() {
        boolean z;
        if (this.f73287K != -1) {
            return true;
        }
        float m49024I = m49024I();
        float m49029C0 = m49029C0(m49024I);
        this.f73287K = 0;
        float abs = Math.abs(this.f73286J.get(0).floatValue() - m49024I);
        for (int i = 1; i < this.f73286J.size(); i++) {
            float abs2 = Math.abs(this.f73286J.get(i).floatValue() - m49024I);
            float m49029C02 = m49029C0(this.f73286J.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!m49019Q() ? m49029C02 - m49029C0 < 0.0f : m49029C02 - m49029C0 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f73287K = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(m49029C02 - m49029C0) < this.f73313r) {
                    this.f73287K = -1;
                    return false;
                } else if (z) {
                    this.f73287K = i;
                }
            }
            abs = abs2;
        }
        if (this.f73287K != -1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f73301h.m4839i(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f73295b.setColor(m49026E(this.f73320u0));
        this.f73296c.setColor(m49026E(this.f73318t0));
        this.f73299f.setColor(m49026E(this.f73316s0));
        this.f73300g.setColor(m49026E(this.f73314r0));
        for (I56 i56 : this.f73305l) {
            if (i56.isStateful()) {
                i56.setState(getDrawableState());
            }
        }
        if (this.f73322v0.isStateful()) {
            this.f73322v0.setState(getDrawableState());
        }
        this.f73298e.setColor(m49026E(this.f73312q0));
        this.f73298e.setAlpha(63);
    }

    /* renamed from: f0 */
    public final void m48999f0(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, C37098Xl4.Slider, i, f73272B0, new int[0]);
        this.f73304k = m21866i.getResourceId(C37098Xl4.Slider_labelStyle, C50021ul4.Widget_MaterialComponents_Tooltip);
        this.f73284H = m21866i.getFloat(C37098Xl4.Slider_android_valueFrom, 0.0f);
        this.f73285I = m21866i.getFloat(C37098Xl4.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f73284H));
        this.f73289Q = m21866i.getFloat(C37098Xl4.Slider_android_stepSize, 0.0f);
        this.f73321v = (int) Math.ceil(m21866i.getDimension(C37098Xl4.Slider_minTouchTargetSize, (float) Math.ceil(C36704Vt6.m79303e(getContext(), 48))));
        int i4 = C37098Xl4.Slider_trackColor;
        boolean hasValue = m21866i.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = C37098Xl4.Slider_trackColorInactive;
        }
        if (!hasValue) {
            i4 = C37098Xl4.Slider_trackColorActive;
        }
        ColorStateList m94029b = NM2.m94029b(context, m21866i, i2);
        if (m94029b == null) {
            m94029b = C29611vi.m8249a(context, C33768Jf4.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(m94029b);
        ColorStateList m94029b2 = NM2.m94029b(context, m21866i, i4);
        if (m94029b2 == null) {
            m94029b2 = C29611vi.m8249a(context, C33768Jf4.material_slider_active_track_color);
        }
        setTrackActiveTintList(m94029b2);
        this.f73322v0.m90416a0(NM2.m94029b(context, m21866i, C37098Xl4.Slider_thumbColor));
        int i5 = C37098Xl4.Slider_thumbStrokeColor;
        if (m21866i.hasValue(i5)) {
            setThumbStrokeColor(NM2.m94029b(context, m21866i, i5));
        }
        setThumbStrokeWidth(m21866i.getDimension(C37098Xl4.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList m94029b3 = NM2.m94029b(context, m21866i, C37098Xl4.Slider_haloColor);
        if (m94029b3 == null) {
            m94029b3 = C29611vi.m8249a(context, C33768Jf4.material_slider_halo_color);
        }
        setHaloTintList(m94029b3);
        this.f73291S = m21866i.getBoolean(C37098Xl4.Slider_tickVisible, true);
        int i6 = C37098Xl4.Slider_tickColor;
        boolean hasValue2 = m21866i.hasValue(i6);
        if (hasValue2) {
            i3 = i6;
        } else {
            i3 = C37098Xl4.Slider_tickColorInactive;
        }
        if (!hasValue2) {
            i6 = C37098Xl4.Slider_tickColorActive;
        }
        ColorStateList m94029b4 = NM2.m94029b(context, m21866i, i3);
        if (m94029b4 == null) {
            m94029b4 = C29611vi.m8249a(context, C33768Jf4.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(m94029b4);
        ColorStateList m94029b5 = NM2.m94029b(context, m21866i, i6);
        if (m94029b5 == null) {
            m94029b5 = C29611vi.m8249a(context, C33768Jf4.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(m94029b5);
        setThumbRadius(m21866i.getDimensionPixelSize(C37098Xl4.Slider_thumbRadius, 0));
        setHaloRadius(m21866i.getDimensionPixelSize(C37098Xl4.Slider_haloRadius, 0));
        setThumbElevation(m21866i.getDimension(C37098Xl4.Slider_thumbElevation, 0.0f));
        setTrackHeight(m21866i.getDimensionPixelSize(C37098Xl4.Slider_trackHeight, 0));
        setLabelBehavior(m21866i.getInt(C37098Xl4.Slider_labelBehavior, 0));
        if (!m21866i.getBoolean(C37098Xl4.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        m21866i.recycle();
    }

    /* renamed from: g */
    public final void m48998g(Drawable drawable) {
        int i = this.f73278B * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = i / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    /* renamed from: g0 */
    public final void m48997g0(int i) {
        BaseSlider<S, L, T>.RunnableC17874c runnableC17874c = this.f73303j;
        if (runnableC17874c == null) {
            this.f73303j = new RunnableC17874c(this, null);
        } else {
            removeCallbacks(runnableC17874c);
        }
        this.f73303j.m48956a(i);
        postDelayed(this.f73303j, 200L);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    /* renamed from: h */
    public final void m48996h(I56 i56) {
        i56.m102961z0(C36704Vt6.m79301g(this));
    }

    /* renamed from: h0 */
    public void m48995h0(int i) {
        this.f73287K = i;
    }

    /* renamed from: i */
    public final Float m48994i(int i) {
        float m48992j;
        if (this.f73294W) {
            m48992j = m48990k(20);
        } else {
            m48992j = m48992j();
        }
        if (i != 21) {
            if (i != 22) {
                if (i != 69) {
                    if (i != 70 && i != 81) {
                        return null;
                    }
                    return Float.valueOf(m48992j);
                }
                return Float.valueOf(-m48992j);
            }
            if (m49019Q()) {
                m48992j = -m48992j;
            }
            return Float.valueOf(m48992j);
        }
        if (!m49019Q()) {
            m48992j = -m48992j;
        }
        return Float.valueOf(m48992j);
    }

    /* renamed from: i0 */
    public void m48993i0(int i) {
        this.f73330z0 = i;
        this.f73310p0 = true;
        postInvalidate();
    }

    /* renamed from: j */
    public final float m48992j() {
        float f = this.f73289Q;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: j0 */
    public final void m48991j0(I56 i56, float f) {
        i56.m102974B0(m48960z(f));
        int m49010Z = (this.f73277A + ((int) (m49010Z(f) * this.f73292T))) - (i56.getIntrinsicWidth() / 2);
        int m48988l = m48988l() - (this.f73280D + this.f73278B);
        i56.setBounds(m49010Z, m48988l - i56.getIntrinsicHeight(), i56.getIntrinsicWidth() + m49010Z, m48988l);
        Rect rect = new Rect(i56.getBounds());
        C50167v01.m9394c(C36704Vt6.m79301g(this), this, rect);
        i56.setBounds(rect);
        C36704Vt6.m79300h(this).mo2346b(i56);
    }

    /* renamed from: k */
    public final float m48990k(int i) {
        float f;
        float f2;
        float m48992j = m48992j();
        if ((this.f73285I - this.f73284H) / m48992j <= i) {
            return m48992j;
        }
        return Math.round(f / f2) * m48992j;
    }

    /* renamed from: k0 */
    public final void m48989k0(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f73286J.size() == arrayList.size() && this.f73286J.equals(arrayList)) {
                return;
            }
            this.f73286J = arrayList;
            this.f73310p0 = true;
            this.f73288P = 0;
            m48973s0();
            m48984n();
            m48976r();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: l */
    public final int m48988l() {
        int i = this.f73325x / 2;
        int i2 = 0;
        if (this.f73327y == 1 || m48987l0()) {
            i2 = this.f73305l.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: l0 */
    public final boolean m48987l0() {
        return this.f73327y == 3;
    }

    /* renamed from: m */
    public final ValueAnimator m48986m(boolean z) {
        float f;
        ValueAnimator valueAnimator;
        int m71261f;
        TimeInterpolator m71260g;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z) {
            valueAnimator = this.f73311q;
        } else {
            valueAnimator = this.f73309p;
        }
        float m49030C = m49030C(valueAnimator, f);
        if (z) {
            f2 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m49030C, f2);
        if (z) {
            m71261f = C37997aW2.m71261f(getContext(), f73273C0, 83);
            m71260g = C37997aW2.m71260g(getContext(), f73275E0, C27325pf.f103883e);
        } else {
            m71261f = C37997aW2.m71261f(getContext(), f73274D0, 117);
            m71260g = C37997aW2.m71260g(getContext(), f73276F0, C27325pf.f103881c);
        }
        ofFloat.setDuration(m71261f);
        ofFloat.setInterpolator(m71260g);
        ofFloat.addUpdateListener(new C17872a());
        return ofFloat;
    }

    /* renamed from: m0 */
    public final boolean m48985m0() {
        if (!this.f73293U && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void m48984n() {
        int i;
        if (this.f73305l.size() > this.f73286J.size()) {
            List<I56> subList = this.f73305l.subList(this.f73286J.size(), this.f73305l.size());
            for (I56 i56 : subList) {
                if (C38790bq6.m62506Y(this)) {
                    m48982o(i56);
                }
            }
            subList.clear();
        }
        while (true) {
            i = 0;
            if (this.f73305l.size() >= this.f73286J.size()) {
                break;
            }
            I56 m102967t0 = I56.m102967t0(getContext(), null, 0, this.f73304k);
            this.f73305l.add(m102967t0);
            if (C38790bq6.m62506Y(this)) {
                m48996h(m102967t0);
            }
        }
        if (this.f73305l.size() != 1) {
            i = 1;
        }
        for (I56 i562 : this.f73305l) {
            i562.m90394l0(i);
        }
    }

    /* renamed from: n0 */
    public final boolean m48983n0(float f) {
        return m48979p0(this.f73287K, f);
    }

    /* renamed from: o */
    public final void m48982o(I56 i56) {
        InterfaceC52464ys6 m79300h = C36704Vt6.m79300h(this);
        if (m79300h != null) {
            m79300h.mo2347a(i56);
            i56.m102965v0(C36704Vt6.m79301g(this));
        }
    }

    /* renamed from: o0 */
    public final double m48981o0(float f) {
        float f2 = this.f73289Q;
        if (f2 > 0.0f) {
            int i = (int) ((this.f73285I - this.f73284H) / f2);
            return Math.round(f * i) / i;
        }
        return f;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (I56 i56 : this.f73305l) {
            m48996h(i56);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.RunnableC17874c runnableC17874c = this.f73303j;
        if (runnableC17874c != null) {
            removeCallbacks(runnableC17874c);
        }
        this.f73308o = false;
        for (I56 i56 : this.f73305l) {
            m48982o(i56);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f73310p0) {
            m48967v0();
            m49017S();
        }
        super.onDraw(canvas);
        int m48988l = m48988l();
        m48972t(canvas, this.f73292T, m48988l);
        if (((Float) Collections.max(mo48952K())).floatValue() > this.f73284H) {
            m48974s(canvas, this.f73292T, m48988l);
        }
        m49015U(canvas);
        if ((this.f73283G || isFocused()) && isEnabled()) {
            m49016T(canvas, this.f73292T, m48988l);
        }
        if ((this.f73287K != -1 || m48987l0()) && isEnabled()) {
            m48966w();
        } else {
            m48964x();
        }
        m48968v(canvas, this.f73292T, m48988l);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f73287K = -1;
            this.f73301h.m4846b(this.f73288P);
            return;
        }
        m48962y(i);
        this.f73301h.m4850I(this.f73288P);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f73286J.size() == 1) {
            this.f73287K = 0;
        }
        if (this.f73287K == -1) {
            Boolean m49008a0 = m49008a0(i, keyEvent);
            if (m49008a0 != null) {
                return m49008a0.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.f73294W |= keyEvent.isLongPress();
        Float m48994i = m48994i(i);
        if (m48994i != null) {
            if (m48983n0(this.f73286J.get(this.f73287K).floatValue() + m48994i.floatValue())) {
                m48973s0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m49012X(1);
            } else {
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return m49012X(-1);
            }
        }
        this.f73287K = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f73294W = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f73325x;
        int i4 = 0;
        if (this.f73327y == 1 || m48987l0()) {
            i4 = this.f73305l.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f73284H = sliderState.f73331b;
        this.f73285I = sliderState.f73332c;
        m48989k0(sliderState.f73333d);
        this.f73289Q = sliderState.f73334e;
        if (sliderState.f73335f) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f73331b = this.f73284H;
        sliderState.f73332c = this.f73285I;
        sliderState.f73333d = new ArrayList<>(this.f73286J);
        sliderState.f73334e = this.f73289Q;
        sliderState.f73335f = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m48971t0(i);
        m48973s0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r2 != 3) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.f73277A) / this.f73292T;
        this.f73328y0 = f;
        float max = Math.max(0.0f, f);
        this.f73328y0 = max;
        this.f73328y0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f73283G) {
                        if (m49021O() && Math.abs(x - this.f73281E) < this.f73313r) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        m49006b0();
                    }
                    if (mo48941d0()) {
                        this.f73283G = true;
                        m48977q0();
                        m48973s0();
                        invalidate();
                    }
                }
            }
            this.f73283G = false;
            MotionEvent motionEvent2 = this.f73282F;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f73282F.getX() - motionEvent.getX()) <= this.f73313r && Math.abs(this.f73282F.getY() - motionEvent.getY()) <= this.f73313r && mo48941d0()) {
                m49006b0();
            }
            if (this.f73287K != -1) {
                m48977q0();
                this.f73287K = -1;
                m49004c0();
            }
            invalidate();
        } else {
            this.f73281E = x;
            if (!m49021O()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo48941d0()) {
                    requestFocus();
                    this.f73283G = true;
                    m48977q0();
                    m48973s0();
                    invalidate();
                    m49006b0();
                }
            }
        }
        setPressed(this.f73283G);
        this.f73282F = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        InterfaceC52464ys6 m79300h;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (m79300h = C36704Vt6.m79300h(this)) == null) {
            return;
        }
        for (I56 i56 : this.f73305l) {
            m79300h.mo2347a(i56);
        }
    }

    /* renamed from: p */
    public final float m48980p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.f73277A) / this.f73292T;
        float f3 = this.f73284H;
        return (f2 * (f3 - this.f73285I)) + f3;
    }

    /* renamed from: p0 */
    public final boolean m48979p0(int i, float f) {
        this.f73288P = i;
        if (Math.abs(f - this.f73286J.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f73286J.set(i, Float.valueOf(m49028D(i, f)));
        m48978q(i);
        return true;
    }

    /* renamed from: q */
    public final void m48978q(int i) {
        for (L l : this.f73306m) {
            l.m87219a(this, this.f73286J.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f73302i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m48997g0(i);
        }
    }

    /* renamed from: q0 */
    public final boolean m48977q0() {
        return m48983n0(m49025H());
    }

    /* renamed from: r */
    public final void m48976r() {
        for (L l : this.f73306m) {
            Iterator<Float> it = this.f73286J.iterator();
            while (it.hasNext()) {
                l.m87219a(this, it.next().floatValue(), false);
            }
        }
    }

    /* renamed from: r0 */
    public void m48975r0(int i, Rect rect) {
        int m49010Z = this.f73277A + ((int) (m49010Z(mo48952K().get(i).floatValue()) * this.f73292T));
        int m48988l = m48988l();
        int i2 = this.f73278B;
        int i3 = this.f73321v;
        if (i2 <= i3) {
            i2 = i3;
        }
        int i4 = i2 / 2;
        rect.set(m49010Z - i4, m48988l - i4, m49010Z + i4, m48988l + i4);
    }

    /* renamed from: s */
    public final void m48974s(Canvas canvas, int i, int i2) {
        float[] m49033A = m49033A();
        int i3 = this.f73277A;
        float f = i;
        float f2 = i2;
        canvas.drawLine(i3 + (m49033A[0] * f), f2, i3 + (m49033A[1] * f), f2, this.f73296c);
    }

    /* renamed from: s0 */
    public final void m48973s0() {
        if (!m48985m0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int m49010Z = (int) ((m49010Z(this.f73286J.get(this.f73288P).floatValue()) * this.f73292T) + this.f73277A);
                int m48988l = m48988l();
                int i = this.f73279C;
                P61.m90840l(background, m49010Z - i, m48988l - i, m49010Z + i, m48988l + i);
            }
        }
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i >= 0 && i < this.f73286J.size()) {
            this.f73288P = i;
            this.f73301h.m4850I(i);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(int i) {
        if (i == this.f73279C) {
            return;
        }
        this.f73279C = i;
        Drawable background = getBackground();
        if (!m48985m0() && (background instanceof RippleDrawable)) {
            C40750f71.m42010i((RippleDrawable) background, this.f73279C);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f73312q0)) {
            return;
        }
        this.f73312q0 = colorStateList;
        Drawable background = getBackground();
        if (!m48985m0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f73298e.setColor(m49026E(colorStateList));
        this.f73298e.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.f73327y != i) {
            this.f73327y = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(InterfaceC36394Ul2 interfaceC36394Ul2) {
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f73289Q != f) {
                this.f73289Q = f;
                this.f73310p0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.f73284H), Float.valueOf(this.f73285I)));
    }

    public void setThumbElevation(float f) {
        this.f73322v0.m90417Z(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i == this.f73278B) {
            return;
        }
        this.f73278B = i;
        this.f73322v0.setShapeAppearanceModel(C43037iy5.m31544a().m31491q(0, this.f73278B).m31495m());
        PM2 pm2 = this.f73322v0;
        int i2 = this.f73278B;
        pm2.setBounds(0, 0, i2 * 2, i2 * 2);
        Drawable drawable = this.f73324w0;
        if (drawable != null) {
            m48998g(drawable);
        }
        for (Drawable drawable2 : this.f73326x0) {
            m48998g(drawable2);
        }
        m48969u0();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f73322v0.m90396k0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(C29611vi.m8249a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f73322v0.m90394l0(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f73322v0.m90379x())) {
            return;
        }
        this.f73322v0.m90416a0(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f73314r0)) {
            return;
        }
        this.f73314r0 = colorStateList;
        this.f73300g.setColor(m49026E(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f73316s0)) {
            return;
        }
        this.f73316s0 = colorStateList;
        this.f73299f.setColor(m49026E(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f73291S != z) {
            this.f73291S = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f73318t0)) {
            return;
        }
        this.f73318t0 = colorStateList;
        this.f73296c.setColor(m49026E(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.f73329z != i) {
            this.f73329z = i;
            m49022N();
            m48969u0();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f73320u0)) {
            return;
        }
        this.f73320u0 = colorStateList;
        this.f73295b.setColor(m49026E(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f73284H = f;
        this.f73310p0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f73285I = f;
        this.f73310p0 = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        m48989k0(arrayList);
    }

    /* renamed from: t */
    public final void m48972t(Canvas canvas, int i, int i2) {
        int i3;
        float[] m49033A = m49033A();
        float f = i;
        float f2 = this.f73277A + (m49033A[1] * f);
        if (f2 < i3 + i) {
            float f3 = i2;
            canvas.drawLine(f2, f3, i3 + i, f3, this.f73295b);
        }
        int i4 = this.f73277A;
        float f4 = i4 + (m49033A[0] * f);
        if (f4 > i4) {
            float f5 = i2;
            canvas.drawLine(i4, f5, f4, f5, this.f73295b);
        }
    }

    /* renamed from: t0 */
    public final void m48971t0(int i) {
        this.f73292T = Math.max(i - (this.f73277A * 2), 0);
        m49017S();
    }

    /* renamed from: u */
    public final void m48970u(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f73277A + ((int) (m49010Z(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* renamed from: u0 */
    public final void m48969u0() {
        boolean m49013W = m49013W();
        boolean m49014V = m49014V();
        if (m49013W) {
            requestLayout();
        } else if (m49014V) {
            postInvalidate();
        }
    }

    /* renamed from: v */
    public final void m48968v(Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.f73286J.size(); i3++) {
            float floatValue = this.f73286J.get(i3).floatValue();
            Drawable drawable = this.f73324w0;
            if (drawable != null) {
                m48970u(canvas, i, i2, floatValue, drawable);
            } else if (i3 < this.f73326x0.size()) {
                m48970u(canvas, i, i2, floatValue, this.f73326x0.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.f73277A + (m49010Z(floatValue) * i), i2, this.f73278B, this.f73297d);
                }
                m48970u(canvas, i, i2, floatValue, this.f73322v0);
            }
        }
    }

    /* renamed from: v0 */
    public final void m48967v0() {
        if (this.f73310p0) {
            m48961y0();
            m48959z0();
            m48963x0();
            m49032A0();
            m48965w0();
            m49027D0();
            this.f73310p0 = false;
        }
    }

    /* renamed from: w */
    public final void m48966w() {
        if (this.f73327y == 2) {
            return;
        }
        if (!this.f73308o) {
            this.f73308o = true;
            ValueAnimator m48986m = m48986m(true);
            this.f73309p = m48986m;
            this.f73311q = null;
            m48986m.start();
        }
        Iterator<I56> it = this.f73305l.iterator();
        for (int i = 0; i < this.f73286J.size() && it.hasNext(); i++) {
            if (i != this.f73288P) {
                m48991j0(it.next(), this.f73286J.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            m48991j0(it.next(), this.f73286J.get(this.f73288P).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f73305l.size()), Integer.valueOf(this.f73286J.size())));
    }

    /* renamed from: w0 */
    public final void m48965w0() {
        float mo48953F = mo48953F();
        if (mo48953F >= 0.0f) {
            float f = this.f73289Q;
            if (f > 0.0f && mo48953F > 0.0f) {
                if (this.f73330z0 == 1) {
                    if (mo48953F < f || !m49020P(mo48953F)) {
                        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(mo48953F), Float.valueOf(this.f73289Q), Float.valueOf(this.f73289Q)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(mo48953F), Float.valueOf(this.f73289Q)));
            }
            return;
        }
        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(mo48953F)));
    }

    /* renamed from: x */
    public final void m48964x() {
        if (this.f73308o) {
            this.f73308o = false;
            ValueAnimator m48986m = m48986m(false);
            this.f73311q = m48986m;
            this.f73309p = null;
            m48986m.addListener(new C17873b());
            this.f73311q.start();
        }
    }

    /* renamed from: x0 */
    public final void m48963x0() {
        if (this.f73289Q > 0.0f && !m49031B0(this.f73285I)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f73289Q), Float.valueOf(this.f73284H), Float.valueOf(this.f73285I)));
        }
    }

    /* renamed from: y */
    public final void m48962y(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 66) {
                        m49011Y(Integer.MIN_VALUE);
                        return;
                    }
                    return;
                }
                m49011Y(Integer.MAX_VALUE);
                return;
            }
            m49012X(Integer.MIN_VALUE);
            return;
        }
        m49012X(Integer.MAX_VALUE);
    }

    /* renamed from: y0 */
    public final void m48961y0() {
        if (this.f73284H < this.f73285I) {
            return;
        }
        throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f73284H), Float.valueOf(this.f73285I)));
    }

    /* renamed from: z */
    public final String m48960z(float f) {
        String str;
        if (!mo48942L()) {
            if (((int) f) == f) {
                str = "%.0f";
            } else {
                str = "%.2f";
            }
            return String.format(str, Float.valueOf(f));
        }
        throw null;
    }

    /* renamed from: z0 */
    public final void m48959z0() {
        if (this.f73285I > this.f73284H) {
            return;
        }
        throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f73285I), Float.valueOf(this.f73284H)));
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    /* loaded from: classes6.dex */
    public class RunnableC17874c implements Runnable {

        /* renamed from: b */
        public int f73338b;

        public RunnableC17874c() {
            this.f73338b = -1;
        }

        /* renamed from: a */
        public void m48956a(int i) {
            this.f73338b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f73301h.m4849J(this.f73338b, 4);
        }

        public /* synthetic */ RunnableC17874c(BaseSlider baseSlider, C17872a c17872a) {
            this();
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.sliderStyle);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        this.f73324w0 = m49023M(drawable);
        this.f73326x0.clear();
        postInvalidate();
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, f73272B0), attributeSet, i);
        this.f73305l = new ArrayList();
        this.f73306m = new ArrayList();
        this.f73307n = new ArrayList();
        this.f73308o = false;
        this.f73283G = false;
        this.f73286J = new ArrayList<>();
        this.f73287K = -1;
        this.f73288P = -1;
        this.f73289Q = 0.0f;
        this.f73291S = true;
        this.f73294W = false;
        PM2 pm2 = new PM2();
        this.f73322v0 = pm2;
        this.f73326x0 = Collections.emptyList();
        this.f73330z0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f73295b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f73296c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f73297d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f73298e = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f73299f = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f73300g = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        m49018R(context2.getResources());
        m48999f0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        pm2.m90402h0(2);
        this.f73313r = ViewConfiguration.get(context2).getScaledTouchSlop();
        C17875d c17875d = new C17875d(this);
        this.f73301h = c17875d;
        C38790bq6.m62452v0(this, c17875d);
        this.f73302i = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(List<Float> list) {
        m48989k0(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f73324w0 = null;
        this.f73326x0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f73326x0.add(m49023M(drawable));
        }
        postInvalidate();
    }
}
