package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
/* renamed from: C12 */
/* loaded from: classes6.dex */
public final class C12 {

    /* renamed from: A */
    public ColorStateList f3255A;

    /* renamed from: B */
    public Typeface f3256B;

    /* renamed from: a */
    public final int f3257a;

    /* renamed from: b */
    public final int f3258b;

    /* renamed from: c */
    public final int f3259c;

    /* renamed from: d */
    public final TimeInterpolator f3260d;

    /* renamed from: e */
    public final TimeInterpolator f3261e;

    /* renamed from: f */
    public final TimeInterpolator f3262f;

    /* renamed from: g */
    public final Context f3263g;

    /* renamed from: h */
    public final TextInputLayout f3264h;

    /* renamed from: i */
    public LinearLayout f3265i;

    /* renamed from: j */
    public int f3266j;

    /* renamed from: k */
    public FrameLayout f3267k;

    /* renamed from: l */
    public Animator f3268l;

    /* renamed from: m */
    public final float f3269m;

    /* renamed from: n */
    public int f3270n;

    /* renamed from: o */
    public int f3271o;

    /* renamed from: p */
    public CharSequence f3272p;

    /* renamed from: q */
    public boolean f3273q;

    /* renamed from: r */
    public TextView f3274r;

    /* renamed from: s */
    public CharSequence f3275s;

    /* renamed from: t */
    public int f3276t;

    /* renamed from: u */
    public int f3277u;

    /* renamed from: v */
    public ColorStateList f3278v;

    /* renamed from: w */
    public CharSequence f3279w;

    /* renamed from: x */
    public boolean f3280x;

    /* renamed from: y */
    public TextView f3281y;

    /* renamed from: z */
    public int f3282z;

    /* renamed from: C12$a */
    /* loaded from: classes6.dex */
    public class C0838a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f3283a;

        /* renamed from: b */
        public final /* synthetic */ TextView f3284b;

        /* renamed from: c */
        public final /* synthetic */ int f3285c;

        /* renamed from: d */
        public final /* synthetic */ TextView f3286d;

