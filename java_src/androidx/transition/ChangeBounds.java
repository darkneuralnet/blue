package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
/* loaded from: classes.dex */
public class ChangeBounds extends Transition {

    /* renamed from: S */
    public static final String[] f55806S = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: T */
    public static final Property<Drawable, PointF> f55807T = new C12007b(PointF.class, "boundsOrigin");

    /* renamed from: U */
    public static final Property<C12016k, PointF> f55808U = new C12008c(PointF.class, "topLeft");

    /* renamed from: W */
    public static final Property<C12016k, PointF> f55809W = new C12009d(PointF.class, "bottomRight");

    /* renamed from: X */
    public static final Property<View, PointF> f55810X = new C12010e(PointF.class, "bottomRight");

    /* renamed from: Y */
    public static final Property<View, PointF> f55811Y = new C12011f(PointF.class, "topLeft");

    /* renamed from: Z */
    public static final Property<View, PointF> f55812Z = new C12012g(PointF.class, "position");

    /* renamed from: p0 */
    public static C35523Qs4 f55813p0 = new C35523Qs4();

    /* renamed from: P */
    public int[] f55814P;

    /* renamed from: Q */
    public boolean f55815Q;

    /* renamed from: R */
    public boolean f55816R;

    /* renamed from: androidx.transition.ChangeBounds$a */
    /* loaded from: classes.dex */
    public class C12006a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f55817a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f55818b;

        /* renamed from: c */
        public final /* synthetic */ View f55819c;

        /* renamed from: d */
        public final /* synthetic */ float f55820d;

        public C12006a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f55817a = viewGroup;
            this.f55818b = bitmapDrawable;
            this.f55819c = view;
            this.f55820d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C37172Xt6.m76170b(this.f55817a).mo194a(this.f55818b);
            C37172Xt6.m76164h(this.f55819c, this.f55820d);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    /* loaded from: classes.dex */
    public static class C12007b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f55822a;

