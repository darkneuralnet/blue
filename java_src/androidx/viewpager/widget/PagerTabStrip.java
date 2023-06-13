package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.KotlinVersion;
/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: A */
    public boolean f56013A;

    /* renamed from: B */
    public boolean f56014B;

    /* renamed from: C */
    public int f56015C;

    /* renamed from: D */
    public boolean f56016D;

    /* renamed from: E */
    public float f56017E;

    /* renamed from: F */
    public float f56018F;

    /* renamed from: G */
    public int f56019G;

    /* renamed from: r */
    public int f56020r;

    /* renamed from: s */
    public int f56021s;

    /* renamed from: t */
    public int f56022t;

    /* renamed from: u */
    public int f56023u;

    /* renamed from: v */
    public int f56024v;

    /* renamed from: w */
    public int f56025w;

    /* renamed from: x */
    public final Paint f56026x;

    /* renamed from: y */
    public final Rect f56027y;

    /* renamed from: z */
    public int f56028z;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC12063a implements View.OnClickListener {
        public View$OnClickListenerC12063a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f56033b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC12064b implements View.OnClickListener {
        public View$OnClickListenerC12064b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f56033b;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: a */
    public int mo65748a() {
        return Math.max(super.mo65748a(), this.f56024v);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: f */
    public void mo65743f(int i, float f, boolean z) {
        Rect rect = this.f56027y;
        int height = getHeight();
        int left = this.f56035d.getLeft() - this.f56025w;
        int right = this.f56035d.getRight() + this.f56025w;
        int i2 = height - this.f56021s;
        rect.set(left, i2, right, height);
        super.mo65743f(i, f, z);
        this.f56028z = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f56035d.getLeft() - this.f56025w, i2, this.f56035d.getRight() + this.f56025w, height);
        invalidate(rect);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f56035d.getLeft() - this.f56025w;
        int right = this.f56035d.getRight() + this.f56025w;
        this.f56026x.setColor((this.f56028z << 24) | (this.f56020r & 16777215));
        float f = height;
        canvas.drawRect(left, height - this.f56021s, right, f, this.f56026x);
        if (this.f56013A) {
            this.f56026x.setColor((this.f56020r & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f56015C, getWidth() - getPaddingRight(), f, this.f56026x);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f56016D) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x - this.f56017E) > this.f56019G || Math.abs(y - this.f56018F) > this.f56019G)) {
                    this.f56016D = true;
                }
            } else if (x < this.f56035d.getLeft() - this.f56025w) {
                ViewPager viewPager = this.f56033b;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x > this.f56035d.getRight() + this.f56025w) {
                ViewPager viewPager2 = this.f56033b;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else {
            this.f56017E = x;
            this.f56018F = y;
            this.f56016D = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        boolean z;
        super.setBackgroundColor(i);
        if (!this.f56014B) {
            if ((i & (-16777216)) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f56013A = z;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z;
        super.setBackgroundDrawable(drawable);
        if (!this.f56014B) {
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.f56013A = z;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        boolean z;
        super.setBackgroundResource(i);
        if (!this.f56014B) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f56013A = z;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f56013A = z;
        this.f56014B = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f56022t;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f56020r = i;
        this.f56026x.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(NA0.m94301c(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.f56023u;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f56026x = paint;
        this.f56027y = new Rect();
        this.f56028z = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f56013A = false;
        this.f56014B = false;
        int i = this.f56046o;
        this.f56020r = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f56021s = (int) ((3.0f * f) + 0.5f);
        this.f56022t = (int) ((6.0f * f) + 0.5f);
        this.f56023u = (int) (64.0f * f);
        this.f56025w = (int) ((16.0f * f) + 0.5f);
        this.f56015C = (int) ((1.0f * f) + 0.5f);
        this.f56024v = (int) ((f * 32.0f) + 0.5f);
        this.f56019G = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(m65747b());
        setWillNotDraw(false);
        this.f56034c.setFocusable(true);
        this.f56034c.setOnClickListener(new View$OnClickListenerC12063a());
        this.f56036e.setFocusable(true);
        this.f56036e.setOnClickListener(new View$OnClickListenerC12064b());
        if (getBackground() == null) {
            this.f56013A = true;
        }
    }
}
