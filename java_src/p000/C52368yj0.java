package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
/* renamed from: yj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52368yj0 extends ImageView {

    /* renamed from: b */
    public Animation.AnimationListener f120056b;

    /* renamed from: c */
    public int f120057c;

    /* renamed from: d */
    public int f120058d;

    /* renamed from: yj0$a */
    /* loaded from: classes.dex */
    public static class C30688a extends OvalShape {

        /* renamed from: b */
        public Paint f120059b = new Paint();

        /* renamed from: c */
        public int f120060c;

        /* renamed from: d */
        public C52368yj0 f120061d;

        public C30688a(C52368yj0 c52368yj0, int i) {
            this.f120061d = c52368yj0;
            this.f120060c = i;
            m2785d((int) rect().width());
        }

        /* renamed from: d */
        public final void m2785d(int i) {
            float f = i / 2;
            this.f120059b.setShader(new RadialGradient(f, f, this.f120060c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = this.f120061d.getWidth() / 2;
            float height = this.f120061d.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f120059b);
            canvas.drawCircle(width2, height, width - this.f120060c, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m2785d((int) f);
        }
    }

    public C52368yj0(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f120057c = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C42916im4.SwipeRefreshLayout);
        this.f120058d = obtainStyledAttributes.getColor(C42916im4.f87857xaa980688, -328966);
        obtainStyledAttributes.recycle();
        if (m2787a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C38790bq6.m62545E0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C30688a(this, this.f120057c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f120057c, i2, i, 503316480);
            int i3 = this.f120057c;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f120058d);
        C38790bq6.m62553A0(this, shapeDrawable);
    }

    /* renamed from: a */
    public final boolean m2787a() {
        return true;
    }

    /* renamed from: b */
    public void m2786b(Animation.AnimationListener animationListener) {
        this.f120056b = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f120056b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f120056b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m2787a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f120057c * 2), getMeasuredHeight() + (this.f120057c * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f120058d = i;
        }
    }
}