        public C12007b(Class cls, String str) {
            super(cls, str);
            this.f55822a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f55822a);
            Rect rect = this.f55822a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f55822a);
            this.f55822a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f55822a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    /* loaded from: classes.dex */
    public static class C12008c extends Property<C12016k, PointF> {
        public C12008c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C12016k c12016k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C12016k c12016k, PointF pointF) {
            c12016k.m65949c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    /* loaded from: classes.dex */
    public static class C12009d extends Property<C12016k, PointF> {
        public C12009d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C12016k c12016k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C12016k c12016k, PointF pointF) {
            c12016k.m65951a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    /* loaded from: classes.dex */
    public static class C12010e extends Property<View, PointF> {
        public C12010e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C37172Xt6.m76165g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    /* loaded from: classes.dex */
    public static class C12011f extends Property<View, PointF> {
        public C12011f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C37172Xt6.m76165g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    /* loaded from: classes.dex */
    public static class C12012g extends Property<View, PointF> {
        public C12012g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C37172Xt6.m76165g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    /* loaded from: classes.dex */
    public class C12013h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C12016k f55823a;
        private C12016k mViewBounds;

        public C12013h(C12016k c12016k) {
            this.f55823a = c12016k;
            this.mViewBounds = c12016k;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    /* loaded from: classes.dex */
    public class C12014i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f55825a;

        /* renamed from: b */
        public final /* synthetic */ View f55826b;

        /* renamed from: c */
        public final /* synthetic */ Rect f55827c;

        /* renamed from: d */
        public final /* synthetic */ int f55828d;

        /* renamed from: e */
        public final /* synthetic */ int f55829e;

        /* renamed from: f */
        public final /* synthetic */ int f55830f;

        /* renamed from: g */
        public final /* synthetic */ int f55831g;

        public C12014i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f55826b = view;
            this.f55827c = rect;
            this.f55828d = i;
            this.f55829e = i2;
            this.f55830f = i3;
            this.f55831g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f55825a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f55825a) {
                C38790bq6.m62547D0(this.f55826b, this.f55827c);
                C37172Xt6.m76165g(this.f55826b, this.f55828d, this.f55829e, this.f55830f, this.f55831g);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    /* loaded from: classes.dex */
    public class C12015j extends C12054b {

        /* renamed from: a */
        public boolean f55833a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f55834b;

        public C12015j(ViewGroup viewGroup) {
            this.f55834b = viewGroup;
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionCancel(Transition transition) {
            C44747lr6.m26734d(this.f55834b, false);
            this.f55833a = true;
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            if (!this.f55833a) {
                C44747lr6.m26734d(this.f55834b, false);
            }
            transition.mo65854h0(this);
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionPause(Transition transition) {
            C44747lr6.m26734d(this.f55834b, false);
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionResume(Transition transition) {
            C44747lr6.m26734d(this.f55834b, true);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$k */
    /* loaded from: classes.dex */
    public static class C12016k {

        /* renamed from: a */
        public int f55836a;

        /* renamed from: b */
        public int f55837b;

        /* renamed from: c */
        public int f55838c;

        /* renamed from: d */
        public int f55839d;

        /* renamed from: e */
        public View f55840e;

        /* renamed from: f */
        public int f55841f;

        /* renamed from: g */
        public int f55842g;

        public C12016k(View view) {
            this.f55840e = view;
        }

        /* renamed from: a */
        public void m65951a(PointF pointF) {
            this.f55838c = Math.round(pointF.x);
            this.f55839d = Math.round(pointF.y);
            int i = this.f55842g + 1;
            this.f55842g = i;
            if (this.f55841f == i) {
                m65950b();
            }
        }

        /* renamed from: b */
        public final void m65950b() {
            C37172Xt6.m76165g(this.f55840e, this.f55836a, this.f55837b, this.f55838c, this.f55839d);
            this.f55841f = 0;
            this.f55842g = 0;
        }

        /* renamed from: c */
        public void m65949c(PointF pointF) {
            this.f55836a = Math.round(pointF.x);
            this.f55837b = Math.round(pointF.y);
            int i = this.f55841f + 1;
            this.f55841f = i;
            if (i == this.f55842g) {
                m65950b();
            }
        }
    }

    public ChangeBounds() {
        this.f55814P = new int[2];
        this.f55815Q = false;
        this.f55816R = false;
    }

    /* renamed from: A0 */
    public final void m65966A0(N96 n96) {
        View view = n96.f24200b;
        if (C38790bq6.m62504Z(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            n96.f24199a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            n96.f24199a.put("android:changeBounds:parent", n96.f24200b.getParent());
            if (this.f55816R) {
                n96.f24200b.getLocationInWindow(this.f55814P);
                n96.f24199a.put("android:changeBounds:windowX", Integer.valueOf(this.f55814P[0]));
                n96.f24199a.put("android:changeBounds:windowY", Integer.valueOf(this.f55814P[1]));
            }
            if (this.f55815Q) {
                n96.f24199a.put("android:changeBounds:clip", C38790bq6.m62451w(view));
            }
        }
    }

    /* renamed from: B0 */
    public final boolean m65965B0(View view, View view2) {
        if (!this.f55816R) {
            return true;
        }
        N96 m65905D = m65905D(view, true);
        if (m65905D == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m65905D.f24200b) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    public void m65964C0(boolean z) {
        this.f55815Q = z;
    }

    @Override // androidx.transition.Transition
    /* renamed from: S */
    public String[] mo65829S() {
        return f55806S;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        m65966A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        m65966A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: r */
    public Animator mo65825r(ViewGroup viewGroup, N96 n96, N96 n962) {
        int i;
        View view;
        ObjectAnimator m104943a;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator m65794c;
        if (n96 != null && n962 != null) {
            Map<String, Object> map = n96.f24199a;
            Map<String, Object> map2 = n962.f24199a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view2 = n962.f24200b;
                if (m65965B0(viewGroup2, viewGroup3)) {
                    Rect rect3 = (Rect) n96.f24199a.get("android:changeBounds:bounds");
                    Rect rect4 = (Rect) n962.f24199a.get("android:changeBounds:bounds");
                    int i3 = rect3.left;
                    int i4 = rect4.left;
                    int i5 = rect3.top;
                    int i6 = rect4.top;
                    int i7 = rect3.right;
                    int i8 = rect4.right;
                    int i9 = rect3.bottom;
                    int i10 = rect4.bottom;
                    int i11 = i7 - i3;
                    int i12 = i9 - i5;
                    int i13 = i8 - i4;
                    int i14 = i10 - i6;
                    Rect rect5 = (Rect) n96.f24199a.get("android:changeBounds:clip");
                    Rect rect6 = (Rect) n962.f24199a.get("android:changeBounds:clip");
                    if ((i11 != 0 && i12 != 0) || (i13 != 0 && i14 != 0)) {
                        if (i3 == i4 && i5 == i6) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        if (i7 != i8 || i9 != i10) {
                            i++;
                        }
                    } else {
                        i = 0;
                    }
                    if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                        i++;
                    }
                    if (i > 0) {
                        if (!this.f55815Q) {
                            view = view2;
                            C37172Xt6.m76165g(view, i3, i5, i7, i9);
                            if (i == 2) {
                                if (i11 == i13 && i12 == i14) {
                                    m65794c = C33047Gd3.m104943a(view, f55812Z, m65903H().mo65872a(i3, i5, i4, i6));
                                } else {
                                    C12016k c12016k = new C12016k(view);
                                    ObjectAnimator m104943a2 = C33047Gd3.m104943a(c12016k, f55808U, m65903H().mo65872a(i3, i5, i4, i6));
                                    ObjectAnimator m104943a3 = C33047Gd3.m104943a(c12016k, f55809W, m65903H().mo65872a(i7, i9, i8, i10));
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(m104943a2, m104943a3);
                                    animatorSet.addListener(new C12013h(c12016k));
                                    m65794c = animatorSet;
                                }
                            } else if (i3 == i4 && i5 == i6) {
                                m65794c = C33047Gd3.m104943a(view, f55810X, m65903H().mo65872a(i7, i9, i8, i10));
                            } else {
                                m65794c = C33047Gd3.m104943a(view, f55811Y, m65903H().mo65872a(i3, i5, i4, i6));
                            }
                        } else {
                            view = view2;
                            C37172Xt6.m76165g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                            if (i3 == i4 && i5 == i6) {
                                m104943a = null;
                            } else {
                                m104943a = C33047Gd3.m104943a(view, f55812Z, m65903H().mo65872a(i3, i5, i4, i6));
                            }
                            if (rect5 == null) {
                                i2 = 0;
                                rect = new Rect(0, 0, i11, i12);
                            } else {
                                i2 = 0;
                                rect = rect5;
                            }
                            if (rect6 == null) {
                                rect2 = new Rect(i2, i2, i13, i14);
                            } else {
                                rect2 = rect6;
                            }
                            if (!rect.equals(rect2)) {
                                C38790bq6.m62547D0(view, rect);
                                C35523Qs4 c35523Qs4 = f55813p0;
                                Object[] objArr = new Object[2];
                                objArr[i2] = rect;
                                objArr[1] = rect2;
                                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c35523Qs4, objArr);
                                ofObject.addListener(new C12014i(view, rect6, i4, i6, i8, i10));
                                objectAnimator = ofObject;
                            } else {
                                objectAnimator = null;
                            }
                            m65794c = C12058d.m65794c(m104943a, objectAnimator);
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            C44747lr6.m26734d(viewGroup4, true);
                            mo65857d(new C12015j(viewGroup4));
                        }
                        return m65794c;
                    }
                    return null;
                }
                int intValue = ((Integer) n96.f24199a.get("android:changeBounds:windowX")).intValue();
                int intValue2 = ((Integer) n96.f24199a.get("android:changeBounds:windowY")).intValue();
                int intValue3 = ((Integer) n962.f24199a.get("android:changeBounds:windowX")).intValue();
                int intValue4 = ((Integer) n962.f24199a.get("android:changeBounds:windowY")).intValue();
                if (intValue == intValue3 && intValue2 == intValue4) {
                    return null;
                }
                viewGroup.getLocationInWindow(this.f55814P);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float m76169c = C37172Xt6.m76169c(view2);
                C37172Xt6.m76164h(view2, 0.0f);
                C37172Xt6.m76170b(viewGroup).mo193b(bitmapDrawable);
                PathMotion m65903H = m65903H();
                int[] iArr = this.f55814P;
                int i15 = iArr[0];
                int i16 = iArr[1];
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, B94.m114320a(f55807T, m65903H.mo65872a(intValue - i15, intValue2 - i16, intValue3 - i15, intValue4 - i16)));
                ofPropertyValuesHolder.addListener(new C12006a(viewGroup, bitmapDrawable, view2, m76169c));
                return ofPropertyValuesHolder;
            }
            return null;
        }
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55814P = new int[2];
        this.f55815Q = false;
        this.f55816R = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33750d);
        boolean m103675a = C33266Hb6.m103675a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        m65964C0(m103675a);
    }
}
