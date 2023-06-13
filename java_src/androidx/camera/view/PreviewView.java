package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.camera.core.C11236l;
import androidx.camera.core.C11243o;
import androidx.camera.view.AbstractC11275c;
import androidx.camera.view.PreviewView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p000.C32717Es6;
/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: q */
    public static final EnumC11265d f52826q = EnumC11265d.PERFORMANCE;

    /* renamed from: b */
    public EnumC11265d f52827b;

    /* renamed from: c */
    public AbstractC11275c f52828c;

    /* renamed from: d */
    public final C11273b f52829d;

    /* renamed from: e */
    public boolean f52830e;

    /* renamed from: f */
    public final C49882uX2<EnumC11269h> f52831f;

    /* renamed from: g */
    public final AtomicReference<C11270a> f52832g;

    /* renamed from: h */
    public AbstractC43395jb0 f52833h;

    /* renamed from: i */
    public Executor f52834i;

    /* renamed from: j */
    public C44854m24 f52835j;

    /* renamed from: k */
    public final ScaleGestureDetector f52836k;

    /* renamed from: l */
    public InterfaceC33962Kb0 f52837l;

    /* renamed from: m */
    public MotionEvent f52838m;

    /* renamed from: n */
    public final C11264c f52839n;

    /* renamed from: o */
    public final View.OnLayoutChangeListener f52840o;

    /* renamed from: p */
    public final C11236l.InterfaceC11239c f52841p;

    /* renamed from: androidx.camera.view.PreviewView$a */
    /* loaded from: classes.dex */
    public class C11262a implements C11236l.InterfaceC11239c {
        public C11262a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m68973e(C11243o c11243o) {
            PreviewView.this.f52841p.mo13949a(c11243o);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m68972f(InterfaceC34196Lb0 interfaceC34196Lb0, C11243o c11243o, C11243o.AbstractC11251h abstractC11251h) {
            boolean z;
            PreviewView previewView;
            AbstractC11275c abstractC11275c;
            C33928Jx2.m99533a("PreviewView", "Preview transformation info updated. " + abstractC11251h);
            Integer valueOf = Integer.valueOf(interfaceC34196Lb0.mo4467d().mo100139b());
            if (valueOf == null) {
                C33928Jx2.m99522l("PreviewView", "The lens facing is null, probably an external.");
            } else if (valueOf.intValue() != 0) {
                z = false;
                PreviewView.this.f52829d.m68934p(abstractC11251h, c11243o.m69105n(), z);
                if (abstractC11251h.mo69083c() == -1 && ((abstractC11275c = (previewView = PreviewView.this).f52828c) == null || !(abstractC11275c instanceof C11277d))) {
                    previewView.f52830e = false;
                } else {
                    PreviewView.this.f52830e = true;
                }
                PreviewView.this.m68982l();
            }
            z = true;
            PreviewView.this.f52829d.m68934p(abstractC11251h, c11243o.m69105n(), z);
            if (abstractC11251h.mo69083c() == -1) {
            }
            PreviewView.this.f52830e = true;
            PreviewView.this.m68982l();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m68971g(C11270a c11270a, InterfaceC34196Lb0 interfaceC34196Lb0) {
            if (C42482i24.m35337a(PreviewView.this.f52832g, c11270a, null)) {
                c11270a.m68952l(EnumC11269h.IDLE);
            }
            c11270a.m68958f();
            interfaceC34196Lb0.mo4463j().mo72844b(c11270a);
        }

        @Override // androidx.camera.core.C11236l.InterfaceC11239c
        /* renamed from: a */
        public void mo13949a(final C11243o c11243o) {
            AbstractC11275c c11277d;
            if (!O36.m92959c()) {
                NA0.m94296h(PreviewView.this.getContext()).execute(new Runnable() { // from class: j24
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.C11262a.this.m68973e(c11243o);
                    }
                });
                return;
            }
            C33928Jx2.m99533a("PreviewView", "Surface requested by Preview.");
            final InterfaceC34196Lb0 m69108k = c11243o.m69108k();
            PreviewView.this.f52837l = m69108k.mo4467d();
            c11243o.m69121B(NA0.m94296h(PreviewView.this.getContext()), new C11243o.InterfaceC11252i() { // from class: k24
                @Override // androidx.camera.core.C11243o.InterfaceC11252i
                /* renamed from: a */
                public final void mo29414a(C11243o.AbstractC11251h abstractC11251h) {
                    PreviewView.C11262a.this.m68972f(m69108k, c11243o, abstractC11251h);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.m68981m(previewView.f52828c, c11243o, previewView.f52827b)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.m68980n(c11243o, previewView2.f52827b)) {
                    PreviewView previewView3 = PreviewView.this;
                    c11277d = new C11279e(previewView3, previewView3.f52829d);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    c11277d = new C11277d(previewView4, previewView4.f52829d);
                }
                previewView2.f52828c = c11277d;
            }
            InterfaceC33962Kb0 mo4467d = m69108k.mo4467d();
            PreviewView previewView5 = PreviewView.this;
            final C11270a c11270a = new C11270a(mo4467d, previewView5.f52831f, previewView5.f52828c);
            PreviewView.this.f52832g.set(c11270a);
            m69108k.mo4463j().mo72843c(NA0.m94296h(PreviewView.this.getContext()), c11270a);
            PreviewView.this.f52828c.mo68916e(c11243o, new AbstractC11275c.InterfaceC11276a() { // from class: l24
                @Override // androidx.camera.view.AbstractC11275c.InterfaceC11276a
                /* renamed from: a */
                public final void mo28009a() {
                    PreviewView.C11262a.this.m68971g(c11270a, m69108k);
                }
            });
            PreviewView.this.getClass();
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11263b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52843a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f52844b;

        static {
            int[] iArr = new int[EnumC11265d.values().length];
            f52844b = iArr;
            try {
                iArr[EnumC11265d.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52844b[EnumC11265d.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC11268g.values().length];
            f52843a = iArr2;
            try {
                iArr2[EnumC11268g.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52843a[EnumC11268g.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52843a[EnumC11268g.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52843a[EnumC11268g.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52843a[EnumC11268g.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f52843a[EnumC11268g.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$c */
    /* loaded from: classes.dex */
    public class C11264c implements DisplayManager.DisplayListener {
        public C11264c() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            Display display = PreviewView.this.getDisplay();
            if (display != null && display.getDisplayId() == i) {
                PreviewView.this.m68982l();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$d */
    /* loaded from: classes.dex */
    public enum EnumC11265d {
        PERFORMANCE(0),
        COMPATIBLE(1);
        

        /* renamed from: b */
        public final int f52849b;

        EnumC11265d(int i) {
            this.f52849b = i;
        }

        /* renamed from: b */
        public static EnumC11265d m68969b(int i) {
            EnumC11265d[] values;
            for (EnumC11265d enumC11265d : values()) {
                if (enumC11265d.f52849b == i) {
                    return enumC11265d;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i);
        }

        /* renamed from: c */
        public int m68968c() {
            return this.f52849b;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC11266e {
    }

    /* renamed from: androidx.camera.view.PreviewView$f */
    /* loaded from: classes.dex */
    public class C11267f extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C11267f() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            AbstractC43395jb0 abstractC43395jb0 = PreviewView.this.f52833h;
            if (abstractC43395jb0 != null) {
                abstractC43395jb0.m30225y(scaleGestureDetector.getScaleFactor());
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$g */
    /* loaded from: classes.dex */
    public enum EnumC11268g {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        

        /* renamed from: b */
        public final int f52858b;

        EnumC11268g(int i) {
            this.f52858b = i;
        }

        /* renamed from: b */
        public static EnumC11268g m68966b(int i) {
            EnumC11268g[] values;
            for (EnumC11268g enumC11268g : values()) {
                if (enumC11268g.f52858b == i) {
                    return enumC11268g;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i);
        }

        /* renamed from: c */
        public int m68965c() {
            return this.f52858b;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$h */
    /* loaded from: classes.dex */
    public enum EnumC11269h {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m68983k(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m68982l();
            m68992b(true);
        }
    }

    /* renamed from: m */
    public static boolean m68981m(AbstractC11275c abstractC11275c, C11243o c11243o, EnumC11265d enumC11265d) {
        return (abstractC11275c instanceof C11277d) && !m68980n(c11243o, enumC11265d);
    }

    /* renamed from: n */
    public static boolean m68980n(C11243o c11243o, EnumC11265d enumC11265d) {
        boolean z;
        int i;
        boolean equals = c11243o.m69108k().mo4467d().mo100133o().equals("androidx.camera.camera2.legacy");
        if (R21.m87402a(C48690sW5.class) == null && R21.m87402a(C48098rW5.class) == null) {
            z = false;
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT <= 24 || equals || z || (i = C11263b.f52844b[enumC11265d.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + enumC11265d);
    }

    /* renamed from: b */
    public final void m68992b(boolean z) {
        O36.m92961a();
        C32717Es6 m68986h = m68986h();
        if (this.f52833h != null && m68986h != null && isAttachedToWindow()) {
            try {
                this.f52833h.m30246d(m68987g(), m68986h);
            } catch (IllegalStateException e) {
                if (z) {
                    C33928Jx2.m99530d("PreviewView", e.toString(), e);
                    return;
                }
                throw e;
            }
        }
    }

    /* renamed from: c */
    public final DisplayManager m68991c() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    /* renamed from: d */
    public ST2 m68990d() {
        O36.m92961a();
        return this.f52835j;
    }

    /* renamed from: e */
    public C43154jA3 m68989e() {
        Matrix matrix;
        O36.m92961a();
        try {
            matrix = this.f52829d.m68942h(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect m68943g = this.f52829d.m68943g();
        if (matrix != null && m68943g != null) {
            matrix.preConcat(C46705p96.m19874a(m68943g));
            if (this.f52828c instanceof C11279e) {
                matrix.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                C33928Jx2.m99522l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new C43154jA3(matrix, new Size(m68943g.width(), m68943g.height()));
        }
        C33928Jx2.m99533a("PreviewView", "Transform info is not ready");
        return null;
    }

    /* renamed from: f */
    public EnumC11268g m68988f() {
        O36.m92961a();
        return this.f52829d.m68944f();
    }

    /* renamed from: g */
    public C11236l.InterfaceC11239c m68987g() {
        O36.m92961a();
        return this.f52841p;
    }

    /* renamed from: h */
    public C32717Es6 m68986h() {
        O36.m92961a();
        if (getDisplay() == null) {
            return null;
        }
        return m68985i(getDisplay().getRotation());
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: i */
    public C32717Es6 m68985i(int i) {
        O36.m92961a();
        if (getWidth() != 0 && getHeight() != 0) {
            return new C32717Es6.C2010a(new Rational(getWidth(), getHeight()), i).m108269c(m68984j()).m108270b(getLayoutDirection()).m108271a();
        }
        return null;
    }

    /* renamed from: j */
    public final int m68984j() {
        switch (C11263b.f52843a[m68988f().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + m68988f());
        }
    }

    /* renamed from: l */
    public void m68982l() {
        O36.m92961a();
        if (this.f52828c != null) {
            m68977q();
            this.f52828c.m68931f();
        }
        this.f52835j.m26458e(new Size(getWidth(), getHeight()), getLayoutDirection());
        AbstractC43395jb0 abstractC43395jb0 = this.f52833h;
        if (abstractC43395jb0 != null) {
            abstractC43395jb0.m30250S(m68989e());
        }
    }

    /* renamed from: o */
    public final void m68979o() {
        DisplayManager m68991c = m68991c();
        if (m68991c == null) {
            return;
        }
        m68991c.registerDisplayListener(this.f52839n, new Handler(Looper.getMainLooper()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m68979o();
        addOnLayoutChangeListener(this.f52840o);
        AbstractC11275c abstractC11275c = this.f52828c;
        if (abstractC11275c != null) {
            abstractC11275c.mo68918b();
        }
        m68992b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f52840o);
        AbstractC11275c abstractC11275c = this.f52828c;
        if (abstractC11275c != null) {
            abstractC11275c.mo68917c();
        }
        AbstractC43395jb0 abstractC43395jb0 = this.f52833h;
        if (abstractC43395jb0 != null) {
            abstractC43395jb0.m30245e();
        }
        m68978p();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f52833h == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            this.f52838m = motionEvent;
            performClick();
            return true;
        } else if (!this.f52836k.onTouchEvent(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: p */
    public final void m68978p() {
        DisplayManager m68991c = m68991c();
        if (m68991c == null) {
            return;
        }
        m68991c.unregisterDisplayListener(this.f52839n);
    }

    @Override // android.view.View
    public boolean performClick() {
        float width;
        float height;
        if (this.f52833h != null) {
            MotionEvent motionEvent = this.f52838m;
            if (motionEvent != null) {
                width = motionEvent.getX();
            } else {
                width = getWidth() / 2.0f;
            }
            MotionEvent motionEvent2 = this.f52838m;
            if (motionEvent2 != null) {
                height = motionEvent2.getY();
            } else {
                height = getHeight() / 2.0f;
            }
            this.f52833h.m30224z(this.f52835j, width, height);
        }
        this.f52838m = null;
        return super.performClick();
    }

    /* renamed from: q */
    public void m68977q() {
        Display display;
        InterfaceC33962Kb0 interfaceC33962Kb0;
        if (this.f52830e && (display = getDisplay()) != null && (interfaceC33962Kb0 = this.f52837l) != null) {
            this.f52829d.m68937m(interfaceC33962Kb0.mo100138e(display.getRotation()), display.getRotation());
        }
    }

    public void setController(AbstractC43395jb0 abstractC43395jb0) {
        O36.m92961a();
        AbstractC43395jb0 abstractC43395jb02 = this.f52833h;
        if (abstractC43395jb02 != null && abstractC43395jb02 != abstractC43395jb0) {
            abstractC43395jb02.m30245e();
        }
        this.f52833h = abstractC43395jb0;
        m68992b(false);
    }

    public void setFrameUpdateListener(Executor executor, InterfaceC11266e interfaceC11266e) {
        if (this.f52827b != EnumC11265d.PERFORMANCE) {
            this.f52834i = executor;
            AbstractC11275c abstractC11275c = this.f52828c;
            if (abstractC11275c != null) {
                abstractC11275c.mo68915g(executor, interfaceC11266e);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
    }

    public void setImplementationMode(EnumC11265d enumC11265d) {
        O36.m92961a();
        this.f52827b = enumC11265d;
        EnumC11265d enumC11265d2 = EnumC11265d.PERFORMANCE;
    }

    public void setScaleType(EnumC11268g enumC11268g) {
        O36.m92961a();
        this.f52829d.m68935o(enumC11268g);
        m68982l();
        m68992b(false);
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        EnumC11265d enumC11265d = f52826q;
        this.f52827b = enumC11265d;
        C11273b c11273b = new C11273b();
        this.f52829d = c11273b;
        this.f52830e = true;
        this.f52831f = new C49882uX2<>(EnumC11269h.IDLE);
        this.f52832g = new AtomicReference<>();
        this.f52835j = new C44854m24(c11273b);
        this.f52839n = new C11264c();
        this.f52840o = new View.OnLayoutChangeListener() { // from class: h24
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                PreviewView.this.m68983k(view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        };
        this.f52841p = new C11262a();
        O36.m92961a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C36162Tl4.PreviewView;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C38790bq6.m62456t0(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(EnumC11268g.m68966b(obtainStyledAttributes.getInteger(C36162Tl4.PreviewView_scaleType, c11273b.m68944f().m68965c())));
            setImplementationMode(EnumC11265d.m68969b(obtainStyledAttributes.getInteger(C36162Tl4.PreviewView_implementationMode, enumC11265d.m68968c())));
            obtainStyledAttributes.recycle();
            this.f52836k = new ScaleGestureDetector(context, new C11267f());
            if (getBackground() == null) {
                setBackgroundColor(NA0.m94301c(getContext(), 17170444));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
