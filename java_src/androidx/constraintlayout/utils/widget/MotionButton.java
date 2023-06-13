package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
/* loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: b */
    public float f53869b;

    /* renamed from: c */
    public float f53870c;

    /* renamed from: d */
    public Path f53871d;

    /* renamed from: e */
    public ViewOutlineProvider f53872e;

    /* renamed from: f */
    public RectF f53873f;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    /* loaded from: classes.dex */
    public class C11505a extends ViewOutlineProvider {
        public C11505a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.f53869b) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    /* loaded from: classes.dex */
    public class C11506b extends ViewOutlineProvider {
        public C11506b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f53870c);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f53869b = 0.0f;
        this.f53870c = Float.NaN;
        m67921d(context, null);
    }

    /* renamed from: d */
    public final void m67921d(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f53870c = f;
            float f2 = this.f53869b;
            this.f53869b = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f53870c != f) {
            z = true;
        } else {
            z = false;
        }
        this.f53870c = f;
        if (f != 0.0f) {
            if (this.f53871d == null) {
                this.f53871d = new Path();
            }
            if (this.f53873f == null) {
                this.f53873f = new RectF();
            }
            if (this.f53872e == null) {
                C11506b c11506b = new C11506b();
                this.f53872e = c11506b;
                setOutlineProvider(c11506b);
            }
            setClipToOutline(true);
            this.f53873f.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f53871d.reset();
            Path path = this.f53871d;
            RectF rectF = this.f53873f;
            float f3 = this.f53870c;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.f53869b != f) {
            z = true;
        } else {
            z = false;
        }
        this.f53869b = f;
        if (f != 0.0f) {
            if (this.f53871d == null) {
                this.f53871d = new Path();
            }
            if (this.f53873f == null) {
                this.f53873f = new RectF();
            }
            if (this.f53872e == null) {
                C11505a c11505a = new C11505a();
                this.f53872e = c11505a;
                setOutlineProvider(c11505a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f53869b) / 2.0f;
            this.f53873f.set(0.0f, 0.0f, width, height);
            this.f53871d.reset();
            this.f53871d.addRoundRect(this.f53873f, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53869b = 0.0f;
        this.f53870c = Float.NaN;
        m67921d(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53869b = 0.0f;
        this.f53870c = Float.NaN;
        m67921d(context, attributeSet);
    }
}
