package p000;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import p000.AbstractView$OnTouchListenerC44651li0;
/* renamed from: tT3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49254tT3 extends AbstractView$OnTouchListenerC44651li0<PieRadarChartBase<?>> {

    /* renamed from: g */
    public PE2 f110519g;

    /* renamed from: h */
    public float f110520h;

    /* renamed from: i */
    public ArrayList<C28720a> f110521i;

    /* renamed from: j */
    public long f110522j;

    /* renamed from: k */
    public float f110523k;

    /* renamed from: tT3$a */
    /* loaded from: classes5.dex */
    public class C28720a {

        /* renamed from: a */
        public long f110524a;

        /* renamed from: b */
        public float f110525b;

        public C28720a(long j, float f) {
            this.f110524a = j;
            this.f110525b = f;
        }
    }

    public C49254tT3(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.f110519g = PE2.m90558c(0.0f, 0.0f);
        this.f110520h = 0.0f;
        this.f110521i = new ArrayList<>();
        this.f110522j = 0L;
        this.f110523k = 0.0f;
    }

    /* renamed from: f */
    public final float m12303f() {
        float f;
        float f2;
        if (this.f110521i.isEmpty()) {
            return 0.0f;
        }
        boolean z = false;
        C28720a c28720a = this.f110521i.get(0);
        ArrayList<C28720a> arrayList = this.f110521i;
        C28720a c28720a2 = arrayList.get(arrayList.size() - 1);
        C28720a c28720a3 = c28720a;
        for (int size = this.f110521i.size() - 1; size >= 0; size--) {
            c28720a3 = this.f110521i.get(size);
            if (c28720a3.f110525b != c28720a2.f110525b) {
                break;
            }
        }
        float f3 = ((float) (c28720a2.f110524a - c28720a.f110524a)) / 1000.0f;
        if (f3 == 0.0f) {
            f3 = 0.1f;
        }
        if (c28720a2.f110525b >= c28720a3.f110525b) {
            z = true;
        }
        if (Math.abs(f - f2) > 270.0d) {
            z = !z;
        }
        float f4 = c28720a2.f110525b;
        float f5 = c28720a.f110525b;
        if (f4 - f5 > 180.0d) {
            c28720a.f110525b = (float) (f5 + 360.0d);
        } else if (f5 - f4 > 180.0d) {
            c28720a2.f110525b = (float) (f4 + 360.0d);
        }
        float abs = Math.abs((c28720a2.f110525b - c28720a.f110525b) / f3);
        if (!z) {
            return -abs;
        }
        return abs;
    }

    /* renamed from: g */
    public void m12302g() {
        if (this.f110523k == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f110523k *= ((PieRadarChartBase) this.f96578f).m52025B();
        Object obj = this.f96578f;
        ((PieRadarChartBase) obj).setRotationAngle(((PieRadarChartBase) obj).m51969j0() + (this.f110523k * (((float) (currentAnimationTimeMillis - this.f110522j)) / 1000.0f)));
        this.f110522j = currentAnimationTimeMillis;
        if (Math.abs(this.f110523k) >= 0.001d) {
            AbstractC34967Oi6.m91637x(this.f96578f);
        } else {
            m12298k();
        }
    }

    /* renamed from: h */
    public final void m12301h() {
        this.f110521i.clear();
    }

    /* renamed from: i */
    public final void m12300i(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f110521i.add(new C28720a(currentAnimationTimeMillis, ((PieRadarChartBase) this.f96578f).m51974a0(f, f2)));
        for (int size = this.f110521i.size(); size - 2 > 0 && currentAnimationTimeMillis - this.f110521i.get(0).f110524a > 1000; size--) {
            this.f110521i.remove(0);
        }
    }

    /* renamed from: j */
    public void m12299j(float f, float f2) {
        this.f110520h = ((PieRadarChartBase) this.f96578f).m51974a0(f, f2) - ((PieRadarChartBase) this.f96578f).m51970g0();
    }

    /* renamed from: k */
    public void m12298k() {
        this.f110523k = 0.0f;
    }

    /* renamed from: l */
    public void m12297l(float f, float f2) {
        Object obj = this.f96578f;
        ((PieRadarChartBase) obj).setRotationAngle(((PieRadarChartBase) obj).m51974a0(f, f2) - this.f110520h);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.LONG_PRESS;
        ((PieRadarChartBase) this.f96578f).m52018K();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.SINGLE_TAP;
        ((PieRadarChartBase) this.f96578f).m52018K();
        if (!((PieRadarChartBase) this.f96578f).m52013R()) {
            return false;
        }
        m26943c(((PieRadarChartBase) this.f96578f).mo51997G(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f96577e.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.f96578f).m51968k0()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (((PieRadarChartBase) this.f96578f).m52015P()) {
                            m12300i(x, y);
                        }
                        if (this.f96575c == 0) {
                            PE2 pe2 = this.f110519g;
                            if (AbstractView$OnTouchListenerC44651li0.m26945a(x, pe2.f28146c, y, pe2.f28147d) > AbstractC34967Oi6.m91656e(8.0f)) {
                                this.f96574b = AbstractView$OnTouchListenerC44651li0.EnumC25766a.ROTATE;
                                this.f96575c = 6;
                                ((PieRadarChartBase) this.f96578f).m52006t();
                                m26944b(motionEvent);
                            }
                        }
                        if (this.f96575c == 6) {
                            m12297l(x, y);
                            ((PieRadarChartBase) this.f96578f).invalidate();
                        }
                        m26944b(motionEvent);
                    }
                } else {
                    if (((PieRadarChartBase) this.f96578f).m52015P()) {
                        m12298k();
                        m12300i(x, y);
                        float m12303f = m12303f();
                        this.f110523k = m12303f;
                        if (m12303f != 0.0f) {
                            this.f110522j = AnimationUtils.currentAnimationTimeMillis();
                            AbstractC34967Oi6.m91637x(this.f96578f);
                        }
                    }
                    ((PieRadarChartBase) this.f96578f).m52004w();
                    this.f96575c = 0;
                    m26944b(motionEvent);
                }
            } else {
                m26941e(motionEvent);
                m12298k();
                m12301h();
                if (((PieRadarChartBase) this.f96578f).m52015P()) {
                    m12300i(x, y);
                }
                m12299j(x, y);
                PE2 pe22 = this.f110519g;
                pe22.f28146c = x;
                pe22.f28147d = y;
            }
        }
        return true;
    }
}
