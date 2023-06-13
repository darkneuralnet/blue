package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C17930a;
import kotlin.jvm.internal.LongCompanionObject;
import p000.C7051R1;
/* renamed from: e81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40167e81 extends AbstractC36546Vc1 {

    /* renamed from: s */
    public static final boolean f77988s = true;

    /* renamed from: e */
    public final int f77989e;

    /* renamed from: f */
    public final int f77990f;

    /* renamed from: g */
    public final TimeInterpolator f77991g;

    /* renamed from: h */
    public AutoCompleteTextView f77992h;

    /* renamed from: i */
    public final View.OnClickListener f77993i;

    /* renamed from: j */
    public final View.OnFocusChangeListener f77994j;

    /* renamed from: k */
    public final C7051R1.InterfaceC7053b f77995k;

    /* renamed from: l */
    public boolean f77996l;

    /* renamed from: m */
    public boolean f77997m;

    /* renamed from: n */
    public boolean f77998n;

    /* renamed from: o */
    public long f77999o;

    /* renamed from: p */
    public AccessibilityManager f78000p;

    /* renamed from: q */
    public ValueAnimator f78001q;

    /* renamed from: r */
    public ValueAnimator f78002r;

    /* renamed from: e81$a */
    /* loaded from: classes6.dex */
    public class C19967a extends AnimatorListenerAdapter {
        public C19967a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C40167e81.this.m79662r();
            C40167e81.this.f78002r.start();
        }
    }

    public C40167e81(C17930a c17930a) {
        super(c17930a);
        this.f77993i = new View.OnClickListener() { // from class: X71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C40167e81.this.m43222J(view);
            }
        };
        this.f77994j = new View.OnFocusChangeListener() { // from class: Y71
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C40167e81.this.m43221K(view, z);
            }
        };
        this.f77995k = new C7051R1.InterfaceC7053b() { // from class: Z71
            @Override // p000.C7051R1.InterfaceC7053b
            public final void onTouchExplorationStateChanged(boolean z) {
                C40167e81.this.m43220L(z);
            }
        };
        this.f77999o = LongCompanionObject.MAX_VALUE;
        Context context = c17930a.getContext();
        int i = C49961uf4.motionDurationShort3;
        this.f77990f = C37997aW2.m71261f(context, i, 67);
        this.f77989e = C37997aW2.m71261f(c17930a.getContext(), i, 50);
        this.f77991g = C37997aW2.m71260g(c17930a.getContext(), C49961uf4.motionEasingLinearInterpolator, C27325pf.f103879a);
    }

    /* renamed from: D */
    public static AutoCompleteTextView m43228D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m43224H() {
        boolean isPopupShowing = this.f77992h.isPopupShowing();
        m43217O(isPopupShowing);
        this.f77997m = isPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m43223I(ValueAnimator valueAnimator) {
        this.f39338d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m43222J(View view) {
        m43215Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m43221K(View view, boolean z) {
        this.f77996l = z;
        m79662r();
        if (!z) {
            m43217O(false);
            this.f77997m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m43220L(boolean z) {
        int i;
        AutoCompleteTextView autoCompleteTextView = this.f77992h;
        if (autoCompleteTextView != null && !Q91.m88866a(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = this.f39338d;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            C38790bq6.m62539H0(checkableImageButton, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ boolean m43219M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (m43225G()) {
                this.f77997m = false;
            }
            m43215Q();
            m43214R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m43218N() {
        m43214R();
        m43217O(false);
    }

    /* renamed from: E */
    public final ValueAnimator m43227E(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f77991g);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a81
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C40167e81.this.m43223I(valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: F */
    public final void m43226F() {
        this.f78002r = m43227E(this.f77990f, 0.0f, 1.0f);
        ValueAnimator m43227E = m43227E(this.f77989e, 1.0f, 0.0f);
        this.f78001q = m43227E;
        m43227E.addListener(new C19967a());
    }

    /* renamed from: G */
    public final boolean m43225G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f77999o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: O */
    public final void m43217O(boolean z) {
        if (this.f77998n != z) {
            this.f77998n = z;
            this.f78002r.cancel();
            this.f78001q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: P */
    public final void m43216P() {
        this.f77992h.setOnTouchListener(new View.OnTouchListener() { // from class: c81
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m43219M;
                m43219M = C40167e81.this.m43219M(view, motionEvent);
                return m43219M;
            }
        });
        if (f77988s) {
            this.f77992h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: d81
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C40167e81.this.m43218N();
                }
            });
        }
        this.f77992h.setThreshold(0);
    }

    /* renamed from: Q */
    public final void m43215Q() {
        if (this.f77992h == null) {
            return;
        }
        if (m43225G()) {
            this.f77997m = false;
        }
        if (!this.f77997m) {
            if (f77988s) {
                m43217O(!this.f77998n);
            } else {
                this.f77998n = !this.f77998n;
                m79662r();
            }
            if (this.f77998n) {
                this.f77992h.requestFocus();
                this.f77992h.showDropDown();
                return;
            }
            this.f77992h.dismissDropDown();
            return;
        }
        this.f77997m = false;
    }

    /* renamed from: R */
    public final void m43214R() {
        this.f77997m = true;
        this.f77999o = System.currentTimeMillis();
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: a */
    public void mo43213a(Editable editable) {
        if (this.f78000p.isTouchExplorationEnabled() && Q91.m88866a(this.f77992h) && !this.f39338d.hasFocus()) {
            this.f77992h.dismissDropDown();
        }
        this.f77992h.post(new Runnable() { // from class: b81
            @Override // java.lang.Runnable
            public final void run() {
                C40167e81.this.m43224H();
            }
        });
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: c */
    public int mo43212c() {
        return C40534el4.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: d */
    public int mo43211d() {
        return f77988s ? C52935zg4.mtrl_dropdown_arrow : C52935zg4.mtrl_ic_arrow_drop_down;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: e */
    public View.OnFocusChangeListener mo43210e() {
        return this.f77994j;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: f */
    public View.OnClickListener mo43209f() {
        return this.f77993i;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: h */
    public C7051R1.InterfaceC7053b mo43208h() {
        return this.f77995k;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: i */
    public boolean mo43207i(int i) {
        return i != 0;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: j */
    public boolean mo43206j() {
        return true;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: k */
    public boolean mo43205k() {
        return this.f77996l;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: l */
    public boolean mo43204l() {
        return true;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: m */
    public boolean mo43203m() {
        return this.f77998n;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: n */
    public void mo43202n(EditText editText) {
        this.f77992h = m43228D(editText);
        m43216P();
        this.f39335a.setErrorIconDrawable((Drawable) null);
        if (!Q91.m88866a(editText) && this.f78000p.isTouchExplorationEnabled()) {
            C38790bq6.m62539H0(this.f39338d, 2);
        }
        this.f39335a.setEndIconVisible(true);
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: o */
    public void mo43201o(View view, C27125p2 c27125p2) {
        if (!Q91.m88866a(this.f77992h)) {
            c27125p2.m20080f0(Spinner.class.getName());
        }
        if (c27125p2.m20109P()) {
            c27125p2.m20054s0(null);
        }
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: p */
    public void mo43200p(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f78000p.isEnabled() && !Q91.m88866a(this.f77992h)) {
            m43215Q();
            m43214R();
        }
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: s */
    public void mo25864s() {
        m43226F();
        this.f78000p = (AccessibilityManager) this.f39337c.getSystemService("accessibility");
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: t */
    public boolean mo43199t() {
        return true;
    }

    @Override // p000.AbstractC36546Vc1
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: u */
    public void mo43198u() {
        AutoCompleteTextView autoCompleteTextView = this.f77992h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f77988s) {
                this.f77992h.setOnDismissListener(null);
            }
        }
    }
}
