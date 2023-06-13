package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.time.DurationKt;
import okhttp3.internal.http2.Http2Connection;
/* renamed from: Oi6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC34967Oi6 {

    /* renamed from: a */
    public static DisplayMetrics f27082a = null;

    /* renamed from: b */
    public static int f27083b = 50;

    /* renamed from: c */
    public static int f27084c = 8000;

    /* renamed from: d */
    public static final double f27085d = Double.longBitsToDouble(1);

    /* renamed from: e */
    public static final float f27086e = Float.intBitsToFloat(1);

    /* renamed from: f */
    public static Rect f27087f = new Rect();

    /* renamed from: g */
    public static Paint.FontMetrics f27088g = new Paint.FontMetrics();

    /* renamed from: h */
    public static Rect f27089h = new Rect();

    /* renamed from: i */
    public static final int[] f27090i = {1, 10, 100, 1000, 10000, 100000, DurationKt.NANOS_IN_MILLIS, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* renamed from: j */
    public static AbstractC33806Jj6 f27091j = m91653h();

    /* renamed from: k */
    public static Rect f27092k = new Rect();

    /* renamed from: l */
    public static Rect f27093l = new Rect();

    /* renamed from: m */
    public static Paint.FontMetrics f27094m = new Paint.FontMetrics();

    /* renamed from: a */
    public static int m91660a(Paint paint, String str) {
        Rect rect = f27087f;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* renamed from: b */
    public static C37536Zi1 m91659b(Paint paint, String str) {
        C37536Zi1 m72661b = C37536Zi1.m72661b(0.0f, 0.0f);
        m91658c(paint, str, m72661b);
        return m72661b;
    }

    /* renamed from: c */
    public static void m91658c(Paint paint, String str, C37536Zi1 c37536Zi1) {
        Rect rect = f27089h;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        c37536Zi1.f48979c = rect.width();
        c37536Zi1.f48980d = rect.height();
    }

    /* renamed from: d */
    public static int m91657d(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    /* renamed from: e */
    public static float m91656e(float f) {
        DisplayMetrics displayMetrics = f27082a;
        if (displayMetrics == null) {
            Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
            return f;
        }
        return f * displayMetrics.density;
    }

    /* renamed from: f */
    public static void m91655f(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        PE2 m90559b = PE2.m90559b();
        m90559b.f28146c = i - (i3 / 2);
        m90559b.f28147d = i2 - (i4 / 2);
        drawable.copyBounds(f27092k);
        Rect rect = f27092k;
        int i5 = rect.left;
        int i6 = rect.top;
        drawable.setBounds(i5, i6, i5 + i3, i3 + i6);
        int save = canvas.save();
        canvas.translate(m90559b.f28146c, m90559b.f28147d);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: g */
    public static void m91654g(Canvas canvas, String str, float f, float f2, Paint paint, PE2 pe2, float f3) {
        float fontMetrics = paint.getFontMetrics(f27094m);
        paint.getTextBounds(str, 0, str.length(), f27093l);
        float f4 = 0.0f - f27093l.left;
        float f5 = (-f27094m.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float width = f4 - (f27093l.width() * 0.5f);
            float f6 = f5 - (fontMetrics * 0.5f);
            if (pe2.f28146c != 0.5f || pe2.f28147d != 0.5f) {
                C37536Zi1 m91641t = m91641t(f27093l.width(), fontMetrics, f3);
                f -= m91641t.f48979c * (pe2.f28146c - 0.5f);
                f2 -= m91641t.f48980d * (pe2.f28147d - 0.5f);
                C37536Zi1.m72660c(m91641t);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, width, f6, paint);
            canvas.restore();
        } else {
            if (pe2.f28146c != 0.0f || pe2.f28147d != 0.0f) {
                f4 -= f27093l.width() * pe2.f28146c;
                f5 -= fontMetrics * pe2.f28147d;
            }
            canvas.drawText(str, f4 + f, f5 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    /* renamed from: h */
    public static AbstractC33806Jj6 m91653h() {
        return new WY0(1);
    }

    /* renamed from: i */
    public static int m91652i(float f) {
        float m91636y = m91636y(f);
        if (Float.isInfinite(m91636y)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10(m91636y))) + 2;
    }

    /* renamed from: j */
    public static AbstractC33806Jj6 m91651j() {
        return f27091j;
    }

    /* renamed from: k */
    public static float m91650k(Paint paint) {
        return m91649l(paint, f27088g);
    }

    /* renamed from: l */
    public static float m91649l(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    /* renamed from: m */
    public static float m91648m(Paint paint) {
        return m91647n(paint, f27088g);
    }

    /* renamed from: n */
    public static float m91647n(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    /* renamed from: o */
    public static int m91646o() {
        return f27084c;
    }

    /* renamed from: p */
    public static int m91645p() {
        return f27083b;
    }

    /* renamed from: q */
    public static float m91644q(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    /* renamed from: r */
    public static void m91643r(PE2 pe2, float f, float f2, PE2 pe22) {
        double d = f;
        double d2 = f2;
        pe22.f28146c = (float) (pe2.f28146c + (Math.cos(Math.toRadians(d2)) * d));
        pe22.f28147d = (float) (pe2.f28147d + (d * Math.sin(Math.toRadians(d2))));
    }

    /* renamed from: s */
    public static int m91642s() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: t */
    public static C37536Zi1 m91641t(float f, float f2, float f3) {
        return m91640u(f, f2, f3 * 0.017453292f);
    }

    /* renamed from: u */
    public static C37536Zi1 m91640u(float f, float f2, float f3) {
        double d = f3;
        return C37536Zi1.m72661b(Math.abs(((float) Math.cos(d)) * f) + Math.abs(((float) Math.sin(d)) * f2), Math.abs(f * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d))));
    }

    /* renamed from: v */
    public static void m91639v(Context context) {
        if (context == null) {
            f27083b = ViewConfiguration.getMinimumFlingVelocity();
            f27084c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        f27083b = viewConfiguration.getScaledMinimumFlingVelocity();
        f27084c = viewConfiguration.getScaledMaximumFlingVelocity();
        f27082a = context.getResources().getDisplayMetrics();
    }

    /* renamed from: w */
    public static double m91638w(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1L : -1L));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: x */
    public static void m91637x(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: y */
    public static float m91636y(double d) {
        double d2;
        if (!Double.isInfinite(d) && !Double.isNaN(d) && d != 0.0d) {
            if (d < 0.0d) {
                d2 = -d;
            } else {
                d2 = d;
            }
            float pow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d2))));
            return ((float) Math.round(d * pow)) / pow;
        }
        return 0.0f;
    }

    /* renamed from: z */
    public static void m91635z(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, f27084c);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }
}