        public C0838a(int i, TextView textView, int i2, TextView textView2) {
            this.f3283a = i;
            this.f3284b = textView;
            this.f3285c = i2;
            this.f3286d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C12.this.f3270n = this.f3283a;
            C12.this.f3268l = null;
            TextView textView = this.f3284b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f3285c == 1 && C12.this.f3274r != null) {
                    C12.this.f3274r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f3286d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f3286d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f3286d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f3286d.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: C12$b */
    /* loaded from: classes6.dex */
    public class C0839b extends View.AccessibilityDelegate {
        public C0839b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C12.this.f3264h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C12(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3263g = context;
        this.f3264h = textInputLayout;
        this.f3269m = context.getResources().getDimensionPixelSize(C35172Pf4.design_textinput_caption_translate_y);
        int i = C49961uf4.motionDurationShort4;
        this.f3257a = C37997aW2.m71261f(context, i, 217);
        this.f3258b = C37997aW2.m71261f(context, C49961uf4.motionDurationMedium4, 167);
        this.f3259c = C37997aW2.m71261f(context, i, 167);
        int i2 = C49961uf4.motionEasingEmphasizedDecelerateInterpolator;
        this.f3260d = C37997aW2.m71260g(context, i2, C27325pf.f103882d);
        TimeInterpolator timeInterpolator = C27325pf.f103879a;
        this.f3261e = C37997aW2.m71260g(context, i2, timeInterpolator);
        this.f3262f = C37997aW2.m71260g(context, C49961uf4.motionEasingLinearInterpolator, timeInterpolator);
    }

    /* renamed from: A */
    public final boolean m113049A(int i) {
        if (i == 2 && this.f3281y != null && !TextUtils.isEmpty(this.f3279w)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m113048B(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: C */
    public boolean m113047C() {
        return this.f3273q;
    }

    /* renamed from: D */
    public boolean m113046D() {
        return this.f3280x;
    }

    /* renamed from: E */
    public void m113045E(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f3265i == null) {
            return;
        }
        if (m113048B(i) && (frameLayout = this.f3267k) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f3265i.removeView(textView);
        }
        int i2 = this.f3266j - 1;
        this.f3266j = i2;
        m113033Q(this.f3265i, i2);
    }

    /* renamed from: F */
    public final void m113044F(int i, int i2) {
        TextView m113016m;
        TextView m113016m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m113016m2 = m113016m(i2)) != null) {
            m113016m2.setVisibility(0);
            m113016m2.setAlpha(1.0f);
        }
        if (i != 0 && (m113016m = m113016m(i)) != null) {
            m113016m.setVisibility(4);
            if (i == 1) {
                m113016m.setText((CharSequence) null);
            }
        }
        this.f3270n = i2;
    }

    /* renamed from: G */
    public void m113043G(int i) {
        this.f3276t = i;
        TextView textView = this.f3274r;
        if (textView != null) {
            C38790bq6.m62448x0(textView, i);
        }
    }

    /* renamed from: H */
    public void m113042H(CharSequence charSequence) {
        this.f3275s = charSequence;
        TextView textView = this.f3274r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: I */
    public void m113041I(boolean z) {
        if (this.f3273q == z) {
            return;
        }
        m113021h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f3263g);
            this.f3274r = appCompatTextView;
            appCompatTextView.setId(C33795Ji4.textinput_error);
            this.f3274r.setTextAlignment(5);
            Typeface typeface = this.f3256B;
            if (typeface != null) {
                this.f3274r.setTypeface(typeface);
            }
            m113040J(this.f3277u);
            m113039K(this.f3278v);
            m113042H(this.f3275s);
            m113043G(this.f3276t);
            this.f3274r.setVisibility(4);
            m113024e(this.f3274r, 0);
        } else {
            m113005x();
            m113045E(this.f3274r, 0);
            this.f3274r = null;
            this.f3264h.updateEditTextBackground();
            this.f3264h.updateTextInputBoxState();
        }
        this.f3273q = z;
    }

    /* renamed from: J */
    public void m113040J(int i) {
        this.f3277u = i;
        TextView textView = this.f3274r;
        if (textView != null) {
            this.f3264h.setTextAppearanceCompatWithErrorFallback(textView, i);
        }
    }

    /* renamed from: K */
    public void m113039K(ColorStateList colorStateList) {
        this.f3278v = colorStateList;
        TextView textView = this.f3274r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: L */
    public void m113038L(int i) {
        this.f3282z = i;
        TextView textView = this.f3281y;
        if (textView != null) {
            Q26.m89061o(textView, i);
        }
    }

    /* renamed from: M */
    public void m113037M(boolean z) {
        if (this.f3280x == z) {
            return;
        }
        m113021h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f3263g);
            this.f3281y = appCompatTextView;
            appCompatTextView.setId(C33795Ji4.textinput_helper_text);
            this.f3281y.setTextAlignment(5);
            Typeface typeface = this.f3256B;
            if (typeface != null) {
                this.f3281y.setTypeface(typeface);
            }
            this.f3281y.setVisibility(4);
            C38790bq6.m62448x0(this.f3281y, 1);
            m113038L(this.f3282z);
            m113036N(this.f3255A);
            m113024e(this.f3281y, 1);
            this.f3281y.setAccessibilityDelegate(new C0839b());
        } else {
            m113004y();
            m113045E(this.f3281y, 1);
            this.f3281y = null;
            this.f3264h.updateEditTextBackground();
            this.f3264h.updateTextInputBoxState();
        }
        this.f3280x = z;
    }

