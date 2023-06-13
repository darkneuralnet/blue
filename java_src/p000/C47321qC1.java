package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
@SuppressLint({"ViewConstructor"})
/* renamed from: qC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47321qC1 extends ViewGroup implements InterfaceC45542nC1 {

    /* renamed from: b */
    public ViewGroup f104903b;

    /* renamed from: c */
    public View f104904c;

    /* renamed from: d */
    public final View f104905d;

    /* renamed from: e */
    public int f104906e;

    /* renamed from: f */
    public Matrix f104907f;

    /* renamed from: g */
    public final ViewTreeObserver.OnPreDrawListener f104908g;

    /* renamed from: qC1$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC27538a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC27538a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C38790bq6.m62470m0(C47321qC1.this);
            C47321qC1 c47321qC1 = C47321qC1.this;
            ViewGroup viewGroup = c47321qC1.f104903b;
            if (viewGroup != null && (view = c47321qC1.f104904c) != null) {
                viewGroup.endViewTransition(view);
                C38790bq6.m62470m0(C47321qC1.this.f104903b);
                C47321qC1 c47321qC12 = C47321qC1.this;
                c47321qC12.f104903b = null;
                c47321qC12.f104904c = null;
                return true;
            }
            return true;
        }
    }

    public C47321qC1(View view) {
        super(view.getContext());
        this.f104908g = new ViewTreeObserver$OnPreDrawListenerC27538a();
        this.f104905d = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* renamed from: b */
    public static C47321qC1 m17915b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        C46135oC1 c46135oC1;
        if (view.getParent() instanceof ViewGroup) {
            C46135oC1 m21640b = C46135oC1.m21640b(viewGroup);
            C47321qC1 m17912e = m17912e(view);
            if (m17912e != null && (c46135oC1 = (C46135oC1) m17912e.getParent()) != m21640b) {
                i = m17912e.f104906e;
                c46135oC1.removeView(m17912e);
                m17912e = null;
            } else {
                i = 0;
            }
            if (m17912e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m17914c(view, viewGroup, matrix);
                }
                m17912e = new C47321qC1(view);
                m17912e.m17909h(matrix);
                if (m21640b == null) {
                    m21640b = new C46135oC1(viewGroup);
                } else {
                    m21640b.m21635g();
                }
                m17913d(viewGroup, m21640b);
                m17913d(viewGroup, m17912e);
                m21640b.m21641a(m17912e);
                m17912e.f104906e = i;
            } else if (matrix != null) {
                m17912e.m17909h(matrix);
            }
            m17912e.f104906e++;
            return m17912e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    public static void m17914c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C37172Xt6.m76162j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        C37172Xt6.m76161k(viewGroup, matrix);
    }

    /* renamed from: d */
    public static void m17913d(View view, View view2) {
        C37172Xt6.m76165g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    public static C47321qC1 m17912e(View view) {
        return (C47321qC1) view.getTag(C36351Ug4.ghost_view);
    }

    /* renamed from: f */
    public static void m17911f(View view) {
        C47321qC1 m17912e = m17912e(view);
        if (m17912e != null) {
            int i = m17912e.f104906e - 1;
            m17912e.f104906e = i;
            if (i <= 0) {
                ((C46135oC1) m17912e.getParent()).removeView(m17912e);
            }
        }
    }

    /* renamed from: g */
    public static void m17910g(View view, C47321qC1 c47321qC1) {
        view.setTag(C36351Ug4.ghost_view, c47321qC1);
    }

    @Override // p000.InterfaceC45542nC1
    /* renamed from: a */
    public void mo17916a(ViewGroup viewGroup, View view) {
        this.f104903b = viewGroup;
        this.f104904c = view;
    }

    /* renamed from: h */
    public void m17909h(Matrix matrix) {
        this.f104907f = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m17910g(this.f104905d, this);
        this.f104905d.getViewTreeObserver().addOnPreDrawListener(this.f104908g);
        C37172Xt6.m76163i(this.f104905d, 4);
        if (this.f104905d.getParent() != null) {
            ((View) this.f104905d.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f104905d.getViewTreeObserver().removeOnPreDrawListener(this.f104908g);
        C37172Xt6.m76163i(this.f104905d, 0);
        m17910g(this.f104905d, null);
        if (this.f104905d.getParent() != null) {
            ((View) this.f104905d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C49354te0.m11986a(canvas, true);
        canvas.setMatrix(this.f104907f);
        C37172Xt6.m76163i(this.f104905d, 0);
        this.f104905d.invalidate();
        C37172Xt6.m76163i(this.f104905d, 4);
        drawChild(canvas, this.f104905d, getDrawingTime());
        C49354te0.m11986a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, p000.InterfaceC45542nC1
    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (m17912e(this.f104905d) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C37172Xt6.m76163i(this.f104905d, i2);
        }
    }
}
