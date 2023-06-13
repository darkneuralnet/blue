package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.KotlinVersion;
@ViewPager.InterfaceC12072e
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: p */
    public static final int[] f56031p = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: q */
    public static final int[] f56032q = {16843660};

    /* renamed from: b */
    public ViewPager f56033b;

    /* renamed from: c */
    public TextView f56034c;

    /* renamed from: d */
    public TextView f56035d;

    /* renamed from: e */
    public TextView f56036e;

    /* renamed from: f */
    public int f56037f;

    /* renamed from: g */
    public float f56038g;

    /* renamed from: h */
    public int f56039h;

    /* renamed from: i */
    public int f56040i;

    /* renamed from: j */
    public boolean f56041j;

    /* renamed from: k */
    public boolean f56042k;

    /* renamed from: l */
    public final C12065a f56043l;

    /* renamed from: m */
    public WeakReference<AbstractC39022cE3> f56044m;

    /* renamed from: n */
    public int f56045n;

    /* renamed from: o */
    public int f56046o;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    /* loaded from: classes.dex */
    public class C12065a extends DataSetObserver implements ViewPager.InterfaceC12076i, ViewPager.InterfaceC12075h {

        /* renamed from: b */
        public int f56047b;

        public C12065a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12075h
        /* renamed from: a */
        public void mo48735a(ViewPager viewPager, AbstractC39022cE3 abstractC39022cE3, AbstractC39022cE3 abstractC39022cE32) {
            PagerTitleStrip.this.m65745d(abstractC39022cE3, abstractC39022cE32);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.m65744e(pagerTitleStrip.f56033b.getCurrentItem(), PagerTitleStrip.this.f56033b.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f56038g;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo65743f(pagerTitleStrip2.f56033b.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrollStateChanged(int i) {
            this.f56047b = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo65743f(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
            if (this.f56047b == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.m65744e(pagerTitleStrip.f56033b.getCurrentItem(), PagerTitleStrip.this.f56033b.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f56038g;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo65743f(pagerTitleStrip2.f56033b.getCurrentItem(), f, true);
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    /* loaded from: classes.dex */
    public static class C12066b extends SingleLineTransformationMethod {

        /* renamed from: a */
        public Locale f56049a;

        public C12066b(Context context) {
            this.f56049a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f56049a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public static void m65746c(TextView textView) {
        textView.setTransformationMethod(new C12066b(textView.getContext()));
    }

    /* renamed from: a */
    public int mo65748a() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    /* renamed from: b */
    public int m65747b() {
        return this.f56039h;
    }

    /* renamed from: d */
    public void m65745d(AbstractC39022cE3 abstractC39022cE3, AbstractC39022cE3 abstractC39022cE32) {
        if (abstractC39022cE3 != null) {
            abstractC39022cE3.unregisterDataSetObserver(this.f56043l);
            this.f56044m = null;
        }
        if (abstractC39022cE32 != null) {
            abstractC39022cE32.registerDataSetObserver(this.f56043l);
            this.f56044m = new WeakReference<>(abstractC39022cE32);
        }
        ViewPager viewPager = this.f56033b;
        if (viewPager != null) {
            this.f56037f = -1;
            this.f56038g = -1.0f;
            m65744e(viewPager.getCurrentItem(), abstractC39022cE32);
            requestLayout();
        }
    }

    /* renamed from: e */
    public void m65744e(int i, AbstractC39022cE3 abstractC39022cE3) {
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (abstractC39022cE3 != null) {
            i2 = abstractC39022cE3.getCount();
        } else {
            i2 = 0;
        }
        this.f56041j = true;
        CharSequence charSequence3 = null;
        if (i >= 1 && abstractC39022cE3 != null) {
            charSequence = abstractC39022cE3.getPageTitle(i - 1);
        } else {
            charSequence = null;
        }
        this.f56034c.setText(charSequence);
        TextView textView = this.f56035d;
        if (abstractC39022cE3 != null && i < i2) {
            charSequence2 = abstractC39022cE3.getPageTitle(i);
        } else {
            charSequence2 = null;
        }
        textView.setText(charSequence2);
        int i3 = i + 1;
        if (i3 < i2 && abstractC39022cE3 != null) {
            charSequence3 = abstractC39022cE3.getPageTitle(i3);
        }
        this.f56036e.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f56034c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f56035d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f56036e.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f56037f = i;
        if (!this.f56042k) {
            mo65743f(i, this.f56038g, false);
        }
        this.f56041j = false;
    }

    /* renamed from: f */
    public void mo65743f(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f56037f) {
            m65744e(i, this.f56033b.getAdapter());
        } else if (!z && f == this.f56038g) {
            return;
        }
        this.f56042k = true;
        int measuredWidth = this.f56034c.getMeasuredWidth();
        int measuredWidth2 = this.f56035d.getMeasuredWidth();
        int measuredWidth3 = this.f56036e.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f56034c.getBaseline();
        int baseline2 = this.f56035d.getBaseline();
        int baseline3 = this.f56036e.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.f56034c.getMeasuredHeight() + i11, this.f56035d.getMeasuredHeight() + i12), this.f56036e.getMeasuredHeight() + i13);
        int i14 = this.f56040i & 112;
        if (i14 != 16) {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                TextView textView = this.f56035d;
                textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
                int min = Math.min(paddingLeft, (i9 - this.f56039h) - measuredWidth);
                TextView textView2 = this.f56034c;
                textView2.layout(min, i3, measuredWidth + min, textView2.getMeasuredHeight() + i3);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f56039h);
                TextView textView3 = this.f56036e;
                textView3.layout(max3, i5, max3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.f56038g = f;
                this.f56042k = false;
            }
            i2 = (height - paddingBottom) - max2;
        } else {
            i2 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.f56035d;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int min2 = Math.min(paddingLeft, (i9 - this.f56039h) - measuredWidth);
        TextView textView22 = this.f56034c;
        textView22.layout(min2, i3, measuredWidth + min2, textView22.getMeasuredHeight() + i3);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f56039h);
        TextView textView32 = this.f56036e;
        textView32.layout(max32, i5, max32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.f56038g = f;
        this.f56042k = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AbstractC39022cE3 abstractC39022cE3;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            AbstractC39022cE3 adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.f56043l);
            viewPager.addOnAdapterChangeListener(this.f56043l);
            this.f56033b = viewPager;
            WeakReference<AbstractC39022cE3> weakReference = this.f56044m;
            if (weakReference != null) {
                abstractC39022cE3 = weakReference.get();
            } else {
                abstractC39022cE3 = null;
            }
            m65745d(abstractC39022cE3, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f56033b;
        if (viewPager != null) {
            m65745d(viewPager.getAdapter(), null);
            this.f56033b.setInternalPageChangeListener(null);
            this.f56033b.removeOnAdapterChangeListener(this.f56043l);
            this.f56033b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f56033b != null) {
            float f = this.f56038g;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo65743f(this.f56037f, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
            this.f56034c.measure(childMeasureSpec2, childMeasureSpec);
            this.f56035d.measure(childMeasureSpec2, childMeasureSpec);
            this.f56036e.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                max = View.MeasureSpec.getSize(i2);
            } else {
                max = Math.max(mo65748a(), this.f56035d.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i2, this.f56035d.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f56041j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f56040i = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & KotlinVersion.MAX_COMPONENT_VALUE;
        this.f56045n = i;
        int i2 = (i << 24) | (this.f56046o & 16777215);
        this.f56034c.setTextColor(i2);
        this.f56036e.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.f56046o = i;
        this.f56035d.setTextColor(i);
        int i2 = (this.f56045n << 24) | (this.f56046o & 16777215);
        this.f56034c.setTextColor(i2);
        this.f56036e.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.f56034c.setTextSize(i, f);
        this.f56035d.setTextSize(i, f);
        this.f56036e.setTextSize(i, f);
    }

    public void setTextSpacing(int i) {
        this.f56039h = i;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56037f = -1;
        this.f56038g = -1.0f;
        this.f56043l = new C12065a();
        TextView textView = new TextView(context);
        this.f56034c = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f56035d = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f56036e = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f56031p);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Q26.m89061o(this.f56034c, resourceId);
            Q26.m89061o(this.f56035d, resourceId);
            Q26.m89061o(this.f56036e, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f56034c.setTextColor(color);
            this.f56035d.setTextColor(color);
            this.f56036e.setTextColor(color);
        }
        this.f56040i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f56046o = this.f56035d.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f56034c.setEllipsize(TextUtils.TruncateAt.END);
        this.f56035d.setEllipsize(TextUtils.TruncateAt.END);
        this.f56036e.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f56032q);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            m65746c(this.f56034c);
            m65746c(this.f56035d);
            m65746c(this.f56036e);
        } else {
            this.f56034c.setSingleLine();
            this.f56035d.setSingleLine();
            this.f56036e.setSingleLine();
        }
        this.f56039h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
