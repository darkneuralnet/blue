package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
/* loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* renamed from: m */
    public Paint f53926m;

    /* renamed from: n */
    public MotionLayout f53927n;

    /* renamed from: o */
    public float[] f53928o;

    /* renamed from: p */
    public Matrix f53929p;

    /* renamed from: q */
    public int f53930q;

    /* renamed from: r */
    public int f53931r;

    /* renamed from: s */
    public float f53932s;

    public MotionTelltales(Context context) {
        super(context);
        this.f53926m = new Paint();
        this.f53928o = new float[2];
        this.f53929p = new Matrix();
        this.f53930q = 0;
        this.f53931r = -65281;
        this.f53932s = 0.25f;
        m67907a(context, null);
    }

    /* renamed from: a */
    private void m67907a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.MotionTelltales_telltales_tailColor) {
                    this.f53931r = obtainStyledAttributes.getColor(index, this.f53931r);
                } else if (index == C39341cm4.MotionTelltales_telltales_velocityMode) {
                    this.f53930q = obtainStyledAttributes.getInt(index, this.f53930q);
                } else if (index == C39341cm4.MotionTelltales_telltales_tailScale) {
                    this.f53932s = obtainStyledAttributes.getFloat(index, this.f53932s);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f53926m.setColor(this.f53931r);
        this.f53926m.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f53929p);
        if (this.f53927n == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f53927n = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f53927n.m68173a0(this, f2, f, this.f53928o, this.f53930q);
                this.f53929p.mapVectors(this.f53928o);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.f53928o;
                float f5 = fArr2[0];
                float f6 = this.f53932s;
                float f7 = f4 - (fArr2[1] * f6);
                this.f53929p.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f53926m);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f53863g = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53926m = new Paint();
        this.f53928o = new float[2];
        this.f53929p = new Matrix();
        this.f53930q = 0;
        this.f53931r = -65281;
        this.f53932s = 0.25f;
        m67907a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53926m = new Paint();
        this.f53928o = new float[2];
        this.f53929p = new Matrix();
        this.f53930q = 0;
        this.f53931r = -65281;
        this.f53932s = 0.25f;
        m67907a(context, attributeSet);
    }
}
