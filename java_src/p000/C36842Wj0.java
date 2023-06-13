package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.C17930a;
/* renamed from: Wj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36842Wj0 extends AbstractC36546Vc1 {

    /* renamed from: e */
    public final int f41568e;

    /* renamed from: f */
    public final int f41569f;

    /* renamed from: g */
    public final TimeInterpolator f41570g;

    /* renamed from: h */
    public final TimeInterpolator f41571h;

    /* renamed from: i */
    public EditText f41572i;

    /* renamed from: j */
    public final View.OnClickListener f41573j;

    /* renamed from: k */
    public final View.OnFocusChangeListener f41574k;

    /* renamed from: l */
    public AnimatorSet f41575l;

    /* renamed from: m */
    public ValueAnimator f41576m;

    /* renamed from: Wj0$a */
    /* loaded from: classes6.dex */
    public class C9158a extends AnimatorListenerAdapter {
        public C9158a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C36842Wj0.this.f39336b.m48632e0(true);
        }
    }

    /* renamed from: Wj0$b */
    /* loaded from: classes6.dex */
    public class C9159b extends AnimatorListenerAdapter {
        public C9159b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C36842Wj0.this.f39336b.m48632e0(false);
        }
    }

    public C36842Wj0(C17930a c17930a) {
        super(c17930a);
        this.f41573j = new View.OnClickListener() { // from class: Uj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C36842Wj0.this.m77944G(view);
            }
        };
        this.f41574k = new View.OnFocusChangeListener() { // from class: Vj0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C36842Wj0.this.m77943H(view, z);
            }
        };
        Context context = c17930a.getContext();
        int i = C49961uf4.motionDurationShort3;
        this.f41568e = C37997aW2.m71261f(context, i, 100);
        this.f41569f = C37997aW2.m71261f(c17930a.getContext(), i, 150);
        this.f41570g = C37997aW2.m71260g(c17930a.getContext(), C49961uf4.motionEasingLinearInterpolator, C27325pf.f103879a);
        this.f41571h = C37997aW2.m71260g(c17930a.getContext(), C49961uf4.motionEasingEmphasizedInterpolator, C27325pf.f103882d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m77946E(ValueAnimator valueAnimator) {
        this.f39338d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m77945F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f39338d.setScaleX(floatValue);
        this.f39338d.setScaleY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m77944G(View view) {
        EditText editText = this.f41572i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        m79662r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m77943H(View view, boolean z) {
        m77950A(m77941J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m77942I() {
        m77950A(true);
    }

    /* renamed from: A */
    public final void m77950A(boolean z) {
        boolean z2;
        if (this.f39336b.m48660H() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f41575l.isRunning()) {
            this.f41576m.cancel();
            this.f41575l.start();
            if (z2) {
                this.f41575l.end();
            }
        } else if (!z) {
            this.f41575l.cancel();
            this.f41576m.start();
            if (z2) {
                this.f41576m.end();
            }
        }
    }

    /* renamed from: B */
    public final ValueAnimator m77949B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f41570g);
        ofFloat.setDuration(this.f41568e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Tj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C36842Wj0.this.m77946E(valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: C */
    public final ValueAnimator m77948C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f41571h);
        ofFloat.setDuration(this.f41569f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Sj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C36842Wj0.this.m77945F(valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: D */
    public final void m77947D() {
        ValueAnimator m77948C = m77948C();
        ValueAnimator m77949B = m77949B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41575l = animatorSet;
        animatorSet.playTogether(m77948C, m77949B);
        this.f41575l.addListener(new C9158a());
        ValueAnimator m77949B2 = m77949B(1.0f, 0.0f);
        this.f41576m = m77949B2;
        m77949B2.addListener(new C9159b());
    }

    /* renamed from: J */
    public final boolean m77941J() {
        EditText editText = this.f41572i;
        if (editText != null && ((editText.hasFocus() || this.f39338d.hasFocus()) && this.f41572i.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: a */
    public void mo43213a(Editable editable) {
        if (this.f39336b.m48593y() != null) {
            return;
        }
        m77950A(m77941J());
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: c */
    public int mo43212c() {
        return C40534el4.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: d */
    public int mo43211d() {
        return C52935zg4.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: e */
    public View.OnFocusChangeListener mo43210e() {
        return this.f41574k;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: f */
    public View.OnClickListener mo43209f() {
        return this.f41573j;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: g */
    public View.OnFocusChangeListener mo77940g() {
        return this.f41574k;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: n */
    public void mo43202n(EditText editText) {
        this.f41572i = editText;
        this.f39335a.setEndIconVisible(m77941J());
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: q */
    public void mo77939q(boolean z) {
        if (this.f39336b.m48593y() == null) {
            return;
        }
        m77950A(z);
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: s */
    public void mo25864s() {
        m77947D();
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: u */
    public void mo43198u() {
        EditText editText = this.f41572i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: Rj0
                @Override // java.lang.Runnable
                public final void run() {
                    C36842Wj0.this.m77942I();
                }
            });
        }
    }
}
