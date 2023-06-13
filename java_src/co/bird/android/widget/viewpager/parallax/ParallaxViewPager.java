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
/* loaded from: classes4.dex */
public class ParallaxViewPager extends ViewPager {

    /* renamed from: b */
    public Bitmap f68171b;

    /* renamed from: c */
    public Rect f68172c;

    /* renamed from: d */
    public Rect f68173d;

    /* renamed from: e */
    public int f68174e;

    /* renamed from: f */
    public int f68175f;

    /* renamed from: g */
    public int f68176g;

    /* renamed from: h */
    public float f68177h;

    /* renamed from: i */
    public ViewPager.InterfaceC12076i f68178i;

    /* renamed from: j */
    public C16707a f68179j;

    /* renamed from: k */
    public boolean f68180k;

    /* renamed from: co.bird.android.widget.viewpager.parallax.ParallaxViewPager$a */
    /* loaded from: classes4.dex */
    public class C16707a implements ViewPager.InterfaceC12076i {
        public C16707a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrollStateChanged(int i) {
            if (ParallaxViewPager.this.f68178i != null) {
                ParallaxViewPager.this.f68178i.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrolled(int i, float f, int i2) {
            ParallaxViewPager parallaxViewPager = ParallaxViewPager.this;
            if (parallaxViewPager.f68171b != null) {
                float f2 = i + f;
                float f3 = f2 - 0.01f;
                parallaxViewPager.f68172c.left = (int) Math.floor(ParallaxViewPager.this.f68175f * f3);
                ParallaxViewPager.this.f68172c.right = (int) Math.ceil(((f2 + 0.01f) * ParallaxViewPager.this.f68175f) + ParallaxViewPager.this.f68176g);
                ParallaxViewPager.this.f68173d.left = (int) Math.floor(f3 * ParallaxViewPager.this.getWidth());
                ParallaxViewPager.this.f68173d.right = (int) Math.ceil((f2 + 1.0f + 0.01f) * ParallaxViewPager.this.getWidth());
                ParallaxViewPager.this.invalidate();
            }
            if (ParallaxViewPager.this.f68178i != null) {
                ParallaxViewPager.this.f68178i.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
            if (ParallaxViewPager.this.f68178i != null) {
                ParallaxViewPager.this.f68178i.onPageSelected(i);
            }
        }
    }

    public ParallaxViewPager(Context context) {
        super(context);
        this.f68180k = true;
        m53930h();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.InterfaceC12076i interfaceC12076i) {
        this.f68178i = interfaceC12076i;
    }

    /* renamed from: f */
    public final void m53932f() {
        if (this.f68171b.getWidth() < getWidth() && this.f68171b.getWidth() < this.f68171b.getHeight() && this.f68174e == 1) {
            Log.w(ParallaxViewPager.class.getName(), "Invalid bitmap bounds for the current device, parallax effect will not work.");
        }
        float height = getHeight() / this.f68171b.getHeight();
        if (height != 1.0f) {
            if (this.f68174e != 0) {
                Rect rect = this.f68172c;
                rect.top = 0;
                rect.bottom = this.f68171b.getHeight();
                this.f68176g = (int) Math.ceil(getWidth() / height);
                this.f68175f = (int) Math.ceil(((this.f68171b.getWidth() - this.f68176g) / getAdapter().getCount()) * this.f68177h);
                return;
            }
            this.f68172c.top = (int) ((this.f68171b.getHeight() - (this.f68171b.getHeight() / height)) / 2.0f);
            this.f68172c.bottom = this.f68171b.getHeight() - this.f68172c.top;
            int ceil = (int) Math.ceil(this.f68171b.getWidth() / getAdapter().getCount());
            this.f68175f = ceil;
            this.f68176g = ceil;
        }
    }

    /* renamed from: g */
    public ViewPager.InterfaceC12076i m53931g() {
        return this.f68179j;
    }

    /* renamed from: h */
    public final void m53930h() {
        this.f68172c = new Rect();
        this.f68173d = new Rect();
        this.f68174e = 1;
        this.f68177h = 0.5f;
        C16707a c16707a = new C16707a();
        this.f68179j = c16707a;
        super.addOnPageChangeListener(c16707a);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f68171b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f68172c, this.f68173d, (Paint) null);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f68180k) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.f68173d;
        rect.top = 0;
        rect.bottom = i2;
        if (getAdapter() != null && this.f68171b != null) {
            m53932f();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f68180k && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.f68171b = ((BitmapDrawable) drawable).getBitmap();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.f68171b = ((BitmapDrawable) drawable).getBitmap();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        this.f68171b = BitmapFactory.decodeResource(getResources(), i);
    }

    public void setSwipeEnabled(boolean z) {
        this.f68180k = z;
    }

    public ParallaxViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68180k = true;
        m53930h();
    }
}