    /* renamed from: N */
    public void m113036N(ColorStateList colorStateList) {
        this.f3255A = colorStateList;
        TextView textView = this.f3281y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: O */
    public final void m113035O(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: P */
    public void m113034P(Typeface typeface) {
        if (typeface != this.f3256B) {
            this.f3256B = typeface;
            m113035O(this.f3274r, typeface);
            m113035O(this.f3281y, typeface);
        }
    }

    /* renamed from: Q */
    public final void m113033Q(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: R */
    public final boolean m113032R(TextView textView, CharSequence charSequence) {
        if (C38790bq6.m62504Z(this.f3264h) && this.f3264h.isEnabled() && (this.f3271o != this.f3270n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m113031S(CharSequence charSequence) {
        m113021h();
        this.f3272p = charSequence;
        this.f3274r.setText(charSequence);
        int i = this.f3270n;
        if (i != 1) {
            this.f3271o = 1;
        }
        m113029U(i, this.f3271o, m113032R(this.f3274r, charSequence));
    }

    /* renamed from: T */
    public void m113030T(CharSequence charSequence) {
        m113021h();
        this.f3279w = charSequence;
        this.f3281y.setText(charSequence);
        int i = this.f3270n;
        if (i != 2) {
            this.f3271o = 2;
        }
        m113029U(i, this.f3271o, m113032R(this.f3281y, charSequence));
    }

    /* renamed from: U */
    public final void m113029U(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3268l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m113020i(arrayList, this.f3280x, this.f3281y, 2, i, i2);
            m113020i(arrayList, this.f3273q, this.f3274r, 1, i, i2);
            C0168Af.m115414a(animatorSet, arrayList);
            animatorSet.addListener(new C0838a(i2, m113016m(i), i, m113016m(i2)));
            animatorSet.start();
        } else {
            m113044F(i, i2);
        }
        this.f3264h.updateEditTextBackground();
        this.f3264h.updateLabelState(z);
        this.f3264h.updateTextInputBoxState();
    }

    /* renamed from: e */
    public void m113024e(TextView textView, int i) {
        if (this.f3265i == null && this.f3267k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f3263g);
            this.f3265i = linearLayout;
            linearLayout.setOrientation(0);
            this.f3264h.addView(this.f3265i, -1, -2);
            this.f3267k = new FrameLayout(this.f3263g);
            this.f3265i.addView(this.f3267k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f3264h.getEditText() != null) {
                m113023f();
            }
        }
        if (m113048B(i)) {
            this.f3267k.setVisibility(0);
            this.f3267k.addView(textView);
        } else {
            this.f3265i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3265i.setVisibility(0);
        this.f3266j++;
    }

    /* renamed from: f */
    public void m113023f() {
        if (m113022g()) {
            EditText editText = this.f3264h.getEditText();
            boolean m94022i = NM2.m94022i(this.f3263g);
            LinearLayout linearLayout = this.f3265i;
            int i = C35172Pf4.material_helper_text_font_1_3_padding_horizontal;
            C38790bq6.m62529M0(linearLayout, m113007v(m94022i, i, C38790bq6.m62538I(editText)), m113007v(m94022i, C35172Pf4.material_helper_text_font_1_3_padding_top, this.f3263g.getResources().getDimensionPixelSize(C35172Pf4.material_helper_text_default_padding_top)), m113007v(m94022i, i, C38790bq6.m62540H(editText)), 0);
        }
    }

    /* renamed from: g */
    public final boolean m113022g() {
        return (this.f3265i == null || this.f3264h.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    public void m113021h() {
        Animator animator = this.f3268l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: i */
    public final void m113020i(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        boolean z3;
        if (textView != null && z) {
            boolean z4 = false;
            if (i != i3 && i != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (i3 == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ObjectAnimator m113019j = m113019j(textView, z3);
                if (i == i3 && i2 != 0) {
                    z4 = true;
                }
                if (z4) {
                    m113019j.setStartDelay(this.f3259c);
                }
                list.add(m113019j);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator m113018k = m113018k(textView);
                    m113018k.setStartDelay(this.f3259c);
                    list.add(m113018k);
                }
            }
        }
    }

    /* renamed from: j */
    public final ObjectAnimator m113019j(TextView textView, boolean z) {
        float f;
        int i;
        TimeInterpolator timeInterpolator;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
        if (z) {
            i = this.f3258b;
        } else {
            i = this.f3259c;
        }
        ofFloat.setDuration(i);
        if (z) {
            timeInterpolator = this.f3261e;
        } else {
            timeInterpolator = this.f3262f;
        }
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    /* renamed from: k */
    public final ObjectAnimator m113018k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f3269m, 0.0f);
        ofFloat.setDuration(this.f3257a);
        ofFloat.setInterpolator(this.f3260d);
        return ofFloat;
    }

    /* renamed from: l */
    public boolean m113017l() {
        return m113003z(this.f3271o);
    }

    /* renamed from: m */
    public final TextView m113016m(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f3281y;
        }
        return this.f3274r;
    }

    /* renamed from: n */
    public int m113015n() {
        return this.f3276t;
    }

    /* renamed from: o */
    public CharSequence m113014o() {
        return this.f3275s;
    }

    /* renamed from: p */
    public CharSequence m113013p() {
        return this.f3272p;
    }

    /* renamed from: q */
    public int m113012q() {
        TextView textView = this.f3274r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: r */
    public ColorStateList m113011r() {
        TextView textView = this.f3274r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: s */
    public CharSequence m113010s() {
        return this.f3279w;
    }

    /* renamed from: t */
    public View m113009t() {
        return this.f3281y;
    }

    /* renamed from: u */
    public int m113008u() {
        TextView textView = this.f3281y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: v */
    public final int m113007v(boolean z, int i, int i2) {
        return z ? this.f3263g.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: w */
    public boolean m113006w() {
        return m113049A(this.f3270n);
    }

    /* renamed from: x */
    public void m113005x() {
        this.f3272p = null;
        m113021h();
        if (this.f3270n == 1) {
            if (this.f3280x && !TextUtils.isEmpty(this.f3279w)) {
                this.f3271o = 2;
            } else {
                this.f3271o = 0;
            }
        }
        m113029U(this.f3270n, this.f3271o, m113032R(this.f3274r, ""));
    }

    /* renamed from: y */
    public void m113004y() {
        m113021h();
        int i = this.f3270n;
        if (i == 2) {
            this.f3271o = 0;
        }
        m113029U(i, this.f3271o, m113032R(this.f3281y, ""));
    }

    /* renamed from: z */
    public final boolean m113003z(int i) {
        if (i == 1 && this.f3274r != null && !TextUtils.isEmpty(this.f3272p)) {
            return true;
        }
        return false;
    }
}
