package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.C7051R1;
@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes6.dex */
public class C17930a extends LinearLayout {

    /* renamed from: b */
    public final TextInputLayout f73560b;

    /* renamed from: c */
    public final FrameLayout f73561c;

    /* renamed from: d */
    public final CheckableImageButton f73562d;

    /* renamed from: e */
    public ColorStateList f73563e;

    /* renamed from: f */
    public PorterDuff.Mode f73564f;

    /* renamed from: g */
    public View.OnLongClickListener f73565g;

    /* renamed from: h */
    public final CheckableImageButton f73566h;

    /* renamed from: i */
    public final C17934d f73567i;

    /* renamed from: j */
    public int f73568j;

    /* renamed from: k */
    public final LinkedHashSet<TextInputLayout.InterfaceC17929h> f73569k;

    /* renamed from: l */
    public ColorStateList f73570l;

    /* renamed from: m */
    public PorterDuff.Mode f73571m;

    /* renamed from: n */
    public int f73572n;

    /* renamed from: o */
    public ImageView.ScaleType f73573o;

    /* renamed from: p */
    public View.OnLongClickListener f73574p;

    /* renamed from: q */
    public CharSequence f73575q;

    /* renamed from: r */
    public final TextView f73576r;

    /* renamed from: s */
    public boolean f73577s;

    /* renamed from: t */
    public EditText f73578t;

    /* renamed from: u */
    public final AccessibilityManager f73579u;

    /* renamed from: v */
    public C7051R1.InterfaceC7053b f73580v;

    /* renamed from: w */
    public final TextWatcher f73581w;

    /* renamed from: x */
    public final TextInputLayout.InterfaceC17928g f73582x;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes6.dex */
    public class C17931a extends C38326b36 {
        public C17931a() {
        }

        @Override // p000.C38326b36, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C17930a.this.m48613o().mo43213a(editable);
        }

