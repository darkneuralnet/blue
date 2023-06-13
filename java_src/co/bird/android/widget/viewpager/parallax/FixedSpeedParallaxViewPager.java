package co.bird.android.widget.viewpager.parallax;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import co.bird.android.widget.viewpager.fixedspeed.ScrollerViewPager;
/* loaded from: classes4.dex */
public class FixedSpeedParallaxViewPager extends ScrollerViewPager {

    /* renamed from: d */
    public Bitmap f68160d;

    /* renamed from: e */
    public Rect f68161e;

    /* renamed from: f */
    public Rect f68162f;

    /* renamed from: g */
    public int f68163g;

    /* renamed from: h */
    public int f68164h;

    /* renamed from: i */
    public int f68165i;

    /* renamed from: j */
    public float f68166j;

    /* renamed from: k */
    public ViewPager.InterfaceC12076i f68167k;

    /* renamed from: l */
    public C16706a f68168l;

    /* renamed from: m */
    public boolean f68169m;

    /* renamed from: co.bird.android.widget.viewpager.parallax.FixedSpeedParallaxViewPager$a */
    /* loaded from: classes4.dex */
    public class C16706a implements ViewPager.InterfaceC12076i {
        public C16706a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrollStateChanged(int i) {
            if (FixedSpeedParallaxViewPager.this.f68167k != null) {
                FixedSpeedParallaxViewPager.this.f68167k.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrolled(int i, float f, int i2) {
            FixedSpeedParallaxViewPager fixedSpeedParallaxViewPager = FixedSpeedParallaxViewPager.this;
            if (fixedSpeedParallaxViewPager.f68160d != null) {
                float f2 = i + f;
                float f3 = f2 - 0.01f;
                fixedSpeedParallaxViewPager.f68161e.left = (int) Math.floor(FixedSpeedParallaxViewPager.this.f68164h * f3);
                FixedSpeedParallaxViewPager.this.f68161e.right = (int) Math.ceil(((f2 + 0.01f) * FixedSpeedParallaxViewPager.this.f68164h) + FixedSpeedParallaxViewPager.this.f68165i);
                FixedSpeedParallaxViewPager.this.f68162f.left = (int) Math.floor(f3 * FixedSpeedParallaxViewPager.this.getWidth());
                FixedSpeedParallaxViewPager.this.f68162f.right = (int) Math.ceil((f2 + 1.0f + 0.01f) * FixedSpeedParallaxViewPager.this.getWidth());
                FixedSpeedParallaxViewPager.this.invalidate();
            }
            if (FixedSpeedParallaxViewPager.this.f68167k != null) {
                FixedSpeedParallaxViewPager.this.f68167k.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
            if (FixedSpeedParallaxViewPager.this.f68167k != null) {
                FixedSpeedParallaxViewPager.this.f68167k.onPageSelected(i);
            }
        }
    }

    public FixedSpeedParallaxViewPager(Context context) {
        super(context);
        this.f68169m = true;
        m53938j();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.InterfaceC12076i interfaceC12076i) {
        this.f68167k = interfaceC12076i;
    }

    /* renamed from: i */
    public final void m53939i() {
        if (this.f68160d.getWidth() < getWidth() && this.f68160d.getWidth() < this.f68160d.getHeight() && this.f68163g == 1) {
            Log.w(FixedSpeedParallaxViewPager.class.getName(), "Invalid bitmap bounds for the current device, parallax effect will not work.");
        }
        float height = getHeight() / this.f68160d.getHeight();
        if (height != 1.0f) {
            if (this.f68163g != 0) {
                Rect rect = this.f68161e;
                rect.top = 0;
                rect.bottom = this.f68160d.getHeight();
                this.f68165i = (int) Math.ceil(getWidth() / height);
                this.f68164h = (int) Math.ceil(((this.f68160d.getWidth() - this.f68165i) / getAdapter().getCount()) * this.f68166j);
                return;
            }
            this.f68161e.top = (int) ((this.f68160d.getHeight() - (this.f68160d.getHeight() / height)) / 2.0f);
            this.f68161e.bottom = this.f68160d.getHeight() - this.f68161e.top;
            int ceil = (int) Math.ceil(this.f68160d.getWidth() / getAdapter().getCount());
            this.f68164h = ceil;
            this.f68165i = ceil;
        }
    }

    /* renamed from: j */
    public final void m53938j() {
        this.f68161e = new Rect();
        this.f68162f = new Rect();
        this.f68163g = 1;
        this.f68166j = 0.5f;
        C16706a c16706a = new C16706a();
        this.f68168l = c16706a;
        setOnPageChangeListener(c16706a);
        m53947a();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f68160d;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f68161e, this.f68162f, (Paint) null);
        }
    }

    @Override // co.bird.android.widget.viewpager.fixedspeed.ScrollerViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f68169m && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.f68162f;
        rect.top = 0;
        rect.bottom = i2;
        if (getAdapter() != null && this.f68160d != null) {
            m53939i();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f68169m && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.f68160d = ((BitmapDrawable) drawable).getBitmap();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.f68160d = ((BitmapDrawable) drawable).getBitmap();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        this.f68160d = BitmapFactory.decodeResource(getResources(), i);
    }

    public void setFixedSpeed(int i) {
        m53946b(i);
    }

    public void setSwipeEnabled(boolean z) {
        this.f68169m = z;
    }

    public FixedSpeedParallaxViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68169m = true;
        m53938j();
    }
}
