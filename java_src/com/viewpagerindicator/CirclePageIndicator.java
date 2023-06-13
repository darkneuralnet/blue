package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import kotlin.KotlinVersion;
/* loaded from: classes7.dex */
public class CirclePageIndicator extends View implements PageIndicator {
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private boolean mIsDragging;
    private float mLastMotionX;
    private ViewPager.InterfaceC12076i mListener;
    private int mOrientation;
    private float mPageOffset;
    private final Paint mPaintFill;
    private final Paint mPaintPageFill;
    private final Paint mPaintStroke;
    private float mRadius;
    private int mScrollState;
    private boolean mSnap;
    private int mSnapPage;
    private int mTouchSlop;
    private ViewPager mViewPager;

    /* loaded from: classes7.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.CirclePageIndicator.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int currentPage;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    private int measureLong(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824 && (viewPager = this.mViewPager) != null) {
            int count = viewPager.getAdapter().getCount();
            float f = this.mRadius;
            int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (count * 2 * f) + ((count - 1) * f) + 1.0f);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(paddingLeft, size);
            }
            return paddingLeft;
        }
        return size;
    }

    private int measureShort(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int paddingTop = (int) ((this.mRadius * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(paddingTop, size);
            }
            return paddingTop;
        }
        return size;
    }

    public int getFillColor() {
        return this.mPaintFill.getColor();
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPageColor() {
        return this.mPaintPageFill.getColor();
    }

    public float getRadius() {
        return this.mRadius;
    }

    public int getStrokeColor() {
        return this.mPaintStroke.getColor();
    }

    public float getStrokeWidth() {
        return this.mPaintStroke.getStrokeWidth();
    }

    public boolean isCentered() {
        return this.mCentered;
    }

    public boolean isSnap() {
        return this.mSnap;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.mCurrentPage >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.mOrientation == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float f3 = this.mRadius;
        float f4 = 3.0f * f3;
        float f5 = paddingLeft + f3;
        float f6 = paddingTop + f3;
        if (this.mCentered) {
            f6 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((count * f4) / 2.0f);
        }
        if (this.mPaintStroke.getStrokeWidth() > 0.0f) {
            f3 -= this.mPaintStroke.getStrokeWidth() / 2.0f;
        }
        for (int i2 = 0; i2 < count; i2++) {
            float f7 = (i2 * f4) + f6;
            if (this.mOrientation == 0) {
                f2 = f5;
            } else {
                f2 = f7;
                f7 = f5;
            }
            if (this.mPaintPageFill.getAlpha() > 0) {
                canvas.drawCircle(f7, f2, f3, this.mPaintPageFill);
            }
            float f8 = this.mRadius;
            if (f3 != f8) {
                canvas.drawCircle(f7, f2, f8, this.mPaintStroke);
            }
        }
        boolean z = this.mSnap;
        if (z) {
            i = this.mSnapPage;
        } else {
            i = this.mCurrentPage;
        }
        float f9 = i * f4;
        if (!z) {
            f9 += this.mPageOffset * f4;
        }
        if (this.mOrientation == 0) {
            float f10 = f6 + f9;
            f = f5;
            f5 = f10;
        } else {
            f = f6 + f9;
        }
        canvas.drawCircle(f5, f, this.mRadius, this.mPaintFill);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 0) {
            setMeasuredDimension(measureLong(i), measureShort(i2));
        } else {
            setMeasuredDimension(measureShort(i), measureLong(i2));
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageScrollStateChanged(int i) {
        this.mScrollState = i;
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrollStateChanged(i);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageScrolled(int i, float f, int i2) {
        this.mCurrentPage = i;
        this.mPageOffset = f;
        invalidate();
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrolled(i, f, i2);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageSelected(int i) {
        if (this.mSnap || this.mScrollState == 0) {
            this.mCurrentPage = i;
            this.mSnapPage = i;
            invalidate();
        }
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageSelected(i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.currentPage;
        this.mCurrentPage = i;
        this.mSnapPage = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.mCurrentPage;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.mViewPager;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int m85342b = SV2.m85342b(motionEvent);
                                if (SV2.m85341c(motionEvent, m85342b) == this.mActivePointerId) {
                                    if (m85342b == 0) {
                                        i = 1;
                                    }
                                    this.mActivePointerId = SV2.m85341c(motionEvent, i);
                                }
                                this.mLastMotionX = SV2.m85340d(motionEvent, SV2.m85343a(motionEvent, this.mActivePointerId));
                            }
                        } else {
                            int m85342b2 = SV2.m85342b(motionEvent);
                            this.mLastMotionX = SV2.m85340d(motionEvent, m85342b2);
                            this.mActivePointerId = SV2.m85341c(motionEvent, m85342b2);
                        }
                    }
                } else {
                    float m85340d = SV2.m85340d(motionEvent, SV2.m85343a(motionEvent, this.mActivePointerId));
                    float f = m85340d - this.mLastMotionX;
                    if (!this.mIsDragging && Math.abs(f) > this.mTouchSlop) {
                        this.mIsDragging = true;
                    }
                    if (this.mIsDragging) {
                        this.mLastMotionX = m85340d;
                        if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                            this.mViewPager.fakeDragBy(f);
                        }
                    }
                }
            }
            if (!this.mIsDragging) {
                int count = this.mViewPager.getAdapter().getCount();
                float width = getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.mCurrentPage > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage - 1);
                    }
                    return true;
                } else if (this.mCurrentPage < count - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage + 1);
                    }
                    return true;
                }
            }
            this.mIsDragging = false;
            this.mActivePointerId = -1;
            if (this.mViewPager.isFakeDragging()) {
                this.mViewPager.endFakeDrag();
            }
        } else {
            this.mActivePointerId = SV2.m85341c(motionEvent, 0);
            this.mLastMotionX = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.mCentered = z;
        invalidate();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setCurrentItem(int i) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.mCurrentPage = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i) {
        this.mPaintFill.setColor(i);
        invalidate();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.InterfaceC12076i interfaceC12076i) {
        this.mListener = interfaceC12076i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.mOrientation = i;
        requestLayout();
    }

    public void setPageColor(int i) {
        this.mPaintPageFill.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.mRadius = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.mSnap = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.mPaintStroke.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.mPaintStroke.setStrokeWidth(f);
        invalidate();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.mViewPager = viewPager;
            viewPager.setOnPageChangeListener(this);
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19589R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.mPaintPageFill = paint;
        Paint paint2 = new Paint(1);
        this.mPaintStroke = paint2;
        Paint paint3 = new Paint(1);
        this.mPaintFill = paint3;
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(C19589R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(C19589R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(C19589R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(C19589R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(C19589R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(C19589R.dimen.default_circle_indicator_radius);
        boolean z = resources.getBoolean(C19589R.bool.default_circle_indicator_centered);
        boolean z2 = resources.getBoolean(C19589R.bool.default_circle_indicator_snap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19589R.styleable.CirclePageIndicator, i, 0);
        this.mCentered = obtainStyledAttributes.getBoolean(2, z);
        this.mOrientation = obtainStyledAttributes.getInt(0, integer);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(obtainStyledAttributes.getColor(5, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(obtainStyledAttributes.getColor(8, color3));
        paint2.setStrokeWidth(obtainStyledAttributes.getDimension(3, dimension));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(obtainStyledAttributes.getColor(4, color2));
        this.mRadius = obtainStyledAttributes.getDimension(6, dimension2);
        this.mSnap = obtainStyledAttributes.getBoolean(7, z2);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.mTouchSlop = C34571Mq6.m94685d(ViewConfiguration.get(context));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