        @Override // p000.C38326b36, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C17930a.this.m48613o().mo79663b(charSequence, i, i2, i3);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes6.dex */
    public class C17932b implements TextInputLayout.InterfaceC17928g {
        public C17932b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC17928g
        /* renamed from: a */
        public void mo48589a(TextInputLayout textInputLayout) {
            if (C17930a.this.f73578t == textInputLayout.getEditText()) {
                return;
            }
            if (C17930a.this.f73578t != null) {
                C17930a.this.f73578t.removeTextChangedListener(C17930a.this.f73581w);
                if (C17930a.this.f73578t.getOnFocusChangeListener() == C17930a.this.m48613o().mo43210e()) {
                    C17930a.this.f73578t.setOnFocusChangeListener(null);
                }
            }
            C17930a.this.f73578t = textInputLayout.getEditText();
            if (C17930a.this.f73578t != null) {
                C17930a.this.f73578t.addTextChangedListener(C17930a.this.f73581w);
            }
            C17930a.this.m48613o().mo43202n(C17930a.this.f73578t);
            C17930a c17930a = C17930a.this;
            c17930a.m48618l0(c17930a.m48613o());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes6.dex */
    public class View$OnAttachStateChangeListenerC17933c implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC17933c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C17930a.this.m48627h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C17930a.this.m48651Q();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes6.dex */
    public static class C17934d {

        /* renamed from: a */
        public final SparseArray<AbstractC36546Vc1> f73586a = new SparseArray<>();

        /* renamed from: b */
        public final C17930a f73587b;

        /* renamed from: c */
        public final int f73588c;

        /* renamed from: d */
        public final int f73589d;

        public C17934d(C17930a c17930a, Z46 z46) {
            this.f73587b = c17930a;
            this.f73588c = z46.m73755n(C37098Xl4.TextInputLayout_endIconDrawable, 0);
            this.f73589d = z46.m73755n(C37098Xl4.TextInputLayout_passwordToggleDrawable, 0);
        }

        /* renamed from: b */
        public final AbstractC36546Vc1 m48587b(int i) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return new C40167e81(this.f73587b);
                            }
                            throw new IllegalArgumentException("Invalid end icon mode: " + i);
                        }
                        return new C36842Wj0(this.f73587b);
                    }
                    return new NI3(this.f73587b, this.f73589d);
                }
                return new C45506n83(this.f73587b);
            }
            return new C44975mF0(this.f73587b);
        }

        /* renamed from: c */
        public AbstractC36546Vc1 m48586c(int i) {
            AbstractC36546Vc1 abstractC36546Vc1 = this.f73586a.get(i);
            if (abstractC36546Vc1 == null) {
                AbstractC36546Vc1 m48587b = m48587b(i);
                this.f73586a.append(i, m48587b);
                return m48587b;
            }
            return abstractC36546Vc1;
        }
    }

    public C17930a(TextInputLayout textInputLayout, Z46 z46) {
        super(textInputLayout.getContext());
        this.f73568j = 0;
        this.f73569k = new LinkedHashSet<>();
        this.f73581w = new C17931a();
        C17932b c17932b = new C17932b();
        this.f73582x = c17932b;
        this.f73579u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f73560b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f73561c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m48621k = m48621k(this, from, C33795Ji4.text_input_error_icon);
        this.f73562d = m48621k;
        CheckableImageButton m48621k2 = m48621k(frameLayout, from, C33795Ji4.text_input_end_icon);
        this.f73566h = m48621k2;
        this.f73567i = new C17934d(this, z46);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f73576r = appCompatTextView;
        m48665D(z46);
        m48667C(z46);
        m48663E(z46);
        frameLayout.addView(m48621k2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(m48621k);
        textInputLayout.addOnEditTextAttachedListener(c17932b);
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC17933c());
    }

    /* renamed from: A */
    public TextView m48671A() {
        return this.f73576r;
    }

    /* renamed from: A0 */
    public final void m48670A0() {
        int i;
        boolean z;
        boolean z2;
        FrameLayout frameLayout = this.f73561c;
        int i2 = 8;
        if (this.f73566h.getVisibility() == 0 && !m48659I()) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (this.f73575q != null && !this.f73577s) {
            z = false;
        } else {
            z = true;
        }
        if (!m48660H() && !m48659I() && z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    /* renamed from: B */
    public boolean m48669B() {
        return this.f73568j != 0;
    }

    /* renamed from: B0 */
    public final void m48668B0() {
        boolean z;
        int i = 0;
        if (m48601u() != null && this.f73560b.isErrorEnabled() && this.f73560b.shouldShowError()) {
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton checkableImageButton = this.f73562d;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        m48670A0();
        m48666C0();
        if (!m48669B()) {
            this.f73560b.updateDummyDrawables();
        }
    }

    /* renamed from: C */
    public final void m48667C(Z46 z46) {
        int i = C37098Xl4.TextInputLayout_passwordToggleEnabled;
        if (!z46.m73750s(i)) {
            int i2 = C37098Xl4.TextInputLayout_endIconTint;
            if (z46.m73750s(i2)) {
                this.f73570l = NM2.m94030a(getContext(), z46, i2);
            }
            int i3 = C37098Xl4.TextInputLayout_endIconTintMode;
            if (z46.m73750s(i3)) {
                this.f73571m = C36704Vt6.m79293o(z46.m73758k(i3, -1), null);
            }
        }
        int i4 = C37098Xl4.TextInputLayout_endIconMode;
        if (z46.m73750s(i4)) {
            m48643Y(z46.m73758k(i4, 0));
            int i5 = C37098Xl4.TextInputLayout_endIconContentDescription;
            if (z46.m73750s(i5)) {
                m48647U(z46.m73753p(i5));
            }
            m48649S(z46.m73768a(C37098Xl4.TextInputLayout_endIconCheckable, true));
        } else if (z46.m73750s(i)) {
            int i6 = C37098Xl4.TextInputLayout_passwordToggleTint;
            if (z46.m73750s(i6)) {
                this.f73570l = NM2.m94030a(getContext(), z46, i6);
            }
            int i7 = C37098Xl4.TextInputLayout_passwordToggleTintMode;
            if (z46.m73750s(i7)) {
                this.f73571m = C36704Vt6.m79293o(z46.m73758k(i7, -1), null);
            }
            m48643Y(z46.m73768a(i, false) ? 1 : 0);
            m48647U(z46.m73753p(C37098Xl4.TextInputLayout_passwordToggleContentDescription));
        }
        m48644X(z46.m73763f(C37098Xl4.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(C35172Pf4.mtrl_min_touch_target_size)));
        int i8 = C37098Xl4.TextInputLayout_endIconScaleType;
        if (z46.m73750s(i8)) {
            m48638b0(CP1.m112262b(z46.m73758k(i8, -1)));
        }
    }

    /* renamed from: C0 */
    public void m48666C0() {
        int i;
        if (this.f73560b.editText == null) {
            return;
        }
        if (!m48660H() && !m48659I()) {
            i = C38790bq6.m62540H(this.f73560b.editText);
        } else {
            i = 0;
        }
        C38790bq6.m62529M0(this.f73576r, getContext().getResources().getDimensionPixelSize(C35172Pf4.material_input_text_to_prefix_suffix_padding), this.f73560b.editText.getPaddingTop(), i, this.f73560b.editText.getPaddingBottom());
    }

    /* renamed from: D */
    public final void m48665D(Z46 z46) {
        int i = C37098Xl4.TextInputLayout_errorIconTint;
        if (z46.m73750s(i)) {
            this.f73563e = NM2.m94030a(getContext(), z46, i);
        }
        int i2 = C37098Xl4.TextInputLayout_errorIconTintMode;
        if (z46.m73750s(i2)) {
            this.f73564f = C36704Vt6.m79293o(z46.m73758k(i2, -1), null);
        }
        int i3 = C37098Xl4.TextInputLayout_errorIconDrawable;
        if (z46.m73750s(i3)) {
            m48628g0(z46.m73762g(i3));
        }
        this.f73562d.setContentDescription(getResources().getText(C40534el4.error_icon_content_description));
        C38790bq6.m62539H0(this.f73562d, 2);
        this.f73562d.setClickable(false);
        this.f73562d.setPressable(false);
        this.f73562d.setFocusable(false);
    }

    /* renamed from: D0 */
    public final void m48664D0() {
        int i;
        int visibility = this.f73576r.getVisibility();
        boolean z = false;
        if (this.f73575q != null && !this.f73577s) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            AbstractC36546Vc1 m48613o = m48613o();
            if (i == 0) {
                z = true;
            }
            m48613o.mo77939q(z);
        }
        m48670A0();
        this.f73576r.setVisibility(i);
        this.f73560b.updateDummyDrawables();
    }

    /* renamed from: E */
    public final void m48663E(Z46 z46) {
        this.f73576r.setVisibility(8);
        this.f73576r.setId(C33795Ji4.textinput_suffix_text);
        this.f73576r.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C38790bq6.m62448x0(this.f73576r, 1);
        m48600u0(z46.m73755n(C37098Xl4.TextInputLayout_suffixTextAppearance, 0));
        int i = C37098Xl4.TextInputLayout_suffixTextColor;
        if (z46.m73750s(i)) {
            m48598v0(z46.m73766c(i));
        }
        m48602t0(z46.m73753p(C37098Xl4.TextInputLayout_suffixText));
    }

    /* renamed from: F */
    public boolean m48662F() {
        return this.f73566h.m49421a();
    }

    /* renamed from: G */
    public boolean m48661G() {
        return m48669B() && this.f73566h.isChecked();
    }

    /* renamed from: H */
    public boolean m48660H() {
        return this.f73561c.getVisibility() == 0 && this.f73566h.getVisibility() == 0;
    }

    /* renamed from: I */
    public boolean m48659I() {
        return this.f73562d.getVisibility() == 0;
    }

    /* renamed from: J */
    public boolean m48658J() {
        return this.f73568j == 1;
    }

    /* renamed from: K */
    public void m48657K(boolean z) {
        this.f73577s = z;
        m48664D0();
    }

    /* renamed from: L */
    public void m48656L() {
        m48668B0();
        m48654N();
        m48655M();
        if (m48613o().mo43199t()) {
            m48592y0(this.f73560b.shouldShowError());
        }
    }

    /* renamed from: M */
    public void m48655M() {
        CP1.m112260d(this.f73560b, this.f73566h, this.f73570l);
    }

    /* renamed from: N */
    public void m48654N() {
        CP1.m112260d(this.f73560b, this.f73562d, this.f73563e);
    }

    /* renamed from: O */
    public void m48653O(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        AbstractC36546Vc1 m48613o = m48613o();
        boolean z3 = true;
        if (m48613o.mo43204l() && (isChecked = this.f73566h.isChecked()) != m48613o.mo43203m()) {
            this.f73566h.setChecked(!isChecked);
            z2 = true;
        } else {
            z2 = false;
        }
        if (m48613o.mo43206j() && (isActivated = this.f73566h.isActivated()) != m48613o.mo43205k()) {
            m48650R(!isActivated);
        } else {
            z3 = z2;
        }
        if (z || z3) {
            m48655M();
        }
    }

    /* renamed from: P */
    public void m48652P(TextInputLayout.InterfaceC17929h interfaceC17929h) {
        this.f73569k.remove(interfaceC17929h);
    }

    /* renamed from: Q */
    public final void m48651Q() {
        AccessibilityManager accessibilityManager;
        C7051R1.InterfaceC7053b interfaceC7053b = this.f73580v;
        if (interfaceC7053b != null && (accessibilityManager = this.f73579u) != null) {
            C7051R1.m87424b(accessibilityManager, interfaceC7053b);
        }
    }

    /* renamed from: R */
    public void m48650R(boolean z) {
        this.f73566h.setActivated(z);
    }

    /* renamed from: S */
    public void m48649S(boolean z) {
        this.f73566h.setCheckable(z);
    }

    /* renamed from: T */
    public void m48648T(int i) {
        m48647U(i != 0 ? getResources().getText(i) : null);
    }

    /* renamed from: U */
    public void m48647U(CharSequence charSequence) {
        if (m48615n() != charSequence) {
            this.f73566h.setContentDescription(charSequence);
        }
    }

    /* renamed from: V */
    public void m48646V(int i) {
        m48645W(i != 0 ? C29611vi.m8248b(getContext(), i) : null);
    }

    /* renamed from: W */
    public void m48645W(Drawable drawable) {
        this.f73566h.setImageDrawable(drawable);
        if (drawable != null) {
            CP1.m112263a(this.f73560b, this.f73566h, this.f73570l, this.f73571m);
            m48655M();
        }
    }

    /* renamed from: X */
    public void m48644X(int i) {
        if (i >= 0) {
            if (i != this.f73572n) {
                this.f73572n = i;
                CP1.m112257g(this.f73566h, i);
                CP1.m112257g(this.f73562d, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    /* renamed from: Y */
    public void m48643Y(int i) {
        boolean z;
        if (this.f73568j == i) {
            return;
        }
        m48594x0(m48613o());
        int i2 = this.f73568j;
        this.f73568j = i;
        m48619l(i2);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        m48632e0(z);
        AbstractC36546Vc1 m48613o = m48613o();
        m48646V(m48599v(m48613o));
        m48648T(m48613o.mo43212c());
        m48649S(m48613o.mo43204l());
        if (m48613o.mo43207i(this.f73560b.getBoxBackgroundMode())) {
            m48596w0(m48613o);
            m48642Z(m48613o.mo43209f());
            EditText editText = this.f73578t;
            if (editText != null) {
                m48613o.mo43202n(editText);
                m48618l0(m48613o);
            }
            CP1.m112263a(this.f73560b, this.f73566h, this.f73570l, this.f73571m);
            m48653O(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f73560b.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
    }

    /* renamed from: Z */
    public void m48642Z(View.OnClickListener onClickListener) {
        CP1.m112256h(this.f73566h, onClickListener, this.f73574p);
    }

    /* renamed from: a0 */
    public void m48640a0(View.OnLongClickListener onLongClickListener) {
        this.f73574p = onLongClickListener;
        CP1.m112255i(this.f73566h, onLongClickListener);
    }

    /* renamed from: b0 */
    public void m48638b0(ImageView.ScaleType scaleType) {
        this.f73573o = scaleType;
        CP1.m112254j(this.f73566h, scaleType);
        CP1.m112254j(this.f73562d, scaleType);
    }

    /* renamed from: c0 */
    public void m48636c0(ColorStateList colorStateList) {
        if (this.f73570l != colorStateList) {
            this.f73570l = colorStateList;
            CP1.m112263a(this.f73560b, this.f73566h, colorStateList, this.f73571m);
        }
    }

    /* renamed from: d0 */
    public void m48634d0(PorterDuff.Mode mode) {
        if (this.f73571m != mode) {
            this.f73571m = mode;
            CP1.m112263a(this.f73560b, this.f73566h, this.f73570l, mode);
        }
    }

    /* renamed from: e0 */
    public void m48632e0(boolean z) {
        int i;
        if (m48660H() != z) {
            CheckableImageButton checkableImageButton = this.f73566h;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m48670A0();
            m48666C0();
            this.f73560b.updateDummyDrawables();
        }
    }

    /* renamed from: f0 */
    public void m48630f0(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C29611vi.m8248b(getContext(), i);
        } else {
            drawable = null;
        }
        m48628g0(drawable);
        m48654N();
    }

    /* renamed from: g */
    public void m48629g(TextInputLayout.InterfaceC17929h interfaceC17929h) {
        this.f73569k.add(interfaceC17929h);
    }

    /* renamed from: g0 */
    public void m48628g0(Drawable drawable) {
        this.f73562d.setImageDrawable(drawable);
        m48668B0();
        CP1.m112263a(this.f73560b, this.f73562d, this.f73563e, this.f73564f);
    }

    /* renamed from: h */
    public final void m48627h() {
        if (this.f73580v != null && this.f73579u != null && C38790bq6.m62506Y(this)) {
            C7051R1.m87425a(this.f73579u, this.f73580v);
        }
    }

    /* renamed from: h0 */
    public void m48626h0(View.OnClickListener onClickListener) {
        CP1.m112256h(this.f73562d, onClickListener, this.f73565g);
    }

    /* renamed from: i */
    public void m48625i() {
        this.f73566h.performClick();
        this.f73566h.jumpDrawablesToCurrentState();
    }

    /* renamed from: i0 */
    public void m48624i0(View.OnLongClickListener onLongClickListener) {
        this.f73565g = onLongClickListener;
        CP1.m112255i(this.f73562d, onLongClickListener);
    }

    /* renamed from: j */
    public void m48623j() {
        this.f73569k.clear();
    }

    /* renamed from: j0 */
    public void m48622j0(ColorStateList colorStateList) {
        if (this.f73563e != colorStateList) {
            this.f73563e = colorStateList;
            CP1.m112263a(this.f73560b, this.f73562d, colorStateList, this.f73564f);
        }
    }

    /* renamed from: k */
    public final CheckableImageButton m48621k(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C50603vk4.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        CP1.m112259e(checkableImageButton);
        if (NM2.m94022i(getContext())) {
            C39093cM2.m61540d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: k0 */
    public void m48620k0(PorterDuff.Mode mode) {
        if (this.f73564f != mode) {
            this.f73564f = mode;
            CP1.m112263a(this.f73560b, this.f73562d, this.f73563e, mode);
        }
    }

    /* renamed from: l */
    public final void m48619l(int i) {
        Iterator<TextInputLayout.InterfaceC17929h> it = this.f73569k.iterator();
        while (it.hasNext()) {
            it.next().m48672a(this.f73560b, i);
        }
    }

    /* renamed from: l0 */
    public final void m48618l0(AbstractC36546Vc1 abstractC36546Vc1) {
        if (this.f73578t == null) {
            return;
        }
        if (abstractC36546Vc1.mo43210e() != null) {
            this.f73578t.setOnFocusChangeListener(abstractC36546Vc1.mo43210e());
        }
        if (abstractC36546Vc1.mo77940g() != null) {
            this.f73566h.setOnFocusChangeListener(abstractC36546Vc1.mo77940g());
        }
    }

    /* renamed from: m */
    public CheckableImageButton m48617m() {
        if (m48659I()) {
            return this.f73562d;
        }
        if (m48669B() && m48660H()) {
            return this.f73566h;
        }
        return null;
    }

    /* renamed from: m0 */
    public void m48616m0(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        m48614n0(charSequence);
    }

    /* renamed from: n */
    public CharSequence m48615n() {
        return this.f73566h.getContentDescription();
    }

    /* renamed from: n0 */
    public void m48614n0(CharSequence charSequence) {
        this.f73566h.setContentDescription(charSequence);
    }

    /* renamed from: o */
    public AbstractC36546Vc1 m48613o() {
        return this.f73567i.m48586c(this.f73568j);
    }

    /* renamed from: o0 */
    public void m48612o0(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C29611vi.m8248b(getContext(), i);
        } else {
            drawable = null;
        }
        m48610p0(drawable);
    }

    /* renamed from: p */
    public Drawable m48611p() {
        return this.f73566h.getDrawable();
    }

    /* renamed from: p0 */
    public void m48610p0(Drawable drawable) {
        this.f73566h.setImageDrawable(drawable);
    }

    /* renamed from: q */
    public int m48609q() {
        return this.f73572n;
    }

    /* renamed from: q0 */
    public void m48608q0(boolean z) {
        if (z && this.f73568j != 1) {
            m48643Y(1);
        } else if (!z) {
            m48643Y(0);
        }
    }

    /* renamed from: r */
    public int m48607r() {
        return this.f73568j;
    }

    /* renamed from: r0 */
    public void m48606r0(ColorStateList colorStateList) {
        this.f73570l = colorStateList;
        CP1.m112263a(this.f73560b, this.f73566h, colorStateList, this.f73571m);
    }

    /* renamed from: s */
    public ImageView.ScaleType m48605s() {
        return this.f73573o;
    }

    /* renamed from: s0 */
    public void m48604s0(PorterDuff.Mode mode) {
        this.f73571m = mode;
        CP1.m112263a(this.f73560b, this.f73566h, this.f73570l, mode);
    }

    /* renamed from: t */
    public CheckableImageButton m48603t() {
        return this.f73566h;
    }

    /* renamed from: t0 */
    public void m48602t0(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f73575q = charSequence2;
        this.f73576r.setText(charSequence);
        m48664D0();
    }

    /* renamed from: u */
    public Drawable m48601u() {
        return this.f73562d.getDrawable();
    }

    /* renamed from: u0 */
    public void m48600u0(int i) {
        Q26.m89061o(this.f73576r, i);
    }

    /* renamed from: v */
    public final int m48599v(AbstractC36546Vc1 abstractC36546Vc1) {
        int i = this.f73567i.f73588c;
        if (i == 0) {
            return abstractC36546Vc1.mo43211d();
        }
        return i;
    }

    /* renamed from: v0 */
    public void m48598v0(ColorStateList colorStateList) {
        this.f73576r.setTextColor(colorStateList);
    }

    /* renamed from: w */
    public CharSequence m48597w() {
        return this.f73566h.getContentDescription();
    }

    /* renamed from: w0 */
    public final void m48596w0(AbstractC36546Vc1 abstractC36546Vc1) {
        abstractC36546Vc1.mo25864s();
        this.f73580v = abstractC36546Vc1.mo43208h();
        m48627h();
    }

    /* renamed from: x */
    public Drawable m48595x() {
        return this.f73566h.getDrawable();
    }

    /* renamed from: x0 */
    public final void m48594x0(AbstractC36546Vc1 abstractC36546Vc1) {
        m48651Q();
        this.f73580v = null;
        abstractC36546Vc1.mo43198u();
    }

    /* renamed from: y */
    public CharSequence m48593y() {
        return this.f73575q;
    }

    /* renamed from: y0 */
    public final void m48592y0(boolean z) {
        if (z && m48611p() != null) {
            Drawable mutate = P61.m90834r(m48611p()).mutate();
            P61.m90838n(mutate, this.f73560b.getErrorCurrentTextColors());
            this.f73566h.setImageDrawable(mutate);
            return;
        }
        CP1.m112263a(this.f73560b, this.f73566h, this.f73570l, this.f73571m);
    }

    /* renamed from: z */
    public ColorStateList m48591z() {
        return this.f73576r.getTextColors();
    }

    /* renamed from: z0 */
    public void m48590z0(boolean z) {
        if (this.f73568j == 1) {
            this.f73566h.performClick();
            if (z) {
                this.f73566h.jumpDrawablesToCurrentState();
            }
        }
    }
}
