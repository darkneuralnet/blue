package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class Slide extends Visibility {

    /* renamed from: T */
    public static final TimeInterpolator f55891T = new DecelerateInterpolator();

    /* renamed from: U */
    public static final TimeInterpolator f55892U = new AccelerateInterpolator();

    /* renamed from: W */
    public static final InterfaceC12035g f55893W = new C12029a();

    /* renamed from: X */
    public static final InterfaceC12035g f55894X = new C12030b();

    /* renamed from: Y */
    public static final InterfaceC12035g f55895Y = new C12031c();

    /* renamed from: Z */
    public static final InterfaceC12035g f55896Z = new C12032d();

    /* renamed from: p0 */
    public static final InterfaceC12035g f55897p0 = new C12033e();

    /* renamed from: q0 */
    public static final InterfaceC12035g f55898q0 = new C12034f();

    /* renamed from: R */
    public InterfaceC12035g f55899R;

    /* renamed from: S */
    public int f55900S;

    /* renamed from: androidx.transition.Slide$a */
    /* loaded from: classes.dex */
    public static class C12029a extends AbstractC12036h {
        public C12029a() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC12035g
        /* renamed from: b */
        public float mo65909b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    /* loaded from: classes.dex */
    public static class C12030b extends AbstractC12036h {
        public C12030b() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC12035g
        /* renamed from: b */
        public float mo65909b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C38790bq6.m62548D(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    /* loaded from: classes.dex */
    public static class C12031c extends AbstractC12037i {
        public C12031c() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC12035g
        /* renamed from: a */
        public float mo65910a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    /* loaded from: classes.dex */
    public static class C12032d extends AbstractC12036h {
        public C12032d() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC12035g
        /* renamed from: b */
        public float mo65909b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    /* loaded from: classes.dex */
    public static class C12033e extends AbstractC12036h {
        public C12033e() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC12035g
        /* renamed from: b */
        public float mo65909b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C38790bq6.m62548D(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    /* loaded from: classes.dex */
    public static class C12034f extends AbstractC12037i {
        public C12034f() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC12035g
        /* renamed from: a */
        public float mo65910a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    /* loaded from: classes.dex */
    public interface InterfaceC12035g {
        /* renamed from: a */
        float mo65910a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo65909b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC12036h implements InterfaceC12035g {
        private AbstractC12036h() {
        }

        @Override // androidx.transition.Slide.InterfaceC12035g
        /* renamed from: a */
        public float mo65910a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ AbstractC12036h(C12029a c12029a) {
            this();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC12037i implements InterfaceC12035g {
        private AbstractC12037i() {
        }

        @Override // androidx.transition.Slide.InterfaceC12035g
        /* renamed from: b */
        public float mo65909b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ AbstractC12037i(C12029a c12029a) {
            this();
        }
    }

    public Slide() {
        this.f55899R = f55898q0;
        this.f55900S = 80;
        m65911K0(80);
    }

    /* renamed from: A0 */
    private void m65912A0(N96 n96) {
        int[] iArr = new int[2];
        n96.f24200b.getLocationOnScreen(iArr);
        n96.f24199a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: G0 */
    public Animator mo65833G0(ViewGroup viewGroup, View view, N96 n96, N96 n962) {
        if (n962 == null) {
            return null;
        }
        int[] iArr = (int[]) n962.f24199a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C12060e.m65792a(view, n962, iArr[0], iArr[1], this.f55899R.mo65909b(viewGroup, view), this.f55899R.mo65910a(viewGroup, view), translationX, translationY, f55891T, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: I0 */
    public Animator mo65831I0(ViewGroup viewGroup, View view, N96 n96, N96 n962) {
        if (n96 == null) {
            return null;
        }
        int[] iArr = (int[]) n96.f24199a.get("android:slide:screenPosition");
        return C12060e.m65792a(view, n96, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f55899R.mo65909b(viewGroup, view), this.f55899R.mo65910a(viewGroup, view), f55892U, this);
    }

    /* renamed from: K0 */
    public void m65911K0(int i) {
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                this.f55899R = f55897p0;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.f55899R = f55894X;
                        }
                    } else {
                        this.f55899R = f55898q0;
                    }
                } else {
                    this.f55899R = f55895Y;
                }
            } else {
                this.f55899R = f55896Z;
            }
        } else {
            this.f55899R = f55893W;
        }
        this.f55900S = i;
        AA5 aa5 = new AA5();
        aa5.m116036j(i);
        mo65842v0(aa5);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        super.mo65827k(n96);
        m65912A0(n96);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        super.mo65826n(n96);
        m65912A0(n96);
    }

    public Slide(int i) {
        this.f55899R = f55898q0;
        this.f55900S = 80;
        m65911K0(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55899R = f55898q0;
        this.f55900S = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33754h);
        int m103669g = C33266Hb6.m103669g(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        m65911K0(m103669g);
    }
}
