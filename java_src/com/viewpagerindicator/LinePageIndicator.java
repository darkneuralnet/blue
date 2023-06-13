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
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import kotlin.KotlinVersion;
/* loaded from: classes7.dex */
public class LinePageIndicator extends View implements PageIndicator {
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private float mGapWidth;
    private boolean mIsDragging;
    private float mLastMotionX;
    private float mLineWidth;
    private ViewPager.InterfaceC12076i mListener;
    private final Paint mPaintSelected;
    private final Paint mPaintUnselected;
    private int mTouchSlop;
    private ViewPager mViewPager;

    /* loaded from: classes7.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.LinePageIndicator.SavedState.1
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

    public LinePageIndicator(Context context) {
        this(context, null);
    }

    private int measureHeight(int i) {
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            f = size;
        } else {
            float strokeWidth = this.mPaintSelected.getStrokeWidth() + getPaddingTop() + getPaddingBottom();
            if (mode == Integer.MIN_VALUE) {
                f = Math.min(strokeWidth, size);
            } else {
                f = strokeWidth;
            }
        }
        return (int) FloatMath.ceil(f);
    }

    private int measureWidth(int i) {
        float f;
        ViewPager viewPager;
        int count;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824 && (viewPager = this.mViewPager) != null) {
            f = getPaddingLeft() + getPaddingRight() + (viewPager.getAdapter().getCount() * this.mLineWidth) + ((count - 1) * this.mGapWidth);
            if (mode == Integer.MIN_VALUE) {
                f = Math.min(f, size);
            }
        } else {
            f = size;
        }
        return (int) FloatMath.ceil(f);
    }

    public float getGapWidth() {
        return this.mGapWidth;
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public int getSelectedColor() {
        return this.mPaintSelected.getColor();
    }

    public float getStrokeWidth() {
        return this.mPaintSelected.getStrokeWidth();
    }

    public int getUnselectedColor() {
        return this.mPaintUnselected.getColor();
    }

    public boolean isCentered() {
        return this.mCentered;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        Paint paint;
        super.onDraw(canvas);
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.mCurrentPage >= count) {
            setCurrentItem(count - 1);
            return;
        }
        float f = this.mLineWidth;
        float f2 = this.mGapWidth;
        float f3 = f + f2;
        float f4 = (count * f3) - f2;
        float paddingTop = getPaddingTop();
        float paddingLeft = getPaddingLeft();
        float paddingRight = getPaddingRight();
        float height = paddingTop + (((getHeight() - paddingTop) - getPaddingBottom()) / 2.0f);
        if (this.mCentered) {
            paddingLeft += (((getWidth() - paddingLeft) - paddingRight) / 2.0f) - (f4 / 2.0f);
        }
        for (int i = 0; i < count; i++) {
            float f5 = paddingLeft + (i * f3);
            float f6 = f5 + this.mLineWidth;
            if (i == this.mCurrentPage) {
                paint = this.mPaintSelected;
            } else {
                paint = this.mPaintUnselected;
            }
            canvas.drawLine(f5, height, f6, height, paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureWidth(i), measureHeight(i2));
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageScrollStateChanged(int i) {
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrollStateChanged(i);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageScrolled(int i, float f, int i2) {
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrolled(i, f, i2);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageSelected(int i) {
        this.mCurrentPage = i;
        invalidate();
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageSelected(i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mCurrentPage = savedState.currentPage;
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

    public void setGapWidth(float f) {
        this.mGapWidth = f;
        invalidate();
    }

    public void setLineWidth(float f) {
        this.mLineWidth = f;
        invalidate();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.InterfaceC12076i interfaceC12076i) {
        this.mListener = interfaceC12076i;
    }

    public void setSelectedColor(int i) {
        this.mPaintSelected.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.mPaintSelected.setStrokeWidth(f);
        this.mPaintUnselected.setStrokeWidth(f);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.mPaintUnselected.setColor(i);
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

    public LinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19589R.attr.vpiLinePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.mPaintUnselected = paint;
        Paint paint2 = new Paint(1);
        this.mPaintSelected = paint2;
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(C19589R.color.default_line_indicator_selected_color);
        int color2 = resources.getColor(C19589R.color.default_line_indicator_unselected_color);
        float dimension = resources.getDimension(C19589R.dimen.default_line_indicator_line_width);
        float dimension2 = resources.getDimension(C19589R.dimen.default_line_indicator_gap_width);
        float dimension3 = resources.getDimension(C19589R.dimen.default_line_indicator_stroke_width);
        boolean z = resources.getBoolean(C19589R.bool.default_line_indicator_centered);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19589R.styleable.LinePageIndicator, i, 0);
        this.mCentered = obtainStyledAttributes.getBoolean(1, z);
        this.mLineWidth = obtainStyledAttributes.getDimension(5, dimension);
        this.mGapWidth = obtainStyledAttributes.getDimension(6, dimension2);
        setStrokeWidth(obtainStyledAttributes.getDimension(3, dimension3));
        paint.setColor(obtainStyledAttributes.getColor(4, color2));
        paint2.setColor(obtainStyledAttributes.getColor(2, color));
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
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
