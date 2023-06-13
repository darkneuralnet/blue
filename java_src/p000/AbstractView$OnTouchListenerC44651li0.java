package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
/* renamed from: li0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractView$OnTouchListenerC44651li0<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: b */
    public EnumC25766a f96574b = EnumC25766a.NONE;

    /* renamed from: c */
    public int f96575c = 0;

    /* renamed from: d */
    public OM1 f96576d;

    /* renamed from: e */
    public GestureDetector f96577e;

    /* renamed from: f */
    public T f96578f;

    /* renamed from: li0$a */
    /* loaded from: classes5.dex */
    public enum EnumC25766a {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public AbstractView$OnTouchListenerC44651li0(T t) {
        this.f96578f = t;
        this.f96577e = new GestureDetector(t.getContext(), this);
    }

    /* renamed from: a */
    public static float m26945a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    /* renamed from: b */
    public void m26944b(MotionEvent motionEvent) {
        this.f96578f.m52018K();
    }

    /* renamed from: c */
    public void m26943c(OM1 om1, MotionEvent motionEvent) {
        if (om1 != null && !om1.m92394a(this.f96576d)) {
            this.f96578f.m52016N(om1, true);
            this.f96576d = om1;
            return;
        }
        this.f96578f.m52016N(null, true);
        this.f96576d = null;
    }

    /* renamed from: d */
    public void m26942d(OM1 om1) {
        this.f96576d = om1;
    }

    /* renamed from: e */
    public void m26941e(MotionEvent motionEvent) {
        this.f96578f.m52018K();
    }
}
